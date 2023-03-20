package com.example.yovotoxtodos.models;

public class Candidato {
    private String image;
    private String name;
    private String biografia;
    private int age;
    private String cargo;

    public Candidato(String image, String name, String biografia, int age, String cargo) {
        this.image = image;
        this.name = name;
        this.biografia = biografia;
        this.age = age;
        this.cargo = cargo;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getBiografia() {
        return biografia;
    }

    public int getAge() {
        return age;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", biografia='" + biografia + '\'' +
                ", age=" + age +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
