package bean;
// Generated 14/09/2023 09:09:45 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * FuncionarioNvb generated by hbm2java
 */
@Entity
@Table(name="funcionario_nvb"
    ,catalog="db_nathalia_boeira"
)
public class FuncionarioNvb  implements java.io.Serializable {


     private int idfuncionarioNvb;
     private String nomeNvb;
     private String dataNascimentoNvb;
     private String rgNvb;
     private String cpfNvb;
     private String sexoNvb;
     private String emailNvb;
     private String senhaNvb;
     private String telefoneNvb;
    

    public FuncionarioNvb() {
    }

	
    public FuncionarioNvb(int idfuncionarioNvb) {
        this.idfuncionarioNvb = idfuncionarioNvb;
    }
    public FuncionarioNvb(int idfuncionarioNvb, String nomeNvb, String dataNascimentoNvb, String rgNvb, String cpfNvb, String sexoNvb, String emailNvb, String senhaNvb, String telefoneNvb) {
       this.idfuncionarioNvb = idfuncionarioNvb;
       this.nomeNvb = nomeNvb;
       this.dataNascimentoNvb = dataNascimentoNvb;
       this.rgNvb = rgNvb;
       this.cpfNvb = cpfNvb;
       this.sexoNvb = sexoNvb;
       this.emailNvb = emailNvb;
       this.senhaNvb = senhaNvb;
       this.telefoneNvb = telefoneNvb;
      
    }
   
     @Id 

    
    @Column(name="idfuncionario_nvb", unique=true, nullable=false)
    public int getIdfuncionarioNvb() {
        return this.idfuncionarioNvb;
    }
    
    public void setIdfuncionarioNvb(int idfuncionarioNvb) {
        this.idfuncionarioNvb = idfuncionarioNvb;
    }

    
    @Column(name="nome_nvb", length=45)
    public String getNomeNvb() {
        return this.nomeNvb;
    }
    
    public void setNomeNvb(String nomeNvb) {
        this.nomeNvb = nomeNvb;
    }

    
    @Column(name="dataNascimento_nvb", length=45)
    public String getDataNascimentoNvb() {
        return this.dataNascimentoNvb;
    }
    
    public void setDataNascimentoNvb(String dataNascimentoNvb) {
        this.dataNascimentoNvb = dataNascimentoNvb;
    }

    
    @Column(name="rg_nvb", length=45)
    public String getRgNvb() {
        return this.rgNvb;
    }
    
    public void setRgNvb(String rgNvb) {
        this.rgNvb = rgNvb;
    }

    
    @Column(name="cpf_nvb", length=45)
    public String getCpfNvb() {
        return this.cpfNvb;
    }
    
    public void setCpfNvb(String cpfNvb) {
        this.cpfNvb = cpfNvb;
    }

    
    @Column(name="sexo_nvb", length=45)
    public String getSexoNvb() {
        return this.sexoNvb;
    }
    
    public void setSexoNvb(String sexoNvb) {
        this.sexoNvb = sexoNvb;
    }

    
    @Column(name="email_nvb", length=45)
    public String getEmailNvb() {
        return this.emailNvb;
    }
    
    public void setEmailNvb(String emailNvb) {
        this.emailNvb = emailNvb;
    }

    
    @Column(name="senha_nvb", length=45)
    public String getSenhaNvb() {
        return this.senhaNvb;
    }
    
    public void setSenhaNvb(String senhaNvb) {
        this.senhaNvb = senhaNvb;
    }

    
    @Column(name="telefone_nvb", length=45)
    public String getTelefoneNvb() {
        return this.telefoneNvb;
    }
    
    public void setTelefoneNvb(String telefoneNvb) {
        this.telefoneNvb = telefoneNvb;
    }

}


