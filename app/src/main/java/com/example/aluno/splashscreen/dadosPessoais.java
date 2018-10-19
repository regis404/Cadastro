package com.example.aluno.splashscreen;



abstract public class dadosPessoais {
    private static int idade;
    private static String curso;
    private static String sexo;
    private static String nome;
    private static double valorCurso;

    public static int getIdade() {
        return idade;
    }

    public static void setIdade(int idade) {
        dadosPessoais.idade = idade;
    }

    public static String getCurso() {
        return curso;
    }

    public static void setCurso(String curso) {
        dadosPessoais.curso = curso;
    }

    public static String getSexo() {
        return sexo;
    }

    public static void setSexo(String sexo) {
        dadosPessoais.sexo = sexo;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        dadosPessoais.nome = nome;
    }

    public static double getValorCurso() {
        return valorCurso;
    }

    public static void setValorCurso(double valorCurso) {
        dadosPessoais.valorCurso = valorCurso;
    }
}
