package defpackage;

import android.app.RemoteAction;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.textclassifier.TextClassification;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import me.magnum.melonds.ui.settings.SettingsActivity;
import me.magnum.melonds.ui.settings.fragments.SaveFilesPreferencesFragment;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y36  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class y36 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ y36(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x024c  */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.Set[], java.lang.Object[]] */
    @Override // defpackage.eo2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj, Object obj2) {
        Drawable drawable;
        String str;
        ArrayList arrayList;
        CharSequence label;
        CharSequence title;
        int i = this.A;
        String str2 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        ob6 ob6Var = null;
        boolean z = false;
        Object obj3 = this.B;
        switch (i) {
            case 0:
                SaveFilesPreferencesFragment saveFilesPreferencesFragment = (SaveFilesPreferencesFragment) obj3;
                Uri uri = (Uri) obj;
                on2 on2Var = (on2) obj2;
                uri.getClass();
                on2Var.getClass();
                if (!saveFilesPreferencesFragment.k().b.getBoolean("save_internal_config_as_file", false)) {
                    on2Var.c();
                } else if (!saveFilesPreferencesFragment.k().f(uri)) {
                    on2Var.c();
                    saveFilesPreferencesFragment.k().i();
                } else {
                    zb zbVar = new zb(saveFilesPreferencesFragment.requireContext());
                    zbVar.z(R.string.settings_mirror_detected_title);
                    zbVar.w(R.string.settings_mirror_detected_message);
                    zbVar.y(R.string.settings_mirror_restore, new z36(saveFilesPreferencesFragment, uri, on2Var));
                    zbVar.x(R.string.settings_mirror_ignore, new z36(on2Var, saveFilesPreferencesFragment, uri));
                    zbVar.B();
                }
                return jg7.a;
            case 1:
                e86 e86Var = (e86) obj3;
                hv.L(e86Var.F0(), null, null, new d86(e86Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case 2:
                ((vy4) obj).a();
                ((ch5) obj3).A = ((jk4) obj2).a;
                return jg7.a;
            case 3:
                ((Integer) obj2).getClass();
                hi2.j((u3) obj3, (px0) obj, ii2.a0(1));
                return jg7.a;
            case 4:
                SettingsActivity settingsActivity = (SettingsActivity) obj3;
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = SettingsActivity.F0;
                if ((intValue & 3) != 2) {
                    z = true;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    String str3 = (String) np2.C(settingsActivity.B0, xq2Var).getValue();
                    hd6 hd6Var = (hd6) np2.C(settingsActivity.C0, xq2Var).getValue();
                    if (hd6Var != null) {
                        drawable = hd6Var.c;
                    } else {
                        drawable = null;
                    }
                    if (hd6Var != null) {
                        String str4 = hd6Var.a;
                        if (qs6.v0(str4)) {
                            str4 = null;
                        }
                        if (str4 != null) {
                            str = str4;
                            if (hd6Var != null) {
                                str2 = hd6Var.b;
                            }
                            g04.q(drawable, str, str2, lb1.m(settingsActivity.getString(R.string.settings), " › ", str3), xq2Var, 0);
                        }
                    }
                    str = str3;
                    if (hd6Var != null) {
                    }
                    g04.q(drawable, str, str2, lb1.m(settingsActivity.getString(R.string.settings), " › ", str3), xq2Var, 0);
                } else {
                    xq2Var.V();
                }
                return jg7.a;
            case 5:
                si6 si6Var = (si6) obj3;
                Set set = (Set) obj;
                vl6 vl6Var = (vl6) obj2;
                synchronized (si6Var.a) {
                    try {
                        ka4 ka4Var = si6Var.d;
                        if (ka4Var == null) {
                            if (gt0.C0(set, si6Var.b)) {
                                ob6Var = si6Var.f;
                            }
                        } else {
                            Object[] objArr = ka4Var.b;
                            long[] jArr = ka4Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                while (true) {
                                    long j = jArr[i3];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        int i5 = 0;
                                        while (true) {
                                            if (i5 < i4) {
                                                if ((255 & j) < 128 && set.contains(objArr[(i3 << 3) + i5])) {
                                                    ob6Var = si6Var.f;
                                                } else {
                                                    j >>= 8;
                                                    i5++;
                                                }
                                            } else if (i4 != 8) {
                                            }
                                        }
                                    }
                                    if (i3 != length) {
                                        i3++;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (ob6Var != null) {
                    ob6Var.c(jg7.a);
                }
                return jg7.a;
            case 6:
                qm6 qm6Var = (qm6) obj3;
                Set set2 = (Set) obj;
                vl6 vl6Var2 = (vl6) obj2;
                AtomicReference atomicReference = qm6Var.b;
                while (true) {
                    Object obj4 = atomicReference.get();
                    if (obj4 == null) {
                        arrayList = set2;
                    } else if (obj4 instanceof Set) {
                        arrayList = hf.c0(new Set[]{obj4, set2});
                    } else if (obj4 instanceof List) {
                        arrayList = gt0.V0((Collection) obj4, hf.b0(set2));
                    } else {
                        tx0.b("Unexpected notification");
                        e41.c();
                        return null;
                    }
                    while (!atomicReference.compareAndSet(obj4, arrayList)) {
                        if (atomicReference.get() != obj4) {
                            break;
                        }
                    }
                    if (qm6Var.c()) {
                        qm6Var.a.g(new t46(qm6Var, 10));
                    }
                    return jg7.a;
                    break;
                }
            case 7:
                CharSequence charSequence = (CharSequence) obj;
                int intValue2 = ((Integer) obj2).intValue();
                charSequence.getClass();
                vr4 n0 = qs6.n0(charSequence, (List) obj3, intValue2);
                if (n0 == null) {
                    return null;
                }
                return new vr4(n0.A, Integer.valueOf(((String) n0.B).length()));
            case 8:
                CharSequence charSequence2 = (CharSequence) obj;
                int intValue3 = ((Integer) obj2).intValue();
                charSequence2.getClass();
                int u0 = qs6.u0(charSequence2, (char[]) obj3, intValue3, false);
                if (u0 < 0) {
                    return null;
                }
                return new vr4(Integer.valueOf(u0), 1);
            case 9:
                ((Integer) obj2).getClass();
                xq2 xq2Var2 = (xq2) ((px0) obj);
                xq2Var2.b0(950061013);
                label = ((TextClassification) obj3).getLabel();
                String valueOf = String.valueOf(label);
                xq2Var2.p(false);
                return valueOf;
            case 10:
                ((Integer) obj2).getClass();
                xq2 xq2Var3 = (xq2) ((px0) obj);
                xq2Var3.b0(-1376593684);
                title = ((RemoteAction) obj3).getTitle();
                String obj5 = title.toString();
                xq2Var3.p(false);
                return obj5;
            case 11:
                ((Integer) obj2).getClass();
                ((f47) obj3).a((px0) obj, ii2.a0(1));
                return jg7.a;
            case 12:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                String str5 = (String) obj;
                str5.getClass();
                obj2.getClass();
                if (obj2 instanceof String) {
                    sharedPreferences.edit().putString(str5, (String) obj2).apply();
                } else if (obj2 instanceof Boolean) {
                    sharedPreferences.edit().putBoolean(str5, ((Boolean) obj2).booleanValue()).apply();
                } else if (obj2 instanceof Integer) {
                    sharedPreferences.edit().putInt(str5, ((Number) obj2).intValue()).apply();
                }
                return jg7.a;
            case 13:
                ((Integer) obj2).getClass();
                is7.b((nh2) obj3, (px0) obj, ii2.a0(7));
                return jg7.a;
            default:
                return new i93(((ic) obj3).a(0L, ((q93) obj).a, (kk3) obj2));
        }
    }

    public /* synthetic */ y36(Object obj, int i, int i2) {
        this.A = i2;
        this.B = obj;
    }
}
