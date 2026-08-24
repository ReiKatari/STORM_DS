package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: np0  reason: default package */
/* loaded from: classes.dex */
public final class np0 implements defpackage.ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.rc4 B;

    public /* synthetic */ np0(defpackage.rc4 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.ne2
    public final java.lang.Object a(java.lang.Object r2, defpackage.r41 r3) {
            r1 = this;
            int r3 = r1.A
            jg7 r0 = defpackage.jg7.a
            rc4 r1 = r1.B
            switch(r3) {
                case 0: goto L2b;
                case 1: goto L1e;
                case 2: goto L11;
                default: goto L9;
            }
        L9:
            jg7 r2 = (defpackage.jg7) r2
            wo0 r2 = defpackage.wo0.INSTANCE
            defpackage.rc4.b(r1, r2)
            return r0
        L11:
            rm4 r2 = (defpackage.rm4) r2
            zo0 r3 = new zo0
            java.lang.String r2 = r2.a
            r3.<init>(r2)
            defpackage.rc4.b(r1, r3)
            return r0
        L1e:
            rm4 r2 = (defpackage.rm4) r2
            cp0 r3 = new cp0
            java.lang.String r2 = r2.a
            r3.<init>(r2)
            defpackage.rc4.b(r1, r3)
            return r0
        L2b:
            rm4 r2 = (defpackage.rm4) r2
            dp0 r2 = defpackage.dp0.INSTANCE
            defpackage.rc4.b(r1, r2)
            return r0
    }
}
