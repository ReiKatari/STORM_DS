package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ii  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ii extends defpackage.po2 implements defpackage.qn2 {
    public final /* synthetic */ defpackage.et3 d0;

    public ii(defpackage.et3 r7) {
            r6 = this;
            r6.d0 = r7
            java.lang.String r4 = "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V"
            r5 = 0
            r1 = 1
            java.lang.Class<mb3> r2 = defpackage.mb3.class
            java.lang.String r3 = "localToScreen"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r2) {
            r1 = this;
            v24 r2 = (defpackage.v24) r2
            float[] r2 = r2.a
            et3 r1 = r1.d0
            vs4 r1 = r1.n0
            java.lang.Object r1 = r1.getValue()
            jk3 r1 = (defpackage.jk3) r1
            if (r1 == 0) goto L1e
            boolean r0 = r1.t()
            if (r0 == 0) goto L17
            goto L18
        L17:
            r1 = 0
        L18:
            if (r1 != 0) goto L1b
            goto L1e
        L1b:
            r1.k(r2)
        L1e:
            jg7 r1 = defpackage.jg7.a
            return r1
    }
}
