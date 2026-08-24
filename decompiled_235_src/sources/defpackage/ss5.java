package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ss5  reason: default package */
/* loaded from: classes.dex */
public final class ss5 {
    public final List a;
    public final List b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final n06 f;
    public final qw5 g;
    public final gn6 h;
    public final hn6 i;
    public final List j;
    public final Map k;

    public ss5(List list, List list2, boolean z, boolean z2, boolean z3, n06 n06Var, qw5 qw5Var, gn6 gn6Var, hn6 hn6Var, List list3, Map map) {
        n06Var.getClass();
        qw5Var.getClass();
        gn6Var.getClass();
        hn6Var.getClass();
        list3.getClass();
        map.getClass();
        this.a = list;
        this.b = list2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = n06Var;
        this.g = qw5Var;
        this.h = gn6Var;
        this.i = hn6Var;
        this.j = list3;
        this.k = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ss5) {
                ss5 ss5Var = (ss5) obj;
                if (!this.a.equals(ss5Var.a) || !this.b.equals(ss5Var.b) || this.c != ss5Var.c || this.d != ss5Var.d || this.e != ss5Var.e || this.f != ss5Var.f || this.g != ss5Var.g || this.h != ss5Var.h || this.i != ss5Var.i || !nb3.k(this.j, ss5Var.j) || !nb3.k(this.k, ss5Var.k)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int e = xg6.e(xg6.e(xg6.e(i61.b(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31);
        int hashCode = this.g.hashCode();
        int hashCode2 = this.h.hashCode();
        return this.k.hashCode() + i61.b((this.i.hashCode() + ((hashCode2 + ((hashCode + ((this.f.hashCode() + e) * 31)) * 31)) * 31)) * 31, this.j, 31);
    }

    public final String toString() {
        return "RomBrowserUiState(entries=" + this.a + ", breadcrumbs=" + this.b + ", canNavigateUp=" + this.c + ", isSearchActive=" + this.d + ", isAtVirtualRoot=" + this.e + ", viewMode=" + this.f + ", filter=" + this.g + ", sortingMode=" + this.h + ", sortingOrder=" + this.i + ", continuePlaying=" + this.j + ", alphabetIndex=" + this.k + ")";
    }
}
