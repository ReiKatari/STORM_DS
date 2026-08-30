package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wl5  reason: default package */
/* loaded from: classes.dex */
public final class wl5 {
    @r06("directoryUri")
    private final String a;
    @r06("hash")
    private final String b;
    @r06("lastScanned")
    private final long c;
    @r06("files")
    private final List<tl5> d;

    public wl5(String str, String str2, long j, ArrayList arrayList) {
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
        if (!(obj instanceof wl5)) {
            return false;
        }
        wl5 wl5Var = (wl5) obj;
        if (b53.x(this.a, wl5Var.a) && b53.x(this.b, wl5Var.b) && this.c == wl5Var.c && b53.x(this.d, wl5Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + b31.c(this.c, ej6.b(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        long j = this.c;
        List<tl5> list = this.d;
        StringBuilder v = b31.v("RomDirectoryStateDto(directoryUri=", str, ", hash=", str2, ", lastScanned=");
        v.append(j);
        v.append(", files=");
        v.append(list);
        v.append(")");
        return v.toString();
    }
}
