package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dk5  reason: default package */
/* loaded from: classes.dex */
public final class dk5 implements defpackage.fu3 {
    public final /* synthetic */ defpackage.st3 A;
    public final /* synthetic */ defpackage.dh5 B;
    public final /* synthetic */ defpackage.w61 L;
    public final /* synthetic */ defpackage.st3 R;
    public final /* synthetic */ defpackage.rj0 X;
    public final /* synthetic */ defpackage.hb4 Y;
    public final /* synthetic */ defpackage.eo2 Z;

    public dk5(defpackage.st3 r1, defpackage.dh5 r2, defpackage.w61 r3, defpackage.st3 r4, defpackage.rj0 r5, defpackage.hb4 r6, defpackage.eo2 r7) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            r0.Y = r6
            r0.Z = r7
            return
    }

    @Override // defpackage.fu3
    public final void h(defpackage.hu3 r5, defpackage.st3 r6) {
            r4 = this;
            st3 r5 = r4.A
            dh5 r0 = r4.B
            r1 = 0
            if (r6 != r5) goto L1c
            l5 r5 = new l5
            eo2 r6 = r4.Z
            r2 = 28
            hb4 r3 = r4.Y
            r5.<init>(r3, r6, r1, r2)
            r6 = 3
            w61 r4 = r4.L
            ap6 r4 = defpackage.hv.L(r4, r1, r1, r5, r6)
            r0.A = r4
            return
        L1c:
            st3 r5 = r4.R
            if (r6 != r5) goto L2b
            java.lang.Object r5 = r0.A
            rc3 r5 = (defpackage.rc3) r5
            if (r5 == 0) goto L29
            r5.h(r1)
        L29:
            r0.A = r1
        L2b:
            st3 r5 = defpackage.st3.ON_DESTROY
            if (r6 != r5) goto L36
            rj0 r4 = r4.X
            jg7 r5 = defpackage.jg7.a
            r4.i(r5)
        L36:
            return
    }
}
