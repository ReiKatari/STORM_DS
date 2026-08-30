package defpackage;

import android.content.res.Resources;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cx2  reason: default package */
/* loaded from: classes.dex */
public final class cx2 {
    public final Resources.Theme a;
    public final int b;

    public cx2(Resources.Theme theme, int i) {
        this.a = theme;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx2)) {
            return false;
        }
        cx2 cx2Var = (cx2) obj;
        if (b53.x(this.a, cx2Var.a) && this.b == cx2Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.a);
        sb.append(", id=");
        return ej6.g(sb, this.b, ')');
    }
}
