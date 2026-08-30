package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import androidx.preference.Preference;
import java.io.File;
import java.security.Provider;
import java.time.Instant;
import java.util.WeakHashMap;
import javax.crypto.Mac;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hm1  reason: default package */
/* loaded from: classes.dex */
public final class hm1 implements i02, p33, jp0, jq2, fp4, ou4, xv5, b64 {
    public static final String f(w70 w70Var, w70[] w70VarArr, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        w70 w70Var2 = xw4.b;
        int d = w70Var.d();
        int i5 = 0;
        while (i5 < d) {
            int i6 = (i5 + d) / 2;
            while (i6 > -1 && w70Var.i(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (w70Var.i(i2) == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte i13 = w70VarArr[i10].i(i11);
                    byte[] bArr = gk7.a;
                    int i14 = i13 & 255;
                    z = z2;
                    i3 = i14;
                }
                byte i15 = w70Var.i(i7 + i12);
                byte[] bArr2 = gk7.a;
                i4 = i3 - (i15 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                } else if (w70VarArr[i10].d() == i11) {
                    if (i10 == w70VarArr.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                } else {
                    z2 = z;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i16 = i9 - i12;
                    int d2 = w70VarArr[i10].d() - i11;
                    int length = w70VarArr.length;
                    for (int i17 = i10 + 1; i17 < length; i17++) {
                        d2 += w70VarArr[i17].d();
                    }
                    if (d2 >= i16) {
                        if (d2 <= i16) {
                            return w70Var.o(i7, i9 + i7).n(hk0.a);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            d = i6;
        }
        return null;
    }

    public static final pm h(int i, String str) {
        WeakHashMap weakHashMap = dg7.w;
        return new pm(i, str);
    }

    public static final p67 i(int i, String str) {
        WeakHashMap weakHashMap = dg7.w;
        return new p67(new i23(0, 0, 0, 0), str);
    }

    public static bq0 k(ab7 ab7Var, xa7 xa7Var, int i) {
        z31 z31Var;
        if ((i & 2) != 0) {
            if (ab7Var instanceof lq2) {
                xa7Var = ((lq2) ab7Var).getDefaultViewModelProviderFactory();
            } else {
                xa7Var = dc1.b;
            }
        }
        if (ab7Var instanceof lq2) {
            z31Var = ((lq2) ab7Var).getDefaultViewModelCreationExtras();
        } else {
            z31Var = x31.b;
        }
        xa7Var.getClass();
        z31Var.getClass();
        return new bq0(ab7Var.getViewModelStore(), xa7Var, z31Var);
    }

    public static Typeface l(String str, pe2 pe2Var, int i) {
        Typeface create;
        Typeface create2;
        if (i == 0 && b53.x(pe2Var, pe2.Y) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        boolean z = false;
        if (str == null) {
            create = Typeface.DEFAULT;
        } else {
            create = Typeface.create(str, 0);
        }
        int i2 = pe2Var.A;
        if (i == 1) {
            z = true;
        }
        create2 = Typeface.create(create, i2, z);
        return create2;
    }

    public static dg7 n(tu0 tu0Var) {
        sk2 sk2Var = (sk2) tu0Var;
        View view = (View) sk2Var.j(ue.f);
        dg7 q = q(view);
        boolean h = sk2Var.h(q) | sk2Var.h(view);
        Object L = sk2Var.L();
        if (h || L == su0.a) {
            L = new h57(1, q, view);
            sk2Var.h0(L);
        }
        l.d(q, (mi2) L, sk2Var);
        return q;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [f60, java.lang.Object] */
    public static jk4 o(String str) {
        str.getClass();
        w70 w70Var = f.a;
        ?? obj = new Object();
        obj.s0(str);
        return f.d(obj, false);
    }

    public static jk4 p(File file) {
        String str = jk4.B;
        String file2 = file.toString();
        file2.getClass();
        return o(file2);
    }

    public static dg7 q(View view) {
        dg7 dg7Var;
        WeakHashMap weakHashMap = dg7.w;
        synchronized (weakHashMap) {
            try {
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new dg7(view);
                    weakHashMap.put(view, obj);
                }
                dg7Var = (dg7) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dg7Var;
    }

    public static boolean r(int i, boolean z) {
        int i2;
        if (z && 29 <= (i2 = Build.VERSION.SDK_INT) && i2 < 33) {
            if (i == 1 || i == 2 || i == 6) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (defpackage.mm1.a(10000000000L, r10) == (-1)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
        r2 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (defpackage.mm1.a(1800000000000L, r10) == (-1)) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean s(int r5, int r6, long r7, boolean r9, boolean r10, defpackage.mm1 r11) {
        /*
            boolean r10 = r(r5, r10)
            java.lang.String r0 = "CXCP"
            if (r10 == 0) goto Ld
            java.lang.String r1 = "shouldRetry: Active resume mode is activated"
            android.util.Log.d(r0, r1)
        Ld:
            r1 = -1
            if (r10 != 0) goto L23
            r2 = 10000000000(0x2540be400, double:4.9406564584E-314)
            if (r11 != 0) goto L18
            goto L33
        L18:
            long r10 = r11.a
            int r4 = defpackage.mm1.a(r2, r10)
            if (r4 != r1) goto L21
            goto L33
        L21:
            r2 = r10
            goto L33
        L23:
            r2 = 1800000000000(0x1a3185c5000, double:8.89318162514E-312)
            if (r11 != 0) goto L2b
            goto L33
        L2b:
            long r10 = r11.a
            int r4 = defpackage.mm1.a(r2, r10)
            if (r4 != r1) goto L21
        L33:
            int r7 = defpackage.mm1.a(r7, r2)
            r8 = 0
            if (r7 <= 0) goto L3b
            goto L7b
        L3b:
            r7 = 1
            if (r5 != 0) goto L41
            if (r6 > r7) goto L7b
            goto L7a
        L41:
            if (r5 != r7) goto L4c
            int r5 = android.os.Build.VERSION.SDK_INT
            r9 = 29
            if (r5 >= r9) goto L7a
            if (r6 > r7) goto L7b
            goto L7a
        L4c:
            r10 = 2
            if (r5 != r10) goto L50
            goto L7a
        L50:
            r10 = 3
            if (r5 != r10) goto L58
            if (r9 == 0) goto L7a
            if (r6 > r7) goto L7b
            goto L7a
        L58:
            r9 = 4
            if (r5 != r9) goto L5c
            goto L7a
        L5c:
            r9 = 5
            if (r5 != r9) goto L60
            goto L7a
        L60:
            r9 = 6
            if (r5 != r9) goto L64
            goto L7a
        L64:
            r9 = 7
            if (r5 != r9) goto L68
            goto L7a
        L68:
            r9 = 8
            if (r5 != r9) goto L6f
            if (r6 > r7) goto L7b
            goto L7a
        L6f:
            r9 = 10
            if (r5 != r9) goto L74
            goto L7b
        L74:
            r9 = 11
            if (r5 != r9) goto L7c
            if (r6 > r7) goto L7b
        L7a:
            return r7
        L7b:
            return r8
        L7c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Unexpected CameraError: "
            r5.<init>(r6)
            hm1 r6 = defpackage.pf5.i
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r0, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hm1.s(int, int, long, boolean, boolean, mm1):boolean");
    }

    @Override // defpackage.i02
    public Object a(String str, Provider provider) {
        if (provider == null) {
            return Mac.getInstance(str);
        }
        return Mac.getInstance(str, provider);
    }

    @Override // defpackage.fp4
    public Typeface b(int i, pe2 pe2Var) {
        return l(null, pe2Var, i);
    }

    @Override // defpackage.fp4
    public Typeface c(ml2 ml2Var, pe2 pe2Var, int i) {
        ml2Var.getClass();
        return l("monospace", pe2Var, i);
    }

    @Override // defpackage.jq2
    public boolean d() {
        boolean z;
        synchronized (a62.a) {
            try {
                int i = a62.c;
                a62.c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > a62.d + 30000) {
                    boolean z2 = false;
                    a62.c = 0;
                    a62.d = SystemClock.uptimeMillis();
                    String[] list = a62.b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    if (list.length < 800) {
                        z2 = true;
                    }
                    a62.e = z2;
                }
                z = a62.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.jq2
    public boolean e(h76 h76Var) {
        int i;
        ct3 ct3Var = h76Var.a;
        boolean z = ct3Var instanceof lf1;
        int i2 = Preference.DEFAULT_ORDER;
        if (z) {
            i = ((lf1) ct3Var).o0;
        } else {
            i = Integer.MAX_VALUE;
        }
        if (i > 100) {
            ct3 ct3Var2 = h76Var.b;
            if (ct3Var2 instanceof lf1) {
                i2 = ((lf1) ct3Var2).o0;
            }
            if (i2 > 100) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.jp0
    public l23 g() {
        Instant now;
        long epochSecond;
        int nano;
        now = Instant.now();
        now.getClass();
        l23 l23Var = l23.L;
        epochSecond = now.getEpochSecond();
        nano = now.getNano();
        return hi2.m(nano, epochSecond);
    }

    @Override // defpackage.ou4
    public void j() {
    }

    @Override // defpackage.ou4
    public void m(int i, Object obj) {
    }

    @Override // defpackage.xv5
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // defpackage.xv5
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
