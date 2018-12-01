# JavaFXSignInTemplate
Software Engineering Fundamentals Project
# About
This program is a recreational sports league management system. Users can create acounts of 
different tiers, spectator, player, or team manager. All accounts can follow teams, view 
teams/events, and comment on team pages, players can request to join teams, and managers 
can set up teams and events, as well as update their team's scores.
# Installation for Intellij
1. Download the zip of this project and extract to desired directory
2. Create a basic JavaFX project
3. Delete src folder in base project
4. Copy all the contents of the unzipped project and paste it into base project folder
# Known Issues/Limitations
- Text files that back up data can be manipulated externally
- No verification for certain actions:
  - Remove player from team
  - Cancel/Deactivate events
  - Changing account tier from Manager to anything else (Deletes Manager account’s team if user goes through with their edits)
- PNGs are the only allowed file type for profile pictures
- Files are only read at the beginning of running and written at the end of running the application
# Credits
Author: Gregorio Lozada</br>
Java Code: Gregorio Lozada, Jake Sherman, Jordan Moses, Jordan Sasek</br>
FXML Code: Guilherme Pereira, Andrew Wilson</br>
CSS Code: Guilherme Pereira
