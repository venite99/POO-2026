x = [2,10,33,70] # Len(x) = 4
y = [4,11,15,20,77] #Len(y) = 5
r = []

tam = len(x) + len(y)

for idx in range(tam):
    temp = 0

    if len(x) == 0: temp = y
    elif len(y) == 0: temp = x
    elif x[0] < y[0]: temp = x
    elif x[0] > y[0]: temp = y
    else: temp = x
    r.append( temp[0] )
    temp.pop(0)



print(f"Resultado = {r}")

