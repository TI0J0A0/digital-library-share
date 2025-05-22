# digital-library

> Plataforma de compartilhamento de PDFs, vídeos e cursos entre amigos, com acesso controlado por administrador.

## 🚀 Visão Geral

`biblioteca-online` é uma aplicação full-stack em Java e React que permite:

- Solicitar acesso à plataforma (aprovado por admin).  
- Fazer upload/down­load de PDFs, vídeos e pastas.  
- Visualizar PDFs inline e tocar vídeos no browser.  
- Painel de administração para aprovar ou recusar solicitações.  
- Logs de atividades (quem subiu, quem baixou e quando).

## 📦 Stack Tecnológica

- **Back-end**: Java 17, Spring Boot, Spring Security, JWT  
- **Banco de dados**: PostgreSQL  
- **Armazenamento**: local (protótipo) → S3 / MinIO (futuro)  
- **Front-end**: React (Vite), Tailwind CSS, PDF.js, Video.js  
- **Infra**: Docker, Docker Compose, GitHub Actions

## 🏗️ Arquitetura

```mermaid
graph TD
  subgraph Client
    A[Usuário / Admin] --> B[React + Tailwind]
  end
  subgraph Server
    C[Spring Boot] --> D[PostgreSQL]
    C --> E[Local FS / S3]
    C --> F[Spring Security (JWT)]
  end
  B --> C
