package handler.springframework.spring5jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by Evan on 4/1/2021
 */
@Service
public class QuoteGeneratorImpl implements QuoteGenerator {
    @Override
    public String getQuote() {
        ChuckNorrisQuotes cnq = new ChuckNorrisQuotes();
        String quote = cnq.getRandomQuote();

        return quote;
    }
}
