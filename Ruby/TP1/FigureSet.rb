require_relative 'Point.rb'

class Figure
	def initialize
		"Error"
	end

	def base
		"Not implemented"
	end

	def height
		"Not implemented"
	end

	def perimeter
		"Not implemented"
	end 

	def area
		"Not implemented"
	end

	def belongs(_point)
		"Not implemented"
	end
end

class Rectangle < Figure
	attr_reader :top_right,:bottom_left
	def initialize(top_right, bottom_left)
		@top_right = top_right
		@bottom_left = bottom_left
	end

	def base
		@top_right.x - @bottom_left.x
	end

	def height
		@top_right.y - @bottom_left.y
	end

	def perimeter
		(base * 2) + (height * 2)
	end

	def area
		base * height
	end

	def to_s
		"Rectangulo con puntos #{@top_right} y #{@bottom_left}\nBase:#{base};Altura:#{height}\nPerimetro:#{perimeter};Superficie:#{area}"
	end

	def belongs(point)
		((point.x == @top_right.x || point.x == @bottom_left.x) && (point.y >= bottom_left.y && point.y <= top_right.y)) || ((point.y == @top_right.y || point.y == @bottom_left.y) && (point.x >= bottom_left.x && point.x <= top_right.x))
	end
end

class Triangle < Figure
	attr_reader :top, :bottom_right, :bottom_left

	def initialize(top, bottom_left, bottom_right)
		@top = top
		@bottom_left = bottom_left
		@bottom_right = bottom_right
	end

	def base
		@bottom_right.x - @bottom_left.x
	end

	def height
		@top.y - @bottom_left.y
	end

	def perimeter
		side1+side2+side3
	end

	def area
		s = (side1+side2+side3)/2
		(s * (s - side1) * (s - side2) * (s - side3))**(0.5)
	end

	def to_s
		"Triangulo con puntos #{@top}, #{@bottom_left} y #{bottom_right}\nBase:#{base};Altura:#{height}\nPerimetro:#{perimeter};Superficie:#{area}"
	end

	private

	def side1
		@top.distance(@bottom_left)
	end

	def side2
		@top.distance(@bottom_right)
	end

	def side3
		@bottom_right.distance(@bottom_left)
	end
end

class Ellipse < Figure
	def initialize(center_point,a,b)
		@center_point = center_point
		@a = a
		@b = b
	end

	def area
		Math::PI * @a * @b
	end

	def to_s
		"Elipse con centro #{@center_point} y aperturas #{@a} y #{@b};Superficie:#{area}"
	end
end

class Circle < Ellipse
	def initialize(center_point, radius)
		super(center_point,radius,radius)
	end

	def to_s
		"Circulo con centro #{@center_point} y radio #{@a};Superficie:#{area}"
	end
end

top_point = Point.new(4,9)
bottom_point = Point.new(1,1)
other_point = Point.new(4,1)
belong_point = Point.new(1,2)
belong_point2 = Point.new(3,3)
my_rectangle = Rectangle.new(top_point, bottom_point)
puts my_rectangle
my_triangle = Triangle.new(top_point, bottom_point, other_point)
puts my_triangle
puts my_rectangle.belongs(belong_point)
puts my_rectangle.belongs(belong_point2)
my_ellipse = Ellipse.new(top_point,1,2)
my_circle = Circle.new(bottom_point,3)
puts my_ellipse
puts my_circle