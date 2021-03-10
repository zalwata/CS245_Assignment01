# CS245_Assignment01

Submitted by: **Aryum Jeon**

## Requirements
## Part 1 - Sorting Running times

* [x] Requirement 1: Used a minimum of ten arrays lengths: 50,000 to 500,000
* [x] Requirement 2: For each of the array lengths listed above, generated an array of random double instances. sent a copy of this array to each of the five general-purpose sorting algorithms.
* [x] Requirement 3: Collected the time down to milliseconds required to sort each array using a Java system call such as currentTimeMills()
* [x] Requirement 4: Used the times required by each of the algorithms and the size of the arrays to construct a chart.

## Video Walkthrough

Here's a walkthrough of implementation:

<img src='http://g.recordit.co/LN7X69JXrf.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

Here's a walkthrough of contructed chart(as seen in the chart below, among quadratic sort algorithms, insertion sort performs the best - used in part 2.2 due to such reason):

<img src='http://g.recordit.co/lWMA3VyvLl.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

## Part 2 - Quicker than Quicksort

* [x] Requirement 1: Implemented a randomised version of quicksort.
* [x] Requirement 2: Chosen quadratic sort exclusively based on the speed of the algorithm.
* [x] Requirement 3: Implemented modified version of the quadratic sort.
* [x] Requirement 4: Created a hybrid algorithm. 

* [x] Implimentation: runs successfully with the source files and data provided. produces expected results. no deviation from the expected results.
* [x] Efficiency: implementation is maximally efficient with respect to running time and required space.
* [x] Style: implementation is well-commented. used intelligently-named variables and functions.
* [x] Running time: implementation's true running time matches my assertion of its running time in analysis.txt.
* [x] Space analysis: implementation's true space use matches my assertion of the amount of space actually required in analysis.txt.

## Video Walkthrough

Here's a walkthrough of randomised quicksort vs quadratic sort for array size 2500 ~ 50,000:

<img src='http://g.recordit.co/UhoUBfiQIq.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

Here's a walkthrough of randomised quicksort vs quadratic sort for array size 2500 ~ 50,000 to determine threshhold length of the array when the quadratic sort algorithm takes over from the quicksort algorithm:

<img src='http://g.recordit.co/eIpXYCFNtL.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />


## Notes

* experimental data is not consistant upon repetition.
