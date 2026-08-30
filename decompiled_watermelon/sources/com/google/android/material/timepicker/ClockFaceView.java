package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
class ClockFaceView extends y35 implements lp0 {
    public final int A0;
    public final int B0;
    public final int C0;
    public final String[] D0;
    public float E0;
    public final ColorStateList F0;
    public final ClockHandView r0;
    public final Rect s0;
    public final RectF t0;
    public final Rect u0;
    public final SparseArray v0;
    public final c w0;
    public final int[] x0;
    public final float[] y0;
    public final int z0;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s0 = new Rect();
        this.t0 = new RectF();
        this.u0 = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.v0 = sparseArray;
        this.y0 = new float[]{RecyclerView.A1, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ay4.d, R.attr.materialClockStyle, 2132018444);
        Resources resources = getResources();
        ColorStateList C = nk2.C(context, obtainStyledAttributes, 1);
        this.F0 = C;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.r0 = clockHandView;
        this.z0 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = C.getColorForState(new int[]{16842913}, C.getDefaultColor());
        this.x0 = new int[]{colorForState, colorForState, C.getDefaultColor()};
        clockHandView.L.add(this);
        int defaultColor = jv3.x(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList C2 = nk2.C(context, obtainStyledAttributes, 0);
        setBackgroundColor(C2 != null ? C2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(false);
        obtainStyledAttributes.recycle();
        this.w0 = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.D0 = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i = 0; i < Math.max(this.D0.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.D0.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.D0[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i2));
                z = i2 > 1 ? true : z;
                aa7.n(textView, this.w0);
                textView.setTextColor(this.F0);
            }
        }
        ClockHandView clockHandView2 = this.r0;
        if (clockHandView2.B && !z) {
            clockHandView2.k0 = 1;
        }
        clockHandView2.B = z;
        clockHandView2.invalidate();
        this.A0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.B0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.C0 = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // defpackage.y35
    public final void o() {
        uy0 uy0Var = new uy0();
        uy0Var.e(this);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!hashMap.containsKey(i2)) {
                    hashMap.put(i2, new ArrayList());
                }
                ((List) hashMap.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List<View> list = (List) entry.getValue();
            int intValue = ((Integer) entry.getKey()).intValue();
            int i3 = this.p0;
            if (intValue == 2) {
                i3 = Math.round(i3 * 0.66f);
            }
            float f = RecyclerView.A1;
            for (View view : list) {
                qy0 qy0Var = uy0Var.h(view.getId()).e;
                qy0Var.A = R.id.circle_center;
                qy0Var.B = i3;
                qy0Var.C = f;
                f += 360.0f / list.size();
            }
        }
        uy0Var.b(this);
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.v0;
            if (i4 < sparseArray.size()) {
                ((TextView) sparseArray.get(i4)).setVisibility(0);
                i4++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.D0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        p();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.C0 / Math.max(Math.max(this.A0 / displayMetrics.heightPixels, this.B0 / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public final void p() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        boolean z;
        Rect rect2;
        RadialGradient radialGradient;
        RectF rectF2 = this.r0.e0;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.v0;
            int size = sparseArray.size();
            rect = this.s0;
            rectF = this.t0;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f) {
                    textView = textView2;
                    f = height;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                if (textView3 == textView) {
                    z = true;
                } else {
                    z = false;
                }
                textView3.setSelected(z);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.u0);
                rectF.inset(rect2.left, rect2.top);
                if (!RectF.intersects(rectF2, rectF)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.x0, this.y0, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }
}
