package com.in28minutes.rest.webservices.restfulwebservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class DynamicFilteringController {
	@GetMapping("/dynamicfiltering")
	public MappingJacksonValue filtering() {
		DynamicBean dynamicBean = new DynamicBean("value1", "value2", "value3");
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(dynamicBean);
		FilterProvider filters = setFilters();
		mappingJacksonValue.setFilters(filters);
		return mappingJacksonValue;
	}

	private FilterProvider setFilters() {
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field3");
		FilterProvider filters = new SimpleFilterProvider().addFilter("DynamicBeanFilter", filter);
		return filters;
	}

	@GetMapping("/dynamicfiltering-list")
	public MappingJacksonValue filteringList() {
		
		List<DynamicBean> list = Arrays.asList( new DynamicBean("value1", "value2", "value3"),
				new DynamicBean("value4", "value5", "value6"));
		
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(list);
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field2", "field3");
		FilterProvider filters = new SimpleFilterProvider().addFilter("DynamicBeanFilter", filter);
		mappingJacksonValue.setFilters(filters);
		return mappingJacksonValue;
	}
}
