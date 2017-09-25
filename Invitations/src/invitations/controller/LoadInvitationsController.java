package invitations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.common.collect.Lists;

import invitations.constants.Constants;
import invitations.model.Person;
import invitations.model.service.PersonService;

@Controller
@RequestMapping("/invitations")
public class LoadInvitationsController {

	private static final String PRINT_PREVIEW_VIEW_NAME = "printPreview";
	private static final String PRINT_PREVIEW_PAGE_VIEW_NAME = "templates/tableView";
	private static final String HOME_VIEW_NAME = "home";

	@Autowired
	PersonService personService;

	@RequestMapping("/printpreview")
	public ModelAndView handleRequest() throws Exception {
		// TODO Auto-generated method stub
		ModelAndView view = new ModelAndView(PRINT_PREVIEW_VIEW_NAME);
		List<Person> list = personService.getAll(1,
				Constants.NO_OF_PERSONS_PER_ROW * Constants.NO_OF_ROWS);
		List<List<Person>> newList = Lists.partition(list, Constants.NO_OF_PERSONS_PER_ROW);
		view.addObject("listOfPersonsList", newList);
		view.addObject("numberOfPersons", Constants.NO_OF_PERSONS_PER_ROW * Constants.NO_OF_ROWS);
		return view;
	}

	@RequestMapping("/previewpage/{page}")
	public ModelAndView handlePreviewPage(@PathVariable int page) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView view = new ModelAndView(PRINT_PREVIEW_PAGE_VIEW_NAME);
		List<Person> list = personService.getAll(page,
				Constants.NO_OF_PERSONS_PER_ROW * Constants.NO_OF_ROWS);
		if (list.size() == 0) {
			return new ModelAndView();
		}
		List<List<Person>> newList = Lists.partition(list, Constants.NO_OF_PERSONS_PER_ROW);
		view.addObject("listOfPersonsList", newList);
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
