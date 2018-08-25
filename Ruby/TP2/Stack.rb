class Stack
	def initialize
		@stack = []
	end

	def push(element)
		@stack << element
	end

	def pop
		raise 'Stack is empty' if empty?
		@stack.pop
	end

	def empty?
		@stack.size == 0
	end

	def peek
		@stack[-1]
	end
end
stack = Stack.new
stack.push(2)
stack.push(3)
puts stack.peek # 3
puts stack.pop # 3
puts stack.empty? # false
puts stack.pop # 2
puts stack.empty? # true 
puts stack.pop # Stack is empty(RuntimeError)