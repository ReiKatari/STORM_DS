package me.magnum.melonds.ui.settings.fragments;

import android.net.Uri;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@v81(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$handleVulkanDriverImport$1$result$1", f = "VideoPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$handleVulkanDriverImport$1$result$1 extends nk6 implements aj2 {
    public /* synthetic */ Object X;
    public final /* synthetic */ VideoPreferencesFragment Y;
    public final /* synthetic */ Uri Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPreferencesFragment$handleVulkanDriverImport$1$result$1(VideoPreferencesFragment videoPreferencesFragment, Uri uri, j11 j11Var) {
        super(2, j11Var);
        this.Y = videoPreferencesFragment;
        this.Z = uri;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((VideoPreferencesFragment$handleVulkanDriverImport$1$result$1) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        VideoPreferencesFragment$handleVulkanDriverImport$1$result$1 videoPreferencesFragment$handleVulkanDriverImport$1$result$1 = new VideoPreferencesFragment$handleVulkanDriverImport$1$result$1(this.Y, this.Z, j11Var);
        videoPreferencesFragment$handleVulkanDriverImport$1$result$1.X = obj;
        return videoPreferencesFragment$handleVulkanDriverImport$1$result$1;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        ia kc5Var;
        q03 q03Var;
        o31 o31Var = (o31) this.X;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        me2.a0(obj);
        VideoPreferencesFragment videoPreferencesFragment = this.Y;
        Uri uri = this.Z;
        try {
            q03Var = videoPreferencesFragment.u0;
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        if (q03Var != null) {
            kc5Var = q03Var.n(uri);
            return new nc5(kc5Var);
        }
        b53.g0("adrenoVulkanDriverManager");
        throw null;
    }
}
