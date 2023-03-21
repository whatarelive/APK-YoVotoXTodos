package com.example.yovotoxtodos.models;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Candidato implements Parcelable {
    private final String image;
    private final String name;
    private final int age;
    private final String cargo;
    private final String biografia;

    public Candidato(String image, String name, int age, String cargo,String biografia) {
        this.image = image;
        this.name = name;
        this.age = age;
        this.cargo = cargo;
        this.biografia = biografia;
    }

    protected Candidato(Parcel in) {
        image = in.readString();
        name = in.readString();
        age = in.readInt();
        cargo = in.readString();
        biografia = in.readString();
    }

    public static final Creator<Candidato> CREATOR = new Creator<Candidato>() {
        @Override
        public Candidato createFromParcel(Parcel in) {
            return new Candidato(in);
        }

        @Override
        public Candidato[] newArray(int size) {
            return new Candidato[size];
        }
    };

    public Drawable getImage(Context context) {
        int resourceId = context.getResources().getIdentifier(image, "drawable", context.getPackageName());
        return context.getResources().getDrawable(resourceId);
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return String.valueOf(age);
    }

    public String getCargo() {
        return cargo;
    }

    public String getBiografia() {
        return biografia;
    }


    @NonNull
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(image);
        dest.writeString(name);
        dest.writeInt(age);
        dest.writeString(cargo);
        dest.writeString(biografia);
    }
}
