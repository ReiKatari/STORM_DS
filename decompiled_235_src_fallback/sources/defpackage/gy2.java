package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gy2  reason: default package */
/* loaded from: classes.dex */
public final class gy2 extends defpackage.aj3 implements defpackage.eo2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.hy2[] L;

    public /* synthetic */ gy2(defpackage.hy2[] r1, int r2) {
            r0 = this;
            r0.B = r2
            r0.L = r1
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.B
            hy2[] r1 = r1.L
            switch(r0) {
                case 0: goto L19;
                default: goto L7;
            }
        L7:
            cx4 r2 = (defpackage.cx4) r2
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            r0 = 0
            float r1 = defpackage.gi2.i(r2, r0, r1, r3)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
        L19:
            cx4 r2 = (defpackage.cx4) r2
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            r0 = 1
            float r1 = defpackage.gi2.i(r2, r0, r1, r3)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
    }
}
