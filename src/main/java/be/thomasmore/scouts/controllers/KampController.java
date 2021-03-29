package be.thomasmore.scouts.controllers;

import be.thomasmore.scouts.model.Kamp;
import be.thomasmore.scouts.model.Tak;
import be.thomasmore.scouts.repositories.KampRepository;
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
public class KampController {
    @Autowired
    private KampRepository kampRepository;

    @GetMapping({"/kampdetails", "/kampdetails/{kampId}"})
    public String kampDetails(Model model, @PathVariable(required = false) Integer kampId) {
        if (kampId == null) return "takdetails";
        Optional<Kamp> optionalKamp = kampRepository.findById(kampId);
        if (optionalKamp.isPresent()) {
            model.addAttribute("kamp", optionalKamp.get());
            model.addAttribute("prev", kampId > 1 ? kampId - 1 : kampRepository.count());
            model.addAttribute("next", kampId < kampRepository.count() ? kampId + 1 : 1);
        }
        return "kampdetails";
    }

    @GetMapping("/kamplist")
    public String kampList(Model model, @PathVariable(required = false) String what) {
        Iterable<Kamp> kampen = kampRepository.findAll();
        model.addAttribute("kampen", kampen);
        model.addAttribute("nrKampen", kampRepository.count());
        return "kamplist";
    }
}
