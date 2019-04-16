class ProductAlreadyExistsError < StandardError
	def message
		'El producto ya existe'
	end
end

class ProductNonExistent < StandardError
	def message
		'El producto no existe'
	end
end

class ProductCategory
	def initialize(discount)
		@discount = discount
	end

	def price(price)
		return discount(price) if discount?(price)
		price
	end

	def discount(price)
		price.*(100 - @discount)./(100)
	end

	def top_limit
		raise 'Not Implemented'
	end

	def discount?(price)
		price < top_limit
	end
end

class WhiteAppliancesCategory < ProductCategory
	MAX_PRICE = 4999
	DISCOUNT = 25

	def initialize
		super(DISCOUNT)
	end

	def top_limit
		MAX_PRICE
	end
end

class ElectronicsCategory < ProductCategory
	DISCOUNT = 10

	def initialize
		super(DISCOUNT)
	end

	def discount?(_price)
		true
	end
end

class Store
	def initialize
		@products = Hash.new{0}
	end

	def add_product(name, category, price)
		raise ProductAlreadyExistsError if @products.key?(name)
		@products[name] = Product.new(name, category, price)
	end

	def price(name)
		raise ProductNonExistent unless @products.key?(name) 
		@products[name].price
	end
end

class Product
	def initialize(name, category, list_price)
		@name = name
		@category = category
		@list_price = list_price
	end

	def price
		@category.price(@list_price)
	end
end

store = Store.new
store.add_product('Lavarropas', WhiteAppliancesCategory.new, 9999.0)
store.add_product('PenDrive', ElectronicsCategory.new, 999.0)
begin
	store.add_product('Lavarropas', WhiteAppliancesCategory.new, 100.0)
rescue ProductAlreadyExistsError => e
	puts e.message # El producto ya existe
end
puts store.price('Lavarropas') # 9999.0
puts store.price('PenDrive') # 899.1
begin
	puts store.price('Otro')
rescue ProductNonExistent => e
	puts e.message # El producto no existe
end
