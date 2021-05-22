class User:
    def __init__(self,name):
        self.name=name
        self.balance=0
    
    def make_deposit(self,amount):
        self.balance+=amount
        return self
        
    def make_withdrawal(self, amount):
        self.balance-=amount
        return self
        
    def display_user_balance(self):
        print("User: {}, Balance: {}".format(self.name,self.balance))
        
    def transfer_money(self, other_user, amount):
        self.balance-=amount
        other_user.balance+=amount

guido=User("guido")
Hatem=User("Hatem")
john=User("John")

guido.make_deposit(200).make_deposit(250).make_deposit(32).make_withdrawal(70).display_user_balance()
Hatem.make_deposit(150).make_deposit(20).make_withdrawal(50).make_withdrawal(10).display_user_balance()
