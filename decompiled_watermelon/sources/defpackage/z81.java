package defpackage;

import android.graphics.drawable.BitmapDrawable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z81  reason: default package */
/* loaded from: classes.dex */
public final class z81 {
    public final BitmapDrawable a;
    public final boolean b;

    public z81(BitmapDrawable bitmapDrawable, boolean z) {
        this.a = bitmapDrawable;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof z81) {
                z81 z81Var = (z81) obj;
                if (this.a.equals(z81Var.a) && this.b == z81Var.b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
