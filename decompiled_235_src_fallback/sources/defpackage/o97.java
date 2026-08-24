package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o97  reason: default package */
/* loaded from: classes.dex */
public final class o97 extends defpackage.zg1 implements defpackage.yy4, defpackage.fy0 {
    public defpackage.ag1 m0;
    public defpackage.h37 n0;
    public boolean o0;
    public final defpackage.ro5 p0;
    public final defpackage.v80 q0;
    public defpackage.os0 r0;
    public final defpackage.ow6 s0;
    public defpackage.yy4 t0;

    public o97(defpackage.ag1 r2, defpackage.h37 r3) {
            r1 = this;
            r1.<init>()
            r1.m0 = r2
            r1.n0 = r3
            r2 = 1
            r1.o0 = r2
            ro5 r2 = new ro5
            r3 = 23
            r2.<init>(r1, r3)
            r1.p0 = r2
            r2 = 6
            r3 = 2147483647(0x7fffffff, float:NaN)
            r0 = 0
            v80 r2 = defpackage.nb3.c(r3, r0, r0, r2)
            r1.q0 = r2
            rg r2 = new rg
            r3 = 8
            r2.<init>(r1, r3)
            oy4 r3 = defpackage.jw6.a
            ow6 r3 = new ow6
            r3.<init>(r0, r0, r0, r2)
            r1.R0(r3)
            r1.s0 = r3
            return
    }

    @Override // defpackage.yy4
    public final void I() {
            r1 = this;
            ow6 r0 = r1.s0
            r0.I()
            yy4 r1 = r1.t0
            if (r1 == 0) goto Lc
            r1.I()
        Lc:
            return
    }

    @Override // defpackage.z64
    public final void J0() {
            r3 = this;
            os0 r0 = new os0
            android.view.View r1 = defpackage.jw2.z(r3)
            android.content.Context r1 = r1.getContext()
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            r2 = 8
            r0.<init>(r1, r2)
            r3.r0 = r0
            return
    }

    @Override // defpackage.yy4
    public final void w(defpackage.oy4 r7, defpackage.py4 r8, long r9) {
            r6 = this;
            os0 r0 = r6.r0
            boolean r1 = r6.o0
            if (r1 == 0) goto L37
            java.util.List r1 = r7.a
            int r2 = r1.size()
            r3 = 0
        Ld:
            if (r3 >= r2) goto L37
            java.lang.Object r4 = r1.get(r3)
            vy4 r4 = (defpackage.vy4) r4
            int r4 = r4.i
            r5 = 2
            if (r4 != r5) goto L34
            if (r0 == 0) goto L37
            yy4 r1 = r6.t0
            if (r1 != 0) goto L37
            a61 r1 = new a61
            r2 = 1
            r1.<init>(r2, r6, r0)
            oy4 r0 = defpackage.jw6.a
            ow6 r0 = new ow6
            r2 = 0
            r0.<init>(r2, r2, r2, r1)
            r6.R0(r0)
            r6.t0 = r0
            goto L37
        L34:
            int r3 = r3 + 1
            goto Ld
        L37:
            ow6 r0 = r6.s0
            r0.w(r7, r8, r9)
            yy4 r6 = r6.t0
            if (r6 == 0) goto L43
            r6.w(r7, r8, r9)
        L43:
            return
    }
}
