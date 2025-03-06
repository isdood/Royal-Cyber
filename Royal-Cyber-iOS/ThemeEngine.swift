import UIKit

class ThemeEngine {
    private let themeColorKey = "themeColor"
    private let defaultThemeColor = UIColor.white
    private let maxMemoryUsage = 1024 * 1024 // 1MB
    private let userDefaults = UserDefaults.standard

    func applyTheme() {
        let themeColorHex = userDefaults.string(forKey: themeColorKey) ?? "#FFFFFF"
        let themeColor = UIColor(hex: themeColorHex)
        // Apply the theme color to the application
        // This is a placeholder implementation
        print("Applying theme color: \(themeColorHex)")
    }

    func setThemeColor(_ color: UIColor) {
        if isMemoryUsageWithinLimit() {
            let colorHex = color.toHexString()
            userDefaults.set(colorHex, forKey: themeColorKey)
        } else {
            print("Memory usage exceeds limit. Cannot set theme color.")
        }
    }

    private func isMemoryUsageWithinLimit() -> Bool {
        // Placeholder implementation for memory usage check
        // In a real implementation, you would check the actual memory usage
        return true
    }

    func hasPermissionToChangeTheme() -> Bool {
        // Placeholder implementation for permission check
        // In a real implementation, you would check the actual permissions
        return true
    }
}

extension UIColor {
    convenience init(hex: String) {
        let scanner = Scanner(string: hex)
        scanner.scanLocation = 1 // Skip the '#' character

        var rgbValue: UInt64 = 0
        scanner.scanHexInt64(&rgbValue)

        let red = CGFloat((rgbValue & 0xFF0000) >> 16) / 255.0
        let green = CGFloat((rgbValue & 0x00FF00) >> 8) / 255.0
        let blue = CGFloat(rgbValue & 0x0000FF) / 255.0

        self.init(red: red, green: green, blue: blue, alpha: 1.0)
    }

    func toHexString() -> String {
        var red: CGFloat = 0
        var green: CGFloat = 0
        var blue: CGFloat = 0
        var alpha: CGFloat = 0

        getRed(&red, green: &green, blue: &blue, alpha: &alpha)

        let rgbValue = (Int(red * 255) << 16) | (Int(green * 255) << 8) | Int(blue * 255)
        return String(format: "#%06X", rgbValue)
    }
}
