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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public abstract class BasePreferenceFragment extends is4 {
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
        final ur4 onPreferenceChangeListener = twoStatePreference.getOnPreferenceChangeListener();
        twoStatePreference.setOnPreferenceChangeListener(new ur4() { // from class: t00
            @Override // defpackage.ur4
            public final boolean a(Preference preference, Object obj) {
                boolean z3;
                preference.getClass();
                boolean z4 = true;
                ur4 ur4Var = ur4.this;
                if (ur4Var != null) {
                    z3 = ur4Var.a(preference, obj);
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
        rs4 rs4Var;
        int l;
        g65 adapter = recyclerView.getAdapter();
        if (adapter instanceof rs4) {
            rs4Var = (rs4) adapter;
        } else {
            rs4Var = null;
        }
        if (rs4Var != null && (l = rs4Var.l(str)) != -1) {
            g75 I = recyclerView.I(l);
            if (I != null) {
                I.a.requestFocus();
            } else if (i < 6) {
                recyclerView.h0(l);
                recyclerView.post(new Runnable() { // from class: u00
                    @Override // java.lang.Runnable
                    public final void run() {
                        BasePreferenceFragment.this.i(recyclerView, str, i + 1);
                    }
                });
            }
        }
    }

    @Override // defpackage.is4
    public RecyclerView onCreateRecyclerView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView onCreateRecyclerView = super.onCreateRecyclerView(layoutInflater, viewGroup, bundle);
        onCreateRecyclerView.setClipToPadding(false);
        defpackage.i iVar = new defpackage.i(3);
        WeakHashMap weakHashMap = aa7.a;
        s97.c(onCreateRecyclerView, iVar);
        BasePreferenceFragment$onCreateRecyclerView$1$2 basePreferenceFragment$onCreateRecyclerView$1$2 = new BasePreferenceFragment$onCreateRecyclerView$1$2(onCreateRecyclerView, this);
        if (onCreateRecyclerView.A0 == null) {
            onCreateRecyclerView.A0 = new ArrayList();
        }
        onCreateRecyclerView.A0.add(basePreferenceFragment$onCreateRecyclerView$1$2);
        return onCreateRecyclerView;
    }

    @Override // defpackage.is4
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
        listView.post(new u(this, listView, str, 2));
    }
}
