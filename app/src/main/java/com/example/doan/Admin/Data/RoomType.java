package com.example.doan.Admin.Data;

import java.util.Objects;

public class RoomType {
    // Properties
    private String TypeCode ;
    private String NameRoom;
    private double UnitPriceRoom ;
    private int MaxOccupancy;
    private String DescriptionRoom; // Optional description

    // Getters and Setters
    public String getTypeCode() {
        return TypeCode;
    }

    public void setTypeCode(String typeCode) {
        TypeCode = typeCode;
    }

    public String getNameRoom() {
        return NameRoom;
    }

    public void setNameRoom(String nameRoom) {
        NameRoom = nameRoom;
    }

    public double getUnitPriceRoom() {
        return UnitPriceRoom;
    }

    public void setUnitPriceRoom(double unitPriceRoom) {
        UnitPriceRoom = unitPriceRoom;
    }

    public int getMaxOccupancy() {
        return MaxOccupancy;
    }

    public void setMaxOccupancy(int maxOccupancy) {
        MaxOccupancy = maxOccupancy;
    }

    public String getDescriptionRoom() {
        return DescriptionRoom;
    }

    public void setDescriptionRoom(String descriptionRoom) {
        DescriptionRoom = descriptionRoom;
    }

    // Constructor
    public RoomType() {
    }

    public RoomType(String typeCode, String name, double unitPrice, int maxOccupancy, String description)
    {
        this.TypeCode = typeCode;
        this.NameRoom = name;
        this.UnitPriceRoom = unitPrice;
        this.MaxOccupancy = maxOccupancy;
        this.DescriptionRoom = description;
    }

    // Other methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoomType roomType = (RoomType) o;
        return Double.compare(UnitPriceRoom, roomType.UnitPriceRoom) == 0 && MaxOccupancy == roomType.MaxOccupancy && Objects.equals(TypeCode, roomType.TypeCode) && Objects.equals(NameRoom, roomType.NameRoom) && Objects.equals(DescriptionRoom, roomType.DescriptionRoom);
    }

    @Override
    public String toString() {
        return "RoomType{" +
                "TypeCode='" + TypeCode + '\'' +
                ", NameRoom='" + NameRoom + '\'' +
                ", UnitPriceRoom=" + UnitPriceRoom +
                ", MaxOccupancy=" + MaxOccupancy +
                ", DescriptionRoom='" + DescriptionRoom + '\'' +
                '}';
    }
}
