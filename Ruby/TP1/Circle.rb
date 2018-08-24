require_relative 'Point.rb'
class Circle
	def initialize(center_point, radius)
		@center_point = center_point
		@radius = radius
	end

	def to_s
		"Circulo con centro en #{@center_point} y radio #{@radius}"
	end
end

my_circle = Circle.new(my_point, 3)
puts my_circle