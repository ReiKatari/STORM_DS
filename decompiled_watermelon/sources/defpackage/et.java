package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: et  reason: default package */
/* loaded from: classes.dex */
public final class et implements ct, vv3, ns3 {
    public final pf3 A;
    public q36 B;
    public boolean L;

    public et(pf3 pf3Var, q36 q36Var) {
        this.A = pf3Var;
        this.B = q36Var;
    }

    @Override // defpackage.od1
    public final float A0(int i) {
        return this.A.A0(i);
    }

    @Override // defpackage.od1
    public final long B(long j) {
        return this.A.B(j);
    }

    @Override // defpackage.od1
    public final float C(float f) {
        return this.A.b() * f;
    }

    @Override // defpackage.od1
    public final float D0(float f) {
        return f / this.A.b();
    }

    @Override // defpackage.od1
    public final float P(long j) {
        return this.A.P(j);
    }

    @Override // defpackage.vv3
    public final uv3 V(int i, int i2, Map map, mi2 mi2Var, mi2 mi2Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            mz2.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new dt(i, i2, map, mi2Var, mi2Var2, this, 0);
    }

    @Override // defpackage.od1
    public final int Y(float f) {
        return this.A.Y(f);
    }

    @Override // defpackage.ns3
    public final rd3 a(rd3 rd3Var) {
        is3 is3Var;
        if (rd3Var instanceof is3) {
            return rd3Var;
        }
        if (rd3Var instanceof m74) {
            hs3 W0 = ((m74) rd3Var).W0();
            if (W0 != null && (is3Var = W0.m0) != null) {
                return is3Var;
            }
            return rd3Var;
        }
        mz2.b("Unsupported LayoutCoordinates");
        f81.c();
        return null;
    }

    @Override // defpackage.od1
    public final float b() {
        return this.A.b();
    }

    @Override // defpackage.s43
    public final sd3 getLayoutDirection() {
        return this.A.j0.u0;
    }

    @Override // defpackage.od1
    public final long i0(long j) {
        return this.A.i0(j);
    }

    @Override // defpackage.od1
    public final float n0(long j) {
        return this.A.n0(j);
    }

    @Override // defpackage.od1
    public final float o() {
        return this.A.o();
    }

    @Override // defpackage.vv3
    public final uv3 s0(int i, int i2, Map map, mi2 mi2Var) {
        return this.A.V(i, i2, map, null, mi2Var);
    }

    @Override // defpackage.od1
    public final long v0(float f) {
        return this.A.v0(f);
    }

    @Override // defpackage.s43
    public final boolean w() {
        return false;
    }

    @Override // defpackage.od1
    public final long z(float f) {
        return this.A.z(f);
    }
}
