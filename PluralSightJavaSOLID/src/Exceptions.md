Avoid catching Throwable, Exception(Parent class), and Null Pointers.

They are not meant to be caught but handled also avoided in the first place.

Also after catching the exception there is no use in only throwing them again in the catch block
we can log it and add usual information.

    log.error(e)
    throw new SomeException("Cause&Avoidance")
   
Exceptions should not be handled in the finally block as it could mask the original exception.
For.eg.

    try{
    int result = 1/0; //Arithmetic Expression
    }
    finally{
        cleanup();
    }
    
    void cleanup(){
        throw new IllegalStateException("Some Message");
    }

As seen above, actual thrown exception is arithmetic but illegal state exception will be the output,
as will lead to code confusion.    
    
    