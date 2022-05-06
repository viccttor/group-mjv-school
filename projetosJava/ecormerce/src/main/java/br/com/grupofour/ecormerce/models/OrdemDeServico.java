package br.com.grupofour.ecormerce.models;

import br.com.grupofour.ecormerce.enums.Status;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "tb_ordem")
public class OrdemDeServico {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private Instant momentoDaCompra;
    private Status status;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @OneToMany(mappedBy = "ordem")
    private List<OrdemItems> items = new ArrayList<>();

    public List<OrdemItems> getItems() {
        return items;
    }

    public OrdemDeServico() {
    }

    public OrdemDeServico(Long id, Instant momentoDaCompra, Status status, Cliente cliente) {
        this.id = id;
        this.momentoDaCompra = momentoDaCompra;
        this.status = status;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMomentoDaCompra() {
        return momentoDaCompra;
    }

    public void setMomentoDaCompra(Instant momentoDaCompra) {
        this.momentoDaCompra = momentoDaCompra;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
