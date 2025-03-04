# 🛒 Aplicação de Tradução de Produtos  

Este projeto, desenvolvido durante um curso da Alura, lê um arquivo CSV contendo informações sobre produtos, traduz os campos relevantes do inglês para o português e exibe os resultados traduzidos no console.  

## 🚀 Tecnologias Utilizadas  

- **Java 17**  
- **Maven**  
- **OpenCSV** (para leitura do CSV)  
- **LibreTranslate API** (para tradução)  

## 📜 Dependências (Maven)  

As dependências necessárias já estão configuradas no `pom.xml`:  

```xml
<dependencies>
    <dependency>
        <groupId>com.opencsv</groupId>
        <artifactId>opencsv</artifactId>
        <version>5.10</version>
    </dependency>
    <dependency>
        <groupId>space.dynomake</groupId>
        <artifactId>libretranslate-java</artifactId>
        <version>1.0.9</version>
    </dependency>
</dependencies>
```

##⚙️ Como Executar

Clonar o repositório

````
sh
git clone <URL_DO_REPOSITORIO>
cd produtos
````
Compilar e executar
````
mvn clean package  
java -jar target/produtos-1.0-SNAPSHOT.jar
````
### ⚠️ Nota: Certifique-se de que o arquivo products.csv esteja em src/main/resources/.

### 📌 Autor
Desenvolvido durante um curso da Alura.
