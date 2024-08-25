package com.kavya.api.models;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Info {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private boolean status;
    @Column
    private String collegeID;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<Integer> numbers;
    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> alphabets;
    @Column
    private String collegeRollNo;
    @Column
    private String highest_lowercase_alphabet;





    public boolean getStatus() {
        return status;
    }

    public String getCollegeID() {
        return collegeID;
    }

    public String getHighest_lowercase_alphabet() {
        return highest_lowercase_alphabet;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public List<String> getAlphabets() {
        return alphabets;
    }

    public String getCollegeRollNo() {
        return collegeRollNo;
    }



    public int getId() {
        return  id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAlphabets(List<String> alphabets) {
        this.alphabets = alphabets;
    }

    public void setCollegeID(String collegeID) {
        this.collegeID = collegeID;
    }

    public void setCollegeRollNo(String collegeRollNo) {
        this.collegeRollNo = collegeRollNo;
    }

    public void setHighest_lowercase_alphabet(String highest_lowercase_alphabet) {
        this.highest_lowercase_alphabet = highest_lowercase_alphabet;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
