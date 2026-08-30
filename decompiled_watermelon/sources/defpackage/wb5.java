package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import java.util.WeakHashMap;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wb5  reason: default package */
/* loaded from: classes.dex */
public final class wb5 {
    public static wb5 g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public ka e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final vb5 h = new us3(6);

    public static synchronized wb5 b() {
        wb5 wb5Var;
        synchronized (wb5.class) {
            try {
                if (g == null) {
                    g = new wb5();
                }
                wb5Var = g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wb5Var;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (wb5.class) {
            vb5 vb5Var = h;
            vb5Var.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) vb5Var.h(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) vb5Var.l(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable a(android.content.Context r7, int r8) {
        /*
            r6 = this;
            android.util.TypedValue r0 = r6.c
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r6.c = r0
        Lb:
            android.util.TypedValue r0 = r6.c
            android.content.res.Resources r1 = r7.getResources()
            r2 = 1
            r1.getValue(r8, r0, r2)
            int r1 = r0.assetCookie
            long r1 = (long) r1
            r3 = 32
            long r1 = r1 << r3
            int r3 = r0.data
            long r3 = (long) r3
            long r1 = r1 | r3
            monitor-enter(r6)
            java.util.WeakHashMap r3 = r6.b     // Catch: java.lang.Throwable -> L48
            java.lang.Object r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L48
            cs3 r3 = (defpackage.cs3) r3     // Catch: java.lang.Throwable -> L48
            r4 = 0
            if (r3 != 0) goto L2e
            monitor-exit(r6)
        L2c:
            r3 = r4
            goto L50
        L2e:
            java.lang.Object r5 = r3.b(r1)     // Catch: java.lang.Throwable -> L48
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L48
            android.graphics.drawable.Drawable$ConstantState r5 = (android.graphics.drawable.Drawable.ConstantState) r5     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L4b
            android.content.res.Resources r3 = r7.getResources()     // Catch: java.lang.Throwable -> L48
            android.graphics.drawable.Drawable r3 = r5.newDrawable(r3)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r6)
            goto L50
        L48:
            r7 = move-exception
            goto Ld0
        L4b:
            r3.h(r1)     // Catch: java.lang.Throwable -> L48
        L4e:
            monitor-exit(r6)
            goto L2c
        L50:
            if (r3 == 0) goto L53
            return r3
        L53:
            ka r3 = r6.e
            if (r3 != 0) goto L59
        L57:
            r8 = r4
            goto L9c
        L59:
            r3 = 2131230776(0x7f080038, float:1.8077614E38)
            if (r8 != r3) goto L76
            android.graphics.drawable.LayerDrawable r8 = new android.graphics.drawable.LayerDrawable
            r3 = 2131230775(0x7f080037, float:1.8077612E38)
            android.graphics.drawable.Drawable r3 = r6.c(r7, r3)
            r5 = 2131230777(0x7f080039, float:1.8077616E38)
            android.graphics.drawable.Drawable r5 = r6.c(r7, r5)
            android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[]{r3, r5}
            r8.<init>(r3)
            goto L9c
        L76:
            r3 = 2131230811(0x7f08005b, float:1.8077685E38)
            if (r8 != r3) goto L83
            r8 = 2131165243(0x7f07003b, float:1.7944698E38)
            android.graphics.drawable.LayerDrawable r8 = defpackage.ka.i(r6, r7, r8)
            goto L9c
        L83:
            r3 = 2131230810(0x7f08005a, float:1.8077683E38)
            if (r8 != r3) goto L90
            r8 = 2131165244(0x7f07003c, float:1.79447E38)
            android.graphics.drawable.LayerDrawable r8 = defpackage.ka.i(r6, r7, r8)
            goto L9c
        L90:
            r3 = 2131230812(0x7f08005c, float:1.8077687E38)
            if (r8 != r3) goto L57
            r8 = 2131165245(0x7f07003d, float:1.7944702E38)
            android.graphics.drawable.LayerDrawable r8 = defpackage.ka.i(r6, r7, r8)
        L9c:
            if (r8 == 0) goto Lcf
            int r0 = r0.changingConfigurations
            r8.setChangingConfigurations(r0)
            monitor-enter(r6)
            android.graphics.drawable.Drawable$ConstantState r0 = r8.getConstantState()     // Catch: java.lang.Throwable -> Lbf
            if (r0 == 0) goto Lcb
            java.util.WeakHashMap r3 = r6.b     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r3 = r3.get(r7)     // Catch: java.lang.Throwable -> Lbf
            cs3 r3 = (defpackage.cs3) r3     // Catch: java.lang.Throwable -> Lbf
            if (r3 != 0) goto Lc1
            cs3 r3 = new cs3     // Catch: java.lang.Throwable -> Lbf
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lbf
            java.util.WeakHashMap r4 = r6.b     // Catch: java.lang.Throwable -> Lbf
            r4.put(r7, r3)     // Catch: java.lang.Throwable -> Lbf
            goto Lc1
        Lbf:
            r7 = move-exception
            goto Lcd
        Lc1:
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> Lbf
            r7.<init>(r0)     // Catch: java.lang.Throwable -> Lbf
            r3.g(r1, r7)     // Catch: java.lang.Throwable -> Lbf
            monitor-exit(r6)
            return r8
        Lcb:
            monitor-exit(r6)
            return r8
        Lcd:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lbf
            throw r7
        Lcf:
            return r8
        Ld0:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L48
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb5.a(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    public final synchronized Drawable d(Context context, int i, boolean z) {
        Drawable a;
        try {
            if (!this.d) {
                this.d = true;
                Drawable c = c(context, R.drawable.abc_vector_test);
                if (c == null || (!(c instanceof c77) && !"android.graphics.drawable.VectorDrawable".equals(c.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a = a(context, i);
            if (a == null) {
                a = context.getDrawable(i);
            }
            if (a != null) {
                a = g(context, i, z, a);
            }
            if (a != null) {
                vk1.a(a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        ec6 ec6Var;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap != null && (ec6Var = (ec6) weakHashMap.get(context)) != null) {
            colorStateList = (ColorStateList) ec6Var.c(i);
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            ka kaVar = this.e;
            if (kaVar != null) {
                colorStateList2 = kaVar.j(context, i);
            }
            if (colorStateList2 != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                ec6 ec6Var2 = (ec6) this.a.get(context);
                if (ec6Var2 == null) {
                    ec6Var2 = new ec6(0);
                    this.a.put(context, ec6Var2);
                }
                ec6Var2.a(i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable g(android.content.Context r9, int r10, boolean r11, android.graphics.drawable.Drawable r12) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb5.g(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
