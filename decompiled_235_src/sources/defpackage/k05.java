package defpackage;

import me.magnum.melonds.domain.model.Rect;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k05  reason: default package */
/* loaded from: classes.dex */
public final class k05 {
    @gc6("rect")
    private final pf5 a;
    @gc6("component")
    private final String b;
    @gc6("alpha")
    private final Float c;
    @gc6("onTop")
    private final Boolean d;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: k05$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public k05(pf5 pf5Var, String str, Float f, Boolean bool) {
        str.getClass();
        this.a = pf5Var;
        this.b = str;
        this.c = f;
        this.d = bool;
    }

    public final j05 a() {
        float f;
        boolean z;
        Rect a2 = this.a.a();
        nj3 nj3Var = (nj3) jw2.o(this.b, nj3.values());
        Float f2 = this.c;
        if (f2 != null) {
            f = f2.floatValue();
        } else {
            f = 1.0f;
        }
        Boolean bool = this.d;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        return new j05(a2, nj3Var, f, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k05)) {
            return false;
        }
        k05 k05Var = (k05) obj;
        if (nb3.k(this.a, k05Var.a) && nb3.k(this.b, k05Var.b) && nb3.k(this.c, k05Var.c) && nb3.k(this.d, k05Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int d = xg6.d(this.a.hashCode() * 31, 31, this.b);
        Float f = this.c;
        int i = 0;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        int i2 = (d + hashCode) * 31;
        Boolean bool = this.d;
        if (bool != null) {
            i = bool.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        pf5 pf5Var = this.a;
        String str = this.b;
        Float f = this.c;
        Boolean bool = this.d;
        return "PositionedLayoutComponentDto(rect=" + pf5Var + ", component=" + str + ", alpha=" + f + ", onTop=" + bool + ")";
    }
}
