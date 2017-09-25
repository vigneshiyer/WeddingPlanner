package invitations.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
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
	String pincode;

	@Column(name="phone", nullable = true)
	String phone;

	@Column(name="email1", nullable = true)
	String email1;

	@Column(name="email2", nullable = true)
	String email2;

	@Column(name="relation", nullable = true)
	String relation;

	@Column(name="invited_13", nullable = true)
	String invited_13;

	@Column(name="invited_14", nullable = true)
	String invited_14;

	@Column(name="invited_15", nullable = true)
	String invited_15;

	@Column(name="invitation_printed", nullable = true)
	String invitation_printed;

	@Column(name="email_status", nullable = true)
	String email_status;

	@Column(name="phone_status", nullable = true)
	String phone_status;

	@Column(name="ignore_for_print", nullable = true)
	String ignore_for_print;

	@OneToMany(mappedBy="person", cascade=CascadeType.ALL)
	@JsonManagedReference
	List<Guest> guest;
}
