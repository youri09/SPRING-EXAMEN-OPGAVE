package edu.ap.spring.jpa;

import javax.persistence.Column;

public class Joke {

	@Column
    private String joke;
	
	public Joke(String joke) {
		this.joke = joke;
	}

	public String getJoke() {
		return joke;
	}

	public void setJoke(String joke) {
		this.joke = joke;
	}
	
	
}
