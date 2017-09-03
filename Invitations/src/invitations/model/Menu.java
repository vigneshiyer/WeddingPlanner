package invitations.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Menu {
	private String menuItem;
	private String url;
}
