package pe.edu.i202222698.ef_jpa_data_chavezeiner.response;

import pe.edu.i202222698.ef_jpa_data_chavezeiner.dto.CarDetailDto;

public record FindCarResponse(String code,
                              String error,
                              CarDetailDto car) {
}
