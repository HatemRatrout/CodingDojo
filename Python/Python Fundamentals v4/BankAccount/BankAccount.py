
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
      self.balance+=(self.balance*self.int_rate)
      return self
    else:
      return False
      
Hatem=BankAccount(0.01)
Noor=BankAccount(0.01)

Hatem.deposit(500).deposit(400).deposit(300).withdraw(200).yield_interest()
Hatem.display_account_info()

Noor.deposit(3500).deposit(300).withdraw(1200).withdraw(1000).withdraw(90).withdraw(70).yield_interest()
Noor.display_account_info()