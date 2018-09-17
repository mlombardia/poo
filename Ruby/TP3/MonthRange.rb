class MonthYear
	include Comparable
	attr_reader :month, :year

	def initialize(month, year)
		@month = month
		@year = year
	end

	def succ
		return MonthYear.new(1, @year + 1) if @month == 12
		MonthYear.new(@month + 1, @year)
	end

	def <=>(other)
		year_diff = @year <=> other.year
		return year_diff unless (year_diff).zero?
		@month <=> other.month
	end

	def to_s
		"#{@month}/#{@year}"
	end

	def inspect
		to_s
	end
end

my_range = MonthYear.new(11, 2017)..MonthYear.new(3, 2018)
p my_range
p my_range.to_a
puts my_range === MonthYear.new(1, 2018)
puts my_range === MonthYear.new(2, 2016)

=begin
11/2017..3/2018
[11/2017, 12/2017, 1/2018, 2/2018, 3/2018]
true
false	
=end