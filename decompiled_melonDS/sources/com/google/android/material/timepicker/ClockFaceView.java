package com.google.android.material.timepicker;

import a6.x0;
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
import i5.m;
import i5.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k7.w;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
class ClockFaceView extends h implements f {
    public final int A0;
    public final int B0;
    public final String[] C0;
    public float D0;
    public final ColorStateList E0;

    /* renamed from: q0  reason: collision with root package name */
    public final ClockHandView f3151q0;

    /* renamed from: r0  reason: collision with root package name */
    public final Rect f3152r0;

    /* renamed from: s0  reason: collision with root package name */
    public final RectF f3153s0;

    /* renamed from: t0  reason: collision with root package name */
    public final Rect f3154t0;

    /* renamed from: u0  reason: collision with root package name */
    public final SparseArray f3155u0;

    /* renamed from: v0  reason: collision with root package name */
    public final c f3156v0;

    /* renamed from: w0  reason: collision with root package name */
    public final int[] f3157w0;

    /* renamed from: x0  reason: collision with root package name */
    public final float[] f3158x0;

    /* renamed from: y0  reason: collision with root package name */
    public final int f3159y0;

    /* renamed from: z0  reason: collision with root package name */
    public final int f3160z0;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3152r0 = new Rect();
        this.f3153s0 = new RectF();
        this.f3154t0 = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f3155u0 = sparseArray;
        this.f3158x0 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t9.a.f13153d, R.attr.materialClockStyle, 2131952889);
        Resources resources = getResources();
        ColorStateList m = w.m(context, obtainStyledAttributes, 1);
        this.E0 = m;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f3151q0 = clockHandView;
        this.f3159y0 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = m.getColorForState(new int[]{16842913}, m.getDefaultColor());
        this.f3157w0 = new int[]{colorForState, colorForState, m.getDefaultColor()};
        clockHandView.L.add(this);
        int defaultColor = aj.g.z(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList m10 = w.m(context, obtainStyledAttributes, 0);
        setBackgroundColor(m10 != null ? m10.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(false);
        obtainStyledAttributes.recycle();
        this.f3156v0 = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.C0 = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z10 = false;
        for (int i2 = 0; i2 < Math.max(this.C0.length, size); i2++) {
            TextView textView = (TextView) sparseArray.get(i2);
            if (i2 >= this.C0.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.C0[i2]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i2));
                int i10 = (i2 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i10));
                z10 = i10 > 1 ? true : z10;
                x0.o(textView, this.f3156v0);
                textView.setTextColor(this.E0);
            }
        }
        ClockHandView clockHandView2 = this.f3151q0;
        if (clockHandView2.B && !z10) {
            clockHandView2.f3170j0 = 1;
        }
        clockHandView2.B = z10;
        clockHandView2.invalidate();
        this.f3160z0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.A0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.B0 = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.h
    public final void o() {
        q qVar = new q();
        qVar.e(this);
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i10 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i10 == null) {
                    i10 = 1;
                }
                if (!hashMap.containsKey(i10)) {
                    hashMap.put(i10, new ArrayList());
                }
                ((List) hashMap.get(i10)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List<View> list = (List) entry.getValue();
            int intValue = ((Integer) entry.getKey()).intValue();
            int i11 = this.f3175o0;
            if (intValue == 2) {
                i11 = Math.round(i11 * 0.66f);
            }
            float f8 = 0.0f;
            for (View view : list) {
                m mVar = qVar.h(view.getId()).f6906e;
                mVar.A = R.id.circle_center;
                mVar.B = i11;
                mVar.C = f8;
                f8 += 360.0f / list.size();
            }
        }
        qVar.b(this);
        int i12 = 0;
        while (true) {
            SparseArray sparseArray = this.f3155u0;
            if (i12 < sparseArray.size()) {
                ((TextView) sparseArray.get(i12)).setVisibility(0);
                i12++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.C0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i2, int i10, int i11, int i12) {
        super.onLayout(z10, i2, i10, i11, i12);
        p();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i2, int i10) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.B0 / Math.max(Math.max(this.f3160z0 / displayMetrics.heightPixels, this.A0 / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public final void p() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        boolean z10;
        Rect rect2;
        RadialGradient radialGradient;
        RectF rectF2 = this.f3151q0.f3164d0;
        float f8 = Float.MAX_VALUE;
        TextView textView = null;
        int i2 = 0;
        while (true) {
            sparseArray = this.f3155u0;
            int size = sparseArray.size();
            rect = this.f3152r0;
            rectF = this.f3153s0;
            if (i2 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i2);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f8) {
                    textView = textView2;
                    f8 = height;
                }
            }
            i2++;
        }
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            TextView textView3 = (TextView) sparseArray.get(i10);
            if (textView3 != null) {
                if (textView3 == textView) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                textView3.setSelected(z10);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f3154t0);
                rectF.inset(rect2.left, rect2.top);
                if (!RectF.intersects(rectF2, rectF)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f3157w0, this.f3158x0, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }
}
