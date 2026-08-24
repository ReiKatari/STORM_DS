package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p30  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class p30 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.f47 B;

    public /* synthetic */ p30(defpackage.f47 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r3 = this;
            int r0 = r3.A
            r1 = 0
            r2 = 2
            f47 r3 = r3.B
            switch(r0) {
                case 0: goto L3c;
                case 1: goto L26;
                default: goto L9;
            }
        L9:
            fp r0 = r3.b
            vs4 r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            a47 r3 = (defpackage.a47) r3
            if (r3 == 0) goto L1c
            z37 r3 = r3.a
            if (r3 == 0) goto L1c
            fp r3 = r3.a
            goto L1d
        L1c:
            r3 = 0
        L1d:
            boolean r3 = defpackage.nb3.k(r0, r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L26:
            if (r3 == 0) goto L37
            p30 r0 = new p30
            r0.<init>(r3, r2)
            java.lang.Object r3 = r0.c()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r1 = r3.booleanValue()
        L37:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
        L3c:
            if (r3 == 0) goto L4d
            p30 r0 = new p30
            r0.<init>(r3, r2)
            java.lang.Object r3 = r0.c()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r1 = r3.booleanValue()
        L4d:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
    }
}
