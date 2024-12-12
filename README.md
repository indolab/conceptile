## VIEW IN CODE MODE ## 


A Quiz based Application with RestApis on different endpoints.

#################################################################################################################################

Some Modifications --> 

##mysql (connector j)

1>. Added a user Entity to keep record of their progress and with help of it further we can implement authenticantion features.

--> user entity and schema given below :

+----+---------------+---------+-------+
| id | name          | correct | total |
+----+---------------+---------+-------+
|  1 | Alice Smith   |      10 |    16 |
|  2 | Bob Brown     |       9 |    21 |
|  3 | Charlie White |       6 |    10 |
+----+---------------+---------+-------+


2>. Question Entity --->


+----+--------------------------------------------+--------------------+---------------------+-----------------+---------------+---------------------+
| id | text                                       | optiona            | optionb             | optionc         | optiond       | correct_answer      |
+----+--------------------------------------------+--------------------+---------------------+-----------------+---------------+---------------------+
|  1 | Which planet is known as the Red Planet?   | Earth              | Mars                | Jupiter         | Venus         | Mars                |
|  2 | Who wrote "Romeo and Juliet"?              | William Wordsworth | William Shakespeare | Charles Dickens | Leo Tolstoy   | William Shakespeare |
|  3 | What is the largest ocean on Earth?        | Atlantic Ocean     | Indian Ocean        | Arctic Ocean    | Pacific Ocean | Pacific Ocean       |
|  4 | Which element has the chemical symbol "O"? | Osmium             | Oxygen              | Gold            | Silver        | Oxygen              |
+----+--------------------------------------------+--------------------+---------------------+-----------------+---------------+---------------------+
#######################################################################################################################################

Requirements:

this project is made on linux machine with given dependencies


JAVA 17
SpringBoot version 3.4.0
mvn 4.0.0
thymeleaf
spring-boot-starter-data-jpa
spring-boot-starter-web
mysql-connector-j  

#######################################################################################################################################

##   HOW TO RUN  ##

fork or curl it in ur profile or system
open with a code editor ### codium a debian based vs code clone in my case
build and run 
install post man or just curl the localhost with specified port eg:8080 in bash terminal .

if any problem reach me out.

## SCREENSHOT ##

##########  ScreenShots in this directory .. check it out ;
