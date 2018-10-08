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
    
    //Validação de matricula
    public static boolean validMatriculaNull (String matricula) {
        boolean valid = false;
        if (!matricula.isEmpty() && matricula != null && matricula != "" && !matricula.trim().equals("")) {
            valid = true;
        }
        return valid;
    }
    public static boolean validMatriculaSize (String matricula) {
        boolean valid = false;
        matricula = FormatarDadosUtils.filtrarMatricula(matricula);
        if (matricula.length() >= 2 && matricula.length() <= 100) {
            valid = true;
        }
        return valid;
    }
    
    //Validação de cpf
    public static boolean validCpfNull (String cpf) {
        boolean valid = false;
        if (!cpf.isEmpty() && cpf != null && cpf != "" && !cpf.trim().equals("")) {
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
        if (!identidade.isEmpty() && identidade != null && identidade != "" && !identidade.trim().equals("")) {
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
        if (!telefone.isEmpty() && telefone != null && telefone != "" && !telefone.trim().equals("")) {
            valid = true;
        }
        return valid;
    }
    public static boolean validTelefoneSize (String telefone) {
        boolean valid = false;
        telefone = FormatarDadosUtils.filtrarTelefone(telefone);
        if (telefone.length() >= 8 && telefone.length() <= 13) {
            valid = true;
        }
        return valid;
    }
    
    //Validação de link curriculo Lattes

    //Validação de departamento
    public static boolean validDepartamentoNull (String departamento) {
        boolean valid = false;
        if (!departamento.isEmpty() && departamento != null && departamento != "" && !departamento.trim().equals("")) {
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
