class Point
	attr_reader :x, :y
	def initialize(x, y)
		@x = x
		@y = y
	end

	def to_s
		"{#{@x},#{@y}}"
	end
	
	#Agregado del ejercicio 4
	def distance(other_point)
		((@x - other_point.x)**2 + (@y - other_point.y)**2)**0.5
	end
end
