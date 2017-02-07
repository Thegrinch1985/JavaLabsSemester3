/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testuniversity;

import java.util.ArrayList;

/**
 *
 * @author x00125128
 */
public class University {

    private String universityName;
    private ArrayList<Department>deplist;

    private class Department {

        private int departmentID;
        private String departmentName;

        public Department() {

            departmentID = 0;
            departmentName = "";

        }

        public Department(int departmentIDIN, String departmentNameIn) {

            departmentID = departmentIDIN;
            departmentName = departmentNameIn;

        }

        public int getDepartmentID() {
            return departmentID;
        }

        public void setDepartmentID(int departmentIDIn) {
            departmentID = departmentIDIn;
        }

        public String getDepartmentName() {
            return departmentName;
        }

        public void setDepartmentName(String departmentNameIn) {
            departmentName = departmentNameIn;
        }

    }

    public University() {

        universityName = "";

    }

    public University(String universityNameIn, String[] departmentNameIn, int[] departmentIDIn) {

        universityName = universityNameIn;
        deplist = new ArrayList<>();

        for (int i = 0; i < departmentIDIn.length; i++) {
            deplist.add  (new Department(departmentIDIn[i], departmentNameIn[i]));

        }
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityNameIn) {
        this.universityName = universityNameIn;
    }

    public void showList() {

        for (int i = 0; i < deplist.size(); i++) {
            System.out.println(deplist.get(i).getDepartmentID() + " " + deplist.get(i).getDepartmentName());

        }

    }

    public void changeName(String universityNameIn, String universityNameInNew) {

        for (int i = 0; i < deplist.size(); i++) {
            if (deplist.get(i).getDepartmentName().equals(universityNameIn)) {
                deplist.get(i).setDepartmentName(universityNameIn);
            }

        }

    }
}
