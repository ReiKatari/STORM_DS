package me.magnum.melonds.ui.settings.fragments;

import android.widget.TextView;
import java.util.LinkedHashMap;
import java.util.List;
import me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment;
import me.magnum.melondualds.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@v81(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$loadShaderBrowserDirectory$2", f = "VideoPreferencesFragment.kt", l = {747}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class VideoPreferencesFragment$loadShaderBrowserDirectory$2 extends nk6 implements aj2 {
    public int X;
    public final /* synthetic */ LinkedHashMap Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ VideoPreferencesFragment.ShaderBrowserAdapter c0;
    public final /* synthetic */ TextView d0;
    public final /* synthetic */ VideoPreferencesFragment.ShaderDirectoryLister e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPreferencesFragment$loadShaderBrowserDirectory$2(LinkedHashMap linkedHashMap, String str, VideoPreferencesFragment.ShaderBrowserAdapter shaderBrowserAdapter, TextView textView, VideoPreferencesFragment.ShaderDirectoryLister shaderDirectoryLister, j11 j11Var) {
        super(2, j11Var);
        this.Y = linkedHashMap;
        this.Z = str;
        this.c0 = shaderBrowserAdapter;
        this.d0 = textView;
        this.e0 = shaderDirectoryLister;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((VideoPreferencesFragment$loadShaderBrowserDirectory$2) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        return new VideoPreferencesFragment$loadShaderBrowserDirectory$2(this.Y, this.Z, this.c0, this.d0, this.e0, j11Var);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i2 = this.X;
        String str = this.Z;
        if (i2 != 0) {
            if (i2 == 1) {
                me2.a0(obj);
            } else {
                defpackage.i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            me2.a0(obj);
            bb1 bb1Var = tg1.a;
            ha1 ha1Var = ha1.L;
            VideoPreferencesFragment$loadShaderBrowserDirectory$2$items$1 videoPreferencesFragment$loadShaderBrowserDirectory$2$items$1 = new VideoPreferencesFragment$loadShaderBrowserDirectory$2$items$1(this.e0, str, null);
            this.X = 1;
            obj = tq5.G(ha1Var, videoPreferencesFragment$loadShaderBrowserDirectory$2$items$1, this);
            if (obj == p31Var) {
                return p31Var;
            }
        }
        List list = (List) obj;
        this.Y.put(str, list);
        this.c0.h(list);
        TextView textView = this.d0;
        textView.setText(R.string.video_retroarch_shader_browser_empty);
        if (list.isEmpty()) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        return o27.a;
    }
}
