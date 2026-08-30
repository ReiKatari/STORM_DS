package y3;

import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f implements g, d {
    public final /* synthetic */ d A;
    public final x4.m B;

    public f(d dVar, x4.m mVar) {
        this.A = dVar;
        this.B = mVar;
    }

    @Override // x4.c
    public final int G(long j2) {
        return this.A.G(j2);
    }

    @Override // x4.c
    public final float I(long j2) {
        return this.A.I(j2);
    }

    @Override // x4.c
    public final int O(float f8) {
        return this.A.O(f8);
    }

    @Override // x4.c
    public final long W(long j2) {
        return this.A.W(j2);
    }

    @Override // x4.c
    public final float b() {
        return this.A.b();
    }

    @Override // x4.c
    public final float c0(long j2) {
        return this.A.c0(j2);
    }

    @Override // y3.v
    public final x4.m getLayoutDirection() {
        return this.B;
    }

    @Override // x4.c
    public final float j() {
        return this.A.j();
    }

    @Override // y3.x0
    public final w0 k0(int i2, int i10, Map map, mc.l lVar, mc.l lVar2) {
        int i11;
        int i12;
        if (i2 < 0) {
            i11 = 0;
        } else {
            i11 = i2;
        }
        if (i10 < 0) {
            i12 = 0;
        } else {
            i12 = i10;
        }
        if ((i11 & (-16777216)) != 0 || ((-16777216) & i12) != 0) {
            x3.a.c("Size(" + i11 + " x " + i12 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new e(i11, i12, map, lVar, 0);
    }

    @Override // x4.c
    public final long m0(float f8) {
        return this.A.m0(f8);
    }

    @Override // y3.v
    public final boolean q() {
        return this.A.q();
    }

    @Override // x4.c
    public final long r(float f8) {
        return this.A.r(f8);
    }

    @Override // x4.c
    public final long t(long j2) {
        return this.A.t(j2);
    }

    @Override // x4.c
    public final float t0(int i2) {
        return this.A.t0(i2);
    }

    @Override // x4.c
    public final float v(float f8) {
        return this.A.v(f8);
    }

    @Override // x4.c
    public final float x0(float f8) {
        return this.A.x0(f8);
    }
}
