import android.app.DownloadManager
import android.content.Context
import android.net.Uri
import android.os.Environment
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.uts_lab6pemmob.R

class MainActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val downloadButton = findViewById<Button>(R.id.downloadButton)
        downloadButton.setOnClickListener {
            downloadFile("https://example.com/yourfile.jpg", "yourfile.jpg")
        }
    }

    private fun downloadFile(url: String, fileName: String) {
        val request = DownloadManager.Request(Uri.parse(url))
            .setTitle("Downloading...")
            .setDescription("Please wait")
            .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
            .setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, fileName)
            .setAllowedOverMetered(true)
            .setAllowedOverRoaming(true)

        val downloadManager = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
        downloadManager.enqueue(request)
    }
}
