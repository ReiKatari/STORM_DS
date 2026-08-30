package bd;

import java.util.concurrent.atomic.AtomicReferenceArray;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p extends ed.r {
    public final h X;
    public final /* synthetic */ AtomicReferenceArray Y;

    public p(long j2, p pVar, h hVar, int i2) {
        super(j2, pVar, i2);
        this.X = hVar;
        this.Y = new AtomicReferenceArray(j.f2170b * 2);
    }

    @Override // ed.r
    public final int g() {
        return j.f2170b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0047, code lost:
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004a, code lost:
        if (r0 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004c, code lost:
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004f, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
        return;
     */
    @Override // ed.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r5, cc.g r6) {
        /*
            r4 = this;
            int r6 = bd.j.f2170b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            int r6 = r5 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.Y
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.l(r5)
            boolean r1 = r6 instanceof zc.v1
            bd.h r2 = r4.X
            r3 = 0
            if (r1 != 0) goto L50
            boolean r1 = r6 instanceof bd.y
            if (r1 == 0) goto L21
            goto L50
        L21:
            a0.c r1 = bd.j.f2178j
            if (r6 == r1) goto L47
            a0.c r1 = bd.j.f2179k
            if (r6 != r1) goto L2a
            goto L47
        L2a:
            a0.c r1 = bd.j.f2175g
            if (r6 == r1) goto L11
            a0.c r1 = bd.j.f2174f
            if (r6 != r1) goto L33
            goto L11
        L33:
            a0.c r5 = bd.j.f2177i
            if (r6 == r5) goto L6a
            a0.c r5 = bd.j.f2172d
            if (r6 != r5) goto L3c
            goto L6a
        L3c:
            a0.c r5 = bd.j.f2180l
            if (r6 != r5) goto L41
            goto L6a
        L41:
            java.lang.String r5 = "unexpected state: "
            wa.b.e(r6, r5)
            return
        L47:
            r4.n(r5, r3)
            if (r0 == 0) goto L6a
            r2.getClass()
            return
        L50:
            if (r0 == 0) goto L55
            a0.c r1 = bd.j.f2178j
            goto L57
        L55:
            a0.c r1 = bd.j.f2179k
        L57:
            boolean r6 = r4.k(r5, r6, r1)
            if (r6 == 0) goto L11
            r4.n(r5, r3)
            r6 = r0 ^ 1
            r4.m(r5, r6)
            if (r0 == 0) goto L6a
            r2.getClass()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.p.h(int, cc.g):void");
    }

    public final boolean k(int i2, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i10 = (i2 * 2) + 1;
        do {
            atomicReferenceArray = this.Y;
            if (atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i10) == obj);
        return false;
    }

    public final Object l(int i2) {
        return this.Y.get((i2 * 2) + 1);
    }

    public final void m(int i2, boolean z10) {
        if (z10) {
            h hVar = this.X;
            hVar.getClass();
            hVar.K((this.L * j.f2170b) + i2);
        }
        i();
    }

    public final void n(int i2, Object obj) {
        this.Y.set(i2 * 2, obj);
    }

    public final void o(int i2, Object obj) {
        this.Y.set((i2 * 2) + 1, obj);
    }
}
