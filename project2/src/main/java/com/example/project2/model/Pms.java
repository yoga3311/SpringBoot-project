package com.example.project2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name  = "Project_management_System")
public class Pms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int pno ;
    @Column(name = "Project_Name")
    String pname;
    @Column(name = "Team_Lead")
    String teamlead;
    @Column(name = "Number_Of_Days_For_Completion")
    int days;
    public Pms() {
    }
    public Pms(int pno, String pname, String teamlead, int days) {
        this.pno = pno;
        this.pname = pname;
        this.teamlead = teamlead;
        this.days = days;
    }
    public int getPno() {
        return pno;
    }
    public void setPno(int pno) {
        this.pno = pno;
    }
    public String getPname() {
        return pname;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }
    public String getTeamlead() {
        return teamlead;
    }
    public void setTeamlead(String teamlead) {
        this.teamlead = teamlead;
    }
    public int getDays() {
        return days;
    }
    public void setDays(int days) {
        this.days = days;
    }
    
    
}