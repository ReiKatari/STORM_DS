package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uw2  reason: default package */
/* loaded from: classes.dex */
public final class uw2 {
    public static final da0 d;
    public static final da0 e;
    public static final da0 f;
    public static final da0 g;
    public static final da0 h;
    public static final da0 i;
    public final da0 a;
    public final da0 b;
    public final int c;

    static {
        da0 da0Var = da0.R;
        d = xd5.o(":");
        e = xd5.o(":status");
        f = xd5.o(":method");
        g = xd5.o(":path");
        h = xd5.o(":scheme");
        i = xd5.o(":authority");
    }

    public uw2(da0 da0Var, da0 da0Var2) {
        da0Var.getClass();
        da0Var2.getClass();
        this.a = da0Var;
        this.b = da0Var2;
        this.c = da0Var2.d() + da0Var.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw2)) {
            return false;
        }
        uw2 uw2Var = (uw2) obj;
        if (nb3.k(this.a, uw2Var.a) && nb3.k(this.b, uw2Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.s() + ": " + this.b.s();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uw2(String str, String str2) {
        this(xd5.o(str), xd5.o(str2));
        da0 da0Var = da0.R;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uw2(da0 da0Var, String str) {
        this(da0Var, xd5.o(str));
        da0Var.getClass();
        str.getClass();
        da0 da0Var2 = da0.R;
    }
}
