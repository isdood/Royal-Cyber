import UIKit

class MainViewController: UIViewController {
    private var themeEngine: ThemeEngine?

    override func viewDidLoad() {
        super.viewDidLoad()
        self.view.backgroundColor = .white
        themeEngine = ThemeEngine()
        themeEngine?.applyTheme()
    }
}
