package me.magnum.melonds.ui.settings.fragments;

import android.net.Uri;
import java.io.OutputStream;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1", f = "VideoPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1 extends hw6 implements eo2 {
    public /* synthetic */ Object X;
    public final /* synthetic */ VideoPreferencesFragment Y;
    public final /* synthetic */ Uri Z;
    public final /* synthetic */ List d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1(VideoPreferencesFragment videoPreferencesFragment, Uri uri, List list, r41 r41Var) {
        super(2, r41Var);
        this.Y = videoPreferencesFragment;
        this.Z = uri;
        this.d0 = list;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((VideoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        VideoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1 videoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1 = new VideoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1(this.Y, this.Z, this.d0, r41Var);
        videoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1.X = obj;
        return videoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        OutputStream openOutputStream;
        Object obj2 = "librashader.log";
        w61 w61Var = (w61) this.X;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        VideoPreferencesFragment videoPreferencesFragment = this.Y;
        Uri uri = this.Z;
        List list = this.d0;
        try {
            qi6 h = zl1.h(videoPreferencesFragment.requireContext(), uri);
            zl1 f = h.f("librashader.log");
            if (f != null) {
                f.d();
            }
            zl1 c = h.c("application/octet-stream", "librashader.log");
            if (c == null || (openOutputStream = videoPreferencesFragment.requireContext().getContentResolver().openOutputStream(((qi6) c).c)) == null) {
                obj2 = null;
            } else {
                byte[] bytes = gt0.P0(list, "\n", null, "\n", null, 58).getBytes(qm0.a);
                bytes.getClass();
                openOutputStream.write(bytes);
                openOutputStream.close();
                String i = c.i();
                if (i != null) {
                    obj2 = i;
                }
            }
        } catch (Throwable th) {
            obj2 = new em5(th);
        }
        if (obj2 instanceof em5) {
            return null;
        }
        return obj2;
    }
}
