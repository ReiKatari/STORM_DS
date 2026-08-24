package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rl6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rl6 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ float B;
    public final /* synthetic */ defpackage.ah5 L;
    public final /* synthetic */ defpackage.p76 R;
    public final /* synthetic */ defpackage.qn2 X;

    public /* synthetic */ rl6(float r1, defpackage.ah5 r2, defpackage.p76 r3, defpackage.qn2 r4, int r5) {
            r0 = this;
            r0.A = r5
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.X = r4
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.A
            jg7 r1 = defpackage.jg7.a
            qn2 r2 = r6.X
            p76 r3 = r6.R
            ah5 r4 = r6.L
            float r6 = r6.B
            so r7 = (defpackage.so) r7
            switch(r0) {
                case 0: goto L5a;
                default: goto L11;
            }
        L11:
            vs4 r0 = r7.e
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r6 = defpackage.kn2.v(r0, r6)
            float r0 = r4.A
            float r0 = r6 - r0
            float r3 = r3.a(r0)     // Catch: java.util.concurrent.CancellationException -> L2a
            goto L2e
        L2a:
            r7.a()
            r3 = 0
        L2e:
            java.lang.Float r5 = java.lang.Float.valueOf(r3)
            r2.g(r5)
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            r2 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L51
            vs4 r0 = r7.e
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L51
            goto L54
        L51:
            r7.a()
        L54:
            float r6 = r4.A
            float r6 = r6 + r3
            r4.A = r6
            return r1
        L5a:
            vs4 r0 = r7.e
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r0 = java.lang.Math.abs(r0)
            float r5 = java.lang.Math.abs(r6)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            vs4 r5 = r7.e
            if (r0 < 0) goto L8f
            java.lang.Object r0 = r5.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r6 = defpackage.kn2.v(r0, r6)
            float r0 = r4.A
            float r0 = r6 - r0
            defpackage.kn2.r(r7, r3, r2, r0)
            r7.a()
            r4.A = r6
            goto Lab
        L8f:
            java.lang.Object r6 = r5.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            float r0 = r4.A
            float r6 = r6 - r0
            defpackage.kn2.r(r7, r3, r2, r6)
            java.lang.Object r6 = r5.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            r4.A = r6
        Lab:
            return r1
    }
}
