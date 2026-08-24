package defpackage;

import android.graphics.drawable.BitmapDrawable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qc1  reason: default package */
/* loaded from: classes.dex */
public final class qc1 {
    public final BitmapDrawable a;
    public final boolean b;

    public qc1(BitmapDrawable bitmapDrawable, boolean z) {
        this.a = bitmapDrawable;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qc1) {
                qc1 qc1Var = (qc1) obj;
                if (this.a.equals(qc1Var.a) && this.b == qc1Var.b) {
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
