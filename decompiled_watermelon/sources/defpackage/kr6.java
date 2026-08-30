package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kr6  reason: default package */
/* loaded from: classes.dex */
public final class kr6 {
    public final to a;
    public final ds6 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final od1 g;
    public final sd3 h;
    public final od2 i;
    public final long j;

    public kr6(to toVar, ds6 ds6Var, List list, int i, boolean z, int i2, od1 od1Var, sd3 sd3Var, od2 od2Var, long j) {
        this.a = toVar;
        this.b = ds6Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = od1Var;
        this.h = sd3Var;
        this.i = od2Var;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kr6) {
                kr6 kr6Var = (kr6) obj;
                if (b53.x(this.a, kr6Var.a) && b53.x(this.b, kr6Var.b) && b53.x(this.c, kr6Var.c) && this.d == kr6Var.d && this.e == kr6Var.e && this.f == kr6Var.f && b53.x(this.g, kr6Var.g) && this.h == kr6Var.h && b53.x(this.i, kr6Var.i) && lz0.b(this.j, kr6Var.j)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int a = wh1.a(this.f, ej6.c((b31.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c) + this.d) * 31, this.e, 31), 31);
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
        sb.append((Object) lz0.k(this.j));
        sb.append(')');
        return sb.toString();
    }
}
