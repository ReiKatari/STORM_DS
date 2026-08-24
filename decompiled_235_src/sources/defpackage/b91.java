package defpackage;

import java.util.Arrays;
import me.magnum.melonds.domain.model.Rect;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b91  reason: default package */
/* loaded from: classes.dex */
public final class b91 {
    public final Rect a;
    public final float[] b;
    public final float c;
    public final boolean d;

    public b91(Rect rect, float[] fArr, float f, boolean z) {
        rect.getClass();
        this.a = rect;
        this.b = fArr;
        this.c = f;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b91) {
                b91 b91Var = (b91) obj;
                if (!nb3.k(this.a, b91Var.a) || !this.b.equals(b91Var.b) || Float.compare(this.c, b91Var.c) != 0 || this.d != b91Var.d) {
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
        return Boolean.hashCode(this.d) + xg6.a(this.c, (hashCode + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.b);
        return "ScreenDrawTarget(rect=" + this.a + ", uvs=" + arrays + ", alpha=" + this.c + ", onTop=" + this.d + ")";
    }
}
