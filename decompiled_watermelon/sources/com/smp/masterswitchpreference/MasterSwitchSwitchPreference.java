package com.smp.masterswitchpreference;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.preference.SwitchPreferenceCompat;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class MasterSwitchSwitchPreference extends SwitchPreferenceCompat {
    public MasterSwitchPreferenceAttrs d0;
    public View e0;
    public SwitchCompat f0;
    public TextView g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterSwitchSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public final MasterSwitchPreferenceAttrs h() {
        MasterSwitchPreferenceAttrs masterSwitchPreferenceAttrs = this.d0;
        if (masterSwitchPreferenceAttrs != null) {
            return masterSwitchPreferenceAttrs;
        }
        b53.g0("attrs");
        throw null;
    }

    @Override // androidx.preference.SwitchPreferenceCompat, androidx.preference.Preference
    public final void onBindViewHolder(vs4 vs4Var) {
        vs4Var.getClass();
        super.onBindViewHolder(vs4Var);
        View view = vs4Var.a;
        view.getClass();
        this.e0 = view;
        View findViewById = view.findViewById(R.id.switchWidget);
        findViewById.getClass();
        this.f0 = (SwitchCompat) findViewById;
        View findViewById2 = view.findViewById(16908310);
        findViewById2.getClass();
        this.g0 = (TextView) findViewById2;
        SwitchCompat switchCompat = this.f0;
        if (switchCompat != null) {
            Drawable thumbDrawable = switchCompat.getThumbDrawable();
            if (thumbDrawable != null) {
                thumbDrawable.setTint(h().getSwitchThumbColor());
            }
            SwitchCompat switchCompat2 = this.f0;
            if (switchCompat2 != null) {
                Drawable trackDrawable = switchCompat2.getTrackDrawable();
                if (trackDrawable != null) {
                    trackDrawable.setTint(h().getSwitchTrackColor());
                }
                SwitchCompat switchCompat3 = this.f0;
                if (switchCompat3 != null) {
                    boolean isChecked = switchCompat3.isChecked();
                    View view2 = this.e0;
                    if (isChecked) {
                        if (view2 != null) {
                            view2.setBackgroundColor(h().getSwitchOnBackgroundColor());
                        } else {
                            b53.g0("background");
                            throw null;
                        }
                    } else if (view2 != null) {
                        view2.setBackgroundColor(h().getSwitchOffBackgroundColor());
                    } else {
                        b53.g0("background");
                        throw null;
                    }
                    TextView textView = this.g0;
                    if (textView != null) {
                        textView.setTextColor(h().getSwitchTextColor());
                        return;
                    } else {
                        b53.g0("text");
                        throw null;
                    }
                }
                b53.g0("switch");
                throw null;
            }
            b53.g0("switch");
            throw null;
        }
        b53.g0("switch");
        throw null;
    }
}
