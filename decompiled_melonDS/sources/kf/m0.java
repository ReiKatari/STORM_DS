package kf;

import android.net.Uri;
import java.util.Date;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public final cf.d f8255a;

    /* renamed from: b  reason: collision with root package name */
    public final v1 f8256b;

    /* renamed from: c  reason: collision with root package name */
    public final be.c f8257c;

    public m0(cf.d dVar, v1 v1Var, be.c cVar) {
        this.f8255a = dVar;
        this.f8256b = v1Var;
        this.f8257c = cVar;
    }

    public final String a(ze.a aVar) {
        k6.a a10 = this.f8257c.a(aVar.f15056d);
        if (a10 != null) {
            return ij.a.V(a10);
        }
        return null;
    }

    public final oe.j0 b(ze.a aVar) {
        String a10;
        k6.a c4;
        boolean z10;
        Date date;
        aVar.getClass();
        k6.a d4 = d(aVar);
        if (d4 == null || (a10 = a(aVar)) == null) {
            c4 = null;
        } else {
            c4 = d4.c(a10.concat(".ml0"));
        }
        if (c4 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c4 != null) {
            date = new Date(c4.j());
        } else {
            date = null;
        }
        oe.j0 j0Var = new oe.j0(0, z10, date, null);
        return oe.j0.a(j0Var, this.f8256b.b(aVar, j0Var));
    }

    public final Uri c(ze.a aVar, oe.j0 j0Var) {
        Uri g10;
        aVar.getClass();
        j0Var.getClass();
        k6.a d4 = d(aVar);
        if (d4 != null) {
            String a10 = a(aVar);
            if (a10 != null) {
                String str = a10 + ".ml" + j0Var.f10942a;
                k6.a c4 = d4.c(str);
                if (c4 != null) {
                    g10 = c4.g();
                } else {
                    k6.a a11 = d4.a("*/*", str);
                    if (a11 == null || (g10 = a11.g()) == null) {
                        throw new Exception("Could not create save state file");
                    }
                }
                g10.getClass();
                return g10;
            }
            throw new Exception("Could not determine ROM file name");
        }
        throw new Exception("Could not create parent directory document");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
        if (r5 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k6.a d(ze.a r5) {
        /*
            r4 = this;
            cf.d r0 = r4.f8255a
            kf.d2 r0 = (kf.d2) r0
            r5.getClass()
            android.content.SharedPreferences r1 = r0.f8181b
            java.lang.String r2 = "save_state_location"
            java.lang.String r3 = "save_dir"
            java.lang.String r1 = r1.getString(r2, r3)
            r1.getClass()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toUpperCase(r2)
            r1.getClass()
            oe.i0 r1 = oe.i0.valueOf(r1)
            int[] r2 = kf.a2.f8137a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            r3 = 0
            if (r1 == r2) goto L70
            r2 = 2
            if (r1 == r2) goto L53
            r5 = 3
            if (r1 != r5) goto L4e
            java.io.File r5 = new java.io.File
            android.content.Context r0 = r0.f8180a
            java.io.File r0 = r0.getExternalFilesDir(r3)
            java.lang.String r1 = "savestates"
            r5.<init>(r0, r1)
            boolean r0 = r5.isDirectory()
            if (r0 != 0) goto L49
            r5.mkdirs()
        L49:
            android.net.Uri r5 = android.net.Uri.fromFile(r5)
            goto L74
        L4e:
            m9.o.o()
            r5 = 0
            return r5
        L53:
            android.net.Uri r5 = r5.f15057e
            if (r5 == 0) goto L68
            be.c r0 = r0.f8183d
            k6.a r5 = r0.b(r5)
            if (r5 == 0) goto L64
            android.net.Uri r5 = r5.g()
            goto L65
        L64:
            r5 = r3
        L65:
            if (r5 == 0) goto L68
            goto L74
        L68:
            java.lang.Exception r5 = new java.lang.Exception
            java.lang.String r0 = "Could not determine ROMs parent document"
            r5.<init>(r0)
            throw r5
        L70:
            android.net.Uri r5 = r0.e(r5)
        L74:
            if (r5 != 0) goto L77
            return r3
        L77:
            be.c r0 = r4.f8257c
            k6.a r5 = r0.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.m0.d(ze.a):k6.a");
    }
}
