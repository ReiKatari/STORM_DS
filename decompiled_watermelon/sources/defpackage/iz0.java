package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: iz0  reason: default package */
/* loaded from: classes.dex */
public final class iz0 {
    public final Uri a;
    public final boolean b;

    public iz0(boolean z, Uri uri) {
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
            if (iz0.class.equals(cls)) {
                obj.getClass();
                iz0 iz0Var = (iz0) obj;
                if (!this.a.equals(iz0Var.a) || this.b != iz0Var.b) {
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
