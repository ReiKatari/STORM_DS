package me.magnum.melonds.ui.settings.fragments;

import android.net.Uri;
import android.widget.Toast;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@v81(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$handleVulkanDriverImport$1", f = "VideoPreferencesFragment.kt", l = {471}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$handleVulkanDriverImport$1 extends nk6 implements aj2 {
    public int X;
    public final /* synthetic */ VideoPreferencesFragment Y;
    public final /* synthetic */ Uri Z;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ga.values().length];
            try {
                iArr[ga.NotZip.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ga.NoDriver.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ga.AmbiguousDriver.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ga.UnsupportedBuild.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPreferencesFragment$handleVulkanDriverImport$1(VideoPreferencesFragment videoPreferencesFragment, Uri uri, j11 j11Var) {
        super(2, j11Var);
        this.Y = videoPreferencesFragment;
        this.Z = uri;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((VideoPreferencesFragment$handleVulkanDriverImport$1) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        return new VideoPreferencesFragment$handleVulkanDriverImport$1(this.Y, this.Z, j11Var);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        ha haVar;
        int i;
        int i2;
        Preference findPreference;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i3 = this.X;
        ga gaVar = null;
        VideoPreferencesFragment videoPreferencesFragment = this.Y;
        if (i3 != 0) {
            if (i3 == 1) {
                me2.a0(obj);
            } else {
                defpackage.i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            me2.a0(obj);
            bb1 bb1Var = tg1.a;
            ha1 ha1Var = ha1.L;
            VideoPreferencesFragment$handleVulkanDriverImport$1$result$1 videoPreferencesFragment$handleVulkanDriverImport$1$result$1 = new VideoPreferencesFragment$handleVulkanDriverImport$1$result$1(videoPreferencesFragment, this.Z, null);
            this.X = 1;
            obj = tq5.G(ha1Var, videoPreferencesFragment$handleVulkanDriverImport$1$result$1, this);
            if (obj == p31Var) {
                return p31Var;
            }
        }
        Object obj2 = ((nc5) obj).A;
        if (!(obj2 instanceof kc5)) {
            ia iaVar = (ia) obj2;
            ListPreference listPreference = (ListPreference) videoPreferencesFragment.findPreference("video_vulkan_driver_mode");
            if (listPreference != null && (findPreference = videoPreferencesFragment.findPreference("video_vulkan_driver_remove")) != null) {
                videoPreferencesFragment.H(listPreference, findPreference);
                Toast.makeText(videoPreferencesFragment.requireContext(), videoPreferencesFragment.getString(R.string.video_vulkan_driver_import_success, iaVar.b), 1).show();
            }
        }
        Throwable a = nc5.a(obj2);
        if (a != null) {
            if (a instanceof ha) {
                haVar = (ha) a;
            } else {
                haVar = null;
            }
            if (haVar != null) {
                gaVar = haVar.A;
            }
            if (gaVar == null) {
                i = -1;
            } else {
                i = WhenMappings.a[gaVar.ordinal()];
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            i2 = R.string.video_vulkan_driver_import_failed;
                        } else {
                            i2 = R.string.video_vulkan_driver_unsupported;
                        }
                    } else {
                        i2 = R.string.video_vulkan_driver_import_ambiguous;
                    }
                } else {
                    i2 = R.string.video_vulkan_driver_import_no_driver;
                }
            } else {
                i2 = R.string.video_vulkan_driver_import_not_zip;
            }
            Toast.makeText(videoPreferencesFragment.requireContext(), i2, 1).show();
        }
        return o27.a;
    }
}
