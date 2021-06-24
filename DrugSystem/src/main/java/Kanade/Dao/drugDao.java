package Kanade.Dao;

import Kanade.domain.Drug;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface drugDao {
    public int insertDrug(Drug drug);
    public int deleteDrug(int drug_id);
    public int updateDrug(Drug drug);
    public Drug findByIdDrug(int drug_id);
    public List<Drug> findAllDrug();

}
