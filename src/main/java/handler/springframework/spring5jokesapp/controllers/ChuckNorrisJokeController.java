package handler.springframework.spring5jokesapp.controllers;

import handler.springframework.spring5jokesapp.services.QuoteGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Evan on 4/1/2021
 */
@Controller
public class ChuckNorrisJokeController {
    private final QuoteGenerator quoteGenerator;

    public ChuckNorrisJokeController(QuoteGenerator quoteGenerator) {
        this.quoteGenerator = quoteGenerator;
    }

    @RequestMapping({"/", ""})
    public String GetJoke(Model model) {

        model.addAttribute("quote", quoteGenerator.getQuote());

        return "jokes";
    }

}
