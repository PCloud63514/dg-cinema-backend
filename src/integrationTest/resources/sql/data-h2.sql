/**
  시나리오
  홍대 영화관.
  오늘 개봉한 영화 1편
  홍대 1관 존재
  각 상영관에는 A, B, C열이 있고 각 열에는 5개의 좌석이 존재

  USER A, B, C, D, E 존재
 */
INSERT INTO MEMBER(id, nickname)
VALUES (1, 'user A'), (2, 'user B'), (3, 'user C'), (4, 'user D'), (5, 'user E');

INSERT INTO MOVIE(id, title, description, releaseDate, duration)
VALUES (1, '영화4', '영화4 설명', CURRENT_DATE, 120);

INSERT INTO CINEMA(id, name)
VALUES (1, '홍대 영화관');

INSERT INTO SCREEN(id, cinemaId, name)
VALUES (1, 1, '상영관1'), (2, 1, '상영관2');

INSERT INTO SEAT(id, screenId, rowName, colNum)
VALUES
--     홍대 1관
(1, 1, 'A', 1), (2, 1, 'A', 2), (3, 1, 'A', 3), (4, 1, 'A', 4), (5, 1, 'A', 5),
    (6, 1, 'B', 1), (7, 1, 'B', 2), (8, 1, 'B', 3), (9, 1, 'B', 4), (10, 1, 'B', 5),
    (11, 1, 'C', 1), (12, 1, 'C', 2), (13, 1, 'C', 3), (14, 1, 'C', 4), (15, 1, 'C', 5),
--     홍대 2관
    (16, 2, 'A', 1), (17, 2, 'A', 2), (18, 2, 'A', 3), (19, 2, 'A', 4), (20, 2, 'A', 5),
    (21, 2, 'B', 1), (22, 2, 'B', 2), (23, 2, 'B', 3), (24, 2, 'B', 4), (25, 2, 'B', 5),
    (26, 2, 'C', 1), (27, 2, 'C', 2), (28, 2, 'C', 3), (29, 2, 'C', 4), (30, 2, 'C', 5);

INSERT INTO SCREENING(id, screenId, movieId, screenDate, startTime, endTime)
VALUES
--     홍대 1관 영화 상영표
(1, 1, 1, CURRENT_DATE, '9:00', '11:00'),
(2, 1, 1, CURRENT_DATE, '13:00', '15:00'),
(3, 1, 1, CURRENT_DATE, '17:00', '19:00'),
(4, 1, 1, CURRENT_DATE, '21:00', '23:00'),
--     홍대 2관 영화 상영표
(5, 3, 1, CURRENT_DATE, '9:30', '11:30'),
(6, 3, 1, CURRENT_DATE, '13:30', '15:30'),
(7, 3, 1, CURRENT_DATE, '17:30', '19:30'),
(8, 3, 1, CURRENT_DATE, '21:30', '23:30');


INSERT INTO SCREENING_SEAT(id, screeningId, seatId, status)
VALUES
--     홍대 1관 9:00~11:00 상영
(1, 1, 1, 'AVAILABLE'),
(2, 1, 2, 'AVAILABLE'),
(3, 1, 3, 'AVAILABLE'),
(4, 1, 4, 'AVAILABLE'),
(5, 1, 5, 'AVAILABLE'),
(6, 1, 6, 'AVAILABLE'),
(7, 1, 7, 'AVAILABLE'),
(8, 1, 8, 'AVAILABLE'),
(9, 1, 9, 'AVAILABLE'),
(10, 1, 10, 'AVAILABLE'),
(11, 1, 11, 'AVAILABLE'),
(12, 1, 12, 'AVAILABLE'),
(13, 1, 13, 'AVAILABLE'),
(14, 1, 14, 'AVAILABLE'),
(15, 1, 15, 'AVAILABLE')
-- 홍대 1관 13:00~15:00 상영
(16, 2, 1, 'AVAILABLE'),
(17, 2, 2, 'AVAILABLE'),
(18, 2, 3, 'AVAILABLE'),
(19, 2, 4, 'AVAILABLE'),
(20, 2, 5, 'AVAILABLE'),
(21, 2, 6, 'AVAILABLE'),
(22, 2, 7, 'AVAILABLE'),
(23, 2, 8, 'AVAILABLE'),
(24, 2, 9, 'AVAILABLE'),
(25, 2, 10, 'AVAILABLE'),
(26, 2, 11, 'AVAILABLE'),
(27, 2, 12, 'AVAILABLE'),
(28, 2, 13, 'AVAILABLE'),
(29, 2, 14, 'AVAILABLE'),
(30, 2, 15, 'AVAILABLE'),
-- 홍대 1관 17:00~19:00 상영
(31, 3, 1, 'AVAILABLE'),
(32, 3, 2, 'AVAILABLE'),
(33, 3, 3, 'AVAILABLE'),
(34, 3, 4, 'AVAILABLE'),
(35, 3, 5, 'AVAILABLE'),
(36, 3, 6, 'AVAILABLE'),
(37, 3, 7, 'AVAILABLE'),
(38, 3, 8, 'AVAILABLE'),
(39, 3, 9, 'AVAILABLE'),
(40, 3, 10, 'AVAILABLE'),
(41, 3, 11, 'AVAILABLE'),
(42, 3, 12, 'AVAILABLE'),
(43, 3, 13, 'AVAILABLE'),
(44, 3, 14, 'AVAILABLE'),
(45, 3, 15, 'AVAILABLE'),
-- 홍대 1관 20:00~23:00 상영
(46, 4, 1, 'AVAILABLE'),
(47, 4, 2, 'AVAILABLE'),
(48, 4, 3, 'AVAILABLE'),
(49, 4, 4, 'AVAILABLE'),
(50, 4, 5, 'AVAILABLE'),
(51, 4, 6, 'AVAILABLE'),
(52, 4, 7, 'AVAILABLE'),
(53, 4, 8, 'AVAILABLE'),
(54, 4, 9, 'AVAILABLE'),
(55, 4, 10, 'AVAILABLE'),
(56, 4, 11, 'AVAILABLE'),
(57, 4, 12, 'AVAILABLE'),
(58, 4, 13, 'AVAILABLE'),
(59, 4, 14, 'AVAILABLE'),
(60, 4, 15, 'AVAILABLE'),
-- 홍대 2관 9:30~11:30 상영
(61, 5, 16, 'AVAILABLE'),
(62, 5, 17, 'AVAILABLE'),
(63, 5, 18, 'AVAILABLE'),
(64, 5, 19, 'AVAILABLE'),
(65, 5, 20, 'AVAILABLE'),
(66, 5, 21, 'AVAILABLE'),
(67, 5, 22, 'AVAILABLE'),
(68, 5, 23, 'AVAILABLE'),
(69, 5, 24, 'AVAILABLE'),
(70, 5, 25, 'AVAILABLE'),
(71, 5, 26, 'AVAILABLE'),
(72, 5, 27, 'AVAILABLE'),
(73, 5, 28, 'AVAILABLE'),
(74, 5, 29, 'AVAILABLE'),
(75, 5, 30, 'AVAILABLE'),
-- 홍대 2관 13:30~15:30 상영
(76, 6, 16, 'AVAILABLE'),
(77, 6, 17, 'AVAILABLE'),
(78, 6, 18, 'AVAILABLE'),
(79, 6, 19, 'AVAILABLE'),
(80, 6, 20, 'AVAILABLE'),
(81, 6, 21, 'AVAILABLE'),
(82, 6, 22, 'AVAILABLE'),
(83, 6, 23, 'AVAILABLE'),
(84, 6, 24, 'AVAILABLE'),
(85, 6, 25, 'AVAILABLE'),
(86, 6, 26, 'AVAILABLE'),
(87, 6, 27, 'AVAILABLE'),
(88, 6, 28, 'AVAILABLE'),
(89, 6, 29, 'AVAILABLE'),
(90, 6, 30, 'AVAILABLE'),
-- 홍대 2관 17:30~19:30 상영
(91, 7, 16, 'AVAILABLE'),
(92, 7, 17, 'AVAILABLE'),
(93, 7, 18, 'AVAILABLE'),
(94, 7, 19, 'AVAILABLE'),
(95, 7, 20, 'AVAILABLE'),
(96, 7, 21, 'AVAILABLE'),
(97, 7, 22, 'AVAILABLE'),
(98, 7, 23, 'AVAILABLE'),
(99, 7, 24, 'AVAILABLE'),
(100, 7, 25, 'AVAILABLE'),
(101, 7, 26, 'AVAILABLE'),
(102, 7, 27, 'AVAILABLE'),
(103, 7, 28, 'AVAILABLE'),
(104, 7, 29, 'AVAILABLE'),
(105, 7, 30, 'AVAILABLE'),
--  홍대 2관 21:30~23:30 상영
(106, 8, 16, 'AVAILABLE'),
(107, 8, 17, 'AVAILABLE'),
(108, 8, 18, 'AVAILABLE'),
(109, 8, 19, 'AVAILABLE'),
(110, 8, 20, 'AVAILABLE'),
(111, 8, 21, 'AVAILABLE'),
(112, 8, 22, 'AVAILABLE'),
(113, 8, 23, 'AVAILABLE'),
(114, 8, 24, 'AVAILABLE'),
(115, 8, 25, 'AVAILABLE'),
(116, 8, 26, 'AVAILABLE'),
(117, 8, 27, 'AVAILABLE'),
(118, 8, 28, 'AVAILABLE'),
(119, 8, 29, 'AVAILABLE'),
(120, 8, 30, 'AVAILABLE');
;
