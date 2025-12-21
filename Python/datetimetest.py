#This program gets and prints the current system date and time in formatted form.

from datetime import datetime

date = datetime.now().strftime("%d-%m-%y")
print(f"date = {date}")

time = datetime.now().strftime("%H:%M")
print(f"time = {time}")