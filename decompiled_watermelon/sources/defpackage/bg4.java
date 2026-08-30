package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bg4  reason: default package */
/* loaded from: classes.dex */
public final class bg4 {
    public final boolean a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final ag4 f;
    public final aw g;

    public bg4(boolean z, long j, long j2, long j3, long j4, ag4 ag4Var) {
        ag4Var.getClass();
        this.a = z;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = ag4Var;
        this.g = w81.e(false);
    }

    public final void a(long j, Object obj) {
        if (this.g.a()) {
            this.f.a(obj);
            return;
        }
        StringBuilder sb = new StringBuilder("Output ");
        sb.append(this.d);
        sb.append(" at ");
        sb.append((Object) nh2.a(this.b));
        sb.append(" for ");
        c44.e(wh1.n(sb, j, " was completed multiple times!"));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bg4) {
                bg4 bg4Var = (bg4) obj;
                if (this.a == bg4Var.a && this.b == bg4Var.b && this.c == bg4Var.c && this.d == bg4Var.d && this.e == bg4Var.e && b53.x(this.f, bg4Var.f)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f.hashCode() + b31.c(this.e, b31.c(this.d, b31.c(this.c, b31.c(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "StartedOutput(isOutOfOrder=" + this.a + ", cameraFrameNumber=" + ((Object) nh2.a(this.b)) + ", cameraTimestamp=" + ((Object) ("CameraTimestamp(value=" + this.c + ')')) + ", cameraOutputSequence=" + this.d + ", cameraOutputNumber=" + this.e + ", outputListener=" + this.f + ')';
    }
}
