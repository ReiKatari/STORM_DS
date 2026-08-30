package com.smp.masterswitchpreference;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.i0;
import me.magnum.melonds.R;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class MasterSwitchSwitchPreference extends SwitchPreferenceCompat {

    /* renamed from: c0  reason: collision with root package name */
    public MasterSwitchPreferenceAttrs f3176c0;

    /* renamed from: d0  reason: collision with root package name */
    public View f3177d0;

    /* renamed from: e0  reason: collision with root package name */
    public SwitchCompat f3178e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f3179f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterSwitchSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public final MasterSwitchPreferenceAttrs h() {
        MasterSwitchPreferenceAttrs masterSwitchPreferenceAttrs = this.f3176c0;
        if (masterSwitchPreferenceAttrs != null) {
            return masterSwitchPreferenceAttrs;
        }
        k.f("attrs");
        throw null;
    }

    @Override // androidx.preference.SwitchPreferenceCompat, androidx.preference.Preference
    public final void onBindViewHolder(i0 i0Var) {
        i0Var.getClass();
        super.onBindViewHolder(i0Var);
        View view = i0Var.f7594a;
        view.getClass();
        this.f3177d0 = view;
        View findViewById = view.findViewById(R.id.switchWidget);
        findViewById.getClass();
        this.f3178e0 = (SwitchCompat) findViewById;
        View findViewById2 = view.findViewById(16908310);
        findViewById2.getClass();
        this.f3179f0 = (TextView) findViewById2;
        SwitchCompat switchCompat = this.f3178e0;
        if (switchCompat != null) {
            Drawable thumbDrawable = switchCompat.getThumbDrawable();
            if (thumbDrawable != null) {
                thumbDrawable.setTint(h().getSwitchThumbColor());
            }
            SwitchCompat switchCompat2 = this.f3178e0;
            if (switchCompat2 != null) {
                Drawable trackDrawable = switchCompat2.getTrackDrawable();
                if (trackDrawable != null) {
                    trackDrawable.setTint(h().getSwitchTrackColor());
                }
                SwitchCompat switchCompat3 = this.f3178e0;
                if (switchCompat3 != null) {
                    boolean isChecked = switchCompat3.isChecked();
                    View view2 = this.f3177d0;
                    if (isChecked) {
                        if (view2 != null) {
                            view2.setBackgroundColor(h().getSwitchOnBackgroundColor());
                        } else {
                            k.f("background");
                            throw null;
                        }
                    } else if (view2 != null) {
                        view2.setBackgroundColor(h().getSwitchOffBackgroundColor());
                    } else {
                        k.f("background");
                        throw null;
                    }
                    TextView textView = this.f3179f0;
                    if (textView != null) {
                        textView.setTextColor(h().getSwitchTextColor());
                        return;
                    } else {
                        k.f("text");
                        throw null;
                    }
                }
                k.f("switch");
                throw null;
            }
            k.f("switch");
            throw null;
        }
        k.f("switch");
        throw null;
    }
}
