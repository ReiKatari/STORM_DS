package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vw2  reason: default package */
/* loaded from: classes.dex */
public final class vw2 {
    public final qc1 A;
    public final ab1 B;
    public final Context a;
    public final Object b;
    public final ym6 c;
    public final uw2 d;
    public final ow3 e;
    public final Bitmap.Config f;
    public final kr4 g;
    public final List h;
    public final bx6 i;
    public final xq2 j;
    public final jm6 k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final j80 p;
    public final j80 q;
    public final j80 r;
    public final g31 s;
    public final g31 t;
    public final g31 u;
    public final g31 v;
    public final rm3 w;
    public final q76 x;
    public final uu5 y;
    public final nj4 z;

    public vw2(Context context, Object obj, ym6 ym6Var, uw2 uw2Var, ow3 ow3Var, Bitmap.Config config, kr4 kr4Var, List list, bx6 bx6Var, xq2 xq2Var, jm6 jm6Var, boolean z, boolean z2, boolean z3, boolean z4, j80 j80Var, j80 j80Var2, j80 j80Var3, g31 g31Var, g31 g31Var2, g31 g31Var3, g31 g31Var4, rm3 rm3Var, q76 q76Var, uu5 uu5Var, nj4 nj4Var, qc1 qc1Var, ab1 ab1Var) {
        this.a = context;
        this.b = obj;
        this.c = ym6Var;
        this.d = uw2Var;
        this.e = ow3Var;
        this.f = config;
        this.g = kr4Var;
        this.h = list;
        this.i = bx6Var;
        this.j = xq2Var;
        this.k = jm6Var;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = j80Var;
        this.q = j80Var2;
        this.r = j80Var3;
        this.s = g31Var;
        this.t = g31Var2;
        this.u = g31Var3;
        this.v = g31Var4;
        this.w = rm3Var;
        this.x = q76Var;
        this.y = uu5Var;
        this.z = nj4Var;
        this.A = qc1Var;
        this.B = ab1Var;
    }

    public static tw2 a(vw2 vw2Var) {
        Context context = vw2Var.a;
        vw2Var.getClass();
        return new tw2(vw2Var, context);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vw2) {
                vw2 vw2Var = (vw2) obj;
                if (b53.x(this.a, vw2Var.a) && this.b.equals(vw2Var.b) && b53.x(this.c, vw2Var.c) && b53.x(this.d, vw2Var.d) && b53.x(this.e, vw2Var.e) && this.f == vw2Var.f && this.g == vw2Var.g && b53.x(this.h, vw2Var.h) && b53.x(this.i, vw2Var.i) && b53.x(this.j, vw2Var.j) && this.k.equals(vw2Var.k) && this.l == vw2Var.l && this.m == vw2Var.m && this.n == vw2Var.n && this.o == vw2Var.o && this.p == vw2Var.p && this.q == vw2Var.q && this.r == vw2Var.r && b53.x(this.s, vw2Var.s) && b53.x(this.t, vw2Var.t) && b53.x(this.u, vw2Var.u) && b53.x(this.v, vw2Var.v) && b53.x(this.w, vw2Var.w) && this.x.equals(vw2Var.x) && this.y == vw2Var.y && this.z.equals(vw2Var.z) && this.A.equals(vw2Var.A) && b53.x(this.B, vw2Var.B)) {
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
        ym6 ym6Var = this.c;
        if (ym6Var != null) {
            i = ym6Var.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        uw2 uw2Var = this.d;
        if (uw2Var != null) {
            i2 = uw2Var.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        ow3 ow3Var = this.e;
        if (ow3Var != null) {
            i3 = ow3Var.hashCode();
        }
        int c = ej6.c(ej6.c(ej6.c(ej6.c((this.k.a.hashCode() + ((((this.i.hashCode() + b31.b((this.g.hashCode() + ((this.f.hashCode() + ((i5 + i3) * 961)) * 961)) * 29791, 31, this.h)) * 31) + Arrays.hashCode(this.j.A)) * 31)) * 31, this.l, 31), this.m, 31), this.n, 31), this.o, 31);
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
        return this.B.hashCode() + ((this.A.hashCode() + ((hashCode11 + ((hashCode10 + ((hashCode9 + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((this.p.hashCode() + c) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * (-1807454463))) * 31);
    }
}
