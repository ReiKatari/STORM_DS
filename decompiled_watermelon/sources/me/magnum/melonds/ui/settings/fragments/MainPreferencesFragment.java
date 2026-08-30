package me.magnum.melonds.ui.settings.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class MainPreferencesFragment extends Hilt_MainPreferencesFragment implements os4 {
    @Override // defpackage.os4
    public final String getTitle() {
        String string = getString(R.string.settings);
        string.getClass();
        return string;
    }

    @Override // defpackage.is4
    public final void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.pref_main, str);
    }

    @Override // me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment, defpackage.is4
    public final RecyclerView onCreateRecyclerView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView onCreateRecyclerView = super.onCreateRecyclerView(layoutInflater, viewGroup, bundle);
        if (getResources().getConfiguration().screenWidthDp >= 600) {
            requireContext();
            onCreateRecyclerView.setLayoutManager(new GridLayoutManager());
        }
        return onCreateRecyclerView;
    }
}
