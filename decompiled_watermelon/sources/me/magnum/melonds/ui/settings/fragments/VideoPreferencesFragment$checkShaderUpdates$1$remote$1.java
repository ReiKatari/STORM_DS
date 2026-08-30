package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@v81(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$checkShaderUpdates$1$remote$1", f = "VideoPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$checkShaderUpdates$1$remote$1 extends nk6 implements aj2 {
    public /* synthetic */ Object X;
    public final /* synthetic */ VideoPreferencesFragment Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPreferencesFragment$checkShaderUpdates$1$remote$1(VideoPreferencesFragment videoPreferencesFragment, j11 j11Var) {
        super(2, j11Var);
        this.Y = videoPreferencesFragment;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((VideoPreferencesFragment$checkShaderUpdates$1$remote$1) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        VideoPreferencesFragment$checkShaderUpdates$1$remote$1 videoPreferencesFragment$checkShaderUpdates$1$remote$1 = new VideoPreferencesFragment$checkShaderUpdates$1$remote$1(this.Y, j11Var);
        videoPreferencesFragment$checkShaderUpdates$1$remote$1.X = obj;
        return videoPreferencesFragment$checkShaderUpdates$1$remote$1;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        Object kc5Var;
        o31 o31Var = (o31) this.X;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        me2.a0(obj);
        try {
            this.Y.o();
            kc5Var = gf5.c();
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        if (kc5Var instanceof kc5) {
            return null;
        }
        return kc5Var;
    }
}
