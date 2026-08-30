package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@v81(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$checkShaderUpdates$1", f = "VideoPreferencesFragment.kt", l = {1305}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$checkShaderUpdates$1 extends nk6 implements aj2 {
    public int X;
    public final /* synthetic */ VideoPreferencesFragment Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPreferencesFragment$checkShaderUpdates$1(VideoPreferencesFragment videoPreferencesFragment, j11 j11Var) {
        super(2, j11Var);
        this.Y = videoPreferencesFragment;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((VideoPreferencesFragment$checkShaderUpdates$1) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        return new VideoPreferencesFragment$checkShaderUpdates$1(this.Y, j11Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r9) {
        /*
            r8 = this;
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r1 = r8.X
            r2 = 0
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r3 = r8.Y
            r4 = 1
            if (r1 == 0) goto L16
            if (r1 != r4) goto L10
            defpackage.me2.a0(r9)
            goto L2b
        L10:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r8)
            return r2
        L16:
            defpackage.me2.a0(r9)
            bb1 r9 = defpackage.tg1.a
            ha1 r9 = defpackage.ha1.L
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$checkShaderUpdates$1$remote$1 r1 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$checkShaderUpdates$1$remote$1
            r1.<init>(r3, r2)
            r8.X = r4
            java.lang.Object r9 = defpackage.tq5.G(r9, r1, r8)
            if (r9 != r0) goto L2b
            return r0
        L2b:
            af5 r9 = (defpackage.af5) r9
            o27 r8 = defpackage.o27.a
            r0 = 0
            if (r9 != 0) goto L39
            bf5 r9 = defpackage.bf5.NoNetwork
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.l(r3, r9, r0)
            return r8
        L39:
            gf5 r5 = r3.o()
            df5 r5 = r5.h()
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
            sb r9 = new sb
            android.content.Context r0 = r3.requireContext()
            r9.<init>(r0)
            r0 = 2131952638(0x7f1303fe, float:1.9541724E38)
            r9.w(r0)
            p87 r0 = new p87
            r1 = 2
            r0.<init>(r3, r1)
            r1 = 17039370(0x104000a, float:2.42446E-38)
            r9.z(r1, r0)
            r0 = 17039360(0x1040000, float:2.424457E-38)
            r9.x(r0, r2)
            r9.C()
            return r8
        L87:
            android.content.Context r9 = r3.requireContext()
            r0 = 2131952637(0x7f1303fd, float:1.9541722E38)
            android.widget.Toast r9 = android.widget.Toast.makeText(r9, r0, r4)
            r9.show()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$checkShaderUpdates$1.v(java.lang.Object):java.lang.Object");
    }
}
