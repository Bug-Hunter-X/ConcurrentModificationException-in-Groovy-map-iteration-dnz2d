# Groovy Map Iteration Bug

This repository demonstrates a subtle bug related to modifying a Groovy map while iterating over it using the `each` method.  The example shows how removing an element during iteration doesn't behave as intuitively expected, due to `each` operating on a snapshot of the map's entries.

## Bug Description

The `bug.groovy` file contains code that attempts to remove an entry from a map while iterating.  This leads to unexpected results, as the removal does not affect the iteration's subsequent steps. This can be particularly troublesome when dealing with larger maps or more complex iteration logic.

## Solution

The `bugSolution.groovy` file provides a corrected version. Instead of directly modifying the map during iteration, it uses a more appropriate approach to achieve the desired outcome.   This demonstrates a more robust method for handling map modifications during iteration to avoid unexpected behavior.
