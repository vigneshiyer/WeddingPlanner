package invitations.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@Entity
@Table(name="accompanying_guests")
@AllArgsConstructor
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "guest", cascade = CascadeType.ALL)
	@JsonManagedReference
	List<Accommodation> accommodations;

}
