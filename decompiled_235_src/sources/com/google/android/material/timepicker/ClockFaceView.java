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
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
class ClockFaceView extends id5 implements yr0 {
    public final int A0;
    public final int B0;
    public final int C0;
    public final int D0;
    public final String[] E0;
    public float F0;
    public final ColorStateList G0;
    public final ClockHandView s0;
    public final Rect t0;
    public final RectF u0;
    public final Rect v0;
    public final SparseArray w0;
    public final c x0;
    public final int[] y0;
    public final float[] z0;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.t0 = new Rect();
        this.u0 = new RectF();
        this.v0 = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.w0 = sparseArray;
        this.z0 = new float[]{RecyclerView.B1, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a75.d, R.attr.materialClockStyle, 2132018452);
        Resources resources = getResources();
        ColorStateList S = np2.S(context, obtainStyledAttributes, 1);
        this.G0 = S;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.s0 = clockHandView;
        this.A0 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = S.getColorForState(new int[]{16842913}, S.getDefaultColor());
        this.y0 = new int[]{colorForState, colorForState, S.getDefaultColor()};
        clockHandView.L.add(this);
        int defaultColor = ge7.A(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList S2 = np2.S(context, obtainStyledAttributes, 0);
        setBackgroundColor(S2 != null ? S2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(false);
        obtainStyledAttributes.recycle();
        this.x0 = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.E0 = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i = 0; i < Math.max(this.E0.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.E0.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.E0[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i2));
                z = i2 > 1 ? true : z;
                ao7.n(textView, this.x0);
                textView.setTextColor(this.G0);
            }
        }
        ClockHandView clockHandView2 = this.s0;
        if (clockHandView2.B && !z) {
            clockHandView2.l0 = 1;
        }
        clockHandView2.B = z;
        clockHandView2.invalidate();
        this.B0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.C0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.D0 = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // defpackage.id5
    public final void o() {
        z11 z11Var = new z11();
        z11Var.e(this);
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
            int i3 = this.q0;
            if (intValue == 2) {
                i3 = Math.round(i3 * 0.66f);
            }
            float f = RecyclerView.B1;
            for (View view : list) {
                v11 v11Var = z11Var.h(view.getId()).e;
                v11Var.A = R.id.circle_center;
                v11Var.B = i3;
                v11Var.C = f;
                f += 360.0f / list.size();
            }
        }
        z11Var.b(this);
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.w0;
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
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.E0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        p();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.D0 / Math.max(Math.max(this.B0 / displayMetrics.heightPixels, this.C0 / displayMetrics.widthPixels), 1.0f));
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
        RectF rectF2 = this.s0.f0;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.w0;
            int size = sparseArray.size();
            rect = this.t0;
            rectF = this.u0;
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
                textView3.getLineBounds(0, this.v0);
                rectF.inset(rect2.left, rect2.top);
                if (!RectF.intersects(rectF2, rectF)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.y0, this.z0, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }
}
