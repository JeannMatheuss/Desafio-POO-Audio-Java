package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalDeRepoducoes;
    private int totalDeCurtidas;
    private double classificacao;

    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getTotalDeRepoducoes() {
        return totalDeRepoducoes;
    }
    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }
    public double getClassificacao() {
        return classificacao;
    }

    
}
