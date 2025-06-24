# mongo-product-query-service
Access the app at this endpoint **on web browser** - http://localhost:8082/graphiql 
Product query:
```query {
  products {
    id
    name
    category
    price
  }
}```

Product Mutation
```mutation {
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
}```



