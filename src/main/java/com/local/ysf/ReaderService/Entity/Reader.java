package com.local.ysf.ReaderService.Entity;

import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reader {

	@Id
	@Type(type="uuid-char")
	@GeneratedValue(generator ="UUID")
	@GenericGenerator(name="UUID",strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "readerId", updatable = false, nullable = false)
	private UUID readerId;
	private String firstName;
	private String LastName;
	 @ElementCollection(targetClass=String.class)
	private List<String> listOfBook;
	
}
