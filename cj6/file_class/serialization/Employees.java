package com.techouts.cj6.file_class.serialization;

import java.io.Serializable;

public class Employees implements Serializable{

    int id;
    String name;

    Employees(int id ,String name){
        this.id=id;
        this.name=name;

    }

}
