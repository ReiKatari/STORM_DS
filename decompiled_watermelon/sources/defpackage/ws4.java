package defpackage;

import android.graphics.Rect;
import android.util.Size;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ws4  reason: default package */
/* loaded from: classes.dex */
public final class ws4 {
    public final Rect a;
    public final Size b;
    public final Size c;

    public ws4(Rect rect, Size size, Size size2) {
        size.getClass();
        size2.getClass();
        this.a = rect;
        this.b = size;
        this.c = size2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ws4) {
                ws4 ws4Var = (ws4) obj;
                if (!this.a.equals(ws4Var.a) || !b53.x(this.b, ws4Var.b) || !b53.x(this.c, ws4Var.c)) {
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
