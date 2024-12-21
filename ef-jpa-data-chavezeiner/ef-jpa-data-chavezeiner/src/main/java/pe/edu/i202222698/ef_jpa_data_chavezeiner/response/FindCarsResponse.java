package pe.edu.i202222698.ef_jpa_data_chavezeiner.response;

import pe.edu.i202222698.ef_jpa_data_chavezeiner.dto.CarDto;

public record FindCarsResponse(String code,
                               String error,
                               Iterable<CarDto> cars) {

}
