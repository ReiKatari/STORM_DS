package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.preference.Preference;
import com.smp.masterswitchpreference.MasterSwitchPreference;
import com.stormds.emulator.R;
import java.util.Set;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p15  reason: default package */
/* loaded from: classes.dex */
public final class p15 {
    public static final l15 d = new l15(0);
    public final k15 a;
    public final wh7 b;
    public final yj1 c;

    public p15(k15 k15Var, wh7 wh7Var, yj1 yj1Var) {
        k15Var.getClass();
        wh7Var.getClass();
        yj1Var.getClass();
        this.a = k15Var;
        this.b = wh7Var;
        this.c = yj1Var;
    }

    public static void a(Preference preference) {
        Object string;
        if (preference == null) {
            return;
        }
        l15 l15Var = d;
        yh2.g(preference, l15Var);
        if (preference instanceof StoragePickerPreference) {
            StoragePickerPreference storagePickerPreference = (StoragePickerPreference) preference;
            string = v15.a(storagePickerPreference.getContext()).getStringSet(storagePickerPreference.getKey(), null);
        } else if (preference instanceof MasterSwitchPreference) {
            MasterSwitchPreference masterSwitchPreference = (MasterSwitchPreference) preference;
            string = Boolean.valueOf(v15.a(masterSwitchPreference.getContext()).getBoolean(masterSwitchPreference.getKey(), false));
        } else {
            string = v15.a(preference.getContext()).getString(preference.getKey(), null);
        }
        l15Var.a(preference, string);
    }

    public static String b(Context context, String str) {
        Uri parse = Uri.parse(str);
        String s = l.s(context, parse);
        if (s == null) {
            String i = zl1.h(context, parse).i();
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
        return s;
    }

    public final void c(final StoragePickerPreference storagePickerPreference, final eo2 eo2Var) {
        StoragePickerPreference.a aVar = storagePickerPreference.B;
        StoragePickerPreference.a aVar2 = StoragePickerPreference.a.FILE;
        k15 k15Var = this.a;
        if (aVar == aVar2) {
            a(storagePickerPreference);
            d9 registerForActivityResult = k15Var.registerForActivityResult(new zj1(storagePickerPreference.L, 1), new o15(storagePickerPreference));
            registerForActivityResult.getClass();
            storagePickerPreference.setOnPreferenceClickListener(new pk0(3, registerForActivityResult, storagePickerPreference));
            if (storagePickerPreference.R) {
                yh2.g(storagePickerPreference, new x05(this) { // from class: n15
                    public final /* synthetic */ p15 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.x05
                    public final boolean a(Preference preference, Object obj) {
                        String str;
                        int i = r3;
                        Set<String> set = null;
                        StoragePickerPreference storagePickerPreference2 = storagePickerPreference;
                        p15 p15Var = this.b;
                        switch (i) {
                            case 0:
                                preference.getClass();
                                if (obj instanceof Set) {
                                    set = (Set) obj;
                                }
                                if (set != null) {
                                    for (String str2 : set) {
                                        wh7 wh7Var = p15Var.b;
                                        Uri parse = Uri.parse(str2);
                                        sv4 sv4Var = storagePickerPreference2.L;
                                        wh7Var.getClass();
                                        parse.getClass();
                                        sv4Var.getClass();
                                        try {
                                            wh7Var.a.getContentResolver().takePersistableUriPermission(parse, sv4Var.toFlags());
                                        } catch (Throwable unused) {
                                        }
                                    }
                                }
                                return true;
                            default:
                                preference.getClass();
                                if (obj instanceof Set) {
                                    set = (Set) obj;
                                }
                                if (set != null && (str = (String) gt0.I0(set)) != null) {
                                    p15Var.b.a(Uri.parse(str), storagePickerPreference2.L);
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
        d9 registerForActivityResult2 = k15Var.registerForActivityResult(new zj1(storagePickerPreference.L, 0), new a9() { // from class: m15
            @Override // defpackage.a9
            public final void a(Object obj) {
                Uri uri = (Uri) obj;
                if (uri == null) {
                    return;
                }
                p15 p15Var = p15.this;
                yj1 yj1Var = p15Var.c;
                StoragePickerPreference storagePickerPreference2 = storagePickerPreference;
                if (yj1Var.a(uri, storagePickerPreference2.L) == xj1.OK) {
                    ci2 ci2Var = new ci2(18, storagePickerPreference2, uri);
                    eo2 eo2Var2 = eo2Var;
                    if (eo2Var2 != null) {
                        eo2Var2.o(uri, ci2Var);
                        return;
                    } else {
                        ci2Var.c();
                        return;
                    }
                }
                zb zbVar = new zb(p15Var.a.requireContext());
                zbVar.z(R.string.error_invalid_directory);
                zbVar.w(R.string.error_invalid_directory_description);
                zbVar.y(R.string.ok, null);
                ((wb) zbVar.L).m = true;
                zbVar.B();
            }
        });
        registerForActivityResult2.getClass();
        storagePickerPreference.setOnPreferenceClickListener(new em2(storagePickerPreference, this, registerForActivityResult2, 3));
        if (storagePickerPreference.R) {
            yh2.g(storagePickerPreference, new x05(this) { // from class: n15
                public final /* synthetic */ p15 b;

                {
                    this.b = this;
                }

                @Override // defpackage.x05
                public final boolean a(Preference preference, Object obj) {
                    String str;
                    int i = r3;
                    Set<String> set = null;
                    StoragePickerPreference storagePickerPreference2 = storagePickerPreference;
                    p15 p15Var = this.b;
                    switch (i) {
                        case 0:
                            preference.getClass();
                            if (obj instanceof Set) {
                                set = (Set) obj;
                            }
                            if (set != null) {
                                for (String str2 : set) {
                                    wh7 wh7Var = p15Var.b;
                                    Uri parse = Uri.parse(str2);
                                    sv4 sv4Var = storagePickerPreference2.L;
                                    wh7Var.getClass();
                                    parse.getClass();
                                    sv4Var.getClass();
                                    try {
                                        wh7Var.a.getContentResolver().takePersistableUriPermission(parse, sv4Var.toFlags());
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                            return true;
                        default:
                            preference.getClass();
                            if (obj instanceof Set) {
                                set = (Set) obj;
                            }
                            if (set != null && (str = (String) gt0.I0(set)) != null) {
                                p15Var.b.a(Uri.parse(str), storagePickerPreference2.L);
                            }
                            return true;
                    }
                }
            });
        }
    }
}
