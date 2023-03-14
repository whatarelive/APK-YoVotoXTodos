package com.example.yovotoxtodos.models;

public class Candidato {
    private String image;
    private String name;
    private int age;
    private String cargo;
    private String biografia;

    public Candidato(String image, String name, int age, String cargo,String biografia) {
        this.image = image;
        this.name = name;
        this.age = age;
        this.cargo = cargo;
        this.biografia = biografia;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCargo() {
        return cargo;
    }

    public String getBiografia() {
        return biografia;
    }


    @Override
    public String toString() {
        return "Candidato{" +
                "image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", cargo='" + cargo + '\'' +
                ", biografia='" + biografia + '\'' +
                '}';
    }
}
