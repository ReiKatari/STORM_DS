package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ha0  reason: default package */
/* loaded from: classes.dex */
public final class ha0 extends defpackage.yl5 {
    public final defpackage.fk1 B;
    public final java.lang.String L;
    public final java.lang.String R;
    public final defpackage.fe5 X;

    public ha0(defpackage.fk1 r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r2 = 1
            java.util.ArrayList r1 = r1.L
            java.lang.Object r1 = r1.get(r2)
            in6 r1 = (defpackage.in6) r1
            p40 r2 = new p40
            r2.<init>(r1, r0)
            fe5 r1 = new fe5
            r1.<init>(r2)
            r0.X = r1
            return
    }

    @Override // defpackage.yl5
    public final long h() {
            r3 = this;
            r0 = -1
            java.lang.String r3 = r3.R
            if (r3 == 0) goto Lc
            byte[] r2 = defpackage.yy7.a
            long r0 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> Lc
        Lc:
            return r0
    }

    @Override // defpackage.yl5
    public final defpackage.n34 k() {
            r2 = this;
            r0 = 0
            java.lang.String r2 = r2.L
            if (r2 == 0) goto Lc
            xh5 r1 = defpackage.n34.d
            n34 r2 = defpackage.xk2.k(r2)     // Catch: java.lang.IllegalArgumentException -> Lc
            return r2
        Lc:
            return r0
    }

    @Override // defpackage.yl5
    public final defpackage.z80 n() {
            r0 = this;
            fe5 r0 = r0.X
            return r0
    }
}
