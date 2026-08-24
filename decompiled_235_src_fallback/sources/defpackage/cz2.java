package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cz2  reason: default package */
/* loaded from: classes.dex */
public abstract class cz2 implements defpackage.in6 {
    public final defpackage.i03 A;
    public final defpackage.lk2 B;
    public boolean L;
    public final /* synthetic */ defpackage.hz2 R;

    public cz2(defpackage.hz2 r1, defpackage.i03 r2) {
            r0 = this;
            r0.<init>()
            r2.getClass()
            r0.R = r1
            r0.A = r2
            lk2 r2 = new lk2
            bt r1 = r1.c
            java.lang.Object r1 = r1.L
            fe5 r1 = (defpackage.fe5) r1
            in6 r1 = r1.A
            b67 r1 = r1.b()
            r2.<init>(r1)
            r0.B = r2
            return
    }

    @Override // defpackage.in6
    public final defpackage.b67 b() {
            r0 = this;
            lk2 r0 = r0.B
            return r0
    }

    @Override // defpackage.in6
    public long b0(defpackage.k80 r3, long r4) {
            r2 = this;
            hz2 r0 = r2.R
            r3.getClass()
            bt r1 = r0.c     // Catch: java.io.IOException -> L10
            java.lang.Object r1 = r1.L     // Catch: java.io.IOException -> L10
            fe5 r1 = (defpackage.fe5) r1     // Catch: java.io.IOException -> L10
            long r2 = r1.b0(r3, r4)     // Catch: java.io.IOException -> L10
            return r2
        L10:
            r3 = move-exception
            u62 r4 = r0.b
            r4.e()
            yw2 r4 = defpackage.hz2.f
            r2.e(r4)
            throw r3
    }

    public final void e(defpackage.yw2 r6) {
            r5 = this;
            r6.getClass()
            hz2 r0 = r5.R
            int r1 = r0.d
            r2 = 6
            if (r1 != r2) goto Lb
            goto L31
        Lb:
            r3 = 5
            if (r1 != r3) goto L32
            lk2 r1 = r5.B
            b67 r3 = r1.e
            a67 r4 = defpackage.b67.d
            r1.e = r4
            r3.a()
            r3.b()
            r0.d = r2
            int r1 = r6.size()
            if (r1 <= 0) goto L31
            xk4 r0 = r0.a
            if (r0 == 0) goto L31
            vs0 r0 = r0.j
            if (r0 == 0) goto L31
            i03 r5 = r5.A
            defpackage.zz2.b(r0, r5, r6)
        L31:
            return
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            int r6 = r0.d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "state: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
    }
}
