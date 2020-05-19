# apa-final
Trabalho final de Análise, Projeto e Avaliação de Arquitetura de Software

# Estilo Arquitetural Geral
A aplicação utiliza o estilo arquitetural MVVM implementado com a linguagem JAVA. Foi adotada uma separação a nível de plugins. As camadas são subdivididas em diferentes JARs, permitindo a reutilização em diferentes aplicações e a substituição de partes específicas (deploy), quando estas forem alterada. Ou seja, foi adotada uma separação a nível de plugins.

# Estilo Arquitetural do Domínio
O estilo arquitetural Clean Architecture  ao definir e organizar o domínio da aplicação e a separação das responsabilidades.
![Regra da dependência](https://miro.medium.com/max/1400/1*kr_9fUVjtMI56OlSj2fGMQ.png)

## Pacotes
Os artefatos são organizados nos pacotes de acordo com suas responsabilidades. Interfaces e abstrações são utilizadas para permitir a inversão de controle, facilitando o fluxo das camadas mais baixas (infraestrutura) para as camadas mais altas (domínio).
### domain
Contém os artefatos referentes às políticas (regras empresariais). Classes ricas, que definam e implementem as regras empresariais.
### application
Contém os artefatos referentes às regras de negócio da aplicação (casos de uso). Manipula as diversas políticas (domain) de forma a fazer com que a aplicação cumpra seu propósito.
### controller
Contém os artefatos que permitem a comunicação entre o mundo externo e a camada de aplicação (APIs). Adapta os dados de entrada e repassa para a camada de aplicação. No sentido inverso, converte as respostas da camada de aplicação para uma estrutura mais adequada para a camada de visão.
### infrastructure
Contém os artefatos de persistência de dados, configurações de frameworks, etc. É nessa camada que as dependências são definidas e injetadas para utilização das camadas mais altas.

![Desenho da arquitetura](https://github.com/anjovisk/apa-final/blob/master/Diagrama.png)
