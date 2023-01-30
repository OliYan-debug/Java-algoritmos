# Endpoints

## BASE_URL = /computer
- GET / - Pegar todos os computadores
- POST / - Adicionar um computador
- DELETE /delete/{id} - Deletar um computador da base de dados
- PUT /update/{id} - Atualizar um computador

# Model
```
{
    "id": 1
    "name": "Computador Home Office 2023",
    "description": "HD de 1tb, 4gb de ram e intel pentium",
    "price": 3000.00
}
```

## Business rules 

- name tem que ser não nulo e por padrão ter o prefixo Computador
- description tem que ser não nulo e tem que ter mais de 30 caracteres
- price tem que ter um valor minimo de 1000

