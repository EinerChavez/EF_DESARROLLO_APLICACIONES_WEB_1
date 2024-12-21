package pe.edu.i202222698.ef_jpa_data_chavezeiner.dto;

public record CarDto(
        Integer carId,
        String make,
        String model,
        int year,
        String vin,
        String licensePlate
) {}

