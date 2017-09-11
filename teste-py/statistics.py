
vec = []

def estatisticas(vector):
    if (type(vector) is list):
        for element in vector:
            if (type(element) is not int):
                raise(TypeError)
    return True