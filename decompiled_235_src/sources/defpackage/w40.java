package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w40  reason: default package */
/* loaded from: classes.dex */
public final class w40 extends sr4 {
    public final zh X;
    public final long Y;
    public int Z;
    public final long d0;
    public float e0;
    public z40 f0;

    public w40(zh zhVar, long j) {
        int i;
        this.X = zhVar;
        this.Y = j;
        this.Z = 1;
        int i2 = (int) (j >> 32);
        if (i2 >= 0 && (i = (int) (4294967295L & j)) >= 0 && i2 <= zhVar.a.getWidth() && i <= zhVar.a.getHeight()) {
            this.d0 = j;
            this.e0 = 1.0f;
            return;
        }
        i.h("Failed requirement.");
        throw null;
    }

    @Override // defpackage.sr4
    public final void d(float f) {
        this.e0 = f;
    }

    @Override // defpackage.sr4
    public final void e(z40 z40Var) {
        this.f0 = z40Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w40) {
                w40 w40Var = (w40) obj;
                if (nb3.k(this.X, w40Var.X) && i93.a(0L, 0L) && q93.b(this.Y, w40Var.Y) && this.Z == w40Var.Z) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.sr4
    public final long h() {
        return qo2.S(this.d0);
    }

    public final int hashCode() {
        return Integer.hashCode(this.Z) + i61.c(this.Y, i61.c(0L, this.X.hashCode() * 31, 31), 31);
    }

    @Override // defpackage.sr4
    public final void i(um3 um3Var) {
        zj0 zj0Var = um3Var.A;
        int round = Math.round(Float.intBitsToFloat((int) (zj0Var.e() >> 32)));
        float f = this.e0;
        z40 z40Var = this.f0;
        int i = this.Z;
        no1.z(um3Var, this.X, this.Y, (round << 32) | (Math.round(Float.intBitsToFloat((int) (zj0Var.e() & 4294967295L))) & 4294967295L), f, z40Var, i, 328);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.X);
        sb.append(", srcOffset=");
        sb.append((Object) i93.d(0L));
        sb.append(", srcSize=");
        sb.append((Object) q93.c(this.Y));
        sb.append(", filterQuality=");
        int i = this.Z;
        if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Low";
        } else if (i == 2) {
            str = "Medium";
        } else if (i == 3) {
            str = "High";
        } else {
            str = "Unknown";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w40(zh zhVar) {
        this(zhVar, (zhVar.a.getHeight() & 4294967295L) | (r0 << 32));
        int width = zhVar.a.getWidth();
    }
}
