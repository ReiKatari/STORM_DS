package defpackage;

import android.content.SharedPreferences;
import android.net.Uri;
import androidx.preference.ListPreference;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
import me.magnum.melonds.ui.romlist.a;
import me.magnum.melonds.ui.settings.fragments.AudioPreferencesFragment;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k9  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class k9 implements a9 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ k9(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override // defpackage.a9
    public final void a(Object obj) {
        ListPreference listPreference;
        Set<String> linkedHashSet;
        int i = this.A;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                ((qn2) ((qa4) obj2).getValue()).g(obj);
                return;
            case 1:
                AudioPreferencesFragment audioPreferencesFragment = (AudioPreferencesFragment) obj2;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                if (bool.booleanValue() && (listPreference = audioPreferencesFragment.Z) != null) {
                    String lowerCase = "DEVICE".toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    listPreference.h(lowerCase);
                    return;
                }
                return;
            case 2:
                wf4 wf4Var = (wf4) obj2;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    tz5 tz5Var = (tz5) wf4Var.Y.getValue();
                    yj1 yj1Var = tz5Var.f;
                    sv4 sv4Var = sv4.READ_WRITE;
                    if (yj1Var.a(uri, sv4Var) == xj1.OK) {
                        wh7 wh7Var = tz5Var.e;
                        wh7Var.getClass();
                        try {
                            wh7Var.a.getContentResolver().takePersistableUriPermission(uri, sv4Var.toFlags());
                        } catch (Throwable unused) {
                        }
                        ng6 ng6Var = (ng6) tz5Var.c;
                        ng6Var.getClass();
                        SharedPreferences sharedPreferences = ng6Var.b;
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        Set<String> stringSet = sharedPreferences.getStringSet("rom_search_dirs", du1.A);
                        if (stringSet != null) {
                            linkedHashSet = gt0.o1(stringSet);
                        } else {
                            linkedHashSet = new LinkedHashSet<>();
                        }
                        linkedHashSet.add(uri.toString());
                        edit.putStringSet("rom_search_dirs", linkedHashSet);
                        edit.apply();
                        return;
                    }
                    tz5Var.z.k(jg7.a);
                    return;
                }
                List list = wf4.d0;
                return;
            case 3:
                RomDetailsActivity romDetailsActivity = (RomDetailsActivity) obj2;
                Uri uri2 = (Uri) obj;
                pq5 pq5Var = romDetailsActivity.E0;
                romDetailsActivity.E0 = null;
                if (uri2 != null && pq5Var != null) {
                    hv.L(bl2.C(romDetailsActivity), null, null, new ev5(romDetailsActivity, pq5Var, uri2, null, 1), 3);
                    return;
                }
                return;
            default:
                a aVar = (a) obj2;
                Uri uri3 = (Uri) obj;
                pq5 pq5Var2 = aVar.f0;
                aVar.f0 = null;
                if (uri3 != null && pq5Var2 != null) {
                    hu3 viewLifecycleOwner = aVar.getViewLifecycleOwner();
                    viewLifecycleOwner.getClass();
                    hv.L(bl2.C(viewLifecycleOwner), null, null, new sy5(aVar, pq5Var2, uri3, null, 1), 3);
                    return;
                }
                return;
        }
    }
}
