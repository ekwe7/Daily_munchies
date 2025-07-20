tasks = []

def show_menu():
        print("WELCOME TO MY TO-DO-LIST APP")

        print(""" 1. Add tasks
            2. View tasks
            3. MArk as complete
            4. Delete tasks
            5. Edit tasks
            6. Exit
            """)

def add_task(task):
    task = input("Enter new task: ")
    tasks.append(task)
    print("task added")

def view_task():
      print("\n my tasks")
      for index, task in enumerate(tasks, start=1):
            print(f"{index}.{task}")
            print()
def delete_task(index):
      delete = tasks.pop(index)
      print("delete task: {delete}")