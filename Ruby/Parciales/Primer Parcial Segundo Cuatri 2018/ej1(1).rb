class SlidingWindowIterator

  def initialize(elements, window_dim)
    raise ArgumentError, 'Collection missing' if elements.nil?
    @each = Enumerator.new do |aux|
      start_index = 0
      loop do
        raise StopIteration if start_index + window_dim > elements.length
        aux << elements[start_index, window_dim]
        start_index += 1
      end
    end
  end

  def each
    @each
  end

end

elements = ['Instituto', 'Tecnológico', 'de', 'Buenos', 'Aires']

my_iterator = SlidingWindowIterator.new(elements, 3)
p my_iterator.each.next
p my_iterator.each.next
p my_iterator.each.next
begin
p my_iterator.each.next
rescue StopIteration => e
  puts e.message
end

puts '##########'

p my_iterator.each.take(4)

puts '##########'

begin
  SlidingWindowIterator.new(elements, 10).each.next
rescue StopIteration => e
  puts e.message
end

puts '##########'

begin
  SlidingWindowIterator.new(nil, 1)
rescue ArgumentError => e
  puts e.message
end