package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n50  reason: default package */
/* loaded from: classes.dex */
public final class n50 extends defpackage.aj3 implements defpackage.qn2 {
    public final /* synthetic */ float B;
    public final /* synthetic */ float L;
    public final /* synthetic */ int R;
    public final /* synthetic */ boolean X;

    public n50(float r1, float r2, int r3, boolean r4) {
            r0 = this;
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.X = r4
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r6) {
            r5 = this;
            jy2 r0 = defpackage.u24.m
            op5 r6 = (defpackage.op5) r6
            qh1 r1 = r6.l0
            float r1 = r1.a()
            float r2 = r5.B
            float r1 = r1 * r2
            qh1 r2 = r6.l0
            float r2 = r2.a()
            float r3 = r5.L
            float r2 = r2 * r3
            r3 = 0
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 <= 0) goto L27
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L27
            m50 r3 = new m50
            int r4 = r5.R
            r3.<init>(r1, r2, r4)
            goto L28
        L27:
            r3 = 0
        L28:
            r6.i(r3)
            r6.n(r0)
            boolean r5 = r5.X
            r6.f(r5)
            jg7 r5 = defpackage.jg7.a
            return r5
    }
}
