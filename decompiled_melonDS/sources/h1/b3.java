package h1;

import g2.l5;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b3 {

    /* renamed from: a  reason: collision with root package name */
    public static final l5 f5864a = new l5(5);

    public static final void a(rd.k kVar, s3.b bVar, n1 n1Var, s3.a aVar, b1 b1Var, long j2) {
        float intBitsToFloat;
        ArrayList arrayList = b1Var.f5859b;
        long j10 = bVar.f12825c;
        boolean z10 = bVar.f12826d;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (bVar.f12825c & 4294967295L));
        boolean z11 = bVar.f12830h;
        if (!z11 && z10) {
            b1Var.f5858a = 0;
            arrayList.clear();
        }
        if (!b(bVar) && (z11 || !z10)) {
            if (arrayList.size() == 3) {
                int i2 = b1Var.f5858a;
                b1Var.f5858a = i2 + 1;
                arrayList.set(i2, bVar);
            } else {
                arrayList.add(bVar);
            }
            if (b1Var.f5858a == 3) {
                b1Var.f5858a = 0;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((s3.b) arrayList.get(i10)).f12825c >> 32))));
            }
            intBitsToFloat2 = (float) zb.l.M(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                arrayList3.add(Float.valueOf(Float.intBitsToFloat((int) (((s3.b) arrayList.get(i11)).f12825c & 4294967295L))));
            }
            intBitsToFloat3 = (float) zb.l.M(arrayList3);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
        if (n1Var != null) {
            int i12 = aVar.f12822a;
            if (i12 == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            } else if (i12 == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            }
            floatToRawIntBits = n1Var == n1.Horizontal ? (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L) : (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
        }
        ((v0.h) kVar.B).d(bVar.f12824b, h3.b.e(floatToRawIntBits, j2));
    }

    public static final boolean b(s3.b bVar) {
        if (bVar.f12830h && !bVar.f12826d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, nc.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(h1.j2 r5, float r6, d1.a1 r7, ec.c r8) {
        /*
            boolean r0 = r8 instanceof h1.s1
            if (r0 == 0) goto L13
            r0 = r8
            h1.s1 r0 = (h1.s1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            h1.s1 r0 = new h1.s1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            nc.q r5 = r0.R
            p7.j.I(r8)
            goto L4c
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r5)
            r5 = 0
            return r5
        L30:
            p7.j.I(r8)
            nc.q r8 = new nc.q
            r8.<init>()
            h1.t1 r2 = new h1.t1
            r4 = 0
            r2.<init>(r6, r7, r8, r4)
            r0.R = r8
            r0.Y = r3
            f1.f1 r6 = f1.f1.Default
            java.lang.Object r5 = r5.c(r6, r2, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            r5 = r8
        L4c:
            float r5 = r5.A
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.b3.c(h1.j2, float, d1.a1, ec.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:21:0x005d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(v3.f0 r8, v3.l r9, ec.a r10) {
        /*
            boolean r0 = r10 instanceof h1.r0
            if (r0 == 0) goto L13
            r0 = r10
            h1.r0 r0 = (h1.r0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            h1.r0 r0 = new h1.r0
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.Y
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2f
            v3.l r8 = r0.X
            v3.f0 r9 = r0.R
            p7.j.I(r10)
            r7 = r9
            r9 = r8
            r8 = r7
            goto L5d
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r8)
            r8 = 0
            return r8
        L36:
            p7.j.I(r10)
            v3.h0 r10 = r8.Y
            v3.k r10 = r10.f13663n0
            java.lang.Object r10 = r10.f13678a
            int r2 = r10.size()
            r5 = r3
        L44:
            if (r5 >= r2) goto L79
            java.lang.Object r6 = r10.get(r5)
            v3.t r6 = (v3.t) r6
            boolean r6 = r6.f13694d
            if (r6 == 0) goto L76
        L50:
            r0.R = r8
            r0.X = r9
            r0.Z = r4
            java.lang.Object r10 = r8.a(r9, r0)
            if (r10 != r1) goto L5d
            return r1
        L5d:
            v3.k r10 = (v3.k) r10
            java.lang.Object r10 = r10.f13678a
            int r2 = r10.size()
            r5 = r3
        L66:
            if (r5 >= r2) goto L79
            java.lang.Object r6 = r10.get(r5)
            v3.t r6 = (v3.t) r6
            boolean r6 = r6.f13694d
            if (r6 == 0) goto L73
            goto L50
        L73:
            int r5 = r5 + 1
            goto L66
        L76:
            int r5 = r5 + 1
            goto L44
        L79:
            yb.y r8 = yb.y.f14813a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.b3.d(v3.f0, v3.l, ec.a):java.lang.Object");
    }

    public static final Object e(v3.w wVar, mc.p pVar, cc.c cVar) {
        Object O0 = ((v3.h0) wVar).O0(new s0(cVar.g(), pVar, (cc.c) null), cVar);
        if (O0 == dc.a.COROUTINE_SUSPENDED) {
            return O0;
        }
        return yb.y.f14813a;
    }

    public static final long f(s3.b bVar, n1 n1Var, s3.a aVar) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long floatToRawIntBits2;
        if (n1Var == null) {
            return bVar.f12825c;
        }
        int i2 = aVar.f12822a;
        if (i2 == 1) {
            intBitsToFloat = Float.intBitsToFloat((int) (bVar.f12825c >> 32));
        } else if (i2 == 2) {
            intBitsToFloat = Float.intBitsToFloat((int) (bVar.f12825c & 4294967295L));
        } else {
            return bVar.f12825c;
        }
        if (n1Var == n1.Horizontal) {
            floatToRawIntBits = Float.floatToRawIntBits(0.0f);
            floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat) << 32;
        } else {
            floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
            floatToRawIntBits2 = Float.floatToRawIntBits(0.0f) << 32;
        }
        return floatToRawIntBits2 | (4294967295L & floatToRawIntBits);
    }

    public static final long g(s3.b bVar, n1 n1Var, s3.a aVar) {
        float intBitsToFloat;
        long j2 = bVar.f12829g;
        if (n1Var == null) {
            return j2;
        }
        int i2 = aVar.f12822a;
        if (i2 == 1) {
            intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        } else if (i2 == 2) {
            intBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
        } else {
            return j2;
        }
        if (n1Var == n1.Horizontal) {
            return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
        }
        return (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }
}
