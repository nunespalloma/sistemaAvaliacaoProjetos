/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uff.sistemaAvaliacaoProjetos.view;

import br.com.uff.sistemaAvaliacaoProjetos.controller.OrientadorController;
import br.com.uff.sistemaAvaliacaoProjetos.controller.ProjetistaController;
import br.com.uff.sistemaAvaliacaoProjetos.controller.ProjetoController;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Atividade;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Orientador;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Projetista;
import br.com.uff.sistemaAvaliacaoProjetos.model.entity.Projeto;
import br.com.uff.sistemaAvaliacaoProjetos.utils.FormatarDadosUtils;
import br.com.uff.sistemaAvaliacaoProjetos.utils.ValidUtils;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author palloma
 */
@WebServlet("/FormularioServlet")
public class FormularioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String idOrientadorString = req.getParameter("idOrientador");
        String idProjetoString = req.getParameter("idProjeto");
        String idProjetistaString = req.getParameter("idProjetista");
        String loginProjetista = req.getParameter("loginProjetista");
        String nomeProjetista = req.getParameter("nomeProjetista");
        String nomeProjeto = req.getParameter("nomeProjeto");
        String descricaoProjeto = req.getParameter("descricaoProjeto");
        String duracaoProjeto = req.getParameter("duracaoProjeto");
        String areaOrigem = req.getParameter("areaOrigem");
        String descricaoMultidisciplinar = req.getParameter("descricaoMultidisciplinar");
        String areaAtuacao = req.getParameter("areaAtuacao");
        String destinacao = req.getParameter("destinacao");
        String tipo = req.getParameter("tipo");
        String resultadosContinuacao = req.getParameter("resultadosContinuacao");
        String problema = req.getParameter("problema");
        String solucao = req.getParameter("solucao");
        String resumoCurriculoOrientador = req.getParameter("resumoCurriculoOrientador");
        String potencial = req.getParameter("potencial");
        String planoTrabalhoBolsista = req.getParameter("planoTrabalhoBolsista");
        int idProjeto = 0;
        int idOrientador = 0;
        int idProjetista = 0;
        Projeto projeto = new Projeto();
        Orientador orientador = new Orientador();
        Projetista projetista = new Projetista();
        List<Atividade> atividades = new ArrayList();
        boolean valid = true;
        String msgErroIdProjeto;
        String msgErroIdOrientador;
        String msgErroIdProjetista;
        String matriculaProjetistaStatus;
        String nomeProjetoStatus;
        String nomeProjetoMsgErro;
        String descricaoProjetoStatus;
        String descricaoProjetoMsgErro;
        String duracaoProjetoStatus;
        String duracaoProjetoMsgErro;
        String areaOrigemStatus;
        String areaOrigemMsgErro;        
        String descricaoMultidisciplinarStatus;
        String descricaoMultidisciplinarMsgErro;
        String areaAtuacaoStatus;
        String areaAtuacaoMsgErro;
        String destinacaoStatus;
        String destinacaoMsgErro;
        String tipoStatus;
        String tipoMsgErro;
        String resultadosContinuacaoStatus;
        String resultadosContinuacaoMsgErro;
        String problemaStatus;
        String problemaMsgErro;
        String solucaoStatus;
        String solucaoMsgErro;
        String resumoCurriculoOrientadorStatus;
        String resumoCurriculoOrientadorMsgErro;
        String potencialStatus;
        String potencialMsgErro;
        String planoTrabalhoBolsistaStatus;
        String planoTrabalhoBolsistaMsgErro;
        String graficoGanttStatus;
        String graficoGanttMsgErro;
        
        String atividade1Janeiro = req.getParameter("atividade1Janeiro");
        String atividade1Fevereiro = req.getParameter("atividade1Fevereiro");
        String atividade1Marco = req.getParameter("atividade1Marco");
        String atividade1Abril = req.getParameter("atividade1Abril");
        String atividade1Maio = req.getParameter("atividade1Maio");
        String atividade1Junho = req.getParameter("atividade1Junho");
        String atividade1Julho = req.getParameter("atividade1Julho");
        String atividade1Agosto = req.getParameter("atividade1Agosto");
        String atividade1Setembro = req.getParameter("atividade1Setembro");
        String atividade1Outubro = req.getParameter("atividade1Outubro");
        String atividade1Novembro = req.getParameter("atividade1Novembro");
        String atividade1Dezembro = req.getParameter("atividade1Dezembro");
        
        String atividade2Janeiro = req.getParameter("atividade2Janeiro");
        String atividade2Fevereiro = req.getParameter("atividade2Fevereiro");
        String atividade2Marco = req.getParameter("atividade2Marco");
        String atividade2Abril = req.getParameter("atividade2Abril");
        String atividade2Maio = req.getParameter("atividade2Maio");
        String atividade2Junho = req.getParameter("atividade2Junho");
        String atividade2Julho = req.getParameter("atividade2Julho");
        String atividade2Agosto = req.getParameter("atividade2Agosto");
        String atividade2Setembro = req.getParameter("atividade2Setembro");
        String atividade2Outubro = req.getParameter("atividade2Outubro");
        String atividade2Novembro = req.getParameter("atividade2Novembro");
        String atividade2Dezembro = req.getParameter("atividade2Dezembro");
        
        String atividade3Janeiro = req.getParameter("atividade3Janeiro");
        String atividade3Fevereiro = req.getParameter("atividade3Fevereiro");
        String atividade3Marco = req.getParameter("atividade3Marco");
        String atividade3Abril = req.getParameter("atividade3Abril");
        String atividade3Maio = req.getParameter("atividade3Maio");
        String atividade3Junho = req.getParameter("atividade3Junho");
        String atividade3Julho = req.getParameter("atividade3Julho");
        String atividade3Agosto = req.getParameter("atividade3Agosto");
        String atividade3Setembro = req.getParameter("atividade3Setembro");
        String atividade3Outubro = req.getParameter("atividade3Outubro");
        String atividade3Novembro = req.getParameter("atividade3Novembro");
        String atividade3Dezembro = req.getParameter("atividade3Dezembro");
        
        String atividade4Janeiro = req.getParameter("atividade4Janeiro");
        String atividade4Fevereiro = req.getParameter("atividade4Fevereiro");
        String atividade4Marco = req.getParameter("atividade4Marco");
        String atividade4Abril = req.getParameter("atividade4Abril");
        String atividade4Maio = req.getParameter("atividade4Maio");
        String atividade4Junho = req.getParameter("atividade4Junho");
        String atividade4Julho = req.getParameter("atividade4Julho");
        String atividade4Agosto = req.getParameter("atividade4Agosto");
        String atividade4Setembro = req.getParameter("atividade4Setembro");
        String atividade4Outubro = req.getParameter("atividade4Outubro");
        String atividade4Novembro = req.getParameter("atividade4Novembro");
        String atividade4Dezembro = req.getParameter("atividade4Dezembro");
        
        String atividade5Janeiro = req.getParameter("atividade5Janeiro");
        String atividade5Fevereiro = req.getParameter("atividade5Fevereiro");
        String atividade5Marco = req.getParameter("atividade5Marco");
        String atividade5Abril = req.getParameter("atividade5Abril");
        String atividade5Maio = req.getParameter("atividade5Maio");
        String atividade5Junho = req.getParameter("atividade5Junho");
        String atividade5Julho = req.getParameter("atividade5Julho");
        String atividade5Agosto = req.getParameter("atividade5Agosto");
        String atividade5Setembro = req.getParameter("atividade5Setembro");
        String atividade5Outubro = req.getParameter("atividade5Outubro");
        String atividade5Novembro = req.getParameter("atividade5Novembro");
        String atividade5Dezembro = req.getParameter("atividade5Dezembro");
        
        String atividade6Janeiro = req.getParameter("atividade6Janeiro");
        String atividade6Fevereiro = req.getParameter("atividade6Fevereiro");
        String atividade6Marco = req.getParameter("atividade6Marco");
        String atividade6Abril = req.getParameter("atividade6Abril");
        String atividade6Maio = req.getParameter("atividade6Maio");
        String atividade6Junho = req.getParameter("atividade6Junho");
        String atividade6Julho = req.getParameter("atividade6Julho");
        String atividade6Agosto = req.getParameter("atividade6Agosto");
        String atividade6Setembro = req.getParameter("atividade6Setembro");
        String atividade6Outubro = req.getParameter("atividade6Outubro");
        String atividade6Novembro = req.getParameter("atividade6Novembro");
        String atividade6Dezembro = req.getParameter("atividade6Dezembro");
        
        String atividade7Janeiro = req.getParameter("atividade7Janeiro");
        String atividade7Fevereiro = req.getParameter("atividade7Fevereiro");
        String atividade7Marco = req.getParameter("atividade7Marco");
        String atividade7Abril = req.getParameter("atividade7Abril");
        String atividade7Maio = req.getParameter("atividade7Maio");
        String atividade7Junho = req.getParameter("atividade7Junho");
        String atividade7Julho = req.getParameter("atividade7Julho");
        String atividade7Agosto = req.getParameter("atividade7Agosto");
        String atividade7Setembro = req.getParameter("atividade7Setembro");
        String atividade7Outubro = req.getParameter("atividade7Outubro");
        String atividade7Novembro = req.getParameter("atividade7Novembro");
        String atividade7Dezembro = req.getParameter("atividade7Dezembro");
        
        String atividade8Janeiro = req.getParameter("atividade8Janeiro");
        String atividade8Fevereiro = req.getParameter("atividade8Fevereiro");
        String atividade8Marco = req.getParameter("atividade8Marco");
        String atividade8Abril = req.getParameter("atividade8Abril");
        String atividade8Maio = req.getParameter("atividade8Maio");
        String atividade8Junho = req.getParameter("atividade8Junho");
        String atividade8Julho = req.getParameter("atividade8Julho");
        String atividade8Agosto = req.getParameter("atividade8Agosto");
        String atividade8Setembro = req.getParameter("atividade8Setembro");
        String atividade8Outubro = req.getParameter("atividade8Outubro");
        String atividade8Novembro = req.getParameter("atividade8Novembro");
        String atividade8Dezembro = req.getParameter("atividade8Dezembro");
        
        String atividade9Janeiro = req.getParameter("atividade9Janeiro");
        String atividade9Fevereiro = req.getParameter("atividade9Fevereiro");
        String atividade9Marco = req.getParameter("atividade9Marco");
        String atividade9Abril = req.getParameter("atividade9Abril");
        String atividade9Maio = req.getParameter("atividade9Maio");
        String atividade9Junho = req.getParameter("atividade9Junho");
        String atividade9Julho = req.getParameter("atividade9Julho");
        String atividade9Agosto = req.getParameter("atividade9Agosto");
        String atividade9Setembro = req.getParameter("atividade9Setembro");
        String atividade9Outubro = req.getParameter("atividade9Outubro");
        String atividade9Novembro = req.getParameter("atividade9Novembro");
        String atividade9Dezembro = req.getParameter("atividade9Dezembro");
        
        String atividade10Janeiro = req.getParameter("atividade10Janeiro");
        String atividade10Fevereiro = req.getParameter("atividade10Fevereiro");
        String atividade10Marco = req.getParameter("atividade10Marco");
        String atividade10Abril = req.getParameter("atividade10Abril");
        String atividade10Maio = req.getParameter("atividade10Maio");
        String atividade10Junho = req.getParameter("atividade10Junho");
        String atividade10Julho = req.getParameter("atividade10Julho");
        String atividade10Agosto = req.getParameter("atividade10Agosto");
        String atividade10Setembro = req.getParameter("atividade10Setembro");
        String atividade10Outubro = req.getParameter("atividade10Outubro");
        String atividade10Novembro = req.getParameter("atividade10Novembro");
        String atividade10Dezembro = req.getParameter("atividade10Dezembro");
        
        //Validação de idProjeto
        if (ValidUtils.validConvertStringToInt(idProjetoString) && !idProjetoString.equals("0")) {
            idProjeto = Integer.parseInt(idProjetoString);
            projeto.setId(idProjeto);
            projeto = ProjetoController.findProjeto(projeto);
        }else {
            projeto = new Projeto();
        }
        
        //Validação de idOrientador
        if (ValidUtils.validConvertStringToInt(idOrientadorString) && !idOrientadorString.equals("0")) {
            idOrientador = Integer.parseInt(idOrientadorString);
            orientador.setId(idOrientador);
            orientador = OrientadorController.findOrientador(orientador);
        }else {
            msgErroIdOrientador = "Erro na conversão do idOrientador".toUpperCase().trim();
            req.setAttribute("msgErroIdOrientador", msgErroIdOrientador);
            valid = false;
        }
        
        //Validação de idProjetista
        if (ValidUtils.validConvertStringToInt(idProjetistaString) && !idProjetistaString.equals("0")) {
            idProjetista = Integer.parseInt(idProjetistaString);
            projetista.setId(idProjetista);
            projetista = ProjetistaController.findProjetista(projetista);
            matriculaProjetistaStatus = "is-valid";
            req.setAttribute("matriculaProjetistaStatus", matriculaProjetistaStatus);
        }else {
            msgErroIdProjetista = "Matricula do projetista nula ou vazia".toUpperCase().trim();
            req.setAttribute("msgErroIdProjetista", msgErroIdProjetista);
            valid = false;
            matriculaProjetistaStatus = "is-invalid";
            req.setAttribute("matriculaProjetistaStatus", matriculaProjetistaStatus);
        }
        //Validação nomeProjeto
        if (ValidUtils.validNameNull(nomeProjeto)) {
            if (ValidUtils.validNameSize(nomeProjeto)) {
                nomeProjetoStatus = "is-valid";
                req.setAttribute("nomeProjetoStatus", nomeProjetoStatus);
                projeto.setNome(nomeProjeto.toUpperCase().trim());
            }else {
                valid = false;
                nomeProjetoStatus = "is-invalid";
                nomeProjetoMsgErro = "Tamanho do nome do projeto inválido.".toUpperCase();
                req.setAttribute("nomeProjetoStatus", nomeProjetoStatus);
                req.setAttribute("nomeProjetoMsgErro", nomeProjetoMsgErro);
            }
        }else {
            valid = false;
            nomeProjetoStatus = "is-invalid";
            nomeProjetoMsgErro = "Nome do projeto nulo ou vazio.".toUpperCase();
            req.setAttribute("nomeProjetoStatus", nomeProjetoStatus);
            req.setAttribute("nomeProjetoMsgErro", nomeProjetoMsgErro);
        }
        
        //Validação descrição do projeto
        if (ValidUtils.validTextFieldNull(descricaoProjeto)) {
            if (ValidUtils.validTextFieldSize(descricaoProjeto)) {
                descricaoProjetoStatus = "is-valid";
                req.setAttribute("descricaoProjetoStatus", descricaoProjetoStatus);
                projeto.setDescricao(descricaoProjeto.toUpperCase().trim());
            }else {
                valid = false;
                descricaoProjetoStatus = "is-invalid";
                descricaoProjetoMsgErro = "Tamanho do campo de texto para a descrição do projeto inválido.".toUpperCase();
                req.setAttribute("descricaoProjetoStatus", descricaoProjetoStatus);
                req.setAttribute("descricaoProjetoMsgErro", descricaoProjetoMsgErro);
            }
        }else {
            valid = false;
            descricaoProjetoStatus = "is-invalid";
            descricaoProjetoMsgErro = "Campo de texto para a descrição do projeto nulo ou vazio.".toUpperCase();
            req.setAttribute("descricaoProjetoStatus", descricaoProjetoStatus);
            req.setAttribute("descricaoProjetoMsgErro", descricaoProjetoMsgErro);
        }
        
        //Validação duração
        if (ValidUtils.validNameNull(duracaoProjeto)) {
            if (ValidUtils.validNameSize(duracaoProjeto)) {
                duracaoProjetoStatus = "is-valid";
                req.setAttribute("duracaoProjetoStatus", duracaoProjetoStatus);
                projeto.setDuracao(duracaoProjeto.toUpperCase().trim());
            }else {
                valid = false;
                duracaoProjetoStatus = "is-invalid";
                duracaoProjetoMsgErro = "Tamanho da duração do projeto inválido.".toUpperCase();
                req.setAttribute("duracaoProjetoStatus", duracaoProjetoStatus);
                req.setAttribute("duracaoProjetoMsgErro", duracaoProjetoMsgErro);
            }
        }else {
            valid = false;
            duracaoProjetoStatus = "is-invalid";
            duracaoProjetoMsgErro = "Duração do projeto nulo ou vazio.".toUpperCase();
            req.setAttribute("duracaoProjetoStatus", duracaoProjetoStatus);
            req.setAttribute("duracaoProjetoMsgErro", duracaoProjetoMsgErro);
        }
        
        //Validação areaOrigem
        if(ValidUtils.validButtonRadioNull(areaOrigem)) {
            areaOrigemStatus = "is-valid";
            req.setAttribute("areaOrigemStatus", areaOrigemStatus);
            projeto.setAreaOrigemProjeto(areaOrigem.toUpperCase().trim());
            if (areaOrigem.equals("MULTIDISCIPLINAR")) {
                //Validação descricaoMultidisciplinar
                if (ValidUtils.validNameNull(descricaoMultidisciplinar)) {
                    if (ValidUtils.validNameSize(descricaoMultidisciplinar)) {
                        descricaoMultidisciplinarStatus = "is-valid";
                        req.setAttribute("descricaoMultidisciplinarStatus", descricaoMultidisciplinarStatus);
                        projeto.setDescricaoMultidisciplinar(descricaoMultidisciplinar.toUpperCase().trim());
                    }else {
                        valid = false;
                        descricaoMultidisciplinarStatus = "is-invalid";
                        descricaoMultidisciplinarMsgErro = "Tamanho da descrição multidisciplinar inválido.".toUpperCase();
                        req.setAttribute("descricaoMultidisciplinarStatus", descricaoMultidisciplinarStatus);
                        req.setAttribute("descricaoMultidisciplinarMsgErro", descricaoMultidisciplinarMsgErro);
                    }
                }else {
                    valid = false;
                    descricaoMultidisciplinarStatus = "is-invalid";
                    descricaoMultidisciplinarMsgErro = "Descrição multidisciplinar nulo ou vazio.".toUpperCase();
                    req.setAttribute("descricaoMultidisciplinarStatus", descricaoMultidisciplinarStatus);
                    req.setAttribute("descricaoMultidisciplinarMsgErro", descricaoMultidisciplinarMsgErro);
                }
            }
            else {
                projeto.setDescricaoMultidisciplinar(null);
            }
        }else {
            valid = false;
            areaOrigemStatus = "is-invalid";
            areaOrigemMsgErro = "Area de origem nulo ou vazio.".toUpperCase();
            req.setAttribute("areaOrigemStatus", areaOrigemStatus);
            req.setAttribute("areaOrigemMsgErro", areaOrigemMsgErro);
        }
        
        //Validação areaAtuação
        if(ValidUtils.validButtonRadioNull(areaAtuacao)) {
            areaAtuacaoStatus = "is-valid";
            req.setAttribute("areaAtuacaoStatus", areaAtuacaoStatus);
            projeto.setAreaAtuacaoProjeto(areaAtuacao.toUpperCase().trim());
        }else {
            valid = false;
            areaAtuacaoStatus = "is-invalid";
            areaAtuacaoMsgErro = "Area de atuação nula ou vazio.".toUpperCase();
            req.setAttribute("areaAtuacaoStatus", areaAtuacaoStatus);
            req.setAttribute("areaAtuacaoMsgErro", areaAtuacaoMsgErro);
        }
        
        //Validação destinação
        if(ValidUtils.validButtonRadioNull(destinacao)) {
            destinacaoStatus = "is-valid";
            req.setAttribute("destinacaoStatus", destinacaoStatus);
            projeto.setDestinacaoProjeto(destinacao.toUpperCase().trim());
        }else {
            valid = false;
            destinacaoStatus = "is-invalid";
            destinacaoMsgErro = "Destinação nula ou vazio.".toUpperCase();
            req.setAttribute("destinacaoStatus", destinacaoStatus);
            req.setAttribute("destinacaoMsgErro", destinacaoMsgErro);
        }
        
        //Validação tipo
        if(ValidUtils.validButtonRadioNull(tipo)) {
            tipoStatus = "is-valid";
            req.setAttribute("tipoStatus", tipoStatus);
            projeto.setTipoProjeto(tipo.toUpperCase().trim());
            if (tipo.equals("CONTINUAÇÃO")) {
                //Validação resultadosContinuacao
                if (ValidUtils.validTextFieldNull(resultadosContinuacao)) {
                    if (ValidUtils.validTextFieldSize(resultadosContinuacao)) {
                        resultadosContinuacaoStatus = "is-valid";
                        req.setAttribute("resultadosContinuacaoStatus", resultadosContinuacaoStatus);
                        projeto.setResultadosContinuacaoProjeto(resultadosContinuacao.toUpperCase().trim());
                    }else {
                        valid = false;
                        resultadosContinuacaoStatus = "is-invalid";
                        resultadosContinuacaoMsgErro = "Tamanho dos resultados de continuação inválido.".toUpperCase();
                        req.setAttribute("resultadosContinuacaoStatus", resultadosContinuacaoStatus);
                        req.setAttribute("resultadosContinuacaoMsgErro", resultadosContinuacaoMsgErro);
                    }
                }else {
                    valid = false;
                    resultadosContinuacaoStatus = "is-invalid";
                    resultadosContinuacaoMsgErro = "Resultados de Continuação nulo ou vazio.".toUpperCase();
                    req.setAttribute("resultadosContinuacaoStatus", resultadosContinuacaoStatus);
                    req.setAttribute("resultadosContinuacaoMsgErro", resultadosContinuacaoMsgErro);
                }
            }else {
                projeto.setResultadosContinuacaoProjeto(null);
            }
        }else {
            valid = false;
            tipoStatus = "is-invalid";
            tipoMsgErro = "Tipo de projeto nulo ou vazio.".toUpperCase();
            req.setAttribute("tipoStatus", tipoStatus);
            req.setAttribute("tipoMsgErro", tipoMsgErro);
        }
        
        //Validação problema
        if (ValidUtils.validTextFieldNull(problema)) {
            if (ValidUtils.validTextFieldSize(problema)) {
                problemaStatus = "is-valid";
                req.setAttribute("problemaStatus", problemaStatus);
                projeto.setProblemaProjeto(problema.toUpperCase().trim());
            }else {
                valid = false;
                problemaStatus = "is-invalid";
                problemaMsgErro = "Tamanho do campo de texto para o problema inválido.".toUpperCase();
                req.setAttribute("problemaStatus", problemaStatus);
                req.setAttribute("problemaMsgErro", problemaMsgErro);
            }
        }else {
            valid = false;
            problemaStatus = "is-invalid";
            problemaMsgErro = "Campo de texto para o problema nulo ou vazio.".toUpperCase();
            req.setAttribute("problemaStatus", problemaStatus);
            req.setAttribute("problemaMsgErro", problemaMsgErro);
        }
        
        //Validação solução
        if (ValidUtils.validTextFieldNull(solucao)) {
            if (ValidUtils.validTextFieldSize(solucao)) {
                solucaoStatus = "is-valid";
                req.setAttribute("solucaoStatus", solucaoStatus);
                projeto.setSolucaoProjeto(solucao.toUpperCase().trim());
            }else {
                valid = false;
                solucaoStatus = "is-invalid";
                solucaoMsgErro = "Tamanho do campo de texto para a solução inválido.".toUpperCase();
                req.setAttribute("solucaoStatus", solucaoStatus);
                req.setAttribute("solucaoMsgErro", solucaoMsgErro);
            }
        }else {
            valid = false;
            solucaoStatus = "is-invalid";
            solucaoMsgErro = "Campo de texto para a solução nulo ou vazio.".toUpperCase();
            req.setAttribute("solucaoStatus", solucaoStatus);
            req.setAttribute("solucaoMsgErro", solucaoMsgErro);
        }
        
        //Validação resumoCurriculoOrientador
        if (ValidUtils.validTextFieldNull(resumoCurriculoOrientador)) {
            if (ValidUtils.validTextFieldSize(resumoCurriculoOrientador)) {
                resumoCurriculoOrientadorStatus = "is-valid";
                req.setAttribute("resumoCurriculoOrientadorStatus", resumoCurriculoOrientadorStatus);
                projeto.setResumoCurriculoOrientador(resumoCurriculoOrientador.toUpperCase().trim());
            }else {
                valid = false;
                resumoCurriculoOrientadorStatus = "is-invalid";
                resumoCurriculoOrientadorMsgErro = "Tamanho do campo de texto para o resumo do currículo do orientador inválido.".toUpperCase();
                req.setAttribute("resumoCurriculoOrientadorStatus", resumoCurriculoOrientadorStatus);
                req.setAttribute("resumoCurriculoOrientadorMsgErro", resumoCurriculoOrientadorMsgErro);
            }
        }else {
            valid = false;
            resumoCurriculoOrientadorStatus = "is-invalid";
            resumoCurriculoOrientadorMsgErro = "Campo de texto para o resumo do currículo do orientador nulo ou vazio.".toUpperCase();
            req.setAttribute("resumoCurriculoOrientadorStatus", resumoCurriculoOrientadorStatus);
            req.setAttribute("resumoCurriculoOrientadorMsgErro", resumoCurriculoOrientadorMsgErro);
        }
        
        //Validação potencial
        if (ValidUtils.validTextFieldNull(potencial)) {
            if (ValidUtils.validTextFieldSize(potencial)) {
                potencialStatus = "is-valid";
                req.setAttribute("potencialStatus", potencialStatus);
                projeto.setPotencialProjeto(potencial.toUpperCase().trim());
            }else {
                valid = false;
                potencialStatus = "is-invalid";
                potencialMsgErro = "Tamanho do campo de texto para o potencial inválido.".toUpperCase();
                req.setAttribute("potencialStatus", potencialStatus);
                req.setAttribute("potencialMsgErro", potencialMsgErro);
            }
        }else {
            valid = false;
            potencialStatus = "is-invalid";
            potencialMsgErro = "Campo de texto para o potencial nulo ou vazio.".toUpperCase();
            req.setAttribute("potencialStatus", potencialStatus);
            req.setAttribute("potencialMsgErro", potencialMsgErro);
        }
        
        //Validação planoTrabalhoBolsista
        if (ValidUtils.validTextFieldNull(planoTrabalhoBolsista)) {
            if (ValidUtils.validTextFieldSize(planoTrabalhoBolsista)) {
                planoTrabalhoBolsistaStatus = "is-valid";
                req.setAttribute("planoTrabalhoBolsistaStatus", planoTrabalhoBolsistaStatus);
                planoTrabalhoBolsista = planoTrabalhoBolsista.toUpperCase().trim();
                projeto.setPlanoTrabalhoBolsista(planoTrabalhoBolsista);
            }else {
                valid = false;
                planoTrabalhoBolsistaStatus = "is-invalid";
                planoTrabalhoBolsistaMsgErro = "Tamanho do campo de texto para o plano de trabalho do bolsista inválido.".toUpperCase();
                req.setAttribute("planoTrabalhoBolsistaStatus", planoTrabalhoBolsistaStatus);
                req.setAttribute("planoTrabalhoBolsistaMsgErro", planoTrabalhoBolsistaMsgErro);
            }
        }else {
            valid = false;
            planoTrabalhoBolsistaStatus = "is-invalid";
            planoTrabalhoBolsistaMsgErro = "Campo de texto para o plano de trabalho do bolsista nulo ou vazio.".toUpperCase();
            req.setAttribute("planoTrabalhoBolsistaStatus", planoTrabalhoBolsistaStatus);
            req.setAttribute("planoTrabalhoBolsistaMsgErro", planoTrabalhoBolsistaMsgErro);
        }
        
        //Validação do gráfico de gantt
        Atividade at1 = new Atividade("ATIVIDADE 1", FormatarDadosUtils.verificaCampoGraficoGantt(atividade1Janeiro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade1Fevereiro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade1Marco),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade1Abril),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade1Maio),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade1Junho),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade1Julho),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade1Agosto),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade1Setembro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade1Outubro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade1Novembro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade1Dezembro),
                projeto);
        
        Atividade at2 = new Atividade("ATIVIDADE 2", FormatarDadosUtils.verificaCampoGraficoGantt(atividade2Janeiro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade2Fevereiro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade2Marco),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade2Abril),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade2Maio),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade2Junho),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade2Julho),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade2Agosto),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade2Setembro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade2Outubro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade2Novembro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade2Dezembro),
                projeto);
        
        Atividade at3 = new Atividade("ATIVIDADE 3", FormatarDadosUtils.verificaCampoGraficoGantt(atividade3Janeiro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade3Fevereiro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade3Marco),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade3Abril),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade3Maio),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade3Junho),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade3Julho),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade3Agosto),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade3Setembro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade3Outubro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade3Novembro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade3Dezembro),
                projeto);
        
        Atividade at4 = new Atividade("ATIVIDADE 4", FormatarDadosUtils.verificaCampoGraficoGantt(atividade4Janeiro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade4Fevereiro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade4Marco),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade4Abril),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade4Maio),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade4Junho),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade4Julho),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade4Agosto),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade4Setembro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade4Outubro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade4Novembro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade4Dezembro),
                projeto);
        
        Atividade at5 = new Atividade("ATIVIDADE 5", FormatarDadosUtils.verificaCampoGraficoGantt(atividade5Janeiro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade5Fevereiro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade5Marco),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade5Abril),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade5Maio),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade5Junho),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade5Julho),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade5Agosto),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade5Setembro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade5Outubro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade5Novembro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade5Dezembro),
                projeto);
        
        Atividade at6 = new Atividade("ATIVIDADE 6", FormatarDadosUtils.verificaCampoGraficoGantt(atividade6Janeiro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade6Fevereiro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade6Marco),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade6Abril),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade6Maio),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade6Junho),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade6Julho),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade6Agosto),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade6Setembro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade6Outubro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade6Novembro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade6Dezembro),
                projeto);
        
        Atividade at7 = new Atividade("ATIVIDADE 7", FormatarDadosUtils.verificaCampoGraficoGantt(atividade7Janeiro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade7Fevereiro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade7Marco),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade7Abril),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade7Maio),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade7Junho),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade7Julho),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade7Agosto),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade7Setembro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade7Outubro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade7Novembro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade7Dezembro),
                projeto);
        
        Atividade at8 = new Atividade("ATIVIDADE 8", FormatarDadosUtils.verificaCampoGraficoGantt(atividade8Janeiro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade8Fevereiro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade8Marco),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade8Abril),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade8Maio),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade8Junho),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade8Julho),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade8Agosto),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade8Setembro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade8Outubro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade8Novembro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade8Dezembro),
                projeto);
        
        Atividade at9 = new Atividade("ATIVIDADE 9", FormatarDadosUtils.verificaCampoGraficoGantt(atividade9Janeiro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade9Fevereiro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade9Marco),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade9Abril),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade9Maio),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade9Junho),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade9Julho),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade9Agosto),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade9Setembro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade9Outubro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade9Novembro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade9Dezembro),
                projeto);
        
        Atividade at10 = new Atividade("ATIVIDADE 10", FormatarDadosUtils.verificaCampoGraficoGantt(atividade10Janeiro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade10Fevereiro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade10Marco),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade10Abril),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade10Maio),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade10Junho),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade10Julho),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade10Agosto),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade10Setembro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade10Outubro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade10Novembro),
                FormatarDadosUtils.verificaCampoGraficoGantt(atividade10Dezembro),
                projeto);
        
        atividades.add(at1);
        atividades.add(at2);
        atividades.add(at3);
        atividades.add(at4);
        atividades.add(at5);
        atividades.add(at6);
        atividades.add(at7);
        atividades.add(at8);
        atividades.add(at9);
        atividades.add(at10);
        int atividadePorMes = 0;
        for (int i = 0; i < atividades.size(); i++) {
            if (atividades.get(i).isJaneiro()) {
                atividadePorMes++;
                break;
            }
        }
        for (int i = 0; i < atividades.size(); i++) {
            if (atividades.get(i).isFevereiro()) {
                atividadePorMes++;
                break;
            }
        }
        for (int i = 0; i < atividades.size(); i++) {
            if (atividades.get(i).isMarco()) {
                atividadePorMes++;
                break;
            }
        }
        for (int i = 0; i < atividades.size(); i++) {
            if (atividades.get(i).isAbril()) {
                atividadePorMes++;
                break;
            }
        }
        for (int i = 0; i < atividades.size(); i++) {
            if (atividades.get(i).isMaio()) {
                atividadePorMes++;
                break;
            }
        }
        for (int i = 0; i < atividades.size(); i++) {
            if (atividades.get(i).isJunho()) {
                atividadePorMes++;
                break;
            }
        }
        for (int i = 0; i < atividades.size(); i++) {
            if (atividades.get(i).isJulho()) {
                atividadePorMes++;
                break;
            }
        }
        for (int i = 0; i < atividades.size(); i++) {
            if (atividades.get(i).isAgosto()) {
                atividadePorMes++;
                break;
            }
        }
        for (int i = 0; i < atividades.size(); i++) {
            if (atividades.get(i).isSetembro()) {
                atividadePorMes++;
                break;
            }
        }
        for (int i = 0; i < atividades.size(); i++) {
            if (atividades.get(i).isOutubro()) {
                atividadePorMes++;
                break;
            }
        }
        for (int i = 0; i < atividades.size(); i++) {
            if (atividades.get(i).isNovembro()) {
                atividadePorMes++;
                break;
            }
        }
        for (int i = 0; i < atividades.size(); i++) {
            if (atividades.get(i).isDezembro()) {
                atividadePorMes++;
                break;
            }
        }
        if (atividadePorMes == 12) {
            graficoGanttStatus = "is-valid";
            req.setAttribute("graficoGanttStatus", graficoGanttStatus);
        }else {
            valid = false;
            graficoGanttStatus = "is-invalid";
            graficoGanttMsgErro = "O projetista deve ficar responsável por pelo menos uma atividade por mês.".toUpperCase();
            req.setAttribute("graficoGanttStatus", graficoGanttStatus);
            req.setAttribute("graficoGanttMsgErro", graficoGanttMsgErro);
        }
        
        if (ValidUtils.validConvertStringToInt(idProjetoString) && !idProjetoString.equals("0")) {
            for (int i = 0; i < projeto.getAtividades().size(); i++) {
                for (int j = 0; j < atividades.size(); j++) {
                    if (projeto.getAtividades().get(i).getNome().equals(atividades.get(j).getNome())) {
                        projeto.getAtividades().get(i).setJaneiro(atividades.get(j).isJaneiro());
                        projeto.getAtividades().get(i).setFevereiro(atividades.get(j).isFevereiro());
                        projeto.getAtividades().get(i).setMarco(atividades.get(j).isMarco());
                        projeto.getAtividades().get(i).setAbril(atividades.get(j).isAbril());
                        projeto.getAtividades().get(i).setMaio(atividades.get(j).isMaio());
                        projeto.getAtividades().get(i).setJunho(atividades.get(j).isJunho());
                        projeto.getAtividades().get(i).setJulho(atividades.get(j).isJulho());
                        projeto.getAtividades().get(i).setAgosto(atividades.get(j).isAgosto());
                        projeto.getAtividades().get(i).setSetembro(atividades.get(j).isSetembro());
                        projeto.getAtividades().get(i).setOutubro(atividades.get(j).isOutubro());
                        projeto.getAtividades().get(i).setNovembro(atividades.get(j).isNovembro());
                        projeto.getAtividades().get(i).setDezembro(atividades.get(j).isDezembro());
                        break;
                    }
                }
            }
        }else {
            projeto.setAtividades(atividades);
        }
        if(valid) {
            projeto.setOrientador(orientador);
            projeto.setProjetista(projetista);
            try {
                if (ValidUtils.validConvertStringToInt(idProjetoString) && !idProjetoString.equals("0")) {
                    //ProjetoController.updateProjeto(projeto);
                }else {
                    //ProjetoController.insertProjeto(projeto);
                    orientador.getProjetos().add(projeto);
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
            if (loginProjetista.equals("true")) {
                projetista = ProjetistaController.findProjetista(projetista);
                req.setAttribute("projetista", projetista);
                req.getRequestDispatcher("Projetista.jsp").forward(req, resp);
            }else {
                orientador = OrientadorController.findOrientador(orientador);
                req.setAttribute("orientador", orientador);
                req.getRequestDispatcher("Orientador.jsp").forward(req, resp);
            }
            
        }else {
            //reportar erro dispachando para a jsp.
            req.setAttribute("orientador", orientador);
            req.setAttribute("projeto", projeto);
            req.setAttribute("loginProjetista", loginProjetista);
            req.getRequestDispatcher("Formulario.jsp").forward(req, resp);
        }
    }
    
}
