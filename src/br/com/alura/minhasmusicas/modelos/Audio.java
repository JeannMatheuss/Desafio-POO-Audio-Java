package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalDeRepoducoes;
    private int totalDeCurtidas;
    private int classificacao;

    
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
    public int getClassificacao() {
        return classificacao;
    }

    public void curte() {
        this.totalDeCurtidas++;
    }

    public void reproduz() {
        this.totalDeRepoducoes++;
    }
}
