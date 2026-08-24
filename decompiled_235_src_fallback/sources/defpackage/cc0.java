package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cc0  reason: default package */
/* loaded from: classes.dex */
public final class cc0 implements java.lang.AutoCloseable {
    public final defpackage.o41 A;
    public final java.util.concurrent.CopyOnWriteArrayList B;

    public cc0(defpackage.eb r9, java.lang.String r10) {
            r8 = this;
            r8.<init>()
            java.lang.Object r0 = r9.L
            t57 r0 = (defpackage.t57) r0
            n61 r0 = r0.f
            java.lang.Object r1 = r9.R
            rc3 r1 = (defpackage.rc3) r1
            gu6 r2 = new gu6
            r2.<init>(r1)
            l61 r0 = defpackage.jw2.y(r0, r2)
            o41 r0 = defpackage.g04.i(r0)
            r8.A = r0
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r8.B = r1
            b0 r2 = new b0
            r7 = 10
            r6 = 0
            r5 = r8
            r3 = r9
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r8 = 3
            defpackage.hv.L(r0, r6, r6, r2, r8)
            return
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            o41 r1 = r1.A
            r0 = 0
            defpackage.g04.x(r1, r0)
            return
    }

    public final java.lang.Object e(long r8, defpackage.s41 r10) {
            r7 = this;
            boolean r0 = r10 instanceof defpackage.ac0
            if (r0 == 0) goto L13
            r0 = r10
            ac0 r0 = (defpackage.ac0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ac0 r0 = new ac0
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            java.util.concurrent.CopyOnWriteArrayList r7 = r7.B
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L33
            if (r2 != r5) goto L2d
            tu0 r8 = r0.R
            defpackage.oi2.Y(r10)
            goto L51
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            return r4
        L33:
            defpackage.oi2.Y(r10)
            tu0 r10 = new tu0
            r10.<init>()
            r7.add(r10)
            bc0 r2 = new bc0
            r2.<init>(r10, r4, r3)
            r0.R = r10
            r0.Z = r5
            java.lang.Object r8 = defpackage.xk2.N(r8, r2, r0)
            if (r8 != r1) goto L4e
            return r1
        L4e:
            r6 = r10
            r10 = r8
            r8 = r6
        L51:
            if (r10 == 0) goto L54
            r3 = r5
        L54:
            r7.remove(r8)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
    }
}
