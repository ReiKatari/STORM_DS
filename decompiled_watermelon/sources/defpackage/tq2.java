package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tq2  reason: default package */
/* loaded from: classes.dex */
public final class tq2 {
    public static final w70 d;
    public static final w70 e;
    public static final w70 f;
    public static final w70 g;
    public static final w70 h;
    public static final w70 i;
    public final w70 a;
    public final w70 b;
    public final int c;

    static {
        w70 w70Var = w70.R;
        d = iq0.p(":");
        e = iq0.p(":status");
        f = iq0.p(":method");
        g = iq0.p(":path");
        h = iq0.p(":scheme");
        i = iq0.p(":authority");
    }

    public tq2(w70 w70Var, w70 w70Var2) {
        w70Var.getClass();
        w70Var2.getClass();
        this.a = w70Var;
        this.b = w70Var2;
        this.c = w70Var2.d() + w70Var.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq2)) {
            return false;
        }
        tq2 tq2Var = (tq2) obj;
        if (b53.x(this.a, tq2Var.a) && b53.x(this.b, tq2Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.r() + ": " + this.b.r();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tq2(String str, String str2) {
        this(iq0.p(str), iq0.p(str2));
        w70 w70Var = w70.R;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tq2(w70 w70Var, String str) {
        this(w70Var, iq0.p(str));
        w70Var.getClass();
        str.getClass();
        w70 w70Var2 = w70.R;
    }
}
