package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: et  reason: default package */
/* loaded from: classes.dex */
public final class et extends defpackage.hw6 implements defpackage.fo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ java.lang.Object Z;

    public /* synthetic */ et(int r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r3 = this;
            int r3 = r3.X
            jg7 r0 = defpackage.jg7.a
            r1 = 3
            switch(r3) {
                case 0: goto L52;
                case 1: goto L39;
                case 2: goto L20;
                default: goto L8;
            }
        L8:
            xf6 r4 = (defpackage.xf6) r4
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r3 = r5.booleanValue()
            r41 r6 = (defpackage.r41) r6
            et r5 = new et
            r5.<init>(r1, r6, r1)
            r5.Z = r4
            r5.Y = r3
            java.lang.Object r3 = r5.s(r0)
            return r3
        L20:
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r3 = r5.booleanValue()
            r41 r6 = (defpackage.r41) r6
            et r5 = new et
            r2 = 2
            r5.<init>(r1, r6, r2)
            r5.Z = r4
            r5.Y = r3
            java.lang.Object r3 = r5.s(r0)
            return r3
        L39:
            me.magnum.melonds.domain.model.RendererConfiguration r4 = (me.magnum.melonds.domain.model.RendererConfiguration) r4
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r3 = r5.booleanValue()
            r41 r6 = (defpackage.r41) r6
            et r5 = new et
            r2 = 1
            r5.<init>(r1, r6, r2)
            r5.Z = r4
            r5.Y = r3
            java.lang.Object r3 = r5.s(r0)
            return r3
        L52:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r3 = r4.booleanValue()
            android.net.Uri[] r5 = (android.net.Uri[]) r5
            r41 r6 = (defpackage.r41) r6
            et r4 = new et
            r2 = 0
            r4.<init>(r1, r6, r2)
            r4.Y = r3
            r4.Z = r5
            java.lang.Object r3 = r4.s(r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.X
            switch(r0) {
                case 0: goto L46;
                case 1: goto L31;
                case 2: goto L20;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r8.Z
            xf6 r0 = (defpackage.xf6) r0
            boolean r7 = r8.Y
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r9)
            boolean r2 = r0.a
            float r3 = r0.b
            float r4 = r0.c
            boolean r5 = r0.d
            boolean r6 = r0.e
            xf6 r1 = new xf6
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        L20:
            java.lang.Object r0 = r8.Z
            java.util.Map r0 = (java.util.Map) r0
            boolean r8 = r8.Y
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r9)
            if (r8 == 0) goto L2e
            goto L30
        L2e:
            zt1 r0 = defpackage.zt1.A
        L30:
            return r0
        L31:
            java.lang.Object r0 = r8.Z
            me.magnum.melonds.domain.model.RendererConfiguration r0 = (me.magnum.melonds.domain.model.RendererConfiguration) r0
            boolean r8 = r8.Y
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r9)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            vr4 r9 = new vr4
            r9.<init>(r0, r8)
            return r9
        L46:
            boolean r0 = r8.Y
            java.lang.Object r8 = r8.Z
            android.net.Uri[] r8 = (android.net.Uri[]) r8
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r9)
            if (r0 == 0) goto L5a
            java.lang.Object r8 = defpackage.fv.E0(r8)
            android.net.Uri r8 = (android.net.Uri) r8
            goto L5b
        L5a:
            r8 = 0
        L5b:
            return r8
    }
}
