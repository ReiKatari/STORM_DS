package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kf7  reason: default package */
/* loaded from: classes.dex */
public final class kf7 {
    @gc6("uiSize")
    private final ny4 a;
    @gc6("insets")
    private final i83 b;
    @gc6("orientation")
    private final String c;
    @gc6("folds")
    private final List<y66> d;
    @gc6("displays")
    private final pk3 e;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: kf7$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public kf7(ny4 ny4Var, i83 i83Var, String str, ArrayList arrayList, pk3 pk3Var) {
        str.getClass();
        this.a = ny4Var;
        this.b = i83Var;
        this.c = str;
        this.d = arrayList;
        this.e = pk3Var;
    }

    public final jf7 a() {
        my4 a2 = this.a.a();
        d83 a3 = this.b.a();
        ko4 valueOf = ko4.valueOf(this.c);
        List<y66> list = this.d;
        ArrayList arrayList = new ArrayList(ht0.v0(list, 10));
        for (y66 y66Var : list) {
            arrayList.add(new x66((ko4) jw2.o(y66Var.a, ko4.values()), (w66) jw2.o(y66Var.b, w66.values()), y66Var.c.a()));
        }
        return new jf7(a2, a3, valueOf, arrayList, this.e.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf7)) {
            return false;
        }
        kf7 kf7Var = (kf7) obj;
        if (nb3.k(this.a, kf7Var.a) && nb3.k(this.b, kf7Var.b) && nb3.k(this.c, kf7Var.c) && nb3.k(this.d, kf7Var.d) && nb3.k(this.e, kf7Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + i61.b(xg6.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), this.d, 31);
    }

    public final String toString() {
        ny4 ny4Var = this.a;
        i83 i83Var = this.b;
        String str = this.c;
        List<y66> list = this.d;
        pk3 pk3Var = this.e;
        return "UILayoutVariantDto(uiSize=" + ny4Var + ", insets=" + i83Var + ", orientation=" + str + ", folds=" + list + ", displays=" + pk3Var + ")";
    }
}
