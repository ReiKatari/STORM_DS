package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iw5  reason: default package */
/* loaded from: classes.dex */
public final class iw5 {
    @gc6("uri")
    private final String a;
    @gc6("lastModified")
    private final long b;
    @gc6("size")
    private final long c;

    public iw5(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw5)) {
            return false;
        }
        iw5 iw5Var = (iw5) obj;
        if (nb3.k(this.a, iw5Var.a) && this.b == iw5Var.b && this.c == iw5Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + i61.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.a;
        long j = this.b;
        long j2 = this.c;
        StringBuilder sb = new StringBuilder("RomDirectoryFileDto(uri=");
        sb.append(str);
        sb.append(", lastModified=");
        sb.append(j);
        return lb1.r(sb, ", size=", j2, ")");
    }
}
