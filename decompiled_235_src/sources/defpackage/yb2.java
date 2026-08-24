package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yb2  reason: default package */
/* loaded from: classes.dex */
public final class yb2 {
    public final Context a;
    public final kd6 b;
    public final b46 c;
    public final uh7 d;

    public yb2(Context context, kd6 kd6Var, b46 b46Var, uh7 uh7Var) {
        this.a = context;
        this.b = kd6Var;
        this.c = b46Var;
        this.d = uh7Var;
    }

    public final String a(pq5 pq5Var) {
        zl1 a = this.d.a(pq5Var.d);
        if (a != null) {
            return hf.V(a);
        }
        return null;
    }

    public final Uri b(pq5 pq5Var, c46 c46Var) {
        Uri j;
        pq5Var.getClass();
        c46Var.getClass();
        zl1 e = e(pq5Var);
        if (e != null) {
            String a = a(pq5Var);
            if (a != null) {
                String str = a + ".ml" + c46Var.a;
                zl1 f = e.f(str);
                if (f != null) {
                    j = f.j();
                } else {
                    zl1 c = e.c("*/*", str);
                    if (c == null || (j = c.j()) == null) {
                        throw new Exception("Could not create save state file");
                    }
                }
                j.getClass();
                return j;
            }
            throw new Exception("Could not determine ROM file name");
        }
        throw new Exception("Could not create parent directory document");
    }

    public final List c(pq5 pq5Var) {
        String a;
        pq5Var.getClass();
        zl1 e = e(pq5Var);
        if (e == null || (a = a(pq5Var)) == null) {
            return yt1.A;
        }
        c46[] c46VarArr = new c46[9];
        for (int i = 0; i < 9; i++) {
            c46VarArr[i] = new c46(i, false, (Date) null, d(pq5Var, i), 32);
        }
        String quote = Pattern.quote(a);
        quote.getClass();
        Pattern compile = Pattern.compile(quote.concat("\\.ml[0-8]"));
        compile.getClass();
        zl1[] o = e.o();
        o.getClass();
        for (zl1 zl1Var : o) {
            String i2 = zl1Var.i();
            if (i2 != null && compile.matcher(i2).matches()) {
                char w0 = qs6.w0(i2);
                int digit = Character.digit((int) w0, 10);
                if (digit >= 0) {
                    c46 c46Var = new c46(digit, true, new Date(zl1Var.m()), d(pq5Var, digit), 32);
                    c46VarArr[digit] = c46.a(c46Var, this.c.b(pq5Var, c46Var));
                } else {
                    throw new IllegalArgumentException("Char " + w0 + " is not a decimal digit");
                }
            }
        }
        return fv.T0(c46VarArr);
    }

    public final String d(pq5 pq5Var, int i) {
        pq5Var.getClass();
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("save_state_names", 0);
        int hashCode = pq5Var.d.hashCode();
        return sharedPreferences.getString(hashCode + "_slot_" + i, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
        if (r9 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zl1 e(pq5 pq5Var) {
        Object em5Var;
        Uri u;
        ng6 ng6Var = (ng6) this.b;
        pq5Var.getClass();
        Enum r1 = a46.SAVE_DIR;
        SharedPreferences sharedPreferences = ng6Var.b;
        String lowerCase = r1.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String string = sharedPreferences.getString("save_state_location", lowerCase);
        if (string != null) {
            try {
                em5Var = jw2.o(string, a46.values());
            } catch (Throwable th) {
                em5Var = new em5(th);
            }
            if (hm5.a(em5Var) != null) {
                lb1.w("Invalid enum preference save_state_location=", string, "; using ", r1.name(), "SPSettingsRepository");
            }
            Enum r12 = r1;
            if (!(em5Var instanceof em5)) {
                r12 = em5Var;
            }
            r1 = r12;
        }
        int i = cg6.b[((a46) r1).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    File file = new File(ng6Var.j(), "savestates");
                    if (!file.isDirectory()) {
                        file.mkdirs();
                    }
                    u = Uri.fromFile(file);
                } else {
                    i.d();
                    return null;
                }
            } else {
                Uri uri = pq5Var.e;
                if (uri != null) {
                    zl1 b = ng6Var.d.b(uri);
                    if (b != null) {
                        u = b.j();
                    } else {
                        u = null;
                    }
                }
                throw new Exception("Could not determine ROMs parent document");
            }
        } else {
            u = ng6Var.u(pq5Var);
        }
        if (u == null) {
            return null;
        }
        return this.d.b(u);
    }

    public final void f(pq5 pq5Var, int i, String str) {
        pq5Var.getClass();
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("save_state_names", 0);
        String str2 = pq5Var.d.hashCode() + "_slot_" + i;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (str != null && !qs6.v0(str)) {
            edit.putString(str2, qs6.T0(str).toString());
        } else {
            edit.remove(str2);
        }
        edit.apply();
    }
}
