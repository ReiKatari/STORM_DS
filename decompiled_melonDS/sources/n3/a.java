package n3;

import a0.j;
import a4.r0;
import i3.f;
import i3.l;
import nc.k;
import w.d;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends b {
    public final f X;
    public final long Y;
    public int Z = 1;

    /* renamed from: b0  reason: collision with root package name */
    public final long f10088b0;

    /* renamed from: c0  reason: collision with root package name */
    public float f10089c0;

    /* renamed from: d0  reason: collision with root package name */
    public l f10090d0;

    public a(f fVar, long j2) {
        int i2;
        int i10;
        this.X = fVar;
        this.Y = j2;
        if (((int) 0) >= 0 && ((int) 0) >= 0 && (i2 = (int) (j2 >> 32)) >= 0 && (i10 = (int) (4294967295L & j2)) >= 0 && i2 <= fVar.f6630a.getWidth() && i10 <= fVar.f6630a.getHeight()) {
            this.f10088b0 = j2;
            this.f10089c0 = 1.0f;
            return;
        }
        j.h("Failed requirement.");
        throw null;
    }

    @Override // n3.b
    public final void d(float f8) {
        this.f10089c0 = f8;
    }

    @Override // n3.b
    public final void e(l lVar) {
        this.f10090d0 = lVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (k.a(this.X, aVar.X) && x4.j.a(0L, 0L) && x4.l.b(this.Y, aVar.Y) && this.Z == aVar.Z) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // n3.b
    public final long h() {
        return zb.k.T(this.f10088b0);
    }

    public final int hashCode() {
        return Integer.hashCode(this.Z) + d.f(this.Y, d.f(0L, this.X.hashCode() * 31, 31), 31);
    }

    @Override // n3.b
    public final void i(r0 r0Var) {
        k3.b bVar = r0Var.A;
        int round = Math.round(Float.intBitsToFloat((int) (bVar.c() >> 32)));
        k3.d.l0(r0Var, this.X, this.Y, (Math.round(Float.intBitsToFloat((int) (bVar.c() & 4294967295L))) & 4294967295L) | (round << 32), this.f10089c0, this.f10090d0, this.Z, 328);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BitmapPainter(image=");
        sb2.append(this.X);
        sb2.append(", srcOffset=");
        sb2.append((Object) x4.j.d(0L));
        sb2.append(", srcSize=");
        sb2.append((Object) x4.l.c(this.Y));
        sb2.append(", filterQuality=");
        int i2 = this.Z;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "Low";
        } else if (i2 == 2) {
            str = "Medium";
        } else if (i2 == 3) {
            str = "High";
        } else {
            str = "Unknown";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
