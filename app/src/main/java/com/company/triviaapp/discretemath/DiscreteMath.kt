package com.company.triviaapp.discretemath

class DiscreteMath {
    val sets = listOf(
        Pair(
            "What is a Set?", """
        A collection of objects
        
        Do not have to be ordered
        
        Duplicates are not allowed
    """.trimIndent()
        ),
        Pair(
            "How do you build a Set of all even numbers?", """
        { n | n is positive even integer }
        
        { 2n + 2 | n is integer, n >= 0 }
        
        { 2n | n is integer, n >= 1 } 
    """.trimIndent()
        ),
        Pair(
            "What are objects in a set?", """
        Elements
        
        x ∈ A means x is an element of A
        
        x ∉ A means x is NOT an element of A
    """.trimIndent()
        ),
        Pair(
            "What is an empty set?", """
        Set with no elements
        
        Denoted by { } or ϕ
    """.trimIndent()
        ),
        Pair(
            "What makes sets equal?", """
        Sets are equal if they have the same elements
        
        Order does not matter
    """.trimIndent()
        ),
        Pair(
            "What are subsets?", """
        Set A is a subset of B if EVERY element of A is also in B
        
        Denoted by A ⊆ B
        
        Empty set is subset of any set
        
        Any set is subset of itself
    """.trimIndent()
        ),
        Pair(
            "What is size of a set?", """
        Number of elements
        
        Size of A denoted by |A|
        
        AKA cardinality
        
        Can be finite or infinite
    """.trimIndent()
        ),
        Pair(
            "What is a power set?", """
        Set of all subsets of a set
        
        Power set of A is denoted by P(A) or 2ᴬ
        
        If A has n elements, A has 2ⁿ subsets        
    """.trimIndent()
        ),
        Pair(
            "What is a cartesian product?", """
        For sets A & B: set of all possible ordered pairs 
        
        Denoted by A ✕ B
        
        Order matters
           
        If A has m elements & B has n elements -> A ✕ B has m * n pairs
    """.trimIndent()
        ),
        Pair(
            "What are all set operations?", """
        Union
        
        Intersection
        
        Difference
           
        Complement
    """.trimIndent()
        ),
        Pair(
            "What is a union of a set?", """
        Union of sets A and B: set containing elements in either A or B or both
        
        Union of A and B is denoted by A ∪ B
    """.trimIndent()
        ),
        Pair(
            "What is a intersection of a set?", """
        Intersection of sets A and B: set containing only elements in both A and B
        
        Union of A and B is denoted by A ∩ B
        
        Disjoint: means A ∩ B is empty
    """.trimIndent()
        ),
        Pair(
            "What is a difference of a set?", """
        Difference of sets A and B: set containing only elements in A and NOT B
        
        Difference of A and B is denoted by A − B
                
        Order matters
    """.trimIndent()
        ),
        Pair(
            "What is a complement of a set?", """
        Complement of sets A: set of all elements not in A
        
        Complement of A denoted by Aᶜ
                
        To find complement must know universe
    """.trimIndent()
        ),
        Pair(
            "Write a set containing odd #s from 1 to 9", """
        { x : 1 ≤ x ≤ 9 and (x % 2) ≠ 0 }
    """.trimIndent()
        ),
        Pair(
            "What is a proper subset?", """
        Subset of BUT not equal to

        Denoted by ⊂ and ⊄
    """.trimIndent()
        ),
        Pair(
            "What is a singleton or unit set?", """
        Set containing only one element
    """.trimIndent()
        ),
        Pair(
            "What are equivalent sets?", """
        Sets that share the same size, regardless of elements

        Example: a set of {1, 2, 6} is equivalent to {16, 17, 22}
    """.trimIndent()
        ),
        Pair(
            "What are overlapping sets?", """
        Sets that share at least one common element

        Example: a set of {1, 2, 6} is equivalent to {16, 17, 22}
    """.trimIndent()
        ),
        Pair(
            "What is the Cartesian product of A = {1, 2} and B = {a, b, c}?", """
        A ✕ B

        {(1, a), (1, b), (1, c), (2, a), (2, b), (2, c)}
    """.trimIndent()
        ),
        Pair(
            "What set does Z⁺ represent?", """
        Set of positive integers
        
        {1, 2, 3, ....}
    """.trimIndent()
        ),
        Pair(
            "Is 0 ∈ Z⁺ true?", """
        No
        
        Z⁺ represents the set {1, 2, 3, ....}
        
        Does not include 0
    """.trimIndent()
        ),
        Pair(
            "Is 5 ∈ R⁺ true?", """
        Yes
        
        R⁺ represents all positive real numbers
    """.trimIndent()
        ),
        Pair(
            "Is 0 ∈ Q true?", """
        Yes
        
        Q represents all rational numbers
        
        0 = 0 / 1
    """.trimIndent()
        ),
        Pair(
            "What set does Z represent?", """
        Set of positive and negative integers including 0
        
        {..., -2, -1, 0, 1, 2, 3, ....}
    """.trimIndent()
        ),
        Pair(
            "What set does N represent?", """
        Set of natural numbers
        
        {0, 1, 2, 3, ....}
    """.trimIndent()
        ),
        Pair(
            "What set does Q represent?", """
        Set of rational numbers
        
        A rational number is any number that can be written as the ratio of two integers
        
        { p / q | p ϵ Z, q ϵ Z, q ≠ 0)
    """.trimIndent()
        ),
        Pair(
            "What set does R represent?", """
        Set of real numbers
        
        A real number is any number that can take any value on a number line - rational and irrational
        
        R = { x | x is a real number }
    """.trimIndent()
        ),
        Pair(
            "What is the Set Identity Law?", """
        Intersection of anything with the universe = itself
        
        A ∩ U = A
        
        Intersection of anything with the empty set = itself
        
        A ∪ ϕ = A
    """.trimIndent()
        ),
        Pair(
            "What is the Set Domination Law?", """
        Intersection of anything with the universe = universe
        
        A ∪ U = U
        
        Intersection of anything with the empty set = empty set
        
        A ∩ ϕ = ϕ
    """.trimIndent()
        ),
        Pair(
            "What is the Set Idempotent(Id-emp-oh-tent) Law?", """
        Union of anything with itself = itself
        
        A ∪ A = 0
        
        Intersection of anything with itself = itself
        
        A ∩ A = A
    """.trimIndent()
        ),
        Pair(
            "What is the Set Complement Law?", """
        Union of anything and its complement = universe
        
        A ∪ Aᶜ = U
        
        The intersection of anything with its complement = empty set, and they are disjoint
        
        A ∩ Aᶜ = ϕ
    """.trimIndent()
        ),
        Pair(
            "What is the Set Complementation Law?", """
        The complement of a complement is the original set
        
        (Aᶜ)ᶜ = A
    """.trimIndent()
        ),
        Pair(
            "What is the Set Commutative Law?", """
        The union or intersection of two sets are equal to each other no matter how you order them
        
        A ∪ B = B ∪ A
    """.trimIndent()
        ),
        Pair(
            "What is the Set Associative Law?", """
        If you take three sets and union them, the order doesn't matter
        
        A ∪ (B ∪ C) = (A ∪ B) ∪ C
    """.trimIndent()
        ),
        Pair(
            "What is the Set Distributive Law?", """    
        Distributing the intersection over a union of sets is the same as intersecting each then taking the union        
                    
        A ∩ (B ∪ C) = (A ∩ B) ∪ (A ∩ C)
        
        Same the other way around
        
        A ∪ (B ∩ C) = (A ∪ B) ∩ (A ∪ C)
    """.trimIndent()
        ),
        Pair(
            "What are the Set De Morgan's Law?", """
        Complementing the union of two sets = intersecting the individually complemented sets
        
        (A ∪ B)ᶜ = Aᶜ ∩ Bᶜ
        
        Same the other way around
        
        (A ∩ B)ᶜ = Aᶜ ∪ Bᶜ
    """.trimIndent()
        ),
        Pair(
            "What is the Set Absorption Law?", """
        Taking the union of A with the intersection of A and B results in A
        
        A ∪ (A ∩ B) = A
        
        Same the other way around
        
        A ∩ (A ∪ B) = A
    """.trimIndent()
        ),
        Pair(
            "How would you draw a Venn diagram representing the set of vowels in the alphabet?", """
        Draw a rectangle to indicate the universe set U, representing 26 characters
        
        Draw a circle within, the circle should contain {a, e, i, o, u}
    """.trimIndent()
        ),
        Pair(
            "How many elements does a power set of a set containing 3 elements have?", """
        8
        
        It is 2 raised to the nth power, 2 * 2 * 2 = 8
    """.trimIndent()
        ),
        Pair(
            "What set does {(n, n + 1) | n ∈ Z⁺} create? [Set of ordered pair of n and n + 1 where n is an element of Z+]", """
        {(1, 2), (2, 3), (3, 4), ...}
    """.trimIndent()
        ),
        Pair(
            "What set does {2n | n ∈ Z} create? [Set of 2n where n is an element of Z]", """
        {..., -4, -2, 0, 2, 4, ...}
    """.trimIndent()
        ),
        Pair(
            "How many elements does a power set of a power set of the empty set have?", """
        2
        
        The power set of the empty set has a size 1, of which the power set of is 2 * 1 = 2
    """.trimIndent()
        ),
        Pair(
            "Is 5 ϵ ϕ?", """
        No
        
        No item is an element of the empty set
    """.trimIndent()
        ),
        Pair(
            "What set operation is this: { x | x ϵ A ∧ x ∉ B }?", """
        Difference ( A - B )
        
        Set containing elements of A which are not elements of B
    """.trimIndent()
        ),
        Pair(
            "What set operation is this: { x | x ∉ A }?", """
        Complement of A ( Aᶜ )
        
        • This returns a set of all elements in the universe which are not in A
    """.trimIndent()
        ),
        Pair(
            "What is the difference of A = {1, 3, 5} and B = {1, 2, 3}?", """
        5
        
        1, 3 are in set B
    """.trimIndent()
        ),
        Pair(
            "Write { 1, 8, 27, 64, 125, ... } in set builder notation", """
        A = { x³ | x ∈ Z⁺ }
        
        x cubed such that x is an element of all positive integers
    """.trimIndent()
        ),
        Pair(
            "Write { 0, 3, 6, 9, 12, ..., 300 } in set builder notation", """
        A = { 3x | 0 ≤ x ≤ 100 }
        
        3x such that x is greater than or equal to 0 and less than or equal to 100
    """.trimIndent()
        ),
        Pair(
            "Write { 4, 7, 10, 13, 16, ... } in set builder notation", """
        A = { 4 + 3x | x ∈ N }
        
        3x such that x is greater than or equal to 0 and less than or equal to 100
    """.trimIndent()
        ),
        Pair(
            "Write { (1, 1), (2, 2), (3, 3), (4, 4) ... } in set builder notation", """
        A = { (x, x) | x ∈ Z⁺ }
        
        Ordered pair of (x, x) such that x is an element of the set of positive integers
    """.trimIndent()
        ),
        Pair(
            "Describe (A ∪ B) ∩ C as a Ven diagram", """
        3 circles inside of a rectangle box
        
        Anywhere in which A and B overlap into C is shaded as that is the union of A and B and where it overlaps with C is the intersection
    """.trimIndent()
        ),
        Pair(
            "Describe (A - B) - C as a Ven diagram", """
        3 circles inside of a rectangle box
        
        Only the area where A is not overlapped by B or C is shaded
    """.trimIndent()
        ),
    )

    val logic = listOf(
        Pair("What does ∧ mean?",
        """
           Logical AND 
           
           Conjunction
        """.trimIndent()),
        Pair("What does ∨ mean?",
            """
           Logical OR
           
           Inclusive
           
           Disjunction
        """.trimIndent()),
        Pair("What does ¬ mean?",
            """
           Logical negation
        """.trimIndent()),
        Pair("Describe how to create a truth table for (A ∨ B) ∧ B",
            """
           Create four columns: A, B, A ∨ B, (A ∨ B) ∧ B
           
           Create four rows of all possibilities of when A and B can be true or false
           
           Evaluate (A ∨ B) then evaluate that by ∧ B
        """.trimIndent()),
        Pair("What does ~ mean?",
            """
           Not
           
           Example: If A = T, ~A = F
        """.trimIndent()),
        Pair("What does it mean if two statements have the same truth table?",
            """
           They are logically equivalent
        """.trimIndent()),
        Pair("What does A ⇒ B mean?",
            """
           If A then B
           
           Returns true or false by asserting when A is true, B should also be true
           
           If A is false, returns true anyway because of the implication
        """.trimIndent()),
        Pair("What does A ⇔ B mean?",
            """
           If A then B AND if B then A
           
           Returns true or false, true means A and B are logically equivalent
           
           A if and only if B
        """.trimIndent()),
    )
    val relations = listOf(
        Pair("What is a binary relation from A to B?", """
            Subset of their Cartesian Product, A × B
            
            Set R of ordered pairs
            
            Relation denoted by (a, b) ∈ R or a R b
            
            When (a, b) ∈ R, a is related to b by R
        """.trimIndent()),
        Pair("What is the domain of a relation?", """
            The set of a ∈ A such that there is a b ∈ B with (a, b) ∈ R 
            
            Relation denoted by (a, b) ∈ R
        """.trimIndent())
    )
}