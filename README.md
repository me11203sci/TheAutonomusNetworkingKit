# The Autonomus Networking Kit (T.A.N.K.)
Basic code for T.A.N.K. Developed by Melesio Albavera and Adam Azcorra. 

Programs/tools used:

- IntelliJ (Integrated Development Enviroment for Java)
- F.R.C. Plugin
- Maven (Managing and Fetching Dependencies)
- Gradle (for Deployment)

Configuration Stuff to Remember:

1. Connect to the RIO via USB. Image and update its firmware using the RIO Imaging Tool.
2. Start a Diagnostic Server using Phonix Tuner. Then, update the Talon Firmware and check their I.D. numbers/channels.
3. Go to http://devsite.ctr-electronics.com/maven/release/com/ctre/phoenix/Phoenix-latest.json, download the JSON file and copy it into the Vendordeps Directory.
4. Run the Radio Configuration Utiliy and follow the instructions to reset and configure the radio/bridge.

Troubleshooting:

1. Enable Driver Station Inbound Rules in Windows Fire Wall.
2. No Gradle is not broken. Even if you did everything right the first deploy will typically take in excess of 10 mintues. All subsequent deploys are significantly faster.
