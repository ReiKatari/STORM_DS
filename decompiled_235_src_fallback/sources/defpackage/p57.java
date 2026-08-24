package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p57  reason: default package */
/* loaded from: classes.dex */
public class p57 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater b = null;
    private volatile /* synthetic */ int _size$volatile;
    public defpackage.o62[] a;

    static {
            java.lang.Class<p57> r0 = defpackage.p57.class
            java.lang.String r1 = "_size$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            defpackage.p57.b = r0
            return
    }

    public final void a(defpackage.o62 r5) {
            r4 = this;
            r0 = r4
            p62 r0 = (defpackage.p62) r0
            r5.c(r0)
            o62[] r0 = r4.a
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.p57.b
            if (r0 != 0) goto L12
            r0 = 4
            o62[] r0 = new defpackage.o62[r0]
            r4.a = r0
            goto L27
        L12:
            int r2 = r1.get(r4)
            int r3 = r0.length
            if (r2 < r3) goto L27
            int r2 = r1.get(r4)
            int r2 = r2 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            o62[] r0 = (defpackage.o62[]) r0
            r4.a = r0
        L27:
            int r2 = r1.get(r4)
            int r3 = r2 + 1
            r1.set(r4, r3)
            r0[r2] = r5
            r5.B = r2
            r4.c(r2)
            return
    }

    public final defpackage.o62 b(int r9) {
            r8 = this;
            o62[] r0 = r8.a
            r0.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.p57.b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            r4.getClass()
            r5 = r0[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            o62[] r5 = r8.a
            r5.getClass()
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            r6.getClass()
            r7 = r5[r4]
            r7.getClass()
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            r4.getClass()
            r5 = r5[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            r9.getClass()
            r2 = 0
            r9.c(r2)
            r9.B = r3
            int r8 = r1.get(r8)
            r0[r8] = r2
            return r9
    }

    public final void c(int r4) {
            r3 = this;
        L0:
            if (r4 > 0) goto L3
            goto L1c
        L3:
            o62[] r0 = r3.a
            r0.getClass()
            int r1 = r4 + (-1)
            int r1 = r1 / 2
            r2 = r0[r1]
            r2.getClass()
            r0 = r0[r4]
            r0.getClass()
            int r0 = r2.compareTo(r0)
            if (r0 > 0) goto L1d
        L1c:
            return
        L1d:
            r3.d(r4, r1)
            r4 = r1
            goto L0
    }

    public final void d(int r3, int r4) {
            r2 = this;
            o62[] r2 = r2.a
            r2.getClass()
            r0 = r2[r4]
            r0.getClass()
            r1 = r2[r3]
            r1.getClass()
            r2[r3] = r0
            r2[r4] = r1
            r0.B = r3
            r1.B = r4
            return
    }
}
