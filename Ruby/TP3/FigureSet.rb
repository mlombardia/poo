require_relative 'Point.rb'
require_relative 'Movable.rb'
require 'set'

class Figure
	include Movable
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

	def eql?(other)
		self.==(other)
	end

	def inspect
		to_s
	end

	def <=>(other)
		self.area <=> other.area
	end
end

class Rectangle < Figure
	attr_reader :top_right,:bottom_left
	def initialize(top_right, bottom_left)
		@top_right = top_right
		@bottom_left = bottom_left
	end

	def base
		(@top_right.x - @bottom_left.x).abs
	end

	def height
		(@top_right.y - @bottom_left.y).abs
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

	def ==(other)
		return false unless other.is_a? Rectangle
		@top_right == other.top_right && @bottom_left == other.bottom_left
	end

	def hash
		[@top_right, @bottom_left].hash
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

	def ==(other)
		return false unless other.is_a? Triangle
		@top == other.top && @bottom_left == other.bottom_left && @bottom_right == other.bottom_right
	end

	def hash
		[@top, @bottom_left, @bottom_right].hash
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
	attr_reader :center_point, :a, :b
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

	def ==(other)
		return false unless other.is_a? Ellipse
		@center_point == other.center_point && @a == other.a && @b == other.b
	end

	def hash
		[@center_point, @a, @b].hash
	end

	def move_up(delta)
		@center_point.y += delta
	end

	def move_down(delta)
		@center_point.y -= delta
	end

	def move_left(delta)
		@center_point.x -= delta
	end

	def move_right(delta)
		@center_point.x += delta
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

elipse = Ellipse.new(Point.new(0,1),1,2)
puts elipse
elipse.move_up(1)
puts elipse
elipse.move_down(1)
puts elipse
elipse.move_right(1)
puts elipse
elipse.move_left(1)
puts elipse