package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import java.util.WeakHashMap;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k2 {

    /* renamed from: g  reason: collision with root package name */
    public static k2 f11935g;

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap f11937a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakHashMap f11938b = new WeakHashMap(0);

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f11939c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11940d;

    /* renamed from: e  reason: collision with root package name */
    public w.x0 f11941e;

    /* renamed from: f  reason: collision with root package name */
    public static final PorterDuff.Mode f11934f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h  reason: collision with root package name */
    public static final j2 f11936h = new a1.s(6);

    public static synchronized k2 b() {
        k2 k2Var;
        synchronized (k2.class) {
            try {
                if (f11935g == null) {
                    f11935g = new k2();
                }
                k2Var = f11935g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return k2Var;
    }

    public static synchronized PorterDuffColorFilter e(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (k2.class) {
            j2 j2Var = f11936h;
            j2Var.getClass();
            int i10 = (31 + i2) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) j2Var.h(Integer.valueOf(mode.hashCode() + i10));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) j2Var.l(Integer.valueOf(mode.hashCode() + i10), porterDuffColorFilter);
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
            android.util.TypedValue r0 = r6.f11939c
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r6.f11939c = r0
        Lb:
            android.util.TypedValue r0 = r6.f11939c
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
            java.util.WeakHashMap r3 = r6.f11938b     // Catch: java.lang.Throwable -> L48
            java.lang.Object r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L48
            a1.q r3 = (a1.q) r3     // Catch: java.lang.Throwable -> L48
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
            w.x0 r3 = r6.f11941e
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
            android.graphics.drawable.LayerDrawable r8 = w.x0.h(r6, r7, r8)
            goto L9c
        L83:
            r3 = 2131230810(0x7f08005a, float:1.8077683E38)
            if (r8 != r3) goto L90
            r8 = 2131165244(0x7f07003c, float:1.79447E38)
            android.graphics.drawable.LayerDrawable r8 = w.x0.h(r6, r7, r8)
            goto L9c
        L90:
            r3 = 2131230812(0x7f08005c, float:1.8077687E38)
            if (r8 != r3) goto L57
            r8 = 2131165245(0x7f07003d, float:1.7944702E38)
            android.graphics.drawable.LayerDrawable r8 = w.x0.h(r6, r7, r8)
        L9c:
            if (r8 == 0) goto Lcf
            int r0 = r0.changingConfigurations
            r8.setChangingConfigurations(r0)
            monitor-enter(r6)
            android.graphics.drawable.Drawable$ConstantState r0 = r8.getConstantState()     // Catch: java.lang.Throwable -> Lbf
            if (r0 == 0) goto Lcb
            java.util.WeakHashMap r3 = r6.f11938b     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r3 = r3.get(r7)     // Catch: java.lang.Throwable -> Lbf
            a1.q r3 = (a1.q) r3     // Catch: java.lang.Throwable -> Lbf
            if (r3 != 0) goto Lc1
            a1.q r3 = new a1.q     // Catch: java.lang.Throwable -> Lbf
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lbf
            java.util.WeakHashMap r4 = r6.f11938b     // Catch: java.lang.Throwable -> Lbf
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
        throw new UnsupportedOperationException("Method not decompiled: q.k2.a(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable c(Context context, int i2) {
        return d(context, i2, false);
    }

    public final synchronized Drawable d(Context context, int i2, boolean z10) {
        Drawable a10;
        try {
            if (!this.f11940d) {
                this.f11940d = true;
                Drawable c4 = c(context, R.drawable.abc_vector_test);
                if (c4 == null || (!(c4 instanceof d8.p) && !"android.graphics.drawable.VectorDrawable".equals(c4.getClass().getName()))) {
                    this.f11940d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a10 = a(context, i2);
            if (a10 == null) {
                a10 = context.getDrawable(i2);
            }
            if (a10 != null) {
                a10 = g(context, i2, z10, a10);
            }
            if (a10 != null) {
                l1.a(a10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return a10;
    }

    public final synchronized ColorStateList f(Context context, int i2) {
        ColorStateList colorStateList;
        a1.x0 x0Var;
        WeakHashMap weakHashMap = this.f11937a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap != null && (x0Var = (a1.x0) weakHashMap.get(context)) != null) {
            colorStateList = (ColorStateList) x0Var.c(i2);
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            w.x0 x0Var2 = this.f11941e;
            if (x0Var2 != null) {
                colorStateList2 = x0Var2.j(context, i2);
            }
            if (colorStateList2 != null) {
                if (this.f11937a == null) {
                    this.f11937a = new WeakHashMap();
                }
                a1.x0 x0Var3 = (a1.x0) this.f11937a.get(context);
                if (x0Var3 == null) {
                    x0Var3 = new a1.x0(0);
                    this.f11937a.put(context, x0Var3);
                }
                x0Var3.a(i2, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable g(android.content.Context r8, int r9, boolean r10, android.graphics.drawable.Drawable r11) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.k2.g(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
