package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qn  reason: default package */
/* loaded from: classes.dex */
public final class qn extends defpackage.aj3 implements defpackage.qn2 {
    public final /* synthetic */ defpackage.dx4[] B;
    public final /* synthetic */ defpackage.rn L;
    public final /* synthetic */ int R;
    public final /* synthetic */ int X;

    public qn(defpackage.dx4[] r1, defpackage.rn r2, int r3, int r4) {
            r0 = this;
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.X = r4
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            cx4 r1 = (defpackage.cx4) r1
            dx4[] r2 = r0.B
            int r3 = r2.length
            r4 = 0
        La:
            if (r4 >= r3) goto L46
            r5 = r2[r4]
            if (r5 == 0) goto L43
            rn r6 = r0.L
            yn r6 = r6.a
            ic r7 = r6.b
            int r6 = r5.A
            int r8 = r5.B
            long r9 = (long) r6
            r6 = 32
            long r9 = r9 << r6
            long r11 = (long) r8
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r11 = r11 & r13
            long r8 = r9 | r11
            int r10 = r0.R
            long r10 = (long) r10
            long r10 = r10 << r6
            int r12 = r0.X
            r15 = r6
            r17 = r7
            long r6 = (long) r12
            long r6 = r6 & r13
            long r10 = r10 | r6
            kk3 r12 = defpackage.kk3.Ltr
            r7 = r17
            long r6 = r7.a(r8, r10, r12)
            long r8 = r6 >> r15
            int r8 = (int) r8
            long r6 = r6 & r13
            int r6 = (int) r6
            defpackage.cx4.j(r1, r5, r8, r6)
        L43:
            int r4 = r4 + 1
            goto La
        L46:
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}
