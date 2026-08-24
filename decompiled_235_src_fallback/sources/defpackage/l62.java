package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l62  reason: default package */
/* loaded from: classes.dex */
public abstract class l62 extends defpackage.n61 {
    public static final /* synthetic */ int Y = 0;
    public long L;
    public boolean R;
    public defpackage.pu X;

    @Override // defpackage.n61
    public final defpackage.n61 m0(int r1) {
            r0 = this;
            r1 = 1
            defpackage.kn2.u(r1)
            return r0
    }

    public final void n0(boolean r5) {
            r4 = this;
            long r0 = r4.L
            if (r5 == 0) goto La
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            goto Lc
        La:
            r2 = 1
        Lc:
            long r0 = r0 - r2
            r4.L = r0
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L16
            goto L1d
        L16:
            boolean r5 = r4.R
            if (r5 == 0) goto L1d
            r4.shutdown()
        L1d:
            return
    }

    public final void o0(defpackage.qk1 r2) {
            r1 = this;
            pu r0 = r1.X
            if (r0 != 0) goto Lb
            pu r0 = new pu
            r0.<init>()
            r1.X = r0
        Lb:
            r0.addLast(r2)
            return
    }

    public final void p0(boolean r5) {
            r4 = this;
            long r0 = r4.L
            if (r5 == 0) goto La
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            goto Lc
        La:
            r2 = 1
        Lc:
            long r2 = r2 + r0
            r4.L = r2
            if (r5 != 0) goto L14
            r5 = 1
            r4.R = r5
        L14:
            return
    }

    public abstract long q0();

    public final boolean r0() {
            r1 = this;
            pu r1 = r1.X
            if (r1 != 0) goto L5
            goto L15
        L5:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Ld
            r1 = 0
            goto L11
        Ld:
            java.lang.Object r1 = r1.removeFirst()
        L11:
            qk1 r1 = (defpackage.qk1) r1
            if (r1 != 0) goto L17
        L15:
            r1 = 0
            return r1
        L17:
            r1.run()
            r1 = 1
            return r1
    }

    public abstract void shutdown();
}
