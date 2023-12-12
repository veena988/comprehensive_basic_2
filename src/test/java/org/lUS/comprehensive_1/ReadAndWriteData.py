import csv

class ReadAndWriteData:
	with open(r'C:\Users\vv2\AppData\Local\Programs\Python\Python39\Python_Assignment2.csv', 'r') as file:
		reader = csv.reader(file)
		data = list(reader)
		print(data)