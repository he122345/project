package Kanade.Service;

import Kanade.Dao.doctorDao;
import Kanade.domain.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class doctorServiceImp implements doctorService{
    @Autowired
    private doctorDao _doctor;
    @Override
    public int insertDoctor(Doctor doctor) {
        return _doctor.insertDoctor(doctor);
    }

    @Override
    public int deleteDoctor(int doctor_id) {
        return _doctor.deleteDoctor(doctor_id);
    }

    @Override
    public int updateDoctor(Doctor doctor) {
        return _doctor.updateDoctor(doctor);
    }

    @Override
    public Doctor findByIdDoctor(int doctor_id) {
        return _doctor.findByIdDoctor(doctor_id);
    }

    @Override
    public List<Doctor> findAllDoctor() {
        return _doctor.findAllDoctor();
    }
}
