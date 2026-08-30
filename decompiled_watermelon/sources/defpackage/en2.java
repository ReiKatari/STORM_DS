package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: en2  reason: default package */
/* loaded from: classes.dex */
public final class en2 extends jn2 {
    public final int b;
    public final boolean c;

    public en2(int i, boolean z) {
        super("GRAPH_ERROR");
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.jn2
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("(cameraError=");
        sb.append((Object) uc0.a(this.b));
        sb.append(", willAttemptRetry=");
        return ej6.h(sb, this.c, ')');
    }
}
