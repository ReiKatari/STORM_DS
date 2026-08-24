package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$checkShaderUpdates$1", f = "VideoPreferencesFragment.kt", l = {1456}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$checkShaderUpdates$1 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment Y;

    public VideoPreferencesFragment$checkShaderUpdates$1(me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r1, defpackage.r41 r2) {
            r0 = this;
            r0.Y = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$checkShaderUpdates$1 r0 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$checkShaderUpdates$1) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r1, java.lang.Object r2) {
            r0 = this;
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$checkShaderUpdates$1 r2 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$checkShaderUpdates$1
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r0 = r0.Y
            r2.<init>(r0, r1)
            return r2
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r8.X
            r2 = 0
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r3 = r8.Y
            r4 = 1
            if (r1 == 0) goto L16
            if (r1 != r4) goto L10
            defpackage.oi2.Y(r9)
            goto L2b
        L10:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            return r2
        L16:
            defpackage.oi2.Y(r9)
            xe1 r9 = defpackage.xk1.a
            de1 r9 = defpackage.de1.L
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$checkShaderUpdates$1$remote$1 r1 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$checkShaderUpdates$1$remote$1
            r1.<init>(r3, r2)
            r8.X = r4
            java.lang.Object r9 = defpackage.hv.d0(r9, r1, r8)
            if (r9 != r0) goto L2b
            return r0
        L2b:
            wo5 r9 = (defpackage.wo5) r9
            jg7 r8 = defpackage.jg7.a
            r0 = 0
            if (r9 != 0) goto L39
            xo5 r9 = defpackage.xo5.NoNetwork
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.l(r3, r9, r0)
            return r8
        L39:
            cp5 r5 = r3.p()
            zo5 r5 = r5.h()
            if (r5 != 0) goto L45
        L43:
            r9 = r4
            goto L61
        L45:
            java.lang.String r6 = r9.b
            if (r6 == 0) goto L53
            java.lang.String r7 = r5.b
            if (r7 == 0) goto L53
            boolean r9 = r6.equals(r7)
            r9 = r9 ^ r4
            goto L61
        L53:
            long r6 = r9.a
            int r9 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r9 <= 0) goto L60
            long r0 = r5.c
            int r9 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r9 == 0) goto L60
            goto L43
        L60:
            r9 = 0
        L61:
            if (r9 == 0) goto L87
            zb r9 = new zb
            android.content.Context r0 = r3.requireContext()
            r9.<init>(r0)
            r0 = 2131952868(0x7f1304e4, float:1.954219E38)
            r9.w(r0)
            rm7 r0 = new rm7
            r1 = 3
            r0.<init>(r3, r1)
            r1 = 17039370(0x104000a, float:2.42446E-38)
            r9.y(r1, r0)
            r0 = 17039360(0x1040000, float:2.424457E-38)
            r9.x(r0, r2)
            r9.B()
            return r8
        L87:
            android.content.Context r9 = r3.requireContext()
            r0 = 2131952867(0x7f1304e3, float:1.9542189E38)
            android.widget.Toast r9 = android.widget.Toast.makeText(r9, r0, r4)
            r9.show()
            return r8
    }
}
