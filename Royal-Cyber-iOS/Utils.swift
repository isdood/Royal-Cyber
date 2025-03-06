import UIKit
import SDWebImage

class Utils {
    static func loadImage(url: String, imageView: UIImageView) {
        imageView.sd_setImage(with: URL(string: url), completed: nil)
    }
}
