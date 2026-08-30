package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ri5  reason: default package */
/* loaded from: classes.dex */
public final class ri5 {
    public final List a;
    public final List b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final tp5 f;
    public final bm5 g;
    public final qb6 h;
    public final rb6 i;
    public final List j;
    public final Map k;

    public ri5(List list, List list2, boolean z, boolean z2, boolean z3, tp5 tp5Var, bm5 bm5Var, qb6 qb6Var, rb6 rb6Var, List list3, Map map) {
        tp5Var.getClass();
        bm5Var.getClass();
        qb6Var.getClass();
        rb6Var.getClass();
        list3.getClass();
        map.getClass();
        this.a = list;
        this.b = list2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = tp5Var;
        this.g = bm5Var;
        this.h = qb6Var;
        this.i = rb6Var;
        this.j = list3;
        this.k = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ri5) {
                ri5 ri5Var = (ri5) obj;
                if (!this.a.equals(ri5Var.a) || !this.b.equals(ri5Var.b) || this.c != ri5Var.c || this.d != ri5Var.d || this.e != ri5Var.e || this.f != ri5Var.f || this.g != ri5Var.g || this.h != ri5Var.h || this.i != ri5Var.i || !b53.x(this.j, ri5Var.j) || !b53.x(this.k, ri5Var.k)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int c = ej6.c(ej6.c(ej6.c(b31.b(this.a.hashCode() * 31, 31, this.b), this.c, 31), this.d, 31), this.e, 31);
        int hashCode = this.g.hashCode();
        int hashCode2 = this.h.hashCode();
        return this.k.hashCode() + b31.b((this.i.hashCode() + ((hashCode2 + ((hashCode + ((this.f.hashCode() + c) * 31)) * 31)) * 31)) * 31, 31, this.j);
    }

    public final String toString() {
        return "RomBrowserUiState(entries=" + this.a + ", breadcrumbs=" + this.b + ", canNavigateUp=" + this.c + ", isSearchActive=" + this.d + ", isAtVirtualRoot=" + this.e + ", viewMode=" + this.f + ", filter=" + this.g + ", sortingMode=" + this.h + ", sortingOrder=" + this.i + ", continuePlaying=" + this.j + ", alphabetIndex=" + this.k + ")";
    }
}
