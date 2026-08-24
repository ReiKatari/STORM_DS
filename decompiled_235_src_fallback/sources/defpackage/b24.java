package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b24  reason: default package */
/* loaded from: classes.dex */
public final class b24 implements android.view.View.OnClickListener {
    public final /* synthetic */ int A;
    public final java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;

    public /* synthetic */ b24(defpackage.f24 r1, com.google.android.material.datepicker.c r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.L = r1
            r0.B = r2
            r0.<init>()
            return
    }

    public b24(defpackage.l87 r4) {
            r3 = this;
            r0 = 2
            r3.A = r0
            r3.<init>()
            r3.L = r4
            a8 r0 = new a8
            androidx.appcompat.widget.Toolbar r1 = r4.a
            android.content.Context r1 = r1.getContext()
            java.lang.CharSequence r4 = r4.h
            r0.<init>()
            r2 = 4096(0x1000, float:5.74E-42)
            r0.e = r2
            r0.g = r2
            r2 = 0
            r0.l = r2
            r0.m = r2
            r2 = 0
            r0.n = r2
            r0.o = r2
            r2 = 16
            r0.p = r2
            r0.i = r1
            r0.a = r4
            r3.B = r0
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r5) {
            r4 = this;
            int r5 = r4.A
            r0 = 2
            r1 = 0
            java.lang.Object r2 = r4.B
            java.lang.Object r4 = r4.L
            switch(r5) {
                case 0: goto L4f;
                case 1: goto L1b;
                default: goto Lb;
            }
        Lb:
            l87 r4 = (defpackage.l87) r4
            android.view.Window$Callback r5 = r4.k
            if (r5 == 0) goto L1a
            boolean r4 = r4.l
            if (r4 == 0) goto L1a
            a8 r2 = (defpackage.a8) r2
            r5.onMenuItemSelected(r1, r2)
        L1a:
            return
        L1b:
            f24 r4 = (defpackage.f24) r4
            androidx.recyclerview.widget.RecyclerView r5 = r4.d0
            gg5 r5 = r5.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r5 = (androidx.recyclerview.widget.LinearLayoutManager) r5
            int r3 = r5.v()
            android.view.View r5 = r5.P0(r1, r1, r3)
            if (r5 != 0) goto L31
            r5 = -1
            goto L35
        L31:
            int r5 = defpackage.gg5.G(r5)
        L35:
            com.google.android.material.datepicker.c r2 = (com.google.android.material.datepicker.c) r2
            int r5 = r5 + 1
            fb0 r1 = r2.d
            i74 r1 = r1.A
            java.util.Calendar r1 = r1.A
            java.util.Calendar r1 = defpackage.uj7.a(r1)
            r1.add(r0, r5)
            i74 r5 = new i74
            r5.<init>(r1)
            r4.h(r5)
            return
        L4f:
            f24 r4 = (defpackage.f24) r4
            androidx.recyclerview.widget.RecyclerView r5 = r4.d0
            gg5 r5 = r5.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r5 = (androidx.recyclerview.widget.LinearLayoutManager) r5
            int r5 = r5.N0()
            com.google.android.material.datepicker.c r2 = (com.google.android.material.datepicker.c) r2
            int r5 = r5 + (-1)
            fb0 r1 = r2.d
            i74 r1 = r1.A
            java.util.Calendar r1 = r1.A
            java.util.Calendar r1 = defpackage.uj7.a(r1)
            r1.add(r0, r5)
            i74 r5 = new i74
            r5.<init>(r1)
            r4.h(r5)
            return
    }
}
