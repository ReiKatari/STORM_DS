package defpackage;

import android.graphics.Bitmap;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pw3  reason: default package */
/* loaded from: classes.dex */
public final class pw3 {
    public final Bitmap a;
    public final Map b;

    public pw3(Bitmap bitmap, Map map) {
        this.a = bitmap;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pw3) {
                pw3 pw3Var = (pw3) obj;
                if (this.a.equals(pw3Var.a) && b53.x(this.b, pw3Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(bitmap=" + this.a + ", extras=" + this.b + ')';
    }
}
