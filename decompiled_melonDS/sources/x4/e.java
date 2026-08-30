package x4;

import p7.t;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements c {
    public final float A;
    public final float B;
    public final y4.a L;

    public e(float f8, float f10, y4.a aVar) {
        this.A = f8;
        this.B = f10;
        this.L = aVar;
    }

    @Override // x4.c
    public final float I(long j2) {
        if (p.a(o.b(j2), 4294967296L)) {
            return this.L.b(o.c(j2));
        }
        a0.j.p("Only Sp can convert to Px");
        return 0.0f;
    }

    @Override // x4.c
    public final float b() {
        return this.A;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (Float.compare(this.A, eVar.A) != 0 || Float.compare(this.B, eVar.B) != 0 || !this.L.equals(eVar.L)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.L.hashCode() + w.d.b(this.B, Float.hashCode(this.A) * 31, 31);
    }

    @Override // x4.c
    public final float j() {
        return this.B;
    }

    @Override // x4.c
    public final long r(float f8) {
        return t.C(4294967296L, this.L.a(f8));
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.A + ", fontScale=" + this.B + ", converter=" + this.L + ')';
    }
}
