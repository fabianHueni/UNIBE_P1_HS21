# Theorieaufgaben
## Aufgabe 1
Ja = ist unterschiedlich<br>
Nein = ist gleich<br>
a) Ja <br>
b) Nein <br>
c) Nein <br>
d) Ja<br>
e) Ja<br>
f) Nein <br>

## Aufgabe 2
````
for i  = 0 bis i = 100
modThreeResult = i mod 3
modFiveResult = i mod 5
if (modFiveResult == 0 und modThreeResult == 0)
print "BizzBuzz"
if (modThreeResult == 0)
print "Bizz"
if (modFiveResult == 0)
print "Buzz"
else 
print i
````

## Aufgabe 3

````
function binaryAddition(Array A, Array B)
    Array result länge A + 1
    
    for i = (länge A-1)...0
        sum = A[i] + B[i] + result[i]
        switch sum
        case 0
            result[i] = 0
        case 1
            result[i] = 1
        case 2
            result[i] = 0
            result[i-1] = 1
        case 3
            result[i] = 1
            result[i-1] = 1
 
    Rückgabe result
````

## Aufgabe 4
````java
public static void shuffle(List<int> list) {
    int n = list.size();
    for (int i = n; i > 0; i--) {
        Random random = new Random();
        int r = random.nextInt(i+1);
        this.swapElements(list, i, r);
    }
    return list;
}

public static swapElements(List<int> list, int i, int r) {
        int temp = list.get(i);
        list.set(i, list.get(r));
        list.set(r, temp);
}
````

## Aufgabe 5
````
Ruby 1.1
Python 1.1
12345
````

## Aufgabe 6
````
37
72
5
````

## Aufgabe 7
````
72 (Head)
37
15
````

## Aufgabe 8

````java
public boolean set(int index, Object object) {
    if(index >= this.listElements.length - 1)
        return false;
    this.listElements[index] = object;
    return true;
}
````

## Aufgabe 9
````java
public int size() {
    int size = 0;
    Node<E> currentNode = this.startNode;
    while (currentNode.getNext() !== null) {
        currentNode = currentNode.getNext();
        size++;
    }
    return size;
}
````

## Aufgabe 10
Weil nicht jede Implementierung der Collection dieselben Anforderungen an eine get bzw. set 
methode hat. List funktioniert beispielsweise über einen Index für get und set, Stack oder Queue hingegen
haben ein anderes Verhalten (Stack z.B. Rückgabe von dem zuletzt hinzugefügten Element)
Daher macht es sinn, dass jede Implementation selbst die get und set Methode  definiert und implementiert.
