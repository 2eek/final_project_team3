package com.trip.finalProject.trip.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.trip.finalProject.trip.service.TripService;
import com.trip.finalProject.trip.service.TripVO;

@Controller
public class TripController {
	@Autowired
	TripService tripService;
	
	//여행기록 전체 조회
	@GetMapping("tripRecordList")
	public String tirpRecordList(Model model) {
		model.addAttribute("tripRecordList", tripService.getTripAll());
		return "trip/tripRecordList";
	}
	
	//여행기록 등록 - form
	@GetMapping("tripRecordInsert")
	public String tripRecordInsertForm(Model model) {
		model.addAttribute("tripVO", new TripVO());
		return "trip/tripRecordInsert";
	}
	
	//여행기록 등록 - 처리
	@PostMapping("tripRecordInsert")
	public String tripRecordInsertProcess(TripVO tripVO) {
		tripService.InsertTripInfo(tripVO);
		return "redirect:/tripRecordList";
	}
	
	//여행기록 지도 등록
	
	//여행기록 메모 등록
}
