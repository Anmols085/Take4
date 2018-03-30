import string

def build_shift_dict(shift):
    newDict = {}
    j=0
    alphabet = string.ascii_lowercase
    for i in range(len(alphabet)):
        if((i+shift)<len(alphabet)):
            newDict[alphabet[i]] = alphabet[i+shift]
        else :
            newDict[alphabet[i]] = alphabet[j]
            j += 1
    j=0
    alphabet = string.ascii_uppercase
    for i in range(len(alphabet)):
        if((i+shift)<len(alphabet)):
            newDict[alphabet[i]] = alphabet[i+shift]
        else :
            newDict[alphabet[i]] = alphabet[j]
            j += 1
    return newDict

print(build_shift_dict(3))
s = "hello world, help"
print(s.split())
removeSpace = ''
for i in range(len(s)-1):
    removeSpace += s[i]
print(removeSpace)
        