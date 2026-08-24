package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x87  reason: default package */
/* loaded from: classes.dex */
public final class x87 {
    public final long a;
    public final long b;
    public final boolean c;

    public x87(long r1, long r3, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r5
            return
    }

    public final defpackage.x87 a(defpackage.x87 r8) {
            r7 = this;
            x87 r0 = new x87
            long r1 = r7.a
            long r3 = r8.a
            long r1 = defpackage.jk4.f(r1, r3)
            long r3 = r7.b
            long r5 = r8.b
            long r3 = java.lang.Math.max(r3, r5)
            boolean r7 = r7.c
            if (r7 != 0) goto L1e
            boolean r7 = r8.c
            if (r7 == 0) goto L1b
            goto L1e
        L1b:
            r7 = 0
        L1c:
            r5 = r7
            goto L20
        L1e:
            r7 = 1
            goto L1c
        L20:
            r0.<init>(r1, r3, r5)
            return r0
    }
}
