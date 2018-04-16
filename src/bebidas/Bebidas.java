/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebidas;

/**
 *
 * @author SATC
 */
public enum Bebidas {
    b1("Coca-Cola 600ml:"," bebida gelada sabor cola",600, (float) 5.00),
    b2("Coca-Cola 1L:"," bebida gelada sabor cola",1000, (float) 6.50),
    b3("Coca-Cola 2L:"," bebida gelada sabor cola",2000, (float) 8.00),
    b4("Dolly:"," bebida gelada sabor câncer",600, (float) 5.00),
    b5("Dolly 1L:"," bebida gelada sabor câncer",1000, (float) 6.50),
    b6("Dolly 2L:"," bebida gelada sabor câncer",2000, (float) 8.00),
    b7("Nescau 350ml:"," bebida láctea gelada sabor chocolate",350, (float) 2.00),
    b8("Toddynho 250ml:"," bebida láctea gelada sabor chocolate",250, (float) 1.50),
    b9("Agua Tônica 500ml:"," bebida gelada sabor remédio ",500, (float) 2.00),
    b10("Red-Bull 500ml:"," bebida gelada energética sabor guaraná ",500, (float) 2.00);

    private String nome;
    private String descricao;
    private int ml;
    private float valor;

    private Bebidas(String nome, String descrição, int ml, float valor) {
        this.nome = nome;
        this.descricao = descrição;
        this.ml = ml;
        this.valor = valor;
        
    }
    
    
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getMl() {
        return ml;
    }

    public float getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "\n" + this.getNome() + this.getDescricao() ;
    }

    

    

   
    
    
}

