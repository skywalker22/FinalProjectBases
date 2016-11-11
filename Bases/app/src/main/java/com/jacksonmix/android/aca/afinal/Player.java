
package com.jacksonmix.android.aca.afinal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Player implements Serializable {

    @SerializedName("PlayerID")
    @Expose
    private Integer playerID;
    @SerializedName("SportsDataID")
    @Expose
    private String sportsDataID;
    @SerializedName("Status")
    @Expose
    private String status;
    @SerializedName("TeamID")
    @Expose
    private Integer teamID;
    @SerializedName("Team")
    @Expose
    private String team;
    @SerializedName("Jersey")
    @Expose
    private Integer jersey;
    @SerializedName("PositionCategory")
    @Expose
    private String positionCategory;
    @SerializedName("Position")
    @Expose
    private String position;
    @SerializedName("MLBAMID")
    @Expose
    private Integer mLBAMID;
    @SerializedName("FirstName")
    @Expose
    private String firstName;
    @SerializedName("LastName")
    @Expose
    private String lastName;
    @SerializedName("BatHand")
    @Expose
    private String batHand;
    @SerializedName("ThrowHand")
    @Expose
    private String throwHand;
    @SerializedName("Height")
    @Expose
    private Integer height;
    @SerializedName("Weight")
    @Expose
    private Integer weight;
    @SerializedName("BirthDate")
    @Expose
    private String birthDate;
    @SerializedName("BirthCity")
    @Expose
    private String birthCity;
    @SerializedName("BirthState")
    @Expose
    private String birthState;
    @SerializedName("BirthCountry")
    @Expose
    private String birthCountry;
    @SerializedName("HighSchool")
    @Expose
    private Object highSchool;
    @SerializedName("College")
    @Expose
    private Object college;
    @SerializedName("ProDebut")
    @Expose
    private Object proDebut;
    @SerializedName("Salary")
    @Expose
    private Integer salary;
    @SerializedName("PhotoUrl")
    @Expose
    private String photoUrl;
    @SerializedName("SportRadarPlayerID")
    @Expose
    private String sportRadarPlayerID;
    @SerializedName("RotoworldPlayerID")
    @Expose
    private Integer rotoworldPlayerID;
    @SerializedName("RotoWirePlayerID")
    @Expose
    private Integer rotoWirePlayerID;
    @SerializedName("FantasyAlarmPlayerID")
    @Expose
    private Integer fantasyAlarmPlayerID;
    @SerializedName("StatsPlayerID")
    @Expose
    private Integer statsPlayerID;
    @SerializedName("SportsDirectPlayerID")
    @Expose
    private Integer sportsDirectPlayerID;
    @SerializedName("XmlTeamPlayerID")
    @Expose
    private Integer xmlTeamPlayerID;
    @SerializedName("InjuryStatus")
    @Expose
    private String injuryStatus;
    @SerializedName("InjuryBodyPart")
    @Expose
    private String injuryBodyPart;
    @SerializedName("InjuryStartDate")
    @Expose
    private Object injuryStartDate;
    @SerializedName("InjuryNotes")
    @Expose
    private String injuryNotes;
    @SerializedName("FanDuelPlayerID")
    @Expose
    private Integer fanDuelPlayerID;
    @SerializedName("DraftKingsPlayerID")
    @Expose
    private Integer draftKingsPlayerID;
    @SerializedName("YahooPlayerID")
    @Expose
    private Integer yahooPlayerID;
    @SerializedName("UpcomingGameID")
    @Expose
    private Integer upcomingGameID;
    @SerializedName("FanDuelName")
    @Expose
    private String fanDuelName;
    @SerializedName("DraftKingsName")
    @Expose
    private String draftKingsName;
    @SerializedName("YahooName")
    @Expose
    private String yahooName;

    /**
     * 
     * @return
     *     The playerID
     */
    public Integer getPlayerID() {
        return playerID;
    }

    /**
     * 
     * @param playerID
     *     The PlayerID
     */
    public void setPlayerID(Integer playerID) {
        this.playerID = playerID;
    }

    /**
     * 
     * @return
     *     The sportsDataID
     */
    public String getSportsDataID() {
        return sportsDataID;
    }

    /**
     * 
     * @param sportsDataID
     *     The SportsDataID
     */
    public void setSportsDataID(String sportsDataID) {
        this.sportsDataID = sportsDataID;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The Status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The teamID
     */
    public Integer getTeamID() {
        return teamID;
    }

    /**
     * 
     * @param teamID
     *     The TeamID
     */
    public void setTeamID(Integer teamID) {
        this.teamID = teamID;
    }

    /**
     * 
     * @return
     *     The team
     */
    public String getTeam() {
        return team;
    }

    /**
     * 
     * @param team
     *     The Team
     */
    public void setTeam(String team) {
        this.team = team;
    }

    /**
     * 
     * @return
     *     The jersey
     */
    public Integer getJersey() {
        return jersey;
    }

    /**
     * 
     * @param jersey
     *     The Jersey
     */
    public void setJersey(Integer jersey) {
        this.jersey = jersey;
    }

    /**
     * 
     * @return
     *     The positionCategory
     */
    public String getPositionCategory() {
        return positionCategory;
    }

    /**
     * 
     * @param positionCategory
     *     The PositionCategory
     */
    public void setPositionCategory(String positionCategory) {
        this.positionCategory = positionCategory;
    }

    /**
     * 
     * @return
     *     The position
     */
    public String getPosition() {
        return position;
    }

    /**
     * 
     * @param position
     *     The Position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 
     * @return
     *     The mLBAMID
     */
    public Integer getMLBAMID() {
        return mLBAMID;
    }

    /**
     * 
     * @param mLBAMID
     *     The MLBAMID
     */
    public void setMLBAMID(Integer mLBAMID) {
        this.mLBAMID = mLBAMID;
    }

    /**
     * 
     * @return
     *     The firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * @param firstName
     *     The FirstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * @return
     *     The lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * @param lastName
     *     The LastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     * @return
     *     The batHand
     */
    public String getBatHand() {
        return batHand;
    }

    /**
     * 
     * @param batHand
     *     The BatHand
     */
    public void setBatHand(String batHand) {
        this.batHand = batHand;
    }

    /**
     * 
     * @return
     *     The throwHand
     */
    public String getThrowHand() {
        return throwHand;
    }

    /**
     * 
     * @param throwHand
     *     The ThrowHand
     */
    public void setThrowHand(String throwHand) {
        this.throwHand = throwHand;
    }

    /**
     * 
     * @return
     *     The height
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The Height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * 
     * @return
     *     The weight
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * 
     * @param weight
     *     The Weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * 
     * @return
     *     The birthDate
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * 
     * @param birthDate
     *     The BirthDate
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * 
     * @return
     *     The birthCity
     */
    public String getBirthCity() {
        return birthCity;
    }

    /**
     * 
     * @param birthCity
     *     The BirthCity
     */
    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    /**
     * 
     * @return
     *     The birthState
     */
    public String getBirthState() {
        return birthState;
    }

    /**
     * 
     * @param birthState
     *     The BirthState
     */
    public void setBirthState(String birthState) {
        this.birthState = birthState;
    }

    /**
     * 
     * @return
     *     The birthCountry
     */
    public String getBirthCountry() {
        return birthCountry;
    }

    /**
     * 
     * @param birthCountry
     *     The BirthCountry
     */
    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    /**
     * 
     * @return
     *     The highSchool
     */
    public Object getHighSchool() {
        return highSchool;
    }

    /**
     * 
     * @param highSchool
     *     The HighSchool
     */
    public void setHighSchool(Object highSchool) {
        this.highSchool = highSchool;
    }

    /**
     * 
     * @return
     *     The college
     */
    public Object getCollege() {
        return college;
    }

    /**
     * 
     * @param college
     *     The College
     */
    public void setCollege(Object college) {
        this.college = college;
    }

    /**
     * 
     * @return
     *     The proDebut
     */
    public Object getProDebut() {
        return proDebut;
    }

    /**
     * 
     * @param proDebut
     *     The ProDebut
     */
    public void setProDebut(Object proDebut) {
        this.proDebut = proDebut;
    }

    /**
     * 
     * @return
     *     The salary
     */
    public Integer getSalary() {
        return salary;
    }

    /**
     * 
     * @param salary
     *     The Salary
     */
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    /**
     * 
     * @return
     *     The photoUrl
     */
    public String getPhotoUrl() {
        return photoUrl;
    }

    /**
     * 
     * @param photoUrl
     *     The PhotoUrl
     */
    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    /**
     * 
     * @return
     *     The sportRadarPlayerID
     */
    public String getSportRadarPlayerID() {
        return sportRadarPlayerID;
    }

    /**
     * 
     * @param sportRadarPlayerID
     *     The SportRadarPlayerID
     */
    public void setSportRadarPlayerID(String sportRadarPlayerID) {
        this.sportRadarPlayerID = sportRadarPlayerID;
    }

    /**
     * 
     * @return
     *     The rotoworldPlayerID
     */
    public Integer getRotoworldPlayerID() {
        return rotoworldPlayerID;
    }

    /**
     * 
     * @param rotoworldPlayerID
     *     The RotoworldPlayerID
     */
    public void setRotoworldPlayerID(Integer rotoworldPlayerID) {
        this.rotoworldPlayerID = rotoworldPlayerID;
    }

    /**
     * 
     * @return
     *     The rotoWirePlayerID
     */
    public Integer getRotoWirePlayerID() {
        return rotoWirePlayerID;
    }

    /**
     * 
     * @param rotoWirePlayerID
     *     The RotoWirePlayerID
     */
    public void setRotoWirePlayerID(Integer rotoWirePlayerID) {
        this.rotoWirePlayerID = rotoWirePlayerID;
    }

    /**
     * 
     * @return
     *     The fantasyAlarmPlayerID
     */
    public Integer getFantasyAlarmPlayerID() {
        return fantasyAlarmPlayerID;
    }

    /**
     * 
     * @param fantasyAlarmPlayerID
     *     The FantasyAlarmPlayerID
     */
    public void setFantasyAlarmPlayerID(Integer fantasyAlarmPlayerID) {
        this.fantasyAlarmPlayerID = fantasyAlarmPlayerID;
    }

    /**
     * 
     * @return
     *     The statsPlayerID
     */
    public Integer getStatsPlayerID() {
        return statsPlayerID;
    }

    /**
     * 
     * @param statsPlayerID
     *     The StatsPlayerID
     */
    public void setStatsPlayerID(Integer statsPlayerID) {
        this.statsPlayerID = statsPlayerID;
    }

    /**
     * 
     * @return
     *     The sportsDirectPlayerID
     */
    public Integer getSportsDirectPlayerID() {
        return sportsDirectPlayerID;
    }

    /**
     * 
     * @param sportsDirectPlayerID
     *     The SportsDirectPlayerID
     */
    public void setSportsDirectPlayerID(Integer sportsDirectPlayerID) {
        this.sportsDirectPlayerID = sportsDirectPlayerID;
    }

    /**
     * 
     * @return
     *     The xmlTeamPlayerID
     */
    public Integer getXmlTeamPlayerID() {
        return xmlTeamPlayerID;
    }

    /**
     * 
     * @param xmlTeamPlayerID
     *     The XmlTeamPlayerID
     */
    public void setXmlTeamPlayerID(Integer xmlTeamPlayerID) {
        this.xmlTeamPlayerID = xmlTeamPlayerID;
    }

    /**
     * 
     * @return
     *     The injuryStatus
     */
    public String getInjuryStatus() {
        return injuryStatus;
    }

    /**
     * 
     * @param injuryStatus
     *     The InjuryStatus
     */
    public void setInjuryStatus(String injuryStatus) {
        this.injuryStatus = injuryStatus;
    }

    /**
     * 
     * @return
     *     The injuryBodyPart
     */
    public String getInjuryBodyPart() {
        return injuryBodyPart;
    }

    /**
     * 
     * @param injuryBodyPart
     *     The InjuryBodyPart
     */
    public void setInjuryBodyPart(String injuryBodyPart) {
        this.injuryBodyPart = injuryBodyPart;
    }

    /**
     * 
     * @return
     *     The injuryStartDate
     */
    public Object getInjuryStartDate() {
        return injuryStartDate;
    }

    /**
     * 
     * @param injuryStartDate
     *     The InjuryStartDate
     */
    public void setInjuryStartDate(Object injuryStartDate) {
        this.injuryStartDate = injuryStartDate;
    }

    /**
     * 
     * @return
     *     The injuryNotes
     */
    public String getInjuryNotes() {
        return injuryNotes;
    }

    /**
     * 
     * @param injuryNotes
     *     The InjuryNotes
     */
    public void setInjuryNotes(String injuryNotes) {
        this.injuryNotes = injuryNotes;
    }

    /**
     * 
     * @return
     *     The fanDuelPlayerID
     */
    public Integer getFanDuelPlayerID() {
        return fanDuelPlayerID;
    }

    /**
     * 
     * @param fanDuelPlayerID
     *     The FanDuelPlayerID
     */
    public void setFanDuelPlayerID(Integer fanDuelPlayerID) {
        this.fanDuelPlayerID = fanDuelPlayerID;
    }

    /**
     * 
     * @return
     *     The draftKingsPlayerID
     */
    public Integer getDraftKingsPlayerID() {
        return draftKingsPlayerID;
    }

    /**
     * 
     * @param draftKingsPlayerID
     *     The DraftKingsPlayerID
     */
    public void setDraftKingsPlayerID(Integer draftKingsPlayerID) {
        this.draftKingsPlayerID = draftKingsPlayerID;
    }

    /**
     * 
     * @return
     *     The yahooPlayerID
     */
    public Integer getYahooPlayerID() {
        return yahooPlayerID;
    }

    /**
     * 
     * @param yahooPlayerID
     *     The YahooPlayerID
     */
    public void setYahooPlayerID(Integer yahooPlayerID) {
        this.yahooPlayerID = yahooPlayerID;
    }

    /**
     * 
     * @return
     *     The upcomingGameID
     */
    public Integer getUpcomingGameID() {
        return upcomingGameID;
    }

    /**
     * 
     * @param upcomingGameID
     *     The UpcomingGameID
     */
    public void setUpcomingGameID(Integer upcomingGameID) {
        this.upcomingGameID = upcomingGameID;
    }

    /**
     * 
     * @return
     *     The fanDuelName
     */
    public String getFanDuelName() {
        return fanDuelName;
    }

    /**
     * 
     * @param fanDuelName
     *     The FanDuelName
     */
    public void setFanDuelName(String fanDuelName) {
        this.fanDuelName = fanDuelName;
    }

    /**
     * 
     * @return
     *     The draftKingsName
     */
    public String getDraftKingsName() {
        return draftKingsName;
    }

    /**
     * 
     * @param draftKingsName
     *     The DraftKingsName
     */
    public void setDraftKingsName(String draftKingsName) {
        this.draftKingsName = draftKingsName;
    }

    /**
     * 
     * @return
     *     The yahooName
     */
    public String getYahooName() {
        return yahooName;
    }

    /**
     * 
     * @param yahooName
     *     The YahooName
     */
    public void setYahooName(String yahooName) {
        this.yahooName = yahooName;
    }

    public static class PlayerResult {

        private List<Player> results;
        public List<Player> getResults(){
            return results;
        }

    }

}
