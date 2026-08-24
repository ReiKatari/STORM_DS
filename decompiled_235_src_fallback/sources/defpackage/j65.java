package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j65  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class j65 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.n65 B;

    public /* synthetic */ j65(defpackage.n65 r1, int r2) {
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
            n65 r1 = r1.B
            switch(r0) {
                case 0: goto L15;
                default: goto L7;
            }
        L7:
            rs4 r1 = r1.f
            float r1 = r1.h()
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
        L15:
            float r0 = r1.a()
            rs4 r1 = r1.g
            float r1 = r1.h()
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L27
            goto L2a
        L27:
            r1 = 1050253722(0x3e99999a, float:0.3)
        L2a:
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
    }
}
