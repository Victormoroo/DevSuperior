
# Tipos Primitivos em Java

| Tipo        | Tamanho | Faixa de Valores                        | Descrição                                           |
|-------------|---------|------------------------------------------|-----------------------------------------------------|
| **byte**    | 8 bits  | -128 a 127                              | Inteiro pequeno, ocupa pouca memória.               |
| **short**   | 16 bits | -32.768 a 32.767                        | Inteiro curto, maior que byte, menor que int.       |
| **int**     | 32 bits | -2.147.483.648 a 2.147.483.647          | Inteiro padrão, mais usado.                         |
| **long**    | 64 bits | -9 quintilhões a +9 quintilhões         | Inteiro muito grande, exige `L` no final.           |
| **float**   | 32 bits | ±3.4e38 (precisão de ~7 casas decimais) | Decimal de menor precisão, exige `f`.               |
| **double**  | 64 bits | ±1.7e308 (precisão de ~15 casas)        | Decimal de alta precisão, mais usado que float.     |
| **char**    | 16 bits | 0 a 65535 (Unicode)                    | Armazena um único caractere.                        |
| **boolean** | 1 bit  | true ou false                           | Valor lógico (verdadeiro ou falso).                 |

# Outros

| Tipo       | Descrição                                |
|------------|------------------------------------------|
| **String** | Cadeia de caracteres (palavras ou texto) |

---

## 🔥 Observações

- `long` exige o sufixo **`L`** no valor. Exemplo: `100000L`
- `float` exige o sufixo **`f`** no valor. Exemplo: `5.75f`
- Para decimais mais precisos, prefira `double` em vez de `float`.

---

## ✅ Exemplo de declaração em código Java

```java
byte exemploByte = 100;
short exemploShort = 20000;
int exemploInt = 100000;
long exemploLong = 10000000000L;
float exemploFloat = 5.75f;
double exemploDouble = 19.99;
char exemploChar = 'A';
boolean exemploBoolean = true;
```

# Funções Matemáticas

| Exemplo            | Significado                                    |
|--------------------|------------------------------------------------|
| **Math.sqrt**      | Variável A recebe raiz quadrada de x           |
| **Math.pow(x, y)** | Variável A recebe o resultado de x elevado a y |
| **Math.abs(x)**    | Variável A recebe valor absoluto de x          |

# Operadores Lógicos

| Operador  | Significado |
|-----------|-------------|
| **&&**    | E           |
| **\|\|**  | OU          |
| **!**     | NÃO         |
