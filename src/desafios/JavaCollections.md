# Java Collections

---

## ArrayList
É a implementação mais utilizada. Funciona como um **array dinâmico** que redimensiona seu tamanho automaticamente.

* **Característica:** Baseado em índice.
* **Vantagem:** Muito rápido para **leitura** e busca de elementos pelo índice.
* **Desvantagem:** Lento para inserir ou remover itens no início ou meio da lista, pois precisa deslocar os outros elementos.
    ```java
    List<String> nomes = new ArrayList<>();
    nomes.add("Ana"); 
    System.out.println(nomes.get(0)); // retorna "Ana"
    ```

## LinkedList
Funciona como uma **lista duplamente encadeada**, onde cada elemento (nó) conhece o endereço do próximo e do anterior.

* **Característica:** Cada item é um objeto isolado ligado por ponteiros.
* **Vantagem:** Excelente para **inserções e remoções** frequentes em qualquer posição.
* **Desvantagem:** Busca lenta, pois o Java precisa percorrer a lista item por item até achar o alvo.
    ```java
    LinkedList<String> lista = new LinkedList<>();
    lista.addFirst("Primeiro");
    lista.addLast("Último");
    ```

## Vector
Semelhante ao `ArrayList`, mas com uma diferença crucial: ele é **thread-safe** (sincronizado).

* **Característica:** Garante que dois processos (threads) não alterem a lista ao mesmo tempo.
* **Vantagem:** Segurança em ambientes multi-thread.
* **Desvantagem:** Mais lento devido ao custo computacional da sincronização.
    ```java
    Vector<Integer> numeros = new Vector<>();
    numeros.add(100);
    ```

## Stack (Pilha)
Uma subclasse de Vector que segue a lógica **LIFO** (*Last-In, First-Out*): o último a entrar é o primeiro a sair.

* **Característica:** Operações focadas no topo/final da pilha.
* **Vantagem:** Ideal para históricos, sistemas de Ctrl+Z e algoritmos de recursão.
    ```java
    Stack<String> livros = new Stack<>();
    livros.push("Livro A"); // adiciona no topo
    String removido = livros.pop(); // remove o "Livro A"
    ```

Não sabe qual usar e não está trabalhando com
múltiplas threads simultâneas, o **ArrayList** costuma ser 
a escolha padrão por ser o mais equilibrado.

---

## Map
É uma interface que funciona como um **dicionário** ou uma **lista de contatos**. Em vez de acessar um dado pela sua posição (índice 0, 1, 2...), você o acessa por uma **Chave** única.

* **Chave (Key):** O identificador único (ex: CPF, ID, Nome).
* **Valor (Value):** O dado que você quer guardar (ex: Objeto Usuário, Endereço).

Ideal para quando você quer apenas associar dois dados rapidamente.

```java
// cria o Map: <Tipo da Chave, Tipo do Valor>
Map<String, String> paises = new HashMap<>();

// adiciona itens
paises.put("BR", "Brasil");
paises.put("US", "Estados Unidos");

// busca valor pela chave
System.out.println("Sigla BR: " + paises.get("BR"));
```

---

## HashMap
É a implementação mais usada do Map, ele usa uma técnica chamada **Hashing** para encontrar os dados instantaneamente.

Imagine que você busca um livro em uma biblioteca:
* **Sem Map (Lista):** Você percorre prateleira por prateleira até achar o título. Se o livro for o último, você perdeu um tempão.
* **Com HashMap:** Você digita o nome do livro no sistema, e ele te dá o **corredor e a estante exatos**. Você vai direto ao ponto.

No HashMap, a velocidade de busca é constante ($O(1)$), não importa se você tem 10 ou 1 milhão de itens.

```java
HashMap<Integer, Double> estoque = new HashMap<>();

// insere (id do produto, preço)
estoque.put(101, 250.50);
estoque.put(102, 89.90);

// verifica se existe um item
if (estoque.containsKey(101)) {
    System.out.println("produto 101 tem no sistema.");
}

// atualiza o valor da chave existente
estoque.put(101, 230.00); 

// remove
estoque.remove(102);

System.out.println("total de itens: " + estoque.size());
```