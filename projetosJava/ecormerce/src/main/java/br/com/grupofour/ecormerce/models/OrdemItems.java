package br.com.grupofour.ecormerce.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity(name = "ordem_item")
public class OrdemItems {


    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private Integer quantidadeDeItems;
    private Double preco;


    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;


    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "ordem_id")
    private OrdemDeServico ordem;

    public OrdemItems() {

    }

    public OrdemItems(Long id, Integer quantidadeDeItems, Double preco, Produto produto, OrdemDeServico ordem) {
        this.id = id;
        this.quantidadeDeItems = quantidadeDeItems;
        this.preco = preco;
        this.produto = produto;
        this.ordem = ordem;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantidadeDeItems() {
        return quantidadeDeItems;
    }

    public void setQuantidadeDeItems(Integer quantidadeDeItems) {
        this.quantidadeDeItems = quantidadeDeItems;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public OrdemDeServico getOrdem() {
        return ordem;
    }

    public void setOrdem(OrdemDeServico ordem) {
        this.ordem = ordem;
    }

    public double getSubTotal(){
        return quantidadeDeItems *preco;
    }


}
