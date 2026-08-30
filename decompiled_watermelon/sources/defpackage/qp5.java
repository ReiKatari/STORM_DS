package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qp5  reason: default package */
/* loaded from: classes.dex */
public final class qp5 {
    public final Uri a;
    public final String b;

    public qp5(Uri uri, String str) {
        str.getClass();
        this.a = uri;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qp5) {
                qp5 qp5Var = (qp5) obj;
                if (!this.a.equals(qp5Var.a) || !b53.x(this.b, qp5Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SharedSaveFile(uri=" + this.a + ", fileName=" + this.b + ")";
    }
}
