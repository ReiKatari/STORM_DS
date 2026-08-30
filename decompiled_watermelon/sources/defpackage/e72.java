package defpackage;

import android.net.Uri;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e72  reason: default package */
/* loaded from: classes.dex */
public final class e72 {
    public final w16 a;
    public final et5 b;
    public final w37 c;

    public e72(w16 w16Var, et5 et5Var, w37 w37Var) {
        this.a = w16Var;
        this.b = et5Var;
        this.c = w37Var;
    }

    public final String a(rg5 rg5Var) {
        uh1 a = this.c.a(rg5Var.d);
        if (a != null) {
            return l07.Q(a);
        }
        return null;
    }

    public final Uri b(rg5 rg5Var, ft5 ft5Var) {
        Uri j;
        rg5Var.getClass();
        ft5Var.getClass();
        uh1 d = d(rg5Var);
        if (d != null) {
            String a = a(rg5Var);
            if (a != null) {
                String str = a + ".ml" + ft5Var.a;
                uh1 f = d.f(str);
                if (f != null) {
                    j = f.j();
                } else {
                    uh1 c = d.c("*/*", str);
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

    public final List c(rg5 rg5Var) {
        String a;
        rg5Var.getClass();
        uh1 d = d(rg5Var);
        if (d == null || (a = a(rg5Var)) == null) {
            return pp1.A;
        }
        ft5[] ft5VarArr = new ft5[9];
        for (int i = 0; i < 9; i++) {
            ft5VarArr[i] = new ft5(i, false, null, null);
        }
        String quote = Pattern.quote(a);
        quote.getClass();
        Pattern compile = Pattern.compile(quote.concat("\\.ml[0-8]"));
        compile.getClass();
        uh1[] o = d.o();
        o.getClass();
        for (uh1 uh1Var : o) {
            String i2 = uh1Var.i();
            if (i2 != null && compile.matcher(i2).matches()) {
                char C0 = zg6.C0(i2);
                int digit = Character.digit((int) C0, 10);
                if (digit >= 0) {
                    ft5 ft5Var = new ft5(digit, true, new Date(uh1Var.m()), null);
                    ft5VarArr[digit] = ft5.a(ft5Var, this.b.b(rg5Var, ft5Var));
                } else {
                    throw new IllegalArgumentException("Char " + C0 + " is not a decimal digit");
                }
            }
        }
        return nu.F0(ft5VarArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
        if (r9 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.uh1 d(defpackage.rg5 r9) {
        /*
            r8 = this;
            w16 r0 = r8.a
            b56 r0 = (defpackage.b56) r0
            r9.getClass()
            dt5 r1 = defpackage.dt5.SAVE_DIR
            android.content.SharedPreferences r2 = r0.b
            java.lang.String r3 = r1.name()
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            r3.getClass()
            java.lang.String r4 = "save_state_location"
            java.lang.String r2 = r2.getString(r4, r3)
            if (r2 != 0) goto L21
            goto L4c
        L21:
            dt5[] r3 = defpackage.dt5.values()     // Catch: java.lang.Throwable -> L2a
            java.lang.Enum r3 = defpackage.se.t(r2, r3)     // Catch: java.lang.Throwable -> L2a
            goto L31
        L2a:
            r3 = move-exception
            kc5 r4 = new kc5
            r4.<init>(r3)
            r3 = r4
        L31:
            java.lang.Throwable r4 = defpackage.nc5.a(r3)
            if (r4 == 0) goto L44
            java.lang.String r4 = r1.name()
            java.lang.String r5 = "Invalid enum preference save_state_location="
            java.lang.String r6 = "; using "
            java.lang.String r7 = "SPSettingsRepository"
            defpackage.wh1.y(r5, r2, r6, r4, r7)
        L44:
            boolean r2 = r3 instanceof defpackage.kc5
            if (r2 == 0) goto L49
            goto L4a
        L49:
            r1 = r3
        L4a:
            java.lang.Enum r1 = (java.lang.Enum) r1
        L4c:
            dt5 r1 = (defpackage.dt5) r1
            int[] r2 = defpackage.q46.b
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            r3 = 0
            if (r1 == r2) goto L9c
            r2 = 2
            if (r1 == r2) goto L7f
            r9 = 3
            if (r1 != r9) goto L7b
            java.io.File r9 = new java.io.File
            android.content.Context r0 = r0.a
            java.io.File r0 = r0.getExternalFilesDir(r3)
            java.lang.String r1 = "savestates"
            r9.<init>(r0, r1)
            boolean r0 = r9.isDirectory()
            if (r0 != 0) goto L76
            r9.mkdirs()
        L76:
            android.net.Uri r9 = android.net.Uri.fromFile(r9)
            goto La0
        L7b:
            defpackage.i.c()
            return r3
        L7f:
            android.net.Uri r9 = r9.e
            if (r9 == 0) goto L94
            w37 r0 = r0.d
            uh1 r9 = r0.b(r9)
            if (r9 == 0) goto L90
            android.net.Uri r9 = r9.j()
            goto L91
        L90:
            r9 = r3
        L91:
            if (r9 == 0) goto L94
            goto La0
        L94:
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "Could not determine ROMs parent document"
            r8.<init>(r9)
            throw r8
        L9c:
            android.net.Uri r9 = r0.u(r9)
        La0:
            if (r9 != 0) goto La3
            return r3
        La3:
            w37 r8 = r8.c
            uh1 r8 = r8.b(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e72.d(rg5):uh1");
    }
}
