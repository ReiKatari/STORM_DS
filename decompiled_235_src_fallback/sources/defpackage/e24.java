package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e24  reason: default package */
/* loaded from: classes.dex */
public final class e24 extends defpackage.jg5 {
    public final /* synthetic */ com.google.android.material.datepicker.c a;
    public final /* synthetic */ defpackage.f24 b;

    public e24(defpackage.f24 r1, com.google.android.material.datepicker.c r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.a = r2
            return
    }

    @Override // defpackage.jg5
    public final void b(androidx.recyclerview.widget.RecyclerView r5, int r6, int r7) {
            r4 = this;
            com.google.android.material.datepicker.c r5 = r4.a
            fb0 r5 = r5.d
            f24 r4 = r4.b
            androidx.recyclerview.widget.RecyclerView r7 = r4.d0
            if (r6 >= 0) goto L22
            gg5 r6 = r7.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r6 = (androidx.recyclerview.widget.LinearLayoutManager) r6
            r7 = 0
            int r0 = r6.v()
            android.view.View r6 = r6.P0(r7, r7, r0)
            if (r6 != 0) goto L1d
            r6 = -1
            goto L2c
        L1d:
            int r6 = defpackage.gg5.G(r6)
            goto L2c
        L22:
            gg5 r6 = r7.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r6 = (androidx.recyclerview.widget.LinearLayoutManager) r6
            int r6 = r6.N0()
        L2c:
            i74 r7 = r5.A
            java.util.Calendar r7 = r7.A
            java.util.Calendar r7 = defpackage.uj7.a(r7)
            r0 = 2
            r7.add(r0, r6)
            i74 r1 = new i74
            r1.<init>(r7)
            r4.R = r1
            com.google.android.material.button.MaterialButton r7 = r4.i0
            i74 r2 = r5.A
            java.util.Calendar r2 = r2.A
            java.util.Calendar r2 = defpackage.uj7.a(r2)
            r2.add(r0, r6)
            r6 = 5
            r3 = 1
            r2.set(r6, r3)
            java.util.Calendar r2 = defpackage.uj7.a(r2)
            r2.get(r0)
            r2.get(r3)
            r0 = 7
            r2.getMaximum(r0)
            r2.getActualMaximum(r6)
            r2.getTimeInMillis()
            long r2 = r2.getTimeInMillis()
            java.util.Locale r6 = java.util.Locale.getDefault()
            java.util.concurrent.atomic.AtomicReference r0 = defpackage.uj7.a
            java.lang.String r0 = "yMMMM"
            android.icu.text.DateFormat r6 = android.icu.text.DateFormat.getInstanceForSkeleton(r0, r6)
            java.lang.String r0 = "UTC"
            android.icu.util.TimeZone r0 = android.icu.util.TimeZone.getTimeZone(r0)
            r6.setTimeZone(r0)
            android.icu.text.DisplayContext r0 = android.icu.text.DisplayContext.CAPITALIZATION_FOR_STANDALONE
            r6.setContext(r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>(r2)
            java.lang.String r6 = r6.format(r0)
            r7.setText(r6)
            i74 r5 = r5.A
            int r5 = r5.d(r1)
            r4.j(r5)
            return
    }
}
