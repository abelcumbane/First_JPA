---

# First_JPA

Este projeto tem como objetivo explorar os principais conceitos do **Java Persistence API (JPA)**, uma especificação Java para a persistência de dados em aplicações Java SE e Java EE.

## 📌 O que é JPA?
O **JPA (Java Persistence API)** é uma especificação que define como os objetos Java podem ser mapeados para um banco de dados relacional. Ele simplifica a persistência de dados ao atuar como uma **camada de abstração** sobre a implementação do ORM (Object-Relational Mapping), como o **Hibernate**.

## 🏗️ Funcionalidades Abordadas

Este projeto cobre diversos conceitos essenciais do JPA, incluindo:

1. **Configuração da conexão com o banco de dados** 📡
   - Uso do `persistence.xml`
   - Configuração do Hibernate como provedor JPA

2. **ORM (Object-Relational Mapping)** 🏛️
   - Definição de entidades e tabelas
   - Mapeamento de atributos

3. **JPQL (Java Persistence Query Language)** 🔍
   - Consultas personalizadas utilizando JPQL
   - Uso de `NamedQuery` e `TypedQuery`

4. **JPA Annotations** 🏷️
   - Uso das principais anotações, como `@Entity`, `@Table`, `@Column`, `@Id`, `@GeneratedValue`, etc.

5. **EntityManager** ⚙️
   - Gerenciamento do ciclo de vida das entidades
   - Persistência, atualização, remoção e busca de registros

6. **Herança em JPA** 👨‍👩‍👦
   - Estratégias de mapeamento de herança: `SINGLE_TABLE`, `JOINED`, `TABLE_PER_CLASS`
   - Uso de `@MappedSuperclass`

7. **Relacionamentos entre entidades** 🔗
   - `@OneToOne`, `@OneToMany`, `@ManyToOne`, `@ManyToMany`
   - Estratégias de mapeamento bidirecional e unidirecional

8. **Lazy e Eager Fetch** ⚡
   - Configuração do carregamento de dados com `FetchType.LAZY` e `FetchType.EAGER`

9. **Cascading e Fields Locks** 🔒
   - Uso de `CascadeType` para gerenciar operações em cascata
   - Controle de concorrência com `@Version`

---

## 📚 Referências

- [Documentação oficial do JPA](https://jakarta.ee/specifications/persistence/)
- [Hibernate ORM](https://hibernate.org/)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)

---
