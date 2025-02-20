Cyclomatic Complexity

    If,for,while,try,catch 

Avoid Returning Null

    List<String> getSomeData(){
    //code        
        return null;
    }
        
If returned null

    1) Null Pointer Exception can arise.
    2) Each time someone calls for the code, the person has to know that the code returns null and hence has to write    
        list!=null or list.size()!=0
        In any case this increases the cyclomatic complexity of the code
        for any number of times this method is called.
        
        Simply 
        
        Collection.emptyList(); could be used instead.
        
Do not use (-1,0,1) integers to return, as not universal. 

Number of arguments 
    
    0-2 (Okay)
    3   (Avoid)
    4+  (Refactor)
    
For more number of arguements :- <b>Builder Pattern</b>
    
Good to FAIL FAST & FAIL EARLY. 
    
