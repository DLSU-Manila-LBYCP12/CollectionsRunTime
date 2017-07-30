# CollectionsRunTime: ArrayList vs. LinkedList vs. Vector (Java)

```
run:
Collection size: 1000000

ArrayList construction time:0.034976962 seconds. [BEST]
ArrayList getting time (middle):8.864E-6 seconds. [BEST]
ArrayList adding time (last):9.33E-7 seconds. [BEST-tie]
ArrayList inserting time: (first)0.001189661 seconds.
ArrayList inserting time: (middle)5.72437E-4 seconds. [BEST]
ArrayList deleting time (middle):0.009286353 seconds.

MyList construction time:0.038049554 seconds.
MyList getting time (middle):2.6592E-5 seconds.
MyList adding time (last):9.33E-7 seconds. [BEST-tie]
MyList inserting time: (first)0.008709718 seconds.
MyList inserting time: (middle)0.01184389 seconds.
MyList deleting time (middle):0.014601104 seconds
 
LinkedList construction time:0.10296958 seconds.
LinkedList getting time (middle):0.006184371 seconds.
LinkedList adding time (last):9.33E-7 seconds. [BEST-tie]
LinkedList inserting time (first):2.7059E-5 seconds. [BEST]
LinkedList inserting time (middle):0.005071221 seconds.
LinkedList deleting time (middle):0.009330674 seconds.
 
Vector construction time:0.051340632 seconds.
Vector getting time (middle):2.1927E-5 seconds.
Vector adding time (last):3.266E-6 seconds.
Vector inserting time: (first)0.001020309 seconds.
Vector inserting time: (middle)6.66211E-4 seconds.
Vector deleting time (middle):0.008517972 seconds. [BEST]
BUILD SUCCESSFUL (total time: 0 seconds)
```

## Lates Run:

```
run:
Collection size: 100000

ArrayList construction time:0.006973746 seconds. [BEST]
ArrayList getting time (middle):6.532E-6 seconds. [BEST]
ArrayList adding time (last):9.33E-7 seconds. [BEST-tie]
ArrayList inserting time: (first)1.37161E-4 seconds.
ArrayList inserting time: (middle)5.925E-5 seconds. [BEST]
ArrayList deleting time (middle):0.006402708 seconds.
 
MyArrayList construction time:0.016084681 seconds.
MyArrayList getting time (middle):1.7729E-5 seconds.
MyArrayList adding time (last):9.33E-7 seconds. [BEST-tie]
MyArrayList inserting time: (first)0.004240791 seconds.
MyArrayList inserting time: (middle)4.60935E-4 seconds.
MyArrayList deleting time (middle):0.002969953 seconds.
 
LinkedList construction time:0.0211643 seconds.
LinkedList getting time (middle):0.001610941 seconds.
LinkedList adding time (last):1.866E-6 seconds.
LinkedList inserting time (first):4.3388E-5 seconds. 
LinkedList inserting time (middle):0.001529298 seconds.
LinkedList deleting time (middle):0.015415206 seconds.
 
MyLinkedListSlow construction time:10.968452994 seconds.
MyLinkedListSlow getting time (middle):1.6562E-4 seconds.
MyLinkedListSlow adding time (last):2.85518E-4 seconds.
MyLinkedListSlow inserting time (first):4.5254E-5 seconds.
MyLinkedListSlow inserting time (middle):1.33895E-4 seconds.
MyLinkedListSlow deleting time (middle):1.95944E-4 seconds.  
 
MyLinkedList construction time:0.007270927 seconds.
MyLinkedList getting time (middle):0.001868467 seconds.
MyLinkedList adding time (last):9.33E-7 seconds. [BEST-tie]
MyLinkedList inserting time (first):2.1927E-5 seconds. [BEST]
MyLinkedList inserting time (middle):0.002728289 seconds.
MyLinkedList deleting time (middle):0.002510418 seconds.
 
Vector construction time:0.019737174 seconds.
Vector getting time (middle):1.7262E-5 seconds.
Vector adding time (last):1.399E-6 seconds.
Vector inserting time: (first)1.55356E-4 seconds.
Vector inserting time: (middle)5.925E-5 seconds.
Vector deleting time (middle):0.006078934 seconds.
BUILD SUCCESSFUL (total time: 11 seconds)
```
