module Element
	def contents
		raise 'Not Implemented'
	end

	def to_s
		contents
	end

	def above(other)
		AboveTextElement.new(self, other)
	end

	def below(other)
		AboveArrayElement.new(other, self)
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
		raise 'Not Implemented'
	end
end

class AboveTextElement < MixedElement

	def initialize(above, below)
		super(above, below)
	end

	def contents
		content = ''
		content += @above.contents
		@below.each{|i| content += i.contents}
		content
	end
end

class AboveArrayElement < MixedElement

	def initialize(above, below)
		super(above, below)
	end

	def contents
		content = ''
		@above.each{|i| content += i.contents}
		content += @below.contents
		content
	end
end

elem1 = UniformElement.new('+', 6, 2)
elem2 = TextElement.new('hola')
elem3 = TextElement.new('mundo')
elem4 = UniformElement.new('*', 6, 2)
elem5 = TextElement.new('adios')
elem6 = elem3.above([elem1, elem2])
elem7 = elem3.below([elem4, elem5])
puts "elem6:\n#{elem6}\n"
puts "elem7:\n#{elem7}\n"
elem1.element = '.'
elem3.text = 'fin'
puts "elem6:\n#{elem6}\n"
puts "elem7:\n#{elem7}\n"