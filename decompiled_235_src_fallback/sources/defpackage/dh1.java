package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dh1  reason: default package */
/* loaded from: classes.dex */
public final class dh1 implements defpackage.lt0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ dh1(java.lang.Object r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // defpackage.lt0
    public final long a() {
            r6 = this;
            int r0 = r6.a
            java.lang.Object r6 = r6.b
            switch(r0) {
                case 0: goto Lc;
                default: goto L7;
            }
        L7:
            kq5 r6 = (defpackage.kq5) r6
            long r0 = r6.c
            return r0
        Lc:
            eh1 r6 = (defpackage.eh1) r6
            lt0 r0 = r6.p0
            long r0 = r0.a()
            r2 = 16
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1b
            goto L51
        L1b:
            py0 r0 = defpackage.jq5.a
            java.lang.Object r0 = defpackage.hf.K(r6, r0)
            fq5 r0 = (defpackage.fq5) r0
            if (r0 == 0) goto L2c
            long r0 = r0.a
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L2c
            goto L51
        L2c:
            py0 r0 = defpackage.j31.a
            java.lang.Object r0 = defpackage.hf.K(r6, r0)
            kt0 r0 = (defpackage.kt0) r0
            long r0 = r0.a
            nq6 r2 = defpackage.vt0.a
            java.lang.Object r6 = defpackage.hf.K(r6, r2)
            ut0 r6 = (defpackage.ut0) r6
            boolean r6 = r6.k()
            float r2 = defpackage.hv.N(r0)
            if (r6 != 0) goto L51
            double r2 = (double) r2
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L51
            long r0 = defpackage.kt0.d
        L51:
            return r0
    }
}
