import csv

# Data to be written as dictionaries
data = [
    {'S.no': 1, 'Roll_NO': 11, 'Name': 'Anu'},
    {'S.no': 2, 'Roll_NO': 12, 'Name': 'Ram'},
    {'S.no': 3, 'Roll_NO': 13, 'Name': 'Varma'}
]

# Writing dictionary data to a CSV file
with open('table_with_header.csv', 'w', newline='') as file:
    fieldnames = ['S.no', 'Roll_NO', 'Name']
    writer = csv.DictWriter(file, fieldnames=fieldnames)
    writer.writeheader()  # Writes the header row
    writer.writerows(data)
