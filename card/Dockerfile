

# Use the official OpenJDK 17 image as a parent image
#FROM openjdk:17-jdk-slim
#
## Set the working directory in the container
#WORKDIR /usr/src/app
#
## Copy the JAR file from your local machine into the container
#COPY target/card.jar card.jar
#
#EXPOSE 8080
## Specify the command to run your application when the container starts
#CMD ["java", "-jar", "card.jar"]
#
#FROM openjdk:17
#ADD target/card.jar card.jar
#VOLUME /var/lib/mysql
#ENTRYPOINT ["java","-jar", "/card.jar"]


#
#
## Use the official OpenJDK 17 image as a base image
#FROM openjdk:17
#
## Copy the JAR file into the container
#COPY target/card.jar /card.jar
#
## Set the working directory in the container
#WORKDIR /
#
## Expose the port the application runs on
#EXPOSE 8080
#
## Define the command to run the application when the container starts
#CMD ["java", "-jar", "card.jar"]



## Use the official OpenJDK 17 image as a base image
#FROM openjdk:17
#
## Install Python and other necessary packages
#RUN apt-get update && apt-get install -y python3 python3-pip
#
## Copy the JAR file into the container
#COPY target/card.jar /card.jar
#
## Set the working directory in the container
#WORKDIR /
#
## Expose the port the application runs on
#EXPOSE 8080
#
## Define the command to run the application when the container starts
#CMD ["java", "-jar", "card.jar"]
#
## Use the official OpenJDK 17 image as a base image
#FROM openjdk:17-alpine
#
## Install Python and other necessary packages
#RUN apk update && \
#    apk add --no-cache python3 && \
#    python3 -m ensurepip && \
#    rm -r /usr/lib/python*/ensurepip && \
#    pip3 install --upgrade pip setuptools && \
#    rm -r /root/.cache
#
## Set the working directory in the container
#WORKDIR /
#
## Expose the port the application runs on
#EXPOSE 8080
#
## Define the command to run the application when the container starts
#CMD ["java", "-jar", "card.jar"]


## Use the official OpenJDK 17 image as a base image
#FROM openjdk:17-alpine
#
## Install Python and other necessary packages
#RUN apk update && \
#    apk add --no-cache python3 && \
#    python3 -m ensurepip && \
#    rm -r /usr/lib/python*/ensurepip && \
#    pip3 install --upgrade pip setuptools && \
#    rm -r /root/.cache
#
## Set the working directory in the container
#WORKDIR /
#
## Copy the JAR file from your local directory into the Docker image
#COPY target/card.jar .
#
## Expose the port the application runs on
#EXPOSE 8080
#
## Define the command to run the application when the container starts
#CMD ["java", "-jar", "card.jar"]

#
# Use the official OpenJDK 17 image as a base image
FROM openjdk:17-alpine

## Install Python and other necessary packages
#RUN apk update && \
#    apk add --no-cache python3 && \
#    python3 -m ensurepip && \
#    rm -r /usr/lib/python*/ensurepip && \
#    pip3 install --upgrade pip setuptools && \
#    rm -r /root/.cache
#
## Set the working directory in the container
#WORKDIR /
#
## Copy the JAR file from your local directory into the Docker image
#COPY target/card.jar .
#
## Copy Python files into the Docker image
#COPY src/main/java/com/card/card/yalo/ /src/main/java/com/card/card/yalo/
#
## Expose the port the application runs on
#EXPOSE 8080
#
## Define the command to run the application when the container starts
#CMD ["java", "-jar", "card.jar"]

#
## Use the official OpenJDK 17 image as a base image
#FROM openjdk:17-alpine
#
## Install Python, Tesseract, and other necessary packages
#RUN apk update && \
#    apk add --no-cache python3 tesseract-ocr && \
#    python3 -m ensurepip && \
#    rm -r /usr/lib/python*/ensurepip && \
#    pip3 install --upgrade pip setuptools && \
#    pip3 install pytesseract ultralytics && \
#    rm -r /root/.cache
#
## Set the working directory in the container
#WORKDIR /
#
## Copy the JAR file from your local directory into the Docker image
#COPY target/card.jar .
#
## Copy Python files into the Docker image
#COPY src/main/java/com/card/card/yalo/ /src/main/java/com/card/card/yalo/
#
## Expose the port the application runs on
#EXPOSE 8080
#
## Define the command to run the application when the container starts
#CMD ["java", "-jar", "card.jar"]

#
## Use the official OpenJDK 17 image as a base image
#FROM openjdk:17-alpine
#
## Install Python, Tesseract, and other necessary packages
#RUN apk update && \
#    apk add --no-cache python3 tesseract-ocr && \
#    python3 -m ensurepip && \
#    rm -r /usr/lib/python*/ensurepip && \
#    pip3 install --upgrade pip setuptools && \
#    pip3 install pytesseract ultralytics && \
#    rm -r /root/.cache
#
## Set the working directory in the container
#WORKDIR /
#
## Copy the JAR file from your local directory into the Docker image
#COPY target/card.jar .
#
## Copy Python files into the Docker image
#COPY src/main/java/com/card/card/yalo/ /src/main/java/com/card/card/yalo/
#
## Expose the port the application runs on
#EXPOSE 8080
#
## Define the command to run the application when the container starts
#CMD ["java", "-jar", "card.jar"]



## Use the official OpenJDK 17 image as a base image
#FROM openjdk:17-alpine
#
## Install Tesseract OCR and its dependencies
#RUN apk update && \
#    apk add --no-cache tesseract-ocr && \
#    apk add --no-cache imagemagick
#
## Install Python and other necessary packages
#RUN apk add --no-cache python3 && \
#    python3 -m ensurepip && \
#    rm -r /usr/lib/python*/ensurepip && \
#    pip3 install --upgrade pip setuptools && \
#    pip3 install pytesseract ultralytics && \
#    rm -r /root/.cache
#
## Set the working directory in the container
#WORKDIR /
#
## Copy the JAR file from your local directory into the Docker image
#COPY target/card.jar .
#
## Copy Python files into the Docker image
#COPY src/main/java/com/card/card/yalo/ /src/main/java/com/card/card/yalo/
#
## Expose the port the application runs on
#EXPOSE 8080
#
## Define the command to run the application when the container starts
#CMD ["java", "-jar", "card.jar"]







## Use the official OpenJDK 17 image as a base image
#FROM openjdk:17-alpine
#
## Install Tesseract OCR and its dependencies
#RUN apk update && \
#    apk add --no-cache tesseract-ocr && \
#    apk add --no-cache imagemagick
#
## Install Python and other necessary packages
#RUN apk update && \
#    apk add --no-cache py3-numpy py3-scipy && \   # Add pre-built NumPy and SciPy packages \
#    python3 -m ensurepip && \
#    rm -r /usr/lib/python*/ensurepip && \
#    pip3 install --upgrade pip setuptools && \
#    rm -r /root/.cache
#
## Install Python dependencies
#RUN pip3 install pytesseract ultralytics
#
## Set the working directory in the container
#WORKDIR /
#
## Copy the JAR file from your local directory into the Docker image
#COPY target/card.jar .
#
## Copy Python files into the Docker image
#COPY src/main/java/com/card/card/yalo/ /src/main/java/com/card/card/yalo/
#
## Expose the port the application runs on
#EXPOSE 8080
#
## Define the command to run the application when the container starts
#CMD ["java", "-jar", "card.jar"]

#
## Use the official OpenJDK 17 image as a base image
#FROM openjdk:17-alpine
#
## Install Tesseract OCR and its dependencies
#RUN apk update && \
#    apk add --no-cache tesseract-ocr && \
#    apk add --no-cache imagemagick
#
## Install Python and other necessary packages
#RUN apk update && \
#    apk add --no-cache py3-numpy py3-scipy && \
#    # Add pre-built NumPy and SciPy packages \
#    python3 -m ensurepip && \
#    rm -r /usr/lib/python*/ensurepip && \
#    pip3 install --upgrade pip setuptools && \
#    rm -r /root/.cache
#
## Install Python dependencies
#RUN pip3 install pytesseract ultralytics
#
## Set the working directory in the container
#WORKDIR /
#
## Copy the JAR file from your local directory into the Docker image
#COPY target/card.jar .
#
## Copy Python files into the Docker image
#COPY src/main/java/com/card/card/yalo/ /src/main/java/com/card/card/yalo/
#
## Expose the port the application runs on
#EXPOSE 8080
#
## Define the command to run the application when the container starts
#CMD ["java", "-jar", "card.jar"]






## Use the official OpenJDK 17 image as a base image
#FROM openjdk:17-alpine
#
## Install Tesseract OCR and its dependencies
#RUN apk update && \
#    apk add --no-cache tesseract-ocr && \
#    apk add --no-cache imagemagick
#
## Install Python and other necessary packages
#RUN apk update && \
#    apk add --no-cache py3-numpy py3-scipy && \
#    apk add --no-cache \
#        build-base \
#        python3-dev \
#        py3-wheel \
#        libffi-dev \
#        openssl-dev \
#        gfortran \
#        musl-dev \
#        lapack-dev \
#        libpng-dev \
#        freetype-dev \
#        pkgconfig \
#        libwebp-dev \
#        libxslt-dev \
#        zlib-dev \
#        gcc \
#        libc-dev \
#        libjpeg-turbo-dev \
#        libxml2-dev \
#        libxslt-dev && \
#    python3 -m ensurepip && \
#    rm -r /usr/lib/python*/ensurepip && \
#    pip3 install --upgrade pip setuptools && \
#    rm -r /root/.cache
#
## Install Python dependencies
#RUN pip3 install pytesseract ultralytics
#
## Set the working directory in the container
#WORKDIR /
#
## Copy the JAR file from your local directory into the Docker image
#COPY target/card.jar .
#
## Copy Python files into the Docker image
#COPY src/main/java/com/card/card/yalo/ /src/main/java/com/card/card/yalo/
#
## Expose the port the application runs on
#EXPOSE 8080
#
## Define the command to run the application when the container starts
#CMD ["java", "-jar", "card.jar"]
#



#
## Use the official OpenJDK 17 image as a base image
#FROM openjdk:17-alpine
#
## Install Tesseract OCR and its dependencies
#RUN apk update && \
#    apk add --no-cache tesseract-ocr && \
#    apk add --no-cache imagemagick
#
## Install Python and other necessary packages
#RUN apk update && \
#    apk add --no-cache py3-numpy py3-scipy && \
#    apk add --no-cache \
#        build-base \
#        python3-dev \
#        py3-wheel \
#        libffi-dev \
#        openssl-dev \
#        gfortran \
#        musl-dev \
#        lapack-dev \
#        libpng-dev \
#        freetype-dev \
#        pkgconfig \
#        libwebp-dev \
#        libxslt-dev \
#        zlib-dev \
#        gcc \
#        libc-dev \
#        libjpeg-turbo-dev \
#        libxml2-dev \
#        libxslt-dev && \
#    python3 -m ensurepip && \
#    rm -r /usr/lib/python*/ensurepip && \
#    pip3 install --upgrade pip setuptools && \
#    rm -r /root/.cache
#
## Install OpenCV 4.9.0
#RUN pip3 install opencv-python==4.9.0.80
#
## Install Python dependencies
#RUN pip3 install pytesseract ultralytics
#
## Set the working directory in the container
#WORKDIR /
#
## Copy the JAR file from your local directory into the Docker image
#COPY target/card.jar .
#
## Copy Python files into the Docker image
#COPY src/main/java/com/card/card/yalo/ /src/main/java/com/card/card/yalo/
#
## Expose the port the application runs on
#EXPOSE 8080
#
## Define the command to run the application when the container starts
#CMD ["java", "-jar", "card.jar"]









# Use the official OpenJDK 17 image as a base image
FROM openjdk:17-alpine

# Install Tesseract OCR and its dependencies
RUN apk update && \
    apk add --no-cache tesseract-ocr && \
    apk add --no-cache imagemagick

# Install Python and other necessary packages
RUN apk update && \
    apk add --no-cache py3-numpy py3-scipy && \
    apk add --no-cache \
        build-base \
        python3-dev \
        py3-wheel \
        libffi-dev \
        openssl-dev \
        gfortran \
        musl-dev \
        lapack-dev \
        libpng-dev \
        freetype-dev \
        pkgconfig \
        libwebp-dev \
        libxslt-dev \
        zlib-dev \
        gcc \
        libc-dev \
        libjpeg-turbo-dev \
        libxml2-dev \
        libxslt-dev && \
    python3 -m ensurepip && \
    rm -r /usr/lib/python*/ensurepip && \
    pip3 install --upgrade pip setuptools && \
    rm -r /root/.cache

# Install OpenCV 4.9.0
RUN pip3 install opencv-python==4.9.0.80

# Install Python dependencies with specific versions
RUN pip3 install \
    pytesseract==0.3.10 \
    Pillow==8.0.0 \
    matplotlib==3.3.0 \
    pyyaml==5.3.1 \
    requests==2.23.0 \
    torch>=1.8.0 \
    ultralytics==8.2.13

# Set the working directory in the container
WORKDIR /

# Copy the JAR file from your local directory into the Docker image
COPY target/card.jar .

# Copy Python files into the Docker image
COPY src/main/java/com/card/card/yalo/ /src/main/java/com/card/card/yalo/

# Expose the port the application runs on
EXPOSE 8080

# Define the command to run the application when the container starts
CMD ["java", "-jar", "card.jar"]
