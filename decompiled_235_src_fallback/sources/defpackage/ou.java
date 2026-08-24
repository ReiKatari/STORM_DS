package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ou  reason: default package */
/* loaded from: classes.dex */
public final class ou {
    public int a;
    public long b;
    public java.lang.Object c;

    public ou(int r1, java.net.URL r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.c = r2
            r0.b = r3
            return
    }

    public ou(long r3, java.lang.Exception r5) {
            r2 = this;
            r2.<init>()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r3
            r2.b = r0
            boolean r3 = r5 instanceof defpackage.bj0
            r4 = 2
            if (r3 == 0) goto L14
            r2.a = r4
            r2.c = r5
            return
        L14:
            boolean r3 = r5 instanceof defpackage.i53
            r0 = 0
            if (r3 == 0) goto L34
            java.lang.Throwable r3 = r5.getCause()
            if (r3 == 0) goto L20
            r5 = r3
        L20:
            r2.c = r5
            boolean r3 = r5 instanceof defpackage.pi0
            if (r3 == 0) goto L29
            r2.a = r4
            return
        L29:
            boolean r3 = r5 instanceof java.lang.IllegalArgumentException
            if (r3 == 0) goto L31
            r3 = 1
            r2.a = r3
            return
        L31:
            r2.a = r0
            return
        L34:
            r2.a = r0
            r2.c = r5
            return
    }
}
