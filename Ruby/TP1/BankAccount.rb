class BankAccount
	def initialize
		raise 'Not implemented'
	end

	def deposit(_money)
		raise 'Not implemented'
	end

	def extract(_money)
		raise 'Not implemented'
	end
end

class CheckingAccount < BankAccount
	def initialize(id)
		@id = id
		@money = 0
	end

	def deposit(money)
		@money += money
		"Dinero depositado. Monto actual: #{@money}"
	end

	def extract(money)
		@money -= money
		"Dinero extraido. Monto actual: #{@money}"
	end
end

class SavingsAccount < BankAccount
	def initialize(id)
		@id = id 
		@money = 0
	end

	def deposit(money)
		@money += money
		"Dinero depositado. Monto actual: #{@money}"
	end

	def extract(money)
		raise 'Insufficient funds' unless money <= @money
		@money -= money
		"Dinero extraido. Monto actual: #{@money}"
	end
end

savings = SavingsAccount.new(1)
checking = CheckingAccount.new(2)
puts savings.deposit(300)
puts savings.deposit(300)
puts savings.extract(500)
puts checking.deposit(300)
puts checking.extract(500)
puts savings.extract(500)
