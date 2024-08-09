# Data Structure Sorting Algorithms in Java

This repository contains various sorting algorithms coded to help understand and analyze different sorting techniques. The implementations focus on educational purposes, demonstrating how these algorithms work, their efficiency, and their use in real-world scenarios.

### Key Features

- **Educational Implementations:** Designed to illustrate the logic and workings of each algorithm.
- **Performance Comparison:** Provides insights into the efficiency of different sorting methods.
- **Java Code:** All implementations are written in Java, demonstrating key programming concepts.

## Usage

To use the sorting algorithms, compile the Java files and run the desired sorting algorithm with the appropriate input. You can modify the `Main` class to test different algorithms with custom data.

### Example Usage

```java
import algorithms.BubbleSort;
import utils.ArrayUtils;

public class Main {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort.sort(array);
        ArrayUtils.printArray(array);
    }
}
```

## How to Run

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/yourusername/data-structure-sorting-algorithms.git
   ```

2. **Navigate to the Repository Directory:**

   ```bash
   cd data-structure-sorting-algorithms
   ```

3. **Compile the Java Files:**

   ```bash
   javac src/algorithms/*.java src/utils/*.java
   ```

4. **Run the Desired Algorithm:**

   ```bash
   java Main
   ```

## Contributing

Contributions are welcome! If you have any improvements or additional sorting algorithms to add, please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -am 'Add new feature'`).
5. Push to the branch (`git push origin feature-branch`).
6. Create a new Pull Request.
