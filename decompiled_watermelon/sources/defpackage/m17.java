package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m17  reason: default package */
/* loaded from: classes.dex */
public final class m17 {
    public static final int d = 8;
    @r06("backgroundId")
    private final String a;
    @r06("backgroundMode")
    private final String b;
    @r06("components")
    private final List<hr4> c;

    public m17(String str, String str2, List<hr4> list) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ m17 e(m17 m17Var, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = m17Var.a;
        }
        if ((i & 2) != 0) {
            str2 = m17Var.b;
        }
        if ((i & 4) != 0) {
            list = m17Var.c;
        }
        return m17Var.d(str, str2, list);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final List<hr4> c() {
        return this.c;
    }

    public final m17 d(String str, String str2, List<hr4> list) {
        str2.getClass();
        return new m17(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m17)) {
            return false;
        }
        m17 m17Var = (m17) obj;
        if (b53.x(this.a, m17Var.a) && b53.x(this.b, m17Var.b) && b53.x(this.c, m17Var.c)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.a;
    }

    public final String g() {
        return this.b;
    }

    public final List<hr4> h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int b = ej6.b(hashCode * 31, 31, this.b);
        List<hr4> list = this.c;
        if (list != null) {
            i = list.hashCode();
        }
        return b + i;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        List<hr4> list = this.c;
        StringBuilder v = b31.v("UILayoutDto35(backgroundId=", str, ", backgroundMode=", str2, ", components=");
        v.append(list);
        v.append(")");
        return v.toString();
    }
}
