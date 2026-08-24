package me.magnum.melonds.ui.settings.fragments;

import android.content.Context;
import android.widget.Toast;
import androidx.preference.ListPreference;
import com.stormds.emulator.R;
import java.io.File;
import me.magnum.melonds.domain.model.RetroArchShaderSource;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1", f = "VideoPreferencesFragment.kt", l = {1408}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1 extends hw6 implements eo2 {
    public int X;
    public final /* synthetic */ VideoPreferencesFragment Y;
    public final /* synthetic */ Context Z;
    public final /* synthetic */ File d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1(VideoPreferencesFragment videoPreferencesFragment, Context context, File file, r41 r41Var) {
        super(2, r41Var);
        this.Y = videoPreferencesFragment;
        this.Z = context;
        this.d0 = file;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1(this.Y, this.Z, this.d0, r41Var);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        Context context = this.Z;
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
            File d = videoPreferencesFragment.p().d();
            if (d == null) {
                d = new File(context.getFilesDir(), "shaders/retroarch");
                d.mkdirs();
            }
            xe1 xe1Var = xk1.a;
            de1 de1Var = de1.L;
            VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1$importedCount$1 videoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1$importedCount$1 = new VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1$importedCount$1(this.d0, d, null);
            this.X = 1;
            obj = hv.d0(de1Var, videoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1$importedCount$1, this);
            if (obj == x61Var) {
                return x61Var;
            }
        }
        int intValue = ((Number) obj).intValue();
        videoPreferencesFragment.r(RetroArchShaderSource.INTERNAL);
        videoPreferencesFragment.s();
        Toast.makeText(context, videoPreferencesFragment.getString(R.string.video_retroarch_shader_scan_import_success, new Integer(intValue)), 1).show();
        ListPreference listPreference = videoPreferencesFragment.s0;
        if (listPreference != null) {
            videoPreferencesFragment.y(listPreference);
            return jg7.a;
        }
        nb3.a0("shaderPresetPreference");
        throw null;
    }
}
