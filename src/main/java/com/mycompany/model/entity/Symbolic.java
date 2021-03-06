package com.mycompany.model.entity;
// Generated 06.05.2016 18:28:25 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Symbolic generated by hbm2java
 */
@Entity
@Table(name="symbolic"
    ,catalog="register_of_public_association"
)
public class Symbolic  implements java.io.Serializable {


     private Integer id;
     private PublicAssociation publicAssociation;
     private TypeOfSymbolic typeOfSymbolic;
     private String description;
     private String image;
     private Date dateOfRegistration;

    public Symbolic() {
    }

	
    public Symbolic(PublicAssociation publicAssociation, TypeOfSymbolic typeOfSymbolic) {
        this.publicAssociation = publicAssociation;
        this.typeOfSymbolic = typeOfSymbolic;
    }
    public Symbolic(PublicAssociation publicAssociation, TypeOfSymbolic typeOfSymbolic, String description, String image, Date dateOfRegistration) {
       this.publicAssociation = publicAssociation;
       this.typeOfSymbolic = typeOfSymbolic;
       this.description = description;
       this.image = image;
       this.dateOfRegistration = dateOfRegistration;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="public_association_id", nullable=false)
    public PublicAssociation getPublicAssociation() {
        return this.publicAssociation;
    }
    
    public void setPublicAssociation(PublicAssociation publicAssociation) {
        this.publicAssociation = publicAssociation;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="type_of_symbolic_id", nullable=false)
    public TypeOfSymbolic getTypeOfSymbolic() {
        return this.typeOfSymbolic;
    }
    
    public void setTypeOfSymbolic(TypeOfSymbolic typeOfSymbolic) {
        this.typeOfSymbolic = typeOfSymbolic;
    }

    
    @Column(name="description", length=65535)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="image", length=45)
    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_of_registration", length=19)
    public Date getDateOfRegistration() {
        return this.dateOfRegistration;
    }
    
    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }




}


