////package com.card.card.entity;
////import jakarta.persistence.*;
////import lombok.AllArgsConstructor;
////import lombok.Data;
////import lombok.NoArgsConstructor;
////
////import java.util.Date;
////
////@Entity
////@AllArgsConstructor
////@NoArgsConstructor
////@Data
////public class Task {
////    @Id
////    @GeneratedValue(strategy = GenerationType.AUTO)
////    @Column(name = "Id")
////    private Long id;
////    private String pathImage;
////    @Column(name = "description", columnDefinition = "LONGTEXT")
////    private String description;
////}
//
//
//
//package com.card.card.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.util.Date;
//
//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//public class Task {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "Id")
//    private Long id;
//
//    private String pathImage;
//
//    @Column(name = "description", columnDefinition = "LONGTEXT")
//    private String description;
//
//    private byte[] processedImage; // Define processedImage field
//
//    // Define setter for processedImage
//    public void setProcessedImage(byte[] processedImage) {
//        this.processedImage = processedImage;
//    }
//}



package com.card.card.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long id;

    private String pathImage;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    private byte[] processedImage; // Define processedImage field

    // Define setter for processedImage
    public void setProcessedImage(byte[] processedImage) {
        this.processedImage = processedImage;
    }

    public String getPathImage() {
        return pathImage;
    }

    public void setPathImage(String pathImage) {
        this.pathImage = pathImage;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
