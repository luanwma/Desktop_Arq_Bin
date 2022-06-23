/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arquivo;

import Model.Usuario;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Luan
 */
public class ControleArquivoUsuario extends ControleArquivo{
    
    protected Usuario user;
    ArrayList lista = null;
    ArrayList<Usuario> listUsers = null;
    String textolinha ;
    
    public void setTextolinha(String textolinha){
        this.textolinha = textolinha;
    }
    public String getTextolinha(){
        return textolinha;
    }
    
    
    
    public boolean buscarUsuario(String nome, String senha) throws FileNotFoundException, IOException, ClassNotFoundException{
        
        boolean status = false;
        Usuario aux = null;
        Object obj = null;
        
        
        
        obj = ler();
        while(obj != null ){
            aux = (Usuario) obj;
          //  System.out.println(" teste aux "+aux.getNome());
            if(aux.getNome().equals(nome) && aux.getSenha().equals(senha)){
                status = true;
            }
            
           obj = ler();
           
        }
        fecharLeitor();
        return status;
        
       
    }
    
        //"ID","TIPO ","NOME", "EMAIL", "TELEFONE", "DOCUMENTO1", "DOCUMENTO2"
    public boolean excluirUsuario(String nome, String senha) throws FileNotFoundException, IOException{
        return true; 
        
    }
    public boolean novoArquivo(){
       
        return false;
        
    }
    
    
    
    public ArrayList listaUsuarios() throws IOException, ClassNotFoundException{
        this.listUsers = new ArrayList<>();
        lista = new ArrayList();
        
        Usuario user = null;
        
        Object obj = null;
       // leitor = criaLeitorBinario();
        obj = ler();
        while(obj != null){
            user = (Usuario) obj;
            
            System.out.println(" teste "+ user.getNome());
            this.listUsers.add(user);
            
            lista.add(new Object[]{user.getNome(), user.getSenha()});
            obj = ler();
        }
            
           
            
            
           
        
        fecharLeitor();
        
        return lista;
   
    }
    
    
   

   
    
}
