package com.teste.primeiro_teste.domain.produto;

import java.util.UUID;

import javax.xml.crypto.Data;

import org.springframework.data.annotation.Id;

import jakarta.annotation.Generated;
import jakarta.
import lombok.Getter;
import lombok.Setter;

@Table()
public class produto {
    @Id
    @Generated
    private UUID ID;

    private String cn;
    private String descricao;
    private int quantidade;
    private String mapeamento;
    private int quantCaixa;
    private int quantPacote;
    private Data dataConferencia;
}
