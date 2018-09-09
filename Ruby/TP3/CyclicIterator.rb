class CyclicIterator
	attr_reader :each

	def initialize(elements)
		raise 'Collection missing' if elements.nil?
		@each = Enumerator.new do |y|
			pos = 0
			loop do
				y << elements[pos % elements.size]
				pos += 1
			end
		end
	end
end

cyclic_iterator = CyclicIterator.new([1, 2, 3])
p cyclic_iterator.each.take(7)