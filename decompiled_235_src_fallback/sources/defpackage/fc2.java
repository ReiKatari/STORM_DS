package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fc2  reason: default package */
/* loaded from: classes.dex */
public final class fc2 extends defpackage.t0 {
    public final java.util.ArrayDeque L;
    public final /* synthetic */ defpackage.hc2 R;

    public fc2(defpackage.hc2 r3) {
            r2 = this;
            r2.<init>()
            r2.R = r3
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.L = r0
            java.io.File r3 = r3.a
            boolean r1 = r3.isDirectory()
            if (r1 == 0) goto L1c
            ac2 r2 = r2.b(r3)
            r0.push(r2)
            return
        L1c:
            boolean r1 = r3.isFile()
            if (r1 == 0) goto L2e
            cc2 r2 = new cc2
            r3.getClass()
            r2.<init>(r3)
            r0.push(r2)
            return
        L2e:
            r3 = 2
            r2.A = r3
            return
    }

    @Override // defpackage.t0
    public final void a() {
            r4 = this;
        L0:
            java.util.ArrayDeque r0 = r4.L
            java.lang.Object r1 = r0.peek()
            gc2 r1 = (defpackage.gc2) r1
            if (r1 != 0) goto Lc
            r0 = 0
            goto L38
        Lc:
            java.io.File r2 = r1.a()
            if (r2 != 0) goto L16
            r0.pop()
            goto L0
        L16:
            java.io.File r1 = r1.a
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L37
            boolean r1 = r2.isDirectory()
            if (r1 == 0) goto L37
            int r1 = r0.size()
            hc2 r3 = r4.R
            int r3 = r3.d
            if (r1 < r3) goto L2f
            goto L37
        L2f:
            ac2 r1 = r4.b(r2)
            r0.push(r1)
            goto L0
        L37:
            r0 = r2
        L38:
            if (r0 == 0) goto L40
            r4.B = r0
            r0 = 1
            r4.A = r0
            return
        L40:
            r0 = 2
            r4.A = r0
            return
    }

    public final defpackage.ac2 b(java.io.File r3) {
            r2 = this;
            hc2 r0 = r2.R
            ic2 r0 = r0.b
            int[] r1 = defpackage.ec2.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L1d
            r1 = 2
            if (r0 != r1) goto L18
            bc2 r0 = new bc2
            r0.<init>(r2, r3)
            return r0
        L18:
            defpackage.i.d()
            r2 = 0
            return r2
        L1d:
            dc2 r0 = new dc2
            r0.<init>(r2, r3)
            return r0
    }
}
