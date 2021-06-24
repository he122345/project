package Kanade.Controller;

import Kanade.Service.drugService;
import Kanade.domain.Drug;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;



@RestController
@RequestMapping("drug")
@CrossOrigin(allowCredentials = "true",origins = {"*"})
public class drugController {
    @Autowired
    private drugService _drug;
    @RequestMapping(value = "insertDrug",method = {RequestMethod.GET})
    public int insertDrug(Drug drug) {
        return _drug.insertDrug(drug);
    }
    @RequestMapping(value = "deleteDrug/{drug_id}",method = {RequestMethod.GET})
    public int deleteDrug(@PathVariable("drug_id") int drug_id) {
        return _drug.deleteDrug(drug_id);
    }
    @RequestMapping(value = "updateDrug",method = {RequestMethod.GET})
    public int updateDrug(Drug drug) {
        return _drug.updateDrug(drug);
    }
    @RequestMapping(value = "findByIdDrug/{drug_id}",method = {RequestMethod.GET})
    public List<Drug> findByIdDrug(@PathVariable("drug_id") int drug_id) {
        List<Drug> list=new ArrayList<Drug>();
        list.add(_drug.findByIdDrug(drug_id));
        return list;
    }
    @RequestMapping(value = "findAllDrug",method = {RequestMethod.GET})
    public List<Drug> findAllDrug() {
        return this._drug.findAllDrug();
    }
}
