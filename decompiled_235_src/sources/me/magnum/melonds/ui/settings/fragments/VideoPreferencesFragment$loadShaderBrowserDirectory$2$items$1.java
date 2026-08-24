package me.magnum.melonds.ui.settings.fragments;

import java.util.ArrayList;
import me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$loadShaderBrowserDirectory$2$items$1", f = "VideoPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class VideoPreferencesFragment$loadShaderBrowserDirectory$2$items$1 extends hw6 implements eo2 {
    public final /* synthetic */ VideoPreferencesFragment.ShaderDirectoryLister X;
    public final /* synthetic */ String Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPreferencesFragment$loadShaderBrowserDirectory$2$items$1(VideoPreferencesFragment.ShaderDirectoryLister shaderDirectoryLister, String str, r41 r41Var) {
        super(2, r41Var);
        this.X = shaderDirectoryLister;
        this.Y = str;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((VideoPreferencesFragment$loadShaderBrowserDirectory$2$items$1) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new VideoPreferencesFragment$loadShaderBrowserDirectory$2$items$1(this.X, this.Y, r41Var);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Comparator] */
    @Override // defpackage.d20
    public final Object s(Object obj) {
        String m;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        VideoPreferencesFragment.ShaderDirectoryLister shaderDirectoryLister = this.X;
        String str = this.Y;
        for (VideoPreferencesFragment.ShaderBrowserEntry shaderBrowserEntry : shaderDirectoryLister.a(str)) {
            if (qs6.v0(str)) {
                m = shaderBrowserEntry.a;
            } else {
                m = lb1.m(str, "/", shaderBrowserEntry.a);
            }
            boolean z = shaderBrowserEntry.b;
            String str2 = shaderBrowserEntry.a;
            if (z) {
                arrayList.add(new vr4(str2, m));
            } else if (xs6.Y(str2, ".slangp", true)) {
                arrayList2.add(new vr4(str2, m));
            }
        }
        kw3 I = hf.I();
        if (!qs6.v0(str)) {
            I.add(new VideoPreferencesFragment.ShaderBrowserItem("..", qs6.R0('/', str, ""), true, true));
        }
        for (vr4 vr4Var : gt0.d1(arrayList, new Object())) {
            I.add(new VideoPreferencesFragment.ShaderBrowserItem((String) vr4Var.A, (String) vr4Var.B, true, false));
        }
        for (vr4 vr4Var2 : gt0.d1(arrayList2, new Object())) {
            I.add(new VideoPreferencesFragment.ShaderBrowserItem(qs6.E0((String) vr4Var2.A, ".slangp"), (String) vr4Var2.B, false, false));
        }
        return hf.A(I);
    }
}
