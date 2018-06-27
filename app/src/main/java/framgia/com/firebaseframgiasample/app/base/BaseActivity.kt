package framgia.com.firebaseframgiasample.app.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.firebase.analytics.FirebaseAnalytics

open abstract class BaseActivity : AppCompatActivity() {

    abstract fun getLayoutId(): Int
    abstract fun onViewCreate()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        onViewCreate()
    }
}