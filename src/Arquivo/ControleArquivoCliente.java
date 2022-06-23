/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arquivo;

import Model.Cliente;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Luan
 */
public class ControleArquivoCliente extends ControleArquivo{
   
    protected Cliente cliente;
   // ArrayList<String> listaClientes ;
    ArrayList<Cliente> listClient = null;
    
    ArrayList listaobjts = null;
    ArrayList<Cliente> listabusca = null;
   
    
    public ArrayList buscarArray(String nome){
       ArrayList listabusca = new ArrayList();
        for(int i = 0 ; i < listClient.size() ; i++){
            if(listClient.get(i).getPessoaFisica() != null) {
                if(listClient.get(i).getPessoaFisica().getNome().contains(nome) ){
                    listabusca.add(new Object[]{listClient.get(i).getPessoaFisica().getId(),
                     listClient.get(i).getTipo(),listClient.get(i).getPessoaFisica().getNome(),
                     listClient.get(i).getPessoaFisica().getRg(), listClient.get(i).getPessoaFisica().getCpf(),
                     listClient.get(i).getPessoaFisica().getTelefone(), listClient.get(i).getPessoaFisica().getEmail()});
                }
            }
            if(listClient.get(i).getPessoaJuridica() != null){
                if( listClient.get(i).getPessoaJuridica().getNome().contains(nome)){
                    listabusca.add(new Object[]{listClient.get(i).getPessoaJuridica().getId(), listClient.get(i).getTipo(),
                        listClient.get(i).getPessoaJuridica().getNome(),
                        listClient.get(i).getPessoaJuridica().getNomeFantasia(),listClient.get(i).getPessoaJuridica().getCNPJ(),
                        listClient.get(i).getPessoaJuridica().getTelefone(), listClient.get(i).getPessoaJuridica().getEmail()});
                }
            } 
            
        }
        return listabusca;
    }
    
    public boolean gravarClienteArquivo(Cliente cliente, boolean append) throws IOException{
        boolean status = false;
        if(escrever(cliente, append)){
            //JOptionPane.showMessageDialog(null, "Cliente gravado no arquivo com sucesso");
            status= true;
        }
        
        return status;
    }
    
    public ArrayList<Cliente> buscarListaCliente(String nome){
        boolean status = false;
        Cliente aux ;
        listarTodosClientes();
        listabusca = new ArrayList<>();
        Object obj = null;
           
            
            obj = ler();
            Cliente cli = (Cliente) ler();
            
        while(cli != null){
            
           // aux = (Cliente) obj;
            
            if(cli.getPessoaFisica() != null){
                System.out.println("teste aux. pf  "+cli.getPessoaFisica().getNome());
                if(cli.getPessoaFisica().getNome().contains(nome)){
                   // System.out.println("teste aux. pf  "+aux.getPessoaFisica().getNome());
                    listabusca.add(cli);
                }
            }
            if( cli.getPessoaJuridica()!= null) {
                System.out.println("teste aux. pf  "+cli.getPessoaJuridica().getNome());
                if(cli.getPessoaJuridica().getNome().contains(nome)){
                    listabusca.add(cli);
                }
            }
            cli = (Cliente) ler();
            
        }
        fecharLeitor();
        return listabusca;
    }
    
    public boolean listarTodosClientes(){
        listClient = new ArrayList<>();
        Cliente c = null;
        c = (Cliente) ler();
        while(c != null){
            listClient.add(c);
            c = (Cliente)ler();
        }
        
        
        for(Cliente x : listClient){
            if(x.getPessoaFisica() != null){
                System.out.println("teste lstar todos pf "+x.getPessoaFisica().getNome());
            }
            if(x.getPessoaJuridica() != null){
                System.out.println("teste lstar todos pj "+x.getPessoaJuridica().getNome());
            }
        }
        
       // fecharLeitor();
        return true;
    }
    /*
    public void listarTodosClientes(){
       
        
        Object obj = null;
        Cliente cli = null;
        
        obj = ler();
        while(obj != null){
            cli = (Cliente)obj;
            if(cli.getPessoaFisica() != null){
                System.out.println(" tes para saber se o cliente foi lido "+cli.getPessoaFisica().getNome());
            }
            listClient.add(cli);
            
            obj = ler();
        }
        
        fecharLeitor();
        //var file = getArquivo();
        //file.delete();
        
    }
    */
    public boolean deleteClientefromLista(int id){
        boolean status = false;
        for(int i = 0 ; i < listClient.size() ; i++){
           // Cliente c = listClient.get(i);
            if(listClient.get(i).getPessoaFisica() != null){
                System.out.println("tentando "+listClient.get(i).getPessoaFisica().getId());
                if(listClient.get(i).getPessoaFisica().getId() == id){
                    System.out.println("cliente pra deletar pf "+listClient.get(i).getPessoaFisica().getNome());
                    listClient.remove(i);
                    
                    status = true;
                }
            }else
            if(listClient.get(i).getPessoaJuridica() != null){
                System.out.println("tentando "+listClient.get(i).getPessoaJuridica().getId());
                if(listClient.get(i).getPessoaJuridica().getId() == id){
                    System.out.println("cliente pra deletar pj "+listClient.get(i).getPessoaJuridica().getNome());
                    listClient.remove(i);
                    status = true;
                }
            }
            
        }
        
       
        return status;
        
    }
    
    public boolean gravarTodosClientes(){
        //1 da lista tem que reescrever o arquivo append false
        boolean status =false;
        Cliente c = listClient.get(0);
        escrever(c, false);
        //listClient.remove(c);
        for(int i = 1 ; i < listClient.size() ; i++){
            Cliente aux = listClient.get(i);
            
            escrever(aux,true);
            status = true;
        }
        return status;
    }
    
    public ArrayList clientListToArrayList(ArrayList<Cliente> listaclientes){
        Object obj = null;
        listaobjts = new ArrayList();
      
        for(Cliente c : listaclientes){
            if(c.getPessoaFisica() != null){
               
                listaobjts.add(new Object[]{c.getPessoaFisica().getId(),
                 c.getTipo(),c.getPessoaFisica().getNome(),
                 c.getPessoaFisica().getRg(), c.getPessoaFisica().getCpf(),
                 c.getPessoaFisica().getTelefone(), c.getPessoaFisica().getEmail(), 
                });
            }
            if(c.getPessoaJuridica() != null){
                listaobjts.add(new Object[]{c.getPessoaJuridica().getId(), c.getTipo(),
                    c.getPessoaJuridica().getNome(),c.getPessoaJuridica().getNomeFantasia(),
                     c.getPessoaJuridica().getCNPJ(),c.getPessoaJuridica().getTelefone(),
                     c.getPessoaJuridica().getEmail()            
                });
                
            }
            
        }
        return listaobjts;
    }
     
    public boolean deleteFile(){
        File arq = getArquivo();
        arq.delete();
        return true;
    }
   
    public boolean novoarquivo() throws IOException{
        
        for(int i = 0 ; i < listClient.size() ; i++){
            Cliente c = listClient.get(i);
            if(i == 0){
                escrever(c,false);
            }
            escrever(c,true);
        }
         return true;   

    }
     
    
    // retorno de array para montar tabela
    public ArrayList printLista() throws FileNotFoundException, IOException{
       // listaobjts listClient
        
        listaobjts = new ArrayList();
        
        Object obj=  null;
        Cliente cli = null;
        
        obj = ler();
        while(obj != null){
            cli = (Cliente) obj;
            
            
            if(cli.getPessoaFisica() != null){
               
                listaobjts.add(new Object[]{
                    cli.getPessoaFisica().getId(), cli.getTipo(), cli.getPessoaFisica().getNome(),
                    cli.getPessoaFisica().getRg(),cli.getPessoaFisica().getCpf(), 
                    cli.getPessoaFisica().getTelefone(), cli.getPessoaFisica().getEmail()  
                });
            }
            if(cli.getPessoaJuridica() != null){
                listaobjts.add(new Object[]{
                    cli.getPessoaJuridica().getId(), cli.getTipo(), cli.getPessoaJuridica().getNome(),
                    cli.getPessoaJuridica().getNomeFantasia(),cli.getPessoaJuridica().getCNPJ(),
                    cli.getPessoaJuridica().getTelefone(), cli.getPessoaJuridica().getEmail()  
                });
            }
            
            obj = ler();
        }
        
        fecharLeitor();
        return listaobjts;
        
        
    }
    
     public boolean gravarClienteOrdenadoNalista( int id , Cliente cliente){
        ArrayList<Cliente> auxList = new ArrayList<>();
        
        for(int i = 0 ; i < listClient.size() ; i++){
            if(listClient.get(i).getPessoaFisica() != null){
                if(listClient.get(i).getPessoaFisica().getId() < id || 
                        listClient.get(i).getPessoaFisica().getId() > id){
                    auxList.add(listClient.get(i));
                }
                if(listClient.get(i).getPessoaFisica().getId() == id-1){
                    auxList.add(cliente);
                }
            }
            if(listClient.get(i).getPessoaJuridica() != null){
                if(listClient.get(i).getPessoaJuridica().getId() < id || 
                        listClient.get(i).getPessoaJuridica().getId() > id ){
                    auxList.add(listClient.get(i));
                }
                if(listClient.get(i).getPessoaJuridica().getId() == id-1){
                    auxList.add(cliente);
                }
            }
        }
        
        /*
        for(int i = 0 ; i < listClient.size() ; i++){
            if(listClient.get(i).getPessoaFisica() != null || listClient.get(i).getPessoaJuridica() != null){
                if(listClient.get(i).getPessoaFisica().getId() < id  || listClient.get(i).getPessoaJuridica().getId() < id){
                    auxList.add(listClient.get(i));
                }
                if(listClient.get(i).getPessoaFisica().getId() == id-1 || listClient.get(i).getPessoaJuridica().getId() == id-1){
                    auxList.add(cliente);
                }
            }
        }*/
        
        
        
        listClient = new ArrayList<>();
        for(Cliente c : auxList){
            listClient.add(c);
        }
        return true;
    }
    
    public void mapear(){
        ObjectInputStream teste = criaLeitorBinario();
       // Map<Cliente > mapa = (TreeMap)teste.readObject();
        
    }
    
    public Cliente encontraCliente(int id){
        listarTodosClientes();
        Cliente c = null ;
        
            
            for(int i = 0 ; i < listClient.size() ; i++){
                
                if(listClient.get(i).getPessoaFisica() != null){
                    System.out.println("teste pf && "+listClient.get(i).getPessoaFisica().getNome());
                    if(listClient.get(i).getPessoaFisica().getId() == id){
                        c = listClient.get(i);
                    }
                }
                if(listClient.get(i).getPessoaJuridica() != null){
                    System.out.println("teste pf && "+listClient.get(i).getPessoaJuridica().getNome());
                    if(listClient.get(i).getPessoaJuridica().getId() == id){
                        c =  listClient.get(i);
                    }
                }
            } 
            
        //"Id da Venda", "ID do Produto","Nome do Produto","Descrição","Quantidade,"Preço por Item","Preço Total"
        
        return c;
    }
    
    public int contagemId() throws FileNotFoundException, IOException{
        int i = 0;
        if(!getArquivo().exists()){
            return i;
        }
        Object obj=  null;
        Cliente cli = null;
        obj = ler();
        while(obj != null){
            cli = (Cliente) obj;
            if(cli.getPessoaFisica() != null){
                i = cli.getPessoaFisica().getId() +1;
            }
            if(cli.getPessoaJuridica() != null){
                i = cli.getPessoaJuridica().getId() +1;
            }
            obj = ler();
            
        }
        fecharLeitor();
        
        return i;
        
    }
    
 
    
    
    
    
    

}
