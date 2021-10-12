package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator {

  @GetMapping("/hanh")
  public String test(){
    return "calculator";
  }

  @PostMapping("calculator1")
  public String test1(@RequestParam int a, int b, @RequestParam String pick, Model model){
    int c;
    if (pick.equals("+")){
      c = a + b;
      model.addAttribute("add", c);
    }else  if (pick.equals("-")){
      c = a - b;
      model.addAttribute("minus", c);
    }else  if (pick.equals("*")){
      c = a * b;
      model.addAttribute("multiplication", c);
    }else if (pick.equals("/")){
      c = a / b;
      model.addAttribute("division", c);
    }
    return "test";
  }
}
