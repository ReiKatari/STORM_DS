package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vv  reason: default package */
/* loaded from: classes.dex */
public final class vv {
    public final Object a;
    public final vn1 b;
    public final c55 c;

    public vv(Object obj, vn1 vn1Var, c55 c55Var) {
        this.a = obj;
        this.b = vn1Var;
        this.c = c55Var;
    }

    public final boolean equals(Object obj) {
        boolean x;
        if (this != obj) {
            if (obj instanceof vv) {
                vv vvVar = (vv) obj;
                Object obj2 = vvVar.a;
                this.b.getClass();
                Object obj3 = this.a;
                if (obj3 != obj2) {
                    if ((obj3 instanceof vw2) && (obj2 instanceof vw2)) {
                        vw2 vw2Var = (vw2) obj3;
                        vw2 vw2Var2 = (vw2) obj2;
                        if (!b53.x(vw2Var.a, vw2Var2.a) || !vw2Var.b.equals(vw2Var2.b) || !b53.x(vw2Var.e, vw2Var2.e) || vw2Var.f != vw2Var2.f || !b53.x(vw2Var.h, vw2Var2.h) || !b53.x(vw2Var.j, vw2Var2.j) || vw2Var.l != vw2Var2.l || vw2Var.m != vw2Var2.m || vw2Var.n != vw2Var2.n || vw2Var.o != vw2Var2.o || vw2Var.p != vw2Var2.p || vw2Var.q != vw2Var2.q || vw2Var.r != vw2Var2.r || !vw2Var.x.equals(vw2Var2.x) || vw2Var.y != vw2Var2.y || vw2Var.g != vw2Var2.g || !vw2Var.z.equals(vw2Var2.z)) {
                            x = false;
                        }
                    } else {
                        x = b53.x(obj3, obj2);
                    }
                    if (x || !this.c.equals(vvVar.c)) {
                    }
                }
                x = true;
                if (x) {
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
        if (!(obj instanceof vw2)) {
            if (obj != null) {
                i = obj.hashCode();
            }
        } else {
            vw2 vw2Var = (vw2) obj;
            int hashCode = (vw2Var.b.hashCode() + (vw2Var.a.hashCode() * 31)) * 961;
            ow3 ow3Var = vw2Var.e;
            if (ow3Var != null) {
                i = ow3Var.hashCode();
            }
            int c = ej6.c(ej6.c(ej6.c(ej6.c((b31.b((vw2Var.f.hashCode() + ((hashCode + i) * 961)) * 961, 31, vw2Var.h) + Arrays.hashCode(vw2Var.j.A)) * 31, vw2Var.l, 31), vw2Var.m, 31), vw2Var.n, 31), vw2Var.o, 31);
            int hashCode2 = vw2Var.q.hashCode();
            int hashCode3 = vw2Var.r.hashCode();
            int hashCode4 = vw2Var.x.hashCode();
            int hashCode5 = vw2Var.y.hashCode();
            int hashCode6 = vw2Var.g.hashCode();
            i = vw2Var.z.A.hashCode() + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((vw2Var.p.hashCode() + c) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }
        return this.c.hashCode() + (i * 31);
    }
}
