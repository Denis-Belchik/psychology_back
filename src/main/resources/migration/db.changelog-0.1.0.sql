--liquibase formatted sql

--changeset 20240606123000 author:belchikdm
--comment: #1 create new table test

create table ps_test
(
    id           bigint generated by default as identity
        constraint test_pkey primary key,
    title        varchar(255),
    description  varchar(512),
    instructions text
);

insert into ps_test (title, description, instructions)
values ('Оценка личностных характеристик',
        'Блок психологического тестирования, оценивающий перечень предпочтительных на службе личностных качеств.',
        '<p>Вам будет предложено к прохождению <b>70 утверждений</b>, направленных на оценку личностных компетенций служащих Самарской области. Рекомендуется  долго не раздумывать над ответом в процессе прохождения. Помните, что первое впечатление о вопросе - наиболее верное. Так же важно упомянуть, что верных ответов на психологический тест нет. Любой ответ отражает вашу индивидуальность.</p>
         <p>На прохождение теста отведено <b>1 час 13 минут</b>. Время нельзя поставить на паузу! Таймер обратного отсчета расположен в правом нижнем углу экрана при запуске тестирования. Тест доступен для прохождения только 1 раз. Вы можете прямо сейчас закрыть окно "Инструкции", чтобы приступить к выполнению теста в более удобное время. Однако придерживайтесь графика отведенного Вам для выполнения всех тестов.</p>
         <p>Нажимая сейчас кнопку "Начать тестирование", Вы выражаете своё согласие с его условиями и принимаете на себя ответственность за его результаты.</p>'),
       ('Тест', 'Для теста.', 'Вам необходимо пройти тестирование.');


--comment: #1 create new table user_setting
create table ps_user_setting
(
    id    bigint generated by default as identity
        constraint user_setting_pkey primary key,
    theme varchar(10)
);

insert into ps_user_setting (theme)
values ('dark');