/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arquivo;

import Controller.ControleCliente;
import Model.Cliente;
import Model.ItemVenda;
import Model.Produto;
import Model.Venda;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Luan
 */
public class ControleArquivoVenda extends ControleArquivo {
  
    String textolinha;
    protected Venda venda;
    protected ItemVenda itemVenda;
    ArrayList lista = null;
    ArrayList<Venda> listVendas = new ArrayList<Venda>();
    ArrayList<ItemVenda> listItens = null;
     
    
    
    
    public int contagemId() throws IOException{
       int i = 0;
        if(!getArquivo().exists()){
            return i;
        }
        Object obj=  null;
        Produto prod = null;
        Venda venda =null;
        obj = ler();
        while(obj != null){
            venda = (Venda) obj;
            i = venda.getIdVenda() +1;
            obj = ler();
            
        }
        
        fecharLeitor();
        
        return i;
        
    }
    
    
    public boolean gravarVendaArquivo(Venda venda, boolean append){
       boolean status = false;
       
       if(escrever(venda, append)){
           status = true;
       }
       
       
        return status;
    }
    
    public void listagemVendas(int id){
        listVendas = new ArrayList<>();
        Venda venda = null;
        venda = (Venda) ler();
        while(venda != null){
            if(venda.getIdcliente()==id){
                listVendas.add(venda);
            }
            
            venda = (Venda) ler();
        }
        
    }
    
    public ArrayList impressaoTabela() throws IOException{
        
        lista = new ArrayList();
       
        for(Venda v : listVendas){
            for(ItemVenda iv :v.getItens()){
                lista.add(new Object[]{v.getIdVenda(),iv.getItemProduto().getId(), 
                         iv.getItemProduto().getNome(), iv.getItemProduto().getDescricao(), iv.getQuantidade(),
                         iv.getValorItem(),v.getValortotal()});
            }
        }
        
        return lista;
        
    }
    
    
    
    

    
}
