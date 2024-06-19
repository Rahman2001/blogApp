INSERT INTO user (id, email, first_name, last_name, profession)
VALUES (1, 'rahmanrejepov777@gmail.com', 'Rahman', 'Rejepov', 'student'),
       (2, 'mehmetaksoy@gmail.com', 'Mehmet', 'Aksoy', 'software developer'),
       (3, 'zehra@gazi.edu.tr', 'Zehra', 'Erdem', 'data scientist'),
       (4, 'barandatlar@gmail.com', 'Baran', 'Datlar', 'student'),
       (5, 'blackpink123@gmail.com', 'Jenny', 'Maria', 'singer'),
       (6, 'btskorea@hotmail.com', 'Jung', 'Kum', 'singer'),
       (7, 'melihayildiz@gazi.edu.tr', 'Meliha', 'Yildiz', 'chemical engineer');

INSERT INTO post (id, description, topic, author_id)
VALUES (1, 'ChatGPT-4o release is fantastic! Lets explore it!', 'AI news', 1),
       (2, 'Gazi Uni. graduation will be held in elementary school!', 'Education', 4),
       (3, 'Tesla has ongoing project on building AI robots called "Optimus."', 'Robotics', 5),
       (4, 'Doland Trump is sued for serious violation of laws.', 'Policy', 1),
       (5, 'Ilya Sutskever leaves OpenAI saying "it is for the sake of secure future"', 'Tech', 3),
       (6, 'Turkey decided to join the BRICS community according to Hakan Fidan.', 'Policy', 3),
       (7, 'Elun Musk finally got his 60$ billion compensation pay this month', 'Tesla News', 6),
       (8, 'Tommorow the weather forecast says that it will be very hot.', 'Weather News Today', 7);

INSERT INTO comment (id, date, message, post, author)
VALUES (1, '2024-12-04 13:15:00.000000', 'Whaatt? Are you kidding me? There is no wayy!', 2, 3),
       (2, '2012-12-11 10:00:00.000000', 'Wow! That looks amazing, let me prompt this module.', 1, 2),
       (3, '2010-11-23 05:07:11.000000', 'Yeah... I am not surprised something like that happens in the US', 4, 1),
       (4, '2019-12-30 12:00:00.000000', 'Well, I think it is good idea to become a member of BRICS. It will benefit to Turkey economy', 6, 4),
       (5, '2024-06-19 16:50:00.000000', 'I deeply respect Ilya because he thinks of the security first rather than profit', 5, 1),
       (6, '2024-06-19 17:00:00.000000', 'I think OpenAI will not grow without him. He was a main engine of the company', 5, 5);
