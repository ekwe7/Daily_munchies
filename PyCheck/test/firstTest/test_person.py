import unittest, person

class TestPerson(unittest.TestCase):
    def test_person(self):
        with self.subTest():
            greeting_massage = person.greeting_massage('Ekwe')
            self.assertEqual(greeting_massage, 'Welcome Ekwe')
        with self.subTest():
            self.assertEqual(person.greeting_massage('ekwe'), 'Welcome Ekwe')

    def test_can_drink_alcohol(self):
        with self.subTest():
            self.assertEqual(person.can_drink_alcohol(23), True)
        with self.subTest():
            self.assertEqual(person.can_drink_alcohol(12), False)

    def test_can_passed_the_exam(self):
        self.assertEqual(person.can_passed_the_exam(45), True)
        self.assertEqual(person.can_passed_the_exam(34), False)

    def test_have_account_with_gtbank(self ):
        have_account = person.have_account_with_gtbank('Guaranty Trust Bank')
        self.assertEqual(have_account, 'Guaranty Trust Bank')