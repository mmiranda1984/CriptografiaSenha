/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lusano.criptografiadesenha.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author mmiranda1984
 */
public class CriptografiaSenha {

    public static String criptografarSenha(String senha) throws Exception{
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            md.update(senha.getBytes());
            BigInteger hash = new BigInteger(1, md.digest());
            String retornaSenha = hash.toString(16);
            return retornaSenha;			
        } catch (NoSuchAlgorithmException e) {
            throw new Exception(e.getMessage());
        }
    }
    
    public static String obterNovaSenhaCriptografada(){
	int i = 100000 + (int)(Math.random() * 100000); 
        return String.valueOf(i);
    }
    
}
