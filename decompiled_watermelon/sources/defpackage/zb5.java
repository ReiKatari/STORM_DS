package defpackage;

import android.content.res.Resources;
import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zb5  reason: default package */
/* loaded from: classes.dex */
public final class zb5 {
    public final Resources a;
    public final Resources.Theme b;

    public zb5(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zb5.class == obj.getClass()) {
            zb5 zb5Var = (zb5) obj;
            if (this.a.equals(zb5Var.a) && Objects.equals(this.b, zb5Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
