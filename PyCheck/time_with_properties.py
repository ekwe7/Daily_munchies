class TimeWithProperties:
    def __init__(self, second = 0, minute = 0, hour = 0):
        self.second = second
        self.minute = minute
        self.hour = hour

    #set my getter
    @property
    def second(self):
        return self._second

    #my setter
    @second.setter
    def second(self, value):
        if 0 > value > 59:
            raise ValueError("seconds must be between 0 and 59")
        self._second = value

    @property
    def minute(self):
        return self.new_minute

    @minute.setter
    def minute(self, value):
        if 0 > value > 59:
            raise ValueError("minutes must be between 0 and 89")
        self.new_minute = value

    @property
    def hour(self):
        return self._hour

    @hour.setter
    def hour(self, value):
        if 0 > value > 23:
            raise ValueError("hours must be between 0 and 23")
        self._hour = value

    def __str__(self):
        return f"Time[{self.hour:02}:{self.minute:02}:{self.second:02}]"

time1 = TimeWithProperties(17, 36, 4)
print(time1)