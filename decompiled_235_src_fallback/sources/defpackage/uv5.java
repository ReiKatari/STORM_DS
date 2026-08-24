package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uv5  reason: default package */
/* loaded from: classes.dex */
public final class uv5 implements defpackage.qn2 {
    public final /* synthetic */ defpackage.ue1 A;
    public final /* synthetic */ defpackage.qn2 B;
    public final /* synthetic */ defpackage.qn2 L;
    public final /* synthetic */ defpackage.pq5 R;

    public uv5(defpackage.ue1 r1, defpackage.qn2 r2, defpackage.qn2 r3, defpackage.pq5 r4) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r7) {
            r6 = this;
            wg3 r7 = (defpackage.wg3) r7
            android.view.KeyEvent r7 = r7.a
            r7.getClass()
            int r0 = r7.getAction()
            if (r0 != 0) goto L78
            int r7 = r7.getKeyCode()
            long r0 = defpackage.qo2.e(r7)
            long r2 = defpackage.kg3.I
            boolean r7 = defpackage.kg3.a(r0, r2)
            qn2 r2 = r6.B
            ue1 r3 = r6.A
            if (r7 == 0) goto L3d
            int r6 = r3.k()
            if (r6 <= 0) goto L78
            t52 r6 = defpackage.vv5.getEntries()
            int r7 = r3.k()
            int r7 = r7 + (-1)
            u52 r6 = (defpackage.u52) r6
            java.lang.Object r6 = r6.get(r7)
            r2.g(r6)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L3d:
            long r4 = defpackage.kg3.J
            boolean r7 = defpackage.kg3.a(r0, r4)
            if (r7 == 0) goto L69
            int r6 = r3.k()
            t52 r7 = defpackage.vv5.getEntries()
            int r7 = defpackage.hf.U(r7)
            if (r6 >= r7) goto L78
            t52 r6 = defpackage.vv5.getEntries()
            int r7 = r3.k()
            int r7 = r7 + 1
            u52 r6 = (defpackage.u52) r6
            java.lang.Object r6 = r6.get(r7)
            r2.g(r6)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L69:
            long r2 = defpackage.kg3.M
            boolean r7 = defpackage.kg3.a(r0, r2)
            if (r7 == 0) goto L78
            qn2 r7 = r6.L
            pq5 r6 = r6.R
            r7.g(r6)
        L78:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
    }
}
