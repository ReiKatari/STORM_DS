package me.magnum.melonds.ui.settings.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class BasePreferenceFragment extends k15 {
    public String A;

    public final void h(String str, final String[] strArr, final boolean z) {
        boolean z2;
        TwoStatePreference twoStatePreference = (TwoStatePreference) findPreference(str);
        if (twoStatePreference == null) {
            return;
        }
        if (twoStatePreference.A == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        for (String str2 : strArr) {
            Preference findPreference = findPreference(str2);
            if (findPreference != null) {
                findPreference.setVisible(z2);
            }
        }
        final x05 onPreferenceChangeListener = twoStatePreference.getOnPreferenceChangeListener();
        twoStatePreference.setOnPreferenceChangeListener(new x05() { // from class: n20
            @Override // defpackage.x05
            public final boolean a(Preference preference, Object obj) {
                boolean z3;
                preference.getClass();
                boolean z4 = true;
                x05 x05Var = x05.this;
                if (x05Var != null) {
                    z3 = x05Var.a(preference, obj);
                } else {
                    z3 = true;
                }
                if (z3 && (obj instanceof Boolean)) {
                    if (((Boolean) obj).booleanValue() != z) {
                        z4 = false;
                    }
                    for (String str3 : strArr) {
                        Preference findPreference2 = this.findPreference(str3);
                        if (findPreference2 != null) {
                            findPreference2.setVisible(z4);
                        }
                    }
                }
                return z3;
            }
        });
    }

    public final void i(final RecyclerView recyclerView, final String str, final int i) {
        t15 t15Var;
        int l;
        wf5 adapter = recyclerView.getAdapter();
        if (adapter instanceof t15) {
            t15Var = (t15) adapter;
        } else {
            t15Var = null;
        }
        if (t15Var != null && (l = t15Var.l(str)) != -1) {
            wg5 I = recyclerView.I(l);
            if (I != null) {
                I.a.requestFocus();
            } else if (i < 6) {
                recyclerView.h0(l);
                recyclerView.post(new Runnable() { // from class: o20
                    @Override // java.lang.Runnable
                    public final void run() {
                        BasePreferenceFragment.this.i(recyclerView, str, i + 1);
                    }
                });
            }
        }
    }

    @Override // defpackage.k15
    public RecyclerView onCreateRecyclerView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView onCreateRecyclerView = super.onCreateRecyclerView(layoutInflater, viewGroup, bundle);
        onCreateRecyclerView.setClipToPadding(false);
        defpackage.i iVar = new defpackage.i(4);
        WeakHashMap weakHashMap = ao7.a;
        sn7.c(onCreateRecyclerView, iVar);
        BasePreferenceFragment$onCreateRecyclerView$1$2 basePreferenceFragment$onCreateRecyclerView$1$2 = new BasePreferenceFragment$onCreateRecyclerView$1$2(onCreateRecyclerView, this);
        if (onCreateRecyclerView.B0 == null) {
            onCreateRecyclerView.B0 = new ArrayList();
        }
        onCreateRecyclerView.B0.add(basePreferenceFragment$onCreateRecyclerView$1$2);
        return onCreateRecyclerView;
    }

    @Override // defpackage.k15
    public final boolean onPreferenceTreeClick(Preference preference) {
        preference.getClass();
        this.A = preference.getKey();
        return super.onPreferenceTreeClick(preference);
    }

    @Override // androidx.fragment.app.o
    public void onResume() {
        RecyclerView listView;
        super.onResume();
        String str = this.A;
        if (str == null || (listView = getListView()) == null) {
            return;
        }
        listView.post(new v(this, listView, str, 3));
    }
}
