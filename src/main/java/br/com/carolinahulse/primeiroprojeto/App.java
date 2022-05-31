package br.com.carolinahulse.primeiroprojeto;
import java.time.LocalDate;
public class App {

    public static void main(String[] args) {
    	Endereco endereco1 = new Endereco("Santo Antônio de Pádua", 1482);
    	Endereco endereco2 = new Endereco("Oficinas", 225);
    	
        Pessoa pessoa1 = new Pessoa("Carolina Hulse", LocalDate.of(2001, 5, 3), endereco1);
        Pessoa pessoa2 = new Pessoa("Gustavo Fidelis", LocalDate.of(2002, 4, 2), endereco2);
        
        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
    }
}