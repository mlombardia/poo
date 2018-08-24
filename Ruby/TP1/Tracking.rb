class A
	def m_1
		m_3
	end

	def m_2
		10
	end

	def m_3
		5
	end

	def m_4
		m_4
	end
end

=begin
a = A.new
p a.m_1
p a.m_2
p a.m_3
p a.m_4
p a.m_5
p a.m_6
p a.m_7
=end

class B < A
	def m_1
		8
	end

	def m_2
		super.m_1
	end

	def m_4
		20
	end

	def m_5
		m_3
	end

	def m_7
		super.m_4
	end
end

=begin
b = B.new
p b.m_1
#p b.m_2
p b.m_3
p b.m_4
p b.m_5
#p b.m_6
p b.m_7
=end


class C < B
	def m_1
		super
	end

	def m_2
		m_6
	end

	def m_6
		3
	end
end

=begin
c = C.new
p c.m_1
p c.m_2
p c.m_3
p c.m_4
p c.m_5
p c.m_6
p c.m_7
=end

class D < B
	def m_1
		super.m_3
	end

	def m_3
		2
	end

	def m_5
		m_4
	end
end

d = D.new
#p d.m_1
#p d.m_2
p d.m_3
p d.m_4
p d.m_5
#p d.m_6
p d.m_7

