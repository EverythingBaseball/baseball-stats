CREATE SCHEMA "BBS";

-- CREATE TABLE IF NOT EXISTS "BBS"."Player" (
--     id BIGINT AUTO_INCREMENT PRIMARY KEY,
--     name VARCHAR2 NOT NULL
-- --    lesson INT NOT NULL,
-- --    version INT NOT NULL,
-- --    content CLOB NOT NULL
-- );
--
-- CREATE TABLE IF NOT EXISTS "BBS"."Game" (
--     id BIGINT AUTO_INCREMENT PRIMARY KEY,
--     gameIdentifier VARCHAR2 NOT NULL,
--     gameDate DATE NOT NULL,
--     homeTeam_fk BIGINT, --NOT NULL,
--     awayTeam_fk BIGINT, --NOT NULL
-- );
--
-- CREATE TABLE IF NOT EXISTS "BBS"."GameStats" (
--     id BIGINT AUTO_INCREMENT PRIMARY KEY,
--     gameId_fk BIGINT NOT NULL,
--     playerId_fk BIGINT NOT NULL,
--     plateAppearances INT,
--     singles INT,
--     doubles INT,
--     triples INT,
--     homeRuns INT,
--     reachedOnErrors INT,
--     reachedOnFieldersChoice INT,
--     hitByPitches INT,
--     sacrificeFly INT,
--     sacrificeBunt INT,
--     intentionalBaseOnBalls INT,
--     baseOnBalls INT,
--     flyOuts INT,
--     groundOuts INT,
--     strikeOuts INT,
--     runs INT,
--     runnersBattedIn INT,
--     stolenBases INT,
--     stolenBaseAttempts INT,
--     doublePlays INT,
--     leftOnBase INT
-- );
--
-- ALTER TABLE "BBS"."GameStats"
--     ADD CONSTRAINT UNIQUE_GAME_ID UNIQUE ( gameId_fk );

-- insert into "BBS"."GameStats" ( gameId, player_fk, plateAppearances, singles, doubles, triples, homeRuns, reachedOnErrors, reachedOnFieldersChoice, hitByPitches, sacrificeFly, sacrificeBunt, intentionalBaseOnBalls, baseOnBalls, flyOuts, groundOuts, strikeOuts, runs, runnersBattedIn, stolenBases, stolenBaseAttempts, doublePlays, leftOnBase)
-- values ();


CREATE TABLE IF NOT EXISTS STATISTICS (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    player VARCHAR2 NOT NULL,
    game VARCHAR2 NOT NULL,
    at_bats INT,
    singles INT,
    doubles INT,
    triples INT,
    home_runs INT,
    reached_on_errors INT,
    reached_on_fielders_choice INT,
    hit_by_pitches INT,
    sacrifice_fly INT,
    sacrifice_bunt INT,
    intentional_base_on_balls INT,
    base_on_balls INT,
    fly_outs INT,
    ground_outs INT,
    strike_outs INT,
    runs INT,
    runners_batted_in INT,
    stolen_bases INT,
    stolen_base_attempts INT,
    double_plays INT,
    left_on_bases INT
);