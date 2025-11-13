# gs-0-talent-platform

## 🎯 Tema da Global Solution

**Plataformas que conectam talentos a projetos com propósito**

Esse tema explora soluções tecnológicas que ajudam pessoas a encontrarem oportunidades profissionais alinhadas ao seu propósito, valores e impacto social.

A API criada neste projeto simula um serviço simples de integração que poderia ser utilizado dentro de uma plataforma desse tipo.

---

## 👥 Membros do Grupo

- **Isabella Gomes Menezes** — RM 552327
- **Ana Luiza de Paula Reis** — RM 552353

---

## 🧩 Sobre a API

Esta aplicação foi desenvolvida em **Java + Spring Boot** e roda na porta **8081**, conforme requisitos da disciplina.

A API é composta por:

- **Controller:** `TemaController`
- **Endpoint:** `GET /info`
- **Retorno (JSON):**
  - Nome do tema
  - Nome dos membros
  - RM de cada membro
  - Descrição resumida do tema

---

## 📚 Tecnologias Utilizadas

- Java 17
- Spring Boot 3
- Maven Wrapper
- Swagger / OpenAPI
- GitHub Actions (CI/CD)
- Docker / Docker Hub

---

## 🚀 Como executar o projeto

### ✔️ Pré-requisitos

- Java 17+
- Maven (ou o Maven Wrapper `mvnw` incluído)
- Docker (opcional, para rodar via container)

---

### ▶️ Opção 1: Executar localmente (Maven)

1.  No terminal, navegue até a raiz do projeto.
2.  Execute o wrapper do Maven:

    ```bash
    ./mvnw spring-boot:run
    ```

3.  Acesse os endpoints:
    - **API:** [http://localhost:8081/info](http://localhost:8081/info)
    - **Swagger UI:** [http://localhost:8081/swagger-ui/index.html](http://localhost:8081/swagger-ui/index.html)

### 🐳 Opção 2: Executar com Docker

1.  **Build da imagem:**

    ```bash
    docker build -t SEUUSUARIO/gs-0-talent-platform:latest .
    ```

2.  **Rodar o container:**
    ```bash
    docker run -p 8081:8081 SEUUSUARIO/gs-0-talent-platform:latest
    ```

---

## 📦 Docker Hub

A imagem também está disponível publicamente no Docker Hub:

**https://hub.docker.com/r/isabellaagm/gs-0-talent-platform**

---

## ⚙️ CI/CD — Workflows Implementados

Este projeto utiliza GitHub Actions para automação.

#### 1. Versioning (push na `main`)

- **Ação:** Cria tags automáticas baseadas em data/hora (`v-YYYY.MM.DD.HHMMSS`).
- **Evidência:** Visível na aba "Actions" e "Tags" do repositório.

#### 2. Continuous Integration (CI)

- **Disparado em:** Push para `feature/**`, `release` ou `hotfix`.
- **Executa:**
  - Build do projeto
  - Execução de testes
  - Build da imagem Docker (para validação)

#### 3. Continuous Delivery (CD)

- **Disparado em:** Pull Request para a branch `develop`.
- **Executa:**
  - Build da aplicação
  - Build da imagem Docker
  - Push automático da imagem para o Docker Hub
- **Secrets Utilizados:**
  - `DOCKERHUB_USERNAME`
  - `DOCKERHUB_TOKEN`

## 📚 Tecnologias Utilizadas

- Java 17

- Spring Boot 3

- Maven Wrapper

- Swagger / OpenAPI

- GitHub Actions

- Docker / Docker Hub
