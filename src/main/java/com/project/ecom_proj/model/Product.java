package com.project.ecom_proj.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity   //to create table
@Data //creates getters setters using lombok
@AllArgsConstructor //uses lombok to create constructor
@NoArgsConstructor
public class Product {

    @Id //for primary key
    @GeneratedValue(strategy= GenerationType.IDENTITY) //for autogeneration of values
    private Integer id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;

    @JsonFormat(shape=JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private Date releaseDate;
    private boolean productAvailable;
    private int stockQuantity;

    private String imageName;
    private String imageType;

    @Lob //tells the database that this field takes large binary data(BLOB) like pdf or image file
    private byte[] imageData;

}
