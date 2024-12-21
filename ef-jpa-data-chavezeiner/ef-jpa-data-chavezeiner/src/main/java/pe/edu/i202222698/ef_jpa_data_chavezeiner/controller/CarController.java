package pe.edu.i202222698.ef_jpa_data_chavezeiner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.i202222698.ef_jpa_data_chavezeiner.dto.CarDto;
import pe.edu.i202222698.ef_jpa_data_chavezeiner.service.ManageService;

import java.util.List;

@Controller
@RequestMapping("/manage-car")
public class CarController {

    private final ManageService manageCarService;

    @Autowired
    public CarController(ManageService manageCarService) {
        this.manageCarService = manageCarService;
    }

    @GetMapping("/start")
    public String start(Model model) {
        try {
            List<CarDto> cars = manageCarService.getAllCars();
            model.addAttribute("cars", cars);
        } catch (Exception e) {
            model.addAttribute("error", "An error occurred: " + e.getMessage());
        }
        return "manage-car";
    }
}
