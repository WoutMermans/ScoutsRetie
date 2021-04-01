package be.thomasmore.scouts.controllers;

import be.thomasmore.scouts.model.Kamp;
import be.thomasmore.scouts.repositories.KampRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/admin")
public class AdminController {
    private Logger logger = LoggerFactory.getLogger(AdminController.class);
    @Autowired
    private KampRepository kampRepository;


    @ModelAttribute("kamp")
    public Kamp findKamp(@PathVariable(required = false) Integer id) {
        if (id != null) {
            Optional<Kamp> optionalKamp = kampRepository.findById(id);
            if (optionalKamp.isPresent()) return optionalKamp.get();
        }
        return new Kamp();
    }

    @GetMapping("/kampedit/{id}")
    public String kampEdit(Model model, @PathVariable int id) {
        logger.info("kampedit " + id);
        return "admin/kampedit";
    }

    @PostMapping("/kampedit/{id}")
    public String kampEditPost(Model model,
                                @PathVariable int id,
                                @ModelAttribute("kamp") Kamp kamp) {
        Optional<Kamp> optionalKamp = kampRepository.findById(id);
        if (optionalKamp.isPresent()) {
            Kamp editedkamp = optionalKamp.get();
            editedkamp.setKampLabel(kamp.getKampLabel());
            editedkamp.setKampLocatie(kamp.getKampLocatie());
            editedkamp.setKampBeginDatum(kamp.getKampBeginDatum());
            editedkamp.setKampEindDatum(kamp.getKampEindDatum());
            editedkamp.setKampInfo(kamp.getKampInfo());
            kampRepository.save(editedkamp);
            model.addAttribute("kamp", editedkamp);

        }
        return "redirect:/kampdetails/"+id;
    }

    @GetMapping("/kampnew")
    public String kampNew(Model model) {
        model.addAttribute("kampen", kampRepository.findAll());
        return "admin/kampnew";
    }

    @PostMapping("/kampnew")
    public String kampNewPost(Model model, @ModelAttribute("kamp") Kamp kamp) {
        kampRepository.save(kamp);
        return "redirect:/kampdetails/"+kamp.getId();
    }
}