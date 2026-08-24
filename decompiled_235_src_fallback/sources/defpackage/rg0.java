package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rg0  reason: default package */
/* loaded from: classes.dex */
public final class rg0 {
    public final java.util.concurrent.Executor a;

    public rg0(defpackage.vb6 r1, int r2) {
            r0 = this;
            r2 = r2 & 8
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof defpackage.rg0
            if (r0 != 0) goto L8
            goto L14
        L8:
            rg0 r2 = (defpackage.rg0) r2
            java.util.concurrent.Executor r1 = r1.a
            java.util.concurrent.Executor r2 = r2.a
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 != 0) goto L16
        L14:
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.util.concurrent.Executor r0 = r0.a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            int r0 = r0 * 29791
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ThreadConfig(defaultLightweightExecutor=null, defaultBackgroundExecutor=null, defaultBlockingExecutor=null, defaultCameraExecutor="
            r0.<init>(r1)
            java.util.concurrent.Executor r2 = r2.a
            r0.append(r2)
            java.lang.String r2 = ", defaultCameraHandler=null, defaultCameraHandlerFn=null, testOnlyScope=null)"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
