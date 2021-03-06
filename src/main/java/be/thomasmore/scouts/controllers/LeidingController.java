package be.thomasmore.scouts.controllers;

import be.thomasmore.scouts.model.Kamp;
import be.thomasmore.scouts.model.Leiding;
import be.thomasmore.scouts.repositories.KampRepository;
import be.thomasmore.scouts.repositories.LeidingRepository;
import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.Optional;

@Controller
public class LeidingController {
    @Autowired
    private LeidingRepository leidingRepository;


    @GetMapping({"/leidingdetails", "/leidingdetails/{leidingId}"})
    public String leidingDetails(Model model, @PathVariable(required = false) Integer leidingId) {
        if (leidingId == null) return "leidingdetails";
        Optional<Leiding> optionalLeiding = leidingRepository.findById(leidingId);
        if (optionalLeiding.isPresent()) {
            model.addAttribute("leiding", optionalLeiding.get());
            model.addAttribute("prev", leidingId > 1 ? leidingId - 1 : leidingRepository.count());
            model.addAttribute("next", leidingId < leidingRepository.count() ? leidingId + 1 : 1);
        }
        return "leidingdetails";
    }

    @GetMapping("/leidinglist")
    public String leidingList(Model model, @PathVariable(required = false) String what) {
        Iterable<Leiding> leidings = leidingRepository.findAll();
        model.addAttribute("leidings", leidings);
        model.addAttribute("nrLeidings", leidingRepository.count());
        return "leidinglist";
    }
}

