package com.hinako.learn.kotoba;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tango")
public class TangoController {

    @Autowired
    private TangoRepository repository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Tango> getAllTangos() {
        return repository.findAll();
    }

    @PostMapping(path="/add")
    public @ResponseBody String addNewTango(@RequestParam String kana) {
        if (StringUtils.isEmpty(kana)) {
            return "Skipped";
        }
        Tango n = new Tango();
        n.setKana(kana);
        repository.save(n);
        return "Saved";
    }

    @DeleteMapping(path="/{id}")
    public @ResponseBody String delTango(@PathVariable Long id) {
        if (repository.findById(id).isEmpty()) {
            return "NotFound";
        }
        repository.deleteById(id);
        return "Deleted";
    }
}
