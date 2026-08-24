package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e96  reason: default package */
/* loaded from: classes.dex */
public final class e96 implements defpackage.qn2 {
    public final /* synthetic */ float A;
    public final /* synthetic */ defpackage.bs0 B;
    public final /* synthetic */ defpackage.rs4 L;

    public e96(float r1, defpackage.bs0 r2, defpackage.rs4 r3) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r9) {
            r8 = this;
            wg3 r9 = (defpackage.wg3) r9
            android.view.KeyEvent r9 = r9.a
            r9.getClass()
            int r0 = defpackage.xk2.u(r9)
            r1 = 2
            r2 = 0
            if (r0 != r1) goto L60
            int r9 = r9.getKeyCode()
            long r0 = defpackage.qo2.e(r9)
            long r3 = defpackage.kg3.j
            boolean r9 = defpackage.kg3.a(r0, r3)
            r3 = 1
            bs0 r4 = r8.B
            float r5 = r8.A
            rs4 r8 = r8.L
            if (r9 != 0) goto L50
            long r6 = defpackage.kg3.f
            boolean r9 = defpackage.kg3.a(r0, r6)
            if (r9 == 0) goto L2f
            goto L50
        L2f:
            long r6 = defpackage.kg3.i
            boolean r9 = defpackage.kg3.a(r0, r6)
            if (r9 != 0) goto L3f
            long r6 = defpackage.kg3.g
            boolean r9 = defpackage.kg3.a(r0, r6)
            if (r9 == 0) goto L60
        L3f:
            float r9 = r8.h()
            float r9 = r9 + r5
            float r0 = r4.b
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 <= 0) goto L4b
            r9 = r0
        L4b:
            r8.i(r9)
        L4e:
            r2 = r3
            goto L60
        L50:
            float r9 = r8.h()
            float r9 = r9 - r5
            float r0 = r4.a
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 >= 0) goto L5c
            r9 = r0
        L5c:
            r8.i(r9)
            goto L4e
        L60:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
    }
}
