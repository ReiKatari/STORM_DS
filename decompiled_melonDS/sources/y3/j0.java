package y3;

import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j0 implements r1 {
    public x4.m A = x4.m.Rtl;
    public float B;
    public float L;
    public final /* synthetic */ p0 R;

    public j0(p0 p0Var) {
        this.R = p0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    @Override // y3.r1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List D(java.lang.Object r11, mc.p r12) {
        /*
            r10 = this;
            y3.p0 r0 = r10.R
            r0.h()
            a4.o0 r1 = r0.A
            a4.t0 r2 = r1.B0
            a4.i0 r2 = r2.f337d
            a4.i0 r3 = a4.i0.Measuring
            if (r2 == r3) goto L21
            a4.i0 r4 = a4.i0.LayingOut
            if (r2 == r4) goto L21
            a4.i0 r4 = a4.i0.LookaheadMeasuring
            if (r2 == r4) goto L21
            a4.i0 r4 = a4.i0.LookaheadLayingOut
            if (r2 != r4) goto L1c
            goto L21
        L1c:
            java.lang.String r4 = "subcompose can only be used inside the measure or layout blocks"
            x3.a.c(r4)
        L21:
            a1.m0 r4 = r0.Z
            java.lang.Object r5 = r4.g(r11)
            r6 = 0
            r7 = 1
            if (r5 != 0) goto L67
            a1.m0 r5 = r0.f14721d0
            java.lang.Object r5 = r5.k(r11)
            a4.o0 r5 = (a4.o0) r5
            if (r5 == 0) goto L4e
            a1.m0 r8 = r0.Y
            java.lang.Object r8 = r8.g(r5)
            y3.h0 r8 = (y3.h0) r8
            int r8 = r0.f14726i0
            if (r8 <= 0) goto L42
            goto L47
        L42:
            java.lang.String r8 = "Check failed."
            x3.a.c(r8)
        L47:
            int r8 = r0.f14726i0
            int r8 = r8 + (-1)
            r0.f14726i0 = r8
            goto L64
        L4e:
            a4.o0 r5 = r0.n(r11)
            if (r5 != 0) goto L64
            int r5 = r0.R
            a4.o0 r8 = new a4.o0
            r9 = 2
            r8.<init>(r9)
            r1.f288l0 = r7
            r1.B(r5, r8)
            r1.f288l0 = r6
            r5 = r8
        L64:
            r4.m(r11, r5)
        L67:
            a4.o0 r5 = (a4.o0) r5
            java.util.List r4 = r1.o()
            int r8 = r0.R
            if (r8 < 0) goto L7e
            a1.f0 r4 = (a1.f0) r4
            int r9 = r4.size()
            if (r8 >= r9) goto L7e
            java.lang.Object r4 = r4.get(r8)
            goto L7f
        L7e:
            r4 = 0
        L7f:
            if (r4 == r5) goto Lb1
            java.util.List r1 = r1.o()
            a1.f0 r1 = (a1.f0) r1
            java.lang.Object r1 = r1.B
            p2.b r1 = (p2.b) r1
            int r1 = r1.i(r5)
            int r4 = r0.R
            if (r1 < r4) goto L94
            goto Laa
        L94:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r8 = "Key \""
            r4.<init>(r8)
            r4.append(r11)
            java.lang.String r8 = "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            x3.a.a(r4)
        Laa:
            int r4 = r0.R
            if (r4 == r1) goto Lb1
            r0.j(r1, r4)
        Lb1:
            int r1 = r0.R
            int r1 = r1 + r7
            r0.R = r1
            r0.m(r5, r11, r6, r12)
            if (r2 == r3) goto Lc5
            a4.i0 r11 = a4.i0.LayingOut
            if (r2 != r11) goto Lc0
            goto Lc5
        Lc0:
            java.util.List r11 = r5.l()
            return r11
        Lc5:
            java.util.List r11 = r5.m()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.j0.D(java.lang.Object, mc.p):java.util.List");
    }

    @Override // x4.c
    public final float b() {
        return this.B;
    }

    @Override // y3.v
    public final x4.m getLayoutDirection() {
        return this.A;
    }

    @Override // x4.c
    public final float j() {
        return this.L;
    }

    @Override // y3.x0
    public final w0 k0(int i2, int i10, Map map, mc.l lVar, mc.l lVar2) {
        if ((i2 & (-16777216)) != 0 || ((-16777216) & i10) != 0) {
            x3.a.c("Size(" + i2 + " x " + i10 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new i0(i2, i10, map, lVar, this, this.R, lVar2);
    }

    @Override // y3.v
    public final boolean q() {
        a4.i0 i0Var = this.R.A.B0.f337d;
        if (i0Var != a4.i0.LookaheadLayingOut && i0Var != a4.i0.LookaheadMeasuring) {
            return false;
        }
        return true;
    }
}
