package me.magnum.melonds.ui.settings.fragments;

import android.content.SharedPreferences;
import androidx.preference.ListPreference;
import java.io.File;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@v81(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$confirmShaderUninstall$1$1", f = "VideoPreferencesFragment.kt", l = {1331}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$confirmShaderUninstall$1$1 extends nk6 implements aj2 {
    public int X;
    public final /* synthetic */ VideoPreferencesFragment Y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    @v81(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$confirmShaderUninstall$1$1$1", f = "VideoPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$confirmShaderUninstall$1$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends nk6 implements aj2 {
        public final /* synthetic */ VideoPreferencesFragment X;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VideoPreferencesFragment videoPreferencesFragment, j11 j11Var) {
            super(2, j11Var);
            this.X = videoPreferencesFragment;
        }

        @Override // defpackage.aj2
        public final Object j(Object obj, Object obj2) {
            o27 o27Var = o27.a;
            ((AnonymousClass1) t((j11) obj2, (o31) obj)).v(o27Var);
            return o27Var;
        }

        @Override // defpackage.m00
        public final j11 t(j11 j11Var, Object obj) {
            return new AnonymousClass1(this.X, j11Var);
        }

        @Override // defpackage.m00
        public final Object v(Object obj) {
            p31 p31Var = p31.COROUTINE_SUSPENDED;
            me2.a0(obj);
            gf5 o = this.X.o();
            q72.H(o.d);
            o.e.delete();
            q72.H(new File(o.c, "current"));
            o.f.delete();
            SharedPreferences sharedPreferences = o.b;
            sharedPreferences.edit().remove("video_retroarch_shader_preset").apply();
            sharedPreferences.edit().putLong("video_retroarch_shader_library_version", System.currentTimeMillis()).apply();
            return o27.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPreferencesFragment$confirmShaderUninstall$1$1(VideoPreferencesFragment videoPreferencesFragment, j11 j11Var) {
        super(2, j11Var);
        this.Y = videoPreferencesFragment;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((VideoPreferencesFragment$confirmShaderUninstall$1$1) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        return new VideoPreferencesFragment$confirmShaderUninstall$1$1(this.Y, j11Var);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(videoPreferencesFragment, null);
            this.X = 1;
            if (tq5.G(ha1Var, anonymousClass1, this) == p31Var) {
                return p31Var;
            }
        }
        ListPreference listPreference = videoPreferencesFragment.r0;
        if (listPreference != null) {
            VideoPreferencesFragment.D(videoPreferencesFragment, listPreference, null, true, 2);
        }
        videoPreferencesFragment.q();
        return o27.a;
    }
}
