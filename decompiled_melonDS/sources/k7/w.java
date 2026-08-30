package k7;

import a6.w0;
import a6.x0;
import ah.m1;
import ai.r0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.Matrix;
import android.os.Build;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.e1;
import androidx.preference.Preference;
import f2.n0;
import i3.p0;
import j0.u0;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.magnum.melonds.R;
import n2.h2;
import n2.o1;
import n2.p1;
import org.xmlpull.v1.XmlPullParserException;
import p1.c1;
import q.k2;
import y3.v0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class w {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f8085a = false;

    /* renamed from: b  reason: collision with root package name */
    public static Method f8086b = null;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f8087c = false;

    /* renamed from: d  reason: collision with root package name */
    public static Field f8088d = null;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f8089e = 0;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f8090f = true;

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f8091g = 0;

    /* renamed from: h  reason: collision with root package name */
    public static o3.f f8092h;

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ int f8093i = 0;

    public static h8.j A(String str) {
        String group;
        String str2;
        if (str != null && !vc.h.j0(str)) {
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (matcher.matches() && (group = matcher.group(1)) != null) {
                int parseInt = Integer.parseInt(group);
                String group2 = matcher.group(2);
                if (group2 != null) {
                    int parseInt2 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    if (group3 != null) {
                        int parseInt3 = Integer.parseInt(group3);
                        if (matcher.group(4) != null) {
                            str2 = matcher.group(4);
                        } else {
                            str2 = "";
                        }
                        str2.getClass();
                        return new h8.j(str2, parseInt, parseInt2, parseInt3);
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static final void B(h2 h2Var, n2.c cVar, int i2) {
        while (true) {
            int i10 = h2Var.f9924v;
            if (i2 <= i10 || i2 >= h2Var.f9923u) {
                if (i10 == 0 && i2 == 0) {
                    return;
                }
                h2Var.M();
                if (h2Var.y(h2Var.f9924v)) {
                    cVar.n();
                }
                h2Var.j();
            } else {
                return;
            }
        }
    }

    public static void C(float f8, float[] fArr) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, f8, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    public static void D(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
    }

    public static void E(byte[] bArr, int i2, int i10) {
        bArr[i2] = (byte) (i10 >>> 24);
        bArr[i2 + 1] = (byte) (i10 >>> 16);
        bArr[i2 + 2] = (byte) (i10 >>> 8);
        bArr[i2 + 3] = (byte) i10;
    }

    public static void F(View view, na.j jVar) {
        ga.a aVar = jVar.B.f10146c;
        if (aVar != null && aVar.f5631a) {
            float f8 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                f8 += ((View) parent).getElevation();
            }
            na.h hVar = jVar.B;
            if (hVar.m != f8) {
                hVar.m = f8;
                jVar.s();
            }
        }
    }

    public static void H(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            c8.d0.l(viewGroup, z10);
        } else if (f8090f) {
            try {
                c8.d0.l(viewGroup, z10);
            } catch (NoSuchMethodError unused) {
                f8090f = false;
            }
        }
    }

    public static b5.l I(List list, l0.h hVar, l0.d dVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m0.i.d(((u0) it.next()).c()));
        }
        return a.a.A(new c8.i(a.a.A(new m0.f(new m0.m(new ArrayList(arrayList), false, ij.a.D()), dVar, 5000L)), hVar, list, 1));
    }

    public static final String J(float f8) {
        if (Float.isNaN(f8)) {
            return "NaN";
        }
        if (Float.isInfinite(f8)) {
            if (f8 < 0.0f) {
                return "-Infinity";
            }
            return "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f10 = f8 * pow;
        int i2 = (int) f10;
        if (f10 - i2 >= 0.5f) {
            i2++;
        }
        float f11 = i2 / pow;
        if (max > 0) {
            return String.valueOf(f11);
        }
        return String.valueOf((int) f11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [od.c, od.r] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, od.h] */
    public static od.r a(mc.l lVar) {
        od.b bVar = od.c.f10884d;
        bVar.getClass();
        ?? obj = new Object();
        o1 o1Var = bVar.f10885a;
        obj.f10895a = o1Var.f9966c;
        obj.f10896b = o1Var.f9965b;
        String str = (String) o1Var.f9968e;
        String str2 = (String) o1Var.f9969f;
        od.a aVar = (od.a) o1Var.f9970g;
        boolean z10 = o1Var.f9967d;
        k0.g gVar = bVar.f10886b;
        lVar.k(obj);
        if (nc.k.a(str, "    ")) {
            o1 o1Var2 = new o1(obj.f10896b, obj.f10895a, str, str2, z10, aVar);
            gVar.getClass();
            ?? cVar = new od.c(o1Var2, gVar);
            if (gVar.equals(qd.a.f12509a)) {
                return cVar;
            }
            od.a aVar2 = od.a.NONE;
            return cVar;
        }
        a0.j.h("Indent should not be specified when default printing mode is used");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, n1.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final b3.p r36, n1.x r37, final l1.d1 r38, final boolean r39, final h1.q0 r40, final boolean r41, final f1.i r42, b3.f r43, l1.h r44, b3.g r45, l1.f r46, final mc.l r47, n2.m r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 1165
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.w.b(b3.p, n1.x, l1.d1, boolean, h1.q0, boolean, f1.i, b3.f, l1.h, b3.g, l1.f, mc.l, n2.m, int, int, int):void");
    }

    public static final void c(a7.i iVar, y2.d dVar, v2.c cVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(233973821);
        if (rVar.h(iVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i2;
        if (rVar.h(dVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        if (((i12 | i11) & 147) == 146 && rVar.A()) {
            rVar.R();
        } else {
            n2.s.b(new o1[]{x6.a.f14372a.a(iVar), u6.d.f13496a.a(iVar), r7.a.f12619a.a(iVar)}, v2.h.c(1808964477, new b7.m(1, dVar, cVar), rVar), rVar, 56);
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new ai.m0(iVar, dVar, cVar, i2, 1);
        }
    }

    public static final void d(y2.d dVar, v2.c cVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        w6.c cVar2;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(832919318);
        if (rVar.h(dVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i2;
        if (rVar.h(cVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i13 = i12 | i11;
        if ((i13 & 19) == 18 && rVar.A()) {
            rVar.R();
        } else {
            Object L = rVar.L();
            if (L == n2.l.f9953a) {
                L = new a7.a(9);
                rVar.h0(L);
            }
            mc.l lVar = (mc.l) L;
            e1 a10 = x6.a.a(rVar);
            if (a10 != null) {
                nc.e a11 = nc.u.a(b7.a.class);
                m1 m1Var = new m1(8, (byte) 0);
                m1Var.b(nc.u.a(b7.a.class), lVar);
                jb.e e6 = m1Var.e();
                if (a10 instanceof androidx.lifecycle.k) {
                    cVar2 = ((androidx.lifecycle.k) a10).getDefaultViewModelCreationExtras();
                } else {
                    cVar2 = w6.a.f14160b;
                }
                b7.a aVar = (b7.a) p7.j.M(a11, a10, e6, cVar2, rVar);
                aVar.f2082c = new a0.b(dVar);
                dVar.a(aVar.f2081b, cVar, rVar, ((i13 << 6) & 896) | (i13 & 112));
            } else {
                a0.j.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new r0(dVar, cVar, i2, 3);
        }
    }

    public static final void e(b3.p pVar, v2.c cVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-1854833411);
        if (rVar.f(pVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i2;
        if ((i11 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i11 & 1, z10)) {
            Object L = rVar.L();
            if (L == n2.l.f9953a) {
                L = n0.f4758a;
                rVar.h0(L);
            }
            v0 v0Var = (v0) L;
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(pVar, rVar);
            a4.h.f220a.getClass();
            a4.f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            n2.s.C(v0Var, a4.g.f215e, rVar);
            n2.s.C(l10, a4.g.f214d, rVar);
            n2.s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
            n2.s.y(rVar, a4.g.f217g);
            n2.s.C(c4, a4.g.f213c, rVar);
            cVar.j(rVar, 6);
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new r0(pVar, cVar, i2, 4);
        }
    }

    public static final void f(Preference preference, androidx.preference.o oVar) {
        preference.getClass();
        androidx.preference.o onPreferenceChangeListener = preference.getOnPreferenceChangeListener();
        if (onPreferenceChangeListener instanceof ji.a) {
            ((ji.a) onPreferenceChangeListener).f7906a.add(oVar);
            return;
        }
        ji.a aVar = new ji.a();
        ArrayList arrayList = aVar.f7906a;
        if (onPreferenceChangeListener != null) {
            arrayList.add(onPreferenceChangeListener);
        }
        arrayList.add(oVar);
        preference.setOnPreferenceChangeListener(aVar);
    }

    public static void g(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k0.d] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, k0.d] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, k0.d] */
    public static k0.d h(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                return new Object();
            }
            return new Object();
        }
        return new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [a6.w0, java.lang.Object] */
    public static boolean i(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = x0.f533a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = w0.f519d;
            w0 w0Var = (w0) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            w0 w0Var2 = w0Var;
            if (w0Var == null) {
                ?? obj = new Object();
                obj.f520a = null;
                obj.f521b = null;
                obj.f522c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, obj);
                w0Var2 = obj;
            }
            WeakReference weakReference2 = w0Var2.f522c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                w0Var2.f522c = new WeakReference(keyEvent);
                if (w0Var2.f521b == null) {
                    w0Var2.f521b = new SparseArray();
                }
                SparseArray sparseArray = w0Var2.f521b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    m9.o.b();
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean j(a6.o r6, android.view.View r7, android.view.Window.Callback r8, android.view.KeyEvent r9) {
        /*
            r0 = 0
            if (r6 != 0) goto L5
            goto Le4
        L5:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L10
            boolean r6 = r6.e(r9)
            return r6
        L10:
            boolean r1 = r8 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L82
            android.app.Activity r8 = (android.app.Activity) r8
            r8.onUserInteraction()
            android.view.Window r6 = r8.getWindow()
            r7 = 8
            boolean r7 = r6.hasFeature(r7)
            if (r7 == 0) goto L65
            android.app.ActionBar r7 = r8.getActionBar()
            int r1 = r9.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L65
            if (r7 == 0) goto L65
            boolean r1 = k7.w.f8085a
            if (r1 != 0) goto L4d
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class<android.view.KeyEvent> r5 = android.view.KeyEvent.class
            java.lang.Class[] r5 = new java.lang.Class[]{r5}     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4b
            k7.w.f8086b = r1     // Catch: java.lang.NoSuchMethodException -> L4b
        L4b:
            k7.w.f8085a = r3
        L4d:
            java.lang.reflect.Method r1 = k7.w.f8086b
            if (r1 == 0) goto L62
            java.lang.Object[] r4 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> L62
            java.lang.Object r7 = r1.invoke(r7, r4)     // Catch: java.lang.Throwable -> L62
            if (r7 != 0) goto L5c
            goto L62
        L5c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L62
            boolean r0 = r7.booleanValue()     // Catch: java.lang.Throwable -> L62
        L62:
            if (r0 == 0) goto L65
            goto L81
        L65:
            boolean r7 = r6.superDispatchKeyEvent(r9)
            if (r7 == 0) goto L6c
            goto L81
        L6c:
            android.view.View r6 = r6.getDecorView()
            boolean r7 = a6.x0.d(r6, r9)
            if (r7 == 0) goto L77
            goto L81
        L77:
            if (r6 == 0) goto L7d
            android.view.KeyEvent$DispatcherState r2 = r6.getKeyDispatcherState()
        L7d:
            boolean r3 = r9.dispatch(r8, r2, r8)
        L81:
            return r3
        L82:
            boolean r1 = r8 instanceof android.app.Dialog
            if (r1 == 0) goto Ld5
            android.app.Dialog r8 = (android.app.Dialog) r8
            boolean r6 = k7.w.f8087c
            if (r6 != 0) goto L9b
            java.lang.Class<android.app.Dialog> r6 = android.app.Dialog.class
            java.lang.String r7 = "mOnKeyListener"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r7)     // Catch: java.lang.NoSuchFieldException -> L99
            k7.w.f8088d = r6     // Catch: java.lang.NoSuchFieldException -> L99
            r6.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L99
        L99:
            k7.w.f8087c = r3
        L9b:
            java.lang.reflect.Field r6 = k7.w.f8088d
            if (r6 == 0) goto La6
            java.lang.Object r6 = r6.get(r8)     // Catch: java.lang.IllegalAccessException -> La6
            android.content.DialogInterface$OnKeyListener r6 = (android.content.DialogInterface.OnKeyListener) r6     // Catch: java.lang.IllegalAccessException -> La6
            goto La7
        La6:
            r6 = r2
        La7:
            if (r6 == 0) goto Lb4
            int r7 = r9.getKeyCode()
            boolean r6 = r6.onKey(r8, r7, r9)
            if (r6 == 0) goto Lb4
            goto Ld4
        Lb4:
            android.view.Window r6 = r8.getWindow()
            boolean r7 = r6.superDispatchKeyEvent(r9)
            if (r7 == 0) goto Lbf
            goto Ld4
        Lbf:
            android.view.View r6 = r6.getDecorView()
            boolean r7 = a6.x0.d(r6, r9)
            if (r7 == 0) goto Lca
            goto Ld4
        Lca:
            if (r6 == 0) goto Ld0
            android.view.KeyEvent$DispatcherState r2 = r6.getKeyDispatcherState()
        Ld0:
            boolean r3 = r9.dispatch(r8, r2, r8)
        Ld4:
            return r3
        Ld5:
            if (r7 == 0) goto Ldd
            boolean r7 = a6.x0.d(r7, r9)
            if (r7 != 0) goto Le3
        Ldd:
            boolean r6 = r6.e(r9)
            if (r6 == 0) goto Le4
        Le3:
            return r3
        Le4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.w.j(a6.o, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    public static View k(View view, int i2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View findViewById = viewGroup.getChildAt(i10).findViewById(i2);
                if (findViewById != null) {
                    return findViewById;
                }
            }
            return null;
        }
        return null;
    }

    public static final int l(p4.j jVar, int i2) {
        boolean z10;
        boolean z11;
        if (nc.k.b(jVar.A, p4.j.B.A) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i2 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && z10) {
            return 3;
        }
        if (z10) {
            return 1;
        }
        if (!z11) {
            return 0;
        }
        return 2;
    }

    public static ColorStateList m(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList z10;
        if (typedArray.hasValue(i2) && (resourceId = typedArray.getResourceId(i2, 0)) != 0 && (z10 = aj.g.z(context, resourceId)) != null) {
            return z10;
        }
        return typedArray.getColorStateList(i2);
    }

    public static ColorStateList n(Context context, c1 c1Var, int i2) {
        int resourceId;
        ColorStateList z10;
        TypedArray typedArray = (TypedArray) c1Var.B;
        if (typedArray.hasValue(i2) && (resourceId = typedArray.getResourceId(i2, 0)) != 0 && (z10 = aj.g.z(context, resourceId)) != null) {
            return z10;
        }
        return c1Var.e(i2);
    }

    public static String o(d7.c cVar, int i2) {
        cVar.getClass();
        if (i2 <= 16777215) {
            return String.valueOf(i2);
        }
        try {
            Context context = cVar.f3920a;
            context.getClass();
            String resourceName = context.getResources().getResourceName(i2);
            resourceName.getClass();
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i2);
        }
    }

    public static Drawable p(Context context, int i2) {
        return k2.b().c(context, i2);
    }

    public static Drawable q(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable p10;
        if (typedArray.hasValue(i2) && (resourceId = typedArray.getResourceId(i2, 0)) != 0 && (p10 = p(context, resourceId)) != null) {
            return p10;
        }
        return typedArray.getDrawable(i2);
    }

    public static final o3.f r() {
        o3.f fVar = f8092h;
        if (fVar != null) {
            return fVar;
        }
        o3.e eVar = new o3.e("Filled.Folder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = o3.h0.f10763a;
        p0 p0Var = new p0(i3.s.f6681b);
        j0.o1 o1Var = new j0.o1(2, false);
        o1Var.q(10.0f, 4.0f);
        o1Var.m(4.0f);
        o1Var.i(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        o1Var.o(2.0f, 18.0f);
        o1Var.i(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        o1Var.n(16.0f);
        o1Var.i(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        o1Var.v(8.0f);
        o1Var.i(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        o1Var.n(-8.0f);
        o1Var.p(-2.0f, -2.0f);
        o1Var.g();
        o3.e.a(eVar, o1Var.f7269a, p0Var);
        o3.f b10 = eVar.b();
        f8092h = b10;
        return b10;
    }

    public static uc.f s(a7.x xVar) {
        xVar.getClass();
        return uc.h.J(xVar, new a7.a(5));
    }

    public static int t(int i2, byte[] bArr) {
        return (bArr[i2 + 3] & 255) | (bArr[i2] << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }

    public static final boolean v(l4.h hVar) {
        int length = hVar.B.length();
        List list = hVar.A;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                l4.f fVar = (l4.f) list.get(i2);
                if ((fVar.f8790a instanceof l4.p) && l4.j.b(0, length, fVar.f8791b, fVar.f8792c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean w(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static final n3.b z(n2.m mVar, int i2) {
        TypedValue typedValue;
        n2.r rVar = (n2.r) mVar;
        Context context = (Context) rVar.j(b4.r0.f1937b);
        Resources resources = (Resources) rVar.j(b4.r0.f1938c);
        g4.d dVar = (g4.d) rVar.j(b4.r0.f1940e);
        synchronized (dVar) {
            typedValue = (TypedValue) dVar.f5560a.b(i2);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i2, typedValue, true);
                a1.x xVar = dVar.f5560a;
                int d4 = xVar.d(i2);
                Object[] objArr = xVar.f63c;
                Object obj = objArr[d4];
                xVar.f62b[d4] = i2;
                objArr[d4] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        g4.a aVar = null;
        if (charSequence != null && vc.h.a0(charSequence, ".xml")) {
            rVar.X(-1771798434);
            Resources.Theme theme = context.getTheme();
            int i10 = typedValue.changingConfigurations;
            g4.c cVar = (g4.c) rVar.j(b4.r0.f1939d);
            g4.b bVar = new g4.b(theme, i2);
            WeakReference weakReference = (WeakReference) cVar.f5559a.get(bVar);
            if (weakReference != null) {
                aVar = (g4.a) weakReference.get();
            }
            if (aVar == null) {
                XmlResourceParser xml = resources.getXml(i2);
                int next = xml.next();
                while (next != 2 && next != 1) {
                    next = xml.next();
                }
                if (next == 2) {
                    if (nc.k.a(xml.getName(), "vector")) {
                        aVar = pc.a.D(theme, resources, xml, i10);
                        cVar.f5559a.put(bVar, new WeakReference(aVar));
                    } else {
                        a0.j.h("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                        return null;
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            }
            o3.j0 d10 = o3.b.d(aVar.f5555a, rVar);
            rVar.p(false);
            return d10;
        }
        rVar.X(-1771643000);
        boolean f8 = rVar.f(context.getTheme()) | rVar.f(charSequence) | rVar.d(i2);
        Object L = rVar.L();
        if (f8 || L == n2.l.f9953a) {
            try {
                Drawable drawable = resources.getDrawable(i2, null);
                drawable.getClass();
                L = new i3.f(((BitmapDrawable) drawable).getBitmap());
                rVar.h0(L);
            } catch (Exception e6) {
                throw new RuntimeException("Error attempting to load resource: " + ((Object) charSequence), e6);
            }
        }
        i3.f fVar = (i3.f) L;
        int width = fVar.f6630a.getWidth();
        n3.a aVar2 = new n3.a(fVar, (fVar.f6630a.getHeight() & 4294967295L) | (width << 32));
        rVar.p(false);
        return aVar2;
    }

    public abstract void G(na.y yVar, float f8);

    public abstract float u(na.y yVar);

    public abstract void x(Throwable th2);

    public abstract void y(b9.e eVar);
}
