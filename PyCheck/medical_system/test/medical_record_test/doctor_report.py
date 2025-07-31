class Doctor:
  

    def _init_(self, name, specialization, doctor_id, phone_number):
        self._name = name
        self._specialization = specialization
        self._doctor_id = doctor_id
        self._phone_number = phone_number
        self.appointments = []
        self.medical_history = []

    def get_name(self):
        return self._name

    def set_name(self, name):
        self._name = name

    def get_phone_number(self):
        return self._phone_number

    def set_phone_number(self, phone_number):
        self._phone_number = phone_number

    def get_doctor_id(self):
        return self._doctor_id

    def set_doctor_id(self, doctor_id):
        self._doctor_id = doctor_id


    def add_medical_history(self, MedicalRecord):
        self.medical_history.append(MedicalRecord)


    def update_details(self, name=None, phone_number=None):
        if name:
            self.set_name(name)
        if phone_number:
            self.set_phone_number(phone_number)