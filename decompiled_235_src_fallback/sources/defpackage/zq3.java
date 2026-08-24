package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zq3  reason: default package */
/* loaded from: classes.dex */
public final class zq3 extends defpackage.z64 implements defpackage.va6 {
    public defpackage.on2 k0;
    public defpackage.tq3 l0;
    public defpackage.lo4 m0;
    public boolean n0;
    public defpackage.e76 o0;
    public final defpackage.xq3 p0;
    public defpackage.xq3 q0;

    public zq3(defpackage.on2 r1, defpackage.tq3 r2, defpackage.lo4 r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.k0 = r1
            r0.l0 = r2
            r0.m0 = r3
            r0.n0 = r4
            xq3 r1 = new xq3
            r2 = 0
            r1.<init>(r0, r2)
            r0.p0 = r1
            r0.R0()
            return
    }

    @Override // defpackage.va6
    public final void A0(defpackage.gb6 r8) {
            r7 = this;
            fg3[] r0 = defpackage.eb6.a
            fb6 r0 = defpackage.bb6.n
            fg3[] r1 = defpackage.eb6.a
            r2 = 6
            r2 = r1[r2]
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r8.a(r0, r2)
            xq3 r0 = r7.p0
            fb6 r2 = defpackage.bb6.N
            r8.a(r2, r0)
            lo4 r0 = r7.m0
            lo4 r2 = defpackage.lo4.Vertical
            e76 r3 = r7.o0
            java.lang.String r4 = "scrollAxisRange"
            r5 = 0
            if (r0 != r2) goto L30
            if (r3 == 0) goto L2c
            fb6 r0 = defpackage.bb6.w
            r2 = 13
            r2 = r1[r2]
            r8.a(r0, r3)
            goto L3b
        L2c:
            defpackage.nb3.a0(r4)
            throw r5
        L30:
            if (r3 == 0) goto L70
            fb6 r0 = defpackage.bb6.v
            r2 = 12
            r2 = r1[r2]
            r8.a(r0, r3)
        L3b:
            xq3 r0 = r7.q0
            if (r0 == 0) goto L49
            fb6 r2 = defpackage.sa6.f
            y1 r3 = new y1
            r3.<init>(r5, r0)
            r8.a(r2, r3)
        L49:
            yq3 r0 = new yq3
            r2 = 2
            r0.<init>(r7, r2)
            fb6 r2 = defpackage.sa6.C
            y1 r3 = new y1
            mc r4 = new mc
            r6 = 23
            r4.<init>(r0, r6)
            r3.<init>(r5, r4)
            r8.a(r2, r3)
            tq3 r7 = r7.l0
            bt0 r7 = r7.e()
            fb6 r0 = defpackage.bb6.f
            r2 = 24
            r1 = r1[r2]
            r8.a(r0, r7)
            return
        L70:
            defpackage.nb3.a0(r4)
            throw r5
    }

    @Override // defpackage.z64
    public final boolean G0() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final void R0() {
            r4 = this;
            e76 r0 = new e76
            yq3 r1 = new yq3
            r2 = 0
            r1.<init>(r4, r2)
            yq3 r2 = new yq3
            r3 = 1
            r2.<init>(r4, r3)
            r0.<init>(r1, r2)
            r4.o0 = r0
            boolean r0 = r4.n0
            if (r0 == 0) goto L1e
            xq3 r0 = new xq3
            r1 = 1
            r0.<init>(r4, r1)
            goto L1f
        L1e:
            r0 = 0
        L1f:
            r4.q0 = r0
            return
    }
}
