package com.thewa.autoviseapi.dto;
import com.thewa.autoviseapi.constants.VEHICLE_TYPE;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TwoWheelerDTO {
	private String name;
	private double engineCapacity;
	private double mileage;
	private double weight;
	private double price;
	private String mfgDate;
	private String registration;
	private VEHICLE_TYPE vehicleType;
}