/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.utils;

/**
 * Classe de utilidade para validação de dados.
 * @author pallo
 * @version 1.0
 */
public class ValidUtils {
    
    //Validação de nome
    public static boolean validNameNull (String name) {
        boolean valid = false;
        if (!name.isEmpty() && name != null && name != "" && !name.trim().equals("")) {
            valid = true;
        }
        return valid;
    }
    public static boolean validNameSize (String name) {
        boolean valid = false;
        if (name.length() >= 2 && name.length() <= 100) {
            valid = true;
        }
        return valid;
    }
    
    //Validação de Email
    public static boolean validEmailNull (String email) {
        boolean valid = false;
        if (!email.isEmpty() && email != null && email != "" && !email.trim().equals("")) {
            valid = true;
        }
        return valid;
    }
    public static boolean validEmailSize (String email) {
        boolean valid = false;
        if (email.length() >= 2 && email.length() <= 100) {
            valid = true;
        }
        return valid;
    }
    public static boolean validEmail (String email) {
        boolean valid = false;
        if (email.contains("@") && email.contains(".")) {
            valid = true;
        }
        return valid;
    }
    
    //Validação de senha
    public static boolean validPasswordNull (String password) {
        boolean valid = false;
        if (!password.isEmpty() && password != null && password != "" && !password.trim().equals("")) {
            valid = true;
        }
        return valid;
    }
    public static boolean validPasswordSize (String password) {
        boolean valid = false;
        if (password.length() >= 8) {
            valid = true;
        }
        return valid;
    }
}
