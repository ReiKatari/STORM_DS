package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m12  reason: default package */
/* loaded from: classes.dex */
public final class m12 extends ww2 {
    public final Drawable a;
    public final vw2 b;
    public final Throwable c;

    public m12(Drawable drawable, vw2 vw2Var, Throwable th) {
        this.a = drawable;
        this.b = vw2Var;
        this.c = th;
    }

    @Override // defpackage.ww2
    public final Drawable a() {
        return this.a;
    }

    @Override // defpackage.ww2
    public final vw2 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m12) {
                m12 m12Var = (m12) obj;
                if (b53.x(this.a, m12Var.a) && b53.x(this.b, m12Var.b) && this.c.equals(m12Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        Drawable drawable = this.a;
        if (drawable != null) {
            i = drawable.hashCode();
        } else {
            i = 0;
        }
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (i * 31)) * 31);
    }
}
