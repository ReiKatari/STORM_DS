package q1;

import h1.q0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f0 implements q0 {

    /* renamed from: a  reason: collision with root package name */
    public final i1.f f12131a;

    /* renamed from: b  reason: collision with root package name */
    public final a0 f12132b;

    public f0(i1.f fVar, a0 a0Var) {
        this.f12131a = fVar;
        this.f12132b = a0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    @Override // h1.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(h1.l2 r6, float r7, cc.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof q1.e0
            if (r0 == 0) goto L13
            r0 = r8
            q1.e0 r0 = (q1.e0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L1a
        L13:
            q1.e0 r0 = new q1.e0
            ec.c r8 = (ec.c) r8
            r0.<init>(r5, r8)
        L1a:
            java.lang.Object r8 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            p7.j.I(r8)
            goto L45
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r6)
            r6 = 0
            return r6
        L30:
            p7.j.I(r8)
            mh.z r8 = new mh.z
            r2 = 16
            r8.<init>(r2, r5, r6)
            r0.Y = r3
            i1.f r2 = r5.f12131a
            java.lang.Object r8 = r2.d(r6, r7, r8, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            java.lang.Number r8 = (java.lang.Number) r8
            float r6 = r8.floatValue()
            q1.a0 r7 = r5.f12132b
            float r8 = r7.l()
            r0 = 0
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 != 0) goto L57
            goto L8f
        L57:
            float r8 = r7.l()
            float r8 = java.lang.Math.abs(r8)
            double r1 = (double) r8
            r3 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 >= 0) goto L8f
            int r8 = r7.k()
            h1.n r1 = r7.f12103k
            boolean r1 = r1.b()
            if (r1 == 0) goto L8a
            n2.f1 r1 = r7.f12107p
            java.lang.Object r1 = r1.getValue()
            q1.s r1 = (q1.s) r1
            zc.u r1 = r1.f12190s
            q1.o r2 = new q1.o
            r3 = 2
            r4 = 0
            r2.<init>(r7, r4, r3)
            r3 = 3
            zc.x.v(r1, r4, r4, r2, r3)
        L8a:
            r1 = 0
            r7.u(r8, r0, r1)
            goto L98
        L8f:
            float r7 = r7.l()
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
        L98:
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.f0.a(h1.l2, float, cc.c):java.lang.Object");
    }
}
