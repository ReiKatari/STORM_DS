package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dl5  reason: default package */
/* loaded from: classes.dex */
public final class dl5 {
    private volatile java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> array;

    public dl5(int r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r0.<init>(r2)
            r1.array = r0
            return
    }

    public final int a() {
            r0 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r0 = r0.array
            int r0 = r0.length()
            return r0
    }

    public final java.lang.Object b(int r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r1 = r1.array
            int r0 = r1.length()
            if (r2 >= r0) goto Ld
            java.lang.Object r1 = r1.get(r2)
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public final void c(int r6, defpackage.t61 r7) {
            r5 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r0 = r5.array
            int r1 = r0.length()
            if (r6 >= r1) goto Lc
            r0.set(r6, r7)
            return
        Lc:
            java.util.concurrent.atomic.AtomicReferenceArray r2 = new java.util.concurrent.atomic.AtomicReferenceArray
            int r3 = r6 + 1
            int r4 = r1 * 2
            if (r3 >= r4) goto L15
            r3 = r4
        L15:
            r2.<init>(r3)
            r3 = 0
        L19:
            if (r3 >= r1) goto L25
            java.lang.Object r4 = r0.get(r3)
            r2.set(r3, r4)
            int r3 = r3 + 1
            goto L19
        L25:
            r2.set(r6, r7)
            r5.array = r2
            return
    }
}
