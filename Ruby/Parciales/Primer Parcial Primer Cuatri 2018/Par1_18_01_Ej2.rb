module Element
	def contents
		raise 'Not implemented'
	end

	def to_s
		contents
	end

	def above(other)
		MixedElement.new(self, other)
	end

	def below(other)
		MixedElement.new(other, self)
	end
end

class TextElement
	attr_writer :text
	include Element
	
	def initialize(text)
		@text = text
	end

	def contents
		"#{@text}\n"
	end
end

class UniformElement
	attr_writer :element
	include Element

	def initialize(element, width, height)
		@element = element
		@width = width
		@height = height
	end

	def contents
		content = ''
		(1..@height).each do
			(1..@width).each do
				content += @element
			end
			content += "\n"
		end
		content
	end
end

class MixedElement
	include Element

	def initialize(above, below)
		@above = above
		@below = below
	end

	def contents
		"#{@above.contents}#{@below.contents}"
	end
end

elem1 = UniformElement.new('+', 6, 2)
elem2 = TextElement.new('hola')
elem3 = TextElement.new('mundo')
elem4 = elem1.above(elem2)
elem5 = elem3.below(elem2)
puts "elem4:\n#{elem4}\n"
puts "elem5:\n#{elem5}\n"
elem1.element = '.'
elem3.text = 'adios'
puts "elem4:\n#{elem4}\n"
puts "elem5:\n#{elem5}\n"