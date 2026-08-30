package defpackage;

import android.view.Surface;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mx  reason: default package */
/* loaded from: classes.dex */
public final class mx {
    public final int a;
    public final Surface b;

    public mx(int i, Surface surface) {
        this.a = i;
        if (surface != null) {
            this.b = surface;
        } else {
            c44.i("Null surface");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof mx) {
                mx mxVar = (mx) obj;
                if (this.a == mxVar.a && this.b.equals(mxVar.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Result{resultCode=" + this.a + ", surface=" + this.b + "}";
    }
}
