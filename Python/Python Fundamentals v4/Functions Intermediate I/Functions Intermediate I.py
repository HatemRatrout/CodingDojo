import random
def randInt(min=0, max=100):
    if min > max:
        print("min can't be bigger than max..")
        return False

    if max<0:
        print("max is less than zero")
        return False

    num = random.random()*(max-min) + min
    num = round(num)
    return num


