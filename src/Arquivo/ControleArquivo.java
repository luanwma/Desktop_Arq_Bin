/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arquivo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Luan
 */
public abstract class ControleArquivo {
    protected File arquivo = null;
    private String nomeArquivo = null;
   
    
    public ObjectOutputStream escritor = null;
    public ObjectInputStream leitor = null;
    
    
    public void setArquivo(String nomearquivo) {
       this.nomeArquivo = nomearquivo;
       this.arquivo = new File(nomearquivo);
       
    }
   
    
   
    public File getArquivo(){
        return arquivo;
    }
    
    
    
    //classe interna anonima é quando na instanciação da classe abre {} para desenvolver 
        //funcionalidade extra na classe instanciada 
        //a cada gravação a classe grava um cabeçalho por isso nao sendo possivel buscar o proximo 
        //sobreescreva o metodo writeStreamHeader() deixando o vazio para nao gravar o 
        //cabeçalho nas gravações quando o arquivo ja existir
        /* outra forma de alterar
        
        public class MeuObjectOutputStream extends ObjectOutputStream{
            MeuObjectOutputStream() throws IOException{
                super(); aqui referencio a classe original 
            }
            MeuObjectOutputStream(OutputStream obj) throws IOException{
                super(obj); aqui referencio a classe original 
            }
            public void writeStreamHeader() throws IOException{
                return;
            }
        }
        essa classe é instanciada  no momento de gravar quando o arquivo já existir
        
        MeuObjectOutputStream xxx = null;
        xxx = new MeuObjectOutputStream(obj do fileoutputstream) 
        xxx.writeObject(obj pra gravar);
              
        
        
        */
    public  ObjectOutputStream criaEscritorBinario(boolean append ) {
        
        try {
            
            if(getArquivo().exists()){
                FileOutputStream fileOut = new FileOutputStream(getArquivo(), append);
                escritor = new ObjectOutputStream(fileOut){
                    int i = 0 ;
                    
                    @Override
                    protected void writeStreamHeader(){
                        
                    } 
                }; 
            }
            else{
                FileOutputStream fileOut = new FileOutputStream(getArquivo(), append);
                escritor = new ObjectOutputStream(fileOut);
            }
            
            
        } catch (IOException erro) {
            System.out.println("Erro ao criar escritor. " + erro);
        }
        return escritor;
    }

    public  ObjectInputStream criaLeitorBinario( ) {
        
        try {
            leitor = new ObjectInputStream(new FileInputStream(getArquivo()) );
            
            //file = new FileInputStream(getArquivo());
            //leitor = new ObjectInputStream(file);
            
        } catch (IOException erro) {
            System.out.println("Erro ao ler arquivo. " + erro);
        }
        return leitor;
    }
    
    public boolean escrever( Object objeto , boolean append)  {
        try{
            escritor = criaEscritorBinario(append);
            escritor.writeObject(objeto);
            escritor.close();
            return true;
        }catch(IOException erro){
            System.out.println("erro na escrita do objeto "+erro);
            return false;
        }
    
    }
    
    public Object ler(){
        
        Object obj = null;
        
        try{
            if(leitor == null){
                leitor = criaLeitorBinario();
            }
            
            obj = leitor.readObject();
            
        }catch(EOFException erro){
            System.out.println(" fim do arquivo ");
        }catch(IOException erro){
            System.out.println("erro de leitura "+erro);
            return null;
        }catch(ClassNotFoundException erro){
            System.out.println("erro de classe nao encontrada "+erro);
            return null;
        }finally{
            return obj;
        }
    }
    
    public void fecharLeitor(){
        try{
            if(leitor != null){
                leitor.close();
            }
            
        
        }catch(IOException erro){
            System.out.println("erro "+erro);
        }
    }
    
    
    
}
