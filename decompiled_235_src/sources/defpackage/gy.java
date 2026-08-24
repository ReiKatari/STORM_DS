package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gy  reason: default package */
/* loaded from: classes.dex */
public final class gy extends i62 {
    public final Object a;
    public final b35 b;

    public gy(Object obj, b35 b35Var) {
        if (obj != null) {
            this.a = obj;
            if (b35Var != null) {
                this.b = b35Var;
                return;
            } else {
                u34.x("Null priority");
                throw null;
            }
        }
        u34.x("Null payload");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i62) {
            gy gyVar = (gy) ((i62) obj);
            if (this.a.equals(gyVar.a) && this.b.equals(gyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ (((1000003 * 1000003) ^ this.a.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + this.b + "}";
    }
}
