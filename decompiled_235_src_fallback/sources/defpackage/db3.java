package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: db3  reason: default package */
/* loaded from: classes.dex */
public final class db3 extends defpackage.hb3 {
    public defpackage.gb3 l0;
    public boolean m0;

    @Override // defpackage.hb3
    public final long R0(defpackage.x24 r2, long r3) {
            r1 = this;
            gb3 r1 = r1.l0
            gb3 r0 = defpackage.gb3.Min
            if (r1 != r0) goto Lf
            int r1 = defpackage.q21.h(r3)
            int r1 = r2.V(r1)
            goto L17
        Lf:
            int r1 = defpackage.q21.h(r3)
            int r1 = r2.c(r1)
        L17:
            r2 = 0
            if (r1 >= 0) goto L1b
            r1 = r2
        L1b:
            if (r1 < 0) goto L1e
            goto L23
        L1e:
            java.lang.String r3 = "height must be >= 0"
            defpackage.r53.a(r3)
        L23:
            r3 = 2147483647(0x7fffffff, float:NaN)
            long r1 = defpackage.s21.h(r2, r3, r1, r1)
            return r1
    }

    @Override // defpackage.hb3
    public final boolean S0() {
            r0 = this;
            boolean r0 = r0.m0
            return r0
    }

    @Override // defpackage.hb3, defpackage.jm3
    public final int Z(defpackage.kz3 r1, defpackage.x24 r2, int r3) {
            r0 = this;
            gb3 r0 = r0.l0
            gb3 r1 = defpackage.gb3.Min
            if (r0 != r1) goto Lb
            int r0 = r2.V(r3)
            return r0
        Lb:
            int r0 = r2.c(r3)
            return r0
    }

    @Override // defpackage.hb3, defpackage.jm3
    public final int h0(defpackage.kz3 r1, defpackage.x24 r2, int r3) {
            r0 = this;
            gb3 r0 = r0.l0
            gb3 r1 = defpackage.gb3.Min
            if (r0 != r1) goto Lb
            int r0 = r2.V(r3)
            return r0
        Lb:
            int r0 = r2.c(r3)
            return r0
    }
}
