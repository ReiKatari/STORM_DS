package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e33  reason: default package */
/* loaded from: classes.dex */
public final class e33 {
    public static int k;
    public static final x31 l = new x31(10);
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final dl7 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public e33(String str, float f, float f2, float f3, float f4, dl7 dl7Var, long j, int i, boolean z) {
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
        this.f = dl7Var;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e33) {
                e33 e33Var = (e33) obj;
                if (nb3.k(this.a, e33Var.a) && om1.b(this.b, e33Var.b) && om1.b(this.c, e33Var.c) && this.d == e33Var.d && this.e == e33Var.e && this.f.equals(e33Var.f) && kt0.d(this.g, e33Var.g) && this.h == e33Var.h && this.i == e33Var.i) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int a = xg6.a(this.e, xg6.a(this.d, xg6.a(this.c, xg6.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        int i = kt0.i;
        return Boolean.hashCode(this.i) + lb1.a(this.h, i61.c(this.g, (this.f.hashCode() + a) * 31, 31), 31);
    }
}
