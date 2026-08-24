package com.google.android.material.datepicker;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class a implements android.widget.AdapterView.OnItemClickListener {
    public final /* synthetic */ com.google.android.material.datepicker.MaterialCalendarGridView A;
    public final /* synthetic */ com.google.android.material.datepicker.c B;

    public a(com.google.android.material.datepicker.c r1, com.google.android.material.datepicker.MaterialCalendarGridView r2) {
            r0 = this;
            r0.<init>()
            r0.B = r1
            r0.A = r2
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            com.google.android.material.datepicker.MaterialCalendarGridView r1 = r0.A
            j74 r2 = r1.a()
            int r4 = r2.a()
            if (r3 < r4) goto L33
            int r2 = r2.c()
            if (r3 > r2) goto L33
            com.google.android.material.datepicker.c r0 = r0.B
            s63 r0 = r0.e
            j74 r1 = r1.a()
            java.lang.Long r1 = r1.b(r3)
            long r1 = r1.longValue()
            java.lang.Object r0 = r0.B
            f24 r0 = (defpackage.f24) r0
            fb0 r0 = r0.L
            dc1 r0 = r0.L
            long r3 = r0.A
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L31
            return
        L31:
            r0 = 0
            throw r0
        L33:
            return
    }
}
