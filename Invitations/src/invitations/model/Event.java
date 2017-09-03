package invitations.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Event {
	private String eventId;
	private Person contactPerson;
	private int headcount;
}
