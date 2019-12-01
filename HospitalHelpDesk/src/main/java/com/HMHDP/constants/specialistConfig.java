package com.HMHDP.constants;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:specialist.properties")
public class specialistConfig {

	@Value("#{'${specialist.name}'.split(',')}")
	private List<String> specialistName;

	@Value("#{'${specialist.availableday}'.split(',')}")
	private List<String> specialistAvailableDay;

	@Value("#{'${specialist.availabletime}'.split(',')}")
	private List<String> specialistAvailableTime;

	public static PropertySourcesPlaceholderConfigurer propertyScan() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	public List<String> getSpecialistName() {
		return specialistName;
	}

	public List<String> getSpecialistAvailableDay() {
		return specialistAvailableDay;
	}

	public List<String> getSpecialistAvailableTime() {
		return specialistAvailableTime;
	}

}
