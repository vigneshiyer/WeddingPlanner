package invitations.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

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

	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	Person person;
}
