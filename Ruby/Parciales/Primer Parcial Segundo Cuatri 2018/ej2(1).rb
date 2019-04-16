require 'set'

class PriorityQueue
  def initialize
    @queue = SortedSet.new
  end

  def enqueue(element, priority)
    @queue.add(PriorityQueueElement.new(element, priority))
  end

  def dequeue
    raise EmptyPriorityQueueError if empty?
    pq_elem = @queue.max
    @queue.delete(pq_elem)
    pq_elem.element
  end

  def empty?
    @queue.empty?
  end

  def size
    @queue.size
  end
end

class PriorityQueueElement
  def initialize(element, priority)
    @element = element
    @priority = priority
  end

  def element
    @element
  end

  def priority
    @priority
  end

  def ==(other)
    return false unless other.is_a?(PriorityQueueElement)
    @element == other.element && @priority == other.priority
  end

  def eql?(other)
    self.==(other)
  end

  def hash
    [@element, @priority].hash
  end

  def <=>(other)
    raise 'Error' unless other.is_a?(PriorityQueueElement)
    other.priority <=> @priority # Descendente
  end

  def inspect
    "{#{@element}, #{@priority}}"
  end

end

class EmptyPriorityQueueError < StandardError
  def message
    'La cola de prioridades está vacía'
  end
end

pq = PriorityQueue.new
pq.enqueue('Hola', 2)
pq.enqueue('Chau', 5)
pq.enqueue('Mundo', 2)
pq.enqueue('ZZZZ', 1)
pq.enqueue('Java', 1)
pq.enqueue('Java', 5)
pq.enqueue('Algo', 1)
puts pq.dequeue
pq.enqueue('Otro', 1)
puts pq.size
p pq
puts pq.dequeue until pq.empty?
p pq
begin
  puts pq.dequeue
rescue EmptyPriorityQueueError => e
  puts e.message
end