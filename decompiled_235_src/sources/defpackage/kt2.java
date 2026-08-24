package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kt2  reason: default package */
/* loaded from: classes.dex */
public final class kt2 extends pt2 {
    public final int b;
    public final boolean c;

    public kt2(int i, boolean z) {
        super("GRAPH_ERROR");
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.pt2
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("(cameraError=");
        sb.append((Object) df0.a(this.b));
        sb.append(", willAttemptRetry=");
        return xg6.r(sb, this.c, ')');
    }
}
