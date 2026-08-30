package me.magnum.melonds.ui.settings.fragments;

import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@v81(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$weighPresetAsync$2$weight$1", f = "VideoPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class VideoPreferencesFragment$weighPresetAsync$2$weight$1 extends nk6 implements aj2 {
    public /* synthetic */ Object X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ File Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPreferencesFragment$weighPresetAsync$2$weight$1(String str, File file, j11 j11Var) {
        super(2, j11Var);
        this.Y = str;
        this.Z = file;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((VideoPreferencesFragment$weighPresetAsync$2$weight$1) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        VideoPreferencesFragment$weighPresetAsync$2$weight$1 videoPreferencesFragment$weighPresetAsync$2$weight$1 = new VideoPreferencesFragment$weighPresetAsync$2$weight$1(this.Y, this.Z, j11Var);
        videoPreferencesFragment$weighPresetAsync$2$weight$1.X = obj;
        return videoPreferencesFragment$weighPresetAsync$2$weight$1;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        Object kc5Var;
        o31 o31Var = (o31) this.X;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        me2.a0(obj);
        try {
            kc5Var = jf5.g(this.Y, new i46(this.Z, 1));
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        if (kc5Var instanceof kc5) {
            return null;
        }
        return kc5Var;
    }
}
