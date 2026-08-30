package v5;

import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f13722a;

    /* renamed from: b  reason: collision with root package name */
    public String f13723b;

    /* renamed from: c  reason: collision with root package name */
    public List f13724c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (Objects.equals(this.f13722a, aVar.f13722a) && Objects.equals(this.f13723b, aVar.f13723b) && Objects.equals(this.f13724c, aVar.f13724c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13722a, this.f13723b, this.f13724c);
    }
}
