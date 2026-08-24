package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: te5  reason: default package */
/* loaded from: classes.dex */
public final class te5 extends defpackage.yl5 {
    public final java.lang.String B;
    public final long L;
    public final defpackage.fe5 R;

    public te5(java.lang.String r1, long r2, defpackage.fe5 r4) {
            r0 = this;
            r0.<init>()
            r0.B = r1
            r0.L = r2
            r0.R = r4
            return
    }

    @Override // defpackage.yl5
    public final long h() {
            r2 = this;
            long r0 = r2.L
            return r0
    }

    @Override // defpackage.yl5
    public final defpackage.n34 k() {
            r2 = this;
            r0 = 0
            java.lang.String r2 = r2.B
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
            fe5 r0 = r0.R
            return r0
    }
}
