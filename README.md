# coding-calendar-api
This is the Api microservice for coding calendar project

API endpoints:-
+  **/contests** - Fetches all the data related to all the platforms from the DB
    - Method : `GET`
    - Parameters : `platform=[string]` , `phase=[string]`
**Note** -> in contests the platform parameter can be codechef, hackerrank, hackerearth , codeforces and The phase parameter can be running ,ended and upcoming
