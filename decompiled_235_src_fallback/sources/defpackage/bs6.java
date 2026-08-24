package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bs6  reason: default package */
/* loaded from: classes.dex */
public final class bs6 implements defpackage.xr6 {
    public defpackage.m44 a;

    @Override // defpackage.xr6
    public final java.io.InputStream a(java.io.InputStream r3, byte[] r4) {
            r2 = this;
            z73 r0 = new z73
            m44 r2 = r2.a
            r0.<init>()
            r1 = 0
            r0.A = r1
            r1 = 0
            r0.B = r1
            r0.R = r2
            boolean r2 = r3.markSupported()
            if (r2 == 0) goto L18
            r0.L = r3
            goto L1f
        L18:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream
            r2.<init>(r3)
            r0.L = r2
        L1f:
            java.io.InputStream r2 = r0.L
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2.mark(r3)
            java.lang.Object r2 = r4.clone()
            byte[] r2 = (byte[]) r2
            r0.X = r2
            return r0
    }

    @Override // defpackage.xr6
    public final java.io.OutputStream b(java.io.FileOutputStream r1, byte[] r2) {
            r0 = this;
            m44 r0 = r0.a
            java.lang.Object r0 = r0.L
            y25 r0 = (defpackage.y25) r0
            java.lang.Object r0 = r0.a
            xr6 r0 = (defpackage.xr6) r0
            java.io.OutputStream r0 = r0.b(r1, r2)
            return r0
    }
}
