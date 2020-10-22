/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart_corkscrew_homework;

import java.util.HashMap;
import java.util.Map;

/**
 *Smart Corkscrew Homework. 
 * Methodology of Programming 2
 * @author Beltran Castro Carlos Ricardo
 * Neptun code: VY6V8S
 */
public class YougotTaste {
    //This is where the function to Scan QR code from bottle works -- 
        // Taken added and modified from Websearch

        String qrCodeData = "Pleae Scan Bottle with YOur Smart CorkScrew";
		String filePath = "QRCode.png";
		String charset = "UTF-8"; // or "ISO-8859-1"
		Map hintMap = new HashMap();
		hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
		System.out.println("Data read from Bottle QR Code:_____ "
                    + "Find information about your Bottle in MyCorkScrewAPP "
				+ readQRCode(filePath, charset, hintMap));
    }
            //Logoc to read QR code from bottle                     
    public static String readQRCode(String filePath, String charset, Map hintMap)
			throws FileNotFoundException, IOException, NotFoundException {
                                BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(
                                new BufferedImageLuminanceSource(
				ImageIO.read(new FileInputStream(filePath)))));
                                Result qrCodeResult = new MultiFormatReader().decode(binaryBitmap,
				hintMap);
                                return qrCodeResult.getText();
                        }
}
