package com.lzf.dao;

import com.lzf.model.Student;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class StudentDao extends HibernateDaoSupport {
    public Student getStudent(int id) {
        return this.getHibernateTemplate().get(Student.class, id);
    }
}
