This code and files in this directory are taken from the course
[Refactoring Best Practices](https://app.pluralsight.com/library/courses/java-refactoring-best-practices/table-of-contents) </a>
by Andrejs Doronins on Pluralsight platform.

Code Smell Taxonomy

- [ ] Bloater<br>
    - [x] method bloaters 
    - [ ] class bloaters 
- [ ] Object Oriented Abusers<br>
- [ ] Change Preventers<br>
- [ ] Coupler<br>
- [ ] Dispensables  

<pre><code>adasdas</code></pre>
<pre><code>foo→baz→→bim
</code></pre>
<pre><code>  foo→baz→→bim
</code></pre>
:smile:
   
###Bloaters
 #####Method Bloaters
 
 >0-10 lines Optimal <br>10-20 OK.<br> 20+ Refactor.

 #####Class Bloaters
 
 >SRP <br> 1 class 1 functionality.
 #long parameters list
>4 parameters refactor

break down methods
keep it simple
primitive obssession.(String,int,float,double)
 Passing the object as a whole, instead of breaking down
 into smaller pieces and passing the values acquired by getter methods.
    (Preserve the object)
    
Introduce object
    If a class containing two arguments can be introduced then,
    
    
#Object Oriented Abuser
Conditionals
