package it.silviafabbri.tesi.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

@Entity(name = "incassi")
public class Incasso implements Serializable {
    @Id
    private UUID id;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, timezone = JsonFormat.DEFAULT_TIMEZONE)
    @Column
    private LocalDate giorno;
    @Column
    private BigDecimal totale;
    @Column
    private BigDecimal gastronomia;
    @Column
    private BigDecimal fresco;
    @Column
    private BigDecimal secco;
    @Column
    private BigDecimal ortofrutta;
    @Column
    private BigDecimal surgelati;
    @Column
    private String meteo;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDate getGiorno() {
        return giorno;
    }

    public void setGiorno(LocalDate giorno) {
        this.giorno = giorno;
    }

    public BigDecimal getTotale() {
        return totale;
    }

    public void setTotale(BigDecimal totale) {
        this.totale = totale;
    }

    public BigDecimal getGastronomia() {
        return gastronomia;
    }

    public void setGastronomia(BigDecimal gastronomia) {
        this.gastronomia = gastronomia;
    }

    public BigDecimal getFresco() {
        return fresco;
    }

    public void setFresco(BigDecimal fresco) {
        this.fresco = fresco;
    }

    public BigDecimal getSecco() {
        return secco;
    }

    public void setSecco(BigDecimal secco) {
        this.secco = secco;
    }

    public BigDecimal getOrtofrutta() {
        return ortofrutta;
    }

    public void setOrtofrutta(BigDecimal ortofrutta) {
        this.ortofrutta = ortofrutta;
    }

    public BigDecimal getSurgelati() {
        return surgelati;
    }

    public void setSurgelati(BigDecimal surgelati) {
        this.surgelati = surgelati;
    }

    public String getMeteo() {
        return meteo;
    }

    public void setMeteo(String meteo) {
        this.meteo = meteo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Incasso incasso = (Incasso) o;
        return Objects.equals(id, incasso.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
