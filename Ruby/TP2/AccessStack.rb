class AccessStack
	def initialize
		@stack = []
		@poptimes = 0
	end

	def push(element)
		@stack << element
	end

	def pop
		raise 'Stack is empty' if empty?
		@stack.pop
		@poptimes += 1
	end

	def empty?
		@stack.size == 0
	end

	def peek
		@stack[-1]
	end

	def times_pop
		@poptimes
	end

	def times_push
		@poptimes + @stack.size
	end
end
stack = AccessStack.new
stack.push(2)
stack.push(3)
puts stack.peek # 3
puts stack.pop # 3
puts stack.empty? # false
puts stack.pop # 2
puts stack.empty? # true
puts stack.times_pop
puts stack.times_push 
puts stack.pop # Stack is empty(RuntimeError)
