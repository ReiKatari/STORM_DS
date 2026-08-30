package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tl5  reason: default package */
/* loaded from: classes.dex */
public final class tl5 {
    @r06("uri")
    private final String a;
    @r06("lastModified")
    private final long b;
    @r06("size")
    private final long c;

    public tl5(String str, long j, long j2) {
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
        if (!(obj instanceof tl5)) {
            return false;
        }
        tl5 tl5Var = (tl5) obj;
        if (b53.x(this.a, tl5Var.a) && this.b == tl5Var.b && this.c == tl5Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + b31.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.a;
        long j = this.b;
        long j2 = this.c;
        StringBuilder sb = new StringBuilder("RomDirectoryFileDto(uri=");
        sb.append(str);
        sb.append(", lastModified=");
        sb.append(j);
        return wh1.p(sb, ", size=", j2, ")");
    }
}
