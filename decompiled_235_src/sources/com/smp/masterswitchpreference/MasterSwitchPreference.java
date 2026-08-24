package com.smp.masterswitchpreference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import androidx.preference.Preference;
import java.io.File;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MasterSwitchPreference extends Preference {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterSwitchPreference(Context context, MasterSwitchPreferenceAttrs masterSwitchPreferenceAttrs) {
        super(context, null);
        context.getClass();
        masterSwitchPreferenceAttrs.getClass();
        getExtras().putParcelable("MasterSwitchAttrs", masterSwitchPreferenceAttrs);
    }

    private final MasterSwitchPreferenceAttrs getAttrs() {
        Object R = nc1.R(getExtras(), "MasterSwitchAttrs", MasterSwitchPreferenceAttrs.class);
        R.getClass();
        return (MasterSwitchPreferenceAttrs) R;
    }

    private final void inflateAttrs(AttributeSet attributeSet) {
        boolean defaultValue;
        String b;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, b75.a, 0, 0);
        obtainStyledAttributes.getClass();
        TypedArray obtainStyledAttributes2 = getContext().getTheme().obtainStyledAttributes(attributeSet, i75.g, 0, 0);
        obtainStyledAttributes2.getClass();
        String string = obtainStyledAttributes.getString(3);
        String string2 = obtainStyledAttributes.getString(0);
        String string3 = obtainStyledAttributes.getString(1);
        MasterSwitchPreferenceAttrs masterSwitchPreferenceAttrs = new MasterSwitchPreferenceAttrs(0, 0, 0, 0, 0, null, null, null, null, null, null, false, null, false, null, false, 65535, null);
        int color = obtainStyledAttributes.getColor(12, masterSwitchPreferenceAttrs.getSwitchThumbColor());
        int color2 = obtainStyledAttributes.getColor(13, masterSwitchPreferenceAttrs.getSwitchTrackColor());
        int color3 = obtainStyledAttributes.getColor(8, masterSwitchPreferenceAttrs.getSwitchOnBackgroundColor());
        int color4 = obtainStyledAttributes.getColor(5, masterSwitchPreferenceAttrs.getSwitchOffBackgroundColor());
        int color5 = obtainStyledAttributes.getColor(11, masterSwitchPreferenceAttrs.getSwitchTextColor());
        String string4 = obtainStyledAttributes.getString(6);
        if (string4 == null) {
            string4 = masterSwitchPreferenceAttrs.getSwitchOffExplanationText();
        }
        String str = string4;
        String string5 = obtainStyledAttributes.getString(9);
        if (string5 == null) {
            string5 = masterSwitchPreferenceAttrs.getSwitchOnExplanationText();
        }
        String str2 = string5;
        Integer inflateAttrs$lambda$0$resInt = inflateAttrs$lambda$0$resInt(this, string, "xml");
        if (inflateAttrs$lambda$0$resInt == null) {
            inflateAttrs$lambda$0$resInt = masterSwitchPreferenceAttrs.getIncludedPrefScreen();
        }
        Integer num = inflateAttrs$lambda$0$resInt;
        Integer inflateAttrs$lambda$0$resInt2 = inflateAttrs$lambda$0$resInt(this, string2, "xml");
        if (inflateAttrs$lambda$0$resInt2 == null) {
            inflateAttrs$lambda$0$resInt2 = masterSwitchPreferenceAttrs.getExcludedPrefScreen();
        }
        Integer num2 = inflateAttrs$lambda$0$resInt2;
        String string6 = obtainStyledAttributes.getString(10);
        if (string6 == null) {
            string6 = masterSwitchPreferenceAttrs.getSwitchOnText();
        }
        String str3 = string6;
        String string7 = obtainStyledAttributes.getString(7);
        if (string7 == null) {
            string7 = masterSwitchPreferenceAttrs.getSwitchOffText();
        }
        String str4 = string7;
        String key = getKey();
        if (key == null) {
            key = masterSwitchPreferenceAttrs.getKey();
        }
        String str5 = key;
        if (obtainStyledAttributes2.hasValue(18)) {
            defaultValue = obtainStyledAttributes2.getBoolean(18, false);
        } else if (obtainStyledAttributes2.hasValue(11)) {
            defaultValue = obtainStyledAttributes2.getBoolean(11, false);
        } else {
            defaultValue = masterSwitchPreferenceAttrs.getDefaultValue();
        }
        boolean z = defaultValue;
        boolean z2 = obtainStyledAttributes.getBoolean(2, masterSwitchPreferenceAttrs.getHideExplanation());
        Integer inflateAttrs$lambda$0$resInt3 = inflateAttrs$lambda$0$resInt(this, string3, "drawable");
        if (inflateAttrs$lambda$0$resInt3 == null) {
            inflateAttrs$lambda$0$resInt3 = masterSwitchPreferenceAttrs.getExplanationIcon();
        }
        MasterSwitchPreferenceAttrs masterSwitchPreferenceAttrs2 = new MasterSwitchPreferenceAttrs(color, color2, color3, color4, color5, str, str2, num, num2, str3, str4, z2, str5, z, inflateAttrs$lambda$0$resInt3, obtainStyledAttributes.getBoolean(4, masterSwitchPreferenceAttrs.getShowStatus()));
        if (obtainStyledAttributes2.hasValue(22)) {
            b = obtainStyledAttributes2.getString(22);
        } else if (obtainStyledAttributes2.hasValue(13)) {
            b = obtainStyledAttributes2.getString(13);
        } else {
            b = gh5.a(MasterSwitchPreferenceFragment.class).b();
        }
        setDefaultValue(Boolean.valueOf(masterSwitchPreferenceAttrs2.getDefaultValue()));
        setKey(masterSwitchPreferenceAttrs2.getKey());
        setFragment(b);
        getExtras().putParcelable("MasterSwitchAttrs", masterSwitchPreferenceAttrs2);
        obtainStyledAttributes.recycle();
        obtainStyledAttributes2.recycle();
    }

    private static final Integer inflateAttrs$lambda$0$resInt(MasterSwitchPreference masterSwitchPreference, String str, String str2) {
        if (str == null) {
            return null;
        }
        String name = new File(str).getName();
        name.getClass();
        int y0 = qs6.y0(name, ".", 0, 6);
        if (y0 != -1) {
            name = name.substring(0, y0);
        }
        return Integer.valueOf(masterSwitchPreference.getContext().getResources().getIdentifier(name, str2, masterSwitchPreference.getContext().getPackageName()));
    }

    private final void setupStatus() {
        String switchOffText;
        if (getAttrs().getShowStatus()) {
            if (getPersistedBoolean(getAttrs().getDefaultValue())) {
                switchOffText = getAttrs().getSwitchOnText();
            } else {
                switchOffText = getAttrs().getSwitchOffText();
            }
            setSummary(switchOffText);
        }
    }

    @Override // androidx.preference.Preference
    public void onAttached() {
        a();
        setupStatus();
    }

    @Override // androidx.preference.Preference
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(cz7.class)) {
            cz7 cz7Var = (cz7) parcelable;
            super.onRestoreInstanceState(cz7Var.getSuperState());
            getExtras().putParcelable("MasterSwitchAttrs", cz7Var.A);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // androidx.preference.Preference
    public Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        cz7 cz7Var = new cz7();
        cz7Var.A = getAttrs();
        return cz7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        inflateAttrs(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterSwitchPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        context.getClass();
        inflateAttrs(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterSwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        inflateAttrs(attributeSet);
    }
}
