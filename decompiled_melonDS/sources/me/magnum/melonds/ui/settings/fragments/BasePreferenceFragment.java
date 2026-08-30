package me.magnum.melonds.ui.settings.fragments;

import a6.p0;
import a6.x0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.preference.a0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class BasePreferenceFragment extends a0 {
    /* JADX WARN: Type inference failed for: r2v2, types: [a6.v, java.lang.Object] */
    @Override // androidx.preference.a0
    public final RecyclerView onCreateRecyclerView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView onCreateRecyclerView = super.onCreateRecyclerView(layoutInflater, viewGroup, bundle);
        onCreateRecyclerView.setClipToPadding(false);
        ?? obj = new Object();
        WeakHashMap weakHashMap = x0.f533a;
        p0.k(onCreateRecyclerView, obj);
        return onCreateRecyclerView;
    }
}
