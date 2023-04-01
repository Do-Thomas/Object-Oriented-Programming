/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.Collections;
import tool.MyUtil;

/**
 *
 * @author Tran Phong <phongntse150974@fpt.edu.vn>
 */
public class TranscriptList extends ArrayList<Transcript>{
    public ArrayList<Transcript> getGradeList() {
        return this;
    }
    
    public boolean addGrade(Transcript newTranscript) {
        try {
            return this.add(newTranscript);
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean deleteGrade(Transcript delTranscript) {
        try {
            return this.remove(delTranscript);
        } catch (Exception e) {
            return false;
        }
    }
    
    public Transcript searchTranscript(String StudentID, String SubjectID) {
        for (Transcript transcript : this) {
            if ((StudentID.equalsIgnoreCase(transcript.getStudentID())) && (SubjectID.equalsIgnoreCase(transcript.getSubjectID())))
                return transcript;
        }
        return null;
    }
    
    public ArrayList<Transcript> reportGradeByStu(String StudentID) {
        ArrayList<Transcript> resultList = new ArrayList<>();
        for (Transcript grade : this) {
            if (MyUtil.checkEqualString(StudentID, grade.getStudentID()))
                resultList.add(grade);
        }
        return resultList;
    }
    
    public ArrayList<Transcript> reportGradeBySub(String SubjectID) {
        ArrayList<Transcript> resultList = new ArrayList<>();
        for (Transcript transcript : this) {
            if (MyUtil.checkEqualString(SubjectID, transcript.getSubjectID()))
                resultList.add(transcript);
        }
        return resultList;
    }
    
    public boolean updateGrade(Transcript oldGrade, Transcript newGrade) {
        try {
            if (searchTranscript(oldGrade.getStudentID(), oldGrade.getSubjectID()) == null)
                return false;
            if (MyUtil.checkFloatNumber(newGrade.getFinalexam(), 0.0f, 10.0f))
                oldGrade.setFinalexam(newGrade.getFinalexam());
            if (MyUtil.checkFloatNumber(newGrade.getLab(), 0.0f, 10.0f))
                oldGrade.setLabs(newGrade.getLab());
            if (MyUtil.checkFloatNumber(newGrade.getTest(), 0.0f, 10.0f))
                oldGrade.setTest(newGrade.getTest());
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
