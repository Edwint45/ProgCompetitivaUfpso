mensaje = str(input())
mensaje = mensaje.replace(" ", "")
lista = list(mensaje)
cont = 0

for i in lista:
    if i.isdigit():
        cont += 20
    elif i.isalpha():
        cont += 10
    else:
        cont += 30

print(f"su mensaje {mensaje} cuesta ${cont}")
