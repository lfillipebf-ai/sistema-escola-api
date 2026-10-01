# Sistema Escola API

API REST para gerenciamento acadêmico escolar, criada como projeto educacional e de portfólio.

## Tecnologias
Java 17 · Spring Boot 3.5.6 · Spring Data JPA · PostgreSQL · Maven · Docker · REST API

## Funcionalidades
- Cadastro de alunos
- Cadastro de professores
- Cadastro de disciplinas
- Matrículas em disciplinas
- Registro de notas
- Consulta de alunos, professores e disciplinas
- Persistência em PostgreSQL

## Execução
```bash
docker compose up -d
cd backend
mvn spring-boot:run
```
API: `http://localhost:8080`

## Endpoints
- GET/POST `/api/alunos`
- GET/POST `/api/professores`
- GET/POST `/api/disciplinas`
- GET/POST `/api/matriculas`
- PATCH `/api/matriculas/{id}/nota`

**Autor:** Luis Fillipe Backer Faria  
**GitHub:** https://github.com/lfillipebf-ai
