package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: o0  reason: collision with root package name */
    public static final /* synthetic */ int f3171o0 = 0;

    /* renamed from: n0  reason: collision with root package name */
    public final Chip f3172n0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View$OnClickListener, java.lang.Object] */
    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ?? obj = new Object();
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        ((MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle)).f3001h0.add(new Object());
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f3172n0 = chip2;
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        l lVar = new l(new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener()));
        chip.setOnTouchListener(lVar);
        chip2.setOnTouchListener(lVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(obj);
        chip2.setOnClickListener(obj);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (view == this && i2 == 0) {
            this.f3172n0.sendAccessibilityEvent(8);
        }
    }
}
