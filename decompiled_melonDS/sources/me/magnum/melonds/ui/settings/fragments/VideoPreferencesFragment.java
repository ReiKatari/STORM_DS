package me.magnum.melonds.ui.settings.fragments;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.os.Bundle;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import java.util.ArrayList;
import m9.o;
import me.magnum.melonds.R;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
import yb.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class VideoPreferencesFragment extends Hilt_VideoPreferencesFragment implements ci.l {
    public sd.i Z;

    /* renamed from: b0  reason: collision with root package name */
    public sd.d f9616b0;
    public final n Y = new n(new e(this, 5));

    /* renamed from: c0  reason: collision with root package name */
    public final ArrayList f9617c0 = new ArrayList();

    /* renamed from: d0  reason: collision with root package name */
    public final ArrayList f9618d0 = new ArrayList();

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final class Companion {
    }

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9619a;

        static {
            int[] iArr = new int[VideoRenderer.values().length];
            try {
                iArr[VideoRenderer.SOFTWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoRenderer.OPENGL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9619a = iArr;
        }
    }

    @Override // ci.l
    public final String getTitle() {
        String string = getString(R.string.category_video);
        string.getClass();
        return string;
    }

    public final void i(String str) {
        int i2 = WhenMappings.f9619a[((VideoRenderer) pc.a.t(str, VideoRenderer.values())).ordinal()];
        ArrayList arrayList = this.f9618d0;
        int i10 = 0;
        ArrayList arrayList2 = this.f9617c0;
        if (i2 != 1) {
            if (i2 == 2) {
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    ((Preference) obj).setVisible(false);
                }
                int size2 = arrayList.size();
                while (i10 < size2) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    ((Preference) obj2).setVisible(true);
                }
                return;
            }
            o.o();
            return;
        }
        int size3 = arrayList2.size();
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList2.get(i12);
            i12++;
            ((Preference) obj3).setVisible(true);
        }
        int size4 = arrayList.size();
        int i13 = 0;
        while (i13 < size4) {
            Object obj4 = arrayList.get(i13);
            i13++;
            ((Preference) obj4).setVisible(false);
        }
    }

    @Override // androidx.preference.a0
    public final void onCreatePreferences(Bundle bundle, String str) {
        int i2;
        ConfigurationInfo deviceConfigurationInfo;
        setPreferencesFromResource(R.xml.pref_video, str);
        Preference findPreference = findPreference("enable_threaded_rendering");
        findPreference.getClass();
        this.f9617c0.add(findPreference);
        Preference findPreference2 = findPreference("video_internal_resolution");
        findPreference2.getClass();
        this.f9618d0.add(findPreference2);
        Preference findPreference3 = findPreference("video_renderer");
        findPreference3.getClass();
        ListPreference listPreference = (ListPreference) findPreference3;
        Preference findPreference4 = findPreference("dsi_camera_source");
        findPreference4.getClass();
        ListPreference listPreference2 = (ListPreference) findPreference4;
        Preference findPreference5 = findPreference("dsi_camera_static_image");
        findPreference5.getClass();
        StoragePickerPreference storagePickerPreference = (StoragePickerPreference) findPreference5;
        Context requireContext = requireContext();
        requireContext.getClass();
        ActivityManager activityManager = (ActivityManager) requireContext.getSystemService(ActivityManager.class);
        boolean z10 = false;
        if (activityManager != null && (deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo()) != null) {
            i2 = deviceConfigurationInfo.reqGlEsVersion;
        } else {
            i2 = 0;
        }
        if (i2 >= 196610) {
            listPreference.setOnPreferenceChangeListener(new a(5, this));
        } else {
            listPreference.setVisible(false);
        }
        listPreference2.setOnPreferenceChangeListener(new a(this, storagePickerPreference));
        ((ci.k) this.Y.getValue()).b(storagePickerPreference);
        String str2 = listPreference.f1518c0;
        str2.getClass();
        i(str2);
        String str3 = listPreference2.f1518c0;
        str3.getClass();
        if (((qe.a) pc.a.t(str3, qe.a.values())) == qe.a.STATIC_IMAGE) {
            z10 = true;
        }
        storagePickerPreference.setEnabled(z10);
    }
}
