---
layout: default
title: Code Review Video
---

# Code Review Video

- Video link: (https://docs.google.com/videos/d/1pxrSFBa-aMQcLYEaPvcQGrRZrfzMU3Wz6JDavFat3xI/edit?usp=sharing)
- Repository: https://github.com/Jhargrove129/CS-499.git
- Summary:
  Purpose: Tracks a user’s current weight through a simple input-and-update flow

  Main screen setup: MainActivity loads the main layout and initializes UI elements via findViewById()

  Key UI components used:

TextView to display the current weight

EditText for weight input

Button to add a new weight

Buttons for View History and Set Goal (placeholders)


Add-weight logic:

Reads and trims the input text

Rejects blank input

Converts input using toDoubleOrNull() to avoid crashes

Rejects non-numeric input

Applies a basic realistic range check (e.g., > 0 and not excessively high)


On success:

Updates the TextView with the new weight

Clears the input field

Shows a “Weight added successfully!”


Future-ready structure:

“View History” and “Set Goal” buttons currently show “coming soon”, but provide hooks for later feature development
