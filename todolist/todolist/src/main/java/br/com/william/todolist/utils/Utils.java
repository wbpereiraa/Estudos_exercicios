package br.com.william.todolist.utils;

import org.springframework.beans.BeanWrapperImpl;

import java.beans.PropertyDescriptor;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;

public class Utils {
	
	//atualização parcial (copiando o que é nulo)
	public static void copyNonNullProperties(Object source, Object target) {
		BeanUtils.copyProperties(source, target, getNullPropertyNames(source));
	}

	public static String [] getNullPropertyNames(Object source) {
		final BeanWrapper src = new BeanWrapperImpl(source);
		
		PropertyDescriptor[] pds = src.getPropertyDescriptors();
		
		Set<String> emptyNames = new HashSet<>();
		
		for(PropertyDescriptor pd: pds) {
			Object srcValue = src.getPropertyValue(pd.getName());
			if(srcValue == null) {
				emptyNames.add(pd.getName());
			}
		}
		
		String[] result = new String[emptyNames.size()];
		return emptyNames.toArray(result);
	}
}
