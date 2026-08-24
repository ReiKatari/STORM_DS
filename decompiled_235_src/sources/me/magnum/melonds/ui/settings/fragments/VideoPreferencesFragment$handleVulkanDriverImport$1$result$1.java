package me.magnum.melonds.ui.settings.fragments;

import android.net.Uri;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$handleVulkanDriverImport$1$result$1", f = "VideoPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$handleVulkanDriverImport$1$result$1 extends hw6 implements eo2 {
    public /* synthetic */ Object X;
    public final /* synthetic */ VideoPreferencesFragment Y;
    public final /* synthetic */ Uri Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPreferencesFragment$handleVulkanDriverImport$1$result$1(VideoPreferencesFragment videoPreferencesFragment, Uri uri, r41 r41Var) {
        super(2, r41Var);
        this.Y = videoPreferencesFragment;
        this.Z = uri;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((VideoPreferencesFragment$handleVulkanDriverImport$1$result$1) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        VideoPreferencesFragment$handleVulkanDriverImport$1$result$1 videoPreferencesFragment$handleVulkanDriverImport$1$result$1 = new VideoPreferencesFragment$handleVulkanDriverImport$1$result$1(this.Y, this.Z, r41Var);
        videoPreferencesFragment$handleVulkanDriverImport$1$result$1.X = obj;
        return videoPreferencesFragment$handleVulkanDriverImport$1$result$1;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        ja em5Var;
        u63 u63Var;
        w61 w61Var = (w61) this.X;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        VideoPreferencesFragment videoPreferencesFragment = this.Y;
        Uri uri = this.Z;
        try {
            u63Var = videoPreferencesFragment.v0;
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        if (u63Var != null) {
            em5Var = u63Var.p(uri);
            return new hm5(em5Var);
        }
        nb3.a0("adrenoVulkanDriverManager");
        throw null;
    }
}
