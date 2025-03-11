package com.teste.primeiro_teste.domain.produto;

import java.util.UUID;

import javax.xml.crypto.Data;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "produto")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class produto {

    @Id
    @GeneratedValue
    private UUID ID;

    private String cn;
    private String descricao;
    private int quantidade;
    private String mapeamento;
    private int quantCaixa;
    private int quantPacote;
    private Data dataConferencia;
}
