package ufpb.exercicio5.carol;

import java.util.List;
import java.util.Objects;

public class Jogo {

    private String nome;
	private double preco;
    private List<CategoriaDeJogo> categorias;

    public Jogo(String nome, double preco, List<CategoriaDeJogo> categorias) {
        this.nome = nome;
        this.preco = preco;
        this.categorias = categorias;
    }
    
    public Jogo(String nome) {
    	this.nome = nome;    	
    }  

	public boolean adicionaCategoria(CategoriaDeJogo categoria) {
    	if (!this.categorias.contains(categoria)) {
    		this.categorias.add(categoria);
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public String getNome() {
  		return nome;
  	}
    
    @Override
    public String toString() {
    	return "Esse é o nome do jogo " + this.nome;
    }

  	public void setNome(String nome) {
  		this.nome = nome;
  	}

  	public double getPreco() {
  		return preco;
  	}

  	public void setPreco(double novoPreco) {
  		this.preco = novoPreco;
  	}

  	public List<CategoriaDeJogo> getCategorias() {
  		return categorias;
  	}

  	public void setCategorias(List<CategoriaDeJogo> categorias) {
  		this.categorias = categorias;
  	}
  	
  	 @Override
 	public int hashCode() {
 		return Objects.hash(categorias);
 	}

 	@Override
 	public boolean equals(Object obj) {
 		if (this == obj)
 			return true;
 		if (obj == null)
 			return false;
 		if (getClass() != obj.getClass())
 			return false;
 		Jogo other = (Jogo) obj;
 		return Objects.equals(categorias, other.categorias);
 	}
 	
 	public boolean ehDaCategoria(CategoriaDeJogo categoria) {
 		if(this.categorias.equals(categoria)) {
 			return true;
 		} 
 		return false; 			
 		}
    //…
}

