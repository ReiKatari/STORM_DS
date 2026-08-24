package com.google.android.material.datepicker;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class c extends defpackage.wf5 {
    public final defpackage.fb0 d;
    public final defpackage.s63 e;
    public final int f;

    public c(android.view.ContextThemeWrapper r5, defpackage.fb0 r6, defpackage.s63 r7) {
            r4 = this;
            r4.<init>()
            i74 r0 = r6.A
            i74 r1 = r6.B
            i74 r2 = r6.R
            java.util.Calendar r0 = r0.A
            java.util.Calendar r3 = r2.A
            int r0 = r0.compareTo(r3)
            r3 = 0
            if (r0 > 0) goto L51
            java.util.Calendar r0 = r2.A
            java.util.Calendar r1 = r1.A
            int r0 = r0.compareTo(r1)
            if (r0 > 0) goto L4b
            int r0 = defpackage.j74.R
            android.content.res.Resources r1 = r5.getResources()
            r2 = 2131166045(0x7f07035d, float:1.7946324E38)
            int r1 = r1.getDimensionPixelSize(r2)
            int r1 = r1 * r0
            r0 = 16843277(0x101020d, float:2.369503E-38)
            boolean r0 = defpackage.k24.k(r5, r0)
            if (r0 == 0) goto L3e
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getDimensionPixelSize(r2)
            goto L3f
        L3e:
            r5 = 0
        L3f:
            int r1 = r1 + r5
            r4.f = r1
            r4.d = r6
            r4.e = r7
            r5 = 1
            r4.g(r5)
            return
        L4b:
            java.lang.String r4 = "currentPage cannot be after lastPage"
            defpackage.i.h(r4)
            throw r3
        L51:
            java.lang.String r4 = "firstPage cannot be after currentPage"
            defpackage.i.h(r4)
            throw r3
    }

    @Override // defpackage.wf5
    public final int a() {
            r0 = this;
            fb0 r0 = r0.d
            int r0 = r0.Z
            return r0
    }

    @Override // defpackage.wf5
    public final long b(int r3) {
            r2 = this;
            fb0 r2 = r2.d
            i74 r2 = r2.A
            java.util.Calendar r2 = r2.A
            java.util.Calendar r2 = defpackage.uj7.a(r2)
            r0 = 2
            r2.add(r0, r3)
            r3 = 5
            r1 = 1
            r2.set(r3, r1)
            java.util.Calendar r2 = defpackage.uj7.a(r2)
            r2.get(r0)
            r2.get(r1)
            r0 = 7
            r2.getMaximum(r0)
            r2.getActualMaximum(r3)
            r2.getTimeInMillis()
            long r2 = r2.getTimeInMillis()
            return r2
    }

    @Override // defpackage.wf5
    public final void e(defpackage.wg5 r3, int r4) {
            r2 = this;
            com.google.android.material.datepicker.b r3 = (com.google.android.material.datepicker.b) r3
            fb0 r2 = r2.d
            i74 r0 = r2.A
            java.util.Calendar r0 = r0.A
            java.util.Calendar r0 = defpackage.uj7.a(r0)
            r1 = 2
            r0.add(r1, r4)
            i74 r4 = new i74
            r4.<init>(r0)
            android.widget.TextView r0 = r3.u
            java.lang.String r1 = r4.c()
            r0.setText(r1)
            com.google.android.material.datepicker.MaterialCalendarGridView r3 = r3.v
            r0 = 2131427720(0x7f0b0188, float:1.8477064E38)
            android.view.View r3 = r3.findViewById(r0)
            com.google.android.material.datepicker.MaterialCalendarGridView r3 = (com.google.android.material.datepicker.MaterialCalendarGridView) r3
            j74 r0 = r3.a()
            r1 = 0
            if (r0 == 0) goto L47
            j74 r0 = r3.a()
            i74 r0 = r0.A
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L47
            r3.invalidate()
            j74 r2 = r3.a()
            r2.getClass()
            throw r1
        L47:
            j74 r3 = new j74
            r3.<init>(r4, r2)
            throw r1
    }

    @Override // defpackage.wf5
    public final defpackage.wg5 f(android.view.ViewGroup r3, int r4) {
            r2 = this;
            android.content.Context r4 = r3.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0 = 2131624044(0x7f0e006c, float:1.8875257E38)
            r1 = 0
            android.view.View r4 = r4.inflate(r0, r3, r1)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            android.content.Context r3 = r3.getContext()
            r0 = 16843277(0x101020d, float:2.369503E-38)
            boolean r3 = defpackage.k24.k(r3, r0)
            if (r3 == 0) goto L31
            hg5 r3 = new hg5
            r0 = -1
            int r2 = r2.f
            r3.<init>(r0, r2)
            r4.setLayoutParams(r3)
            com.google.android.material.datepicker.b r2 = new com.google.android.material.datepicker.b
            r3 = 1
            r2.<init>(r4, r3)
            return r2
        L31:
            com.google.android.material.datepicker.b r2 = new com.google.android.material.datepicker.b
            r2.<init>(r4, r1)
            return r2
    }
}
