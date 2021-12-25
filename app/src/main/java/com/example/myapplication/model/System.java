package com.example.myapplication.model;

public class System {
    private String jenis;
    private String version;
    private String deskripsi;
    private String logo;
    private String developer;
    private String website;
    private String model;
    private int drawableRes;

    public System(String jenis, String version, String deskripsi, String logo, String developer, String website, String model,int drawableRes) {
        this.jenis = jenis;
        this.version = version;
        this.deskripsi = deskripsi;
        this.logo = logo;
        this.developer = developer;
        this.website = website;
        this.model = model;
        this.drawableRes = drawableRes;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }

}
