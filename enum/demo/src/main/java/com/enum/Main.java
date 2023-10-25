package com.enum;

public class Main {
    public static void main(String[] args) {
        
        for (DiasSemana dia : DiasSemana.values()) {
            System.out.println(dia.getNome());
        }

        
        for (PermissoesDiretorio permissao : PermissoesDiretorio.values()) {
            System.out.println("Permissão de leitura: " + permissao.permiteLeitura());
            System.out.println("Permissão de escrita: " + permissao.permiteEscrita());
            System.out.println("Permissão de criação: " + permissao.permiteCriacao());
            System.out.println("Permissão de exclusão: " + permissao.permiteExclusao());
        }

        
        for (PontosCardeais ponto : PontosCardeais.values()) {
            System.out.println("Ponto cardeal: " + ponto.name());
            System.out.println("Angulo: " + ponto.getGrau() + " graus");
        }

        
        for (PosicoesTabuleiro posicao : PosicoesTabuleiro.values()) {
            System.out.println("Posição: " + posicao.name());
            System.out.println("Cor: " + posicao.getCor());
            System.out.println("Linha: " + posicao.getLinha());
            System.out.println("Coluna: " + posicao.getColuna());
        }

        
        for (TamanhoPizza tamanho : TamanhoPizza.values()) {
            System.out.println("Tamanho: " + tamanho.name());
            System.out.println("Diâmetro: " + tamanho.getDiametro() + " cm");
        }
    }
}
