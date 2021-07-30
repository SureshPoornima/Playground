class item:
    def __init__(self,price):
        self.price =  price
class customer:
    def __init__(self,pname,quantity):
        self.pname=pname;
        self.quantity =  quantity
# In case of multiple Inheritance
#to call the base class constructor use base class name and pass self(current) object
class bill(item,customer):
    def __init__(self,pname,quantity,price):
        customer.__init__(self,pname,quantity)
        item.__init__(self,price)
    def calculate(self):
        print("Total Price is:",(self.price*self.quantity))

pname =  input()
quantity =  int(input())
price =  int(input())
b=bill(pname,quantity,price)
b.calculate()