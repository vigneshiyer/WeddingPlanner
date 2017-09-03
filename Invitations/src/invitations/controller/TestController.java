package invitations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import invitations.model.Guest;
import invitations.model.Person;
import invitations.model.service.PersonService;

@Controller
@RequestMapping("/invitations")
public class TestController {

	@Autowired
	PersonService personService;

	@RequestMapping(value = "/viewaccompanyingguestsforperson/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Person handleAddGuestView(@PathVariable long id, ModelMap model) {
		Person p = personService.getPerson(id);
		if (p != null) {
			List<Guest> list = personService.getGuests(id);
			p.setGuests(list);
			model.addAttribute("person", p);
		} else {
			p = Person.builder().build();
		}
		return p;
	}
}
