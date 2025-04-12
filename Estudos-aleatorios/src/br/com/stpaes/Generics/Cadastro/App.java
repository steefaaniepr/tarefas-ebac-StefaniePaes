package br.com.stpaes.Generics.Cadastro;

import br.com.stpaes.Generics.Cadastro.Dao.ClienteMapDAO;
import br.com.stpaes.Generics.Cadastro.Dao.IClienteDAO;
import br.com.stpaes.Generics.Cadastro.Domain.Cliente;

import javax.swing.*;

public class App {

    private static IClienteDAO iClienteDAO;

    public static void main(String[] args) {
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null, "Digite 1 para cadastro, 2 para consultar, 3 para excluir, 4 para alterar ou 5 para Sair",
                "Cadastro", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null, "Opção Inválida! Digite 1 para cadastrar, 2 para consultar, 3 para excluir, 4 para alterar ou 5 para Sair.",
                    "Green dinner", JOptionPane.INFORMATION_MESSAGE);
        }

        while (isOpcaoValida(opcao)) {
            if (isOpcaoSair(opcao)) {
                sair();
            } else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separados por vígula, conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if (isConsultar(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o cpf",
                        "Consultar", JOptionPane.INFORMATION_MESSAGE);

                consultar(dados);
            } else if (isExcluir(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o CPF do cliente que deseja excluir", "Excluir", JOptionPane.INFORMATION_MESSAGE);

                excluir(dados);
            } else if (isAtualizar(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o CPF do cliente que deseja atualizar", "Atualizar", JOptionPane.INFORMATION_MESSAGE);

                atualizar(dados);
            }

            opcao = JOptionPane.showInputDialog(null,
                    "Digite 1 para cadastrar, 2 para consultar, 3 para excluir, 4 para alterar ou 5 para sair",
                    "Green dinner", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) || "2".equals(opcao)
                || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)) {
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

    private static boolean isConsultar(String opcao) {
        if ("2".equals(opcao)) {
            return true;
        }
        return false;
    }


    private static boolean isExcluir(String opcao) {
        if ("3".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isAtualizar(String opcao) {
        if ("4".equals(opcao)) {
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


    private static void consultar(String dados) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null) {
            JOptionPane.showMessageDialog(null, "Cliente encontrado: " + cliente.toString(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado: ", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");

        Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3], dadosSeparados[4], dadosSeparados[5], dadosSeparados[6]);
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
        if (isCadastrado) {
            JOptionPane.showMessageDialog(null, "Cliente Cadastrado com Sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado!", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void excluir(String dados) {
        Long cpf = Long.parseLong(dados);
        Cliente cliente = iClienteDAO.consultar(cpf);

        if (cliente != null) {
            iClienteDAO.excluir(cpf);
            JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado");
        }
    }

    private static void atualizar(String dados) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null) {
            String novosDados = JOptionPane.showInputDialog(null,
                    "Digite os novos dados separados por vírgula: \nNome, Telefone, Endereço, Numero, Cidade, Estado",
                    "Atualizar", JOptionPane.INFORMATION_MESSAGE);

            if (novosDados != null) {
                String[] partes = novosDados.split(",");
                cliente.setNome(partes[0].trim());
                cliente.setTel(Long.valueOf(partes[1].trim()));
                cliente.setEnd(partes[2].trim());
                cliente.setNumero(Integer.valueOf(partes[3].trim()));
                cliente.setCidade(partes[4].trim());
                cliente.setEstado(partes[5].trim());

                iClienteDAO.alterar(cliente);
                JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
            }
        }
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "Até logo: ", "Sair", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}


