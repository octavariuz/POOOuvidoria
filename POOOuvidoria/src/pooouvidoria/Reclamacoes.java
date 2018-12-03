/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooouvidoria;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author octavio
 */
@Entity
@Table(name = "RECLAMACOES", catalog = "", schema = "OUVIDORIA")
@NamedQueries({
    @NamedQuery(name = "Reclamacoes.findAll", query = "SELECT r FROM Reclamacoes r")
    , @NamedQuery(name = "Reclamacoes.findById", query = "SELECT r FROM Reclamacoes r WHERE r.id = :id")
    , @NamedQuery(name = "Reclamacoes.findByEmail", query = "SELECT r FROM Reclamacoes r WHERE r.email = :email")})
public class Reclamacoes implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @Lob
    @Column(name = "RECLAMACAO")
    private String reclamacao;

    public Reclamacoes() {
    }

    public Reclamacoes(Long id) {
        this.id = id;
    }

    public Reclamacoes(Long id, String email, String reclamacao) {
        this.id = id;
        this.email = email;
        this.reclamacao = reclamacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        Long oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getReclamacao() {
        return reclamacao;
    }

    public void setReclamacao(String reclamacao) {
        String oldReclamacao = this.reclamacao;
        this.reclamacao = reclamacao;
        changeSupport.firePropertyChange("reclamacao", oldReclamacao, reclamacao);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reclamacoes)) {
            return false;
        }
        Reclamacoes other = (Reclamacoes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pooouvidoria.Reclamacoes[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
