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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author YOUSSEF ROSSAMY
 *
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class Reader {

	/**
	 * readerId : UUID
	 */
	@Id
	@Type(type="uuid-char")
	@GeneratedValue(generator ="UUID")
	@GenericGenerator(name="UUID",strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "readerId", updatable = false, nullable = false)
	@ApiModelProperty(notes="represent id of the Reader mapped as readersId in the database ")
	private UUID readerId;
	/**
	 * firstName:String
	 */
	@ApiModelProperty(dataType="String",notes="reader FirstName")
	private String firstName;
	/**
	 * lastName:String
	 */
	@ApiModelProperty(dataType="String",notes="reader LastName")
	private String LastName;
	 /**
	 * listOfBook:List
	 */
	@ElementCollection(targetClass=String.class)
	 @ApiModelProperty(dataType="List",notes="List of books That have ben readed By the Reader")
	private List<String> listOfBook;
	
}
