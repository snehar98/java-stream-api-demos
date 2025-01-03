# Java Stream API Tutorials

This repository provides a comprehensive guide to the Java Stream API, which is part of the `java.util.stream` package introduced in Java 8. Streams allow you to process collections of objects in a functional style.

## Table of Contents
1. [What is a Stream?](#what-is-a-stream)
2. [Stream Operations](#stream-operations)
    - [Intermediate Operations](#intermediate-operations)
    - [Terminal Operations](#terminal-operations)
3. [Stream Creation](#stream-creation)
4. [Stream API Syntax](#stream-api-syntax)

---

### What is a Stream?

A **Stream** in Java is a sequence of elements supporting sequential and parallel aggregate operations. Streams are not data structures; they are pipelines that allow data to be processed in a functional style.

- **Stream Operations**: Streams allow operations like filtering, mapping, reducing, and more.
- **Not stored in memory**: Streams don’t store data. They operate on the data provided by the source (e.g., collections, arrays).

---

### Stream Operations

#### Intermediate Operations
Intermediate operations transform a stream into another stream. They are **lazy**, meaning they do not execute until a terminal operation is invoked.

- **filter(Predicate<T> predicate)**: Filters elements based on the condition.
- **map(Function<T, R> mapper)**: Transforms elements.
- **distinct()**: Removes duplicates.
- **sorted()**: Sorts elements.
- **peek(Consumer<T> action)**: Performs an action on each element without modifying the stream.

#### Terminal Operations
Terminal operations produce a result, such as a collection or a single value, and mark the end of the stream pipeline.

- **forEach(Consumer<T> action)**: Iterates over elements.
- **collect(Collector<T, A, R> collector)**: Collects elements into a collection (e.g., List, Set).
- **reduce(BinaryOperator<T> accumulator)**: Reduces elements into a single value.
- **count()**: Counts the number of elements.
- **anyMatch(Predicate<T> predicate)**: Returns `true` if any element matches the condition.
- **allMatch(Predicate<T> predicate)**: Returns `true` if all elements match the condition.
- **noneMatch(Predicate<T> predicate)**: Returns `true` if no elements match the condition.
- **findFirst()**: Returns the first element in the stream.
- **findAny()**: Returns any element in the stream.
- **max(Comparator<T> comparator)**: Finds the maximum element.
- **min(Comparator<T> comparator)**: Finds the minimum element.

---

### Stream Creation

Streams can be created from various data sources like collections, arrays, or I/O channels.

- **From a Collection**:
   ```java
   collection.stream()
  
- **From an Array**:
    ```java
  Arrays.stream(array)
  
- **From a Range of Numbers**:
    ```java
  IntStream.range(start, end) // Generates a stream of integers

- **From a File (I/O)**:
    ```java
  Files.lines(Paths.get("file.txt"))

### Stream API Syntax

1. **Basic Syntax**:
   ```java
   collection.stream()
          .filter(condition)
          .map(transformation)
          .collect(Collectors.toList());

2. **Filtering and Mapping**:
   ```java
   collection.stream()
          .filter(condition)
          .map(transformation)
          .collect(Collectors.toList());

3. **Using forEach to Print Elements**:
   ```java
   collection.stream().forEach(action);

4. **Collecting Elements to a Set**:
   ```java
   collection.stream()
          .collect(Collectors.toSet());

5. **Reducing Elements to a Single Value**:
   ```java
   collection.stream()
          .reduce(initialValue, (a, b) -> a + b);

6. **Joining Elements**:
   ```java
   String result = collection.stream()
                          .map(String::valueOf)
                          .collect(Collectors.joining(", "));

7. **Grouping Elements**:
   ```java
   Map<Integer, List<String>> grouped = collection.stream()
                                               .collect(Collectors.groupingBy(String::length));

8. **Partitioning Elements**:
   ```java
   Map<Boolean, List<String>> partitioned = collection.stream()
                                                   .collect(Collectors.partitioningBy(s -> s.length() > 3));

9. **Summing Elements**:
   ```java
   int total = collection.stream()
                      .mapToInt(Integer::valueOf)
                      .sum();

### Conclusion

The Java Stream API simplifies processing of collections and data with a functional approach. By utilizing intermediate and terminal operations, you can express complex data manipulations in a concise and readable manner.

For more in-depth tutorials, check out the individual example files in the repository!