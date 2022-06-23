/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Arquivo.ControleArquivoUsuario;
import Model.Usuario;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *
 * @author Luan
 */
public class ControleUsuario extends ControleArquivoUsuario{
        
    ArrayList listUser = new ArrayList<>();
   // protected Usuario user;
    
    public ControleUsuario(){
        String dir = System.getProperty("user.dir");
        String nome = dir+"/Dados/Usuarios.bin";
        setArquivo(nome);
        
        if(!getArquivo().exists()){
            criarUsuario("admin", "admin");
            gravarUsuario(true);
        }
        
            
        
    }
    
    public void criarUsuario(String nome, String senha) {
        user = new Usuario(nome, senha);
    }
    
    public boolean gravarUsuario(boolean append){
        if(escrever(user,append)){
            JOptionPane.showMessageDialog(null, "Usuario gravado no arquivo com sucesso");
            return true;
        }
        return false;
    }
    
    public boolean verificarUsuario(String nome, String senha) throws FileNotFoundException, IOException, ClassNotFoundException{
        
        System.out.println(" teste chegou aqui");
        if(buscarUsuario(nome, senha) == true){
            System.out.println(" teste passou aqui");
            return true;
        }else return false;
    }
    
    
    

}
