package me.magnum.melonds.ui.settings.fragments;

import android.content.SharedPreferences;
import androidx.preference.ListPreference;
import java.io.File;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$confirmShaderUninstall$1$1", f = "VideoPreferencesFragment.kt", l = {1482}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$confirmShaderUninstall$1$1 extends hw6 implements eo2 {
    public int X;
    public final /* synthetic */ VideoPreferencesFragment Y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$confirmShaderUninstall$1$1$1", f = "VideoPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$confirmShaderUninstall$1$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends hw6 implements eo2 {
        public final /* synthetic */ VideoPreferencesFragment X;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VideoPreferencesFragment videoPreferencesFragment, r41 r41Var) {
            super(2, r41Var);
            this.X = videoPreferencesFragment;
        }

        @Override // defpackage.eo2
        public final Object o(Object obj, Object obj2) {
            jg7 jg7Var = jg7.a;
            ((AnonymousClass1) q((r41) obj2, (w61) obj)).s(jg7Var);
            return jg7Var;
        }

        @Override // defpackage.d20
        public final r41 q(r41 r41Var, Object obj) {
            return new AnonymousClass1(this.X, r41Var);
        }

        @Override // defpackage.d20
        public final Object s(Object obj) {
            x61 x61Var = x61.COROUTINE_SUSPENDED;
            oi2.Y(obj);
            cp5 p = this.X.p();
            jc2.x0(p.d);
            p.e.delete();
            jc2.x0(new File(p.c, "current"));
            p.f.delete();
            SharedPreferences sharedPreferences = p.b;
            sharedPreferences.edit().remove("video_retroarch_shader_preset").apply();
            sharedPreferences.edit().putLong("video_retroarch_shader_library_version", System.currentTimeMillis()).apply();
            return jg7.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPreferencesFragment$confirmShaderUninstall$1$1(VideoPreferencesFragment videoPreferencesFragment, r41 r41Var) {
        super(2, r41Var);
        this.Y = videoPreferencesFragment;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((VideoPreferencesFragment$confirmShaderUninstall$1$1) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new VideoPreferencesFragment$confirmShaderUninstall$1$1(this.Y, r41Var);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(videoPreferencesFragment, null);
            this.X = 1;
            if (hv.d0(de1Var, anonymousClass1, this) == x61Var) {
                return x61Var;
            }
        }
        ListPreference listPreference = videoPreferencesFragment.s0;
        if (listPreference != null) {
            VideoPreferencesFragment.G(videoPreferencesFragment, listPreference, null, true, 2);
        }
        videoPreferencesFragment.s();
        return jg7.a;
    }
}
