package Kanade.Dao;

import Kanade.domain.Doctor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface doctorDao {
    public int insertDoctor(Doctor doctor);
    public int deleteDoctor(int doctor_id);
    public int updateDoctor(Doctor doctor);
    public Doctor findByIdDoctor(int doctor_id);
    public List<Doctor> findAllDoctor();
}
