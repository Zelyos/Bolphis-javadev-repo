package com.wetic.jersey.mapper;

import java.util.List;

public interface GenericMapper<T, V> {

	T toEntityDTO(V v);

	V toEntity(T t);
	
	List<T> toEntityDTO(List<V> listEntity);
	
	List<V> toEntity(List<T> listEntityDTO);
	
	

}
