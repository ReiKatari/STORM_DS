package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import me.magnum.melonds.R;
import na.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class h extends ConstraintLayout {

    /* renamed from: n0  reason: collision with root package name */
    public final g f3174n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f3175o0;
    public final na.j p0;

    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.material.timepicker.g] */
    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        na.j jVar = new na.j();
        this.p0 = jVar;
        na.k kVar = new na.k(0.5f);
        m f8 = jVar.B.f10144a.f();
        f8.f10190e = kVar;
        f8.f10191f = kVar;
        f8.f10192g = kVar;
        f8.f10193h = kVar;
        jVar.setShapeAppearanceModel(f8.a());
        this.p0.n(ColorStateList.valueOf(-1));
        setBackground(this.p0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t9.a.f13171w, R.attr.materialClockStyle, 0);
        this.f3175o0 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f3174n0 = new Runnable() { // from class: com.google.android.material.timepicker.g
            @Override // java.lang.Runnable
            public final void run() {
                h.this.o();
            }
        };
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            g gVar = this.f3174n0;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
        }
    }

    public abstract void o();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        o();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            g gVar = this.f3174n0;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i2) {
        this.p0.n(ColorStateList.valueOf(i2));
    }
}
