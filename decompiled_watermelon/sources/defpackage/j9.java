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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j9  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class j9 implements z8 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ j9(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    @Override // defpackage.z8
    public final void b(Object obj) {
        Set<String> linkedHashSet;
        int i = this.A;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                ((mi2) ((k24) obj2).getValue()).n(obj);
                return;
            case 1:
                AudioPreferencesFragment audioPreferencesFragment = (AudioPreferencesFragment) obj2;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                if (bool.booleanValue()) {
                    ListPreference listPreference = audioPreferencesFragment.B;
                    if (listPreference != null) {
                        String lowerCase = "DEVICE".toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        listPreference.h(lowerCase);
                        return;
                    }
                    b53.g0("micSourcePreference");
                    throw null;
                }
                return;
            case 2:
                f74 f74Var = (f74) obj2;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    yo5 yo5Var = (yo5) f74Var.Z.getValue();
                    uf1 uf1Var = yo5Var.f;
                    nm4 nm4Var = nm4.READ_WRITE;
                    if (uf1Var.a(uri, nm4Var) == tf1.OK) {
                        y37 y37Var = yo5Var.e;
                        y37Var.getClass();
                        y37Var.a.getContentResolver().takePersistableUriPermission(uri, nm4Var.toFlags());
                        b56 b56Var = (b56) yo5Var.c;
                        b56Var.getClass();
                        SharedPreferences sharedPreferences = b56Var.b;
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        Set<String> stringSet = sharedPreferences.getStringSet("rom_search_dirs", up1.A);
                        if (stringSet != null) {
                            linkedHashSet = tq0.r1(stringSet);
                        } else {
                            linkedHashSet = new LinkedHashSet<>();
                        }
                        linkedHashSet.add(uri.toString());
                        edit.putStringSet("rom_search_dirs", linkedHashSet);
                        edit.apply();
                        return;
                    }
                    yo5Var.v.p(o27.a);
                    return;
                }
                List list = f74.c0;
                return;
            case 3:
                RomDetailsActivity romDetailsActivity = (RomDetailsActivity) obj2;
                Uri uri2 = (Uri) obj;
                rg5 rg5Var = romDetailsActivity.D0;
                romDetailsActivity.D0 = null;
                if (uri2 != null && rg5Var != null) {
                    tq5.w(hk2.y(romDetailsActivity), null, null, new nk5(romDetailsActivity, rg5Var, uri2, null, 1), 3);
                    return;
                }
                return;
            default:
                a aVar = (a) obj2;
                Uri uri3 = (Uri) obj;
                rg5 rg5Var2 = aVar.e0;
                aVar.e0 = null;
                if (uri3 != null && rg5Var2 != null) {
                    fn3 viewLifecycleOwner = aVar.getViewLifecycleOwner();
                    viewLifecycleOwner.getClass();
                    tq5.w(hk2.y(viewLifecycleOwner), null, null, new co5(aVar, rg5Var2, uri3, null, 1), 3);
                    return;
                }
                return;
        }
    }
}
