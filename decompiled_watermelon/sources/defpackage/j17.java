package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j17  reason: default package */
/* loaded from: classes.dex */
public final class j17 {
    public static final int d = 8;
    @r06("a")
    private final String a;
    @r06("b")
    private final String b;
    @r06("c")
    private final List<fr4> c;

    public j17(String str, String str2, List<fr4> list) {
        str2.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ j17 e(j17 j17Var, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = j17Var.a;
        }
        if ((i & 2) != 0) {
            str2 = j17Var.b;
        }
        if ((i & 4) != 0) {
            list = j17Var.c;
        }
        return j17Var.d(str, str2, list);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final List<fr4> c() {
        return this.c;
    }

    public final j17 d(String str, String str2, List<fr4> list) {
        str2.getClass();
        list.getClass();
        return new j17(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j17)) {
            return false;
        }
        j17 j17Var = (j17) obj;
        if (b53.x(this.a, j17Var.a) && b53.x(this.b, j17Var.b) && b53.x(this.c, j17Var.c)) {
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

    public final List<fr4> h() {
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
        return this.c.hashCode() + ej6.b(hashCode * 31, 31, this.b);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        List<fr4> list = this.c;
        StringBuilder v = b31.v("UILayout25(backgroundId=", str, ", backgroundMode=", str2, ", components=");
        v.append(list);
        v.append(")");
        return v.toString();
    }
}
