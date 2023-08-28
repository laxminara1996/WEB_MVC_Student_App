package in.laxmi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.laxmi.binding.Student;
import in.laxmi.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService service;
	@GetMapping("/")
	public String loadIndexPage(Model model) {
		init(model);
		return "index";
	}
	@PostMapping("/save")
	public String saveStudent(Student s,Model model) {
        boolean isSaved= service.saveStudent(s);
        if(isSaved) {
		model.addAttribute("msg", "Data saved");
        }
		init(model);
		return "index";
	}
	private void init(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("timings", service.getTimings());
		model.addAttribute("courses", service.getCourses());
	}
}
