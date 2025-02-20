
Class
    should be a noun.
    concrete thing:- Dog,House,Calculator
    could also be abstract:- EmailSender, SalaryAlgo.
    specific /not vague like Stuff,Thing,Utility.
    Class should have a single responsibility.
    Not breakable into further smaller things.
    
    
Variables
    never a single letter
    boolean variable should have  'is' as a prefix
    constants should be ALL_CAPS with underscore between words.

Method
    justifies the intent.
    functionality should be understood by the name itself.
    Tip : if the method code has to be read to understand what the method does it can be named better
    Tip : Verb       + Noun
          (Do What?)   (To What?)
          load          page               = loadPage()
          set           price              = setPrice()
          convert       currency           = convertCurrency()
    Even better
          load          customer details   = loadCustomerDeails()
          
Anti Practices!!!
    What the method should not do
    Method should only do what it says according to it's specified name.
    if it changes the state of a global variable or a constant ... remove it.
    Abbreviations (only universal)
    