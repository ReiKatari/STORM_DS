package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ux  reason: default package */
/* loaded from: classes.dex */
public final class ux {
    public final java.util.concurrent.Executor a;
    public final android.os.Handler b;

    public ux(java.util.concurrent.Executor r2, android.os.Handler r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            if (r2 == 0) goto L13
            r1.a = r2
            if (r3 == 0) goto Ld
            r1.b = r3
            return
        Ld:
            java.lang.String r1 = "Null schedulerHandler"
            defpackage.u34.x(r1)
            throw r0
        L13:
            java.lang.String r1 = "Null cameraExecutor"
            defpackage.u34.x(r1)
            throw r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.ux
            r2 = 0
            if (r1 == 0) goto L20
            ux r5 = (defpackage.ux) r5
            java.util.concurrent.Executor r1 = r4.a
            java.util.concurrent.Executor r3 = r5.a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L20
            android.os.Handler r4 = r4.b
            android.os.Handler r5 = r5.b
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L20
            return r0
        L20:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            android.os.Handler r2 = r2.b
            int r2 = r2.hashCode()
            r2 = r2 ^ r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CameraThreadConfig{cameraExecutor="
            r0.<init>(r1)
            java.util.concurrent.Executor r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", schedulerHandler="
            r0.append(r1)
            android.os.Handler r2 = r2.b
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
