package s4;

import java.util.Locale;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Locale f12832a;

    public a(Locale locale) {
        this.f12832a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return k.a(this.f12832a.toLanguageTag(), ((a) obj).f12832a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f12832a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f12832a.toLanguageTag();
    }
}
