#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Cadastro de Clientes

  Scenario: Title of your scenario
    Given efetuei login no sistema
    And acessei o menu Clientes >> Inserir
    When na tela Dados de Identificacao informo os dados de Pessoa Fisica
    And na tela Dados de Identificacao clico em Avancar
    And na tela Enderecos informo os enderecos
    And na tela Enderecos clico em Salvar
    Then na tela Enderecos sera exibida mensagem de sucesso
    And efetuarei logout do sistema

    