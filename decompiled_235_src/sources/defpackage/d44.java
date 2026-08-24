package defpackage;

import android.graphics.Bitmap;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d44  reason: default package */
/* loaded from: classes.dex */
public final class d44 {
    public final Bitmap a;
    public final Map b;

    public d44(Bitmap bitmap, Map map) {
        this.a = bitmap;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d44) {
                d44 d44Var = (d44) obj;
                if (this.a.equals(d44Var.a) && nb3.k(this.b, d44Var.b)) {
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
