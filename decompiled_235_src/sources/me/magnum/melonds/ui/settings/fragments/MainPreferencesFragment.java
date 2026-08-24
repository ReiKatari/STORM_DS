package me.magnum.melonds.ui.settings.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class MainPreferencesFragment extends Hilt_MainPreferencesFragment implements q15 {
    @Override // defpackage.q15
    public final String getTitle() {
        String string = getString(R.string.settings);
        string.getClass();
        return string;
    }

    @Override // defpackage.k15
    public final void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.pref_main, str);
    }

    @Override // me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment, defpackage.k15
    public final RecyclerView onCreateRecyclerView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView onCreateRecyclerView = super.onCreateRecyclerView(layoutInflater, viewGroup, bundle);
        if (getResources().getConfiguration().screenWidthDp >= 600) {
            requireContext();
            onCreateRecyclerView.setLayoutManager(new GridLayoutManager());
        }
        return onCreateRecyclerView;
    }
}
