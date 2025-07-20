def add_to_middle(word):
    value = "ce"
    if len(word) % 2 == 0:
        return word
    else:
        mid = len(word) // 2
        return word[:mid] + value + word[mid:]

print(add_to_middle("hello"))