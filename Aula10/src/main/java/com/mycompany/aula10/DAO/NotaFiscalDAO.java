package com.mycompany.aula10.DAO;

import com.mycompany.aula10.MODEL.NotaFiscal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author bruno.vrufino
 */
public class NotaFiscalDAO {
    public static boolean salvar(NotaFiscal obj){
        boolean retorno = false;
        Connection conexao = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/baseNotaFiscal";
            conexao = DriverManager.getConnection(url,"root","");
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO notaFiscal(numeroNota,valorNota,dataNota) VALUES(?,?,?)");
            
            comandoSQL.setInt(1,obj.getNumeroNota());
            comandoSQL.setDouble(2, obj.getValorNota());
            comandoSQL.setDate(3, new java.sql.Date(obj.getDataNota().getTime()));
            
            int linhasAfetadas = comandoSQL.executeUpdate();
            if(linhasAfetadas > 0){
                retorno = true;
            }
        }catch(ClassNotFoundException ex){
            retorno = false;
        }catch(SQLException ex){
            retorno = false;
        }
        return retorno;
    }
}
