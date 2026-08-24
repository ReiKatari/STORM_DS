package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bf1  reason: default package */
/* loaded from: classes.dex */
public final class bf1 implements defpackage.f86 {
    public final defpackage.qn2 a;
    public final defpackage.af1 b;
    public final defpackage.db4 c;
    public final defpackage.vs4 d;
    public final defpackage.vs4 e;
    public final defpackage.vs4 f;

    public bf1(defpackage.qn2 r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            af1 r2 = new af1
            r2.<init>(r1)
            r1.b = r2
            db4 r2 = new db4
            r2.<init>()
            r1.c = r2
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            vs4 r0 = defpackage.np2.Y(r2)
            r1.d = r0
            vs4 r0 = defpackage.np2.Y(r2)
            r1.e = r0
            vs4 r2 = defpackage.np2.Y(r2)
            r1.f = r2
            return
    }

    @Override // defpackage.f86
    public final boolean a() {
            r0 = this;
            vs4 r0 = r0.d
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // defpackage.f86
    public final java.lang.Object d(defpackage.xa4 r7, defpackage.eo2 r8, defpackage.s41 r9) {
            r6 = this;
            b0 r0 = new b0
            r4 = 0
            r5 = 19
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r6 = defpackage.g04.C(r0, r9)
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            if (r6 != r7) goto L14
            return r6
        L14:
            jg7 r6 = defpackage.jg7.a
            return r6
    }

    @Override // defpackage.f86
    public final float e(float r1) {
            r0 = this;
            qn2 r0 = r0.a
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Object r0 = r0.g(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            return r0
    }
}
