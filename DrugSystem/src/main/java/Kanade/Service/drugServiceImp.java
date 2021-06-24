package Kanade.Service;

import Kanade.Dao.drugDao;
import Kanade.domain.Drug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class drugServiceImp implements drugService {
    @Autowired
    private drugDao _drug;
    @Override
    public int insertDrug(Drug drug) {
        return _drug.insertDrug(drug);
    }

    @Override
    public int deleteDrug(int drug_id) {
        return _drug.deleteDrug(drug_id);
    }

    @Override
    public int updateDrug(Drug drug) {
        return _drug.updateDrug(drug);
    }

    @Override
    public Drug findByIdDrug(int drug_id) {
        return _drug.findByIdDrug(drug_id);
    }

    @Override
    public List<Drug> findAllDrug() {
        return _drug.findAllDrug();
    }
}
