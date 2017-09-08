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
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@Entity
@Table(name="accommodation")
@AllArgsConstructor
public class Accommodation {
	public Accommodation() {}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator="myseq")
	@SequenceGenerator(name="myseq", sequenceName="accseq", allocationSize=1)
	@Column(name="acc_id")
	Long accId;

	@Column(name="acc_date", nullable = false)
	String accDate;

	@ManyToOne
	@JoinColumn(name="guestid", nullable=false)
	@JsonBackReference
	@JsonIgnore
	Guest guest;
}
