CREATE TABLE sandbox.guest.play_bookings (
	booking_id INTEGER
	,user_id INTEGER
	,game_id INTEGER
	,start_time INTEGER
	,end_time INTEGER
	,PRIMARY KEY(booking_id)
	)

CREATE TABLE sandbox.guest.play_games (
	game_id INTEGER
	,name VARCHAR(255)
	,min_capacity INTEGER
	,max_capacity INTEGER
	,location VARCHAR(225)
	,office VARCHAR(10)
	,city VARCHAR(10)
	,PRIMARY KEY (game_id)
	)

CREATE TABLE sandbox.guest.play_booking_players (
	booking_id INTEGER
	,player_id INTEGER
	)

CREATE TABLE sandbox.guest.play_users (
	user_id INTEGER
	,name VARCHAR(255)
	,username VARCHAR(225)
	,office VARCHAR(10)
	,city VARCHAR(10)
	,PRIMARY KEY (user_id)
	)

INSERT INTO sandbox.guest.play_games (game_id,name,min_capacity,max_capacity,location,office,city) VALUES
(1,'Table tennis',2,4,'Recreation Room','RHJ','HYD')
,(2,'Foos ball',2,4,'Recreation Room','RHJ','HYD')
,(3,'Foos ball',2,4,'13th floor West Pantry','RHJ','HYD')
,(4,'Carrom',2,4,'Recreation Room','RHJ','HYD')
,(5,'Carrom',2,4,'13th floor West Pantry','RHJ','HYD')
,(6,'Carrom',2,4,'13th floor East Pantry','RHJ','HYD')
,(7,'Snooker',2,5,'13th floor East Pantry','RHJ','HYD')
,(8,'Basket ball',2,10,'Multicourt','RHJ','HYD')
,(9,'Lawn Tennis',2,4,'Multicourt','RHJ','HYD')
,(10,'Volley ball',2,16,'Multicourt','RHJ','HYD')
,(11,'Cricket',2,22,'Multicourt','RHJ','HYD')
,(12,'Badminton',2,4,'Multicourt','RHJ','HYD')
,(13,'Table tennis',2,4,'Recreation Room','RHJ','HYD')


insert into sandbox.guest.play_users (user_id, name, username, office, city) values
(1, 'Mantini Reddy', 'reddyman', 'RHJ', 'HYD')
,(2, 'Rahul Jain', 'jainrahu', 'RHJ', 'HYD')
,(3, 'Tanya verma', 'vermat', 'ILB', 'HYD')
,(4, 'Dummy User 1', 'user1', 'ILB', 'HYD')

insert into sandbox.guest.play_booking_players (booking_id, player_id) values
(1,2)
,(1, 1)
,(2, 3)
,(2, 4)

insert into sandbox.guest.play_bookings (booking_id, user_id ,game_id ,start_time ,end_time) values
(1, 2, 1, 34, 36)
,(2, 3, 1, 35, 36)

select * from sandbox.guest.play_booking_players;
select * from sandbox.guest.play_bookings;
select * from sandbox.guest.play_games;
select * from sandbox.guest.play_users;

drop table sandbox.guest.play_booking_players;
drop table sandbox.guest.play_bookings;
drop table sandbox.guest.play_games;
drop table sandbox.guest.play_users;