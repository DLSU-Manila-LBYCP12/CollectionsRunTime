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
