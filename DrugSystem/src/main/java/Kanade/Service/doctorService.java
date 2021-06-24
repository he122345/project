package Kanade.Service;

import Kanade.domain.Doctor;

import java.util.List;

public interface doctorService {
    public int insertDoctor(Doctor doctor);
    public int deleteDoctor(int doctor_id);
    public int updateDoctor(Doctor doctor);
    public Doctor findByIdDoctor(int doctor_id);
    public List<Doctor> findAllDoctor();
}
