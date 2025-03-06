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
