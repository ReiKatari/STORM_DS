package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ax2  reason: default package */
/* loaded from: classes.dex */
public final class ax2 {
    public static int k;
    public static final jo1 l = new jo1(8);
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final e77 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public ax2(String str, float f, float f2, float f3, float f4, e77 e77Var, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = e77Var;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ax2) {
                ax2 ax2Var = (ax2) obj;
                if (b53.x(this.a, ax2Var.a) && ji1.b(this.b, ax2Var.b) && ji1.b(this.c, ax2Var.c) && this.d == ax2Var.d && this.e == ax2Var.e && this.f.equals(ax2Var.f) && xq0.c(this.g, ax2Var.g) && this.h == ax2Var.h && this.i == ax2Var.i) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int a = ej6.a(this.e, ej6.a(this.d, ej6.a(this.c, ej6.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        int i = xq0.i;
        return Boolean.hashCode(this.i) + wh1.a(this.h, b31.c(this.g, (this.f.hashCode() + a) * 31, 31), 31);
    }
}
