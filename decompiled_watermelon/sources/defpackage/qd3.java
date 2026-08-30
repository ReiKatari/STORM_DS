package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qd3  reason: default package */
/* loaded from: classes.dex */
public final class qd3 {
    public static final int i = 8;
    @r06("id")
    private final String a;
    @r06("name")
    private final String b;
    @r06("type")
    private final String c;
    @r06("orientation")
    private final String d;
    @r06("useCustomOpacity")
    private final boolean e;
    @r06("opacity")
    private final int f;
    @r06("layoutVariants")
    private final List<a> g;
    @r06("target")
    private final String h;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: qd3$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static final int c = 8;
        @r06("variant")
        private final q17 a;
        @r06("layout")
        private final m17 b;

        public a(q17 q17Var, m17 m17Var) {
            q17Var.getClass();
            m17Var.getClass();
            this.a = q17Var;
            this.b = m17Var;
        }

        public static /* synthetic */ a d(a aVar, q17 q17Var, m17 m17Var, int i, Object obj) {
            if ((i & 1) != 0) {
                q17Var = aVar.a;
            }
            if ((i & 2) != 0) {
                m17Var = aVar.b;
            }
            return aVar.c(q17Var, m17Var);
        }

        public final q17 a() {
            return this.a;
        }

        public final m17 b() {
            return this.b;
        }

        public final a c(q17 q17Var, m17 m17Var) {
            q17Var.getClass();
            m17Var.getClass();
            return new a(q17Var, m17Var);
        }

        public final m17 e() {
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
            if (b53.x(this.a, aVar.a) && b53.x(this.b, aVar.b)) {
                return true;
            }
            return false;
        }

        public final q17 f() {
            return this.a;
        }

        public int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public String toString() {
            q17 q17Var = this.a;
            m17 m17Var = this.b;
            return "LayoutEntryDto35(variant=" + q17Var + ", layout=" + m17Var + ")";
        }
    }

    public qd3(String str, String str2, String str3, String str4, boolean z, int i2, List<a> list, String str5) {
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

    public static /* synthetic */ qd3 j(qd3 qd3Var, String str, String str2, String str3, String str4, boolean z, int i2, List list, String str5, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = qd3Var.a;
        }
        if ((i3 & 2) != 0) {
            str2 = qd3Var.b;
        }
        if ((i3 & 4) != 0) {
            str3 = qd3Var.c;
        }
        if ((i3 & 8) != 0) {
            str4 = qd3Var.d;
        }
        if ((i3 & 16) != 0) {
            z = qd3Var.e;
        }
        if ((i3 & 32) != 0) {
            i2 = qd3Var.f;
        }
        List<a> list2 = list;
        if ((i3 & 64) != 0) {
            list2 = qd3Var.g;
        }
        if ((i3 & 128) != 0) {
            str5 = qd3Var.h;
        }
        List list3 = list2;
        String str6 = str5;
        boolean z2 = z;
        int i4 = i2;
        return qd3Var.i(str, str2, str3, str4, z2, i4, list3, str6);
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
        if (!(obj instanceof qd3)) {
            return false;
        }
        qd3 qd3Var = (qd3) obj;
        if (b53.x(this.a, qd3Var.a) && b53.x(this.b, qd3Var.b) && b53.x(this.c, qd3Var.c) && b53.x(this.d, qd3Var.d) && this.e == qd3Var.e && this.f == qd3Var.f && b53.x(this.g, qd3Var.g) && b53.x(this.h, qd3Var.h)) {
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
        int b = b31.b(wh1.a(this.f, ej6.c(ej6.b(ej6.b((i3 + hashCode2) * 31, 31, this.c), 31, this.d), this.e, 31), 31), 31, this.g);
        String str3 = this.h;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return b + i2;
    }

    public final qd3 i(String str, String str2, String str3, String str4, boolean z, int i2, List<a> list, String str5) {
        str3.getClass();
        str4.getClass();
        list.getClass();
        return new qd3(str, str2, str3, str4, z, i2, list, str5);
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
        StringBuilder v = b31.v("LayoutConfigurationDto35(id=", str, ", name=", str2, ", type=");
        b31.B(v, str3, ", orientation=", str4, ", useCustomOpacity=");
        v.append(z);
        v.append(", opacity=");
        v.append(i2);
        v.append(", layoutVariants=");
        v.append(list);
        v.append(", target=");
        v.append(str5);
        v.append(")");
        return v.toString();
    }

    public /* synthetic */ qd3(String str, String str2, String str3, String str4, boolean z, int i2, List list, String str5, int i3, n91 n91Var) {
        this(str, str2, str3, str4, z, i2, list, (i3 & 128) != 0 ? null : str5);
    }
}
