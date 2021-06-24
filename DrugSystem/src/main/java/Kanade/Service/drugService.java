package Kanade.Service;

import Kanade.domain.Drug;

import java.util.List;

public interface drugService {
    public int insertDrug(Drug drug);
    public int deleteDrug(int drug_id);
    public int updateDrug(Drug drug);
    public Drug findByIdDrug(int drug_id);
    public List<Drug> findAllDrug();

}
