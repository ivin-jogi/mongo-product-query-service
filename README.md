# mongo-product-query-service

Access the app at this endpoint **on web browser** - http://localhost:8082/graphiql 

Product query:
```
query {
  products {
    id
    name
    category
    price
  }
}
```

Product Mutation
```
mutation {
  addProduct(
    name: "Charger",
    category: "Essentials",
    price: 2000
  ) {
    id
    name
    category
    price
  }
}
```

With Postman:
Endpoint: http://localhost:8082/graphql
Request type: POST
Content-Type : `application/json` 
Product Query:
```
{
  "query": "query { products { id name category price } }"
}
```
Product Mutation:
```
{
  "query": "mutation { addProduct(name: \"Tablet\", category: \"Electronics\", price: 299.99) { id name category price } }"
}
```

