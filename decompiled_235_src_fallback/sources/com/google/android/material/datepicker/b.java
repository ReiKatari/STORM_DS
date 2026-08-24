package com.google.android.material.datepicker;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class b extends defpackage.wg5 {
    public final android.widget.TextView u;
    public final com.google.android.material.datepicker.MaterialCalendarGridView v;

    public b(android.widget.LinearLayout r9, boolean r10) {
            r8 = this;
            r8.<init>(r9)
            r0 = 2131427725(0x7f0b018d, float:1.8477074E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.u = r0
            java.util.WeakHashMap r1 = defpackage.ao7.a
            on7 r2 = new on7
            r5 = 0
            r7 = 3
            r3 = 2131427944(0x7f0b0268, float:1.8477519E38)
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            r6 = 28
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r2.f(r0, r1)
            r1 = 2131427720(0x7f0b0188, float:1.8477064E38)
            android.view.View r9 = r9.findViewById(r1)
            com.google.android.material.datepicker.MaterialCalendarGridView r9 = (com.google.android.material.datepicker.MaterialCalendarGridView) r9
            r8.v = r9
            if (r10 != 0) goto L35
            r8 = 8
            r0.setVisibility(r8)
        L35:
            return
    }
}
