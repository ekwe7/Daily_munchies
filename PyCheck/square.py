# import random
# from itertools import repeat
#
#
# def square (number1, number2):
#     """Calculate the square root of a number"""
#     return number1 * number2
#
# print("Square of",5,"is",square(5, 2))
#
# def maximun_value(number1, number2, number3, number4):
#     """Calculate the maximum value between two numbers"""
#     maximum = number1
#     if number2 > maximum:
#         maximum = number2
#     if number3 > maximum:
#         maximum = number3
#     if number4 > maximum:
#         maximum = number4
#     return maximum
#
# print(maximun_value(45.78, 578, 6768, 90))
#
# def maximun_value2(value1, value2, value3, value4):
#     """Calculate the maximum value between two values"""
#     maximum = value1
#     if value2 > maximum:
#         maximum = value2
#     if value3 > maximum:
#         maximum = value3
#     if value4 > maximum:
#         maximum = value4
#     return maximum
# print(maximun_value2("Orange", "Ogechi", "Mmachukwuou", "mzuluonye"))
#
#
# frequency1 = 0
# frequency2 = 0
# frequency3 = 0
# frequency4 = 0
# frequency5 = 0
# frequency6 = 0
#
#
# for roll in range(6_000_000):
#     face = random.randint(1,7)
#     if face == 1:
#         frequency1 += 1
#     elif face == 2:
#         frequency2 += 1
#     elif face == 3:
#         frequency3 += 1
#     elif face == 4:
#         frequency4 += 1
#     elif face == 5:
#         frequency5 += 1
#     elif face == 6:
#         frequency6 += 1
#
# print(f"FACE {"FREQUENCY":>15}")
# print(f'{1:>4}{frequency1:>14}')
# print(f'{2:>4}{frequency2:>14}')
# print(f'{3:>4}{frequency3:>14}')
# print(f'{4:>4}{frequency4:>14}')
# print(f'{5:>4}{frequency5:>14}')
# print(f'{6:>4}{frequency6:>14}')

# random.seed(62)
#
# for roll in range(10):
#     print(random.randint(1,7), end=' ')


# def rectangle_area(width =3 , height = 5):
#     """Calculate the area of a rectangle"""
#     return width * height
# print(rectangle_area(), end=' ')
#


"""
num1 = 54
num2 = 54.09

print('{:d} {:.3f}'.format(num1, num2))

# joining elements together
fruit = ["Muffin", "rose", "banana"]
print('-'.join(fruit))

# removing white spaces from elements
value = '   my palace hmy hoMe '
print(value)
print(value.strip())
print(value.lstrip())
print(value.rstrip())
print(value.strip().capitalize())
print(value.title())

"""
# import re
# pattern = '5360'
# print(True if re.fullmatch(pattern,'568') else False)
#
# patt = @gmail.com
#
# print()

"""Write a function that takes a word and "ce" as parameter and returns the word with "ce" at the middle 
if the word can't be divided equally add "ce" to the middle"""

"""
import re
def ce(word):
    value = "ce"
    word = word.lower()
    if len(word) % 2 == 0:
        return word
    if len(word) % 2 == 1:
        return word + value
print(ce("rosee"))"""





"""def display_deco(func):
    def wrapper(*args, **kwargs):
        print("*" * 12)
        result = func(*args, **kwargs)
        print("*" * 12)
        return result
    return wrapper

@display_deco
def display_name(name):
    name.upper()
    print(name)

print(display_name("rose"))
"""


