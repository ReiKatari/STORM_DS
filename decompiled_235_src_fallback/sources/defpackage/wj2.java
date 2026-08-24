package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wj2  reason: default package */
/* loaded from: classes.dex */
public final class wj2 {
    public final int a;
    public final int b;
    public final android.app.Notification c;

    public wj2(int r1, android.app.Notification r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.c = r2
            r0.b = r3
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r3 = 1
            return r3
        L4:
            r0 = 0
            if (r4 == 0) goto L29
            java.lang.Class<wj2> r1 = defpackage.wj2.class
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto L10
            goto L29
        L10:
            wj2 r4 = (defpackage.wj2) r4
            int r1 = r3.a
            int r2 = r4.a
            if (r1 == r2) goto L19
            return r0
        L19:
            int r1 = r3.b
            int r2 = r4.b
            if (r1 == r2) goto L20
            return r0
        L20:
            android.app.Notification r3 = r3.c
            android.app.Notification r4 = r4.c
            boolean r3 = r3.equals(r4)
            return r3
        L29:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.a
            int r0 = r0 * 31
            int r1 = r2.b
            int r0 = r0 + r1
            int r0 = r0 * 31
            android.app.Notification r2 = r2.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ForegroundInfo{mNotificationId="
            r0.<init>(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", mForegroundServiceType="
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", mNotification="
            r0.append(r1)
            android.app.Notification r2 = r2.c
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
