package pe.edu.i202222698.ef_jpa_data_chavezeiner.service;

import pe.edu.i202222698.ef_jpa_data_chavezeiner.dto.CarDetailDto;
import pe.edu.i202222698.ef_jpa_data_chavezeiner.dto.CarDto;

import java.util.List;
import java.util.Optional;

public interface ManageService {
    List<CarDto> getAllCars() throws Exception;

    Optional<CarDetailDto> getCarById(Integer id) throws Exception;

    boolean updateCar(CarDto carDto) throws Exception;

    boolean deleteCarById(Integer id) throws Exception;

    boolean addCar(CarDetailDto carDetailDto) throws Exception;
}
