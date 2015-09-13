package net.cloud95.android.lession.fragment04;

import java.util.List;

import android.preference.PreferenceActivity;

// 繼承自PreferenceActivity類別
public class PrefActivity extends PreferenceActivity {

    // 載入Preference Header
    @Override
    public void onBuildHeaders(List<Header> target) {
        super.onBuildHeaders(target);
        // 載入指定的Preference Header資源
    }
    
}
