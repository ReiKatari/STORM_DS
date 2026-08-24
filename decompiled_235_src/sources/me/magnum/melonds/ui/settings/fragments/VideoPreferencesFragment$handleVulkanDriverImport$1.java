package me.magnum.melonds.ui.settings.fragments;

import android.net.Uri;
import android.widget.Toast;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$handleVulkanDriverImport$1", f = "VideoPreferencesFragment.kt", l = {529}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$handleVulkanDriverImport$1 extends hw6 implements eo2 {
    public int X;
    public final /* synthetic */ VideoPreferencesFragment Y;
    public final /* synthetic */ Uri Z;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ha.values().length];
            try {
                iArr[ha.NotZip.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ha.NoDriver.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ha.AmbiguousDriver.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ha.UnsupportedBuild.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPreferencesFragment$handleVulkanDriverImport$1(VideoPreferencesFragment videoPreferencesFragment, Uri uri, r41 r41Var) {
        super(2, r41Var);
        this.Y = videoPreferencesFragment;
        this.Z = uri;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((VideoPreferencesFragment$handleVulkanDriverImport$1) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new VideoPreferencesFragment$handleVulkanDriverImport$1(this.Y, this.Z, r41Var);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        ia iaVar;
        int i;
        int i2;
        Preference findPreference;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i3 = this.X;
        ha haVar = null;
        VideoPreferencesFragment videoPreferencesFragment = this.Y;
        if (i3 != 0) {
            if (i3 == 1) {
                oi2.Y(obj);
            } else {
                defpackage.i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            xe1 xe1Var = xk1.a;
            de1 de1Var = de1.L;
            VideoPreferencesFragment$handleVulkanDriverImport$1$result$1 videoPreferencesFragment$handleVulkanDriverImport$1$result$1 = new VideoPreferencesFragment$handleVulkanDriverImport$1$result$1(videoPreferencesFragment, this.Z, null);
            this.X = 1;
            obj = hv.d0(de1Var, videoPreferencesFragment$handleVulkanDriverImport$1$result$1, this);
            if (obj == x61Var) {
                return x61Var;
            }
        }
        Object obj2 = ((hm5) obj).A;
        if (!(obj2 instanceof em5)) {
            ja jaVar = (ja) obj2;
            ListPreference listPreference = (ListPreference) videoPreferencesFragment.findPreference("video_vulkan_driver_mode");
            if (listPreference != null && (findPreference = videoPreferencesFragment.findPreference("video_vulkan_driver_remove")) != null) {
                videoPreferencesFragment.K(listPreference, findPreference);
                Toast.makeText(videoPreferencesFragment.requireContext(), videoPreferencesFragment.getString(R.string.video_vulkan_driver_import_success, jaVar.b), 1).show();
            }
        }
        Throwable a = hm5.a(obj2);
        if (a != null) {
            if (a instanceof ia) {
                iaVar = (ia) a;
            } else {
                iaVar = null;
            }
            if (iaVar != null) {
                haVar = iaVar.A;
            }
            if (haVar == null) {
                i = -1;
            } else {
                i = WhenMappings.a[haVar.ordinal()];
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
        return jg7.a;
    }
}
