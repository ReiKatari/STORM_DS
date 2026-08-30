package com.smp.masterswitchpreference;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.preference.Preference;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class MasterSwitchExplanationText extends Preference {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterSwitchExplanationText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(vs4 vs4Var) {
        vs4Var.getClass();
        super.onBindViewHolder(vs4Var);
        View view = vs4Var.a;
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
