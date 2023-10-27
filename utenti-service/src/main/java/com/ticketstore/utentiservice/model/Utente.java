package com.ticketstore.utentiservice.model;

import com.ticketstore.utentiservice.utils.enums.TipologiaUtente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUtente;

    private String username;

    private String password;

    private TipologiaUtente tipologiaUtente;

//    @OneToOne(cascade = CascadeType.REMOVE)
//    @JoinColumn(name = "codAnagrafica", referencedColumnName = "idAnagrafica")
//    private Anagrafica anagrafica;
}
