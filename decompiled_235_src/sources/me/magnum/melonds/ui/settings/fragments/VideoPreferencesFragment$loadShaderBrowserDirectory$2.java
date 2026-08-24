package me.magnum.melonds.ui.settings.fragments;

import android.widget.TextView;
import com.stormds.emulator.R;
import java.util.LinkedHashMap;
import java.util.List;
import me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$loadShaderBrowserDirectory$2", f = "VideoPreferencesFragment.kt", l = {805}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class VideoPreferencesFragment$loadShaderBrowserDirectory$2 extends hw6 implements eo2 {
    public int X;
    public final /* synthetic */ LinkedHashMap Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ VideoPreferencesFragment.ShaderBrowserAdapter d0;
    public final /* synthetic */ TextView e0;
    public final /* synthetic */ VideoPreferencesFragment.ShaderDirectoryLister f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPreferencesFragment$loadShaderBrowserDirectory$2(LinkedHashMap linkedHashMap, String str, VideoPreferencesFragment.ShaderBrowserAdapter shaderBrowserAdapter, TextView textView, VideoPreferencesFragment.ShaderDirectoryLister shaderDirectoryLister, r41 r41Var) {
        super(2, r41Var);
        this.Y = linkedHashMap;
        this.Z = str;
        this.d0 = shaderBrowserAdapter;
        this.e0 = textView;
        this.f0 = shaderDirectoryLister;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((VideoPreferencesFragment$loadShaderBrowserDirectory$2) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new VideoPreferencesFragment$loadShaderBrowserDirectory$2(this.Y, this.Z, this.d0, this.e0, this.f0, r41Var);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i2 = this.X;
        String str = this.Z;
        if (i2 != 0) {
            if (i2 == 1) {
                oi2.Y(obj);
            } else {
                defpackage.i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            xe1 xe1Var = xk1.a;
            de1 de1Var = de1.L;
            VideoPreferencesFragment$loadShaderBrowserDirectory$2$items$1 videoPreferencesFragment$loadShaderBrowserDirectory$2$items$1 = new VideoPreferencesFragment$loadShaderBrowserDirectory$2$items$1(this.f0, str, null);
            this.X = 1;
            obj = hv.d0(de1Var, videoPreferencesFragment$loadShaderBrowserDirectory$2$items$1, this);
            if (obj == x61Var) {
                return x61Var;
            }
        }
        List list = (List) obj;
        this.Y.put(str, list);
        this.d0.h(list);
        TextView textView = this.e0;
        textView.setText(R.string.video_retroarch_shader_browser_empty);
        if (list.isEmpty()) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        return jg7.a;
    }
}
