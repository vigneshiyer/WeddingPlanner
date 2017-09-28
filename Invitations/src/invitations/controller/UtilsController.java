package invitations.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import invitations.model.service.PersonService;

@Controller
@RequestMapping("/utils")
public class UtilsController {

	@Autowired
	PersonService personService;

	@RequestMapping(value = "/addperson/{count}", method = RequestMethod.GET)
	public void handleAddPerson(@PathVariable int count) throws IOException {


	}
}
