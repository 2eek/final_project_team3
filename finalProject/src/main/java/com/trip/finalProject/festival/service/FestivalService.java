package com.trip.finalProject.festival.service;

import java.util.List;
import java.util.Map;

public interface FestivalService {

	void getFestivalInfoAndSave() throws Exception;

	List<FestivalInfoVO> getFestivalCalendarInfo();

	String getFestivalContent(String contentId);

	List<FestivalInfoVO> getFestivalListInfo();

	List<FestivalInfoVO> getFestivalNewList(String year, String month);

    Integer modifyFestivalInfo(FestivalInfoVO festivalInfoVO);

	Integer removeFestivalInfo(String contentId);
}
