package com.wetic.jersey;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Collection;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.Environment;

import com.wetic.jersey.config.ApplicationProperties;
import com.wetic.jersey.config.DefaultProfileUtil;
import com.wetic.jersey.domain.User;
import com.wetic.jersey.service.ClientService;
import com.wetic.jersey.service.DepenseService;
import com.wetic.jersey.service.DetailsFactureService;
import com.wetic.jersey.service.FactureService;
import com.wetic.jersey.service.ProduitService;
import com.wetic.jersey.service.TypeDepenseService;
import com.wetic.jersey.service.UserService;

import io.github.jhipster.config.JHipsterConstants;

@SpringBootApplication
@EnableConfigurationProperties({LiquibaseProperties.class, ApplicationProperties.class})
public class JerseycoreApp implements InitializingBean, CommandLineRunner{
	
//	@Autowired
//	private ClientService clientservice;
//	private DepenseService depenseService;
//	private DetailsFactureService detailsFactureService;
//	private FactureService factureService;
//	private ProduitService produitService;
//	private TypeDepenseService typeDepenseService;
//	private UserService userService;
	

    private static final Logger log = LoggerFactory.getLogger(JerseycoreApp.class);

    private final Environment env;

    public JerseycoreApp(Environment env) {
        this.env = env;
    }

    /**
     * Initializes jerseycore.
     * <p>
     * Spring profiles can be configured with a program argument --spring.profiles.active=your-active-profile
     * <p>
     * You can find more information on how profiles work with JHipster on <a href="https://www.jhipster.tech/profiles/">https://www.jhipster.tech/profiles/</a>.
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        Collection<String> activeProfiles = Arrays.asList(env.getActiveProfiles());
        if (activeProfiles.contains(JHipsterConstants.SPRING_PROFILE_DEVELOPMENT) && activeProfiles.contains(JHipsterConstants.SPRING_PROFILE_PRODUCTION)) {
            log.error("You have misconfigured your application! It should not run " +
                "with both the 'dev' and 'prod' profiles at the same time.");
        }
        if (activeProfiles.contains(JHipsterConstants.SPRING_PROFILE_DEVELOPMENT) && activeProfiles.contains(JHipsterConstants.SPRING_PROFILE_CLOUD)) {
            log.error("You have misconfigured your application! It should not " +
                "run with both the 'dev' and 'cloud' profiles at the same time.");
        }
    }

    /**
     * Main method, used to run the application.
     *
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(JerseycoreApp.class);
        DefaultProfileUtil.addDefaultProfile(app);
        Environment env = app.run(args).getEnvironment();
        logApplicationStartup(env);
//        SpringApplication.run(JerseycoreApp.class, args);
    }

    private static void logApplicationStartup(Environment env) {
        String protocol = "http";
        if (env.getProperty("server.ssl.key-store") != null) {
            protocol = "https";
        }
        String serverPort = env.getProperty("server.port");
        String contextPath = env.getProperty("server.servlet.context-path");
        if (StringUtils.isBlank(contextPath)) {
            contextPath = "/";
        }
        String hostAddress = "localhost";
        try {
            hostAddress = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            log.warn("The host name could not be determined, using `localhost` as fallback");
        }
        log.info("\n----------------------------------------------------------\n\t" +
                "Application '{}' is running! Access URLs:\n\t" +
                "Local: \t\t{}://localhost:{}{}\n\t" +
                "External: \t{}://{}:{}{}\n\t" +
                "Profile(s): \t{}\n----------------------------------------------------------",
            env.getProperty("spring.application.name"),
            protocol,
            serverPort,
            contextPath,
            protocol,
            hostAddress,
            serverPort,
            contextPath,
            env.getActiveProfiles());
    }

	@Override
	public void run(String... args) throws Exception {
//		User user1 = userService.save(new User(true, "000001", "inverrardi@gmail.com", "Mathieu", "image1.url", "0000", "Inverrardi", "bgdu59", "password1", ZonedDateTime.now(), "9999"));
//		User user2 = userrepository.save(new User(true, "000002", "erradja@gmail.com", "Amine", "image2.url", "0000", "Erradja", "bgMarocco", "password2", ZonedDateTime.now(), "8888"));
//		User user3 = userrepository.save(new User(true, "000003", "robert@gmail.com", "Albin", "image3.url", "0000", "Robert", "bgStTrapez", "password3", ZonedDateTime.now(), "7777"));
//		
//		Client client1 = clientrepository.save(new Client("23 rue Des Chinchillas", "catB", "1500", "BitchyCity", user1));
//		Client client2 = clientrepository.save(new Client("47 rue Du Nain Bizarre", "catE", "8000", "LeprechaunLand", user2));
//		
//		Facture fac1 = facturerepository.save(new Facture(ZonedDateTime.now(), client1));
//		Facture fac2 = facturerepository.save(new Facture(ZonedDateTime.now(), client1));
//		Facture fac3 = facturerepository.save(new Facture(ZonedDateTime.now(), client2));
//		Facture fac4 = facturerepository.save(new Facture(ZonedDateTime.now(), client2));
//		Facture fac5 = facturerepository.save(new Facture(ZonedDateTime.now(), client2));
//		
//		Type_Depense td1 = typedepenserepository.save(new Type_Depense("cout maintenance", "Maintenance"));
//        Type_Depense td2 = typedepenserepository.save(new Type_Depense("cout nouveau matériel", "Matériel"));
//        Type_Depense td3 = typedepenserepository.save(new Type_Depense("cout charge", "Charge"));
//        Type_Depense td4 = typedepenserepository.save(new Type_Depense("cout procedure", "Judiciaire"));        
//        depenserepository.save(new Depense(ZonedDateTime.now(), "Nouvelles versions pour les logiciels", "Update logiciels", 450, td1));
//        depenserepository.save(new Depense(ZonedDateTime.now(), "Facture du dépannage informatique", "Informaticien", 100, td1));
//        depenserepository.save(new Depense(ZonedDateTime.now(), "Nouveaux bureaux et chaises", "Achat mobiliers", 1200, td2));
//        depenserepository.save(new Depense(ZonedDateTime.now(), "Nouvelles lampes", "Achat lampes", 250, td2));
//        depenserepository.save(new Depense(ZonedDateTime.now(), "Depense mensuelle d'electricite", "Electricite", 150, td3));
//        depenserepository.save(new Depense(ZonedDateTime.now(), "Depense mensuelle de chauffage", "Gaz", 150, td3));
//        
//        Produit p1 = produitrepository.save(new Produit("Souris bluetooth sans fil", "Souris", 15, 46));
//        Produit p2 = produitrepository.save(new Produit("Clavier bluetooth high-tech", "Clavier", 35, 24));
//        Produit p3 = produitrepository.save(new Produit("Webcam filaire USB", "Webcam", 22, 4));
//        Produit p4 = produitrepository.save(new Produit("Livre 54 pages pour apprendre JAVA", "Livre 'JAVA pour les nuls'", 14, 8));
//        Produit p5 = produitrepository.save(new Produit("Ecran 17 pouces 1080p (cables non-inclus)", "Moniteur ordinateur", 200, 18));
//        
//        detailsfacturerepository.save(new DetailsFacture("Produit 1 :", 2, fac1, p1));
//        detailsfacturerepository.save(new DetailsFacture("Produit 2 :", 1, fac1, p2));
//        detailsfacturerepository.save(new DetailsFacture("Produit 1 :", 2, fac2, p4));
//        detailsfacturerepository.save(new DetailsFacture("Produit 1 :", 1, fac3, p3));
//        detailsfacturerepository.save(new DetailsFacture("Produit 2 :", 1, fac3, p1));
//        detailsfacturerepository.save(new DetailsFacture("Produit 3 :", 1, fac3, p2));
//        detailsfacturerepository.save(new DetailsFacture("Produit 1 :", 2, fac4, p4));
//        detailsfacturerepository.save(new DetailsFacture("Produit 2 :", 1, fac4, p1));
//        detailsfacturerepository.save(new DetailsFacture("Produit 1 :", 1, fac5, p2));
		
	}
}
