import unittest
from statistics import *

class StatisticsTest (unittest.TestCase):
  
    def test_integer_vector(self):
        try:
            estatisticas([1,2])
            pass
        except:
            self.fail("Isso nao deveria ter acontecido")
    
    def test_is_not_a_vector(self):
        with self.assertRaises(TypeError):
            estatisticas(['a', 'b'])
    
    def test_size_bigger_than_zero(self):
        self.assertEquals(estatisticas([1,2]), {'maior': 2, 'menor': 1, 'media': 1.5, 'tamanho': 2})

if __name__ == '__main__':
    unittest.main()