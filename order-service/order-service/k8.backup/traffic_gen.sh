#!/bin/bash

# Base URL
BASE="http://192.168.2.144:31996"

# List of endpoints to hit
ENDPOINTS=(
    "/orders"
    "/"
    "/actuator/health"
    "/actuator"
    "/orders/7"
    "/orders/1"
    "/orders/54"
    "/orders"
    "/"
    "/orders/90"
    "/orders"
    "/"
)

echo "Starting traffic generation to $BASE..."
echo "--------------------------------------"

for EP in "${ENDPOINTS[@]}"
do
    URL="${BASE}${EP}"
    # Hits the URL, gets the status code, and silences the body
    STATUS=$(curl -s -o /dev/null -w "%{http_code}" "$URL")
    
    if [ "$STATUS" -eq 200 ]; then
        echo -e "SUCCESS [200]: $URL"
    else
        echo -e "CHECK   [$STATUS]: $URL"
    fi
    
    # Wait 0.5 seconds between hits to make the timeline look natural
    sleep 0.5
done

echo "--------------------------------------"
echo "Done! Check your Grafana Dashboard now."
