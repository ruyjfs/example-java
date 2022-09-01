package com.ruyjfs.microservicemysql.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_format")
@Entity(name="Format")
@Builder
public class Format {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID", nullable = false)
    private Long id;

    @Column(name="FORMATO", nullable = false)
    @JsonProperty("formato")
    private String format;

    @Column(name = "DATA_HORA_INCLUSAO_REGISTRO", nullable = false)
    @JsonProperty("data_hora_inclusao_registro")
    @CreationTimestamp
    private Date createAt;

    @Column(name = "DATA_HORA_MANUTENCAO_REGISTRO", nullable = false)
    @JsonProperty("data_hora_manutencao_registro")
    @UpdateTimestamp
    private Date updatedAt;

    @Column(name="USUARIO_MANUTENCAO_REGISTRO", nullable = false)
    @JsonProperty("usuario_manutencao_registro")
    private String userName;
}
