package defpackage;

import java.util.Arrays;
import me.magnum.melonds.domain.model.Rect;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n51  reason: default package */
/* loaded from: classes.dex */
public final class n51 {
    public final Rect a;
    public final float[] b;
    public final float c;
    public final boolean d;

    public n51(Rect rect, float[] fArr, float f, boolean z) {
        rect.getClass();
        this.a = rect;
        this.b = fArr;
        this.c = f;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof n51) {
                n51 n51Var = (n51) obj;
                if (!b53.x(this.a, n51Var.a) || !this.b.equals(n51Var.b) || Float.compare(this.c, n51Var.c) != 0 || this.d != n51Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.b);
        return Boolean.hashCode(this.d) + ej6.a(this.c, (hashCode + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.b);
        return "ScreenDrawTarget(rect=" + this.a + ", uvs=" + arrays + ", alpha=" + this.c + ", onTop=" + this.d + ")";
    }
}
