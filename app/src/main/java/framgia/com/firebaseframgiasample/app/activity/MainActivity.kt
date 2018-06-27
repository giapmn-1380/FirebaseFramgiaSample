package framgia.com.firebaseframgiasample.app.activity

import com.google.firebase.analytics.FirebaseAnalytics
import framgia.com.firebaseframgiasample.R
import framgia.com.firebaseframgiasample.app.base.BaseActivity

class MainActivity : BaseActivity() {

    var firebaseAnalytics: FirebaseAnalytics? = null

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun onViewCreate() {
        firebaseAnalytics = FirebaseAnalytics.getInstance(this)

    }
}
