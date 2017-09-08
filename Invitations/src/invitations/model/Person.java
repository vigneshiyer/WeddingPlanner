package invitations.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@Entity
@Table(name="person")
@AllArgsConstructor
@JsonDeserialize
@JsonIgnoreProperties(ignoreUnknown = true)
public class Person {

	public Person() {}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator="myseq")
	@SequenceGenerator(name="myseq", sequenceName="personseq", allocationSize=1)
	@Column(name="personid")
	Long personId;

	@Column(name="personname", nullable = false)
	String name;

	@Column(name="streetaddress", nullable = true)
	String streetAddress;

	@Column(name="city", nullable = true)
	String city;

	@Column(name="state", nullable = true)
	String state;

	@Column(name="pincode", nullable = true)
	long pincode;

	@Column(name="mobilephone", nullable = true)
	long mobilePhone;

	@Column(name="landline", nullable = true)
	long landline;

	@Column(name="email1", nullable = true)
	String email1;

	@Column(name="email2", nullable = true)
	String email2;

	@OneToMany(fetch=FetchType.LAZY, mappedBy="person", cascade=CascadeType.ALL)
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonManagedReference
	List<Guest> guests;
}
