class A
	def m_1
		self.m_3
	end

	def m_2
		2
	end

	def m_3
		m_2
	end
end

class B < A
	def m_1
		super
	end

	def m_2
		m_2
	end

	def m_3
		3
	end
end

class C < B
	def m_1
		1
	end

	def m_2
		super
	end

	def m_3
		super.m_3
	end
end

a = A.new
puts a.m_1
puts a.m_2
puts a.m_3

b = B.new
puts b.m_1
#puts b.m_2
puts b.m_3

c = C.new
puts c.m_1
#puts c.m_2
puts c.m_3