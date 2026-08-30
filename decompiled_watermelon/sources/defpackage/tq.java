package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tq  reason: default package */
/* loaded from: classes.dex */
public final class tq extends hq implements sw3, LayoutInflater.Factory2 {
    public static final m66 b1 = new m66(0);
    public static final int[] c1 = {16842836};
    public static final boolean d1 = !"robolectric".equals(Build.FINGERPRINT);
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public sq[] F0;
    public sq G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public Configuration L0;
    public final int M0;
    public int N0;
    public int O0;
    public boolean P0;
    public pq Q0;
    public pq R0;
    public boolean S0;
    public int T0;
    public boolean V0;
    public Rect W0;
    public Rect X0;
    public ls Y0;
    public OnBackInvokedDispatcher Z0;
    public OnBackInvokedCallback a1;
    public final Object e0;
    public final Context f0;
    public Window g0;
    public oq h0;
    public ct3 i0;
    public qi6 j0;
    public CharSequence k0;
    public ActionBarOverlayLayout l0;
    public jq m0;
    public jq n0;
    public j8 o0;
    public ActionBarContextView p0;
    public PopupWindow q0;
    public iq r0;
    public boolean t0;
    public ViewGroup u0;
    public TextView v0;
    public View w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;
    public hb7 s0 = null;
    public final iq U0 = new iq(this, 0);

    public tq(Context context, Window window, aq aqVar, Object obj) {
        xp xpVar = null;
        this.M0 = -100;
        this.f0 = context;
        this.e0 = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof xp) {
                        xpVar = (xp) context;
                        break;
                    } else if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    break;
                }
            }
            if (xpVar != null) {
                this.M0 = ((tq) xpVar.v()).M0;
            }
        }
        if (this.M0 == -100) {
            String name = this.e0.getClass().getName();
            m66 m66Var = b1;
            Integer num = (Integer) m66Var.get(name);
            if (num != null) {
                this.M0 = num.intValue();
                m66Var.remove(this.e0.getClass().getName());
            }
        }
        if (window != null) {
            m(window);
        }
        vq.d();
    }

    public static gr3 n(Context context) {
        gr3 gr3Var;
        gr3 gr3Var2;
        Locale locale;
        if (Build.VERSION.SDK_INT >= 33 || (gr3Var = hq.L) == null) {
            return null;
        }
        hr3 hr3Var = gr3Var.a;
        gr3 b = mq.b(context.getApplicationContext().getResources().getConfiguration());
        if (hr3Var.a.isEmpty()) {
            gr3Var2 = gr3.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i = 0; i < b.a.a.size() + hr3Var.a.size(); i++) {
                if (i < hr3Var.a.size()) {
                    locale = hr3Var.a.get(i);
                } else {
                    locale = b.a.a.get(i - hr3Var.a.size());
                }
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
            }
            gr3Var2 = new gr3(new hr3(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        if (gr3Var2.a.a.isEmpty()) {
            return b;
        }
        return gr3Var2;
    }

    public static Configuration r(Context context, int i, gr3 gr3Var, Configuration configuration, boolean z) {
        int i2;
        if (i != 1) {
            if (i != 2) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i2 = 32;
            }
        } else {
            i2 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = RecyclerView.A1;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (gr3Var != null) {
            mq.d(configuration2, gr3Var);
        }
        return configuration2;
    }

    public final void A(int i) {
        this.T0 = (1 << i) | this.T0;
        if (!this.S0) {
            View decorView = this.g0.getDecorView();
            WeakHashMap weakHashMap = aa7.a;
            decorView.postOnAnimation(this.U0);
            this.S0 = true;
        }
    }

    public final int B(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            if (this.R0 == null) {
                                this.R0 = new pq(this, context);
                            }
                            return this.R0.g();
                        }
                        i.n("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        return 0;
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return x(context).g();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean C() {
        boolean z = this.H0;
        this.H0 = false;
        sq y = y(0);
        if (y.m) {
            if (!z) {
                q(y, true);
                return true;
            }
        } else {
            j8 j8Var = this.o0;
            if (j8Var != null) {
                j8Var.a();
                return true;
            }
            z();
            ct3 ct3Var = this.i0;
            if (ct3Var == null || !ct3Var.P()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
        if (r6.h() != false) goto L19;
     */
    @Override // defpackage.sw3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(defpackage.uw3 r6) {
        /*
            r5 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = r5.l0
            r0 = 1
            r1 = 0
            if (r6 == 0) goto Lc9
            r6.k()
            c91 r6 = r6.c0
            yv6 r6 = (defpackage.yv6) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            int r2 = r6.getVisibility()
            if (r2 != 0) goto Lc9
            androidx.appcompat.widget.ActionMenuView r6 = r6.A
            if (r6 == 0) goto Lc9
            boolean r6 = r6.q0
            if (r6 == 0) goto Lc9
            android.content.Context r6 = r5.f0
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L46
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = r5.l0
            r6.k()
            c91 r6 = r6.c0
            yv6 r6 = (defpackage.yv6) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            androidx.appcompat.widget.ActionMenuView r6 = r6.A
            if (r6 == 0) goto Lc9
            f8 r6 = r6.r0
            if (r6 == 0) goto Lc9
            qj2 r2 = r6.p0
            if (r2 != 0) goto L46
            boolean r6 = r6.h()
            if (r6 == 0) goto Lc9
        L46:
            android.view.Window r6 = r5.g0
            android.view.Window$Callback r6 = r6.getCallback()
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = r5.l0
            r2.k()
            c91 r2 = r2.c0
            yv6 r2 = (defpackage.yv6) r2
            androidx.appcompat.widget.Toolbar r2 = r2.a
            boolean r2 = r2.q()
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L84
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r5.l0
            r0.k()
            c91 r0 = r0.c0
            yv6 r0 = (defpackage.yv6) r0
            androidx.appcompat.widget.Toolbar r0 = r0.a
            androidx.appcompat.widget.ActionMenuView r0 = r0.A
            if (r0 == 0) goto L76
            f8 r0 = r0.r0
            if (r0 == 0) goto L76
            boolean r0 = r0.c()
        L76:
            boolean r0 = r5.K0
            if (r0 != 0) goto Lc8
            sq r5 = r5.y(r1)
            uw3 r5 = r5.h
            r6.onPanelClosed(r3, r5)
            return
        L84:
            if (r6 == 0) goto Lc8
            boolean r2 = r5.K0
            if (r2 != 0) goto Lc8
            boolean r2 = r5.S0
            if (r2 == 0) goto La1
            int r2 = r5.T0
            r0 = r0 & r2
            if (r0 == 0) goto La1
            android.view.Window r0 = r5.g0
            android.view.View r0 = r0.getDecorView()
            iq r2 = r5.U0
            r0.removeCallbacks(r2)
            r2.run()
        La1:
            sq r0 = r5.y(r1)
            uw3 r2 = r0.h
            if (r2 == 0) goto Lc8
            boolean r4 = r0.o
            if (r4 != 0) goto Lc8
            android.view.View r4 = r0.g
            boolean r1 = r6.onPreparePanel(r1, r4, r2)
            if (r1 == 0) goto Lc8
            uw3 r0 = r0.h
            r6.onMenuOpened(r3, r0)
            androidx.appcompat.widget.ActionBarOverlayLayout r5 = r5.l0
            r5.k()
            c91 r5 = r5.c0
            yv6 r5 = (defpackage.yv6) r5
            androidx.appcompat.widget.Toolbar r5 = r5.a
            r5.w()
        Lc8:
            return
        Lc9:
            sq r6 = r5.y(r1)
            r6.n = r0
            r5.q(r6, r1)
            r0 = 0
            r5.E(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tq.D(uw3):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0156, code lost:
        if (r2 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0176, code lost:
        if (r2.Y.getCount() > 0) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(defpackage.sq r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tq.E(sq, android.view.KeyEvent):void");
    }

    public final boolean F(sq sqVar, int i, KeyEvent keyEvent) {
        uw3 uw3Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!sqVar.k && !G(sqVar, keyEvent)) || (uw3Var = sqVar.h) == null) {
            return false;
        }
        return uw3Var.performShortcut(i, keyEvent, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d3, code lost:
        if (r13.h == null) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean G(defpackage.sq r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tq.G(sq, android.view.KeyEvent):boolean");
    }

    public final void H() {
        if (!this.t0) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    public final void I() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.Z0 != null && (y(0).m || this.o0 != null)) {
                z = true;
            }
            if (z && this.a1 == null) {
                this.a1 = nq.b(this.Z0, this);
            } else if (!z && (onBackInvokedCallback = this.a1) != null) {
                nq.c(this.Z0, onBackInvokedCallback);
                this.a1 = null;
            }
        }
    }

    @Override // defpackage.hq
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f0);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof tq)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.hq
    public final void b() {
        if (this.i0 != null) {
            z();
            if (!this.i0.u0()) {
                A(0);
            }
        }
    }

    @Override // defpackage.hq
    public final void d() {
        String str;
        this.I0 = true;
        l(false, true);
        w();
        Object obj = this.e0;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = me2.B(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                ct3 ct3Var = this.i0;
                if (ct3Var == null) {
                    this.V0 = true;
                } else {
                    ct3Var.J0(true);
                }
            }
            synchronized (hq.c0) {
                hq.f(this);
                hq.Z.add(new WeakReference(this));
            }
        }
        this.L0 = new Configuration(this.f0.getResources().getConfiguration());
        this.J0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.hq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.e0
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = defpackage.hq.c0
            monitor-enter(r0)
            defpackage.hq.f(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
        L11:
            boolean r0 = r3.S0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.g0
            android.view.View r0 = r0.getDecorView()
            iq r1 = r3.U0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.K0 = r0
            int r0 = r3.M0
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.e0
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            m66 r0 = defpackage.tq.b1
            java.lang.Object r1 = r3.e0
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.M0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            m66 r0 = defpackage.tq.b1
            java.lang.Object r1 = r3.e0
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            ct3 r0 = r3.i0
            if (r0 == 0) goto L63
            r0.A0()
        L63:
            pq r0 = r3.Q0
            if (r0 == 0) goto L6a
            r0.d()
        L6a:
            pq r3 = r3.R0
            if (r3 == 0) goto L71
            r3.d()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tq.e():void");
    }

    @Override // defpackage.hq
    public final boolean g(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.D0 && i == 108) {
            return false;
        }
        if (this.z0 && i == 1) {
            this.z0 = false;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 5) {
                    if (i != 10) {
                        if (i != 108) {
                            if (i != 109) {
                                return this.g0.requestFeature(i);
                            }
                            H();
                            this.A0 = true;
                            return true;
                        }
                        H();
                        this.z0 = true;
                        return true;
                    }
                    H();
                    this.B0 = true;
                    return true;
                }
                H();
                this.y0 = true;
                return true;
            }
            H();
            this.x0 = true;
            return true;
        }
        H();
        this.D0 = true;
        return true;
    }

    @Override // defpackage.hq
    public final void h(int i) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.u0.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f0).inflate(i, viewGroup);
        this.h0.a(this.g0.getCallback());
    }

    @Override // defpackage.hq
    public final void i(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.u0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.h0.a(this.g0.getCallback());
    }

    @Override // defpackage.hq
    public final void j(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.u0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.h0.a(this.g0.getCallback());
    }

    @Override // defpackage.hq
    public final void k(CharSequence charSequence) {
        this.k0 = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.l0;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        ct3 ct3Var = this.i0;
        if (ct3Var != null) {
            ct3Var.N0(charSequence);
            return;
        }
        TextView textView = this.v0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fa A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tq.l(boolean, boolean):boolean");
    }

    public final void m(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.g0 == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof oq)) {
                oq oqVar = new oq(this, callback);
                this.h0 = oqVar;
                window.setCallback(oqVar);
                Context context = this.f0;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, c1);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    vq a = vq.a();
                    synchronized (a) {
                        drawable = a.a.d(context, resourceId, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.g0 = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.Z0) == null) {
                    Object obj = this.e0;
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.a1) != null) {
                        nq.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.a1 = null;
                    }
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            this.Z0 = nq.a(activity);
                            I();
                            return;
                        }
                    }
                    this.Z0 = null;
                    I();
                    return;
                }
                return;
            }
            i.n("AppCompat has already installed itself into the Window");
            return;
        }
        i.n("AppCompat has already installed itself into the Window");
    }

    public final void o(int i, sq sqVar, uw3 uw3Var) {
        if (uw3Var == null) {
            if (sqVar == null && i >= 0) {
                sq[] sqVarArr = this.F0;
                if (i < sqVarArr.length) {
                    sqVar = sqVarArr[i];
                }
            }
            if (sqVar != null) {
                uw3Var = sqVar.h;
            }
        }
        if ((sqVar == null || sqVar.m) && !this.K0) {
            oq oqVar = this.h0;
            Window.Callback callback = this.g0.getCallback();
            oqVar.getClass();
            try {
                oqVar.X = true;
                callback.onPanelClosed(i, uw3Var);
            } finally {
                oqVar.X = false;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010e, code lost:
        if (r10.equals("ImageButton") == false) goto L23;
     */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tq.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void p(uw3 uw3Var) {
        f8 f8Var;
        if (this.E0) {
            return;
        }
        this.E0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.l0;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((yv6) actionBarOverlayLayout.c0).a.A;
        if (actionMenuView != null && (f8Var = actionMenuView.r0) != null) {
            f8Var.c();
            c8 c8Var = f8Var.o0;
            if (c8Var != null && c8Var.b()) {
                c8Var.i.dismiss();
            }
        }
        Window.Callback callback = this.g0.getCallback();
        if (callback != null && !this.K0) {
            callback.onPanelClosed(108, uw3Var);
        }
        this.E0 = false;
    }

    public final void q(sq sqVar, boolean z) {
        rq rqVar;
        ActionBarOverlayLayout actionBarOverlayLayout;
        if (z && sqVar.a == 0 && (actionBarOverlayLayout = this.l0) != null) {
            actionBarOverlayLayout.k();
            if (((yv6) actionBarOverlayLayout.c0).a.q()) {
                p(sqVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f0.getSystemService("window");
        if (windowManager != null && sqVar.m && (rqVar = sqVar.e) != null) {
            windowManager.removeView(rqVar);
            if (z) {
                o(sqVar.a, sqVar, null);
            }
        }
        sqVar.k = false;
        sqVar.l = false;
        sqVar.m = false;
        sqVar.f = null;
        sqVar.n = true;
        if (this.G0 == sqVar) {
            this.G0 = null;
        }
        if (sqVar.a == 0) {
            I();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r4.dispatchKeyEvent(r7) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e8, code lost:
        if (r6.c() != false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tq.s(android.view.KeyEvent):boolean");
    }

    @Override // defpackage.sw3
    public final boolean t(uw3 uw3Var, MenuItem menuItem) {
        int i;
        sq sqVar;
        Window.Callback callback = this.g0.getCallback();
        if (callback != null && !this.K0) {
            uw3 k = uw3Var.k();
            sq[] sqVarArr = this.F0;
            if (sqVarArr != null) {
                i = sqVarArr.length;
            } else {
                i = 0;
            }
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    sqVar = sqVarArr[i2];
                    if (sqVar != null && sqVar.h == k) {
                        break;
                    }
                    i2++;
                } else {
                    sqVar = null;
                    break;
                }
            }
            if (sqVar != null) {
                return callback.onMenuItemSelected(sqVar.a, menuItem);
            }
        }
        return false;
    }

    public final void u(int i) {
        sq y = y(i);
        if (y.h != null) {
            Bundle bundle = new Bundle();
            y.h.t(bundle);
            if (bundle.size() > 0) {
                y.p = bundle;
            }
            y.h.w();
            y.h.clear();
        }
        y.o = true;
        y.n = true;
        if ((i == 108 || i == 0) && this.l0 != null) {
            sq y2 = y(0);
            y2.k = false;
            G(y2, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.t0) {
            Context context2 = this.f0;
            int[] iArr = by4.j;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    g(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    g(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    g(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    g(10);
                }
                this.C0 = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                w();
                this.g0.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (!this.D0) {
                    if (this.C0) {
                        viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                        this.A0 = false;
                        this.z0 = false;
                    } else if (this.z0) {
                        TypedValue typedValue = new TypedValue();
                        context2.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new h11(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(R.id.decor_content_parent);
                        this.l0 = actionBarOverlayLayout;
                        actionBarOverlayLayout.setWindowCallback(this.g0.getCallback());
                        if (this.A0) {
                            this.l0.j(109);
                        }
                        if (this.x0) {
                            this.l0.j(2);
                        }
                        if (this.y0) {
                            this.l0.j(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.B0 ? (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(R.layout.abc_screen_simple, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    jq jqVar = new jq(this, 0);
                    WeakHashMap weakHashMap = aa7.a;
                    s97.c(viewGroup, jqVar);
                    if (this.l0 == null) {
                        this.v0 = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    boolean z = dc7.a;
                    try {
                        Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
                        if (!method.isAccessible()) {
                            method.setAccessible(true);
                        }
                        method.invoke(viewGroup, null);
                    } catch (IllegalAccessException e) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e2) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.g0.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.g0.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new jq(this, 1));
                    this.u0 = viewGroup;
                    Object obj = this.e0;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.k0;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = this.l0;
                        if (actionBarOverlayLayout2 != null) {
                            actionBarOverlayLayout2.setWindowTitle(charSequence);
                        } else {
                            ct3 ct3Var = this.i0;
                            if (ct3Var != null) {
                                ct3Var.N0(charSequence);
                            } else {
                                TextView textView = this.v0;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.u0.findViewById(16908290);
                    View decorView = this.g0.getDecorView();
                    contentFrameLayout2.e0.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (contentFrameLayout2.isLaidOut()) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.t0 = true;
                    sq y = y(0);
                    if (!this.K0 && y.h == null) {
                        A(108);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.z0 + ", windowActionBarOverlay: " + this.A0 + ", android:windowIsFloating: " + this.C0 + ", windowActionModeOverlay: " + this.B0 + ", windowNoTitle: " + this.D0 + " }");
            }
            obtainStyledAttributes.recycle();
            i.n("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void w() {
        if (this.g0 == null) {
            Object obj = this.e0;
            if (obj instanceof Activity) {
                m(((Activity) obj).getWindow());
            }
        }
        if (this.g0 != null) {
            return;
        }
        i.n("We have not been given a Window");
    }

    public final b2 x(Context context) {
        if (this.Q0 == null) {
            if (n85.X == null) {
                Context applicationContext = context.getApplicationContext();
                n85.X = new n85(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.Q0 = new pq(this, n85.X);
        }
        return this.Q0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, sq] */
    public final sq y(int i) {
        Object[] objArr = this.F0;
        if (objArr == null || objArr.length <= i) {
            sq[] sqVarArr = new sq[i + 1];
            if (objArr != null) {
                System.arraycopy(objArr, 0, sqVarArr, 0, objArr.length);
            }
            this.F0 = sqVarArr;
            objArr = sqVarArr;
        }
        sq sqVar = objArr[i];
        if (sqVar == 0) {
            ?? obj = new Object();
            obj.a = i;
            obj.n = false;
            objArr[i] = obj;
            return obj;
        }
        return sqVar;
    }

    public final void z() {
        v();
        if (this.z0 && this.i0 == null) {
            Object obj = this.e0;
            if (obj instanceof Activity) {
                this.i0 = new le7((Activity) obj, this.A0);
            } else if (obj instanceof Dialog) {
                this.i0 = new le7((Dialog) obj);
            }
            ct3 ct3Var = this.i0;
            if (ct3Var != null) {
                ct3Var.J0(this.V0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
