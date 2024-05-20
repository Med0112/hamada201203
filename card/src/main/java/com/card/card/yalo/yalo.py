import sys
import os
import pytesseract as tess
from PIL import Image
from ultralytics import YOLO
import cv2

def detect_id_card(image_path):
    # Set the path to Tesseract OCR executable
    tess.pytesseract.tesseract_cmd = r'Tesseract-OCR/tesseract.exe'

    # Load a model
    model = YOLO(r"src/main/java/com/card/card/yalo/YOLO_Model.pt")  # load a pretrained model (recommended for training)

    # Perform YOLO detection
    results = model(image_path, show=False, save=False)

    # Get the actual YOLO detection results (assuming there is only one image)
    detection_result = results[0]

    # Save the detected image with bounding boxes to disk
    detection_result.save("detected_image.jpg")

    # Open the detected image using OpenCV
    detected_img = cv2.imread("detected_image.jpg")

    # Use Tesseract OCR to extract text from the detected image
    extracted_text_eng = tess.image_to_string(Image.fromarray(detected_img),)

    # Check if the extracted text contains "ID_Card"
    if "ID_Card" in extracted_text_eng:
        return True
    else:
        return False

if __name__ == "__main__":
    # Get the image path from command-line arguments
    if len(sys.argv) < 2:
        print("Usage: python yalo.py <image_path>")
        sys.exit(1)

    image_path = sys.argv[1]
    id_card_found = detect_id_card(image_path)
    print(id_card_found)

    # Delete the detected image file
    os.remove("detected_image.jpg")



#
#
#
# import sys
# import os
# import pytesseract as tess
# from PIL import Image
# from ultralytics import YOLO
# import cv2
#
# def detect_id_card(image_path):
#     # Set the path to Tesseract OCR executable
#     tess.pytesseract.tesseract_cmd = r'/usr/bin/tesseract'
#
#     # Load a model
#     model = YOLO(r"src/main/java/com/card/card/yalo/YOLO_Model.pt")  # load a pretrained model (recommended for training)
#
#     # Perform YOLO detection
#     results = model(image_path, show=False, save=False)
#
#     # Get the actual YOLO detection results (assuming there is only one image)
#     detection_result = results[0]
#
#     # Save the detected image with bounding boxes to disk
#     detection_result.save("detected_image.jpg")
#
#     # Open the detected image using OpenCV
#     detected_img = cv2.imread("detected_image.jpg")
#
#     # Use Tesseract OCR to extract text from the detected image
#     extracted_text_eng = tess.image_to_string(Image.fromarray(detected_img),)
#
#     # Check if the extracted text contains "ID_Card"
#     if "ID_Card" in extracted_text_eng:
#         return True
#     else:
#         return False
#
# if __name__ == "__main__":
#     # Get the image path from command-line arguments
#     if len(sys.argv) < 2:
#         print("Usage: python yalo.py <image_path>")
#         sys.exit(1)
#
#     image_path = sys.argv[1]
#     id_card_found = detect_id_card(image_path)
#     print(id_card_found)
#
#     # Delete the detected image file
#     os.remove("detected_image.jpg")
