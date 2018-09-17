class Call
	COST_PER_SECOND = 0.01
	attr_reader :to
	def initialize(from, to, duration)
		@from = from
		@to = to
		@duration = duration
	end

	def cost
		@duration * COST_PER_SECOND
	end
end

class CellPhoneBill
	def initialize(number)
		@number = number
		@calls = []
	end

	def register_call(to_number, duration)
		@calls.push(Call.new(@number, to_number, duration))
	end

	def process_bill
		@calls.map{ |c| c.cost}.reduce(:+)
	end
end

class TooManyFriendsError < StandardError
	def message
		'Too many friends on the list'
	end
end

class AlreadyExistsFriendError < StandardError
	def message
		'Friend already on the list'
	end
end

class FriendNotFoundError < StandardError
	def message
		'Friend not found'
	end
end

class FriendCellPhoneBill < CellPhoneBill
	DEFAULT_COST_PER_SECOND = 0.5
	def initialize(number, limit)
		super(number)
		@friends = []
		@limit = limit
		@@friends_cost_per_second = DEFAULT_COST_PER_SECOND
	end

	def add_friend(number)
		raise TooManyFriendsError if @friends.length == @limit
		raise AlreadyExistsFriendError if @friends.include? number
		@friends.push(number)
	end

	def remove_friend(number)
		raise FriendNotFoundError unless @friends.inclue? number
		@friends.delete(number)
	end

	def change_cost(cost)
		@@friends_cost_per_second = cost
	end

	def process_bill
		@calls.map {|c| @friends.include?(c.to) ? @@friends_cost_per_second * c.cost : c.cost}.reduce(:+)
	end
end

my_bill = FriendCellPhoneBill.new('4444-4444', 3)
my_bill.add_friend('5555-5555')
my_bill.add_friend('6666-6666')
my_bill.register_call('5555-5555', 10)
my_bill.register_call('6666-6666', 10)
puts my_bill.process_bill
begin
	my_bill.add_friend('6666-6666')
rescue AlreadyExistsFriendError => e
	puts e.message
end
my_bill.add_friend('4444-4444')
begin
	my_bill.add_friend('7777-7777')
rescue TooManyFriendsError => e
	puts e.message
end
