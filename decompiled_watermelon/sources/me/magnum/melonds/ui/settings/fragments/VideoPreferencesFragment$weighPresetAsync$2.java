package me.magnum.melonds.ui.settings.fragments;

import java.io.File;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@v81(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$weighPresetAsync$2", f = "VideoPreferencesFragment.kt", l = {794}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$weighPresetAsync$2 extends nk6 implements aj2 {
    public int X;
    public final /* synthetic */ VideoPreferencesFragment Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ l c0;
    public final /* synthetic */ File d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPreferencesFragment$weighPresetAsync$2(VideoPreferencesFragment videoPreferencesFragment, String str, l lVar, File file, j11 j11Var) {
        super(2, j11Var);
        this.Y = videoPreferencesFragment;
        this.Z = str;
        this.c0 = lVar;
        this.d0 = file;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((VideoPreferencesFragment$weighPresetAsync$2) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        return new VideoPreferencesFragment$weighPresetAsync$2(this.Y, this.Z, this.c0, this.d0, j11Var);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.X;
        String str = this.Z;
        if (i != 0) {
            if (i == 1) {
                me2.a0(obj);
            } else {
                defpackage.i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            me2.a0(obj);
            bb1 bb1Var = tg1.a;
            ha1 ha1Var = ha1.L;
            VideoPreferencesFragment$weighPresetAsync$2$weight$1 videoPreferencesFragment$weighPresetAsync$2$weight$1 = new VideoPreferencesFragment$weighPresetAsync$2$weight$1(str, this.d0, null);
            this.X = 1;
            obj = tq5.G(ha1Var, videoPreferencesFragment$weighPresetAsync$2$weight$1, this);
            if (obj == p31Var) {
                return p31Var;
            }
        }
        if5 if5Var = (if5) obj;
        o27 o27Var = o27.a;
        if (if5Var == null) {
            return o27Var;
        }
        this.Y.t0.put(str, if5Var);
        this.c0.n(if5Var);
        return o27Var;
    }
}
