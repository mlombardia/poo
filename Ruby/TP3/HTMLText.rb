module HTMLText
	def source
		raise 'Not implemented'
	end

	def to_s
		source
	end
end

class PlainText
	include HTMLText

	attr_writer :content

	def initialize(content)
		@content = content
	end

	def source
		@content
	end
end

class FormatText
	include HTMLText

	attr_reader :content, :element

	def initialize(content, element)
		@content = content
		@element = element
	end

	def source
		"<#{@element}>#{@content}</#{@element}>"
	end
end 

class BoldText < FormatText
	ELEMENT = "b"

	def initialize(content)
		super(content, ELEMENT)
	end
end

class ItalicText < FormatText
	ELEMENT = "i"

	def initialize(content)
		super(content, ELEMENT)
	end
end

class LinkText
	include HTMLText
	attr_reader :link, :content
	def initialize(link, content)
		@link = link
		@content = content
	end

	def source
		"<a href:\"#{@link}\">#{@content}</a>"
	end
end

text = PlainText.new('Hola')
bold_text = BoldText.new(text)
italic_text = ItalicText.new(text)
puts bold_text # <b>Hola</b>
puts italic_text # <i>Hola</i>
bold_italic_text = BoldText.new(italic_text)
puts bold_italic_text # <b><i>Hola</i></b>
text.content = 'ITBA'
puts bold_text # <b>ITBA</b>
puts italic_text # <i>ITBA</i>
puts bold_italic_text # <b><i>ITBA</i></b>
link_text = LinkText.new("www.itba.edu.ar", text)
link_bold_italic_text = LinkText.new("www.itba.edu.ar", bold_italic_text)
bold_link_text = BoldText.new(link_text)
puts link_text # <a href:"www.itba.edu.ar">ITBA</a>
puts link_bold_italic_text # <a href:"www.itba.edu.ar"><b><i>ITBA</i></b></a>
puts bold_link_text # <b><a href:"www.itba.edu.ar">ITBA</a></b>
text.content = 'Ejemplo'
puts link_bold_italic_text # <a href:"www.itba.edu.ar"><b><i>Ejemplo</i></b></a>
puts bold_link_text # <b><a href:"www.itba.edu.ar">Ejemplo</a></b>