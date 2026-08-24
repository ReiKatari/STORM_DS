package me.magnum.melonds.ui.settings.fragments;

import android.widget.Toast;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$checkShaderUpdates$1", f = "VideoPreferencesFragment.kt", l = {1456}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$checkShaderUpdates$1 extends hw6 implements eo2 {
    public int X;
    public final /* synthetic */ VideoPreferencesFragment Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPreferencesFragment$checkShaderUpdates$1(VideoPreferencesFragment videoPreferencesFragment, r41 r41Var) {
        super(2, r41Var);
        this.Y = videoPreferencesFragment;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((VideoPreferencesFragment$checkShaderUpdates$1) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new VideoPreferencesFragment$checkShaderUpdates$1(this.Y, r41Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        boolean z;
        String str;
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
            VideoPreferencesFragment$checkShaderUpdates$1$remote$1 videoPreferencesFragment$checkShaderUpdates$1$remote$1 = new VideoPreferencesFragment$checkShaderUpdates$1$remote$1(videoPreferencesFragment, null);
            this.X = 1;
            obj = hv.d0(de1Var, videoPreferencesFragment$checkShaderUpdates$1$remote$1, this);
            if (obj == x61Var) {
                return x61Var;
            }
        }
        wo5 wo5Var = (wo5) obj;
        jg7 jg7Var = jg7.a;
        if (wo5Var == null) {
            VideoPreferencesFragment.l(videoPreferencesFragment, xo5.NoNetwork, 0L);
            return jg7Var;
        }
        zo5 h = videoPreferencesFragment.p().h();
        if (h != null) {
            String str2 = wo5Var.b;
            if (str2 != null && (str = h.b) != null) {
                z = !str2.equals(str);
            } else {
                long j = wo5Var.a;
                if (j <= 0 || j == h.c) {
                    z = false;
                }
            }
            if (!z) {
                zb zbVar = new zb(videoPreferencesFragment.requireContext());
                zbVar.w(R.string.video_retroarch_shader_update_available);
                zbVar.y(17039370, new rm7(videoPreferencesFragment, 3));
                zbVar.x(17039360, null);
                zbVar.B();
                return jg7Var;
            }
            Toast.makeText(videoPreferencesFragment.requireContext(), (int) R.string.video_retroarch_shader_up_to_date, 1).show();
            return jg7Var;
        }
        z = true;
        if (!z) {
        }
    }
}
