package kopo.poly.mapper;

import kopo.poly.dto.StudentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IStudentMapper {

    void insertStudent(StudentDTO pDTO) throws Exception;
//결과값 없음

List<StudentDTO> getStudentList() throws Exception;
//select 값 2개이상


StudentDTO getStudent(StudentDTO pDTO) throws Exception;
}
