package be.thomasmore.scouts.controllers;


import be.thomasmore.scouts.model.Tak;
import be.thomasmore.scouts.repositories.TakRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.Optional;

@Controller
public class TakController {
    @Autowired
    private TakRepository takRepository;

    @GetMapping({"/takdetails", "/takdetails/{takId}"})
    public String takDetails(Model model, @PathVariable(required = false) Integer takId) {
        if (takId == null) return "takdetails";
        Optional<Tak> optionalTak = takRepository.findById(takId);
        if (optionalTak.isPresent()) {
            model.addAttribute("tak", optionalTak.get());
            model.addAttribute("prev", takId > 1 ? takId - 1 : takRepository.count());
            model.addAttribute("next", takId < takRepository.count() ? takId + 1 : 1);
        }
        return "takdetails";
    }

    @GetMapping("/taklist")
    public String takList(Model model, @PathVariable(required = false) String what) {
        Iterable<Tak> takken = takRepository.findAll();
        model.addAttribute("takken", takken);
        model.addAttribute("nrTakken", takRepository.count());
        return "taklist";
    }
}
