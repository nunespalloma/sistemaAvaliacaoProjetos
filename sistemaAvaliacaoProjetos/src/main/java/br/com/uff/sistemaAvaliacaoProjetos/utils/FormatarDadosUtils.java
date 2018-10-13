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
        if(identidade.contains("-")) {
            identidade = identidade.replace("-", "");
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
    
    public static String formatarCpf(String cpf) {
        if (cpf != null && cpf.trim().length() > 0) {
            StringBuilder cpfFormatado = new StringBuilder();
            try {
                cpfFormatado.append(cpf.charAt(0));
                cpfFormatado.append(cpf.charAt(1));
                cpfFormatado.append(cpf.charAt(2));
                cpfFormatado.append(".");
                cpfFormatado.append(cpf.charAt(3));
                cpfFormatado.append(cpf.charAt(4));
                cpfFormatado.append(cpf.charAt(5));
                cpfFormatado.append(".");
                cpfFormatado.append(cpf.charAt(6));
                cpfFormatado.append(cpf.charAt(7));
                cpfFormatado.append(cpf.charAt(8));
                cpfFormatado.append("-");
                cpfFormatado.append(cpf.charAt(9));
                cpfFormatado.append(cpf.charAt(10));
                
            } catch (IndexOutOfBoundsException e) {
                return cpf;
            }
            return cpfFormatado.toString();
        } else {
            return cpf;
        }
    }
    
    public static String formatarIdentidade(String identidade) {
        if (identidade != null && identidade.trim().length() > 0) {
            StringBuilder identidadeFormatado = new StringBuilder();
            try {
                identidadeFormatado.append(identidade.charAt(0));
                identidadeFormatado.append(identidade.charAt(1));
                identidadeFormatado.append(".");
                identidadeFormatado.append(identidade.charAt(2));
                identidadeFormatado.append(identidade.charAt(3));
                identidadeFormatado.append(identidade.charAt(4));
                identidadeFormatado.append(".");
                identidadeFormatado.append(identidade.charAt(5));
                identidadeFormatado.append(identidade.charAt(6));
                identidadeFormatado.append(identidade.charAt(7));
                identidadeFormatado.append("-");
                identidadeFormatado.append(identidade.charAt(8));
                
            } catch (IndexOutOfBoundsException e) {
                return identidade;
            }
            return identidadeFormatado.toString();
        } else {
            return identidade;
        }
    }
    
    public static String formatarTelefone(String telefone) {
        if (telefone != null && telefone.trim().length() > 0) {
            if (telefone.length() == 10) {
                StringBuilder telefoneFormatado = new StringBuilder();
                try {
                    telefoneFormatado.append("(");
                    telefoneFormatado.append(telefone.charAt(0));
                    telefoneFormatado.append(telefone.charAt(1));
                    telefoneFormatado.append(")");
                    telefoneFormatado.append(telefone.charAt(2));
                    telefoneFormatado.append(telefone.charAt(3));
                    telefoneFormatado.append(telefone.charAt(4));
                    telefoneFormatado.append(telefone.charAt(5));
                    telefoneFormatado.append("-");
                    telefoneFormatado.append(telefone.charAt(6));
                    telefoneFormatado.append(telefone.charAt(7));
                    telefoneFormatado.append(telefone.charAt(8));
                    telefoneFormatado.append(telefone.charAt(9));
                } catch (IndexOutOfBoundsException e) {
                    return telefone;
                }
                return telefoneFormatado.toString();
            }else {
                StringBuilder telefoneFormatado = new StringBuilder();
                try {
                    telefoneFormatado.append("(");
                    telefoneFormatado.append(telefone.charAt(0));
                    telefoneFormatado.append(telefone.charAt(1));
                    telefoneFormatado.append(")");
                    telefoneFormatado.append(telefone.charAt(2));
                    telefoneFormatado.append(telefone.charAt(3));
                    telefoneFormatado.append(telefone.charAt(4));
                    telefoneFormatado.append(telefone.charAt(5));
                    telefoneFormatado.append(telefone.charAt(6));
                    telefoneFormatado.append("-");
                    telefoneFormatado.append(telefone.charAt(7));
                    telefoneFormatado.append(telefone.charAt(8));
                    telefoneFormatado.append(telefone.charAt(9));
                    telefoneFormatado.append(telefone.charAt(10));
                } catch (IndexOutOfBoundsException e) {
                    return telefone;
                }
                return telefoneFormatado.toString();
            }
        } else {
            return telefone;
        }
    }
}
