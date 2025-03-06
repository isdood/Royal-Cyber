import Foundation

class Post {
    var imageUrl: String
    var caption: String

    init(imageUrl: String, caption: String) {
        self.imageUrl = imageUrl
        self.caption = caption
    }

    func getImageUrl() -> String {
        return imageUrl
    }

    func setImageUrl(imageUrl: String) {
        self.imageUrl = imageUrl
    }

    func getCaption() -> String {
        return caption
    }

    func setCaption(caption: String) {
        self.caption = caption
    }
}
