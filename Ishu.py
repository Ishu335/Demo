
# coding: utf-8

# In[47]:


size =7
arr=[0,0,0,0,0,0,0]
# arr[size-1]
def start():
    for i in range(0,int(size)):
        arr[i]=-1
def insert(value):
    key=value%size
    if (arr[key]==-1):
        arr[key]=value
        print(value," inserted at [ ",key,"] \n")
    else:
        print("\nCollision : [",key,"] has element",arr[key],"already")
        print("\nUnable to insert ",value)

def remove(value):
    key=value%size
    if (arr[key]==value):
        arr[key]=-1
    else:
        print(value," is  not Present In The HashTable \n")

def search(value):
    key=value%size
    if (arr[key]==value):
        print("Search Found\n")
    else:
        print("Search Not Found\n")
def display():
    for i in range(int(size)):
        print(i," = ",arr[i],"\n")

start()
insert(10)
insert(4) 
insert(2) 
insert(3)

print("Hash table\n")
display()
print("\n")

print("Deleting value 10..\n")
remove(10)
print("After the deletion hash table\n")
display()
print("\n")

print("Deleting value 5..\n")
remove(5)
print("After the deletion hash table\n")
display()
print("\n")
print("Searching value 4..\n");
search(4)
print("Searching value 10..\n");
search(10);


    
    

