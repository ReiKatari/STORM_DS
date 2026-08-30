package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qk1  reason: default package */
/* loaded from: classes.dex */
public final class qk1 extends q52 {
    public final Drawable a;
    public final boolean b;
    public final i81 c;

    public qk1(Drawable drawable, boolean z, i81 i81Var) {
        this.a = drawable;
        this.b = z;
        this.c = i81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qk1) {
            qk1 qk1Var = (qk1) obj;
            if (b53.x(this.a, qk1Var.a) && this.b == qk1Var.b && this.c == qk1Var.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ej6.c(this.a.hashCode() * 31, this.b, 31);
    }
}
