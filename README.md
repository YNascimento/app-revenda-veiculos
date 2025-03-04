# 🚗 API de Revenda de Veículos

Esta API foi desenvolvida para gerenciar a revenda de veículos automotores, permitindo o cadastro, edição e venda de veículos, listagem de veículos disponíveis e vendidos, cadastro de compradores e um fluxo completo de compra.

## 📌 Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3**
- **PostgreSQL**
- **Arquitetura Hexagonal**
- **Spring Security + JWT**
- **Spring Data JPA**
- **Lombok**

---

## 🚀 Como Executar a Aplicação

### 1️⃣ Pré-requisitos
Certifique-se de ter instalado:
- **Java 17+**
- **Maven**
- **Docker** (opcional, para rodar o banco de dados PostgreSQL)

### 2️⃣ Configurar Banco de Dados
Caso queira rodar um banco localmente com Docker, execute:
```sh
docker run --name postgres -e POSTGRES_USER=admin -e POSTGRES_PASSWORD=admin -e POSTGRES_DB=revenda -p 5432:5432 -d postgres
```

Caso queira configurar manualmente, altere as credenciais no arquivo `application.properties`.

### 3️⃣ Instalar Dependências e Rodar a API
```sh
mvn clean install
mvn spring-boot:run
```

A API estará disponível em: [http://localhost:8080](http://localhost:8080)

---

## 📖 Documentação da API

A documentação dos endpoints pode ser acessada via **Swagger**:

- [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

---

## 🔐 Autenticação e Segurança
A API utiliza **JWT** para autenticação. Para acessar endpoints protegidos, siga os passos:
1. Faça login via `/auth/login` e receba um **token JWT**.
2. Em cada requisição autenticada, envie o token no cabeçalho:
   ```
   Authorization: Bearer SEU_TOKEN_AQUI
   ```

Tipos de Usuários:
- **ADMIN**: Pode cadastrar, editar veículos e visualizar veículos vendidos.
- **COMPRADOR**: Pode comprar veículos.

---

## 📌 Endpoints Principais

### 🔑 **Autenticação**
- `POST /auth/login` → Retorna um JWT para autenticação

### 🚗 **Veículos**
- `POST /api/veiculos` → Cadastra um veículo (Apenas ADMIN)
- `PUT /api/veiculos/{id}` → Edita um veículo (Apenas ADMIN)
- `GET /api/veiculos/disponiveis` → Lista veículos disponíveis
- `GET /api/veiculos/vendidos` → Lista veículos vendidos (Apenas ADMIN)

### 🛒 **Compras**
- `POST /api/compras` → Realiza a compra de um veículo (Apenas COMPRADOR)

### 🧑 **Compradores**
- `POST /api/compradores` → Cadastra um comprador

---

## 🛠️ Contribuindo
1. Faça um **fork** deste repositório.
2. Crie uma **branch** para sua feature (`git checkout -b minha-feature`).
3. Faça commit das suas mudanças (`git commit -m 'Minha nova feature'`).
4. Envie para o repositório (`git push origin minha-feature`).
5. Abra um **Pull Request**.

---

## 📄 Licença
Este projeto está sob a licença **MIT**. Sinta-se livre para usá-lo e melhorá-lo! 🚀

