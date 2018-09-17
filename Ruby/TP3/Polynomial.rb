class InvalidGradeError < StandardError
	def message
		'Grado Invalido'
	end
end

class InvalidValueError < StandardError
	def message
		'Valor Invalido'
	end
end

class InvalidIndexError < StandardError
	def message
		'Indice Invalido'
	end
end

class Polynomial
	def initialize(grade)
		raise InvalidGradeError unless grade.is_a?(Integer) && grade > 0
		@polynomial = Array.new(grade,0)
	end

	def set(index, value)
		raise InvalidIndexError unless index.is_a?(Numeric) && index >= 0 && index <= @polynomial.size
		raise InvalidValueError unless value.is_a? Numeric
		@polynomial[index] = value
	end

	def eval(x)
		raise InvalidValueError unless x.is_a?(Numeric)
		result = 0
		(0..@polynomial.size-1).each {|i| result += @polynomial[i] * x ** i}
		result
	end
end

fourth_grade_pol = Polynomial.new(4)
fourth_grade_pol.set(2, 3.1)
fourth_grade_pol.set(3, 2)
puts fourth_grade_pol.eval(2) # 28.4
puts Polynomial.new(3).eval(5) # 0
begin
	Polynomial.new(4.5)
rescue InvalidGradeError => e
	puts e.message
end

begin
	fourth_grade_pol.eval('Hola')
rescue InvalidValueError => e
	puts e.message
end

fourth_grade_pol.set(7, 15)

=begin
28.4
0
Grado Invalido
Valor Invalido
/ej2.rb:28:...:Indice Invalido
=end
