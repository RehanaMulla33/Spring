package com.xworkz.laptop.service;

import com.xworkz.laptop.dto.LaptopDTO;

public interface LaptopService {
	boolean validateLaptopDTO(LaptopDTO dto);
	boolean saveLaptopDTO(LaptopDTO laptopDTO);

}
