/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Arquivo.ControleArquivoCliente;
import Model.Cliente;
import Model.Endereco;
import Model.Pessoa;
import Model.PessoaFisica;
import Model.PessoaJuridica;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Luan
 */
public class ControleCliente extends ControleArquivoCliente implements InterfaceControle{
   
    ArrayList<Cliente> listaclientes  = new ArrayList<Cliente>();
   
    Cliente cliente = null;
    Pessoa pessoa = null;
    PessoaFisica pf = null;
    PessoaJuridica pj = null;
    Endereco endereco = null;
    
    public ControleCliente(){
        String dir = System.getProperty("user.dir");
        String nomearq = dir+"/Dados/Clientes.bin";
        setArquivo(nomearq);
    }
    
    public int novoId() throws IOException{
        int novoid = contagemId();
        return novoid;
    }
    
    String [] dados ;
    
   
    //pessoa fisica
    /* nome, email, telefone, rg, cpf, estado, cidade, bairro, rua, numero, complemento */
    //pessoa juridica
    /*nome, email telefone, nomefantasia, cnpj, estado, cidade, bairro, rua, numero, complemento*/
    public boolean pegarDados(boolean alteracao ,int id ,int tipo, String nome, String email, 
            String tel, String doc1, String doc2, String estado, String cidade, String bairro,
            String rua, String numero, String complemento) throws IOException{
        int realid = 0;
        if(alteracao == true){
            realid = id;
            
        }
        if(alteracao == false){
            realid= novoId();
        }
        endereco = new Endereco(estado,cidade,bairro,rua ,numero,complemento);
        if(tipo ==0 ){
            pf = new PessoaFisica(doc2, doc1, realid, nome, email, tel);
            cliente = new Cliente(pf,endereco);
        }
        if(tipo ==1){
            pj = new PessoaJuridica(doc2, doc1, realid, nome, email, tel );
            cliente = new Cliente(pj,endereco);
        }
        
    
       
        if(tipo ==  0 ){
            /*
            System.out.println("imprimir cliente pf ");
            System.out.println("cliente.getTipo() "+cliente.getTipo());
            System.out.println(" cliente."+cliente.getPessoaFisica().getNome());
            System.out.println(" "+cliente.getPessoaFisica().getNome());
            System.out.println("  "+cliente.getPessoaFisica().getCpf());
            */
        }
        if(tipo ==1 ){
            /*
            System.out.println("imprimir cliente pj ");
            System.out.println("cliente.getTipo() "+cliente.getTipo());
            System.out.println(" cliente."+cliente.getNome());
            System.out.println(" "+cliente.getTelefone());
            System.out.println("  "+cliente.getPessoaJuridica().getCNPJ());
            */
        }
        
        
     
        return true;
    }
    public void chamarGravarOrdenado(int id, Cliente cliente){
        gravarClienteOrdenadoNalista( id, cliente);
    }
    
    
   
     
    public boolean salvarCliente() throws IOException{
        
        return gravarClienteArquivo(cliente, true) == true;
        
    }
    
    
    public ArrayList buscaCliente(String nomeBusca) throws IOException{
       
        listarTodosClientes();
        return buscarArray(nomeBusca);
        
        /*listaclientes = buscarListaCliente(nomeBusca);
        System.out.println("teste controle cli \n");
        for(int i = 0 ; i < listaclientes.size() ; i++){
            System.out.println("nome "+listaclientes.get(i).getPessoaFisica().getNome());
        }
        return clientListToArrayList(listaclientes); */
         
    }
    
    public boolean removeCliente(int id){
        listarTodosClientes();
        deleteClientefromLista(id);
        return false;
    }
    
    public Cliente getCliente(){
        
        System.out.println(" dentro de get cliente +++++ \n");
        if(cliente.getPessoaFisica() != null){
            System.out.println(" id pf "+cliente.getPessoaFisica().getId());
        }
        if(cliente.getPessoaJuridica() != null){
            System.out.println(" id  pj "+cliente.getPessoaJuridica().getId());
        }
        
        return cliente;
    }
    
   
    
    
    

    @Override
    public JTable dadostabela(JTable table, ArrayList listclientes, String[] colunas) {
        ModeloTabela modelo = new ModeloTabela(listclientes, colunas);
            
            table.setModel(modelo);
            for(int i = 0 ; i <colunas.length;i++){
                table.getColumnModel().getColumn(i).setPreferredWidth(20);
                table.getColumnModel().getColumn(i).setResizable(true);
            }
            
            
            table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            return table;
    
    }
    
   
    public String selecionarNome(JTable tabClientes){
        int linha = tabClientes.getSelectedRow();
        String nome = (String)tabClientes.getValueAt(linha, 2);
        return nome;
    }
    
    
     public int selecionarId(JTable tabClientes){
        int linha = tabClientes.getSelectedRow();
        int id = (Integer) tabClientes.getValueAt(linha,0);
       // int ide = Integer.parseInt(id);
        return id;
    }
    public int selecionarTipo(JTable tabClientes){
        int linha = tabClientes.getSelectedRow();
        int type =-1;
        String tipo = (String) tabClientes.getValueAt(linha,1);
        if(tipo.contains("FÍSICA")){
            type =0;
            return type;
        }
        if(tipo.contains("JURÍDICA")){
            type = 1;
            return type;
        }
        //int ttipo = Integer.parseInt(tipo);
        return type;
       
    }

   
    
    
    
   
    
}
