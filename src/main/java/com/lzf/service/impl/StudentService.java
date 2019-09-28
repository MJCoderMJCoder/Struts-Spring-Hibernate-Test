package com.lzf.service.impl;

import com.lzf.dao.StudentDao;
import com.lzf.model.Student;
import com.lzf.service.IStudentService;

public class StudentService implements IStudentService {
    private StudentDao studentDao;

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public Student getStudent(int id) {
        return studentDao.getStudent(id);
    }
}
