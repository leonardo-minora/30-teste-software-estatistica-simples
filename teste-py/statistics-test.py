import unittest
from statistics import *

class StatisticsTest (unittest.TestCase):
  
    def test_integer_vector(self):
        self.assertEquals(estatisticas(vec), True)
    
    def test_is_not_a_vector(self):
        with self.assertRaises(TypeError):
            estatisticas(['a', 'b'])

if __name__ == '__main__':
    unittest.main()