package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c37  reason: default package */
/* loaded from: classes.dex */
public final class c37 {
    public static final ap3 d = new ap3(28, new z17(2), new r76(29));
    public final fp a;
    public final long b;
    public final k47 c;

    public c37(fp fpVar, long j, k47 k47Var) {
        k47 k47Var2;
        this.a = fpVar;
        this.b = jx2.m(fpVar.B.length(), j);
        if (k47Var != null) {
            k47Var2 = new k47(jx2.m(fpVar.B.length(), k47Var.a));
        } else {
            k47Var2 = null;
        }
        this.c = k47Var2;
    }

    public static c37 a(c37 c37Var, fp fpVar, long j, int i) {
        k47 k47Var;
        if ((i & 1) != 0) {
            fpVar = c37Var.a;
        }
        if ((i & 2) != 0) {
            j = c37Var.b;
        }
        if ((i & 4) != 0) {
            k47Var = c37Var.c;
        } else {
            k47Var = null;
        }
        c37Var.getClass();
        return new c37(fpVar, j, k47Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c37)) {
            return false;
        }
        c37 c37Var = (c37) obj;
        if (k47.b(this.b, c37Var.b) && nb3.k(this.c, c37Var.c) && nb3.k(this.a, c37Var.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = k47.c;
        int c = i61.c(this.b, this.a.hashCode() * 31, 31);
        k47 k47Var = this.c;
        if (k47Var != null) {
            i = Long.hashCode(k47Var.a);
        } else {
            i = 0;
        }
        return c + i;
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) k47.h(this.b)) + ", composition=" + this.c + ')';
    }

    public c37(String str, int i, long j) {
        this(new fp((i & 1) != 0 ? "" : str), (i & 2) != 0 ? k47.b : j, (k47) null);
    }
}
