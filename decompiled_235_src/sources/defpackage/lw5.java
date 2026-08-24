package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lw5  reason: default package */
/* loaded from: classes.dex */
public final class lw5 {
    @gc6("directoryUri")
    private final String a;
    @gc6("hash")
    private final String b;
    @gc6("lastScanned")
    private final long c;
    @gc6("files")
    private final List<iw5> d;

    public lw5(String str, String str2, long j, ArrayList arrayList) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = arrayList;
    }

    public final String a() {
        return this.a;
    }

    public final List b() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final long d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw5)) {
            return false;
        }
        lw5 lw5Var = (lw5) obj;
        if (nb3.k(this.a, lw5Var.a) && nb3.k(this.b, lw5Var.b) && this.c == lw5Var.c && nb3.k(this.d, lw5Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + i61.c(this.c, xg6.d(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        long j = this.c;
        List<iw5> list = this.d;
        StringBuilder u = i61.u("RomDirectoryStateDto(directoryUri=", str, ", hash=", str2, ", lastScanned=");
        u.append(j);
        u.append(", files=");
        u.append(list);
        u.append(")");
        return u.toString();
    }
}
