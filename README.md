# apa-final
Trabalho final de Análise, Projeto e Avaliação de Arquitetura de Software

# Estilo Arquitetural Geral
MVVM

# Estilo Arquitetural do Domínio
O estilo arquitetural Clean Architecture  ao definir e organizar o domínio da aplicação e a separação das responsabilidades.
![Regra da dependência](https://miro.medium.com/max/1400/1*kr_9fUVjtMI56OlSj2fGMQ.png)

## Pacotes
Os artefatos devem ser organizados nos pacotes de acordo com suas responsabilidades.
### domain
Contém os artefatos referentes às políticas (regras empresariais).
### application
Contém os artefatos referentes às regras de negócio da aplicação (casos de uso).
### controller
Contém os artefatos que são os pontos de entrada da aplicação, responsáveis por expor as APIs.
### infrastructure
Contém os artefatos de persistência de dados, configurações de frameworks, etc.
