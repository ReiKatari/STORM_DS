package me.magnum.melonds.ui.settings.fragments;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;
import com.stormds.emulator.R;
import java.io.File;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1", f = "VideoPreferencesFragment.kt", l = {1391}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$scanAndImportRetroArchShaders$1 extends hw6 implements eo2 {
    public int X;
    public final /* synthetic */ Context Y;
    public final /* synthetic */ VideoPreferencesFragment Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPreferencesFragment$scanAndImportRetroArchShaders$1(Context context, VideoPreferencesFragment videoPreferencesFragment, r41 r41Var) {
        super(2, r41Var);
        this.Y = context;
        this.Z = videoPreferencesFragment;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((VideoPreferencesFragment$scanAndImportRetroArchShaders$1) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new VideoPreferencesFragment$scanAndImportRetroArchShaders$1(this.Y, this.Z, r41Var);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i != 0) {
            if (i == 1) {
                oi2.Y(obj);
            } else {
                defpackage.i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            List c0 = hf.c0("/storage/emulated/0/RetroArch/shaders", "/storage/emulated/0/RetroArch/shaders_slang", "/storage/emulated/0/Android/data/com.retroarch/files/shaders", "/storage/emulated/0/Android/data/com.retroarch.aarch64/files/shaders", "/storage/emulated/0/Android/data/com.retroarch.ra32/files/shaders", "/storage/emulated/0/Download/shaders", "/storage/emulated/0/shaders");
            xe1 xe1Var = xk1.a;
            de1 de1Var = de1.L;
            VideoPreferencesFragment$scanAndImportRetroArchShaders$1$foundDir$1 videoPreferencesFragment$scanAndImportRetroArchShaders$1$foundDir$1 = new VideoPreferencesFragment$scanAndImportRetroArchShaders$1$foundDir$1(c0, null);
            this.X = 1;
            obj = hv.d0(de1Var, videoPreferencesFragment$scanAndImportRetroArchShaders$1$foundDir$1, this);
            if (obj == x61Var) {
                return x61Var;
            }
        }
        final File file = (File) obj;
        jg7 jg7Var = jg7.a;
        final Context context = this.Y;
        if (file == null) {
            Toast.makeText(context, (int) R.string.video_retroarch_shader_scan_not_found, 1).show();
            return jg7Var;
        }
        zb zbVar = new zb(context);
        zbVar.z(R.string.video_retroarch_shader_scan_found_title);
        final VideoPreferencesFragment videoPreferencesFragment = this.Z;
        ((wb) zbVar.L).f = videoPreferencesFragment.getString(R.string.video_retroarch_shader_scan_found_msg, file.getAbsolutePath());
        zbVar.y(R.string.ok, new DialogInterface.OnClickListener() { // from class: me.magnum.melonds.ui.settings.fragments.m
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                VideoPreferencesFragment videoPreferencesFragment2 = VideoPreferencesFragment.this;
                hv.L(bl2.C(videoPreferencesFragment2), null, null, new VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1(videoPreferencesFragment2, context, file, null), 3);
            }
        });
        zbVar.x(17039360, null);
        zbVar.B();
        return jg7Var;
    }
}
