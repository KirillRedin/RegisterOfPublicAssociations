package com.mycompany.model.entity;
// Generated 06.05.2016 18:28:25 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Certificate generated by hbm2java
 */
@Entity
@Table(name="certificate"
    ,catalog="register_of_public_association"
)
public class Certificate  implements java.io.Serializable {


     private Integer id;
     private Date dateOfIssuingCertificate;
     private Set<PublicAssociation> publicAssociations = new HashSet(0);

    public Certificate() {
    }

    public Certificate(Date dateOfIssuingCertificate, Set<PublicAssociation> publicAssociations) {
       this.dateOfIssuingCertificate = dateOfIssuingCertificate;
       this.publicAssociations = publicAssociations;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_of_issuing_certificate", length=19)
    public Date getDateOfIssuingCertificate() {
        return this.dateOfIssuingCertificate;
    }
    
    public void setDateOfIssuingCertificate(Date dateOfIssuingCertificate) {
        this.dateOfIssuingCertificate = dateOfIssuingCertificate;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="certificate")
    public Set<PublicAssociation> getPublicAssociations() {
        return this.publicAssociations;
    }
    
    public void setPublicAssociations(Set<PublicAssociation> publicAssociations) {
        this.publicAssociations = publicAssociations;
    }




}


