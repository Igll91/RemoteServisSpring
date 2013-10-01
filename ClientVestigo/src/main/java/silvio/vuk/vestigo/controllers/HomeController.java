package silvio.vuk.vestigo.controllers;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.remoting.RemoteConnectFailureException;
import org.springframework.remoting.RemoteInvocationFailureException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import silvio.vuk.vestigo.pojos.Podaci;
import silvio.vuk.vestigo.services.PodaciServices;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private PodaciServices podaciServices;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	

	@RequestMapping(value = "/podaci.html", method = RequestMethod.POST)
	public String podaci(Locale locale, Model model) {
		logger.info("Data page! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		try{
			List<Podaci> listOfData = podaciServices.dohvatiListuPodataka();
			model.addAttribute("listOfData", listOfData );
		}
		catch(RemoteConnectFailureException ex)
		{
			model.addAttribute("servisUgasen", "true");
		}
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/podaci.html", method = RequestMethod.GET)
	public String podaciRedirect(Locale locale, Model model) {
		logger.info("Data page! The client locale is {}.", locale);
		
		return "index";
	}
	
	@RequestMapping(value = {"/index.html", "/"})
	public String index(Locale locale, Model model) {
		logger.info("Welcome page! The client locale is {}.", locale);
		
		return "index";
	}
	
}
