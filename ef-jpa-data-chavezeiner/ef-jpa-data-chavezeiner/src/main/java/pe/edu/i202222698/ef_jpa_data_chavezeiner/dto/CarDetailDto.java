package pe.edu.i202222698.ef_jpa_data_chavezeiner.dto;
import java.util.Date;

public record CarDetailDto(
        Integer carId,
        String make,
        String model,
        int year,
        String vin,
        String licensePlate,
        String ownerName,
        String ownerContact,
        Date purchaseDate,
        int mileage,
        String engineType,
        String color,
        String insuranceCompany,
        String insurancePolicyNumber,
        Date registrationExpirationDate,
        Date serviceDueDate
) {}
