package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final x8.e f3032a;

    /* renamed from: b  reason: collision with root package name */
    public final x8.e f3033b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(k0.d.K(context, R.attr.materialCalendarStyle, m.class.getCanonicalName()).data, t9.a.m);
        x8.e.h(context, obtainStyledAttributes.getResourceId(4, 0));
        x8.e.h(context, obtainStyledAttributes.getResourceId(2, 0));
        x8.e.h(context, obtainStyledAttributes.getResourceId(3, 0));
        x8.e.h(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList m = k7.w.m(context, obtainStyledAttributes, 7);
        this.f3032a = x8.e.h(context, obtainStyledAttributes.getResourceId(9, 0));
        x8.e.h(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f3033b = x8.e.h(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(m.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
