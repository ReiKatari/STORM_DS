package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class b5 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.util.List B;

    public /* synthetic */ b5(int r1, java.util.List r2) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r2 = this;
            int r0 = r2.A
            r1 = 0
            java.util.List r2 = r2.B
            switch(r0) {
                case 0: goto L29;
                case 1: goto L1e;
                case 2: goto L1d;
                case 3: goto L13;
                default: goto L8;
            }
        L8:
            java.lang.Object r2 = r2.get(r1)
            hg3 r2 = (defpackage.hg3) r2
            ar0 r2 = r2.c()
            return r2
        L13:
            java.lang.Object r2 = r2.get(r1)
            hg3 r2 = (defpackage.hg3) r2
            ar0 r2 = r2.c()
        L1d:
            return r2
        L1e:
            r0 = 2
            java.lang.Object r2 = r2.get(r0)
            r2.getClass()
            java.lang.Integer r2 = (java.lang.Integer) r2
            return r2
        L29:
            java.lang.Object r2 = defpackage.gt0.H0(r2)
            c6 r2 = (defpackage.c6) r2
            long r0 = r2.a
            ts4 r2 = new ts4
            r2.<init>(r0)
            return r2
    }
}
