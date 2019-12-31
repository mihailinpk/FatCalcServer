package su.myspringwebapps.controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import su.myspringwebapps.core.Core;

@Controller
public class MainController {

    private static String bodyFatText = "Здесь будет отображаться жирность вашего тела";

    @RequestMapping("/")
    public String getIndex(Model model)    {

        model.addAttribute("bodyFatText", bodyFatText);

        return "index";

    }

    @RequestMapping(value = "/Calculate",method = RequestMethod.GET)
    public String calculate(
            @RequestParam(value = "age") String ageText,
            @RequestParam(value = "height") String heightText,
            @RequestParam(value = "weight") String weightText,
            @RequestParam(value = "sex") String sex
    )   {

        ApplicationContext context = new ClassPathXmlApplicationContext("WEB-INF/servlet-servlet.xml");
        Core core = (Core) context.getBean("core");
        bodyFatText = core.calculate(ageText, heightText, weightText, sex);

        return "redirect:/";

    }

}