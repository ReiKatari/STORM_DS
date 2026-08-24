package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yp0  reason: default package */
/* loaded from: classes.dex */
public final class yp0 implements defpackage.le2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.de5 B;

    public /* synthetic */ yp0(defpackage.de5 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.le2
    public final java.lang.Object b(defpackage.ne2 r4, defpackage.r41 r5) {
            r3 = this;
            int r0 = r3.A
            jg7 r1 = defpackage.jg7.a
            de5 r3 = r3.B
            switch(r0) {
                case 0: goto L1b;
                default: goto L9;
            }
        L9:
            a7 r0 = new a7
            r2 = 7
            r0.<init>(r4, r2)
            rp6 r3 = r3.A
            java.lang.Object r3 = r3.b(r0, r5)
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            if (r3 != r4) goto L1a
            r1 = r3
        L1a:
            return r1
        L1b:
            a7 r0 = new a7
            r2 = 6
            r0.<init>(r4, r2)
            rp6 r3 = r3.A
            java.lang.Object r3 = r3.b(r0, r5)
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            if (r3 != r4) goto L2c
            r1 = r3
        L2c:
            return r1
    }
}
