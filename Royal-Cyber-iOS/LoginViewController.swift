import UIKit

class LoginViewController: UIViewController {
    private var themeEngine: ThemeEngine?

    override func viewDidLoad() {
        super.viewDidLoad()
        self.view.backgroundColor = .white
        themeEngine = ThemeEngine()
        themeEngine?.applyTheme()
        setupWeb3LoginButton()
    }

    private func setupWeb3LoginButton() {
        let web3LoginButton = UIButton(type: .system)
        web3LoginButton.setTitle("Web3 Login", for: .normal)
        web3LoginButton.addTarget(self, action: #selector(web3LoginButtonTapped), for: .touchUpInside)
        web3LoginButton.translatesAutoresizingMaskIntoConstraints = false
        self.view.addSubview(web3LoginButton)

        // Set constraints for the button
        NSLayoutConstraint.activate([
            web3LoginButton.centerXAnchor.constraint(equalTo: self.view.centerXAnchor),
            web3LoginButton.topAnchor.constraint(equalTo: self.view.topAnchor, constant: 200)
        ])
    }

    @objc private func web3LoginButtonTapped() {
        let web3LoginVC = Web3LoginViewController()
        self.present(web3LoginVC, animated: true, completion: nil)
    }
}
