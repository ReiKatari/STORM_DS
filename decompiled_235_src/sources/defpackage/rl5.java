package defpackage;

import android.content.res.Resources;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rl5  reason: default package */
/* loaded from: classes.dex */
public final class rl5 {
    public final Resources a;
    public final Resources.Theme b;

    public rl5(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rl5.class == obj.getClass()) {
            rl5 rl5Var = (rl5) obj;
            if (this.a.equals(rl5Var.a) && Objects.equals(this.b, rl5Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
