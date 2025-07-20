from to_do_function import (show_menu, add_task, view_task, delete_task)
while True:
        show_menu()
        user_choice = input("choose from the options (1 - 6): ")
        match user_choice:
            case 1: 
                  #task = input("Enter task: ")
                  #add_task(task)
                  print(tasks)
            case 2:
                print("View tasks")
            case 3: 
                print("MArk task as complete")
            case 4:
                print("Delete task")
            case 5:
                print("Edit task")
            case 6:
                print("Exit")