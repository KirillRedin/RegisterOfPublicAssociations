package com.mycompany.model.entity;
// Generated 06.05.2016 18:28:25 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * FirstLevelOfLocation generated by hbm2java
 */
@Entity
@Table(name="first_level_of_location"
    ,catalog="register_of_public_association"
)
public class FirstLevelOfLocation  implements java.io.Serializable {


     private int code;
     private String name;
     private Set<SecondLevelOfLocation> secondLevelOfLocations = new HashSet(0);

    public FirstLevelOfLocation() {
    }

	
    public FirstLevelOfLocation(int code) {
        this.code = code;
    }
    public FirstLevelOfLocation(int code, String name, Set<SecondLevelOfLocation> secondLevelOfLocations) {
       this.code = code;
       this.name = name;
       this.secondLevelOfLocations = secondLevelOfLocations;
    }
   
     @Id 

    
    @Column(name="code", unique=true, nullable=false)
    public int getCode() {
        return this.code;
    }
    
    public void setCode(int code) {
        this.code = code;
    }

    
    @Column(name="name", length=65535)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="firstLevelOfLocation")
    public Set<SecondLevelOfLocation> getSecondLevelOfLocations() {
        return this.secondLevelOfLocations;
    }
    
    public void setSecondLevelOfLocations(Set<SecondLevelOfLocation> secondLevelOfLocations) {
        this.secondLevelOfLocations = secondLevelOfLocations;
    }




}

