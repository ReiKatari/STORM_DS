package me.magnum.melonds.ui.settings.fragments;

import java.util.ArrayList;
import me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@v81(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$loadShaderBrowserDirectory$2$items$1", f = "VideoPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class VideoPreferencesFragment$loadShaderBrowserDirectory$2$items$1 extends nk6 implements aj2 {
    public final /* synthetic */ VideoPreferencesFragment.ShaderDirectoryLister X;
    public final /* synthetic */ String Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPreferencesFragment$loadShaderBrowserDirectory$2$items$1(VideoPreferencesFragment.ShaderDirectoryLister shaderDirectoryLister, String str, j11 j11Var) {
        super(2, j11Var);
        this.X = shaderDirectoryLister;
        this.Y = str;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((VideoPreferencesFragment$loadShaderBrowserDirectory$2$items$1) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        return new VideoPreferencesFragment$loadShaderBrowserDirectory$2$items$1(this.X, this.Y, j11Var);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Comparator] */
    @Override // defpackage.m00
    public final Object v(Object obj) {
        String l;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        me2.a0(obj);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        VideoPreferencesFragment.ShaderDirectoryLister shaderDirectoryLister = this.X;
        String str = this.Y;
        for (VideoPreferencesFragment.ShaderBrowserEntry shaderBrowserEntry : shaderDirectoryLister.a(str)) {
            if (zg6.B0(str)) {
                l = shaderBrowserEntry.a;
            } else {
                l = wh1.l(str, "/", shaderBrowserEntry.a);
            }
            boolean z = shaderBrowserEntry.b;
            String str2 = shaderBrowserEntry.a;
            if (z) {
                arrayList.add(new ti4(str2, l));
            } else if (gh6.f0(str2, ".slangp", true)) {
                arrayList2.add(new ti4(str2, l));
            }
        }
        ip3 C = l07.C();
        if (!zg6.B0(str)) {
            C.add(new VideoPreferencesFragment.ShaderBrowserItem("..", zg6.X0('/', str, ""), true, true));
        }
        for (ti4 ti4Var : tq0.g1(arrayList, new Object())) {
            C.add(new VideoPreferencesFragment.ShaderBrowserItem((String) ti4Var.A, (String) ti4Var.B, true, false));
        }
        for (ti4 ti4Var2 : tq0.g1(arrayList2, new Object())) {
            C.add(new VideoPreferencesFragment.ShaderBrowserItem(zg6.K0((String) ti4Var2.A, ".slangp"), (String) ti4Var2.B, false, false));
        }
        return l07.t(C);
    }
}
