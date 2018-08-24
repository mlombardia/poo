class ComplexNumber
	attr_reader :real, :imaginary
	def initialize(real, imaginary)
		@real = real
		@imaginary = imaginary
	end

	def to_s
		if(@imaginary > 0)
			"#{@real} + #{@imaginary}i"
		elsif(@imaginary < 0)
			"#{@real} - #{@imaginary.abs}i"
		else
			"#{@real}"
		end
	end

	def +(other)
		ComplexNumber.new(@real + other.real, @imaginary + other.imaginary)
	end
end

first_complex = ComplexNumber.new(2, -1)
second_complex = ComplexNumber.new(3, 0)
res_complex = first_complex + second_complex
puts res_complex