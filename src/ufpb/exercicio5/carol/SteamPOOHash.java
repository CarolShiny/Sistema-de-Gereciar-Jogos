package ufpb.exercicio5.carol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SteamPOOHash implements SteamPOO{

	private Map<String, Jogo> jogos;
	
	public SteamPOOHash() {
		this.jogos = new HashMap<>();
	}
	
	@Override
	public void cadastraJogo(Jogo jogo) throws JogoJaExisteException {
		if (this.jogos.containsKey(jogo.getNome())) {
			throw new JogoJaExisteException("Já existe jogo com o nome " 
                            +jogo.getNome());
		} else {
			this.jogos.put(jogo.getNome(), jogo);
		}		
	}
      
       @Override
	public boolean existeJogoComNome(String nomeJogo) {
		return this.jogos.containsKey(nomeJogo);
       }

      
      @Override	
      public List<Jogo> pesquisaJogosDaCategoria(CategoriaDeJogo categoria) {
		List<Jogo> jogosDaCategoria = new ArrayList<Jogo>();
		for (Jogo j: this.jogos.values()) {
			if (j.ehDaCategoria(categoria)) {
				jogosDaCategoria.add(j);
			}
		}
		return jogosDaCategoria;
	}
      @Override
      public double pesquisaPrecoDoJogo(String nome) throws JogoInexistenteException {
          if (this.jogos.containsKey(nome)) {
              return this.jogos.get(nome).getPreco();
          } else {
              throw new JogoInexistenteException("Não existe jogo com o nome " + nome);
          }
      }
    	  
     @Override	  
      public int contaJogosDaCategoria (CategoriaDeJogo categoria){
    		  int contador = 0;
    		  for(Jogo i: this.jogos.values()) {
    			  if(i.ehDaCategoria(categoria)){
    				  contador ++;    				  
    			  }    			  
    		  } return contador;    		  
    	  }
     
     public void adicionaCategoriaEmJogo(String nomeJogo, CategoriaDeJogo categoria) {
    	 for(Jogo i: this.jogos.values()) {
    		 if(i.getNome().equals(nomeJogo)){
    			 i.getCategorias().add(categoria);	
    		 }    		 
    	 }     	 
     }  
      }
      
       
 

