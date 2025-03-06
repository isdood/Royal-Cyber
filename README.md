# Royal-Cyber
A way to experience Instagram in a magically new way 🪄 An elegant purple & pink UI makes this a staple of Caleb & STARWEAVE'S incredible creations 🧬☄️

## Community Engagement
We believe in the power of community and collaboration. Royal Cyber is an open-source project, and we invite everyone to contribute, share ideas, and help us improve. Your contributions can make a significant impact!

## How to Contribute
- **Fork the repository**: Click on the 'Fork' button at the top right of this page.
- **Create a branch**: Use `git checkout -b your-branch-name` to create a new branch.
- **Make your changes**: Make your changes and commit them with clear messages.
- **Submit a pull request**: Once your changes are ready, submit a pull request for review.

## Join the Community
- **Discussions**: Join our [GitHub Discussions](https://github.com/isdood/Royal-Cyber/discussions) to share your ideas and connect with other contributors.
- **Issues**: Report bugs or request features through our [issue tracker](https://github.com/isdood/Royal-Cyber/issues).

Let's build something amazing together!

## Theme Engine

### Overview
The `ThemeEngine` class is responsible for managing themes within the application. It ensures that only theme-related code evolves and operates within a very tight memory constraint.

### Usage
To use the `ThemeEngine`, follow these steps:
1. Initialize the `ThemeEngine` in your activity:
   ```java
   ThemeEngine themeEngine = new ThemeEngine(this);
   ```
2. Apply the theme using the `applyTheme` method:
   ```java
   themeEngine.applyTheme();
   ```

### Memory Constraints
The `ThemeEngine` enforces a memory constraint to ensure that theme-related code does not exceed a specified memory limit. This helps prevent any potential breakout code.

### Permission Control
The `ThemeEngine` includes permission control mechanisms to restrict the evolution of theme-related code. This ensures that only authorized code can modify the theme settings.

## AI Access and API Key Entry

### Overview
The `AISettingsActivity` class is responsible for handling AI access and API key entry within the application. It provides methods to pay for AI access and enter your own API keys.

### Usage
To use the AI access and API key entry feature, follow these steps:
1. Navigate to the AI Settings screen by clicking the "AI Settings" button in the Home screen.
2. Enter your API key in the provided field and click the "Save API Key" button to save it.
3. To pay for AI access, click the "Pay for AI Access" button and follow the payment instructions.

### Implementation
The `AISettingsActivity` class includes methods to handle payment for AI access and entering API keys. It also includes UI elements for payment and API key entry, and logic to save API keys and handle payments.

## Post Scheduling Feature

### Overview
The `PostScheduler` class is responsible for handling the scheduling logic within the application. It allows users to schedule posts for a specific time, enabling them to edit all at once but spread out the content.

### Usage
To use the post scheduling feature, follow these steps:
1. Initialize the `PostScheduler` in your activity:
   ```java
   PostScheduler postScheduler = new PostScheduler();
   ```
2. Schedule a post using the `schedulePost` method:
   ```java
   Post post = new Post("imageUrl", "caption", "location");
   long scheduledTime = System.currentTimeMillis() + 60000; // Schedule for 1 minute later
   postScheduler.schedulePost(post, scheduledTime);
   ```

### Implementation
The `PostScheduler` class includes methods to schedule posts and check for scheduled posts to be posted. It also includes logic to handle the scheduling and posting of the scheduled posts.

### UI Elements
The post scheduling feature includes new UI elements in the `activity_home.xml` and `activity_storybook.xml` files. These elements allow users to schedule posts directly from the UI.

### Code Changes
The following code changes were made to implement the post scheduling feature:
- Added a new `PostScheduler` class to handle scheduling logic.
- Updated the `Post` class to include a `scheduledTime` attribute and its getter and setter methods.
- Modified the `PostAdapter` to display scheduled posts with a different UI indication.
- Added UI elements in `activity_home.xml` and `activity_storybook.xml` for scheduling posts.
- Updated `HomeActivity` and `StorybookActivity` to handle scheduling posts using `PostScheduler`.
