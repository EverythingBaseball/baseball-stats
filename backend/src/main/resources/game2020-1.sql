insert into "BBS"."Game" (gameIdentifier, gameDate) values ('NL2020HB3F001', '2020-06-05');

insert into "BBS"."GameStats" ( gameId_fk, playerId_fk, plateAppearances, singles, doubles, triples, homeRuns, reachedOnErrors, reachedOnFieldersChoice, hitByPitches, sacrificeFly, sacrificeBunt, intentionalBaseOnBalls, baseOnBalls, flyOuts, groundOuts, strikeOuts, runs, runnersBattedIn, stolenBases, stolenBaseAttempts, doublePlays, leftOnBase)
values ((select id from BBS."Player" where name = 'Gabriel Goderski'),
        (select id from BBS."Game" where gameIdentifier = 'NL2020HB3F001'),
        5,2,0,1,0,1,0,0,0,0,0,1,0,0,0,2,0,0,0,0,1);

insert into "BBS"."GameStats" ( gameId_fk, playerId_fk, plateAppearances, singles, doubles, triples, homeRuns, reachedOnErrors, reachedOnFieldersChoice, hitByPitches, sacrificeFly, sacrificeBunt, intentionalBaseOnBalls, baseOnBalls, flyOuts, groundOuts, strikeOuts, runs, runnersBattedIn, stolenBases, stolenBaseAttempts, doublePlays, leftOnBase)
values ();

insert into "BBS"."GameStats" ( gameId_fk, playerId_fk, plateAppearances, singles, doubles, triples, homeRuns, reachedOnErrors, reachedOnFieldersChoice, hitByPitches, sacrificeFly, sacrificeBunt, intentionalBaseOnBalls, baseOnBalls, flyOuts, groundOuts, strikeOuts, runs, runnersBattedIn, stolenBases, stolenBaseAttempts, doublePlays, leftOnBase)
values ();

insert into "BBS"."GameStats" ( gameId_fk, playerId_fk, plateAppearances, singles, doubles, triples, homeRuns, reachedOnErrors, reachedOnFieldersChoice, hitByPitches, sacrificeFly, sacrificeBunt, intentionalBaseOnBalls, baseOnBalls, flyOuts, groundOuts, strikeOuts, runs, runnersBattedIn, stolenBases, stolenBaseAttempts, doublePlays, leftOnBase)
values ();

insert into "BBS"."GameStats" ( gameId_fk, playerId_fk, plateAppearances, singles, doubles, triples, homeRuns, reachedOnErrors, reachedOnFieldersChoice, hitByPitches, sacrificeFly, sacrificeBunt, intentionalBaseOnBalls, baseOnBalls, flyOuts, groundOuts, strikeOuts, runs, runnersBattedIn, stolenBases, stolenBaseAttempts, doublePlays, leftOnBase)
values ();
