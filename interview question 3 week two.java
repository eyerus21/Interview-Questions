
//explain why java prohibits generic array creation?
//The problem is that it allows a hole in the type system, since ArrayList<T>[] 
//can be casted to Object[] and then you can put an ArrayList<U> in the array, where U != T.
//This is one of major holes in Java's generics, where arrays are covariant and generics are invariant.
//Covariant: It means you can assign subclass type array to its superclass array reference. For instance,
//Object objectArray[] = new Integer[10]; // it will work fine
//Invariant: It means you cannot assign subclass type generic to its super class generic reference 
//because in generics any two distinct types are neither a subtype nor a supertype. For instance,
//List<Object> objectList = new ArrayList<Integer>(); // won't compile.