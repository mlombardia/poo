class SystemAccess
  def initialize
    raise 'Error'
  end

  private def init(name, parent_folder)
    @name = name
    @authorized_members = []
    @parent_folder = parent_folder
  end

  def grant_access(user)
    @authorized_members.push(user)
  end

  def access?(user)
    access = @authorized_members.include?(user)
    access ||= @parent_folder.access?(user) unless @parent_folder.nil?
    access
  end
end

class SystemFolder < SystemAccess
  def initialize(name, parent_folder = nil)
    init(name, parent_folder)
  end

  def add(system_file_name)
    SystemFile.new(system_file_name, self)
  end
end

class SystemFile < SystemAccess
  def initialize(name, parent_folder)
    init(name, parent_folder)
  end
end

class User
  def initialize(name)
    @name = name
  end

  def ==(other)
    return false unless other.is_a?(User)
    @name == other.name
  end

  def name
    @name
  end
end

user1 = User.new('User 1')
user2 = User.new('User 2')

pi_folder = SystemFolder.new('pi') # se crea la carpeta pi en la raíz
main_file = pi_folder.add('main.c')

pi_folder.grant_access(user1)
main_file.grant_access(user2)

puts pi_folder.access?(user1) # true
puts main_file.access?(user1) # true

puts pi_folder.access?(user2) # false
puts main_file.access?(user2) # true

getnumc_file = pi_folder.add('getnum.c')
getnumh_file = pi_folder.add('getnum.h')

puts pi_folder.access?(user1) # true
puts main_file.access?(user1) # true
puts getnumc_file.access?(user1) # true
puts getnumh_file.access?(user1) # true

puts pi_folder.access?(user2) # false
puts main_file.access?(user2) # true
puts getnumc_file.access?(user2) # false
puts getnumh_file.access?(user2) # false

pi_docs_folder = SystemFolder.new('docs', pi_folder) # docs es subcarpeta de pi
doc_file = pi_docs_folder.add('README')
puts pi_docs_folder.access?(user2) # false
puts pi_docs_folder.access?(user1) # true
puts doc_file.access?(user2) # false
puts doc_file.access?(user1) # true

pi_docs_folder.grant_access(user2)

puts doc_file.access?(user2) # true



