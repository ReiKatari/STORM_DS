package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n21  reason: default package */
/* loaded from: classes.dex */
public final class n21 {
    public final Uri a;
    public final boolean b;

    public n21(boolean z, Uri uri) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (n21.class.equals(cls)) {
                obj.getClass();
                n21 n21Var = (n21) obj;
                if (!this.a.equals(n21Var.a) || this.b != n21Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
