class person:
    def __init__(self,name):
        self.name=name
    def display(self):
        print("Name of Person =",self.name)

class staff(person):
    def __init__(self,name,id):
        super().__init__(name)
        self.id=id
    def display(self):
        super().display()
        print("Staff Id is  =",self.id)

class tempstaff(staff):
    def __init__(self,name,id,nod,noh):
        super().__init__(name,id)
        self.nodays=nod
        self.nohours = noh
    def display(self):
        super().display()
        print("No. of Days =",self.nodays)
        print("No. of Hours Worked =",self.nohours)
        print("Total Salary =",self.salary())
    def salary(self):
        return (self.nodays*self.nohours*150)

name= input()
id = int(input())
nod = int(input())
noh =  int(input())
ts= tempstaff(name,id,nod,noh)
ts.display()