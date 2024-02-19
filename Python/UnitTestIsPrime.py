import unittest

def isprime(n):
    if n < 2:
        return False
    for i in range(2, n):
        if n % i == 0:
            return False
    return True

class TestIsprime(unittest.TestCase):
    def test_isprime(self):
        self.assertTrue(isprime(53))
        self.assertTrue(isprime(3))
        self.assertTrue(isprime(5))
        self.assertTrue(isprime(7))
        self.assertFalse(isprime(4))
        self.assertFalse(isprime(3))
        self.assertFalse(isprime(2))
        self.assertFalse(isprime(9))
        self.assertFalse(isprime(-10))

if __name__ == '__main__':
    unittest.main()

