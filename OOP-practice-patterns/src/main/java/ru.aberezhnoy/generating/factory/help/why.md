##Шаги реализации

- #####Приведите все создаваемые продукты к общему интерфейсу.

- #####В классе, который производит продукты, создайте пустой фабричный метод. В качестве возвращаемого типа укажите общий интерфейс продукта.

- #####Затем пройдитесь по коду класса и найдите все участки, создающие продукты. Поочерёдно замените эти участки вызовами фабричного метода, 
  #####перенося в него код создания различных продуктов. В фабричный метод, возможно, придётся добавить несколько параметров, контролирующих, какой из продуктов нужно создать.
  #####На этом этапе фабричный метод, скорее всего, будет выглядеть удручающе. В нём будет жить большой условный оператор, выбирающий класс создаваемого продукта. 
  #####Но не волнуйтесь, мы вот-вот исправим это.

- #####Для каждого типа продуктов заведите подкласс и переопределите в нём фабричный метод. Переместите туда код создания соответствующего продукта из суперкласса.

- #####Если создаваемых продуктов слишком много для существующих подклассов создателя, вы можете подумать о введении параметров в фабричный метод, которые позволят возвращать различные продукты в пределах одного подкласса.

- #####Если после всех перемещений фабричный метод стал пустым, можете сделать его абстрактным. Если в нём что-то осталось — не беда, это будет его реализацией по умолчанию.


##Преимущества
- #####Избавляет класс от привязки к конкретным классам продуктов.
- #####Выделяет код производства продуктов в одно место, упрощая поддержку кода.
- #####Упрощает добавление новых продуктов в программу.
- #####Реализует принцип открытости/закрытости.

##Недостаток
- #####Может привести к созданию больших параллельных иерархий классов, так как для каждого класса продукта надо создать свой подкласс создателя.