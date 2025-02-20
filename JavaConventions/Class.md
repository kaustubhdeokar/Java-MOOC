SRP (Single Responsibility Principle)

    Gather together the things that change for the same reasons. 
    Separate those things that change for different reasons.
    
SRP leads to high cohesion.
    
    Degree to which elements inside a class/module belong together.
   
A class/method could has high cohension but not follow the SRP principle
in that fact that it handles same TYPE of data, results change in SAME TYPE
OF DATA but does TWO DIFFERENT THINGS.
For ex.

    void saveDataToDB(){
        //process,acquire.
        data = getData();
        //save the Data
        saveDataToDB(data);
        sendEmailNotifications(data);
        }
It does two things, saves the data and sends email notifications, follows
cohension but breaks the Single Responsibility Principle.

Coupling

    Interdependence between two class/modules/objects.
    How much they are connected and know about each other.

Tight/Loose coupling
    
    Change in one class/module requires change in other is referred to Tight Coupling. 
    Vice-versa for the loose coupling   
 
How do achieve this ? (High cohension,loose coupling)
    
    Stick to SRP
    Program to an interface.
    Ex. A list declared as the following.
    LinkedList<String> linkedList = new LinkedList<>();
    is worse than declaring 
    List<String>list = new LinkedList<>();
        the changes would be only in a single place in such case.