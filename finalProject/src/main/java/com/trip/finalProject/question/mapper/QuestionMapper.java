	package com.trip.finalProject.question.mapper;

import java.util.List;

import com.trip.finalProject.common.PagingVO;
import com.trip.finalProject.question.service.QuestionVO;

public interface QuestionMapper {
	//페이징 - 가이드용
	public int getTotalCount(String answerMemberId);
	//페이징 - 멤버용
	public int getTotalMember(String memberId);
	//전체조회
	public List<QuestionVO> selectAllQue(QuestionVO questionVO, PagingVO pagingVO);
	//등록
	public int insertQue(QuestionVO qeustionVO);
	//수정
	public int updateQue(QuestionVO questionVO);
	
	public List<QuestionVO> selectAllQueMember(QuestionVO questionVO, PagingVO pagingVO);
	
	// 0903 창민 추가
	// 문의글 등록(관리자)
	public int insertQuestion(QuestionVO questionVO);
	
	// 문의글 전체 조회 카운트(관리자)
	public int countAllQuestion();
	
	// 문의글 전체 조회(관리자)
	public List<QuestionVO> selectAllQuestion(PagingVO pagingVO);
	
	// 문의 답변 입력(관리자)
	public int insertAnswerToQuestion(QuestionVO questionVO);
	
	// 문의 단건 조회(관리자 - ajax용)
	public QuestionVO ajaxSelectOneQuestion(QuestionVO questionVO);
	
	// 조건에 따른 문의글 카운트
	public int countAllQuestionByType(QuestionVO questionVO);
	
	// 조건에 따른 문의글 전체 검색
	public List<QuestionVO> selectAllQuestionByType(PagingVO pagingVO, QuestionVO questionVO);
	
}
