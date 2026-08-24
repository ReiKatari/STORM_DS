package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qx  reason: default package */
/* loaded from: classes.dex */
public final class qx {
    public final m00 a;
    public final long b;

    public qx(m00 m00Var, long j) {
        if (m00Var != null) {
            this.a = m00Var;
            this.b = j;
            return;
        }
        u34.x("Null status");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qx) {
            qx qxVar = (qx) obj;
            if (this.a.equals(qxVar.a) && this.b == qxVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return ((int) ((j >>> 32) ^ j)) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(this.a);
        sb.append(", nextRequestWaitMillis=");
        return lb1.p(sb, this.b, "}");
    }
}
