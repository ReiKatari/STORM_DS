package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p21  reason: default package */
/* loaded from: classes.dex */
public final class p21 {
    public static final defpackage.p21 j = null;
    public final defpackage.kf4 a;
    public final defpackage.af4 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final java.util.Set i;

    static {
            p21 r0 = new p21
            r0.<init>()
            defpackage.p21.j = r0
            return
    }

    public p21() {
            r3 = this;
            kf4 r0 = defpackage.kf4.NOT_REQUIRED
            r0.getClass()
            r3.<init>()
            af4 r1 = new af4
            r2 = 0
            r1.<init>(r2)
            r3.b = r1
            r3.a = r0
            r0 = 0
            r3.c = r0
            r3.d = r0
            r3.e = r0
            r3.f = r0
            r0 = -1
            r3.g = r0
            r3.h = r0
            du1 r0 = defpackage.du1.A
            r3.i = r0
            return
    }

    public p21(defpackage.af4 r1, defpackage.kf4 r2, boolean r3, boolean r4, boolean r5, boolean r6, long r7, long r9, java.util.Set r11) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.b = r1
            r0.a = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r9
            r0.i = r11
            return
    }

    public p21(defpackage.p21 r3) {
            r2 = this;
            r3.getClass()
            r2.<init>()
            boolean r0 = r3.c
            r2.c = r0
            boolean r0 = r3.d
            r2.d = r0
            af4 r0 = r3.b
            r2.b = r0
            kf4 r0 = r3.a
            r2.a = r0
            boolean r0 = r3.e
            r2.e = r0
            boolean r0 = r3.f
            r2.f = r0
            java.util.Set r0 = r3.i
            r2.i = r0
            long r0 = r3.g
            r2.g = r0
            long r0 = r3.h
            r2.h = r0
            return
    }

    public final android.net.NetworkRequest a() {
            r0 = this;
            af4 r0 = r0.b
            java.lang.Object r0 = r0.a
            android.net.NetworkRequest r0 = (android.net.NetworkRequest) r0
            return r0
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            if (r5 != r6) goto L4
            r5 = 1
            return r5
        L4:
            r0 = 0
            if (r6 == 0) goto L63
            java.lang.Class<p21> r1 = defpackage.p21.class
            java.lang.Class r2 = r6.getClass()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L14
            goto L63
        L14:
            p21 r6 = (defpackage.p21) r6
            boolean r1 = r5.c
            boolean r2 = r6.c
            if (r1 == r2) goto L1d
            return r0
        L1d:
            boolean r1 = r5.d
            boolean r2 = r6.d
            if (r1 == r2) goto L24
            return r0
        L24:
            boolean r1 = r5.e
            boolean r2 = r6.e
            if (r1 == r2) goto L2b
            return r0
        L2b:
            boolean r1 = r5.f
            boolean r2 = r6.f
            if (r1 == r2) goto L32
            return r0
        L32:
            long r1 = r5.g
            long r3 = r6.g
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L3b
            return r0
        L3b:
            long r1 = r5.h
            long r3 = r6.h
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L44
            return r0
        L44:
            android.net.NetworkRequest r1 = r5.a()
            android.net.NetworkRequest r2 = r6.a()
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 != 0) goto L53
            return r0
        L53:
            kf4 r1 = r5.a
            kf4 r2 = r6.a
            if (r1 == r2) goto L5a
            return r0
        L5a:
            java.util.Set r5 = r5.i
            java.util.Set r6 = r6.i
            boolean r5 = defpackage.nb3.k(r5, r6)
            return r5
        L63:
            return r0
    }

    public final int hashCode() {
            r6 = this;
            kf4 r0 = r6.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            boolean r1 = r6.c
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r6.d
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r6.e
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r6.f
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r6.g
            r3 = 32
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r1 = (int) r1
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r6.h
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r1 = (int) r1
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.Set r1 = r6.i
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            android.net.NetworkRequest r6 = r6.a()
            if (r6 == 0) goto L44
            int r6 = r6.hashCode()
            goto L45
        L44:
            r6 = 0
        L45:
            int r1 = r1 + r6
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Constraints{requiredNetworkType="
            r0.<init>(r1)
            kf4 r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", requiresCharging="
            r0.append(r1)
            boolean r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", requiresDeviceIdle="
            r0.append(r1)
            boolean r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", requiresBatteryNotLow="
            r0.append(r1)
            boolean r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ", requiresStorageNotLow="
            r0.append(r1)
            boolean r1 = r3.f
            r0.append(r1)
            java.lang.String r1 = ", contentTriggerUpdateDelayMillis="
            r0.append(r1)
            long r1 = r3.g
            r0.append(r1)
            java.lang.String r1 = ", contentTriggerMaxDelayMillis="
            r0.append(r1)
            long r1 = r3.h
            r0.append(r1)
            java.lang.String r1 = ", contentUriTriggers="
            r0.append(r1)
            java.util.Set r3 = r3.i
            r0.append(r3)
            java.lang.String r3 = ", }"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
