package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qo5  reason: default package */
/* loaded from: classes.dex */
public final class qo5 {
    public final Uri a;
    public final String b;
    public final String c;
    public final String d;

    public qo5(Uri uri, String str, String str2, String str3) {
        uri.getClass();
        this.a = uri;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qo5) {
                qo5 qo5Var = (qo5) obj;
                if (!b53.x(this.a, qo5Var.a) || !this.b.equals(qo5Var.b) || !this.c.equals(qo5Var.c) || !this.d.equals(qo5Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + ej6.b(ej6.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "RootDirectory(uri=" + this.a + ", docId=" + this.b + ", displayName=" + this.c + ", relativePath=" + this.d + ")";
    }
}
