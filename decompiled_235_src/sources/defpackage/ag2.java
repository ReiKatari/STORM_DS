package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ag2  reason: default package */
/* loaded from: classes.dex */
public final class ag2 {
    public final gg2 a;
    public final long b;
    public final int c;
    public final int d;

    public ag2(gg2 gg2Var, long j, int i, int i2) {
        this.a = gg2Var;
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yf2 a(zf2 zf2Var, boolean z, int i, int i2, int i3, int i4) {
        yf2 yf2Var;
        x24 x24Var;
        d93 d93Var;
        dx4 dx4Var;
        if (zf2Var.B) {
            gg2 gg2Var = this.a;
            int i5 = fg2.a[gg2Var.a.ordinal()];
            boolean z2 = true;
            if (i5 != 1 && i5 != 2) {
                if (i5 != 3 && i5 != 4) {
                    i.d();
                    return null;
                }
                if (z) {
                    x24Var = gg2Var.b;
                    d93Var = gg2Var.f;
                    dx4Var = gg2Var.c;
                } else {
                    if (i >= -1 && i2 >= 0) {
                        x24Var = gg2Var.d;
                    } else {
                        x24Var = null;
                    }
                    d93Var = gg2Var.g;
                    dx4Var = gg2Var.e;
                }
                if (x24Var != null) {
                    d93Var.getClass();
                    yf2Var = new yf2(x24Var, dx4Var, d93Var.a);
                    if (yf2Var != null) {
                        if (i < 0 || (i4 != 0 && (i3 - ((int) (yf2Var.c >> 32)) < 0 || i4 >= Integer.MAX_VALUE))) {
                            z2 = false;
                        }
                        yf2Var.d = z2;
                        return yf2Var;
                    }
                }
            }
            yf2Var = null;
            if (yf2Var != null) {
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
        if ((((int) (r22 >> 32)) - ((int) (r5 >> 32))) < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zf2 b(boolean z, int i, long j, d93 d93Var, int i2, int i3, int i4, boolean z2, boolean z3) {
        long j2;
        d93 a;
        int i5 = i3 + i4;
        if (d93Var == null) {
            return new zf2(true, true);
        }
        long j3 = d93Var.a;
        gg2 gg2Var = this.a;
        if (gg2Var.a != cg2.Visible && (i2 >= Integer.MAX_VALUE || ((int) (j & 4294967295L)) - ((int) (j3 & 4294967295L)) < 0)) {
            return new zf2(true, true);
        }
        int i6 = this.c;
        int i7 = this.d;
        long j4 = this.b;
        if (i == 0) {
            j2 = 4294967295L;
        } else {
            if (i >= Integer.MAX_VALUE) {
                j2 = 4294967295L;
            } else {
                j2 = 4294967295L;
            }
            if (z2) {
                return new zf2(true, true);
            }
            return new zf2(true, b(z, 0, d93.a(q21.h(j4), (((int) (j & j2)) - i7) - i4), new d93(d93.a(((int) (j3 >> 32)) - i6, (int) (j3 & j2))), i2 + 1, i5, 0, true, false).B);
        }
        int i8 = (int) (j3 & j2);
        int max = Math.max(i4, i8) + i3;
        if (z3) {
            a = null;
        } else {
            a = gg2Var.a(i2, z, max);
        }
        if (a != null && (i + 1 >= Integer.MAX_VALUE || ((((int) (j >> 32)) - ((int) (j3 >> 32))) - i6) - ((int) (a.a >> 32)) < 0)) {
            if (z3) {
                return new zf2(true, true);
            }
            boolean z4 = b(false, 0, d93.a(q21.h(j4), (((int) (j & j2)) - i7) - Math.max(i4, i8)), a, i2 + 1, max, 0, true, true).B;
            return new zf2(z4, z4);
        }
        return new zf2(false, false);
    }
}
