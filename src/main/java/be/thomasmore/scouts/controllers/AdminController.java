package be.thomasmore.scouts.controllers;

import be.thomasmore.scouts.model.Kamp;
import be.thomasmore.scouts.model.Leiding;
import be.thomasmore.scouts.repositories.KampRepository;
import be.thomasmore.scouts.repositories.LeidingRepository;
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
    @Autowired
    private LeidingRepository leidingRepository;


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

    @ModelAttribute("leiding")
    public Leiding findLeiding(@PathVariable(required = false) Integer id) {
        if (id != null) {
            Optional<Leiding> optionalLeiding = leidingRepository.findById(id);
            if (optionalLeiding.isPresent()) return optionalLeiding.get();
        }
        return new Leiding();
    }

    @GetMapping("/leidingedit/{id}")
    public String leidingEdit(Model model, @PathVariable int id) {
        logger.info("leidingedit " + id);
        return "admin/leidingedit";
    }

    @PostMapping("/leidingedit/{id}")
    public String leidingEditPost(Model model,
                               @PathVariable int id,
                               @ModelAttribute("leiding") Leiding leiding) {
        Optional<Leiding> optionalLeiding = leidingRepository.findById(id);
        if (optionalLeiding.isPresent()) {
            Leiding editedleiding = optionalLeiding.get();
            editedleiding.setLeiderName(leiding.getLeiderName());
            editedleiding.setLeiderLeeftijd(leiding.getLeiderLeeftijd());
            editedleiding.setLeiderBio(leiding.getLeiderBio());
            leidingRepository.save(editedleiding);
            model.addAttribute("leiding", editedleiding);

        }
        return "redirect:/leidingdetails/"+id;
    }

    @GetMapping("/leidingnew")
    public String leidingNew(Model model) {
        model.addAttribute("leidings", leidingRepository.findAll());
        return "admin/leidingnew";
    }

    @PostMapping("/leidingnew")
    public String leidingNewPost(Model model, @ModelAttribute("leiding") Leiding leiding) {
        leidingRepository.save(leiding);
        return "redirect:/leidingdetails/"+leiding.getId();
    }
}