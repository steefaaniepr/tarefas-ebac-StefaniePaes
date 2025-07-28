package br.com.stpaes;

import br.com.stpaes.dao.ClienteMapDAO;
import br.com.stpaes.dao.IClienteDAO;
import br.com.stpaes.domain.Cliente;

import javax.swing.*;

public class App {

    private static IClienteDAO iClienteDAO;

    public static void main(String[] args) {
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para Cadastrar, 2 para Consultar, 3 para Exclusão, 4 para alteração e 5 para Sair" ,
                "Cadastro", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }

            opcao = JOptionPane.showInputDialog(null,
                    "Opção Inválida! Digite 1 para Cadastrar, 2 para Consultar, 3 para Exclusão, 4 para alteração e 5 para Sair" ,
                    "Opção Inválida", JOptionPane.INFORMATION_MESSAGE);
        }
        
        while (isOpcaoValida(opcao)) {
            if (isOpcaoSair(opcao)) {
                sair();
            } else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separados por vírgula, conforme exemplo: Nome, Cpf, Telefone, Endereço, Número, Cidade, Estado.",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if (isConsultar(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o CPF: ",
                        "Consulta", JOptionPane.INFORMATION_MESSAGE);
                Consultar(dados);
            } else if (isExcluir(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o CPF: ",
                        "Excluir", JOptionPane.INFORMATION_MESSAGE);
                excluir(dados);
            } else {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separados por vígula, conforme exemplo: Nome, CPF, Telefone, Número, Endereço, Cidade e Estado",
                        "Atualização", JOptionPane.INFORMATION_MESSAGE);
                atualizar(dados);
            }

            opcao = JOptionPane.showInputDialog(null,
                    "Opção Inválida! Digite 1 para Cadastrar, 2 para Consultar, 3 para Exclusão, 4 para alteração e 5 para Sair" ,
                    "Opção Inválida", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void atualizar(String dados) {
        String[] dadosCadastrados = dados.split(",");
        Cliente cliente = new Cliente(dadosCadastrados[0],dadosCadastrados[1],dadosCadastrados[2],dadosCadastrados[3],dadosCadastrados[4],dadosCadastrados[5],dadosCadastrados[6]);
        iClienteDAO.alterar(cliente);
    }

    private static void excluir(String dados) {
        iClienteDAO.excluir(Long.parseLong(dados));
        JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso! ",
                "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }


    private static void Consultar(String dados) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null) {
            JOptionPane.showMessageDialog(null, "Cliente encontrado: " + cliente.toString(),
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado: ",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }

    }


    private static void cadastrar(String dados) {
        String [] dadosCadastrados = dados.split(",");
        Cliente cliente = new Cliente(dadosCadastrados[0],dadosCadastrados[1],dadosCadastrados[2],dadosCadastrados[3],dadosCadastrados[4],dadosCadastrados[5], dadosCadastrados[6]);
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
        if (isCadastrado) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente já cadastrado no sistema!",
                    "Encontrado", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isExcluir(String opcao) {
        if ("3".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isConsultar(String opcao) {
        if ("2".equals(opcao)) {
            return true;
        }
        return false;
    }


    private static boolean isCadastro(String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }
        return false;
    }


    private static boolean isOpcaoSair(String opcao) {
        if ("5".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void sair() {
        String clientesCadastrados = "";
        for (Cliente cliente : iClienteDAO.buscarTodos()) {
            clientesCadastrados += cliente.toString() + "\n";
        }

        JOptionPane.showMessageDialog(null, "Até Logo" + clientesCadastrados, "Até logo",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) || "2".equals(opcao)
                || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)) {
            return true;
        }
        return false;
    }
}
