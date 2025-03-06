import UIKit

class PostAdapter: NSObject, UICollectionViewDataSource {
    private var posts: [Post]

    init(posts: [Post]) {
        self.posts = posts
    }

    func collectionView(_ collectionView: UICollectionView, numberOfItemsInSection section: Int) -> Int {
        return posts.count
    }

    func collectionView(_ collectionView: UICollectionView, cellForItemAt indexPath: IndexPath) -> UICollectionViewCell {
        let cell = collectionView.dequeueReusableCell(withReuseIdentifier: "PostCell", for: indexPath) as! PostCell
        let post = posts[indexPath.item]
        cell.captionLabel.text = post.getCaption()
        // Load image using a library like SDWebImage or Kingfisher
        // cell.postImageView.sd_setImage(with: URL(string: post.getImageUrl()), completed: nil)
        return cell
    }
}

class PostCell: UICollectionViewCell {
    @IBOutlet weak var postImageView: UIImageView!
    @IBOutlet weak var captionLabel: UILabel!
}
