package bean;
// Generated 21/09/2023 14:09:43 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ClienteNvb generated by hbm2java
 */
@Entity
@Table(name="cliente_nvb"
    ,catalog="db_nathalia_boeira"
)
public class ClienteNvb  implements java.io.Serializable {


     private int idclienteNvb;
     private String nomeNvb;
     private String apelidoNvb;
     private String idadeNvb;
     private String dataNascimentoNvb;
     private String telefoneNvb;
     private String enderecoNvb;
     private String bairroNvb;
     private String cepNvb;
     private String rgNvb;
     private String cidadeNvb;
     private String cpfNvb;
     private String sexoNvb;
     private String ativoNvb;
     private String emailNvb;
     private String senhaNvb;
     private Set vendaProdutoNvbs = new HashSet(0);

    public ClienteNvb() {
    }

	
    public ClienteNvb(int idclienteNvb) {
        this.idclienteNvb = idclienteNvb;
    }
    public ClienteNvb(int idclienteNvb, String nomeNvb, String apelidoNvb, String idadeNvb, String dataNascimentoNvb, String telefoneNvb, String enderecoNvb, String bairroNvb, String cepNvb, String rgNvb, String cidadeNvb, String cpfNvb, String sexoNvb, String ativoNvb, String emailNvb, String senhaNvb, Set vendaProdutoNvbs) {
       this.idclienteNvb = idclienteNvb;
       this.nomeNvb = nomeNvb;
       this.apelidoNvb = apelidoNvb;
       this.idadeNvb = idadeNvb;
       this.dataNascimentoNvb = dataNascimentoNvb;
       this.telefoneNvb = telefoneNvb;
       this.enderecoNvb = enderecoNvb;
       this.bairroNvb = bairroNvb;
       this.cepNvb = cepNvb;
       this.rgNvb = rgNvb;
       this.cidadeNvb = cidadeNvb;
       this.cpfNvb = cpfNvb;
       this.sexoNvb = sexoNvb;
       this.ativoNvb = ativoNvb;
       this.emailNvb = emailNvb;
       this.senhaNvb = senhaNvb;
       this.vendaProdutoNvbs = vendaProdutoNvbs;
    }
   
     @Id 

    
    @Column(name="idcliente_nvb", unique=true, nullable=false)
    public int getIdclienteNvb() {
        return this.idclienteNvb;
    }
    
    public void setIdclienteNvb(int idclienteNvb) {
        this.idclienteNvb = idclienteNvb;
    }

    
    @Column(name="nome_nvb", length=50)
    public String getNomeNvb() {
        return this.nomeNvb;
    }
    
    public void setNomeNvb(String nomeNvb) {
        this.nomeNvb = nomeNvb;
    }

    
    @Column(name="apelido_nvb", length=45)
    public String getApelidoNvb() {
        return this.apelidoNvb;
    }
    
    public void setApelidoNvb(String apelidoNvb) {
        this.apelidoNvb = apelidoNvb;
    }

    
    @Column(name="idade_nvb", length=3)
    public String getIdadeNvb() {
        return this.idadeNvb;
    }
    
    public void setIdadeNvb(String idadeNvb) {
        this.idadeNvb = idadeNvb;
    }

    
    @Column(name="dataNascimento_nvb", length=8)
    public String getDataNascimentoNvb() {
        return this.dataNascimentoNvb;
    }
    
    public void setDataNascimentoNvb(String dataNascimentoNvb) {
        this.dataNascimentoNvb = dataNascimentoNvb;
    }

    
    @Column(name="telefone_nvb", length=45)
    public String getTelefoneNvb() {
        return this.telefoneNvb;
    }
    
    public void setTelefoneNvb(String telefoneNvb) {
        this.telefoneNvb = telefoneNvb;
    }

    
    @Column(name="endereco_nvb", length=45)
    public String getEnderecoNvb() {
        return this.enderecoNvb;
    }
    
    public void setEnderecoNvb(String enderecoNvb) {
        this.enderecoNvb = enderecoNvb;
    }

    
    @Column(name="bairro_nvb", length=45)
    public String getBairroNvb() {
        return this.bairroNvb;
    }
    
    public void setBairroNvb(String bairroNvb) {
        this.bairroNvb = bairroNvb;
    }

    
    @Column(name="cep_nvb", length=45)
    public String getCepNvb() {
        return this.cepNvb;
    }
    
    public void setCepNvb(String cepNvb) {
        this.cepNvb = cepNvb;
    }

    
    @Column(name="rg_nvb", length=45)
    public String getRgNvb() {
        return this.rgNvb;
    }
    
    public void setRgNvb(String rgNvb) {
        this.rgNvb = rgNvb;
    }

    
    @Column(name="cidade_nvb", length=45)
    public String getCidadeNvb() {
        return this.cidadeNvb;
    }
    
    public void setCidadeNvb(String cidadeNvb) {
        this.cidadeNvb = cidadeNvb;
    }

    
    @Column(name="cpf_nvb", length=45)
    public String getCpfNvb() {
        return this.cpfNvb;
    }
    
    public void setCpfNvb(String cpfNvb) {
        this.cpfNvb = cpfNvb;
    }

    
    @Column(name="sexo_nvb", length=20)
    public String getSexoNvb() {
        return this.sexoNvb;
    }
    
    public void setSexoNvb(String sexoNvb) {
        this.sexoNvb = sexoNvb;
    }

    
    @Column(name="ativo_nvb", length=3)
    public String getAtivoNvb() {
        return this.ativoNvb;
    }
    
    public void setAtivoNvb(String ativoNvb) {
        this.ativoNvb = ativoNvb;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="clienteNvb")
    public Set getVendaProdutoNvbs() {
        return this.vendaProdutoNvbs;
    }
    
    public void setVendaProdutoNvbs(Set vendaProdutoNvbs) {
        this.vendaProdutoNvbs = vendaProdutoNvbs;
    }




}


