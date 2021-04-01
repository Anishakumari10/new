package com.database;

public class Student {
   private int id;
   private String name;
   private int phy;
   private int chem;
   private int maths;
   private int tot;

    public Student(int id, String name, int phy, int chem, int maths) {
        this.id = id;
        this.name = name;
        this.phy = phy;
        this.chem = chem;
        this.maths = maths;
    }
    public Student(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhy() {
        return phy;
    }

    public void setPhy(int phy) {
        this.phy = phy;
    }

    public int getChem() {
        return chem;
    }

    public void setChem(int chem) {
        this.chem = chem;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getTot() {
        return tot;
    }

    public void setTot(int total) {
        this.tot = total;
    }
    public int total(){
        this.tot=phy+chem+maths;
        return this.tot;
    }
}
