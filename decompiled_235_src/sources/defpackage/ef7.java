package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ef7  reason: default package */
/* loaded from: classes.dex */
public final class ef7 {
    public static final int d = 8;
    @gc6("a")
    private final String a;
    @gc6("b")
    private final String b;
    @gc6("c")
    private final List<i05> c;

    public ef7(String str, String str2, List<i05> list) {
        str2.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ef7 e(ef7 ef7Var, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ef7Var.a;
        }
        if ((i & 2) != 0) {
            str2 = ef7Var.b;
        }
        if ((i & 4) != 0) {
            list = ef7Var.c;
        }
        return ef7Var.d(str, str2, list);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final List<i05> c() {
        return this.c;
    }

    public final ef7 d(String str, String str2, List<i05> list) {
        str2.getClass();
        list.getClass();
        return new ef7(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef7)) {
            return false;
        }
        ef7 ef7Var = (ef7) obj;
        if (nb3.k(this.a, ef7Var.a) && nb3.k(this.b, ef7Var.b) && nb3.k(this.c, ef7Var.c)) {
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

    public final List<i05> h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.c.hashCode() + xg6.d(hashCode * 31, 31, this.b);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        List<i05> list = this.c;
        StringBuilder u = i61.u("UILayout25(backgroundId=", str, ", backgroundMode=", str2, ", components=");
        u.append(list);
        u.append(")");
        return u.toString();
    }
}
