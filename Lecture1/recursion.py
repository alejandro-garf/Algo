## Step counting both iteratively and recursionly


## Iterative

def walk(steps):
    for step in range(1, steps + 1):
        print(f"You take step #{step}")

print(walk(100))

#Recursion

def walk(steps):
    if steps == 0: # Checke the base case
        return
    walk(steps -1) # Pass in one less to create a loop , think of it as undoing the call stack
    print(f"You take step #{steps}")

print(walk(100))

## Recursion tend to be slower