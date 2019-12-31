package su.myspringwebapps.controller;

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

    private static String kmStr = "Вы пока не ввели ни одного значения";
    private static Core core;

    @RequestMapping("/")
    public String getIndex(Model model) {

        model.addAttribute("km", kmStr);

        return "index";

    }

    @RequestMapping(value = "/Convert", method = RequestMethod.GET)
    public String Convert(
            @RequestParam(value = "miles") String miles
    )   {

        ApplicationContext context = new ClassPathXmlApplicationContext("WEB-INF/servlet-servlet.xml");
        core = (Core) context.getBean("core");
        Float km = core.convert(Float.parseFloat(miles));
        kmStr = miles + " миль равно " + String.format("%.2f", km) + " километров";

        return "redirect:/";

    }

}