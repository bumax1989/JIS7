1.Создать модель User с полями id,  имя, фамилия, никнейм, возраст, емайл, пароль, статус, флаг isActive. Статусы юзера могут быть: GUEST, USER, VIP USER. Создайте  юзеров с разными статусами.  Написать методы которые проходят по коллекции юзеров в стриме и если юзеры имеют статус guest, то засетать им статус USER  и перевести флаг isActive в true, а если уже был USER и isActive то перевести в VIP USER.

2.Написать метод который сортируетюзеров по нику и отфильтровывает чтобы в этой коллекции были юзеры старше 18 лет, если младше то тем юзерам флаг меняется на isActive false и статус переходит в guest

3.Написать метод который выводит количество юзеров со статусом USER и флагом true