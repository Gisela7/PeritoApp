package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "auditoria") // Nome da tabela no banco de dados
public class Auditoria implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_hora", nullable = false)
    private Date dataHora;

    @Column(name = "usuario", length = 100, nullable = false)
    private String usuario;

    @Column(name = "acao", length = 100, nullable = false)
    private String acao;

    @Column(name = "descricao", length = 500)
    private String description; // Mapeado no getDescricao() abaixo

    // Construtor padrão necessário para o JPA
    public Auditoria() {
    }
    
    // Construtor auxiliar para facilitar quando você for registrar uma nova auditoria
    public Auditoria(Date dataHora, String usuario, String acao, String descricao) {
        this.dataHora = dataHora;
        this.usuario = usuario;
        this.acao = acao;
        this.description = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getDescricao() {
        return description;
    }

    public void setDescricao(String descricao) {
        this.description = descricao;
    }
}
