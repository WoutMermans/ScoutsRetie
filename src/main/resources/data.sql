INSERT INTO TAK (ID, TAK_NAME, TAK_INFO, TAK_LEEFTIJD)
VALUES
(1, 'Kapoenen', 'De jongsten van de scouts worden niet voor niets kapoenen genoemd!
 Elke zondag heeft hun mega-coole leiding een namiddag ineengestoken waar ze zich naar hartenlust kunnen uitleven!
  In het bos spelen, zich verkleden, op weekend gaan,
 zelf spelletjes verzinnen en in de zomer voor de eerste keer op kamp trekken hoort allemaal bij de bezigheden van onze kapoenen.',
 'Leeftijd tussen 6 en 8 jaar');

 INSERT INTO TAK (ID, TAK_NAME, TAK_INFO, TAK_LEEFTIJD)
VALUES
(2, 'Welpen', 'Welpen spelen een fantasievol en dwarrelend spel, gaan samen op ontdekking en verleggen hun grenzen.
 Ze krijgen ruimte en kansen om dingen uit te proberen en van elkaar te leren.
  Bij de welpen staat het verhaal van het jungleboek centraal: de leiding draagt namen van dieren uit het verhaal,
 en de kleine groepjes waarin welpen onderverdeeld worden, worden ''nesten'' genoemd.',
 'Leeftijd tussen 8 en 11 jaar');

  INSERT INTO TAK (ID, TAK_NAME, TAK_INFO, TAK_LEEFTIJD)
VALUES(3, 'Jonggivers', 'Jonggivers zijn een bende mega coole jongens en meisjes die met hun -al even coole- leiding elke
 zondag samentroepen om toffe activiteiten te beleven.
  In vaste patrouilles werken ze samen en nemen initiatieven van kattekwaad tot leuker.
   Jonggivers krijgen een waaier van mogelijkheden om mee te beslissen,
     zelf de handen uit de mouwen te steken en allerlei vaardigheden onder de knie te krijgen.',
 'Leeftijd tussen 11 en 14 jaar');

   INSERT INTO TAK (ID, TAK_NAME, TAK_INFO, TAK_LEEFTIJD)
VALUES(4, 'Givers', 'We gaan een stapje verder. Givers bieden we alle kansen om te bewijzen wat ze in hun mars hebben.
 Givers trekken samen op, hun vrienden zijn heilig. Vanuit eigen interesses gaan ze op zoek naar zichzelf tussen soortgenoten.
 Ze wagen zich aan grote projecten, trekken de nacht in of gaan op overlevingstocht.
 Soms zitten ze met hun leiding ook gewoon gezellig wat bij elkaar.',
 'Leeftijd tussen 14 en 17 jaar');

    INSERT INTO TAK (ID, TAK_NAME, TAK_INFO, TAK_LEEFTIJD)
VALUES(5, 'Jins', 'Wat is Jin zijn? Dat bepalen ze zelf.
   Leiding is geen leiding meer, maar begeleiding. Wie weet slaan ze dit jaar hun tenten in het buitenland op,
   krijgt het jinlokaal een Keith Harring-look of is muziek de factor die hen bindt.
   Inspraak, ploeggeest en zelfstandigheid staan voorop. Jins zijn zwervers; blijvend onderweg ...',
   'Leeftijd tussen 17 en 18 jaar');

     INSERT INTO TAK (ID, TAK_NAME, TAK_INFO, TAK_LEEFTIJD)
VALUES(6, 'Leiding', 'Wat is Jin zijn? Dat bepalen ze zelf.
   Leiders en leidsters zijn jonge mensen die in hun vrije tijd zorgen voor sfeer,
   activiteiten en werking per tak en per groep; ze doen dat door samen met hun leden te spelen en met hen onderweg te zijn.
   Leiding is verantwoordelijk voor de organisatie en het toezicht tijdens scouting.
   Scouts en Gidsen Vlaanderen voorziet een vormingsaanbod voor leid(st)ers.',
    'Leeftijd vanaf 18 jaar');


INSERT INTO KAMP (ID, KAMP_LOCATIE, KAMP_INFO, KAMP_BEGIN_DATUM,KAMP_EIND_DATUM, KAMP_LABEL)
VALUES (nextval('KAMP_SEQ'),'Scherpenheuvel', 'We zaten tijdens dit kamp in Scherpenheuvel',
'2014-07-13','2014-07-23', 'Scherpenheuvel 2014');

INSERT INTO KAMP (ID, KAMP_LOCATIE, KAMP_INFO, KAMP_BEGIN_DATUM,KAMP_EIND_DATUM, KAMP_LABEL)
VALUES (nextval('KAMP_SEQ'),'Geel', 'We zaten tijdens dit kamp in Geel',
'2015-07-02','2015-07-12', 'Geel 2015');

INSERT INTO KAMP (ID, KAMP_LOCATIE, KAMP_INFO, KAMP_BEGIN_DATUM,KAMP_EIND_DATUM, KAMP_LABEL)
VALUES (nextval('KAMP_SEQ'),'Vielsalm', 'We zaten tijdens dit kamp in Vielsalm',
'2016-07-07','2016-07-17','Vielsalm 2016');

INSERT INTO KAMP (ID, KAMP_LOCATIE, KAMP_INFO, KAMP_BEGIN_DATUM,KAMP_EIND_DATUM, KAMP_LABEL)
VALUES (nextval('KAMP_SEQ'),'Bree', 'We zaten tijdens dit kamp in Bree',
'2017-07-08','2017-07-18', 'Bree 2017');

INSERT INTO KAMP (ID, KAMP_LOCATIE, KAMP_INFO, KAMP_BEGIN_DATUM,KAMP_EIND_DATUM, KAMP_LABEL)
VALUES (nextval('KAMP_SEQ'),'Westerloo', 'We zaten tijdens dit kamp in Westerloo',
'2018-07-06','2018-07-16','Westerloo 2018');

INSERT INTO KAMP (ID, KAMP_LOCATIE, KAMP_INFO, KAMP_BEGIN_DATUM,KAMP_EIND_DATUM, KAMP_LABEL)
VALUES (nextval('KAMP_SEQ'),'Brecht', 'We zaten tijdens dit kamp in Brecht',
'2019-07-05','2019-07-15', 'Brecht 2019');

INSERT INTO KAMP (ID, KAMP_LOCATIE, KAMP_INFO, KAMP_BEGIN_DATUM,KAMP_EIND_DATUM, KAMP_LABEL)
VALUES (nextval('KAMP_SEQ'),'Geel', 'We zaten tijdens dit kamp in Geel',
'2020-07-03', '2020-07-16', 'Geel 2020');

INSERT into LEIDING(ID, LEIDER_NAME, LEIDER_LEEFTIJD, LEIDER_BIO)
values (nextval('LEIDING_SEQ'), 'Kobe Cuypers', 20, 'Ik ben Kobe!');

INSERT into LEIDING(ID, LEIDER_NAME, LEIDER_LEEFTIJD, LEIDER_BIO)
values (nextval('LEIDING_SEQ'), 'Wout Mermans', 21, 'Ik ben Wout!');

INSERT into LEIDING(ID, LEIDER_NAME, LEIDER_LEEFTIJD, LEIDER_BIO)
values (nextval('LEIDING_SEQ'), 'Louis Bosch', 20, 'Ik ben Louis!');

INSERT into LEIDING(ID, LEIDER_NAME, LEIDER_LEEFTIJD, LEIDER_BIO)
values (nextval('LEIDING_SEQ'), 'Pol Van Herck', 20, 'Ik ben Pol!');

INSERT into LEIDING(ID, LEIDER_NAME, LEIDER_LEEFTIJD, LEIDER_BIO)
values (nextval('LEIDING_SEQ'), 'Ties Van De Pol', 20, 'Ik ben !');

INSERT into LEIDING(ID, LEIDER_NAME, LEIDER_LEEFTIJD, LEIDER_BIO)
values (nextval('LEIDING_SEQ'), 'Lien Rommes', 21, 'Ik ben Lien!');

INSERT into LEIDING(ID, LEIDER_NAME, LEIDER_LEEFTIJD, LEIDER_BIO)
values (nextval('LEIDING_SEQ'), 'Tuur Bosch', 22, 'Ik ben Tuur!');

INSERT into LEIDING(ID, LEIDER_NAME, LEIDER_LEEFTIJD, LEIDER_BIO)
values (nextval('LEIDING_SEQ'), 'Evelijn Verdonk', 22, 'Ik ben !');

INSERT into LEIDING(ID, LEIDER_NAME, LEIDER_LEEFTIJD, LEIDER_BIO)
values (nextval('LEIDING_SEQ'), 'Maarten Staes', 24, 'Ik ben Maarten!');

INSERT into LEIDING(ID, LEIDER_NAME, LEIDER_LEEFTIJD, LEIDER_BIO)
values (nextval('LEIDING_SEQ'), 'Dirk Jansen', 21, 'Ik ben Dirk!');

INSERT into LEIDING(ID, LEIDER_NAME, LEIDER_LEEFTIJD, LEIDER_BIO)
values (nextval('LEIDING_SEQ'), 'Lukas Borgers', 21, 'Ik ben Lukas!');

INSERT into LEIDING(ID, LEIDER_NAME, LEIDER_LEEFTIJD, LEIDER_BIO)
values (nextval('LEIDING_SEQ'), 'Mars Celen', 22, 'Ik ben Mats!');

insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(1, 1);
insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(1, 2);
insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(1, 3);
insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(1, 4);
insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(1, 6);


insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(2, 1);
insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(2, 2);
insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(2, 3);
insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(2, 4);
insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(2, 6);


insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(3, 1);
insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(3, 2);
insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(3, 3);
insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(3, 4);
insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(3, 6);


insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(4, 1);
insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(4, 2);
insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(4, 3);
insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(4, 4);
insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(4, 6);


insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(5, 1);
insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(5, 2);
insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(5, 3);
insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(5, 4);
insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(5, 6);


insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(6, 1);
insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(6, 2);
insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(6, 3);
insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(6, 4);
insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(6, 6);


insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(7, 1);
insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(7, 2);
insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(7, 3);
insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(7, 4);
insert into KAMP_TAKKEN (KAMPEN_ID, TAKKEN_ID) values(7, 6);



INSERT INTO LEIDING_TAKKEN (TAKKEN_ID, LEIDING_ID) VALUES(1,1);
INSERT INTO LEIDING_TAKKEN (TAKKEN_ID, LEIDING_ID) VALUES(1,2);
INSERT INTO LEIDING_TAKKEN (TAKKEN_ID, LEIDING_ID) VALUES(1,3);

INSERT INTO LEIDING_TAKKEN (TAKKEN_ID, LEIDING_ID) VALUES(2,4);
INSERT INTO LEIDING_TAKKEN (TAKKEN_ID, LEIDING_ID) VALUES(2,5);
INSERT INTO LEIDING_TAKKEN (TAKKEN_ID, LEIDING_ID) VALUES(2,6);

INSERT INTO LEIDING_TAKKEN (TAKKEN_ID, LEIDING_ID) VALUES(3,7);
INSERT INTO LEIDING_TAKKEN (TAKKEN_ID, LEIDING_ID) VALUES(3,8);
INSERT INTO LEIDING_TAKKEN (TAKKEN_ID, LEIDING_ID) VALUES(3,9);

INSERT INTO LEIDING_TAKKEN (TAKKEN_ID, LEIDING_ID) VALUES(4,10);
INSERT INTO LEIDING_TAKKEN (TAKKEN_ID, LEIDING_ID) VALUES(4,11);
INSERT INTO LEIDING_TAKKEN (TAKKEN_ID, LEIDING_ID) VALUES(4,12);












