package com.smp.masterswitchpreference;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.preference.Preference;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class MasterSwitchExplanationText extends Preference {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterSwitchExplanationText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(x15 x15Var) {
        x15Var.getClass();
        super.onBindViewHolder(x15Var);
        View view = x15Var.a;
        view.setClickable(false);
        View findViewById = view.findViewById(R.id.icon_frame);
        findViewById.getClass();
        Context context = view.getContext();
        context.getClass();
        findViewById.setPadding(findViewById.getPaddingLeft(), (int) TypedValue.applyDimension(1, 18.0f, context.getResources().getDisplayMetrics()), findViewById.getPaddingRight(), findViewById.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.getClass();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 48;
        findViewById.setLayoutParams(layoutParams2);
        ((TextView) view.findViewById(16908304)).setMaxLines(1000);
    }
}
