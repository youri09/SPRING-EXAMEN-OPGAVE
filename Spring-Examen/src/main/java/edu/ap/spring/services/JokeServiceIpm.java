package edu.ap.spring.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceIpm implements JokeService{

	private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceIpm() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
