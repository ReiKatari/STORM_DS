package com.smp.masterswitchpreference;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.a0;
import androidx.recyclerview.widget.RecyclerView;
import com.smp.masterswitchpreference.MasterSwitchPreferenceFragment;
import com.smp.masterswitchpreference.MasterSwitchSwitchPreference;
import j.a;
import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.R;
import nc.k;
import p7.o;
import yb.f;
import yb.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@a
/* loaded from: classes.dex */
public class MasterSwitchPreferenceFragment extends a0 {
    public static final Companion Companion = new Companion(null);
    private final f attrs$delegate = new n(new a2.n(12, this));

    public static final MasterSwitchPreferenceAttrs attrs_delegate$lambda$0(MasterSwitchPreferenceFragment masterSwitchPreferenceFragment) {
        Object k10 = o.k(masterSwitchPreferenceFragment.requireArguments(), "MasterSwitchAttrs", MasterSwitchPreferenceAttrs.class);
        k10.getClass();
        return (MasterSwitchPreferenceAttrs) k10;
    }

    public static /* synthetic */ MasterSwitchPreferenceAttrs h(MasterSwitchPreferenceFragment masterSwitchPreferenceFragment) {
        return attrs_delegate$lambda$0(masterSwitchPreferenceFragment);
    }

    private final void setupExplanationText(Preference preference) {
        Integer explanationIcon = getAttrs().getExplanationIcon();
        if (explanationIcon != null) {
            preference.setIcon(explanationIcon.intValue());
        }
    }

    private final void setupMasterSwitch(final MasterSwitchSwitchPreference masterSwitchSwitchPreference, final Preference preference, final List<? extends Preference> list) {
        MasterSwitchPreferenceAttrs attrs = getAttrs();
        masterSwitchSwitchPreference.getClass();
        attrs.getClass();
        masterSwitchSwitchPreference.f3176c0 = attrs;
        masterSwitchSwitchPreference.setKey(masterSwitchSwitchPreference.h().getKey());
        masterSwitchSwitchPreference.setDefaultValue(Boolean.valueOf(masterSwitchSwitchPreference.h().getDefaultValue()));
        masterSwitchSwitchPreference.setTitle(setupMasterSwitch$titleValue(this, masterSwitchSwitchPreference.A));
        setupMasterSwitch$handleExplanationText(this, preference, list, masterSwitchSwitchPreference.A);
        masterSwitchSwitchPreference.setOnPreferenceChangeListener(new androidx.preference.o() { // from class: db.a
            @Override // androidx.preference.o
            public final boolean a(Preference preference2, Object obj) {
                boolean z10;
                z10 = MasterSwitchPreferenceFragment.setupMasterSwitch$lambda$1$1(MasterSwitchSwitchPreference.this, this, preference, list, preference2, obj);
                return z10;
            }
        });
    }

    private static final void setupMasterSwitch$handleExplanationText(MasterSwitchPreferenceFragment masterSwitchPreferenceFragment, Preference preference, List<? extends Preference> list, boolean z10) {
        String switchOffExplanationText;
        if (masterSwitchPreferenceFragment.getAttrs().getHideExplanation()) {
            preference.setVisible(!z10);
        }
        if (z10) {
            switchOffExplanationText = masterSwitchPreferenceFragment.getAttrs().getSwitchOnExplanationText();
        } else {
            switchOffExplanationText = masterSwitchPreferenceFragment.getAttrs().getSwitchOffExplanationText();
        }
        preference.setSummary(switchOffExplanationText);
        for (Preference preference2 : list) {
            preference2.setVisible(z10);
        }
    }

    public static final boolean setupMasterSwitch$lambda$1$1(MasterSwitchSwitchPreference masterSwitchSwitchPreference, MasterSwitchPreferenceFragment masterSwitchPreferenceFragment, Preference preference, List list, Preference preference2, Object obj) {
        preference2.getClass();
        obj.getClass();
        Boolean bool = (Boolean) obj;
        masterSwitchSwitchPreference.setTitle(setupMasterSwitch$titleValue(masterSwitchPreferenceFragment, bool.booleanValue()));
        setupMasterSwitch$handleExplanationText(masterSwitchPreferenceFragment, preference, list, bool.booleanValue());
        setupMasterSwitch$lambda$1$setBackgroundColor(masterSwitchSwitchPreference, bool.booleanValue());
        return true;
    }

    private static final void setupMasterSwitch$lambda$1$setBackgroundColor(MasterSwitchSwitchPreference masterSwitchSwitchPreference, boolean z10) {
        if (z10) {
            View view = masterSwitchSwitchPreference.f3177d0;
            if (view != null) {
                view.setBackgroundColor(masterSwitchSwitchPreference.h().getSwitchOnBackgroundColor());
                return;
            } else {
                k.f("background");
                throw null;
            }
        }
        View view2 = masterSwitchSwitchPreference.f3177d0;
        if (view2 != null) {
            view2.setBackgroundColor(masterSwitchSwitchPreference.h().getSwitchOffBackgroundColor());
        } else {
            k.f("background");
            throw null;
        }
    }

    private static final String setupMasterSwitch$titleValue(MasterSwitchPreferenceFragment masterSwitchPreferenceFragment, boolean z10) {
        if (z10) {
            return masterSwitchPreferenceFragment.getAttrs().getSwitchOnText();
        }
        return masterSwitchPreferenceFragment.getAttrs().getSwitchOffText();
    }

    public final MasterSwitchPreferenceAttrs getAttrs() {
        return (MasterSwitchPreferenceAttrs) this.attrs$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.preference.SwitchPreferenceCompat, androidx.preference.Preference, com.smp.masterswitchpreference.MasterSwitchSwitchPreference] */
    @Override // androidx.preference.a0
    public void onCreatePreferences(Bundle bundle, String str) {
        addPreferencesFromResource(R.xml.blank_preference_screen);
        Context requireContext = requireContext();
        requireContext.getClass();
        ?? switchPreferenceCompat = new SwitchPreferenceCompat(requireContext, null);
        switchPreferenceCompat.setKey(getAttrs().getKey());
        switchPreferenceCompat.setDefaultValue(Boolean.valueOf(getAttrs().getDefaultValue()));
        getPreferenceScreen().e(switchPreferenceCompat);
        addPreferencesFromResource(R.xml.explanation_preference_screen);
        Preference findPreference = findPreference("com_smp_explanation_key");
        findPreference.getClass();
        Integer includedPrefScreen = getAttrs().getIncludedPrefScreen();
        if (includedPrefScreen != null) {
            addPreferencesFromResource(includedPrefScreen.intValue());
        }
        ArrayList arrayList = new ArrayList();
        int size = getPreferenceScreen().B.size();
        for (int i2 = 2; i2 < size; i2++) {
            Preference g10 = getPreferenceScreen().g(i2);
            g10.getClass();
            arrayList.add(g10);
        }
        Integer excludedPrefScreen = getAttrs().getExcludedPrefScreen();
        if (excludedPrefScreen != null) {
            addPreferencesFromResource(excludedPrefScreen.intValue());
        }
        setupMasterSwitch(switchPreferenceCompat, findPreference, arrayList);
        setupExplanationText(findPreference);
    }

    @Override // androidx.preference.a0
    public RecyclerView onCreateRecyclerView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        viewGroup.getClass();
        RecyclerView onCreateRecyclerView = super.onCreateRecyclerView(layoutInflater, viewGroup, bundle);
        onCreateRecyclerView.setItemAnimator(null);
        onCreateRecyclerView.setLayoutAnimation(null);
        return onCreateRecyclerView;
    }

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    @a
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(nc.f fVar) {
            this();
        }

        public final MasterSwitchPreferenceFragment newInstance(MasterSwitchPreferenceAttrs masterSwitchPreferenceAttrs) {
            masterSwitchPreferenceAttrs.getClass();
            MasterSwitchPreferenceFragment masterSwitchPreferenceFragment = new MasterSwitchPreferenceFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("MasterSwitchAttrs", masterSwitchPreferenceAttrs);
            masterSwitchPreferenceFragment.setArguments(bundle);
            return masterSwitchPreferenceFragment;
        }

        private Companion() {
        }
    }
}
