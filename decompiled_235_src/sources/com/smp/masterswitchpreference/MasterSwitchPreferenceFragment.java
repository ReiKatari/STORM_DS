package com.smp.masterswitchpreference;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.smp.masterswitchpreference.MasterSwitchPreferenceFragment;
import com.smp.masterswitchpreference.MasterSwitchSwitchPreference;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MasterSwitchPreferenceFragment extends k15 {
    public static final Companion Companion = new Companion(null);
    private final go3 attrs$delegate = new ex6(new er2(this, 8));

    public static final MasterSwitchPreferenceAttrs attrs_delegate$lambda$0(MasterSwitchPreferenceFragment masterSwitchPreferenceFragment) {
        Object R = nc1.R(masterSwitchPreferenceFragment.requireArguments(), "MasterSwitchAttrs", MasterSwitchPreferenceAttrs.class);
        R.getClass();
        return (MasterSwitchPreferenceAttrs) R;
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
        masterSwitchSwitchPreference.e0 = attrs;
        masterSwitchSwitchPreference.setKey(masterSwitchSwitchPreference.h().getKey());
        masterSwitchSwitchPreference.setDefaultValue(Boolean.valueOf(masterSwitchSwitchPreference.h().getDefaultValue()));
        masterSwitchSwitchPreference.setTitle(setupMasterSwitch$titleValue(this, masterSwitchSwitchPreference.A));
        setupMasterSwitch$handleExplanationText(this, preference, list, masterSwitchSwitchPreference.A);
        masterSwitchSwitchPreference.setOnPreferenceChangeListener(new x05() { // from class: i14
            @Override // defpackage.x05
            public final boolean a(Preference preference2, Object obj) {
                boolean z;
                z = MasterSwitchPreferenceFragment.setupMasterSwitch$lambda$1$1(MasterSwitchSwitchPreference.this, this, preference, list, preference2, obj);
                return z;
            }
        });
    }

    private static final void setupMasterSwitch$handleExplanationText(MasterSwitchPreferenceFragment masterSwitchPreferenceFragment, Preference preference, List<? extends Preference> list, boolean z) {
        String switchOffExplanationText;
        if (masterSwitchPreferenceFragment.getAttrs().getHideExplanation()) {
            preference.setVisible(!z);
        }
        if (z) {
            switchOffExplanationText = masterSwitchPreferenceFragment.getAttrs().getSwitchOnExplanationText();
        } else {
            switchOffExplanationText = masterSwitchPreferenceFragment.getAttrs().getSwitchOffExplanationText();
        }
        preference.setSummary(switchOffExplanationText);
        for (Preference preference2 : list) {
            preference2.setVisible(z);
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

    private static final void setupMasterSwitch$lambda$1$setBackgroundColor(MasterSwitchSwitchPreference masterSwitchSwitchPreference, boolean z) {
        if (z) {
            View view = masterSwitchSwitchPreference.f0;
            if (view != null) {
                view.setBackgroundColor(masterSwitchSwitchPreference.h().getSwitchOnBackgroundColor());
                return;
            } else {
                nb3.a0("background");
                throw null;
            }
        }
        View view2 = masterSwitchSwitchPreference.f0;
        if (view2 != null) {
            view2.setBackgroundColor(masterSwitchSwitchPreference.h().getSwitchOffBackgroundColor());
        } else {
            nb3.a0("background");
            throw null;
        }
    }

    private static final String setupMasterSwitch$titleValue(MasterSwitchPreferenceFragment masterSwitchPreferenceFragment, boolean z) {
        if (z) {
            return masterSwitchPreferenceFragment.getAttrs().getSwitchOnText();
        }
        return masterSwitchPreferenceFragment.getAttrs().getSwitchOffText();
    }

    public final MasterSwitchPreferenceAttrs getAttrs() {
        return (MasterSwitchPreferenceAttrs) this.attrs$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.preference.SwitchPreferenceCompat, androidx.preference.Preference, com.smp.masterswitchpreference.MasterSwitchSwitchPreference] */
    @Override // defpackage.k15
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
        for (int i = 2; i < size; i++) {
            Preference g = getPreferenceScreen().g(i);
            g.getClass();
            arrayList.add(g);
        }
        Integer excludedPrefScreen = getAttrs().getExcludedPrefScreen();
        if (excludedPrefScreen != null) {
            addPreferencesFromResource(excludedPrefScreen.intValue());
        }
        setupMasterSwitch(switchPreferenceCompat, findPreference, arrayList);
        setupExplanationText(findPreference);
    }

    @Override // defpackage.k15
    public RecyclerView onCreateRecyclerView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        viewGroup.getClass();
        RecyclerView onCreateRecyclerView = super.onCreateRecyclerView(layoutInflater, viewGroup, bundle);
        onCreateRecyclerView.setItemAnimator(null);
        onCreateRecyclerView.setLayoutAnimation(null);
        return onCreateRecyclerView;
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(id1 id1Var) {
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
