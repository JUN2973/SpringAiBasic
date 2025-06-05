package kopo.poly.service;

import kopo.poly.dto.OcrDTO;
import kopo.poly.service.impl.IOcrService;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OcrService implements IOcrService {

    @Override
    public OcrDTO getReadforImageText(OcrDTO pDTO) throws Exception {

        log.info(this.getClass().getName() + ".getReadforImageText Start!");

        ClassPathResource resource = new ClassPathResource(pDTO.getFilePath() + "/" + pDTO.getFileName());

        ITesseract instance = new Tesseract();

        instance.setDatapath(IOcrService.modelFile);

        instance.setLanguage("kor");

        String result = instance.doOCR(resource.getFile());

        pDTO.setResult(result);

        log.info(this.getClass().getName() + ".getReadforImageText End!");

        return pDTO;


    }
}
