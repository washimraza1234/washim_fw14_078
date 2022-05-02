package com.evaluation4.q2;

public class FixDeadlock {

}



/*
	Following are points to avoid deadlocks:-
	
1. We must avoid giving locks to multiple threads, this is the main reason for a deadlock condition.
   It normally happens when you give locks to multiple threads.

2. The locks should be given to the important threads.
   Giving locks to the unnecessary threads that cause the deadlock condition.

3. A deadlock usually happens when one thread is waiting for the other to finish. 
In this case, we can use join with a maximum time that a thread will take.

*/