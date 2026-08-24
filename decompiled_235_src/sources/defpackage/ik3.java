package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ik3  reason: default package */
/* loaded from: classes.dex */
public final class ik3 {
    public static final int i = 8;
    @gc6("id")
    private final String a;
    @gc6("name")
    private final String b;
    @gc6("type")
    private final String c;
    @gc6("orientation")
    private final String d;
    @gc6("useCustomOpacity")
    private final boolean e;
    @gc6("opacity")
    private final int f;
    @gc6("layoutVariants")
    private final List<a> g;
    @gc6("target")
    private final String h;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: ik3$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static final int c = 8;
        @gc6("variant")
        private final lf7 a;
        @gc6("layout")
        private final hf7 b;

        public a(lf7 lf7Var, hf7 hf7Var) {
            lf7Var.getClass();
            hf7Var.getClass();
            this.a = lf7Var;
            this.b = hf7Var;
        }

        public static /* synthetic */ a d(a aVar, lf7 lf7Var, hf7 hf7Var, int i, Object obj) {
            if ((i & 1) != 0) {
                lf7Var = aVar.a;
            }
            if ((i & 2) != 0) {
                hf7Var = aVar.b;
            }
            return aVar.c(lf7Var, hf7Var);
        }

        public final lf7 a() {
            return this.a;
        }

        public final hf7 b() {
            return this.b;
        }

        public final a c(lf7 lf7Var, hf7 hf7Var) {
            lf7Var.getClass();
            hf7Var.getClass();
            return new a(lf7Var, hf7Var);
        }

        public final hf7 e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (nb3.k(this.a, aVar.a) && nb3.k(this.b, aVar.b)) {
                return true;
            }
            return false;
        }

        public final lf7 f() {
            return this.a;
        }

        public int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public String toString() {
            lf7 lf7Var = this.a;
            hf7 hf7Var = this.b;
            return "LayoutEntryDto35(variant=" + lf7Var + ", layout=" + hf7Var + ")";
        }
    }

    public ik3(String str, String str2, String str3, String str4, boolean z, int i2, List<a> list, String str5) {
        str3.getClass();
        str4.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = i2;
        this.g = list;
        this.h = str5;
    }

    public static /* synthetic */ ik3 j(ik3 ik3Var, String str, String str2, String str3, String str4, boolean z, int i2, List list, String str5, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = ik3Var.a;
        }
        if ((i3 & 2) != 0) {
            str2 = ik3Var.b;
        }
        if ((i3 & 4) != 0) {
            str3 = ik3Var.c;
        }
        if ((i3 & 8) != 0) {
            str4 = ik3Var.d;
        }
        if ((i3 & 16) != 0) {
            z = ik3Var.e;
        }
        if ((i3 & 32) != 0) {
            i2 = ik3Var.f;
        }
        List<a> list2 = list;
        if ((i3 & 64) != 0) {
            list2 = ik3Var.g;
        }
        if ((i3 & 128) != 0) {
            str5 = ik3Var.h;
        }
        List list3 = list2;
        String str6 = str5;
        boolean z2 = z;
        int i4 = i2;
        return ik3Var.i(str, str2, str3, str4, z2, i4, list3, str6);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik3)) {
            return false;
        }
        ik3 ik3Var = (ik3) obj;
        if (nb3.k(this.a, ik3Var.a) && nb3.k(this.b, ik3Var.b) && nb3.k(this.c, ik3Var.c) && nb3.k(this.d, ik3Var.d) && this.e == ik3Var.e && this.f == ik3Var.f && nb3.k(this.g, ik3Var.g) && nb3.k(this.h, ik3Var.h)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f;
    }

    public final List<a> g() {
        return this.g;
    }

    public final String h() {
        return this.h;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.a;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = hashCode * 31;
        String str2 = this.b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int b = i61.b(lb1.a(this.f, xg6.e(xg6.d(xg6.d((i3 + hashCode2) * 31, 31, this.c), 31, this.d), this.e, 31), 31), this.g, 31);
        String str3 = this.h;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return b + i2;
    }

    public final ik3 i(String str, String str2, String str3, String str4, boolean z, int i2, List<a> list, String str5) {
        str3.getClass();
        str4.getClass();
        list.getClass();
        return new ik3(str, str2, str3, str4, z, i2, list, str5);
    }

    public final String k() {
        return this.a;
    }

    public final List<a> l() {
        return this.g;
    }

    public final String m() {
        return this.b;
    }

    public final int n() {
        return this.f;
    }

    public final String o() {
        return this.d;
    }

    public final String p() {
        return this.h;
    }

    public final String q() {
        return this.c;
    }

    public final boolean r() {
        return this.e;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        boolean z = this.e;
        int i2 = this.f;
        List<a> list = this.g;
        String str5 = this.h;
        StringBuilder u = i61.u("LayoutConfigurationDto35(id=", str, ", name=", str2, ", type=");
        i61.B(u, str3, ", orientation=", str4, ", useCustomOpacity=");
        u.append(z);
        u.append(", opacity=");
        u.append(i2);
        u.append(", layoutVariants=");
        u.append(list);
        u.append(", target=");
        u.append(str5);
        u.append(")");
        return u.toString();
    }

    public /* synthetic */ ik3(String str, String str2, String str3, String str4, boolean z, int i2, List list, String str5, int i3, id1 id1Var) {
        this(str, str2, str3, str4, z, i2, list, (i3 & 128) != 0 ? null : str5);
    }
}
