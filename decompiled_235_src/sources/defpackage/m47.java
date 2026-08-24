package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m47  reason: default package */
/* loaded from: classes.dex */
public final class m47 {
    public final long a;
    public final long b;

    public m47(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m47)) {
            return false;
        }
        m47 m47Var = (m47) obj;
        if (kt0.d(this.a, m47Var.a) && kt0.d(this.b, m47Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = kt0.i;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) kt0.j(this.a)) + ", selectionBackgroundColor=" + ((Object) kt0.j(this.b)) + ')';
    }
}
