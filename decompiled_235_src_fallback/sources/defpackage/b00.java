package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b00  reason: default package */
/* loaded from: classes.dex */
public final class b00 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    public b00(float r1, float r2, float r3, int r4, long r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public b00(android.window.BackEvent r8) {
            r7 = this;
            r8.getClass()
            float r1 = defpackage.gi.a(r8)
            float r2 = defpackage.gi.t(r8)
            float r3 = defpackage.gi.y(r8)
            int r4 = defpackage.gi.d(r8)
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 36
            if (r0 < r5) goto L1f
            long r5 = defpackage.np.b(r8)
        L1d:
            r0 = r7
            goto L22
        L1f:
            r5 = 0
            goto L1d
        L22:
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public b00(defpackage.hd4 r8) {
            r7 = this;
            r8.getClass()
            float r1 = r8.c
            float r2 = r8.d
            float r3 = r8.b
            int r4 = r8.a
            long r5 = r8.e
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BackEventCompat(touchX="
            r0.<init>(r1)
            float r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", touchY="
            r0.append(r1)
            float r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", progress="
            r0.append(r1)
            float r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", swipeEdge="
            r0.append(r1)
            int r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", frameTimeMillis="
            r0.append(r1)
            long r1 = r3.e
            r0.append(r1)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
