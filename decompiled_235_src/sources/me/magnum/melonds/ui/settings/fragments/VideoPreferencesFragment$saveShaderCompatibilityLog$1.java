package me.magnum.melonds.ui.settings.fragments;

import android.net.Uri;
import android.widget.Toast;
import com.stormds.emulator.R;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$saveShaderCompatibilityLog$1", f = "VideoPreferencesFragment.kt", l = {1316}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$saveShaderCompatibilityLog$1 extends hw6 implements eo2 {
    public int X;
    public final /* synthetic */ VideoPreferencesFragment Y;
    public final /* synthetic */ Uri Z;
    public final /* synthetic */ List d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPreferencesFragment$saveShaderCompatibilityLog$1(VideoPreferencesFragment videoPreferencesFragment, Uri uri, List list, r41 r41Var) {
        super(2, r41Var);
        this.Y = videoPreferencesFragment;
        this.Z = uri;
        this.d0 = list;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((VideoPreferencesFragment$saveShaderCompatibilityLog$1) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new VideoPreferencesFragment$saveShaderCompatibilityLog$1(this.Y, this.Z, this.d0, r41Var);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        VideoPreferencesFragment videoPreferencesFragment = this.Y;
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
            VideoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1 videoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1 = new VideoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1(videoPreferencesFragment, this.Z, this.d0, null);
            this.X = 1;
            obj = hv.d0(de1Var, videoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1, this);
            if (obj == x61Var) {
                return x61Var;
            }
        }
        String str = (String) obj;
        if (str == null) {
            Toast.makeText(videoPreferencesFragment.requireContext(), (int) R.string.shader_compatibility_report_save_failed, 1).show();
        } else {
            Toast.makeText(videoPreferencesFragment.requireContext(), videoPreferencesFragment.getString(R.string.shader_compatibility_report_saved, str), 1).show();
        }
        return jg7.a;
    }
}
