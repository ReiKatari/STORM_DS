package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v57  reason: default package */
/* loaded from: classes.dex */
public final class v57 {
    public final p94 a;
    public u57 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public float[] g;

    public v57() {
        p94 p94Var = h93.a;
        this.a = new p94();
        this.c = -1L;
        this.d = 0L;
        this.e = 0L;
    }

    public final void a(u57 u57Var, long j, long j2, float[] fArr, long j3) {
        boolean z;
        long j4 = u57Var.g;
        if (j3 - j4 <= 0 && j4 != Long.MIN_VALUE) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            u57Var.g = j3;
            u57Var.a(u57Var.e, u57Var.f, j, j2, fArr);
        }
    }

    public final boolean b(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (!i93.a(j2, this.d)) {
            this.d = j2;
            z = true;
        } else {
            z = false;
        }
        if (!i93.a(j, this.e)) {
            this.e = j;
            z = true;
        }
        if (fArr != null) {
            this.g = fArr;
            z = true;
        }
        long j3 = (i << 32) | (i2 & 4294967295L);
        if (j3 != this.f) {
            this.f = j3;
            return true;
        }
        return z;
    }
}
