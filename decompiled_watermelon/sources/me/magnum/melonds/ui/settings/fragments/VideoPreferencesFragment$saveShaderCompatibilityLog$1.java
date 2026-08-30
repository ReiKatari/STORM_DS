package me.magnum.melonds.ui.settings.fragments;

import android.net.Uri;
import android.widget.Toast;
import java.util.List;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@v81(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$saveShaderCompatibilityLog$1", f = "VideoPreferencesFragment.kt", l = {1204}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$saveShaderCompatibilityLog$1 extends nk6 implements aj2 {
    public int X;
    public final /* synthetic */ VideoPreferencesFragment Y;
    public final /* synthetic */ Uri Z;
    public final /* synthetic */ List c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPreferencesFragment$saveShaderCompatibilityLog$1(VideoPreferencesFragment videoPreferencesFragment, Uri uri, List list, j11 j11Var) {
        super(2, j11Var);
        this.Y = videoPreferencesFragment;
        this.Z = uri;
        this.c0 = list;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((VideoPreferencesFragment$saveShaderCompatibilityLog$1) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        return new VideoPreferencesFragment$saveShaderCompatibilityLog$1(this.Y, this.Z, this.c0, j11Var);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.X;
        VideoPreferencesFragment videoPreferencesFragment = this.Y;
        if (i != 0) {
            if (i == 1) {
                me2.a0(obj);
            } else {
                defpackage.i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            me2.a0(obj);
            bb1 bb1Var = tg1.a;
            ha1 ha1Var = ha1.L;
            VideoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1 videoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1 = new VideoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1(videoPreferencesFragment, this.Z, this.c0, null);
            this.X = 1;
            obj = tq5.G(ha1Var, videoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1, this);
            if (obj == p31Var) {
                return p31Var;
            }
        }
        String str = (String) obj;
        if (str == null) {
            Toast.makeText(videoPreferencesFragment.requireContext(), (int) R.string.shader_compatibility_report_save_failed, 1).show();
        } else {
            Toast.makeText(videoPreferencesFragment.requireContext(), videoPreferencesFragment.getString(R.string.shader_compatibility_report_saved, str), 1).show();
        }
        return o27.a;
    }
}
