#!/bin/sh
# Copyright 2013 Dell Inc.
# ALL RIGHTS RESERVED.
# 
# This software is the confidential and proprietary information of
# Dell Inc. ("Confidential Information").  You shall not
# disclose such Confidential Information and shall use it only in
# accordance with the terms of the license agreement you entered
# into with Dell Inc.
# 
# DELL INC. MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT
# THE SUITABILITY OF THE SOFTWARE, EITHER EXPRESS OR IMPLIED,
# INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF
# MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR
# NON-INFRINGEMENT. DELL SHALL NOT BE LIABLE FOR ANY
# DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING
# OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.


#

#
# Starts the agent harness to create a new agent
# from the default template
#

HERE=`dirname "$0"`
cd "$HERE/.."
ROOT_DIR=`pwd` ; readonly ROOT_DIR

#
# Check to make sure JAVA_HOME is set.
#
if test -z "$JAVA_HOME" ; then
    echo "$0 error: JAVA_HOME environment variable must be set"
    exit 1
fi
readonly JAVA_HOME

#
# Find the Java executable.
#
if test -x "$JAVA_HOME/bin/java" ; then
    JRE="$JAVA_HOME/bin/java"
else
  if test -x "$JAVA_HOME/jre/bin/java" ; then
      JRE="$JAVA_HOME/jre/bin/java"
  fi
fi
if test -z "$JRE" ; then
    echo "$0 error: could not find a suitable JRE in $JAVA_HOME"
    exit 1
fi
readonly JRE

#
# Now build up the classpath
#
CLASSPATH=""
for file in "$ROOT_DIR"/lib/*.jar ; do
    if test -z "$CLASSPATH" ; then
        CLASSPATH="$file"
    else
        CLASSPATH="${CLASSPATH}:$file"
    fi
done
readonly CLASSPATH


#
# All right, let's run this thing.
#
exec "$JRE" $JAVA_OPTIONS -classpath "$CLASSPATH" com.quest.glue.tools.wizards.newagent.Main
