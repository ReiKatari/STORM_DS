package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kb2  reason: default package */
/* loaded from: classes.dex */
public final class kb2 {
    public final Uri a;
    public final String b;
    public final long c;
    public final Map d;

    public kb2(Uri uri, String str, long j, Map map) {
        uri.getClass();
        str.getClass();
        this.a = uri;
        this.b = str;
        this.c = j;
        this.d = map;
    }

    public final lw5 a() {
        String uri = this.a.toString();
        uri.getClass();
        Collection<jb2> values = this.d.values();
        ArrayList arrayList = new ArrayList(ht0.v0(values, 10));
        for (jb2 jb2Var : values) {
            String uri2 = jb2Var.a.toString();
            uri2.getClass();
            arrayList.add(new iw5(uri2, jb2Var.b, jb2Var.c));
        }
        return new lw5(uri, this.b, this.c, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kb2) {
                kb2 kb2Var = (kb2) obj;
                if (!nb3.k(this.a, kb2Var.a) || !nb3.k(this.b, kb2Var.b) || this.c != kb2Var.c || !this.d.equals(kb2Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + i61.c(this.c, xg6.d(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "DirectoryCacheState(directoryUri=" + this.a + ", hash=" + this.b + ", lastScanned=" + this.c + ", files=" + this.d + ")";
    }
}
