package bean;
// Generated 21/09/2023 14:09:43 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AgendamentoProdutoNvb generated by hbm2java
 */
@Entity
@Table(name="agendamentoProduto_nvb"
    ,catalog="db_nathalia_boeira"
)
public class AgendamentoProdutoNvb  implements java.io.Serializable {


     private int idagendamentoProdutoNvb;
     private String emailNvb;
     private String valorNvb;
     private String produtoNvb;
     private String nomeClienteNvb;
     private String nomeFuncionarioNvb;

    public AgendamentoProdutoNvb() {
    }

	
    public AgendamentoProdutoNvb(int idagendamentoProdutoNvb) {
        this.idagendamentoProdutoNvb = idagendamentoProdutoNvb;
    }
    public AgendamentoProdutoNvb(int idagendamentoProdutoNvb, String emailNvb, String valorNvb, String produtoNvb, String nomeClienteNvb, String nomeFuncionarioNvb) {
       this.idagendamentoProdutoNvb = idagendamentoProdutoNvb;
       this.emailNvb = emailNvb;
       this.valorNvb = valorNvb;
       this.produtoNvb = produtoNvb;
       this.nomeClienteNvb = nomeClienteNvb;
       this.nomeFuncionarioNvb = nomeFuncionarioNvb;
    }
   
     @Id 

    
    @Column(name="idagendamentoProduto_nvb", unique=true, nullable=false)
    public int getIdagendamentoProdutoNvb() {
        return this.idagendamentoProdutoNvb;
    }
    
    public void setIdagendamentoProdutoNvb(int idagendamentoProdutoNvb) {
        this.idagendamentoProdutoNvb = idagendamentoProdutoNvb;
    }

    
    @Column(name="email_nvb", length=45)
    public String getEmailNvb() {
        return this.emailNvb;
    }
    
    public void setEmailNvb(String emailNvb) {
        this.emailNvb = emailNvb;
    }

    
    @Column(name="valor_nvb", length=45)
    public String getValorNvb() {
        return this.valorNvb;
    }
    
    public void setValorNvb(String valorNvb) {
        this.valorNvb = valorNvb;
    }

    
    @Column(name="produto_nvb", length=45)
    public String getProdutoNvb() {
        return this.produtoNvb;
    }
    
    public void setProdutoNvb(String produtoNvb) {
        this.produtoNvb = produtoNvb;
    }

    
    @Column(name="nomeCliente_nvb", length=45)
    public String getNomeClienteNvb() {
        return this.nomeClienteNvb;
    }
    
    public void setNomeClienteNvb(String nomeClienteNvb) {
        this.nomeClienteNvb = nomeClienteNvb;
    }

    
    @Column(name="nomeFuncionario_nvb", length=45)
    public String getNomeFuncionarioNvb() {
        return this.nomeFuncionarioNvb;
    }
    
    public void setNomeFuncionarioNvb(String nomeFuncionarioNvb) {
        this.nomeFuncionarioNvb = nomeFuncionarioNvb;
    }




}

