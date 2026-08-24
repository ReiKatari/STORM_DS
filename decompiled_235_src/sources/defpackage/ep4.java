package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ep4  reason: default package */
/* loaded from: classes.dex */
public final class ep4 {
    public final boolean a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final dp4 f;
    public final sw g;

    public ep4(boolean z, long j, long j2, long j3, long j4, dp4 dp4Var) {
        dp4Var.getClass();
        this.a = z;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = dp4Var;
        this.g = g04.s(false);
    }

    public final void a(long j, Object obj) {
        if (this.g.a()) {
            this.f.b(obj);
            return;
        }
        StringBuilder sb = new StringBuilder("Output ");
        sb.append(this.d);
        sb.append(" at ");
        sb.append((Object) nm2.a(this.b));
        sb.append(" for ");
        u34.f(lb1.p(sb, j, " was completed multiple times!"));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ep4) {
                ep4 ep4Var = (ep4) obj;
                if (this.a == ep4Var.a && this.b == ep4Var.b && this.c == ep4Var.c && this.d == ep4Var.d && this.e == ep4Var.e && nb3.k(this.f, ep4Var.f)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f.hashCode() + i61.c(this.e, i61.c(this.d, i61.c(this.c, i61.c(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "StartedOutput(isOutOfOrder=" + this.a + ", cameraFrameNumber=" + ((Object) nm2.a(this.b)) + ", cameraTimestamp=" + ((Object) ("CameraTimestamp(value=" + this.c + ')')) + ", cameraOutputSequence=" + this.d + ", cameraOutputNumber=" + this.e + ", outputListener=" + this.f + ')';
    }
}
