package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gx2  reason: default package */
/* loaded from: classes.dex */
public class gx2 extends defpackage.l21 {
    public defpackage.l21[] t0;
    public int u0;

    public gx2() {
            r1 = this;
            r1.<init>()
            r0 = 4
            l21[] r0 = new defpackage.l21[r0]
            r1.t0 = r0
            r0 = 0
            r1.u0 = r0
            return
    }

    public final void S(defpackage.l21 r4) {
            r3 = this;
            if (r4 == r3) goto L23
            if (r4 != 0) goto L5
            goto L23
        L5:
            int r0 = r3.u0
            int r0 = r0 + 1
            l21[] r1 = r3.t0
            int r2 = r1.length
            if (r0 <= r2) goto L19
            int r0 = r1.length
            int r0 = r0 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            l21[] r0 = (defpackage.l21[]) r0
            r3.t0 = r0
        L19:
            l21[] r0 = r3.t0
            int r1 = r3.u0
            r0[r1] = r4
            int r1 = r1 + 1
            r3.u0 = r1
        L23:
            return
    }

    public final void T(int r6, defpackage.zs7 r7, java.util.ArrayList r8) {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r5.u0
            if (r1 >= r2) goto L19
            l21[] r2 = r5.t0
            r2 = r2[r1]
            java.util.ArrayList r3 = r7.a
            boolean r4 = r3.contains(r2)
            if (r4 == 0) goto L13
            goto L16
        L13:
            r3.add(r2)
        L16:
            int r1 = r1 + 1
            goto L2
        L19:
            int r1 = r5.u0
            if (r0 >= r1) goto L27
            l21[] r1 = r5.t0
            r1 = r1[r0]
            defpackage.kj2.x(r1, r6, r8, r7)
            int r0 = r0 + 1
            goto L19
        L27:
            return
    }

    public void U() {
            r0 = this;
            return
    }

    @Override // defpackage.l21
    public void g(defpackage.l21 r4, java.util.HashMap r5) {
            r3 = this;
            super.g(r4, r5)
            gx2 r4 = (defpackage.gx2) r4
            r0 = 0
            r3.u0 = r0
            int r1 = r4.u0
        La:
            if (r0 >= r1) goto L1c
            l21[] r2 = r4.t0
            r2 = r2[r0]
            java.lang.Object r2 = r5.get(r2)
            l21 r2 = (defpackage.l21) r2
            r3.S(r2)
            int r0 = r0 + 1
            goto La
        L1c:
            return
    }
}
