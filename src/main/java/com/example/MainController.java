package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@GetMapping ("/laptops")
	public ModelAndView brandLaptop(@RequestParam String brand) {
		
		ModelAndView mav = new ModelAndView();
		
		int charCount = brand.length();
		
//	String oddEven = (charCount % 2 == 0) ? "Even" : "Odd";
	
	String oddEven;
		
	if (charCount % 2 == 0) {
		oddEven = "par";
		
	} else {
		oddEven = "impar";
		}
		
		mav.addObject("laptopBrand", brand);
		mav.addObject("characterCount", charCount);
		mav.addObject("paritate", oddEven);
		
		mav.setViewName("LaptopBrand");
		
		return mav;
		
		
//		String laptopBrand = req.getParameter("brand");
//		
//		req.setAttribute("laptopAfis", laptopBrand);
//		
//		
//		int length = laptopBrand.length();
//		req.setAttribute("lengthAfis", length);
	}
	
	@GetMapping ("/convert")
	public ModelAndView converterValuter (@RequestParam int ron, int EURO) {
		ModelAndView mav = new ModelAndView();
		

		int sumaConvertita = ron / EURO;
		
		mav.addObject("rezultat", sumaConvertita);
		mav.addObject("sumaInitialaInRon", ron);
		
		mav.setViewName("ConverterValutar");
		
		return mav;
	}
	
	@PostMapping ("/laptopsInput")
	public ModelAndView brandLaptopInput (@RequestParam("brandName") String brandName) {
		ModelAndView mav = new ModelAndView();
		

		int charCount = brandName.length();
		
	
	String oddEven;
		
	if (charCount % 2 == 0) {
		oddEven = "par";
		
	} else {
		oddEven = "impar";
		}
		
		mav.addObject("laptopBrand", brandName);
		mav.addObject("characterCount", charCount);
		mav.addObject("paritate", oddEven);
		
		mav.setViewName("LaptopBrandInputPage");
		
		return mav;
	}
	
	@GetMapping ("/laptopsInput")
	public ModelAndView displayBrandInput () {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("LaptopBrandInputPage");
		return mav;
	}
	
	
	
	
	@PostMapping ("/convertInput")
	public ModelAndView convertInput (@RequestParam("ron") int ron, @RequestParam("EURO") int EURO) {
		ModelAndView mav = new ModelAndView();
		
		int sumaConvertita = ron / EURO;
		
		mav.addObject("rezultat", sumaConvertita);
		mav.addObject("sumaInitialaInRon", ron);
		
		mav.setViewName("ConverterValutarInputPage");
		
		return mav;
	}
		
		
	@GetMapping ("/convertInput")
	public ModelAndView displayConverInput () {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("ConverterValutarInputPage");
		return mav;
	}
	

}
