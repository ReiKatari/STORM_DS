package com.smp.masterswitchpreference;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.i0;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class MasterSwitchExplanationText extends Preference {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterSwitchExplanationText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(i0 i0Var) {
        i0Var.getClass();
        super.onBindViewHolder(i0Var);
        View view = i0Var.f7594a;
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
