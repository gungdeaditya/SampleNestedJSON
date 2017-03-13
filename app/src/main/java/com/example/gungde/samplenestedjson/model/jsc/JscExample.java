package com.example.gungde.samplenestedjson.model.jsc;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JscExample {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("nip")
    @Expose
    private String nip;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("wil_kel")
    @Expose
    private String wilKel;
    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("data")
    @Expose
    private String data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWilKel() {
        return wilKel;
    }

    public void setWilKel(String wilKel) {
        this.wilKel = wilKel;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return id + ", " + nip + ", " + name + ", " + wilKel + " ;";
    }

}