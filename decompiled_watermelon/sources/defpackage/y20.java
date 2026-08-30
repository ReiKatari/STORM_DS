package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y20  reason: default package */
/* loaded from: classes.dex */
public final class y20 extends qi4 {
    public final nh X;
    public final long Y;
    public int Z;
    public final long c0;
    public float d0;
    public b30 e0;

    public y20(nh nhVar, long j) {
        int i;
        this.X = nhVar;
        this.Y = j;
        this.Z = 1;
        int i2 = (int) (j >> 32);
        if (i2 >= 0 && (i = (int) (4294967295L & j)) >= 0 && i2 <= nhVar.a.getWidth() && i <= nhVar.a.getHeight()) {
            this.c0 = j;
            this.d0 = 1.0f;
            return;
        }
        i.i("Failed requirement.");
        throw null;
    }

    @Override // defpackage.qi4
    public final void d(float f) {
        this.d0 = f;
    }

    @Override // defpackage.qi4
    public final void e(b30 b30Var) {
        this.e0 = b30Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof y20) {
                y20 y20Var = (y20) obj;
                if (b53.x(this.X, y20Var.X) && a33.a(0L, 0L) && i33.b(this.Y, y20Var.Y) && this.Z == y20Var.Z) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.qi4
    public final long h() {
        return hk2.U(this.c0);
    }

    public final int hashCode() {
        return Integer.hashCode(this.Z) + b31.c(this.Y, b31.c(0L, this.X.hashCode() * 31, 31), 31);
    }

    @Override // defpackage.qi4
    public final void i(xf3 xf3Var) {
        rh0 rh0Var = xf3Var.A;
        int round = Math.round(Float.intBitsToFloat((int) (rh0Var.d() >> 32)));
        float f = this.d0;
        b30 b30Var = this.e0;
        int i = this.Z;
        hk1.a0(xf3Var, this.X, this.Y, (round << 32) | (Math.round(Float.intBitsToFloat((int) (rh0Var.d() & 4294967295L))) & 4294967295L), f, b30Var, i, 328);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.X);
        sb.append(", srcOffset=");
        sb.append((Object) a33.d(0L));
        sb.append(", srcSize=");
        sb.append((Object) i33.c(this.Y));
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
        To view partially-correct add '--show-bad-code' argument
    */
    public y20(defpackage.nh r7) {
        /*
            r6 = this;
            android.graphics.Bitmap r0 = r7.a
            int r0 = r0.getWidth()
            android.graphics.Bitmap r1 = r7.a
            int r1 = r1.getHeight()
            long r2 = (long) r0
            r0 = 32
            long r2 = r2 << r0
            long r0 = (long) r1
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            long r0 = r0 | r2
            r6.<init>(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y20.<init>(nh):void");
    }
}
