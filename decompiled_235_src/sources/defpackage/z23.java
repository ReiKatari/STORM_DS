package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z23  reason: default package */
/* loaded from: classes.dex */
public final class z23 {
    public final rg1 A;
    public final we1 B;
    public final Context a;
    public final Object b;
    public final iz6 c;
    public final y23 d;
    public final c44 e;
    public final Bitmap.Config f;
    public final n05 g;
    public final List h;
    public final x97 i;
    public final yw2 j;
    public final ty6 k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final ra0 p;
    public final ra0 q;
    public final ra0 r;
    public final n61 s;
    public final n61 t;
    public final n61 u;
    public final n61 v;
    public final ut3 w;
    public final fj6 x;
    public final y56 y;
    public final ps4 z;

    public z23(Context context, Object obj, iz6 iz6Var, y23 y23Var, c44 c44Var, Bitmap.Config config, n05 n05Var, List list, x97 x97Var, yw2 yw2Var, ty6 ty6Var, boolean z, boolean z2, boolean z3, boolean z4, ra0 ra0Var, ra0 ra0Var2, ra0 ra0Var3, n61 n61Var, n61 n61Var2, n61 n61Var3, n61 n61Var4, ut3 ut3Var, fj6 fj6Var, y56 y56Var, ps4 ps4Var, rg1 rg1Var, we1 we1Var) {
        this.a = context;
        this.b = obj;
        this.c = iz6Var;
        this.d = y23Var;
        this.e = c44Var;
        this.f = config;
        this.g = n05Var;
        this.h = list;
        this.i = x97Var;
        this.j = yw2Var;
        this.k = ty6Var;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = ra0Var;
        this.q = ra0Var2;
        this.r = ra0Var3;
        this.s = n61Var;
        this.t = n61Var2;
        this.u = n61Var3;
        this.v = n61Var4;
        this.w = ut3Var;
        this.x = fj6Var;
        this.y = y56Var;
        this.z = ps4Var;
        this.A = rg1Var;
        this.B = we1Var;
    }

    public static x23 a(z23 z23Var) {
        Context context = z23Var.a;
        z23Var.getClass();
        return new x23(z23Var, context);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof z23) {
                z23 z23Var = (z23) obj;
                if (nb3.k(this.a, z23Var.a) && this.b.equals(z23Var.b) && nb3.k(this.c, z23Var.c) && nb3.k(this.d, z23Var.d) && nb3.k(this.e, z23Var.e) && this.f == z23Var.f && this.g == z23Var.g && nb3.k(this.h, z23Var.h) && nb3.k(this.i, z23Var.i) && nb3.k(this.j, z23Var.j) && this.k.equals(z23Var.k) && this.l == z23Var.l && this.m == z23Var.m && this.n == z23Var.n && this.o == z23Var.o && this.p == z23Var.p && this.q == z23Var.q && this.r == z23Var.r && nb3.k(this.s, z23Var.s) && nb3.k(this.t, z23Var.t) && nb3.k(this.u, z23Var.u) && nb3.k(this.v, z23Var.v) && nb3.k(this.w, z23Var.w) && this.x.equals(z23Var.x) && this.y == z23Var.y && this.z.equals(z23Var.z) && this.A.equals(z23Var.A) && nb3.k(this.B, z23Var.B)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i3 = 0;
        iz6 iz6Var = this.c;
        if (iz6Var != null) {
            i = iz6Var.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        y23 y23Var = this.d;
        if (y23Var != null) {
            i2 = y23Var.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        c44 c44Var = this.e;
        if (c44Var != null) {
            i3 = c44Var.hashCode();
        }
        int e = xg6.e(xg6.e(xg6.e(xg6.e((this.k.a.hashCode() + ((((this.i.hashCode() + i61.b((this.g.hashCode() + ((this.f.hashCode() + ((i5 + i3) * 961)) * 961)) * 29791, this.h, 31)) * 31) + Arrays.hashCode(this.j.A)) * 31)) * 31, this.l, 31), this.m, 31), this.n, 31), this.o, 31);
        int hashCode2 = this.q.hashCode();
        int hashCode3 = this.r.hashCode();
        int hashCode4 = this.s.hashCode();
        int hashCode5 = this.t.hashCode();
        int hashCode6 = this.u.hashCode();
        int hashCode7 = this.v.hashCode();
        int hashCode8 = this.w.hashCode();
        int hashCode9 = this.x.hashCode();
        int hashCode10 = this.y.hashCode();
        int hashCode11 = this.z.A.hashCode();
        return this.B.hashCode() + ((this.A.hashCode() + ((hashCode11 + ((hashCode10 + ((hashCode9 + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((this.p.hashCode() + e) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * (-1807454463))) * 31);
    }
}
