package com.lzf.action;

import com.lzf.model.Student;
import com.lzf.service.IStudentService;
import com.lzf.service.impl.StudentService;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 */
public class StudentAction extends ActionSupport implements ModelDriven<Student> {
    private IStudentService studentService;

    public IStudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(IStudentService studentService) {
        this.studentService = studentService;
    }

    private Student model = new Student();

    public Student getModel() {
        return model;
    }

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String testJSP() {
        System.out.println("测试struts2");
        return "test";
    }

    public String studentJson() {
        System.out.println("model：" + model);
        student = studentService.getStudent(model.getStudentId());
        System.out.println("student：" + student);
        return Action.SUCCESS;
    }
}
