# Minhas Músicas

Este projeto é uma aplicação Java que simula uma coleção de músicas e podcasts, permitindo reproduções, curtidas e uma análise de preferências com base na popularidade. Ele organiza a lógica utilizando conceitos de Orientação a Objetos, como herança e encapsulamento.

## Funcionalidades

- **Adicionar Músicas e Podcasts**: Gerencie uma coleção de músicas e podcasts com informações detalhadas.
- **Reproduções e Curtidas**: Simule reproduções e curtidas para cada item.
- **Classificação Automática**:
  - Músicas recebem classificação máxima (10) se tiverem mais de 2000 reproduções.
  - Podcasts recebem classificação máxima (10) se tiverem mais de 500 curtidas.
- **Gerenciador de Favoritos**: Avalia automaticamente os itens e indica quais são sucessos absolutos ou boas opções.

## Estrutura do Projeto

1. **Audio**: Classe base com propriedades comuns para músicas e podcasts, como título, número de reproduções e curtidas.
2. **Musica**: Especialização de `Audio`, com informações como álbum, cantor e gênero.
3. **Podcast**: Especialização de `Audio`, com informações como apresentador e descrição.
4. **MinhasPreferidas**: Gerenciador que avalia os itens com base na classificação.

