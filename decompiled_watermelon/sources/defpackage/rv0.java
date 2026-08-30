package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.InputStream;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rv0  reason: default package */
/* loaded from: classes.dex */
public abstract class rv0 implements am5 {
    public static final List d = l07.c0("nds", "dsi", "ids");
    public final Context a;
    public final w37 b;
    public final o54 c;

    public rv0(Context context, w37 w37Var, o54 o54Var) {
        this.a = context;
        this.b = w37Var;
        this.c = o54Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Comparable h(defpackage.rv0 r5, defpackage.rg5 r6, defpackage.k11 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.qv0
            if (r0 == 0) goto L13
            r0 = r7
            qv0 r0 = (defpackage.qv0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            qv0 r0 = new qv0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L28
            defpackage.me2.a0(r7)     // Catch: defpackage.pv0 -> L46
            goto L43
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            return r4
        L2e:
            defpackage.me2.a0(r7)
            o54 r7 = r5.c
            android.net.Uri r7 = r7.d(r6, r3)
            if (r7 == 0) goto L3a
            return r7
        L3a:
            r0.Y = r3     // Catch: defpackage.pv0 -> L46
            java.lang.Object r7 = r5.e(r6, r0)     // Catch: defpackage.pv0 -> L46
            if (r7 != r1) goto L43
            return r1
        L43:
            android.net.Uri r7 = (android.net.Uri) r7     // Catch: defpackage.pv0 -> L46
            return r7
        L46:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv0.h(rv0, rg5, k11):java.lang.Comparable");
    }

    @Override // defpackage.am5
    public final Bitmap a(rg5 rg5Var) {
        rg5Var.getClass();
        try {
            InputStream f = f(rg5Var);
            if (f == null) {
                return null;
            }
            Bitmap G = nk2.G(f);
            f.close();
            return G;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // defpackage.am5
    public final wm5 b(rg5 rg5Var) {
        rg5Var.getClass();
        try {
            InputStream f = f(rg5Var);
            if (f == null) {
                return null;
            }
            wm5 H = nk2.H(rg5Var, f);
            f.close();
            return H;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:17|(1:19)|20|(3:(2:(1:23)(1:60)|(14:25|26|27|28|29|(1:34)|35|(1:37)(2:53|54)|38|39|40|41|42|43))|42|43)|61|26|27|28|29|(2:31|34)|35|(0)(0)|38|39|40|41) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d7, code lost:
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e A[Catch: all -> 0x0064, TRY_LEAVE, TryCatch #3 {all -> 0x0064, blocks: (B:26:0x0057, B:28:0x005b, B:34:0x006a, B:36:0x006e), top: B:75:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.am5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.rg5 c(android.net.Uri r34, android.net.Uri r35) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv0.c(android.net.Uri, android.net.Uri):rg5");
    }

    @Override // defpackage.am5
    public final Object d(rg5 rg5Var, qg qgVar) {
        return h(this, rg5Var, qgVar);
    }

    public final Object e(rg5 rg5Var, qv0 qv0Var) {
        o54 o54Var = this.c;
        j11 J = nk2.J(qv0Var);
        rs5 rs5Var = new rs5(J, p31.UNDECIDED);
        InputStream openInputStream = this.a.getContentResolver().openInputStream(rg5Var.d);
        if (openInputStream != null) {
            try {
                fq0 g = g(openInputStream);
                if (g != null) {
                    o54Var.a(rg5Var, new q03(24, g, rs5Var));
                    if (ln2.G(J.a())) {
                        Uri d2 = o54Var.d(rg5Var, false);
                        if (d2 == null) {
                            rs5Var.k(new kc5(new Exception("Failed to find extracted NDS ROM file")));
                        } else {
                            rs5Var.k(d2);
                        }
                    }
                    g.close();
                } else {
                    rs5Var.k(new kc5(new Exception("Failed to find an NDS ROM to extract")));
                }
                openInputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    dt3.W(openInputStream, th);
                    throw th2;
                }
            }
        } else {
            rs5Var.k(new kc5(new Exception("Failed to open compressed file for extraction")));
        }
        return rs5Var.b();
    }

    public final InputStream f(rg5 rg5Var) {
        Uri d2 = this.c.d(rg5Var, false);
        Context context = this.a;
        if (d2 != null) {
            return context.getContentResolver().openInputStream(d2);
        }
        InputStream openInputStream = context.getContentResolver().openInputStream(rg5Var.d);
        if (openInputStream != null) {
            return g(openInputStream);
        }
        return null;
    }

    public abstract fq0 g(InputStream inputStream);
}
