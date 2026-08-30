package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import java.util.UUID;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vn1  reason: default package */
/* loaded from: classes.dex */
public class vn1 implements xr4, k64, ui6, y31, jp0, fp4, ou4, nw6 {
    public static vn1 B;
    public final /* synthetic */ int A;

    public /* synthetic */ vn1(int i) {
        this.A = i;
    }

    public static final void e(jo1 jo1Var) {
        ee6 ee6Var;
        cn4 cn4Var;
        int i;
        Object obj;
        cn4 cn4Var2;
        ee6 ee6Var2 = s55.z;
        do {
            ee6Var = s55.z;
            cn4Var = (cn4) ee6Var.getValue();
            tm4 tm4Var = cn4Var.L;
            cp3 cp3Var = (cp3) tm4Var.get(jo1Var);
            if (cp3Var == null) {
                cn4Var2 = cn4Var;
            } else {
                Object obj2 = cp3Var.a;
                Object obj3 = cp3Var.b;
                fy6 fy6Var = tm4Var.A;
                if (jo1Var != null) {
                    i = jo1Var.hashCode();
                } else {
                    i = 0;
                }
                fy6 v = fy6Var.v(i, 0, jo1Var);
                if (fy6Var != v) {
                    if (v == null) {
                        tm4Var = tm4.L;
                    } else {
                        tm4Var = new tm4(v, tm4Var.B - 1);
                    }
                }
                sn1 sn1Var = sn1.d0;
                if (obj2 != sn1Var) {
                    Object obj4 = tm4Var.get(obj2);
                    obj4.getClass();
                    tm4Var = tm4Var.c(obj2, new cp3(((cp3) obj4).a, obj3));
                }
                if (obj3 != sn1Var) {
                    Object obj5 = tm4Var.get(obj3);
                    obj5.getClass();
                    tm4Var = tm4Var.c(obj3, new cp3(obj2, ((cp3) obj5).b));
                }
                if (obj2 != sn1Var) {
                    obj = cn4Var.A;
                } else {
                    obj = obj3;
                }
                if (obj3 != sn1Var) {
                    obj2 = cn4Var.B;
                }
                cn4Var2 = new cn4(obj, obj2, tm4Var);
            }
            if (cn4Var == cn4Var2) {
                return;
            }
        } while (!ee6Var.j(cn4Var, cn4Var2));
    }

    public static l34 f(fh fhVar, b44 b44Var, Bundle bundle, qm3 qm3Var, t34 t34Var) {
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        b44Var.getClass();
        qm3Var.getClass();
        return new l34(fhVar, b44Var, bundle, qm3Var, t34Var, uuid, null);
    }

    public static mg4 h(int i, int i2, sn1 sn1Var, ng4 ng4Var, og4 og4Var, pg4 pg4Var, qg4 qg4Var, Size size, String str) {
        sn1 sn1Var2;
        ng4 ng4Var2;
        pg4 pg4Var2;
        qg4 qg4Var2;
        sn1 sn1Var3 = sn1.k0;
        if ((i2 & 8) != 0) {
            sn1Var2 = sn1Var3;
        } else {
            sn1Var2 = sn1Var;
        }
        if ((i2 & 64) != 0) {
            ng4Var2 = null;
        } else {
            ng4Var2 = ng4Var;
        }
        if ((i2 & 128) != 0) {
            pg4Var2 = null;
        } else {
            pg4Var2 = pg4Var;
        }
        if ((i2 & 256) != 0) {
            qg4Var2 = null;
        } else {
            qg4Var2 = qg4Var;
        }
        size.getClass();
        sn1 sn1Var4 = sn1.m0;
        pp1 pp1Var = pp1.A;
        if (sn1Var2 != sn1Var4 && sn1Var2 != sn1.l0 && ((sn1Var2 != sn1.o0 && sn1Var2 != sn1.p0) || Build.VERSION.SDK_INT < 35)) {
            if (sn1Var2 == sn1Var3) {
                return new mg4(size, i, str, og4Var, ng4Var2, pg4Var2, qg4Var2, pp1Var);
            }
            i.n("Check failed.");
            return null;
        }
        return new kg4(size, i, str, sn1Var2, og4Var, ng4Var2, pg4Var2, qg4Var2, pp1Var);
    }

    public static Typeface i(String str, pe2 pe2Var, int i) {
        if (i == 0 && b53.x(pe2Var, pe2.Y) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int w = jv3.w(i, pe2Var);
        if (str != null && str.length() != 0) {
            return Typeface.create(str, w);
        }
        return Typeface.defaultFromStyle(w);
    }

    @Override // defpackage.ui6
    public vi6 a(ti6 ti6Var) {
        return new bi2(ti6Var.a, ti6Var.b, ti6Var.c, ti6Var.d, ti6Var.e);
    }

    @Override // defpackage.fp4
    public Typeface b(int i, pe2 pe2Var) {
        return i(null, pe2Var, i);
    }

    @Override // defpackage.fp4
    public Typeface c(ml2 ml2Var, pe2 pe2Var, int i) {
        String str;
        ml2Var.getClass();
        int i2 = pe2Var.A / 100;
        if (i2 >= 0 && i2 < 2) {
            str = "monospace-thin";
        } else if (2 <= i2 && i2 < 4) {
            str = "monospace-light";
        } else {
            if (i2 != 4) {
                if (i2 == 5) {
                    str = "monospace-medium";
                } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                    str = "monospace-black";
                }
            }
            str = "monospace";
        }
        Typeface typeface = null;
        if (str.length() != 0) {
            Typeface i3 = i(str, pe2Var, i);
            if (!b53.x(i3, Typeface.create(Typeface.DEFAULT, jv3.w(i, pe2Var))) && !b53.x(i3, i(null, pe2Var, i))) {
                typeface = i3;
            }
        }
        if (typeface == null) {
            return i("monospace", pe2Var, i);
        }
        return typeface;
    }

    @Override // defpackage.k64
    public boolean d() {
        return true;
    }

    @Override // defpackage.jp0
    public l23 g() {
        l23 l23Var = l23.L;
        return hi2.l(System.currentTimeMillis());
    }

    @Override // defpackage.ou4
    public void j() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.xr4
    public CharSequence k(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        if (TextUtils.isEmpty(editTextPreference.Z)) {
            return editTextPreference.getContext().getString(R.string.not_set);
        }
        return editTextPreference.Z;
    }

    public boolean l(CharSequence charSequence) {
        return false;
    }

    @Override // defpackage.ou4
    public void m(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case ig7.b /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i != 6 && i != 7 && i != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
    }

    public String toString() {
        switch (this.A) {
            case 23:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.k64
    public void shutdown() {
    }
}
