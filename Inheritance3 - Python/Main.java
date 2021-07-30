# normal room class -  
class normalroom:
    def calculates(self,nor,nod):
        if nod==1:
            rent = nor*300;
        elif nod>1 and nod<=5:
            rent=nor*250*nod
        else:
            rent= nor*200*nod
        return rent
#AC room class
class acroom:
    def accalculates(self,nor,nod):
        if nod==1:
            rent = nor*450;
        elif nod>1 and nod<=5:
            rent=nor*300*nod
        else:
            rent= nor*250*nod
        return rent
# suiteroom class
class suiteroom:
    def suitecalculates(self,nor,nod):
        if nod==1:
            rent = nor*550;
        elif nod>1 and nod<=5:
            rent=nor*500*nod
        else:
            rent= nor*450*nod
        return rent
# multiple inheritance
# inherited from three classes
class hotel(normalroom,acroom,suiteroom):
    def __init__(self,name,addr,mn):
        self.name=name
        self.addr=addr
        self.mobile= mn
    def display(self):
        nor=  int(input())
        nod = int(input())
        choice = int(input())
        print("Name:",self.name)
        print("Address:",self.addr)
        print("Mobile:",self.mobile)
        if (choice==1):
            print("Room Rent =",self.calculates(nor,nod))
        elif (choice==2):
            print("Room Rent =",self.accalculates(nor,nod))
        else:
            print("Room Rent =",self.suitecalculates(nor,nod))

name= input()
address =  input()
mn =  input()
h= hotel(name,address,mn)
h.display()