package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z37  reason: default package */
/* loaded from: classes.dex */
public final class z37 {
    public final fp a;
    public final s47 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final qh1 g;
    public final kk3 h;
    public final ki2 i;
    public final long j;

    public z37(fp fpVar, s47 s47Var, List list, int i, boolean z, int i2, qh1 qh1Var, kk3 kk3Var, ki2 ki2Var, long j) {
        this.a = fpVar;
        this.b = s47Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = qh1Var;
        this.h = kk3Var;
        this.i = ki2Var;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof z37) {
                z37 z37Var = (z37) obj;
                if (nb3.k(this.a, z37Var.a) && nb3.k(this.b, z37Var.b) && nb3.k(this.c, z37Var.c) && this.d == z37Var.d && this.e == z37Var.e && this.f == z37Var.f && nb3.k(this.g, z37Var.g) && this.h == z37Var.h && nb3.k(this.i, z37Var.i) && q21.b(this.j, z37Var.j)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int a = lb1.a(this.f, xg6.e((i61.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31) + this.d) * 31, this.e, 31), 31);
        int hashCode = this.h.hashCode();
        int hashCode2 = this.i.hashCode();
        return Long.hashCode(this.j) + ((hashCode2 + ((hashCode + ((this.g.hashCode() + a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", placeholders=");
        sb.append(this.c);
        sb.append(", maxLines=");
        sb.append(this.d);
        sb.append(", softWrap=");
        sb.append(this.e);
        sb.append(", overflow=");
        int i = this.f;
        if (i == 1) {
            str = "Clip";
        } else if (i == 2) {
            str = "Ellipsis";
        } else if (i == 5) {
            str = "MiddleEllipsis";
        } else if (i == 3) {
            str = "Visible";
        } else if (i == 4) {
            str = "StartEllipsis";
        } else {
            str = "Invalid";
        }
        sb.append((Object) str);
        sb.append(", density=");
        sb.append(this.g);
        sb.append(", layoutDirection=");
        sb.append(this.h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.i);
        sb.append(", constraints=");
        sb.append((Object) q21.k(this.j));
        sb.append(')');
        return sb.toString();
    }
}
