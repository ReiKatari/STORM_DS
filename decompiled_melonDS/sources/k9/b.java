package k9;

import android.graphics.Bitmap;
import java.util.Map;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f8094a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f8095b;

    public b(Bitmap bitmap, Map map) {
        this.f8094a = bitmap;
        this.f8095b = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f8094a.equals(bVar.f8094a) && k.a(this.f8095b, bVar.f8095b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f8095b.hashCode() + (this.f8094a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(bitmap=" + this.f8094a + ", extras=" + this.f8095b + ')';
    }
}
