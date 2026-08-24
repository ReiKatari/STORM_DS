package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ov6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ov6 implements defpackage.aw {
    public final /* synthetic */ defpackage.qv6 A;
    public final /* synthetic */ defpackage.pv6 B;
    public final /* synthetic */ int L;
    public final /* synthetic */ defpackage.zy R;
    public final /* synthetic */ defpackage.zy X;

    public /* synthetic */ ov6(defpackage.qv6 r1, defpackage.pv6 r2, int r3, defpackage.zy r4, defpackage.zy r5) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            return
    }

    @Override // defpackage.aw, defpackage.mo2
    public final defpackage.gx3 apply(java.lang.Object r9) {
            r8 = this;
            pv6 r0 = r8.B
            r2 = r9
            android.view.Surface r2 = (android.view.Surface) r2
            qv6 r9 = r8.A
            r9.getClass()
            r2.getClass()
            r7 = 1
            r0.d()     // Catch: defpackage.hg1 -> L42
            wv6 r1 = new wv6
            yy r9 = r9.g
            android.util.Size r4 = r9.a
            int r3 = r8.L
            zy r5 = r8.R
            zy r6 = r8.X
            r1.<init>(r2, r3, r4, r5, r6)
            lv6 r8 = new lv6
            r8.<init>(r0, r7)
            uj1 r9 = defpackage.u24.j()
            tb0 r2 = r1.g0
            sb0 r2 = r2.B
            r2.a(r9, r8)
            wv6 r8 = r0.q
            if (r8 != 0) goto L35
            goto L36
        L35:
            r7 = 0
        L36:
            java.lang.String r8 = "Consumer can only be linked once."
            defpackage.np2.A(r8, r7)
            r0.q = r1
            n33 r8 = defpackage.l.z(r1)
            return r8
        L42:
            r0 = move-exception
            r8 = r0
            n33 r9 = new n33
            r9.<init>(r8, r7)
            return r9
    }
}
