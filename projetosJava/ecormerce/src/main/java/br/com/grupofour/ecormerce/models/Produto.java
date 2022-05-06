package br.com.grupofour.ecormerce.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Entity(name = "tb_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String nome_produto;
    private Double preco;

    public Produto() {
    }

    public Produto(Long id, String nome_produto, Double preco) {
        this.id = id;
        this.nome_produto = nome_produto;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }


}
