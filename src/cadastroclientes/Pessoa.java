package cadastroclientes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felipe
 */
import javax.swing.JOptionPane;

public class Pessoa {
    
    private int id;
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String cpf;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    

    public int getId() {
        return id;
    }

    public Pessoa(String nome, String cidade, String estado, String cpf, String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
        this.cpf = cpf;
        this.endereco = endereco;
        System.out.println("usuario criado!");
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
}
