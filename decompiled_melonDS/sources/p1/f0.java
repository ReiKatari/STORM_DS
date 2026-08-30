package p1;

import java.util.List;
import java.util.Map;
import y3.r1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f0 implements y3.x0 {
    public final y A;
    public final r1 B;
    public final z L;
    public final a1.x R;

    public f0(y yVar, r1 r1Var) {
        this.A = yVar;
        this.B = r1Var;
        this.L = (z) yVar.f11287b.b();
        a1.m.a();
        this.R = new a1.x();
    }

    @Override // x4.c
    public final int G(long j2) {
        return this.B.G(j2);
    }

    @Override // x4.c
    public final float I(long j2) {
        return this.B.I(j2);
    }

    @Override // x4.c
    public final int O(float f8) {
        return this.B.O(f8);
    }

    @Override // x4.c
    public final long W(long j2) {
        return this.B.W(j2);
    }

    public final List a(int i2) {
        a1.x xVar = this.R;
        List list = (List) xVar.b(i2);
        if (list != null) {
            return list;
        }
        z zVar = this.L;
        Object b10 = zVar.b(i2);
        List D = this.B.D(b10, this.A.a(i2, b10, zVar.c(i2)));
        xVar.i(i2, D);
        return D;
    }

    @Override // x4.c
    public final float b() {
        return this.B.b();
    }

    @Override // x4.c
    public final float c0(long j2) {
        return this.B.c0(j2);
    }

    @Override // y3.v
    public final x4.m getLayoutDirection() {
        return this.B.getLayoutDirection();
    }

    @Override // x4.c
    public final float j() {
        return this.B.j();
    }

    @Override // y3.x0
    public final y3.w0 k0(int i2, int i10, Map map, mc.l lVar, mc.l lVar2) {
        return this.B.k0(i2, i10, map, lVar, lVar2);
    }

    @Override // x4.c
    public final long m0(float f8) {
        return this.B.m0(f8);
    }

    @Override // y3.v
    public final boolean q() {
        return this.B.q();
    }

    @Override // x4.c
    public final long r(float f8) {
        return this.B.r(f8);
    }

    @Override // x4.c
    public final long t(long j2) {
        return this.B.t(j2);
    }

    @Override // x4.c
    public final float t0(int i2) {
        return this.B.t0(i2);
    }

    @Override // y3.x0
    public final y3.w0 u0(int i2, int i10, Map map, mc.l lVar) {
        return this.B.u0(i2, i10, map, lVar);
    }

    @Override // x4.c
    public final float v(float f8) {
        return this.B.v(f8);
    }

    @Override // x4.c
    public final float x0(float f8) {
        return this.B.x0(f8);
    }
}
