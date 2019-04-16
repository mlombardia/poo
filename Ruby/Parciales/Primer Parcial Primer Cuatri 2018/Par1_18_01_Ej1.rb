class A
	def m_1
		self.m_2
	end

	def m_2
		2
	end

	def m_3
		m_1
	end
end

class B < A
	def m_1
		1
	end

	def m_2
		super.m_2
	end

	def m_3
		super
	end
end

class C < B
	def m_1
		super
	end

	def m_2
		2
	end

	def m_3
		self.m_3
	end
end

=begin
a=A.new
puts a.m_1
puts a.m_2
puts a.m_3

=begin

b=B.new
puts b.m_1
puts b.m_2
puts b.m_3

=end
c=C.new
puts c.m_1
puts c.m_2
puts c.m_3
