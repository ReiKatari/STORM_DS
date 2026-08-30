package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fg  reason: default package */
/* loaded from: classes.dex */
public final class fg {
    public final Context a;
    public final od1 b;
    public final long c;
    public final ih4 d;

    public fg(Context context, od1 od1Var, long j, ih4 ih4Var) {
        this.a = context;
        this.b = od1Var;
        this.c = j;
        this.d = ih4Var;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!fg.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        fg fgVar = (fg) obj;
        if (b53.x(this.a, fgVar.a) && b53.x(this.b, fgVar.b) && xq0.c(this.c, fgVar.c) && b53.x(this.d, fgVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int i = xq0.i;
        return this.d.hashCode() + b31.c(this.c, (hashCode + (this.a.hashCode() * 31)) * 31, 31);
    }
}
