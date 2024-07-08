package com.example.doan.Admin.Data;

public class Service {
    private int idSer;
    private String nameSer;
    private String descSer;
    private Double priceSer;
    private String imageSer;

    public int getIdSer(){return idSer;}

    public String getNameSer() {
        return nameSer;
    }

    public String getDescSer() {
        return descSer;
    }

    public Double getPriceSer() {
        return priceSer;
    }

    public String getImageSer() {
        return imageSer;
    }

    public int getKey() {
        return idSer;
    }
    public void setKey(int key) {
        this.idSer = key;
    }

//    public static async Task<int> GetTotalServices(FirestoreDb db)
//    {
//        CollectionReference servicesCollection = db.Collection("services");
//        QuerySnapshot snapshot = await servicesCollection.GetSnapshotAsync();
//        return snapshot.Count;
//    }

    public Service(){
//        this.idSer =  ;
        this.nameSer = "";
        this.descSer = "";
        this.priceSer = 0.0;
        this.imageSer = "";
    }
    public Service(String nameSer, String descSer, Double priceSer, String imageSer) {
        this.nameSer = nameSer;
        this.descSer = descSer;
        this.priceSer = priceSer;
        this.imageSer = imageSer;
    }



}
