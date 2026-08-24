package com.smp.masterswitchpreference;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.preference.SwitchPreferenceCompat;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class MasterSwitchSwitchPreference extends SwitchPreferenceCompat {
    public MasterSwitchPreferenceAttrs e0;
    public View f0;
    public SwitchCompat g0;
    public TextView h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterSwitchSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public final MasterSwitchPreferenceAttrs h() {
        MasterSwitchPreferenceAttrs masterSwitchPreferenceAttrs = this.e0;
        if (masterSwitchPreferenceAttrs != null) {
            return masterSwitchPreferenceAttrs;
        }
        nb3.a0("attrs");
        throw null;
    }

    @Override // androidx.preference.SwitchPreferenceCompat, androidx.preference.Preference
    public final void onBindViewHolder(x15 x15Var) {
        x15Var.getClass();
        super.onBindViewHolder(x15Var);
        View view = x15Var.a;
        view.getClass();
        this.f0 = view;
        View findViewById = view.findViewById(R.id.switchWidget);
        findViewById.getClass();
        this.g0 = (SwitchCompat) findViewById;
        View findViewById2 = view.findViewById(16908310);
        findViewById2.getClass();
        this.h0 = (TextView) findViewById2;
        SwitchCompat switchCompat = this.g0;
        if (switchCompat != null) {
            Drawable thumbDrawable = switchCompat.getThumbDrawable();
            if (thumbDrawable != null) {
                thumbDrawable.setTint(h().getSwitchThumbColor());
            }
            SwitchCompat switchCompat2 = this.g0;
            if (switchCompat2 != null) {
                Drawable trackDrawable = switchCompat2.getTrackDrawable();
                if (trackDrawable != null) {
                    trackDrawable.setTint(h().getSwitchTrackColor());
                }
                SwitchCompat switchCompat3 = this.g0;
                if (switchCompat3 != null) {
                    boolean isChecked = switchCompat3.isChecked();
                    View view2 = this.f0;
                    if (isChecked) {
                        if (view2 != null) {
                            view2.setBackgroundColor(h().getSwitchOnBackgroundColor());
                        } else {
                            nb3.a0("background");
                            throw null;
                        }
                    } else if (view2 != null) {
                        view2.setBackgroundColor(h().getSwitchOffBackgroundColor());
                    } else {
                        nb3.a0("background");
                        throw null;
                    }
                    TextView textView = this.h0;
                    if (textView != null) {
                        textView.setTextColor(h().getSwitchTextColor());
                        return;
                    } else {
                        nb3.a0("text");
                        throw null;
                    }
                }
                nb3.a0("switch");
                throw null;
            }
            nb3.a0("switch");
            throw null;
        }
        nb3.a0("switch");
        throw null;
    }
}
