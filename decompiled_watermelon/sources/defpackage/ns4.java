package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.preference.Preference;
import com.smp.masterswitchpreference.MasterSwitchPreference;
import java.util.Set;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ns4  reason: default package */
/* loaded from: classes.dex */
public final class ns4 {
    public static final js4 d = new Object();
    public final is4 a;
    public final y37 b;
    public final uf1 c;

    public ns4(is4 is4Var, y37 y37Var, uf1 uf1Var) {
        is4Var.getClass();
        y37Var.getClass();
        uf1Var.getClass();
        this.a = is4Var;
        this.b = y37Var;
        this.c = uf1Var;
    }

    public static void a(Preference preference) {
        Object string;
        if (preference == null) {
            return;
        }
        js4 js4Var = d;
        sn2.k(preference, js4Var);
        if (preference instanceof StoragePickerPreference) {
            StoragePickerPreference storagePickerPreference = (StoragePickerPreference) preference;
            string = ts4.a(storagePickerPreference.getContext()).getStringSet(storagePickerPreference.getKey(), null);
        } else if (preference instanceof MasterSwitchPreference) {
            MasterSwitchPreference masterSwitchPreference = (MasterSwitchPreference) preference;
            string = Boolean.valueOf(ts4.a(masterSwitchPreference.getContext()).getBoolean(masterSwitchPreference.getKey(), false));
        } else {
            string = ts4.a(preference.getContext()).getString(preference.getKey(), null);
        }
        js4Var.a(preference, string);
    }

    public static String b(Context context, String str) {
        Uri parse = Uri.parse(str);
        String C = f34.C(context, parse);
        if (C == null) {
            String i = uh1.h(context, parse).i();
            if (i == null) {
                String lastPathSegment = parse.getLastPathSegment();
                if (lastPathSegment == null) {
                    String uri = parse.toString();
                    uri.getClass();
                    return uri;
                }
                return lastPathSegment;
            }
            return i;
        }
        return C;
    }

    public final void c(final StoragePickerPreference storagePickerPreference, final aj2 aj2Var) {
        StoragePickerPreference.a aVar = storagePickerPreference.B;
        StoragePickerPreference.a aVar2 = StoragePickerPreference.a.FILE;
        is4 is4Var = this.a;
        if (aVar == aVar2) {
            a(storagePickerPreference);
            c9 registerForActivityResult = is4Var.registerForActivityResult(new vf1(storagePickerPreference.L, 1), new ms4(storagePickerPreference));
            registerForActivityResult.getClass();
            storagePickerPreference.setOnPreferenceClickListener(new hi0(3, registerForActivityResult, storagePickerPreference));
            if (storagePickerPreference.R) {
                sn2.k(storagePickerPreference, new ur4(this) { // from class: ls4
                    public final /* synthetic */ ns4 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.ur4
                    public final boolean a(Preference preference, Object obj) {
                        String str;
                        int i = r3;
                        Set<String> set = null;
                        StoragePickerPreference storagePickerPreference2 = storagePickerPreference;
                        ns4 ns4Var = this.b;
                        switch (i) {
                            case 0:
                                preference.getClass();
                                if (obj instanceof Set) {
                                    set = (Set) obj;
                                }
                                if (set != null) {
                                    for (String str2 : set) {
                                        y37 y37Var = ns4Var.b;
                                        Uri parse = Uri.parse(str2);
                                        nm4 nm4Var = storagePickerPreference2.L;
                                        y37Var.getClass();
                                        parse.getClass();
                                        nm4Var.getClass();
                                        y37Var.a.getContentResolver().takePersistableUriPermission(parse, nm4Var.toFlags());
                                    }
                                }
                                return true;
                            default:
                                preference.getClass();
                                if (obj instanceof Set) {
                                    set = (Set) obj;
                                }
                                if (set != null && (str = (String) tq0.L0(set)) != null) {
                                    ns4Var.b.a(Uri.parse(str), storagePickerPreference2.L);
                                }
                                return true;
                        }
                    }
                });
                return;
            }
            return;
        }
        a(storagePickerPreference);
        c9 registerForActivityResult2 = is4Var.registerForActivityResult(new vf1(storagePickerPreference.L, 0), new z8() { // from class: ks4
            @Override // defpackage.z8
            public final void b(Object obj) {
                Uri uri = (Uri) obj;
                if (uri == null) {
                    return;
                }
                ns4 ns4Var = ns4.this;
                uf1 uf1Var = ns4Var.c;
                StoragePickerPreference storagePickerPreference2 = storagePickerPreference;
                if (uf1Var.a(uri, storagePickerPreference2.L) == tf1.OK) {
                    jd2 jd2Var = new jd2(17, storagePickerPreference2, uri);
                    aj2 aj2Var2 = aj2Var;
                    if (aj2Var2 != null) {
                        aj2Var2.j(uri, jd2Var);
                        return;
                    } else {
                        jd2Var.c();
                        return;
                    }
                }
                sb sbVar = new sb(ns4Var.a.requireContext());
                sbVar.A(R.string.error_invalid_directory);
                sbVar.w(R.string.error_invalid_directory_description);
                sbVar.z(R.string.ok, null);
                ((pb) sbVar.L).m = true;
                sbVar.C();
            }
        });
        registerForActivityResult2.getClass();
        storagePickerPreference.setOnPreferenceClickListener(new eh2(storagePickerPreference, this, registerForActivityResult2, 3));
        if (storagePickerPreference.R) {
            sn2.k(storagePickerPreference, new ur4(this) { // from class: ls4
                public final /* synthetic */ ns4 b;

                {
                    this.b = this;
                }

                @Override // defpackage.ur4
                public final boolean a(Preference preference, Object obj) {
                    String str;
                    int i = r3;
                    Set<String> set = null;
                    StoragePickerPreference storagePickerPreference2 = storagePickerPreference;
                    ns4 ns4Var = this.b;
                    switch (i) {
                        case 0:
                            preference.getClass();
                            if (obj instanceof Set) {
                                set = (Set) obj;
                            }
                            if (set != null) {
                                for (String str2 : set) {
                                    y37 y37Var = ns4Var.b;
                                    Uri parse = Uri.parse(str2);
                                    nm4 nm4Var = storagePickerPreference2.L;
                                    y37Var.getClass();
                                    parse.getClass();
                                    nm4Var.getClass();
                                    y37Var.a.getContentResolver().takePersistableUriPermission(parse, nm4Var.toFlags());
                                }
                            }
                            return true;
                        default:
                            preference.getClass();
                            if (obj instanceof Set) {
                                set = (Set) obj;
                            }
                            if (set != null && (str = (String) tq0.L0(set)) != null) {
                                ns4Var.b.a(Uri.parse(str), storagePickerPreference2.L);
                            }
                            return true;
                    }
                }
            });
        }
    }
}
