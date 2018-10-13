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
        if (name != null && !name.isEmpty() && name != "" && !name.trim().equals("")) {
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
    
    //Validação de matricula
    public static boolean validMatriculaNull (String matricula) {
        boolean valid = false;
        if (matricula != null && !matricula.isEmpty() && matricula != "" && !matricula.trim().equals("")) {
            valid = true;
        }
        return valid;
    }
    public static boolean validMatriculaOrientadorSize (String matricula) {
        boolean valid = false;
        matricula = FormatarDadosUtils.filtrarMatricula(matricula);
        if (matricula.length() == 7) {
            valid = true;
        }
        return valid;
    }
    public static boolean validMatriculaProjetistaSize (String matricula) {
        boolean valid = false;
        matricula = FormatarDadosUtils.filtrarMatricula(matricula);
        if (matricula.length() == 9) {
            valid = true;
        }
        return valid;
    }
    
    //Validação de cpf
    public static boolean validCpfNull (String cpf) {
        boolean valid = false;
        if (cpf != null && !cpf.isEmpty() && cpf != "" && !cpf.trim().equals("")) {
            valid = true;
        }
        return valid;
    }
    public static boolean validCpfSize (String cpf) {
        boolean valid = false;
        cpf = FormatarDadosUtils.filtrarCpf(cpf);
        if (cpf.length() == 11) {
            valid = true;
        }
        return valid;
    }
    
    //Validação de identidade
    public static boolean validIdentidadeNull (String identidade) {
        boolean valid = false;
        if (identidade != null && !identidade.isEmpty() && identidade != "" && !identidade.trim().equals("")) {
            valid = true;
        }
        return valid;
    }
    public static boolean validIdentidadeSize (String identidade) {
        boolean valid = false;
        identidade = FormatarDadosUtils.filtrarIdentidade(identidade);
        if (identidade.length() == 10) {
            valid = true;
        }
        return valid;
    }
    
    //Validação de telefone
    public static boolean validTelefoneNull (String telefone) {
        boolean valid = false;
        if (telefone != null && !telefone.isEmpty() && telefone != "" && !telefone.trim().equals("")) {
            valid = true;
        }
        return valid;
    }
    public static boolean validTelefoneSize (String telefone) {
        boolean valid = false;
        telefone = FormatarDadosUtils.filtrarTelefone(telefone);
        if (telefone.length() >= 10 && telefone.length() <= 11) {
            valid = true;
        }
        return valid;
    }
    
    //Validação de link curriculo Lattes

    //Validação de departamento
    public static boolean validDepartamentoNull (String departamento) {
        boolean valid = false;
        if (departamento != null && !departamento.isEmpty() && departamento != "" && !departamento.trim().equals("")) {
            valid = true;
        }
        return valid;
    }
    public static boolean validDepartamentoSize (String departamento) {
        boolean valid = false;
        if (departamento.length() >= 2 && departamento.length() <= 100) {
            valid = true;
        }
        return valid;
    }
    
    //Validação de Email
    public static boolean validEmailNull (String email) {
        boolean valid = false;
        if (email != null && !email.isEmpty() && email != "" && !email.trim().equals("")) {
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
        if (password != null && !password.isEmpty() && password != "" && !password.trim().equals("")) {
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
    
    //Validação de Conversão de String para Inteiro
    public static boolean validConvertStringToInt (String conv) {
        try {
            int inteiro = Integer.parseInt(conv);
        }catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    
    //Validação botão de radio null
    public static boolean validButtonRadioNull (String buttonRadio) {
        boolean valid = false;
        if (buttonRadio != null && !buttonRadio.isEmpty() && buttonRadio != "" && !buttonRadio.trim().equals("")) {
            valid = true;
        }
        return valid;
    }
    
    //Validação de campo de texto
    public static boolean validTextFieldNull (String textField) {
        boolean valid = false;
        if (textField != null && !textField.isEmpty() && textField != "" && !textField.trim().equals("")) {
            valid = true;
        }
        return valid;
    }
    public static boolean validTextFieldSize (String textField) {
        boolean valid = false;
        if (textField.length() <= 2000) {
            valid = true;
        }
        return valid;
    }
}
