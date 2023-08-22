package com.hinako.learn.kotoba;

import com.hinako.learn.kotoba.dto.TangoDTO;
import com.hinako.learn.kotoba.po.Tango;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/api/tango")
public class TangoController {

    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private TangoRepository repository;

    @GetMapping(path="/all")
    public @ResponseBody List<TangoDTO> getAllTangos() {
        Iterable<Tango> tangoList = repository.findAll();
        List<TangoDTO> resList = new ArrayList<>();
        for (Tango tango : tangoList) {
            TangoDTO dto = new TangoDTO();
            dto.setId(tango.getId());
            dto.setWord(tango.getWord());
            dto.setKana(mergeKanaTone(tango.getKana(), tango.getKanaTone()));
            dto.setTypeInfo(tango.getTypeInfo());
            dto.setMeaning(tango.getMeaning());
            dto.setUnitName(tango.getUnitName());
            dto.setUpdateTime(simpleDateFormat.format(new Date(tango.getUpdateTime().getTime())));
            resList.add(dto);
        }

        return resList;
    }

//    @PostMapping(path="/add")
//    public @ResponseBody String addNewTango(@RequestParam String kana) {
//        if (StringUtils.isEmpty(kana)) {
//            return "Skipped";
//        }
//        Tango n = new Tango();
//        n.setKana(kana);
//        repository.save(n);
//        return "Saved";
//    }
//
//    @DeleteMapping(path="/{id}")
//    public @ResponseBody String delTango(@PathVariable Long id) {
//        if (repository.findById(id).isEmpty()) {
//            return "NotFound";
//        }
//        repository.deleteById(id);
//        return "Deleted";
//    }

    private String mergeKanaTone(String kana, int tone) {
        if (tone == -1 || tone > 10) {
            return kana;
        }
        return kana +
            switch (tone) {
                case 0 -> "⓪";
                case 1 -> "①";
                case 2 -> "②";
                case 3 -> "③";
                case 4 -> "④";
                case 5 -> "⑤";
                case 6 -> "⑥";
                case 7 -> "⑦";
                case 8 -> "⑧";
                case 9 -> "⑨";
                case 10 -> "⑩";
                default -> "";
            };
    }
}
