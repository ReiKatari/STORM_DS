package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nw  reason: default package */
/* loaded from: classes.dex */
public final class nw {
    public final Object a;
    public final w31 b;
    public final pe5 c;

    public nw(Object obj, w31 w31Var, pe5 pe5Var) {
        this.a = obj;
        this.b = w31Var;
        this.c = pe5Var;
    }

    public final boolean equals(Object obj) {
        boolean k;
        if (this != obj) {
            if (obj instanceof nw) {
                nw nwVar = (nw) obj;
                Object obj2 = nwVar.a;
                this.b.getClass();
                Object obj3 = this.a;
                if (obj3 != obj2) {
                    if ((obj3 instanceof z23) && (obj2 instanceof z23)) {
                        z23 z23Var = (z23) obj3;
                        z23 z23Var2 = (z23) obj2;
                        if (!nb3.k(z23Var.a, z23Var2.a) || !z23Var.b.equals(z23Var2.b) || !nb3.k(z23Var.e, z23Var2.e) || z23Var.f != z23Var2.f || !nb3.k(z23Var.h, z23Var2.h) || !nb3.k(z23Var.j, z23Var2.j) || z23Var.l != z23Var2.l || z23Var.m != z23Var2.m || z23Var.n != z23Var2.n || z23Var.o != z23Var2.o || z23Var.p != z23Var2.p || z23Var.q != z23Var2.q || z23Var.r != z23Var2.r || !z23Var.x.equals(z23Var2.x) || z23Var.y != z23Var2.y || z23Var.g != z23Var2.g || !z23Var.z.equals(z23Var2.z)) {
                            k = false;
                        }
                    } else {
                        k = nb3.k(obj3, obj2);
                    }
                    if (k || !this.c.equals(nwVar.c)) {
                    }
                }
                k = true;
                if (k) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        this.b.getClass();
        Object obj = this.a;
        int i = 0;
        if (!(obj instanceof z23)) {
            if (obj != null) {
                i = obj.hashCode();
            }
        } else {
            z23 z23Var = (z23) obj;
            int hashCode = (z23Var.b.hashCode() + (z23Var.a.hashCode() * 31)) * 961;
            c44 c44Var = z23Var.e;
            if (c44Var != null) {
                i = c44Var.hashCode();
            }
            int e = xg6.e(xg6.e(xg6.e(xg6.e((i61.b((z23Var.f.hashCode() + ((hashCode + i) * 961)) * 961, z23Var.h, 31) + Arrays.hashCode(z23Var.j.A)) * 31, z23Var.l, 31), z23Var.m, 31), z23Var.n, 31), z23Var.o, 31);
            int hashCode2 = z23Var.q.hashCode();
            int hashCode3 = z23Var.r.hashCode();
            int hashCode4 = z23Var.x.hashCode();
            int hashCode5 = z23Var.y.hashCode();
            int hashCode6 = z23Var.g.hashCode();
            i = z23Var.z.A.hashCode() + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((z23Var.p.hashCode() + e) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }
        return this.c.hashCode() + (i * 31);
    }
}
