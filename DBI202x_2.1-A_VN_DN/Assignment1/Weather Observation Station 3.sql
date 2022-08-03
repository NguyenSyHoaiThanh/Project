--DISTINCT loại bỏ tất cả các bản ghi trùng lặp
--MOD trả về phần dư của phép chia.
SELECT DISTINCT(CITY) FROM STATION WHERE MOD(ID, 2)=0 ;