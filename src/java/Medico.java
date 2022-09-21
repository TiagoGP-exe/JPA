/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.TemporalType;
import javax.persistence.Temporal;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "medico")
public class Medico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String crm;
    private int totalconsult;
    private String adress;
    private String phone;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_hora", nullable = false)
    private Calendar dataMedico;
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public int getTotalconsult() {
        return totalconsult;
    }

    public void setTotalconsult(int totalconsult) {
        this.totalconsult = totalconsult;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Calendar getDataMedico() {
        return dataMedico;
    }

    public void setDataMedico(Calendar dataMedico) {
        this.dataMedico = dataMedico;
    }



}
