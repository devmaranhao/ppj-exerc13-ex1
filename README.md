## Curso: Sistemas para Internet
## Disciplina: Padrões de Projetos
## Acadêmica: Denise Vieira Maranhão


### Responda:
### Qual padrão de projeto pode ser utilizado no desenvolvimento de uma solução?
O padrão de projeto utilizado é o **Strategy**, pois ele permite definir diferentes algoritmos de cálculo de desconto e trocá-los dinamicamente de acordo com a escolha do usuário, sem a necessidade de alterar o código principal do sistema.

### Como poderíamos implementar estes tipos de desconto sem utilizar Padrões de Projetos?
Os tipos de desconto poderiam ser implementados utilizando estruturas condicionais, como if ou switch, onde cada condição representaria um tipo diferente de desconto. O cálculo seria feito diretamente dentro dessas estruturas.

### Quais os problemas que tal implementação traria?
Essa implementação traria problemas como código acoplado, dificuldade de manutenção e necessidade de alterar o código existente sempre que um novo tipo de desconto fosse criado, além de violar o Princípio do Aberto/Fechado (OCP).

