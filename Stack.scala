import io.StdIn._
//import all library

val stack=new Array[Int](10)
var stackTop=(-1)
var option=(-1)
def isEmpty()=stackTop==(-1)

def isFull()=stackTop==(stack.length-1)

def newStack()=stackTop=(-1)

def printStack(){
	if (isEmpty){
		println("Stack Empty")
	}
	else{
		var i=stackTop
		while (i>=0){
			println(stack(i))
			i=(i-1)
		}
	}
}


def push(data:Int){
	//Precondition : Stack not full
	stackTop=(stackTop+1)
	stack(stackTop)=data
}


def pop():Int={
	//precondition : Stack not empty
	val data=stack(stackTop)
	stackTop=(stackTop-1)
	data
}


while (option=!0){
	println("1)Is empty: ")
	println("2)Is Full: ")
	println("3)new stack: ")
	println("4)print stack: ")
	println("5)push : ")
	println("6)pop : ")
	println("0)Quit: ")
	print("Type your option >:")
	option=readInt()

	if (option==1)println(isEmpty())
	else if (option==2)println(isFull())
	else if (option==3)newStack()
	else if (option==4)printStack()
	else if (option==5){
		if (isFull){
			println("Stack is Full")
		}
		else{
			print("Enter an integer :")
			push(readInt())
			println()
		}
	}

	else if (option==6){
		if(isEmpty()){
			println("Stack is Empty")
		}
		else{
			println(pop())
		}
	}//implemented by Hasee Amarathunga
}
