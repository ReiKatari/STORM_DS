package me.magnum.melonds.ui.settings.fragments;

import android.net.Uri;
import java.io.OutputStream;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@v81(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1", f = "VideoPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1 extends nk6 implements aj2 {
    public /* synthetic */ Object X;
    public final /* synthetic */ VideoPreferencesFragment Y;
    public final /* synthetic */ Uri Z;
    public final /* synthetic */ List c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1(VideoPreferencesFragment videoPreferencesFragment, Uri uri, List list, j11 j11Var) {
        super(2, j11Var);
        this.Y = videoPreferencesFragment;
        this.Z = uri;
        this.c0 = list;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((VideoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        VideoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1 videoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1 = new VideoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1(this.Y, this.Z, this.c0, j11Var);
        videoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1.X = obj;
        return videoPreferencesFragment$saveShaderCompatibilityLog$1$savedName$1;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        OutputStream openOutputStream;
        Object obj2 = "librashader.log";
        o31 o31Var = (o31) this.X;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        me2.a0(obj);
        VideoPreferencesFragment videoPreferencesFragment = this.Y;
        Uri uri = this.Z;
        List list = this.c0;
        try {
            c76 h = uh1.h(videoPreferencesFragment.requireContext(), uri);
            uh1 f = h.f("librashader.log");
            if (f != null) {
                f.d();
            }
            uh1 c = h.c("application/octet-stream", "librashader.log");
            if (c == null || (openOutputStream = videoPreferencesFragment.requireContext().getContentResolver().openOutputStream(((c76) c).c)) == null) {
                obj2 = null;
            } else {
                byte[] bytes = tq0.S0(list, "\n", null, "\n", null, 58).getBytes(hk0.a);
                bytes.getClass();
                openOutputStream.write(bytes);
                openOutputStream.close();
                String i = c.i();
                if (i != null) {
                    obj2 = i;
                }
            }
        } catch (Throwable th) {
            obj2 = new kc5(th);
        }
        if (obj2 instanceof kc5) {
            return null;
        }
        return obj2;
    }
}
