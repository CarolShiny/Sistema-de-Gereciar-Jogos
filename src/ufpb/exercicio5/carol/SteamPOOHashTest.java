package ufpb.exercicio5.carol;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SteamPOOHashTest {

	@Test
	void testaCadastrodeJogos() {
		SteamPOOHash sistema = new SteamPOOHash();
		Jogo jogo = new Jogo ("Zelda");
		jogo.adicionaCategoria(CategoriaDeJogo.ARCADE);
		try {
			sistema.cadastraJogo(jogo);
		
		}catch(JogoJaExisteException e){
			fail("Não deveria lançar exceção");
		}
		assertTrue(sistema.existeJogoComNome("Zelda"));	
		List<Jogo> jogosArcade = sistema.pesquisaJogosDaCategoria(CategoriaDeJogo.ARCADE);
		assertTrue(jogosArcade.size()==1);
				
	}

	@Test
	void testPesquisaPrecoDoJogo() {
		List<CategoriaDeJogo> categorias = new ArrayList<>();
		categorias.add(CategoriaDeJogo.TERROR);
		Jogo jogo = new Jogo("Black4Blood");
		SteamPOOHash sistema = new SteamPOOHash();
		try {
			sistema.pesquisaPrecoDoJogo("Black4Blood");
			fail("Deveria ter lançado exceção");
		} catch (JogoInexistenteException e) {
			System.out.println("Ok!");
		}
		try {
			sistema.cadastraJogo(jogo);
			double preco = sistema.pesquisaPrecoDoJogo("Black4Blood");
			assertEquals(0, preco);
		} catch (JogoJaExisteException e) {
			fail("Não deveria ter lançado exceção pois o jogo  asinda não está cadastrado");
		} catch (JogoInexistenteException e) {
			fail("Não deveria ter lançado exceção pois existe o jogo no sistema");
		}
		
		
	}
	@Test
	void testCadastraJogoDuasVezes() {
		SteamPOOHash sistema = new SteamPOOHash();
		Jogo jogo = new Jogo("Black4Blood");
		jogo.adicionaCategoria(CategoriaDeJogo.TERROR);
		try {
			sistema.cadastraJogo(jogo);
		} catch (JogoJaExisteException e) {
			fail("Não deveria ter lançado exceção");
		}
		
		Jogo jogo2 = new Jogo("Black4Blood");
		jogo.adicionaCategoria(CategoriaDeJogo.TERROR);
		try {
			sistema.cadastraJogo(jogo2);
			fail("Não deveria ter deixado cadastrar um jogo igual");
		} catch (JogoJaExisteException e) {
			System.out.println("Ok");
		}
	
	}
	@Test
	void testExisteJogoComNome () {
		SteamPOOHash sistema = new SteamPOOHash();
		Jogo jogo = new Jogo("Black4Blood");
		jogo.adicionaCategoria(CategoriaDeJogo.TERROR);
		assertTrue(sistema.existeJogoComNome("Black4Blood"));
			
	}
	
		
}

