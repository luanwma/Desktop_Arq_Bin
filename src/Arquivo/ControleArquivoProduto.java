/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arquivo;

import Model.Produto;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Luan
 */
public class ControleArquivoProduto extends ControleArquivo{
    
    
    protected Produto produto;
    private ArrayList<Produto> listProduts = null; //= new ArrayList<>();
    ArrayList listObject = null;
    
    ArrayList<Object> dados ;
   
    //int id ;
  
    public int contagemId() throws FileNotFoundException, IOException{
        int i = 0;
        if(!getArquivo().exists()){
            return i;
        }
        Object obj=  null;
        Produto prod = null;
        obj = ler();
        while(obj != null){
            prod = (Produto) obj;
            i = prod.getId() +1;
            obj = ler();
            
        }
        
        fecharLeitor();
        
        return i;
    }
    
    
     public boolean listarTodosProdutos(){
        listProduts = new ArrayList<>();
        Produto prod = null ;
        Object obj = null;
        obj = ler();
       // prod = (Produto)ler();
        while(obj != null){
            prod = (Produto) obj;
            
            listProduts.add(prod);
           // prod = (Produto)ler();
            obj = ler();
        }
        
        for(Produto p :listProduts){
            System.out.println("p nome "+p.getNome());
        }
        fecharLeitor();
        return true;
 
    }
    
    
    public ArrayList impressaoListaProdutos(){
        
        ArrayList listObject = new ArrayList();
        Produto prod ;
        Object obj = null;
        prod = (Produto) ler();
       // obj = ler();
        while(prod != null){
           // prod = (Produto)obj;
            //listProdutos.add(prod);
            listObject.add(new Object[]{prod.getId(), prod.getNome(), 
                prod.getPreco(),prod.getDescricao()});
            
           prod = (Produto) ler();
        }
        fecharLeitor();
        return listObject;
    }
    
    public boolean gravarProdutoArquivo(Produto produto, boolean append) throws IOException{
       boolean status = false;
        
        if(escrever(produto, append)){
            status = true;
        }
        return status;
    
      
    }
    
    public Produto buscarProdArquivo(int id){
        Produto prod = null ;
       // listarTodosProdutos();
        for(int i = 0 ; i < listProduts.size();i++){
            if(listProduts.get(i).getId() == id){
                prod = listProduts.get(i);
            }
        }
        
        return prod;
    }
    public void  consoleList(){
        for(int i = 0 ; i< listProduts.size(); i++){
            System.out.println("lista get "+i+" nome "+listProduts.get(i).getNome()+"\n");
        }
    }
    
    
    
    public ArrayList buscarListaProduto(String nome){
        boolean status = false;
        Produto aux = null;
      
        ArrayList listabusca = new ArrayList<>();
      
       // leitor = criaLeitorBinario();
        aux = (Produto) ler();
        while(aux != null){
            
            if(aux.getNome().contains(nome)){
                
                listabusca.add(new Object[]{aux.getId(), aux.getNome(), 
                    aux.getPreco(), aux.getDescricao()});
                
            }
            aux = (Produto) ler();
            
        }
        fecharLeitor();
        return listabusca;
    }
    
 
    
    
   
   
    
    public boolean deleteProdutofromLista(int id){
        boolean status = false;
        for(int i = 0 ; i < listProduts.size() ;i++){
            if(listProduts.get(i).getId() == id){
                System.out.println("delete "+listProduts.get(i).getNome());
                listProduts.remove(i);
                status = true;
            }
        }
               
        return status;
        
    }
    public boolean novoarquivo() throws IOException{
        boolean status = false;
        Produto prod = listProduts.get(0);
        Produto aux;
        escrever(prod, false);
        for(int i = 1 ; i < listProduts.size() ; i++){
            aux = listProduts.get(i);
            
            escrever(aux,true);
            status = true; 
        }
        
        return status;
    }
    public boolean gravarProdutoOrdenadoNalista(int id, Produto produto) throws IOException{
        boolean status = false;
        ArrayList<Produto> listAux = new ArrayList<>();
       
       for(int i = 0 ; i < listProduts.size() ; i++){
           if(listProduts.get(i).getId() < id || listProduts.get(i).getId() > id){
               listAux.add(listProduts.get(i));
           }
           if(listProduts.get(i).getId() == id-1){
               listAux.add(produto);
               status = true;
           }
       }
       listProduts = new ArrayList<>();
       for(Produto p : listAux){
           listProduts.add(p);
       }
        
       
        return status;
        
    }
    
     public boolean deleteFile(){
        File arq = getArquivo();
        arq.delete();
        return true;
    }
    
    
    

    
    
    
    
    
}
