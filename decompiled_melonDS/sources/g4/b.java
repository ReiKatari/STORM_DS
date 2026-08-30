package g4;

import android.content.res.Resources;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Resources.Theme f5557a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5558b;

    public b(Resources.Theme theme, int i2) {
        this.f5557a = theme;
        this.f5558b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (k.a(this.f5557a, bVar.f5557a) && this.f5558b == bVar.f5558b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5558b) + (this.f5557a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Key(theme=");
        sb2.append(this.f5557a);
        sb2.append(", id=");
        return w.d.p(sb2, this.f5558b, ')');
    }
}
