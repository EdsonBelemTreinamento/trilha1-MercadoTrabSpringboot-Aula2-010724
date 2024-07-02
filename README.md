# Projeto Spring Boot - Gerenciamento de Usuários

Este é um projeto de demonstração utilizando Spring Boot, MongoDB e Spring Data REST para gerenciamento de usuários.

## Funcionalidades

O projeto implementa um sistema básico de CRUD (Create, Read, Update, Delete) para usuários, com as seguintes funcionalidades:

- **Adicionar Usuário:** Endpoint para adicionar novos usuários ao banco de dados MongoDB.
- **Listar Usuários:** Endpoint para listar todos os usuários cadastrados.

## Estrutura do Projeto

O projeto segue a estrutura básica do Spring Boot, incluindo as seguintes camadas:

1. **Model:** Representação dos dados dos usuários.
2. **Repository:** Interface para interagir com o banco de dados MongoDB.
3. **Controller:** Controladores REST para gerenciar as requisições HTTP.

## Endpoints

### Adicionar Usuário

- **URL:** `/api/users/save`
- **Método:** POST
- **Descrição:** Adiciona um novo usuário ao banco de dados.
- **Exemplo de Request Body:**
  ```json
  {
    "name": "John Doe",
    "email": "john.doe@example.com",
    "password": "password123",
    "status": "active",
    "token": "someTokenValue"
  }
  ```
- **Resposta de Sucesso:** 
  - **Status Code:** 200 OK
  - **Body:** Dados do usuário adicionado.

### Listar Usuários

- **URL:** `/api/users`
- **Método:** GET
- **Descrição:** Lista todos os usuários cadastrados.
- **Resposta de Sucesso:** 
  - **Status Code:** 200 OK
  - **Body:** Lista de usuários.

## Configurações do Projeto

### Dependências

O projeto utiliza as seguintes dependências:

- Spring Boot Starter Data MongoDB
- Spring Boot Starter Data REST
- Spring Boot Starter Validation
- Spring Boot Starter Web
- Spring Boot Starter Test

### Configuração do MongoDB

- **URI do MongoDB:** `mongodb://localhost:27017/bancomongo`
- **Porta do Servidor:** `8989`

## Executando o Projeto

1. Certifique-se de que o MongoDB está em execução na máquina local na porta 27017.
2. Clone o repositório:
   ```bash
   git clone https://github.com/EdsonBelemTreinamento/trilha1-MercadoTrabSpringboot-Aula2-010724
   ```
3. Navegue até o diretório do projeto:
   ```bash
   cd trilha1-MercadoTrabSpringboot-Aula2-010724
   ```
4. Execute o projeto:
   ```bash
   ./mvnw spring-boot:run
   ```

## Autor

- **Nome:** Edson Belem Treinamento
- **Contato:** [Contato do Autor](https://github.com/EdsonBelemTreinamento)

