package com.web.Form.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Introduction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private Long phone;
    private String address;
    private String dateOfBirth;
    private String gender;
    private String education;
    private String experience;
    private String skills;
    private String certifications;
    private String state;
    private String country;
    private String district;
    private String professionalSummary;
    // Add other fields as needed
	public static void save(Introduction introduction) {
		// TODO Auto-generated method stub
		
	}

    // Getters and setters
}
