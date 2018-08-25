require_relative 'Point.rb'

class Bag
	def initialize
		@bag = Hash.new {0}
	end

	def to_s
		@bag.to_s
	end

	def add(elem)
		@bag[elem] += 1
	end

	def size
		@bag.length
	end

	def count(elem)
		@bag[elem]
	end

	def delete(elem)
		@bag[elem] -= 1 if @bag.key? elem
		@bag.delete(elem) if @bag[elem].zero?
		@bag[elem]
	end
end

my_bag = Bag.new
my_bag.add(Point.new(0,0))
my_bag.add(Point.new(1,2))
my_bag.add(Point.new(3,4))
my_bag.add(Point.new(1,2))
puts my_bag
puts my_bag.size
puts my_bag.count(Point.new(1,2))
puts my_bag.delete(Point.new(1,2))
puts my_bag
puts my_bag.delete(Point.new(1,2))
puts my_bag

=begin
{{0,0}=>1, {1,2}=>2, {3,4}=>1}
3
2
1
{{0,0}=>1, {1,2}=>1, {3,4}=>1}
0
{{0,0}=>1, {3,4}=>1}
=end