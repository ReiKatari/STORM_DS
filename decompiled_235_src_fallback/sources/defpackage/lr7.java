package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lr7  reason: default package */
/* loaded from: classes.dex */
public final class lr7 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.qn2 B;
    public final /* synthetic */ defpackage.zq7 L;

    public /* synthetic */ lr7(defpackage.qn2 r1, defpackage.zq7 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    public lr7(defpackage.zq7 r2, defpackage.qn2 r3) {
            r1 = this;
            r0 = 3
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.B = r3
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r3 = this;
            int r0 = r3.A
            jg7 r1 = defpackage.jg7.a
            qn2 r2 = r3.B
            zq7 r3 = r3.L
            switch(r0) {
                case 0: goto L1f;
                case 1: goto L19;
                case 2: goto L13;
                default: goto Lb;
            }
        Lb:
            if (r3 == 0) goto L12
            java.lang.String r3 = r3.a
            r2.g(r3)
        L12:
            return r1
        L13:
            java.lang.String r3 = r3.a
            r2.g(r3)
            return r1
        L19:
            java.lang.String r3 = r3.a
            r2.g(r3)
            return r1
        L1f:
            java.lang.String r3 = r3.a
            r2.g(r3)
            return r1
    }
}
