package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ht4  reason: default package */
/* loaded from: classes.dex */
public final class ht4 implements defpackage.qz0 {
    public final defpackage.f36 A;
    public final java.lang.String B;
    public final defpackage.eo2 L;
    public final defpackage.ex6 R;

    public ht4(defpackage.f36 r1, java.lang.String r2, defpackage.eo2 r3) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            er2 r1 = new er2
            r2 = 12
            r1.<init>(r0, r2)
            ex6 r2 = new ex6
            r2.<init>(r1)
            r0.R = r2
            return
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            ex6 r1 = r1.R
            boolean r0 = r1.a()
            if (r0 == 0) goto L11
            java.lang.Object r1 = r1.getValue()
            e36 r1 = (defpackage.e36) r1
            r1.close()
        L11:
            return
    }

    @Override // defpackage.qz0
    public final java.lang.Object s(boolean r4, defpackage.eo2 r5, defpackage.s41 r6) {
            r3 = this;
            l61 r4 = r6.b()
            jd1 r0 = defpackage.gt4.B
            j61 r4 = r4.Z(r0)
            gt4 r4 = (defpackage.gt4) r4
            r0 = 0
            if (r4 == 0) goto L12
            ft4 r4 = r4.A
            goto L13
        L12:
            r4 = r0
        L13:
            if (r4 == 0) goto L1a
            java.lang.Object r3 = r5.o(r4, r6)
            return r3
        L1a:
            ft4 r4 = new ft4
            ex6 r1 = r3.R
            java.lang.Object r1 = r1.getValue()
            e36 r1 = (defpackage.e36) r1
            eo2 r3 = r3.L
            r4.<init>(r3, r1)
            gt4 r3 = new gt4
            r3.<init>(r4)
            bf4 r1 = new bf4
            r2 = 3
            r1.<init>(r5, r4, r0, r2)
            java.lang.Object r3 = defpackage.hv.d0(r3, r1, r6)
            return r3
    }
}
