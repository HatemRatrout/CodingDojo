
class BankAccount:
  def __init__(self,int_rate,balance=0):
    self.int_rate=int_rate
    self.balance=balance
      
  def deposit(self, amount):
    self.balance+=amount
    return self
    
  def withdraw(self, amount):
    if self.balance-amount>0:
      self.balance-=amount
      return self
    else:
      print("Insufficient funds: Charging a $5 fee")
      self.balance=self.balance-amount-5
      
  def display_account_info(self):
    print("Balance: ${}".format(self.balance))
    
  def yield_interest(self):
    if self.balance>0:
      self.balance=self.balance+(self.balance*self.int_rate)
      return self
    else:
      return False
      
class User:
    def __init__(self,name):
        self.name=name
        self.account=BankAccount(0.01)
    
    def make_deposit(self,amount):
        self.account.deposit(amount)
        
    def make_withdrawal(self,amount):
        self.account.withdraw(amount)
    
    def display_user_balance(self):
        self.account.display_account_info()
      
Hatem=User("Hatem")
Noor=User("Noor")

Hatem.make_deposit(70)
Hatem.make_withdrawal(30)
Hatem.display_user_balance()