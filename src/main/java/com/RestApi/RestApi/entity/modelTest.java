package com.RestApi.RestApi.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;



//Consider this as a template for the products each product will be instantiated based on the model we have specified.
//We will annotate this class so JPA can interact with this entity
//We will use lombok to reduce the boilerplate code like getter setter constructors....

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class modelTest {
    /* This is a Test model for a product*/

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long objectId;
    @NotBlank(message = "Name Field is required")
    private String objectName;
    @NotBlank(message = "Category Field is required")
    private String objectCategory;
    @NotBlank(message = "Description Field is required")
    private String objectDescription;
    @Range(min=10, max =10000, message = "The Price should be in range of 10 and 10000")
    private Integer objectPrice;
    @PositiveOrZero(message = "The stock cannot be less than 0")
    private Integer objectStock;

//    public modelTest() {
//
//    }
//    public modelTest(Long objectId,
//                     String objectName,
//                     String objectCategory,
//                     String objectDescription,
//                     Integer objectPrice,
//                     Integer objectStock ) {
//
//        this.objectId = objectId;
//        this.objectName = objectName;
//        this.objectCategory = objectCategory;
//        this.objectDescription = objectDescription;
//        this.objectPrice = objectPrice;
//        this.objectStock = objectStock;
//    }
//
//
//
//
//
//    public Long getObjectId() {
//        return objectId;
//    }
//
//    public void setObjectId(Long objectId) {
//        this.objectId = objectId;
//    }
//
//    public String getObjectName() {
//        return objectName;
//    }
//
//    public void setObjectName(String objectName) {
//        this.objectName = objectName;
//    }
//
//    public String getObjectCategory() {
//        return objectCategory;
//    }
//
//    public void setObjectCategory(String objectCategory) {
//        this.objectCategory = objectCategory;
//    }
//
//    public String getObjectDescription() {
//        return objectDescription;
//    }
//
//    public void setObjectDescription(String objectDescription) {
//        this.objectDescription = objectDescription;
//    }
//
//    public Integer getObjectPrice() {
//        return objectPrice;
//    }
//
//    public void setObjectPrice(Integer objectPrice) {
//        this.objectPrice = objectPrice;
//    }
//
//    public Integer getObjectStock() {
//        return objectStock;
//    }
//
//    public void setObjectStock(Integer objectStock) {
//        this.objectStock = objectStock;
//    }
//
//    @Override
//    public String toString() {
//        return "modelTest{" +
//                "objectId=" + objectId +
//                ", objectName='" + objectName + '\'' +
//                ", objectCategory='" + objectCategory + '\'' +
//                ", objectDescription='" + objectDescription + '\'' +
//                ", objectPrice=" + objectPrice +
//                ", objectStock=" + objectStock +
//                '}';
//    }
}
