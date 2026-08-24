package defpackage;

import android.net.Uri;
import android.widget.Toast;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import java.util.Set;
import me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qm7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qm7 implements x05 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ListPreference b;
    public final /* synthetic */ VideoPreferencesFragment c;

    public /* synthetic */ qm7(VideoPreferencesFragment videoPreferencesFragment, ListPreference listPreference) {
        this.a = 2;
        this.c = videoPreferencesFragment;
        this.b = listPreference;
    }

    @Override // defpackage.x05
    public final boolean a(Preference preference, Object obj) {
        Set set;
        Object I0;
        String str;
        int i = this.a;
        String str2 = "top_right";
        String str3 = null;
        r6 = null;
        r6 = null;
        Uri uri = null;
        String str4 = null;
        ListPreference listPreference = this.b;
        VideoPreferencesFragment videoPreferencesFragment = this.c;
        switch (i) {
            case 0:
                preference.getClass();
                if (obj instanceof String) {
                    str3 = (String) obj;
                }
                if (str3 != null && !str3.equals("hidden") && str3.equals(listPreference.e0)) {
                    if (!str3.equals("top_left")) {
                        str2 = "top_left";
                    }
                    listPreference.h(str2);
                    Toast.makeText(videoPreferencesFragment.requireContext(), "Позиция разрешения изменена во избежание наложения", 0).show();
                }
                return true;
            case 1:
                preference.getClass();
                if (obj instanceof String) {
                    str4 = (String) obj;
                }
                if (str4 != null && !str4.equals("hidden") && str4.equals(listPreference.e0)) {
                    if (!str4.equals("top_left")) {
                        str2 = "top_left";
                    }
                    listPreference.h(str2);
                    Toast.makeText(videoPreferencesFragment.requireContext(), "Позиция FPS изменена во избежание наложения", 0).show();
                }
                return true;
            default:
                preference.getClass();
                if (obj instanceof Set) {
                    set = (Set) obj;
                } else {
                    set = null;
                }
                if (set != null && (I0 = gt0.I0(set)) != null) {
                    if (I0 instanceof String) {
                        str = (String) I0;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        uri = Uri.parse(str);
                    }
                }
                VideoPreferencesFragment.G(videoPreferencesFragment, listPreference, uri, false, 4);
                return true;
        }
    }

    public /* synthetic */ qm7(ListPreference listPreference, VideoPreferencesFragment videoPreferencesFragment, int i) {
        this.a = i;
        this.b = listPreference;
        this.c = videoPreferencesFragment;
    }
}
