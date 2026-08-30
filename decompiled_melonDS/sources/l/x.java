package l;

import a1.w0;
import a6.f1;
import a6.p0;
import a6.x0;
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
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import me.magnum.melonds.R;
import q.m3;
import q.u3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x extends m implements p.j, LayoutInflater.Factory2 {

    /* renamed from: b1  reason: collision with root package name */
    public static final w0 f8462b1 = new w0(0);

    /* renamed from: c1  reason: collision with root package name */
    public static final int[] f8463c1 = {16842836};

    /* renamed from: d1  reason: collision with root package name */
    public static final boolean f8464d1 = !"robolectric".equals(Build.FINGERPRINT);
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public w[] F0;
    public w G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public Configuration L0;
    public final int M0;
    public int N0;
    public int O0;
    public boolean P0;
    public u Q0;
    public u R0;
    public boolean S0;
    public int T0;
    public boolean V0;
    public Rect W0;
    public Rect X0;
    public a0 Y0;
    public OnBackInvokedDispatcher Z0;

    /* renamed from: a1  reason: collision with root package name */
    public OnBackInvokedCallback f8465a1;

    /* renamed from: d0  reason: collision with root package name */
    public final Object f8466d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Context f8467e0;

    /* renamed from: f0  reason: collision with root package name */
    public Window f8468f0;

    /* renamed from: g0  reason: collision with root package name */
    public t f8469g0;

    /* renamed from: h0  reason: collision with root package name */
    public final Object f8470h0;

    /* renamed from: i0  reason: collision with root package name */
    public aj.g f8471i0;

    /* renamed from: j0  reason: collision with root package name */
    public o.h f8472j0;

    /* renamed from: k0  reason: collision with root package name */
    public CharSequence f8473k0;

    /* renamed from: l0  reason: collision with root package name */
    public ActionBarOverlayLayout f8474l0;

    /* renamed from: m0  reason: collision with root package name */
    public o f8475m0;

    /* renamed from: n0  reason: collision with root package name */
    public o f8476n0;

    /* renamed from: o0  reason: collision with root package name */
    public o.a f8477o0;
    public ActionBarContextView p0;

    /* renamed from: q0  reason: collision with root package name */
    public PopupWindow f8478q0;

    /* renamed from: r0  reason: collision with root package name */
    public n f8479r0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f8481t0;

    /* renamed from: u0  reason: collision with root package name */
    public ViewGroup f8482u0;

    /* renamed from: v0  reason: collision with root package name */
    public TextView f8483v0;

    /* renamed from: w0  reason: collision with root package name */
    public View f8484w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f8485x0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f8486y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f8487z0;

    /* renamed from: s0  reason: collision with root package name */
    public f1 f8480s0 = null;
    public final n U0 = new n(this, 0);

    public x(Context context, Window window, j jVar, Object obj) {
        i iVar = null;
        this.M0 = -100;
        this.f8467e0 = context;
        this.f8470h0 = jVar;
        this.f8466d0 = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof i) {
                        iVar = (i) context;
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
            if (iVar != null) {
                this.M0 = ((x) iVar.v()).M0;
            }
        }
        if (this.M0 == -100) {
            String name = this.f8466d0.getClass().getName();
            w0 w0Var = f8462b1;
            Integer num = (Integer) w0Var.get(name);
            if (num != null) {
                this.M0 = num.intValue();
                w0Var.remove(this.f8466d0.getClass().getName());
            }
        }
        if (window != null) {
            o(window);
        }
        q.r.d();
    }

    public static u5.c p(Context context) {
        u5.c cVar;
        u5.c cVar2;
        Locale locale;
        if (Build.VERSION.SDK_INT >= 33 || (cVar = m.L) == null) {
            return null;
        }
        u5.d dVar = cVar.f13491a;
        u5.c b10 = r.b(context.getApplicationContext().getResources().getConfiguration());
        if (dVar.f13492a.isEmpty()) {
            cVar2 = u5.c.f13490b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i2 = 0; i2 < b10.f13491a.f13492a.size() + dVar.f13492a.size(); i2++) {
                if (i2 < dVar.f13492a.size()) {
                    locale = dVar.f13492a.get(i2);
                } else {
                    locale = b10.f13491a.f13492a.get(i2 - dVar.f13492a.size());
                }
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
            }
            cVar2 = new u5.c(new u5.d(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        if (cVar2.f13491a.f13492a.isEmpty()) {
            return b10;
        }
        return cVar2;
    }

    public static Configuration t(Context context, int i2, u5.c cVar, Configuration configuration, boolean z10) {
        int i10;
        if (i2 != 1) {
            if (i2 != 2) {
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i10 = 32;
            }
        } else {
            i10 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i10 | (configuration2.uiMode & (-49));
        if (cVar != null) {
            r.d(configuration2, cVar);
        }
        return configuration2;
    }

    public final void A() {
        w();
        if (this.f8487z0 && this.f8471i0 == null) {
            Object obj = this.f8466d0;
            if (obj instanceof Activity) {
                this.f8471i0 = new k0((Activity) obj, this.A0);
            } else if (obj instanceof Dialog) {
                this.f8471i0 = new k0((Dialog) obj);
            }
            aj.g gVar = this.f8471i0;
            if (gVar != null) {
                gVar.g0(this.V0);
            }
        }
    }

    public final void B(int i2) {
        this.T0 = (1 << i2) | this.T0;
        if (!this.S0) {
            View decorView = this.f8468f0.getDecorView();
            WeakHashMap weakHashMap = x0.f533a;
            decorView.postOnAnimation(this.U0);
            this.S0 = true;
        }
    }

    public final int C(Context context, int i2) {
        if (i2 != -100) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        if (i2 == 3) {
                            if (this.R0 == null) {
                                this.R0 = new u(this, context);
                            }
                            return this.R0.f();
                        }
                        a0.j.p("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        return 0;
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return y(context).f();
                }
            }
            return i2;
        }
        return -1;
    }

    public final boolean D() {
        boolean z10 = this.H0;
        this.H0 = false;
        w z11 = z(0);
        if (z11.m) {
            if (!z10) {
                s(z11, true);
                return true;
            }
        } else {
            o.a aVar = this.f8477o0;
            if (aVar != null) {
                aVar.a();
                return true;
            }
            A();
            aj.g gVar = this.f8471i0;
            if (gVar == null || !gVar.n()) {
                return false;
            }
        }
        return true;
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
    public final void E(l.w r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.x.E(l.w, android.view.KeyEvent):void");
    }

    public final boolean F(w wVar, int i2, KeyEvent keyEvent) {
        p.l lVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!wVar.f8457k && !G(wVar, keyEvent)) || (lVar = wVar.f8454h) == null) {
            return false;
        }
        return lVar.performShortcut(i2, keyEvent, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d3, code lost:
        if (r13.f8454h == null) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean G(l.w r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.x.G(l.w, android.view.KeyEvent):boolean");
    }

    public final void H() {
        if (!this.f8481t0) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    public final void I() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.Z0 != null && (z(0).m || this.f8477o0 != null)) {
                z10 = true;
            }
            if (z10 && this.f8465a1 == null) {
                this.f8465a1 = s.b(this.Z0, this);
            } else if (!z10 && (onBackInvokedCallback = this.f8465a1) != null) {
                s.c(this.Z0, onBackInvokedCallback);
                this.f8465a1 = null;
            }
        }
    }

    @Override // l.m
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f8467e0);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof x)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // l.m
    public final void b() {
        if (this.f8471i0 != null) {
            A();
            if (!this.f8471i0.J()) {
                B(0);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
        if (r6.e() != false) goto L19;
     */
    @Override // p.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(p.l r6) {
        /*
            r5 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = r5.f8474l0
            r0 = 1
            r1 = 0
            if (r6 == 0) goto Lc9
            r6.k()
            q.h1 r6 = r6.f925b0
            q.m3 r6 = (q.m3) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f11964a
            int r2 = r6.getVisibility()
            if (r2 != 0) goto Lc9
            androidx.appcompat.widget.ActionMenuView r6 = r6.A
            if (r6 == 0) goto Lc9
            boolean r6 = r6.p0
            if (r6 == 0) goto Lc9
            android.content.Context r6 = r5.f8467e0
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L46
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = r5.f8474l0
            r6.k()
            q.h1 r6 = r6.f925b0
            q.m3 r6 = (q.m3) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f11964a
            androidx.appcompat.widget.ActionMenuView r6 = r6.A
            if (r6 == 0) goto Lc9
            q.j r6 = r6.f951q0
            if (r6 == 0) goto Lc9
            q.h r2 = r6.f11926o0
            if (r2 != 0) goto L46
            boolean r6 = r6.e()
            if (r6 == 0) goto Lc9
        L46:
            android.view.Window r6 = r5.f8468f0
            android.view.Window$Callback r6 = r6.getCallback()
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = r5.f8474l0
            r2.k()
            q.h1 r2 = r2.f925b0
            q.m3 r2 = (q.m3) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f11964a
            boolean r2 = r2.q()
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L84
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r5.f8474l0
            r0.k()
            q.h1 r0 = r0.f925b0
            q.m3 r0 = (q.m3) r0
            androidx.appcompat.widget.Toolbar r0 = r0.f11964a
            androidx.appcompat.widget.ActionMenuView r0 = r0.A
            if (r0 == 0) goto L76
            q.j r0 = r0.f951q0
            if (r0 == 0) goto L76
            boolean r0 = r0.c()
        L76:
            boolean r0 = r5.K0
            if (r0 != 0) goto Lc8
            l.w r0 = r5.z(r1)
            p.l r0 = r0.f8454h
            r6.onPanelClosed(r3, r0)
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
            android.view.Window r0 = r5.f8468f0
            android.view.View r0 = r0.getDecorView()
            l.n r2 = r5.U0
            r0.removeCallbacks(r2)
            r2.run()
        La1:
            l.w r0 = r5.z(r1)
            p.l r2 = r0.f8454h
            if (r2 == 0) goto Lc8
            boolean r4 = r0.f8460o
            if (r4 != 0) goto Lc8
            android.view.View r4 = r0.f8453g
            boolean r1 = r6.onPreparePanel(r1, r4, r2)
            if (r1 == 0) goto Lc8
            p.l r0 = r0.f8454h
            r6.onMenuOpened(r3, r0)
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = r5.f8474l0
            r6.k()
            q.h1 r6 = r6.f925b0
            q.m3 r6 = (q.m3) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f11964a
            r6.w()
        Lc8:
            return
        Lc9:
            l.w r6 = r5.z(r1)
            r6.f8459n = r0
            r5.s(r6, r1)
            r0 = 0
            r5.E(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.x.c(p.l):void");
    }

    @Override // p.j
    public final boolean e(p.l lVar, MenuItem menuItem) {
        int i2;
        w wVar;
        Window.Callback callback = this.f8468f0.getCallback();
        if (callback != null && !this.K0) {
            p.l k10 = lVar.k();
            w[] wVarArr = this.F0;
            if (wVarArr != null) {
                i2 = wVarArr.length;
            } else {
                i2 = 0;
            }
            int i10 = 0;
            while (true) {
                if (i10 < i2) {
                    wVar = wVarArr[i10];
                    if (wVar != null && wVar.f8454h == k10) {
                        break;
                    }
                    i10++;
                } else {
                    wVar = null;
                    break;
                }
            }
            if (wVar != null) {
                return callback.onMenuItemSelected(wVar.f8447a, menuItem);
            }
        }
        return false;
    }

    @Override // l.m
    public final void f() {
        String str;
        this.I0 = true;
        n(false, true);
        x();
        Object obj = this.f8466d0;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = m5.c.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e6) {
                    throw new IllegalArgumentException(e6);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                aj.g gVar = this.f8471i0;
                if (gVar == null) {
                    this.V0 = true;
                } else {
                    gVar.g0(true);
                }
            }
            synchronized (m.f8439b0) {
                m.h(this);
                m.Z.add(new WeakReference(this));
            }
        }
        this.L0 = new Configuration(this.f8467e0.getResources().getConfiguration());
        this.J0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // l.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f8466d0
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = l.m.f8439b0
            monitor-enter(r0)
            l.m.h(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.S0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f8468f0
            android.view.View r0 = r0.getDecorView()
            l.n r1 = r3.U0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.K0 = r0
            int r0 = r3.M0
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f8466d0
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            a1.w0 r0 = l.x.f8462b1
            java.lang.Object r1 = r3.f8466d0
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.M0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            a1.w0 r0 = l.x.f8462b1
            java.lang.Object r1 = r3.f8466d0
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            aj.g r0 = r3.f8471i0
            if (r0 == 0) goto L63
            r0.R()
        L63:
            l.u r0 = r3.Q0
            if (r0 == 0) goto L6a
            r0.c()
        L6a:
            l.u r0 = r3.R0
            if (r0 == 0) goto L71
            r0.c()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.x.g():void");
    }

    @Override // l.m
    public final boolean i(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.D0 && i2 == 108) {
            return false;
        }
        if (this.f8487z0 && i2 == 1) {
            this.f8487z0 = false;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 5) {
                    if (i2 != 10) {
                        if (i2 != 108) {
                            if (i2 != 109) {
                                return this.f8468f0.requestFeature(i2);
                            }
                            H();
                            this.A0 = true;
                            return true;
                        }
                        H();
                        this.f8487z0 = true;
                        return true;
                    }
                    H();
                    this.B0 = true;
                    return true;
                }
                H();
                this.f8486y0 = true;
                return true;
            }
            H();
            this.f8485x0 = true;
            return true;
        }
        H();
        this.D0 = true;
        return true;
    }

    @Override // l.m
    public final void j(int i2) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.f8482u0.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f8467e0).inflate(i2, viewGroup);
        this.f8469g0.a(this.f8468f0.getCallback());
    }

    @Override // l.m
    public final void k(View view) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.f8482u0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f8469g0.a(this.f8468f0.getCallback());
    }

    @Override // l.m
    public final void l(View view, ViewGroup.LayoutParams layoutParams) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.f8482u0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f8469g0.a(this.f8468f0.getCallback());
    }

    @Override // l.m
    public final void m(CharSequence charSequence) {
        this.f8473k0 = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f8474l0;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        aj.g gVar = this.f8471i0;
        if (gVar != null) {
            gVar.p0(charSequence);
            return;
        }
        TextView textView = this.f8483v0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fc A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.x.n(boolean, boolean):boolean");
    }

    public final void o(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f8468f0 == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof t)) {
                t tVar = new t(this, callback);
                this.f8469g0 = tVar;
                window.setCallback(tVar);
                Context context = this.f8467e0;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f8463c1);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    q.r a10 = q.r.a();
                    synchronized (a10) {
                        drawable = a10.f12003a.d(context, resourceId, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f8468f0 = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.Z0) == null) {
                    Object obj = this.f8466d0;
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f8465a1) != null) {
                        s.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f8465a1 = null;
                    }
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            this.Z0 = s.a(activity);
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
            a0.j.p("AppCompat has already installed itself into the Window");
            return;
        }
        a0.j.p("AppCompat has already installed itself into the Window");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010e, code lost:
        if (r10.equals("ImageButton") == false) goto L23;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x01e3 -> B:145:0x01e9). Please submit an issue!!! */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.x.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void q(int i2, w wVar, p.l lVar) {
        if (lVar == null) {
            if (wVar == null && i2 >= 0) {
                w[] wVarArr = this.F0;
                if (i2 < wVarArr.length) {
                    wVar = wVarArr[i2];
                }
            }
            if (wVar != null) {
                lVar = wVar.f8454h;
            }
        }
        if ((wVar == null || wVar.m) && !this.K0) {
            t tVar = this.f8469g0;
            Window.Callback callback = this.f8468f0.getCallback();
            tVar.getClass();
            try {
                tVar.X = true;
                callback.onPanelClosed(i2, lVar);
            } finally {
                tVar.X = false;
            }
        }
    }

    public final void r(p.l lVar) {
        q.j jVar;
        if (this.E0) {
            return;
        }
        this.E0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f8474l0;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((m3) actionBarOverlayLayout.f925b0).f11964a.A;
        if (actionMenuView != null && (jVar = actionMenuView.f951q0) != null) {
            jVar.c();
            q.f fVar = jVar.f11925n0;
            if (fVar != null && fVar.b()) {
                fVar.f11172i.dismiss();
            }
        }
        Window.Callback callback = this.f8468f0.getCallback();
        if (callback != null && !this.K0) {
            callback.onPanelClosed(108, lVar);
        }
        this.E0 = false;
    }

    public final void s(w wVar, boolean z10) {
        v vVar;
        ActionBarOverlayLayout actionBarOverlayLayout;
        if (z10 && wVar.f8447a == 0 && (actionBarOverlayLayout = this.f8474l0) != null) {
            actionBarOverlayLayout.k();
            if (((m3) actionBarOverlayLayout.f925b0).f11964a.q()) {
                r(wVar.f8454h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f8467e0.getSystemService("window");
        if (windowManager != null && wVar.m && (vVar = wVar.f8451e) != null) {
            windowManager.removeView(vVar);
            if (z10) {
                q(wVar.f8447a, wVar, null);
            }
        }
        wVar.f8457k = false;
        wVar.f8458l = false;
        wVar.m = false;
        wVar.f8452f = null;
        wVar.f8459n = true;
        if (this.G0 == wVar) {
            this.G0 = null;
        }
        if (wVar.f8447a == 0) {
            I();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r4.dispatchKeyEvent(r7) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e8, code lost:
        if (r7.c() != false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.x.u(android.view.KeyEvent):boolean");
    }

    public final void v(int i2) {
        w z10 = z(i2);
        if (z10.f8454h != null) {
            Bundle bundle = new Bundle();
            z10.f8454h.t(bundle);
            if (bundle.size() > 0) {
                z10.f8461p = bundle;
            }
            z10.f8454h.w();
            z10.f8454h.clear();
        }
        z10.f8460o = true;
        z10.f8459n = true;
        if ((i2 == 108 || i2 == 0) && this.f8474l0 != null) {
            w z11 = z(0);
            z11.f8457k = false;
            G(z11, null);
        }
    }

    public final void w() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.f8481t0) {
            Context context2 = this.f8467e0;
            int[] iArr = k.a.f7920j;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    i(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    i(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    i(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    i(10);
                }
                this.C0 = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                x();
                this.f8468f0.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (!this.D0) {
                    if (this.C0) {
                        viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                        this.A0 = false;
                        this.f8487z0 = false;
                    } else if (this.f8487z0) {
                        TypedValue typedValue = new TypedValue();
                        context2.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new o.c(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(R.id.decor_content_parent);
                        this.f8474l0 = actionBarOverlayLayout;
                        actionBarOverlayLayout.setWindowCallback(this.f8468f0.getCallback());
                        if (this.A0) {
                            this.f8474l0.j(109);
                        }
                        if (this.f8485x0) {
                            this.f8474l0.j(2);
                        }
                        if (this.f8486y0) {
                            this.f8474l0.j(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.B0 ? (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(R.layout.abc_screen_simple, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    o oVar = new o(this, 0);
                    WeakHashMap weakHashMap = x0.f533a;
                    p0.k(viewGroup, oVar);
                    if (this.f8474l0 == null) {
                        this.f8483v0 = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    boolean z10 = u3.f12027a;
                    try {
                        Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
                        if (!method.isAccessible()) {
                            method.setAccessible(true);
                        }
                        method.invoke(viewGroup, null);
                    } catch (IllegalAccessException e6) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e6);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e10) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f8468f0.findViewById(16908290);
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
                    this.f8468f0.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new o(this, 1));
                    this.f8482u0 = viewGroup;
                    Object obj = this.f8466d0;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f8473k0;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f8474l0;
                        if (actionBarOverlayLayout2 != null) {
                            actionBarOverlayLayout2.setWindowTitle(charSequence);
                        } else {
                            aj.g gVar = this.f8471i0;
                            if (gVar != null) {
                                gVar.p0(charSequence);
                            } else {
                                TextView textView = this.f8483v0;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f8482u0.findViewById(16908290);
                    View decorView = this.f8468f0.getDecorView();
                    contentFrameLayout2.f961d0.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
                    this.f8481t0 = true;
                    w z11 = z(0);
                    if (!this.K0 && z11.f8454h == null) {
                        B(108);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f8487z0 + ", windowActionBarOverlay: " + this.A0 + ", android:windowIsFloating: " + this.C0 + ", windowActionModeOverlay: " + this.B0 + ", windowNoTitle: " + this.D0 + " }");
            }
            obtainStyledAttributes.recycle();
            a0.j.p("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void x() {
        if (this.f8468f0 == null) {
            Object obj = this.f8466d0;
            if (obj instanceof Activity) {
                o(((Activity) obj).getWindow());
            }
        }
        if (this.f8468f0 != null) {
            return;
        }
        a0.j.p("We have not been given a Window");
    }

    public final b4.b y(Context context) {
        if (this.Q0 == null) {
            if (a4.n.X == null) {
                Context applicationContext = context.getApplicationContext();
                a4.n.X = new a4.n(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.Q0 = new u(this, a4.n.X);
        }
        return this.Q0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [l.w, java.lang.Object] */
    public final w z(int i2) {
        Object[] objArr = this.F0;
        if (objArr == null || objArr.length <= i2) {
            w[] wVarArr = new w[i2 + 1];
            if (objArr != null) {
                System.arraycopy(objArr, 0, wVarArr, 0, objArr.length);
            }
            this.F0 = wVarArr;
            objArr = wVarArr;
        }
        w wVar = objArr[i2];
        if (wVar == 0) {
            ?? obj = new Object();
            obj.f8447a = i2;
            obj.f8459n = false;
            objArr[i2] = obj;
            return obj;
        }
        return wVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
