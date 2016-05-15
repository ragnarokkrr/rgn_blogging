#!/usr/bin/env bash

echo "Creating group: ragna-service"
/usr/sbin/groupadd -f -r ragna-service 2> /dev/null || :

echo "Creating user: ragna-service"
/usr/sbin/useradd -r -m -c "ragna-service user" ragna-service -g ragna-service 2> /dev/null || :