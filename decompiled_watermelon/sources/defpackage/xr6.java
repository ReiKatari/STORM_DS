package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xr6  reason: default package */
/* loaded from: classes.dex */
public final class xr6 {
    public final long a;
    public final long b;

    public xr6(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr6)) {
            return false;
        }
        xr6 xr6Var = (xr6) obj;
        if (xq0.c(this.a, xr6Var.a) && xq0.c(this.b, xr6Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = xq0.i;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) xq0.i(this.a)) + ", selectionBackgroundColor=" + ((Object) xq0.i(this.b)) + ')';
    }
}
