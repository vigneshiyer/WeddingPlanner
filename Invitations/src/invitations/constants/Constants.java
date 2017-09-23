package invitations.constants;

import java.util.List;

import com.google.common.collect.ImmutableList;

import invitations.model.Menu;

public class Constants {
	public static final int NO_OF_PERSONS_PER_ROW = 4;
	public static final int NO_OF_ROWS = 6;

	public static final List<Menu> menu = ImmutableList.of(Menu.builder()
			.menuItem("View Invitees")
			.url("hello").build()
			, Menu.builder()
			.menuItem("Add/Edit Person")
			.url("bye").build()
			, Menu.builder()
			.menuItem("Print Preview")
			.url("").build());
}
