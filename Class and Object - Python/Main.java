class mobile:
  def __init__(self,name,bname,color,pixel):
    self.name=name
    self.bname=bname
    self.color=color
    self.pixel=pixel
  def display(self):
    print("{} own {} {} color smartphone having {} MP camera".format(self.name,self.bname,self.color,self.pixel),end=" ")
    
a=input()
b=input()
c=input()
d=input()
ml=mobile(a,b,c,d)
ml.display()