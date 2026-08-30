package p5;

import android.content.res.Resources;
import java.util.Objects;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f11350a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources.Theme f11351b;

    public i(Resources resources, Resources.Theme theme) {
        this.f11350a = resources;
        this.f11351b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f11350a.equals(iVar.f11350a) && Objects.equals(this.f11351b, iVar.f11351b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f11350a, this.f11351b);
    }
}
