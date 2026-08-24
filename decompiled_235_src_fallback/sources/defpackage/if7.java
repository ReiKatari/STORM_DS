package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: if7  reason: default package */
/* loaded from: classes.dex */
public final class if7 extends defpackage.hw6 implements defpackage.io2 {
    public /* synthetic */ defpackage.my4 X;
    public /* synthetic */ defpackage.d83 Y;
    public /* synthetic */ defpackage.ko4 Z;
    public /* synthetic */ java.util.List d0;
    public /* synthetic */ defpackage.ok3 e0;

    public if7(defpackage.r41 r2) {
            r1 = this;
            r0 = 6
            r1.<init>(r0, r2)
            return
    }

    @Override // defpackage.io2
    public final java.lang.Object n(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r0 = this;
            my4 r1 = (defpackage.my4) r1
            d83 r2 = (defpackage.d83) r2
            ko4 r3 = (defpackage.ko4) r3
            java.util.List r4 = (java.util.List) r4
            ok3 r5 = (defpackage.ok3) r5
            r41 r6 = (defpackage.r41) r6
            if7 r0 = new if7
            r0.<init>(r6)
            r0.X = r1
            r0.Y = r2
            r0.Z = r3
            r0.d0 = r4
            r0.e0 = r5
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r10) {
            r9 = this;
            my4 r1 = r9.X
            d83 r2 = r9.Y
            ko4 r3 = r9.Z
            java.util.List r4 = r9.d0
            ok3 r9 = r9.e0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r10)
            r10 = 0
            if (r9 != 0) goto L25
            if (r1 == 0) goto L27
            ok3 r9 = new ok3
            mk3 r0 = new mk3
            lk3 r5 = defpackage.lk3.BUILT_IN
            int r6 = r1.a
            int r7 = r1.b
            r8 = 0
            r0.<init>(r8, r5, r6, r7)
            r9.<init>(r0, r10)
        L25:
            r5 = r9
            goto L28
        L27:
            r5 = r10
        L28:
            if (r1 == 0) goto L35
            if (r3 == 0) goto L35
            if (r5 != 0) goto L2f
            goto L35
        L2f:
            jf7 r0 = new jf7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L35:
            return r10
    }
}
