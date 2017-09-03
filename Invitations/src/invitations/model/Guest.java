package invitations.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@Entity
@Table(name="accompanying_guests")
@AllArgsConstructor
@JsonFilter("Guest")
public class Guest {
	public Guest() {}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator="myseq")
	@SequenceGenerator(name="myseq", sequenceName="guestseq", allocationSize=1)
	@Column(name="guestid")
	Long guestId;

	@Column(name="guestname", nullable = false)
	String name;

	@Column(name="gender", nullable = false)
	char gender;

	@ManyToOne
	@JoinColumn(name="personid", nullable=false)
	@JsonBackReference
	@JsonIgnore
	Person person;

}
