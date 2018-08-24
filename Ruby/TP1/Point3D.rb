class Point3D
	attr_reader :x, :y, :z
	def initialize(x,y,z)
		@x = x
		@y = y
		@z = z
	end

	def to_s
		"{#{@x},#{@y},#{@z}}"
	end

	def distance(other_point)
		((@x - other_point.x)**2 + (@y - other_point.y)**2 + (@z - other_point.z)**2)**0.5
	end
end

my_point = Point3D.new(2,-1, 6)
other_point = Point3D.new(1, 1, 4)
puts my_point
puts my_point.distance(other_point)