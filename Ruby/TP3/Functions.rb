module Function
	def evaluate(_x)
		raise 'Not implemented'
	end
end

class QuadraticFunction
	include Function

	def initialize(a,b,c)
		@a = a
		@b = b 
		@c = c
	end

	def evaluate(x)
		@a * (x**2) + @b * x + @c
	end
end

class LinearFunction < QuadraticFunction
	include Function

	def initialize(a,b)
		super(0,a,b)
	end
end

class SineFunction
	include Function
	def evaluate(x)
		Math.sin(x)
	end
end

class CompositeFunction
	def initialize(f1, f2)
		@f1 = f1
		@f2 = f2
	end

	def evaluate(x)
		@f2.evaluate(@f1.evaluate(x))
	end
end

f1 = LinearFunction.new(2, 0) # y = 2x
f2 = QuadraticFunction.new(1, 0, 0) # y = 2x^2
f3 = CompositeFunction.new(f1, f2) # y = (2x)^2
puts f3.evaluate(1) # 4
puts f3.evaluate(2) # 16
f4 = SineFunction.new # y = sin(x)
f5 = CompositeFunction.new(f1, f4) # y = sin(2x)
f6 = CompositeFunction.new(f5, f1) # y = 2 sin(2x)
puts f6.evaluate(0) # 0.0
puts f6.evaluate(Math::PI / 4.0) # 2.0