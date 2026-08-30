package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q62  reason: default package */
/* loaded from: classes.dex */
public final class q62 {
    public final Uri a;
    public final String b;
    public final long c;
    public final Map d;

    public q62(Uri uri, String str, long j, Map map) {
        uri.getClass();
        str.getClass();
        this.a = uri;
        this.b = str;
        this.c = j;
        this.d = map;
    }

    public final wl5 a() {
        String uri = this.a.toString();
        uri.getClass();
        Collection<p62> values = this.d.values();
        ArrayList arrayList = new ArrayList(uq0.y0(values, 10));
        for (p62 p62Var : values) {
            String uri2 = p62Var.a.toString();
            uri2.getClass();
            arrayList.add(new tl5(uri2, p62Var.b, p62Var.c));
        }
        return new wl5(uri, this.b, this.c, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q62) {
                q62 q62Var = (q62) obj;
                if (!b53.x(this.a, q62Var.a) || !b53.x(this.b, q62Var.b) || this.c != q62Var.c || !this.d.equals(q62Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + b31.c(this.c, ej6.b(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "DirectoryCacheState(directoryUri=" + this.a + ", hash=" + this.b + ", lastScanned=" + this.c + ", files=" + this.d + ")";
    }
}
