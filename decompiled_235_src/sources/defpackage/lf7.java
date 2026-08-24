package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lf7  reason: default package */
/* loaded from: classes.dex */
public final class lf7 {
    public static final int d = 8;
    @gc6("uiSize")
    private final ny4 a;
    @gc6("orientation")
    private final String b;
    @gc6("folds")
    private final List<y66> c;

    public lf7(ny4 ny4Var, String str, List<y66> list) {
        ny4Var.getClass();
        str.getClass();
        list.getClass();
        this.a = ny4Var;
        this.b = str;
        this.c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ lf7 e(lf7 lf7Var, ny4 ny4Var, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            ny4Var = lf7Var.a;
        }
        if ((i & 2) != 0) {
            str = lf7Var.b;
        }
        if ((i & 4) != 0) {
            list = lf7Var.c;
        }
        return lf7Var.d(ny4Var, str, list);
    }

    public final ny4 a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final List<y66> c() {
        return this.c;
    }

    public final lf7 d(ny4 ny4Var, String str, List<y66> list) {
        ny4Var.getClass();
        str.getClass();
        list.getClass();
        return new lf7(ny4Var, str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf7)) {
            return false;
        }
        lf7 lf7Var = (lf7) obj;
        if (nb3.k(this.a, lf7Var.a) && nb3.k(this.b, lf7Var.b) && nb3.k(this.c, lf7Var.c)) {
            return true;
        }
        return false;
    }

    public final List<y66> f() {
        return this.c;
    }

    public final String g() {
        return this.b;
    }

    public final ny4 h() {
        return this.a;
    }

    public int hashCode() {
        return this.c.hashCode() + xg6.d(this.a.hashCode() * 31, 31, this.b);
    }

    public String toString() {
        ny4 ny4Var = this.a;
        String str = this.b;
        List<y66> list = this.c;
        return "UILayoutVariantDto35(uiSize=" + ny4Var + ", orientation=" + str + ", folds=" + list + ")";
    }
}
