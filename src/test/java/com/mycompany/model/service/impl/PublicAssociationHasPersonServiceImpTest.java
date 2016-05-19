/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model.service.impl;

import com.mycompany.model.entity.PublicAssociationHasPerson;
import com.mycompany.model.entity.Person;
import com.mycompany.model.entity.Post;
import com.mycompany.model.entity.PublicAssociation;
import com.mycompany.model.entity.PublicAssociationHasPersonId;
import com.mycompany.model.repository.PublicAssociationRepository;
import com.mycompany.model.repository.PostRepository;
import com.mycompany.model.repository.PersonRepository;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author redin
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring.xml"})
public class PublicAssociationHasPersonServiceImpTest {
    @Autowired
    private PublicAssociationHasPersonServiceImp instance;
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private PublicAssociationRepository publicAssociationRepository;
    @Autowired
    private PostRepository postRepository;
    
    public PublicAssociationHasPersonServiceImpTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addPublicAssociationHasPerson method, of class PublicAssociationHasPersonServiceImp.
     */
    @Test
    public void testAddPublicAssociationHasPerson() {
        System.out.println("addPublicAssociationHasPerson");
        Person person = personRepository.findByName("John");
        Post post = postRepository.findByName("Голова Ради");
        PublicAssociation publicAssociation = publicAssociationRepository.findByFullName("Організація");
        PublicAssociationHasPersonId publicAssociationPersonId = new PublicAssociationHasPersonId(publicAssociation.getId(), person.getId());
        PublicAssociationHasPerson publicAssociationPerson = new PublicAssociationHasPerson(publicAssociationPersonId, person, post, publicAssociation);
       // PublicAssociationHasPersonServiceImp instance = new PublicAssociationHasPersonServiceImp();
        PublicAssociationHasPerson expResult = publicAssociationPerson;
        PublicAssociationHasPerson result = instance.addPublicAssociationHasPerson(publicAssociationPerson);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getByPersonId method, of class PublicAssociationHasPersonServiceImp.
     */
    @Test
    public void testGetByPersonId() {
        System.out.println("getByPersonId");
        Integer personId = null;
       // PublicAssociationHasPersonServiceImp instance = new PublicAssociationHasPersonServiceImp();
        PublicAssociationHasPerson expResult = null;
        PublicAssociationHasPerson result = instance.getByPersonId(personId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getByPostId method, of class PublicAssociationHasPersonServiceImp.
     */
    @Test
    public void testGetByPostId() {
        System.out.println("getByPostId");
        Integer postId = null;
        //PublicAssociationHasPersonServiceImp instance = new PublicAssociationHasPersonServiceImp();
        PublicAssociationHasPerson expResult = null;
        PublicAssociationHasPerson result = instance.getByPostId(postId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
