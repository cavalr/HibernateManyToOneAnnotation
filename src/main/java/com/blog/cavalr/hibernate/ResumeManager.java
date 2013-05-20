package com.blog.cavalr.hibernate;

public class ResumeManager {

    public static void main(String[] args) {

        ResumeDao resumeDao = new ResumeDao();

        /* create new resume */
        Resume resume = new Resume();
        resume.setName("MyResume");
        Address address = new Address();
        address.setLine1("line1");
        address.setLine2("line2");
        address.setCity("city");
        address.setState("state");
        address.setCountry("country");
        resume.setAddress(address);

        resumeDao.saveResume(resume);

        /* find resume by id */
        Resume fromDB = resumeDao.findById(resume.getResumeId());
        System.out.println(fromDB);

        assert fromDB != null;

        /* delete resume */
        resumeDao.deleteResume(fromDB);

    }
}
