package defpackage;

import android.graphics.Rect;
import android.util.Size;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y15  reason: default package */
/* loaded from: classes.dex */
public final class y15 {
    public final Rect a;
    public final Size b;
    public final Size c;

    public y15(Rect rect, Size size, Size size2) {
        size.getClass();
        size2.getClass();
        this.a = rect;
        this.b = size;
        this.c = size2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof y15) {
                y15 y15Var = (y15) obj;
                if (!this.a.equals(y15Var.a) || !nb3.k(this.b, y15Var.b) || !nb3.k(this.c, y15Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PreferredChildSize(cropRectBeforeScaling=" + this.a + ", childSizeToScale=" + this.b + ", originalSelectedChildSize=" + this.c + ')';
    }
}
