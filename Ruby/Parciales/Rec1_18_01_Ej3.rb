class Company
	def initialize(name)
		@name = name
	end
end

class Employee
	attr_reader :companies
	def initialize(name, companies)
		@name = name
		@companies = companies
	end
end

class Menu
	def initialize(name)
		@name = name
		@members = []
	end

	def authorize(member)
		@members << member
	end

	def access?(employee)
		company_access?(employee) || user_access?(employee)
	end

	def company_access?(employee)
		employee.companies.each do |company|
			return true if @members.include?(company)
		end
		false
	end

	def user_access?(employee)
		@members.include?(employee)
	end
end

class MenuItem < Menu
	def initialize(name, parent_menu)
		super(name)
		@parent_menu = parent_menu
	end

	def access?(employee)
		@parent_menu.access?(employee) || super(employee)
	end
end
menu1 = Menu.new('File')
menu2 = MenuItem.new('New', menu1)
menu3 = MenuItem.new('Close', menu1)
menu4 = Menu.new('Help')
menu5 = MenuItem.new('About us', menu4)
menu6 = MenuItem.new('Find...', menu4)

company1 = Company.new('ACME')
company2 = Company.new('Warner')
employee1 = Employee.new('James', [company1])
employee2 = Employee.new('Annie', [company1, company2])

menu1.authorize(employee1)
menu2.authorize(employee1)
menu5.authorize(employee1)
menu3.authorize(employee2)
menu4.authorize(company2)

[menu1, menu2, menu3, menu4, menu5, menu6].each{|menu| puts menu.access?(employee1)}
puts '#################'
[menu1, menu2, menu3, menu4, menu5, menu6].each{|menu| puts menu.access?(employee2)}