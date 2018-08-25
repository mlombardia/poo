class Point
	attr_reader :x, :y
	def initialize(x, y)
		@x = x
		@y = y
	end

	def to_s
		"{#{@x},#{@y}}"
	end
	
	def distance(other_point)
		((@x - other_point.x)**2 + (@y - other_point.y)**2)**0.5
	end

	def ==(other)
		return false unless other.is_a? Point
		@x == other.x && @y == other.y
	end

	def eql?(other)
		self.==(other)
	end

	def hash
		[x, y].hash
	end

	def inspect
		to_s
	end
end

=begin
my_point = Point.new(1,2)
puts my_point == my_point
puts my_point == Point.new(1, 2)
puts my_point != Point.new(3, 4)
puts my_point == 'Hola Mundo'
=end