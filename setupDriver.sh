#!/bin/bash

echo "Iniciando descarga de drivers Selenium"

echo "Chrome"
curl https://chromedriver.storage.googleapis.com/2.40/chromedriver_win32.zip --output driverChrome.zip
unzip driverChrome.zip -d ./src/main/resources/

echo "Proceso finalizado"
