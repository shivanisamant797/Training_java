# Calculator API

Run the Spring Boot API from this directory:

```bash
mvn spring-boot:run
```

The API listens on `http://localhost:8080`.

Send calculations to `POST /api/calculator`:

```json
{
  "firstNumber": 12,
  "operator": "+",
  "secondNumber": 8
}
```

The supported operators are `+`, `-`, `*`, `/`, and `%`. Invalid requests and zero divisors return a `400` response with a JSON `message`.
