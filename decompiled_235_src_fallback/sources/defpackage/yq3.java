package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yq3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yq3 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.zq3 B;

    public /* synthetic */ yq3(defpackage.zq3 r1, int r2) {
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
            zq3 r1 = r1.B
            switch(r0) {
                case 0: goto L25;
                case 1: goto L1a;
                default: goto L7;
            }
        L7:
            tq3 r0 = r1.l0
            int r0 = r0.a()
            tq3 r1 = r1.l0
            int r1 = r1.c()
            int r0 = r0 - r1
            float r1 = (float) r0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
        L1a:
            tq3 r1 = r1.l0
            float r1 = r1.d()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
        L25:
            tq3 r1 = r1.l0
            float r1 = r1.b()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
    }
}
