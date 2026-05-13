package Collegecom.example.CollegeManagement.Service;

import Collegecom.example.CollegeManagement.Entity.Teacher;
import Collegecom.example.CollegeManagement.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

        @Autowired
        private TeacherRepository Teacherrepo;

        public Teacher save(Teacher teacher) {
            return Teacherrepo.save(teacher);
        }

        public List<Teacher> getAll() {
            return Teacherrepo.findAll();
        }

        public Teacher get(Long id) {
            return Teacherrepo.findById(id).orElse(null);
        }

        public Teacher update(Long id, Teacher teacher) {
            Teacher old = Teacherrepo.findById(id).orElse(null);
            if(old == null) return null;
            old.setName(teacher.getName());
            old.setQualification(teacher.getQualification());
            return Teacherrepo.save(old);
        }

        public void delete(Long id) {
            Teacherrepo.deleteById(id);
}
}
