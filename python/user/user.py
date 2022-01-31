class user:
    def __init__(self,name,age,address):
        self.name = name
        self.age = age
        self.address = address
        self.account_deposit = 0
        self.account_withdrawal = 0
        self.account_balance = 0

    def describtion (self):
        print(self.name , self.age , self.address)


    def make_deposit(self,amount):
        self.account_deposit+=amount
        # print(self.account_deposit)

    def make_withdrawal(self,amount):
        self.account_withdrawal+=amount
        # print(self.account_withdrawal)

    def display_user_balance(self):
        self.account_balance=self.account_deposit-self.account_withdrawal
        print(self.account_balance)

    def transfer_money(self, name,amount):
        self.account_balance-=amount
        name.account_balance+=amount
        print(self.name,"transfer",self.account_balance)
        print("to",name.name,name.account_balance)



abdelhadi=user("abdelhadi",24,"abdelhadi@gmail.com")
abdelhadi.describtion()
abdelhadi.make_deposit(300)
abdelhadi.make_deposit(200)
abdelhadi.make_deposit(200)
abdelhadi.make_withdrawal(100)
abdelhadi.make_withdrawal(100)
abdelhadi.display_user_balance()


ahmad=user("ahmad",26,"ahmad@gmail.com")
ahmad.describtion()
ahmad.make_deposit(200)
ahmad.make_deposit(200)
ahmad.make_withdrawal(100)
ahmad.make_withdrawal(100)
ahmad.display_user_balance()

maher=user("maher",26,"maher@gmail.com")
maher.describtion()
maher.make_deposit(200)
maher.make_withdrawal(100)
maher.make_withdrawal(100)
maher.make_withdrawal(100)
maher.display_user_balance()

maher.transfer_money(ahmad,300)


