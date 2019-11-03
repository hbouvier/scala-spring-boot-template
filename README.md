#


SBT Configuration

```bash
export JAVA_OPTS="${JAVA_OPTS} -Xms2048M -Xmx2048M -Xss6M"
export SBT_OPTS="-Xmx2G -XX:+UseConcMarkSweepGC -XX:+CMSClassUnloadingEnabled -Xss6M -XX:MaxMetaspaceSize=512m -XX:+CMSClassUnloadingEnabled"
```