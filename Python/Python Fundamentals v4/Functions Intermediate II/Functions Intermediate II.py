

#---------------Update Values in Dictionaries and Lists---------------

x = [ [5,2,3], [10,8,9] ] 
students = [
     {'first_name':  'Michael', 'last_name' : 'Jordan'},
     {'first_name' : 'John', 'last_name' : 'Rosales'}
]
sports_directory = {
    'basketball' : ['Kobe', 'Jordan', 'James', 'Curry'],
    'soccer' : ['Messi', 'Ronaldo', 'Rooney']
}
z = [ {'x': 10, 'y': 20} ]

#1. 
x[1][0] = 15
print(x)

#2.
students[0]["last_name"] = "Bryant"
print(students)

#3.
sports_directory["soccer"][0] = "Andres"
print(sports_directory)

#4.
z[0]["y"] = 30
print(z)


#---------------Iterate Through a List of Dictionaries---------------

students = [
         {'first_name':  'Michael', 'last_name' : 'Jordan'},
         {'first_name' : 'John', 'last_name' : 'Rosales'},
         {'first_name' : 'Mark', 'last_name' : 'Guillen'},
         {'first_name' : 'KB', 'last_name' : 'Tonel'}
    ]

def iterateDictionary(some_list):
    for i in some_list:
        print(f"first_name - {i['first_name']}, last_name - {i['last_name']}")

iterateDictionary(students)


#---------------Get Values From a List of Dictionaries---------------

def iterateDictionary2(key_name, some_list):
    if key_name == "first_name":
        for i in some_list:
            print(f"{i['first_name']}")
    elif key_name == "last_name":
        for i in some_list:
            print(f"{i['last_name']}")

iterateDictionary2('first_name', students)
iterateDictionary2('last_name', students)


#---------------Iterate Through a Dictionary with List Values---------------

dojo = {
   'locations': ['San Jose', 'Seattle', 'Dallas', 'Chicago', 'Tulsa', 'DC', 'Burbank'],
   'instructors': ['Michael', 'Amy', 'Eduardo', 'Josh', 'Graham', 'Patrick', 'Minh', 'Devon']
}

def printInfo(some_dict):
    for key , value in some_dict.items():
        print(f"{len(value)} {key.upper()}")
        for i in value:
            print(i)
        print("")

printInfo(dojo)