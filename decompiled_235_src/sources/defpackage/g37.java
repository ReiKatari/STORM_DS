package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g37  reason: default package */
/* loaded from: classes.dex */
public final class g37 {
    public static final g37 c = new g37(3, 0L);
    public final long a;
    public final long b;

    public /* synthetic */ g37(int i, long j) {
        this((i & 1) != 0 ? hi2.E(0) : j, hi2.E(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g37)) {
            return false;
        }
        g37 g37Var = (g37) obj;
        if (x47.a(this.a, g37Var.a) && x47.a(this.b, g37Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        y47[] y47VarArr = x47.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) x47.d(this.a)) + ", restLine=" + ((Object) x47.d(this.b)) + ')';
    }

    public g37(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
