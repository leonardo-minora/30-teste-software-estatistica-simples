from __future__ import division


vec = []

def estatisticas(vector):
    if (type(vector) is list and len(vector) > 0):
        for element in vector:
            if (type(element) is not int):
                raise(TypeError)
        return {'maior': max(vector), 'menor': min(vector), 'media': sum(vector)/len(vector), 'tamanho': len(vector) }
    else:
        raise(ValueError)