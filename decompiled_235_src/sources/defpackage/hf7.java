package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hf7  reason: default package */
/* loaded from: classes.dex */
public final class hf7 {
    public static final int d = 8;
    @gc6("backgroundId")
    private final String a;
    @gc6("backgroundMode")
    private final String b;
    @gc6("components")
    private final List<k05> c;

    public hf7(String str, String str2, List<k05> list) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ hf7 e(hf7 hf7Var, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hf7Var.a;
        }
        if ((i & 2) != 0) {
            str2 = hf7Var.b;
        }
        if ((i & 4) != 0) {
            list = hf7Var.c;
        }
        return hf7Var.d(str, str2, list);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final List<k05> c() {
        return this.c;
    }

    public final hf7 d(String str, String str2, List<k05> list) {
        str2.getClass();
        return new hf7(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf7)) {
            return false;
        }
        hf7 hf7Var = (hf7) obj;
        if (nb3.k(this.a, hf7Var.a) && nb3.k(this.b, hf7Var.b) && nb3.k(this.c, hf7Var.c)) {
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

    public final List<k05> h() {
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
        int d2 = xg6.d(hashCode * 31, 31, this.b);
        List<k05> list = this.c;
        if (list != null) {
            i = list.hashCode();
        }
        return d2 + i;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        List<k05> list = this.c;
        StringBuilder u = i61.u("UILayoutDto35(backgroundId=", str, ", backgroundMode=", str2, ", components=");
        u.append(list);
        u.append(")");
        return u.toString();
    }
}
