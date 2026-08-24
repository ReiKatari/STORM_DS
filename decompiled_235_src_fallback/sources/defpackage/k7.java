package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k7  reason: default package */
/* loaded from: classes.dex */
public final class k7 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.ga7 B;

    public /* synthetic */ k7(defpackage.ga7 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r1 = this;
            int r0 = r1.A
            ga7 r1 = r1.B
            switch(r0) {
                case 0: goto L18;
                case 1: goto L13;
                case 2: goto Lc;
                default: goto L7;
            }
        L7:
            aa7 r1 = r1.f()
            return r1
        Lc:
            vs4 r1 = r1.d
            java.lang.Object r1 = r1.getValue()
            return r1
        L13:
            aa7 r1 = r1.f()
            return r1
        L18:
            vs4 r1 = r1.d
            java.lang.Object r1 = r1.getValue()
            return r1
    }
}
