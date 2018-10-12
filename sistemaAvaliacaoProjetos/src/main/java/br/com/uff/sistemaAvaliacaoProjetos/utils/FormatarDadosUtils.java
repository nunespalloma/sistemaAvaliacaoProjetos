/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.utils;

/**
 *
 * @author pallo
 */
public class FormatarDadosUtils {
    
    public static String filtrarMatricula (String matricula) {
        if (matricula.contains(".")) {
            matricula = matricula.replace(".", "");
        }
        if(matricula.contains("-")) {
            matricula = matricula.replace("-", "");
        }
        return matricula;
    }
    
    public static String filtrarCpf (String cpf) {
        if (cpf.contains(".")) {
            cpf = cpf.replace(".", "");
        }
        if(cpf.contains("-")) {
            cpf = cpf.replace("-", "");
        }
        return cpf;
    }
    
    public static String filtrarIdentidade (String identidade) {
        if (identidade.contains(".")) {
            identidade = identidade.replace(".", "");
        }
        return identidade;
    }
    
    public static String filtrarTelefone (String telefone) {
        if (telefone.contains("(")) {
            telefone = telefone.replace("(", "");
        }
        if (telefone.contains(")")) {
            telefone = telefone.replace(")", "");
        }
        if(telefone.contains("-")) {
            telefone = telefone.replace("-", "");
        }
        return telefone;
    }
    
    public static boolean verificaCampoGraficoGantt (String campo) {
        if (campo == null) {
            return false;
        }else {
            return true;
        }
    }
}
