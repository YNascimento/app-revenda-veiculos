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
docker run --name postgres -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=password -e POSTGRES_DB=postgres -p 5432:5432 -d postgres
```

Applicação também inclui um docker-compose.yml para rodar o Banco de dados localmente

### 3️⃣ Instalar Dependências e Rodar a API
```sh
mvn clean install
mvn spring-boot:run
```

A API estará disponível em: [http://localhost:8080](http://localhost:8080)

---

## 📖 Documentação da API

Os endpoint podem ser utilizados via Postman utilizando a colleciton:
[Uploading Revenda Veiculos.postman_collection.json…]()

---

## 📌 Endpoints Principais

### 🚗 **Veículos**
- `POST /api/veiculos` → Cadastra um veículo
- `PUT /api/veiculos/{id}` → Edita um veículo
- `GET /api/veiculos/disponiveis` → Lista veículos disponíveis
- `GET /api/veiculos/vendidos` → Lista veículos vendidos

### 🛒 **Vendas**
- `POST /api/vendas` → Realiza a venda de um veículo

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

