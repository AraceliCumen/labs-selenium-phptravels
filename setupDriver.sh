#!/bin/bash

curl https://chromedriver.storage.googleapis.com/2.40/chromedriver_win32.zip --output driver.zip
unzip driver.zip -d ./src/main/resources/
echo "Adios"
