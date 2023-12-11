package com.viniciuscosta.rest.api;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;
import rest.api.Musica;

public class TesteMusica extends TestCase {
	
	@Test
	public void TesteMusica() {
		Integer identifier = 5;
		String nome = "Hey Jude";
		String banda = "Beatles";
		Musica musicaEncontrado = new Musica ();
		musicaEncontrado.setId(5);
		musicaEncontrado.setNome("Hey Jude");
		musicaEncontrado.setAutor("Beatles");
		assertEquals(nome, musicaEncontrado.getNome());
		assertEquals(banda, musicaEncontrado.getAutor());
		assertEquals(identifier, musicaEncontrado.getId());
		
	}
	

}
