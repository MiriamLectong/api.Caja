# api.caja

##  Creating a Spring Boot project   
### It's required to create services to manage the account movements of a savings bank. For which we need the following entities and specifications:

## Person

- Implement the person class with the following data: name, gender, age, id, address and phone number.

- It must manage its primary key (PK)

## Client

- Client must handle an entity that inherits from the person class.

- A client has : clientId, password, state.

- It must manage its primary key (PK)
## Account

- Account must handle an entity.

- An account has: account number, account type, initial balance, state.

- It must manage its primary key (PK)

## Movements

- Movements must handle an entity.

- A movement has: date, type, value, amount.

- It must manage its primary key (PK)
  ## Functionalities of this API

API’s must have the following operations:

- Create, Edit, Update y delete registers (Entities: Account, Client and Movements).

- The endpoints to create are:

          /cuentas
          
          /clientes
          
          /movimientos

- When the values are credit are positive, and the debits are negative. Should be stored
  available balance in each transaction depending on of the movement type (addition or subtraction)

- If tha balance is zero, and we go to realize a debit transaction, you must display the message “Balance is not 
  available”

- Generate report (Account Statement) specifying a date range and a client, view the
  associated accounts with their respective balances and the total debits and credits made during
  the dates of that client. (result in Json) For example:
  (/reports?date=date range)