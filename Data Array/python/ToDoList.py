import os
import sys

class todoList:
        activity=''

pilih = 0
myData = []

def menu():
	os.system('cls')
	print("                             To Do List");
	print("---------------------Customize Your Workflows----------------------")
	print("1. Input Activity")
	print("2. My Activity")
	print("3. Update Activity")
	print("4. Remove Activity")
	print("5. This Note is Mine")
	print("6. Exit")
	pilih = int(input("i want to (choose a number): "))
	if pilih == 1 :
		pilih1()
		menu()
	elif pilih == 2:
		display()
		input("back to main menu (press enter) ")
		menu()
	elif pilih == 3:
		index_update=-1
		display()
		id_edit = (input("input activity for update ")) 
		for a in range(0, len(myData)): 
			if id_edit == myData[a].activity: 
					index_update = a 
					break 
		if(index_update > -1): 
			print("UPDATE ACTIVITY ") 
			myToDo = todoList() 
			myToDo.activity = ((input("input activity : ")))  
			myData[index_update] = myToDo
			print("my activity has updated")
    
		else : print("activity not found") 
		input("back to main menu (press enter) ") 
		menu()
	elif pilih ==4:
		os.system('cls') 
		display()
		index_delete=-1
		id_hapus = (input("input activity for remove : ")) 
		for a in range(0, len(myData)): 
			if id_hapus == myData[a].activity:
						index_delete = a
						break
		if(index_delete > -1):
			del myData[index_delete]
			print("my activity has finished") 
		else : print("activity not found")
		input("back to main menu (press enter) ") 
		menu()
	elif pilih == 5 :
		mine()
		input("\n\n back to main menu (press enter)") 
		menu()
	elif pilih == 6 :
		return None

def display():
	os.system('cls');
	print("LIST ACTIVITIES")
	for data in myData:
		print("my activity : "+str(data.activity)) 
		print("----------------------")
		
def mine():
	os.system('cls')
	print("Salma K")
	print("Teknologi Informasi - 20537141005")

def pilih1():
	ulang = 'Y'
	while ulang in('y', 'Y'):
		os.system('cls')
		newList = todoList()
		print("INPUT ACTIVITY ") 
		newList.activity = (input("input your activity : "))
		myData.append(newList) 
		ulang = input("input your activity again (Y / N)? ")		

menu()