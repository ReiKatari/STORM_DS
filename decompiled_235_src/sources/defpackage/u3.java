package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u3  reason: default package */
/* loaded from: classes.dex */
public final class u3 extends v3 {
    public final nb3 a;
    public final boolean b;
    public final bt c;
    public final long d;

    public u3(nb3 nb3Var, boolean z, bt btVar, long j) {
        this.a = nb3Var;
        this.b = z;
        this.c = btVar;
        this.d = j;
    }

    @Override // defpackage.v3
    public final bt a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u3) {
                u3 u3Var = (u3) obj;
                if (this.a.equals(u3Var.a) && this.b == u3Var.b && this.c == u3Var.c && this.d == u3Var.d) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int e = xg6.e(this.a.hashCode() * 31, this.b, 31);
        return Long.hashCode(this.d) + ((this.c.hashCode() + e) * 31);
    }

    public final String toString() {
        return "ServerCommunicationFailed(source=" + this.a + ", willRetryInBackground=" + this.b + ", state=" + this.c + ", uiInstanceId=" + this.d + ")";
    }
}
