package me.magnum.melonds.ui.settings.fragments;

import java.io.File;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$weighPresetAsync$2", f = "VideoPreferencesFragment.kt", l = {852}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$weighPresetAsync$2 extends hw6 implements eo2 {
    public int X;
    public final /* synthetic */ VideoPreferencesFragment Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ l d0;
    public final /* synthetic */ File e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPreferencesFragment$weighPresetAsync$2(VideoPreferencesFragment videoPreferencesFragment, String str, l lVar, File file, r41 r41Var) {
        super(2, r41Var);
        this.Y = videoPreferencesFragment;
        this.Z = str;
        this.d0 = lVar;
        this.e0 = file;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((VideoPreferencesFragment$weighPresetAsync$2) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new VideoPreferencesFragment$weighPresetAsync$2(this.Y, this.Z, this.d0, this.e0, r41Var);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        String str = this.Z;
        if (i != 0) {
            if (i == 1) {
                oi2.Y(obj);
            } else {
                defpackage.i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            xe1 xe1Var = xk1.a;
            de1 de1Var = de1.L;
            VideoPreferencesFragment$weighPresetAsync$2$weight$1 videoPreferencesFragment$weighPresetAsync$2$weight$1 = new VideoPreferencesFragment$weighPresetAsync$2$weight$1(str, this.e0, null);
            this.X = 1;
            obj = hv.d0(de1Var, videoPreferencesFragment$weighPresetAsync$2$weight$1, this);
            if (obj == x61Var) {
                return x61Var;
            }
        }
        ep5 ep5Var = (ep5) obj;
        jg7 jg7Var = jg7.a;
        if (ep5Var == null) {
            return jg7Var;
        }
        this.Y.u0.put(str, ep5Var);
        this.d0.g(ep5Var);
        return jg7Var;
    }
}
