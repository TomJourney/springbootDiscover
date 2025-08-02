package com.tom.springnote.upload;

import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.fileupload2.core.DiskFileItemFactory;
import org.apache.commons.fileupload2.core.FileItem;
import org.apache.commons.fileupload2.core.FileItemInput;
import org.apache.commons.fileupload2.core.FileItemInputIterator;
import org.apache.commons.fileupload2.jakarta.JakartaServletFileUpload;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName FileUploadController.java
 * @Description TODO
 * @createTime 2025年01月14日 04:33:00
 */
@Controller
public class FileUploadController {

    @PostMapping("/upload")
    public String handleUpload(HttpServletRequest request) throws Exception {
        boolean isMultipart = JakartaServletFileUpload.isMultipartContent(request);

        JakartaServletFileUpload upload = new JakartaServletFileUpload();
        FileItemInputIterator iterStream = upload.getItemIterator(request);
        while (iterStream.hasNext()) {
            FileItemInput item = iterStream.next();
            String name = item.getFieldName();
            InputStream stream = item.getInputStream();
            if (!item.isFormField()) {
                // Process the InputStream
            } else {
                String formFieldValue = IOUtils.toString(stream, StandardCharsets.UTF_8);
            }
        }

        return "success!";
    }


    @RequestMapping(value = "/uploadPage", method = RequestMethod.GET)
    public ModelAndView uploadPage() {
        ModelAndView model = new ModelAndView();
        model.setViewName("uploadPage");
        return model;
    }
}
