package invitations.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.common.collect.Lists;

import invitations.constants.Constants;
import invitations.model.Person;

@Controller
@RequestMapping("/invitations")
public class LoadInvitationsController {

	private static final String PRINT_PREVIEW_VIEW_NAME = "printPreview";
	private static final String VIEW_INVITEES_VIEW_NAME = "viewInvitees";
	private static final String HOME_VIEW_NAME = "home";

	@RequestMapping("/printpreview")
	public ModelAndView handleRequest() throws Exception {
		// TODO Auto-generated method stub
		ModelAndView view = new ModelAndView(PRINT_PREVIEW_VIEW_NAME);
		Person p = Person.builder()

				.city("Mumbai")
				.name("Vignesh Iyer")
				.streetAddress("47/203, Parijat CHS, Manisha Nagar")
				.state("Maharashtra")
				.pincode(400605L)

				.build();

		Person q = Person.builder()

				.city("Mumbai")
				.name("Vigu Iyer")
				.streetAddress("47/203, Parijat CHS, Manisha Nagar")
				.state("Maharashtra")
				.pincode(400605L)

				.build();

		List<Person> personList = Stream.of(p, q, p, q, p, q, p , q, p ,q, p, q, p, q, p, q).collect(Collectors.toList());
		List<List<Person>> listOfPersonsList = Lists.partition(personList, Constants.NO_OF_PERSONS_PER_ROW);

		view.addObject("listOfPersonsList", listOfPersonsList);
		return view;
	}

	@RequestMapping("/home")
	public ModelAndView showHome(@ModelAttribute("person")Person person,
			BindingResult result, ModelMap model) throws Exception {

		// TODO Auto-generated method stub
		ModelAndView view = new ModelAndView("home");
		view.addObject("menuList", Constants.menu);
		return view;
	}

}
