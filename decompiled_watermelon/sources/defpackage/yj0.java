package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yj0  reason: default package */
/* loaded from: classes.dex */
public final class yj0 extends dy5 {
    public final q60 Z;
    public final /* synthetic */ AtomicReferenceArray c0;

    public yj0(long j, yj0 yj0Var, q60 q60Var, int i) {
        super(j, yj0Var, i);
        this.Z = q60Var;
        this.c0 = new AtomicReferenceArray(s60.b * 2);
    }

    @Override // defpackage.dy5
    public final int l() {
        return s60.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
        s(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004b, code lost:
        if (r1 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004d, code lost:
        r4.getClass();
        r6 = r4.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0052, code lost:
        if (r6 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0054, code lost:
        defpackage.oo2.v(r6, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0057, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
        return;
     */
    @Override // defpackage.dy5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r7, defpackage.e31 r8) {
        /*
            r6 = this;
            int r0 = defpackage.s60.b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            int r0 = r7 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r6.c0
            java.lang.Object r0 = r2.get(r0)
        L12:
            java.lang.Object r2 = r6.q(r7)
            boolean r3 = r2 instanceof defpackage.fd7
            q60 r4 = r6.Z
            r5 = 0
            if (r3 != 0) goto L58
            boolean r3 = r2 instanceof defpackage.gd7
            if (r3 == 0) goto L22
            goto L58
        L22:
            an1 r3 = defpackage.s60.j
            if (r2 == r3) goto L48
            an1 r3 = defpackage.s60.k
            if (r2 != r3) goto L2b
            goto L48
        L2b:
            an1 r3 = defpackage.s60.g
            if (r2 == r3) goto L12
            an1 r3 = defpackage.s60.f
            if (r2 != r3) goto L34
            goto L12
        L34:
            an1 r6 = defpackage.s60.i
            if (r2 == r6) goto L79
            an1 r6 = defpackage.s60.d
            if (r2 != r6) goto L3d
            goto L79
        L3d:
            an1 r6 = defpackage.s60.l
            if (r2 != r6) goto L42
            goto L79
        L42:
            java.lang.String r6 = "unexpected state: "
            defpackage.f81.p(r2, r6)
            return
        L48:
            r6.s(r7, r5)
            if (r1 == 0) goto L79
            r4.getClass()
            mi2 r6 = r4.B
            if (r6 == 0) goto L79
            defpackage.oo2.v(r6, r0, r8)
            return
        L58:
            if (r1 == 0) goto L5d
            an1 r3 = defpackage.s60.j
            goto L5f
        L5d:
            an1 r3 = defpackage.s60.k
        L5f:
            boolean r2 = r6.p(r7, r2, r3)
            if (r2 == 0) goto L12
            r6.s(r7, r5)
            r2 = r1 ^ 1
            r6.r(r7, r2)
            if (r1 == 0) goto L79
            r4.getClass()
            mi2 r6 = r4.B
            if (r6 == 0) goto L79
            defpackage.oo2.v(r6, r0, r8)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj0.m(int, e31):void");
    }

    public final boolean p(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.c0;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object q(int i) {
        return this.c0.get((i * 2) + 1);
    }

    public final void r(int i, boolean z) {
        if (z) {
            q60 q60Var = this.Z;
            q60Var.getClass();
            q60Var.W((this.X * s60.b) + i);
        }
        n();
    }

    public final void s(int i, Object obj) {
        this.c0.set(i * 2, obj);
    }

    public final void t(int i, Object obj) {
        this.c0.set((i * 2) + 1, obj);
    }
}
