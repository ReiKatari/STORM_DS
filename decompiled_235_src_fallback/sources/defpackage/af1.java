package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: af1  reason: default package */
/* loaded from: classes.dex */
public final class af1 implements defpackage.p76 {
    public final /* synthetic */ defpackage.bf1 a;

    public af1(defpackage.bf1 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.p76
    public final float a(float r6) {
            r5 = this;
            boolean r0 = java.lang.Float.isNaN(r6)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            bf1 r5 = r5.a
            qn2 r0 = r5.a
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            java.lang.Object r6 = r0.g(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            vs4 r0 = r5.e
            int r2 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 <= 0) goto L24
            r2 = r4
            goto L25
        L24:
            r2 = r3
        L25:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.setValue(r2)
            vs4 r5 = r5.f
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L33
            r3 = r4
        L33:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r5.setValue(r0)
            return r6
    }
}
