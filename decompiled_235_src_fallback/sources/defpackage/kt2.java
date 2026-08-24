package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kt2  reason: default package */
/* loaded from: classes.dex */
public final class kt2 extends defpackage.pt2 {
    public final int b;
    public final boolean c;

    public kt2(int r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "GRAPH_ERROR"
            r1.<init>(r0)
            r1.b = r2
            r1.c = r3
            return
    }

    @Override // defpackage.pt2
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = "(cameraError="
            r0.append(r1)
            int r1 = r2.b
            java.lang.String r1 = defpackage.df0.a(r1)
            r0.append(r1)
            java.lang.String r1 = ", willAttemptRetry="
            r0.append(r1)
            boolean r2 = r2.c
            r1 = 41
            java.lang.String r2 = defpackage.xg6.r(r0, r2, r1)
            return r2
    }
}
