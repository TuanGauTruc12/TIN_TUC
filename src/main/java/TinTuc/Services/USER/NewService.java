package TinTuc.Services.USER;

import java.util.List;

import org.springframework.stereotype.Service;

import TinTuc.DTO.NewDTO;
import TinTuc.DTO.NewDetailDTO;

@Service
public interface NewService {
	public NewDetailDTO getNewDetailBySlug(String slug);
	public List<NewDTO> getNewByAuthor(int author);
	public List<NewDTO> getNewByProperty(int propertyID);
}
