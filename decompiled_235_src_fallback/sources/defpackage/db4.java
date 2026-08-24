package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: db4  reason: default package */
/* loaded from: classes.dex */
public final class db4 {
    public final java.util.concurrent.atomic.AtomicReference a;
    public final defpackage.hb4 b;

    public db4() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            r2.a = r0
            hb4 r0 = new hb4
            r0.<init>()
            r2.b = r0
            return
    }

    public static final void a(defpackage.db4 r3, defpackage.ab4 r4) {
            java.util.concurrent.atomic.AtomicReference r3 = r3.a
        L2:
            java.lang.Object r0 = r3.get()
            ab4 r0 = (defpackage.ab4) r0
            if (r0 == 0) goto L1d
            xa4 r1 = r4.a
            xa4 r2 = r0.a
            int r1 = r1.compareTo(r2)
            if (r1 < 0) goto L15
            goto L1d
        L15:
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.String r4 = "Current mutation had a higher priority"
            r3.<init>(r4)
            throw r3
        L1d:
            boolean r1 = r3.compareAndSet(r0, r4)
            if (r1 == 0) goto L33
            if (r0 == 0) goto L32
            rc3 r3 = r0.b
            vd2 r4 = new vd2
            java.lang.String r0 = "Mutation interrupted"
            r1 = 0
            r4.<init>(r0, r1)
            r3.h(r4)
        L32:
            return
        L33:
            java.lang.Object r1 = r3.get()
            if (r1 == r0) goto L1d
            goto L2
    }

    public static java.lang.Object b(defpackage.db4 r6, defpackage.qn2 r7, defpackage.hw6 r8) {
            xa4 r1 = defpackage.xa4.Default
            r6.getClass()
            ja1 r0 = new ja1
            r4 = 0
            r5 = 7
            r2 = r6
            r3 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r6 = defpackage.g04.C(r0, r8)
            return r6
    }
}
