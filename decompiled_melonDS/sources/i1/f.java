package i1;

import d1.a1;
import d1.t;
import h1.b2;
import h1.b3;
import h1.l2;
import h1.q0;
import h1.x1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f implements q0 {

    /* renamed from: a  reason: collision with root package name */
    public final a0.g f6605a;

    /* renamed from: b  reason: collision with root package name */
    public final t f6606b;

    /* renamed from: c  reason: collision with root package name */
    public final a1 f6607c;

    /* renamed from: d  reason: collision with root package name */
    public final x1 f6608d = b2.f5862c;

    public f(a0.g gVar, t tVar, a1 a1Var) {
        this.f6605a = gVar;
        this.f6606b = tVar;
        this.f6607c = a1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(i1.f r9, h1.u1 r10, float r11, float r12, i1.c r13, ec.c r14) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.f.b(i1.f, h1.u1, float, float, i1.c, ec.c):java.lang.Object");
    }

    @Override // h1.q0
    public Object a(l2 l2Var, float f8, cc.c cVar) {
        return d(l2Var, f8, b3.f5864a, (ec.c) cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(h1.u1 r11, float r12, mc.l r13, ec.c r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof i1.b
            if (r0 == 0) goto L13
            r0 = r14
            i1.b r0 = (i1.b) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            i1.b r0 = new i1.b
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L2a
            mc.l r13 = r0.R
            p7.j.I(r14)
            r5 = r10
            goto L4c
        L2a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r11)
            r11 = 0
            return r11
        L31:
            p7.j.I(r14)
            h1.k r4 = new h1.k
            r9 = 0
            r5 = r10
            r8 = r11
            r6 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.R = r7
            r0.Z = r3
            h1.x1 r11 = r5.f6608d
            java.lang.Object r14 = zc.x.F(r11, r4, r0)
            if (r14 != r1) goto L4b
            return r1
        L4b:
            r13 = r7
        L4c:
            i1.a r14 = (i1.a) r14
            java.lang.Float r11 = new java.lang.Float
            r12 = 0
            r11.<init>(r12)
            r13.k(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.f.c(h1.u1, float, mc.l, ec.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(h1.u1 r5, float r6, mc.l r7, ec.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof i1.d
            if (r0 == 0) goto L13
            r0 = r8
            i1.d r0 = (i1.d) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            i1.d r0 = new i1.d
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            p7.j.I(r8)
            goto L3a
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r5)
            r5 = 0
            return r5
        L2e:
            p7.j.I(r8)
            r0.Y = r3
            java.lang.Object r8 = r4.c(r5, r6, r7, r0)
            if (r8 != r1) goto L3a
            return r1
        L3a:
            i1.a r8 = (i1.a) r8
            java.lang.Float r5 = r8.f6603a
            float r5 = r5.floatValue()
            d1.k r6 = r8.f6604b
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L4a
            goto L54
        L4a:
            java.lang.Object r5 = r6.a()
            java.lang.Number r5 = (java.lang.Number) r5
            float r7 = r5.floatValue()
        L54:
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.f.d(h1.u1, float, mc.l, ec.c):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.f6607c.equals(this.f6607c) && nc.k.a(fVar.f6606b, this.f6606b) && fVar.f6605a.equals(this.f6605a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f6606b.hashCode();
        return this.f6605a.hashCode() + ((hashCode + (this.f6607c.hashCode() * 31)) * 31);
    }
}
