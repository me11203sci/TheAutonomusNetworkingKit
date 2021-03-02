# The Autonomous Networking Kit (T.A.N.K.)
Basic code for T.A.N.K. Developed by Melesio Albavera and Adam Azcorra. 

Programs/tools used:

- IntelliJ (Integrated Development Environment for Java)
- F.R.C. Plugin
- Maven (Managing and Fetching Dependencies)
- Gradle (for Deployment)
- Phoenix Tuner
- F.R.C. Radio Configuration Utility

Configuration Stuff to Remember:

1. When starting a new project in IntelliJ, Gradle may throw an error ("Found invalid Gradle JVM configuration") and be unable to build. To fix this go to File > Settings > Search for "Gradle" > Select the proper Java Virtual Machine.
2. Another error, may not allow Gradle to build correctly (Could not initialize class org.codehaus.groovy.reflection.ReflectionCache). to remedy this, go to gradle-wrapper.properties and replace the U.R.L. labeled as "distributionUrl" with https\://services.gradle.org/distributions/gradle-6.3-all.zip.  
3. Connect to the RIO via USB. Image and update its firmware using the RIO Imaging Tool.
4. Start a Diagnostic Server using Phoenix Tuner. Then, update the Talon Firmware and check their I.D. numbers/channels.
5. Go to http://devsite.ctr-electronics.com/maven/release/com/ctre/phoenix/Phoenix-latest.json, download the JSON file and copy it into the Vendordeps Directory.
6. Run the Radio Configuration Utility and follow the instructions to reset and configure the radio/bridge.

Troubleshooting:

1. Enable Driver Station Inbound Rules in Windows Fire Wall.
2. No Gradle is not broken. Even if you did everything right, the first deploy will typically take in excess of 10 minutes. All subsequent deploys are significantly faster.
