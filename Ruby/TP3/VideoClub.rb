class MovieCategory
	def initialize(price, days, late_price)
		@price = price
		@days = days
		@late_price = late_price
	end

	def charges(days)
		return @price + (@late_price * (days - @days)) if days > @days
		@price
	end

	def points(_days)
		1
	end
end

class ChildrenCategory < MovieCategory
	PRICE = 3
	RENT_DAYS = 3
	LATE_PRICE = 1.5

	def initialize
		super(PRICE, RENT_DAYS, LATE_PRICE)
	end
end

class StandardCategory < MovieCategory
	PRICE = 2 
	RENT_DAYS = 2
	LATE_PRICE = 1.5

	def initialize
		super(PRICE, RENT_DAYS, LATE_PRICE)
	end
end

class RecentCategory < MovieCategory
	PRICE = 3
	RENT_DAYS = 2
	LATE_PRICE = 1.5

	def initialize
		super(PRICE, RENT_DAYS, LATE_PRICE)
	end
end

class Movie
	attr_reader :category
	def initialize(title, category)
		@title = title
		@category = category
	end
end

class Customer
	attr_reader :points, :charge
	def initialize(name)
		@name = name
		@points = 0
		@charge = 0
	end

	def add_points(points)
		@points += points
	end

	def add_charge(charge)
		@charge += charge
	end
end


class VideoClub
	def initialize
		@movies = Hash.new {}
		@customers = Hash.new {}
	end

	def add_movie(name, category)
		@movies[name] = Movie.new(name, category)
	end

	def add_customer(name)
		@customers[name] = Customer.new(name)
	end

	def rent(name, customer, days)
		raise "Movie #{title} not found" unless @movies.include? name
		raise "Costumer #{customer} not found" unless @customers.include? customer
		movie = @movies[name]
		customer = @customers[customer]
		customer.add_points(movie.category.points(days))
		customer.add_charge(movie.category.charges(days))
	end

	def resume(name)
		raise "Customer #{name} not found" unless @customers.include? name
		customer = @customers[name]
		"Resume points: #{customer.points}, charge: #{customer.charge}"
	end
end

video_club = VideoClub.new
video_club.add_movie('Dumbo', ChildrenCategory.new)
video_club.add_movie('ET', StandardCategory.new)
video_club.add_movie('ZZZ', RecentCategory.new)
video_club.add_customer('Juan')
video_club.add_customer('Ana')
video_club.rent('Dumbo', 'Ana', 5)
video_club.rent('ET', 'Ana', 2)
video_club.rent('ET', 'Juan', 3)
puts video_club.resume('Ana')
puts video_club.resume('Juan')
begin
	video_club.rent('ET', 'Pedro', 3)
rescue RuntimeError => e
	puts e.message
end

=begin
Resume points: 2, charge: 8.0
Resume points: 1, charge: 3.5
Customer Pedro not found	
=end