package br.com.projAulaSpring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;

@Document
public class Client implements Serializable {

    @Id
    private String _id;
    private String Description;
    private String Date;
    private int NumberOfStudent;

    public Client(String id, String description, String date, int numberOfStudent){
        this._id = id; this.Description = description; this.Date = date; this.NumberOfStudent = numberOfStudent;
    }

    public Client(){

    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getNumberOfStudent() {
        return NumberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        NumberOfStudent = numberOfStudent;
    }
}