package me.magnum.melonds.ui.settings.fragments;

import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$weighPresetAsync$2$weight$1", f = "VideoPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class VideoPreferencesFragment$weighPresetAsync$2$weight$1 extends hw6 implements eo2 {
    public /* synthetic */ Object X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ File Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPreferencesFragment$weighPresetAsync$2$weight$1(String str, File file, r41 r41Var) {
        super(2, r41Var);
        this.Y = str;
        this.Z = file;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((VideoPreferencesFragment$weighPresetAsync$2$weight$1) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        VideoPreferencesFragment$weighPresetAsync$2$weight$1 videoPreferencesFragment$weighPresetAsync$2$weight$1 = new VideoPreferencesFragment$weighPresetAsync$2$weight$1(this.Y, this.Z, r41Var);
        videoPreferencesFragment$weighPresetAsync$2$weight$1.X = obj;
        return videoPreferencesFragment$weighPresetAsync$2$weight$1;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        Object em5Var;
        w61 w61Var = (w61) this.X;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        try {
            em5Var = fp5.g(this.Y, new uf6(this.Z, 1));
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        if (em5Var instanceof em5) {
            return null;
        }
        return em5Var;
    }
}
