package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gk6  reason: default package */
/* loaded from: classes.dex */
public final class gk6 implements defpackage.qn2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ defpackage.bs0 B;
    public final /* synthetic */ int L;
    public final /* synthetic */ defpackage.qa4 R;
    public final /* synthetic */ float X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ defpackage.qa4 Z;

    public gk6(boolean r1, defpackage.bs0 r2, int r3, defpackage.qa4 r4, float r5, boolean r6, defpackage.qa4 r7) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            r0.Y = r6
            r0.Z = r7
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r15) {
            r14 = this;
            wg3 r15 = (defpackage.wg3) r15
            android.view.KeyEvent r15 = r15.a
            bs0 r0 = r14.B
            float r1 = r0.b
            boolean r2 = r14.A
            if (r2 != 0) goto Lf
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            return r14
        Lf:
            int r2 = defpackage.xk2.u(r15)
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L128
            float r2 = r0.a
            float r3 = r1 - r2
            float r3 = java.lang.Math.abs(r3)
            int r6 = r14.L
            if (r6 <= 0) goto L26
            int r6 = r6 + r5
            goto L28
        L26:
            r6 = 100
        L28:
            float r7 = (float) r6
            float r3 = r3 / r7
            int r15 = r15.getKeyCode()
            long r7 = defpackage.qo2.e(r15)
            long r9 = defpackage.kg3.d
            boolean r15 = defpackage.kg3.a(r7, r9)
            float r9 = r14.X
            qa4 r10 = r14.R
            if (r15 == 0) goto L53
            java.lang.Object r14 = r10.getValue()
            qn2 r14 = (defpackage.qn2) r14
            float r9 = r9 + r3
            java.lang.Float r15 = java.lang.Float.valueOf(r9)
            java.lang.Comparable r15 = defpackage.gi2.t(r15, r0)
            r14.g(r15)
        L50:
            r4 = r5
            goto L181
        L53:
            long r11 = defpackage.kg3.e
            boolean r15 = defpackage.kg3.a(r7, r11)
            if (r15 == 0) goto L6e
            java.lang.Object r14 = r10.getValue()
            qn2 r14 = (defpackage.qn2) r14
            float r9 = r9 - r3
            java.lang.Float r15 = java.lang.Float.valueOf(r9)
            java.lang.Comparable r15 = defpackage.gi2.t(r15, r0)
            r14.g(r15)
            goto L50
        L6e:
            long r11 = defpackage.kg3.g
            boolean r15 = defpackage.kg3.a(r7, r11)
            r11 = -1
            boolean r14 = r14.Y
            if (r15 == 0) goto L92
            if (r14 == 0) goto L7c
            goto L7d
        L7c:
            r11 = r5
        L7d:
            java.lang.Object r14 = r10.getValue()
            qn2 r14 = (defpackage.qn2) r14
            float r15 = (float) r11
            float r15 = r15 * r3
            float r15 = r15 + r9
            java.lang.Float r15 = java.lang.Float.valueOf(r15)
            java.lang.Comparable r15 = defpackage.gi2.t(r15, r0)
            r14.g(r15)
            goto L50
        L92:
            long r12 = defpackage.kg3.f
            boolean r15 = defpackage.kg3.a(r7, r12)
            if (r15 == 0) goto Lb3
            if (r14 == 0) goto L9d
            goto L9e
        L9d:
            r11 = r5
        L9e:
            java.lang.Object r14 = r10.getValue()
            qn2 r14 = (defpackage.qn2) r14
            float r15 = (float) r11
            float r15 = r15 * r3
            float r9 = r9 - r15
            java.lang.Float r15 = java.lang.Float.valueOf(r9)
            java.lang.Comparable r15 = defpackage.gi2.t(r15, r0)
            r14.g(r15)
            goto L50
        Lb3:
            long r14 = defpackage.kg3.x
            boolean r14 = defpackage.kg3.a(r7, r14)
            if (r14 == 0) goto Lc9
            java.lang.Object r14 = r10.getValue()
            qn2 r14 = (defpackage.qn2) r14
            java.lang.Float r15 = java.lang.Float.valueOf(r2)
            r14.g(r15)
            goto L50
        Lc9:
            long r14 = defpackage.kg3.y
            boolean r14 = defpackage.kg3.a(r7, r14)
            if (r14 == 0) goto Le0
            java.lang.Object r14 = r10.getValue()
            qn2 r14 = (defpackage.qn2) r14
            java.lang.Float r15 = java.lang.Float.valueOf(r1)
            r14.g(r15)
            goto L50
        Le0:
            long r14 = defpackage.kg3.F
            boolean r14 = defpackage.kg3.a(r7, r14)
            r15 = 10
            if (r14 == 0) goto L105
            int r6 = r6 / r15
            int r14 = defpackage.gi2.q(r6, r5, r15)
            java.lang.Object r15 = r10.getValue()
            qn2 r15 = (defpackage.qn2) r15
            float r14 = (float) r14
            float r14 = r14 * r3
            float r9 = r9 - r14
            java.lang.Float r14 = java.lang.Float.valueOf(r9)
            java.lang.Comparable r14 = defpackage.gi2.t(r14, r0)
            r15.g(r14)
            goto L50
        L105:
            long r1 = defpackage.kg3.G
            boolean r14 = defpackage.kg3.a(r7, r1)
            if (r14 == 0) goto L181
            int r6 = r6 / r15
            int r14 = defpackage.gi2.q(r6, r5, r15)
            java.lang.Object r15 = r10.getValue()
            qn2 r15 = (defpackage.qn2) r15
            float r14 = (float) r14
            float r14 = r14 * r3
            float r14 = r14 + r9
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            java.lang.Comparable r14 = defpackage.gi2.t(r14, r0)
            r15.g(r14)
            goto L50
        L128:
            if (r2 != r5) goto L181
            int r15 = r15.getKeyCode()
            long r0 = defpackage.qo2.e(r15)
            long r2 = defpackage.kg3.d
            boolean r15 = defpackage.kg3.a(r0, r2)
            if (r15 != 0) goto L172
            long r2 = defpackage.kg3.e
            boolean r15 = defpackage.kg3.a(r0, r2)
            if (r15 != 0) goto L172
            long r2 = defpackage.kg3.g
            boolean r15 = defpackage.kg3.a(r0, r2)
            if (r15 != 0) goto L172
            long r2 = defpackage.kg3.f
            boolean r15 = defpackage.kg3.a(r0, r2)
            if (r15 != 0) goto L172
            long r2 = defpackage.kg3.x
            boolean r15 = defpackage.kg3.a(r0, r2)
            if (r15 != 0) goto L172
            long r2 = defpackage.kg3.y
            boolean r15 = defpackage.kg3.a(r0, r2)
            if (r15 != 0) goto L172
            long r2 = defpackage.kg3.F
            boolean r15 = defpackage.kg3.a(r0, r2)
            if (r15 != 0) goto L172
            long r2 = defpackage.kg3.G
            boolean r15 = defpackage.kg3.a(r0, r2)
            if (r15 == 0) goto L181
        L172:
            qa4 r14 = r14.Z
            java.lang.Object r14 = r14.getValue()
            on2 r14 = (defpackage.on2) r14
            if (r14 == 0) goto L50
            r14.c()
            goto L50
        L181:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r4)
            return r14
    }
}
