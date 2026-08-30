package i1;

import h1.u1;
import java.util.concurrent.CancellationException;
import mc.l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final float f6612a = 400;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, nc.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(h1.u1 r10, float r11, d1.k r12, d1.t r13, mc.l r14, ec.c r15) {
        /*
            boolean r0 = r15 instanceof i1.h
            if (r0 == 0) goto L13
            r0 = r15
            i1.h r0 = (i1.h) r0
            int r1 = r0.f6609b0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6609b0 = r1
            goto L18
        L13:
            i1.h r0 = new i1.h
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.Z
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.f6609b0
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            float r11 = r0.R
            nc.q r10 = r0.Y
            d1.k r12 = r0.X
            p7.j.I(r15)
            goto L69
        L2d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r10)
            r10 = 0
            return r10
        L34:
            p7.j.I(r15)
            nc.q r6 = new nc.q
            r6.<init>()
            java.lang.Object r15 = r12.a()
            java.lang.Number r15 = (java.lang.Number) r15
            float r15 = r15.floatValue()
            r2 = 0
            int r15 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r15 != 0) goto L4d
            r15 = r3
            goto L4e
        L4d:
            r15 = 0
        L4e:
            r15 = r15 ^ r3
            i1.g r4 = new i1.g
            r9 = 0
            r7 = r10
            r5 = r11
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            r0.X = r12
            r0.Y = r6
            r0.R = r5
            r0.f6609b0 = r3
            java.lang.Object r10 = d1.d.f(r12, r13, r15, r4, r0)
            if (r10 != r1) goto L67
            return r1
        L67:
            r11 = r5
            r10 = r6
        L69:
            i1.a r13 = new i1.a
            float r10 = r10.A
            float r11 = r11 - r10
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r11)
            r13.<init>(r10, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.j.a(h1.u1, float, d1.k, d1.t, mc.l, ec.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, nc.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(h1.u1 r16, float r17, float r18, d1.k r19, d1.a1 r20, mc.l r21, ec.c r22) {
        /*
            r0 = r17
            r1 = r22
            boolean r2 = r1 instanceof i1.i
            if (r2 == 0) goto L18
            r2 = r1
            i1.i r2 = (i1.i) r2
            int r3 = r2.f6611c0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f6611c0 = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            i1.i r2 = new i1.i
            r2.<init>(r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.f6610b0
            dc.a r2 = dc.a.COROUTINE_SUSPENDED
            int r3 = r8.f6611c0
            r9 = 0
            r4 = 1
            if (r3 == 0) goto L3f
            if (r3 != r4) goto L38
            float r0 = r8.X
            float r2 = r8.R
            nc.q r3 = r8.Z
            d1.k r4 = r8.Y
            p7.j.I(r1)
            r1 = r0
            r0 = r2
            goto L90
        L38:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r0)
            r0 = 0
            return r0
        L3f:
            p7.j.I(r1)
            nc.q r12 = new nc.q
            r12.<init>()
            java.lang.Object r1 = r19.a()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            java.lang.Object r5 = r19.a()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L66
            r5 = r4
            goto L67
        L66:
            r5 = 0
        L67:
            r6 = r5 ^ 1
            i1.g r10 = new i1.g
            r15 = 1
            r13 = r16
            r11 = r18
            r14 = r21
            r10.<init>(r11, r12, r13, r14, r15)
            r5 = r3
            r3 = r19
            r8.Y = r3
            r8.Z = r12
            r8.R = r0
            r8.X = r1
            r8.f6611c0 = r4
            r4 = r5
            r7 = r10
            r5 = r20
            java.lang.Object r4 = d1.d.h(r3, r4, r5, r6, r7, r8)
            if (r4 != r2) goto L8d
            return r2
        L8d:
            r4 = r19
            r3 = r12
        L90:
            java.lang.Object r2 = r4.a()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r1 = d(r2, r1)
            i1.a r2 = new i1.a
            float r3 = r3.A
            float r0 = r0 - r3
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            r0 = 29
            d1.k r0 = d1.d.l(r4, r9, r1, r0)
            r2.<init>(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.j.b(h1.u1, float, float, d1.k, d1.a1, mc.l, ec.c):java.lang.Object");
    }

    public static final void c(d1.i iVar, u1 u1Var, l lVar, float f8) {
        float f10;
        try {
            f10 = u1Var.a(f8);
        } catch (CancellationException unused) {
            iVar.a();
            f10 = 0.0f;
        }
        lVar.k(Float.valueOf(f10));
        if (Math.abs(f8 - f10) > 0.5f) {
            iVar.a();
        }
    }

    public static final float d(float f8, float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        if (f10 <= 0.0f ? f8 < f10 : f8 > f10) {
            return f10;
        }
        return f8;
    }
}
