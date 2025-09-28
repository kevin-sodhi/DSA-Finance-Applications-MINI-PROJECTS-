/*
 * 
 */

public interface AnalyzerInterface<T> {
    // T is a type parameter in Java Generics, its a placeholder for real data types
    //analyze takes an array of integers (stock prices)
    // think T as a “box” that can hold any type: Integer, Double, String, or even a custom class.
    T analyze(int[] prices); // every “analyzer” must implement analyze(int[] prices).
}
    
 