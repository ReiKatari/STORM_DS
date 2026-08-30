package x8;

import a4.m0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.a1;
import androidx.lifecycle.c1;
import androidx.lifecycle.e1;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.squareup.picasso.i0;
import d0.b1;
import d0.v1;
import j0.b0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocket;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements cc.f, aj.l, w6.b, androidx.preference.r, h7.d, wc.a {
    public static e B;
    public static volatile e L;
    public final /* synthetic */ int A;

    public e(m0 m0Var) {
        this.A = 12;
    }

    public static final void e(e eVar, List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            ArrayList arrayList2 = new ArrayList(zb.m.G(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new i8.a(intValue, ((Number) it2.next()).intValue()));
            }
            zb.l.L(arrayList2, arrayList);
        }
        zb.l.s0(arrayList);
    }

    public static final void f(fj.b bVar) {
        bk.a aVar = fj.b.f4968h;
        if (fj.b.f4969i == null) {
            fj.b.f4969i = new fj.b();
            i0 i0Var = new i0("Okio Watchdog");
            i0Var.setDaemon(true);
            i0Var.start();
        }
        long nanoTime = System.nanoTime();
        long j2 = bVar.f4989c;
        boolean z10 = bVar.f4987a;
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 != 0 && z10) {
            bVar.f4975g = Math.min(j2, bVar.c() - nanoTime) + nanoTime;
        } else if (i2 != 0) {
            bVar.f4975g = nanoTime + j2;
        } else if (z10) {
            bVar.f4975g = bVar.c();
        } else {
            throw new AssertionError();
        }
        bk.a aVar2 = fj.b.f4968h;
        int i10 = aVar2.B + 1;
        aVar2.B = i10;
        fj.b[] bVarArr = (fj.b[]) aVar2.L;
        if (i10 == bVarArr.length) {
            fj.b[] bVarArr2 = new fj.b[i10 * 2];
            zb.k.l(bVarArr, bVarArr2, 0, 0, 14);
            aVar2.L = bVarArr2;
        }
        aVar2.l(i10, bVar);
        if (bVar.f4974f == 1) {
            fj.b.f4971k.signal();
        }
    }

    public static fj.b g() {
        bk.a aVar = fj.b.f4968h;
        fj.b bVar = ((fj.b[]) aVar.L)[1];
        if (bVar == null) {
            long nanoTime = System.nanoTime();
            fj.b.f4971k.await(fj.b.f4972l, TimeUnit.MILLISECONDS);
            if (((fj.b[]) aVar.L)[1] != null || System.nanoTime() - nanoTime < fj.b.m) {
                return null;
            }
            return fj.b.f4969i;
        }
        long nanoTime2 = bVar.f4975g - System.nanoTime();
        if (nanoTime2 > 0) {
            fj.b.f4971k.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        aVar.r(bVar);
        bVar.f4973e = 2;
        return bVar;
    }

    public static e h(Context context, int i2) {
        boolean z10;
        if (i2 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        p7.m.g("Cannot create a CalendarItemStyle with a styleResId of 0", z10);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, t9.a.f13162n);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        k7.w.m(context, obtainStyledAttributes, 4);
        k7.w.m(context, obtainStyledAttributes, 9);
        k7.w.m(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        na.n.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new na.a(0)).a();
        obtainStyledAttributes.recycle();
        e eVar = new e(11);
        p7.m.j(rect.left);
        p7.m.j(rect.top);
        p7.m.j(rect.right);
        p7.m.j(rect.bottom);
        return eVar;
    }

    public static a7.i i(d7.c cVar, a7.x xVar, Bundle bundle, androidx.lifecycle.q qVar, a7.o oVar) {
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        xVar.getClass();
        qVar.getClass();
        return new a7.i(cVar, xVar, bundle, qVar, oVar, uuid, null);
    }

    public static c1 j(e1 e1Var, a1 a1Var, int i2) {
        w6.c cVar;
        if ((i2 & 2) != 0) {
            if (e1Var instanceof androidx.lifecycle.k) {
                a1Var = ((androidx.lifecycle.k) e1Var).getDefaultViewModelProviderFactory();
            } else {
                a1Var = y6.b.f14781a;
            }
        }
        if (e1Var instanceof androidx.lifecycle.k) {
            cVar = ((androidx.lifecycle.k) e1Var).getDefaultViewModelCreationExtras();
        } else {
            cVar = w6.a.f14160b;
        }
        a1Var.getClass();
        cVar.getClass();
        return new c1(e1Var.getViewModelStore(), a1Var, cVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fj.e, java.lang.Object] */
    public static fj.x l(String str) {
        str.getClass();
        fj.h hVar = gj.c.f5684a;
        ?? obj = new Object();
        obj.k0(str);
        return gj.c.d(obj, false);
    }

    public static fj.x n(File file) {
        String str = fj.x.B;
        String file2 = file.toString();
        file2.getClass();
        return l(file2);
    }

    public static f0.c o(b1 b1Var, b0 b0Var) {
        h0.f x9;
        d2.t tVar = new d2.t(8, b0Var);
        List list = (List) b1Var.f3333c;
        aj.g.o("ResolvedFeatureGroup", "resolveFeatureGroup: sessionConfig = " + b1Var + ", lensFacing = " + b0Var.c());
        Set set = (Set) b1Var.f3336f;
        if (set.isEmpty() && list.isEmpty()) {
            return null;
        }
        List list2 = (List) b1Var.f3334d;
        if (set.isEmpty() && list.isEmpty()) {
            a0.j.h("Must have at least one required or preferred feature");
            return null;
        }
        Iterator it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                v1 v1Var = (v1) it.next();
                f0.g.Companion.getClass();
                if (f0.e.a(v1Var) == f0.g.UNDEFINED) {
                    x9 = new h0.d(v1Var);
                    break;
                }
            } else {
                Iterator it2 = set.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        h0.e y10 = d2.t.y((e0.b) it2.next(), list2);
                        if (y10 != null) {
                            x9 = y10;
                            break;
                        }
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            h0.e y11 = d2.t.y((e0.b) obj, list2);
                            if (y11 != null) {
                                aj.g.o("DefaultFeatureGroupResolver", "resolveFeatureGroup: filtered out preferred feature due to " + y11);
                            } else {
                                y11 = null;
                            }
                            if (y11 == null) {
                                arrayList.add(obj);
                            }
                        }
                        aj.g.o("DefaultFeatureGroupResolver", "resolveFeatureGroup: filteredPreferredFeatures = " + arrayList);
                        x9 = tVar.x(b1Var, arrayList, 0, zb.q.A);
                    }
                }
            }
        }
        if (x9 instanceof h0.b) {
            f0.c cVar = ((h0.b) x9).f5833a;
            aj.g.o("ResolvedFeatureGroup", "resolvedFeatureGroup = " + cVar);
            return cVar;
        } else if (!(x9 instanceof h0.c)) {
            if (!(x9 instanceof h0.d)) {
                if (!(x9 instanceof h0.e)) {
                    m9.o.o();
                    return null;
                }
                h0.e eVar = (h0.e) x9;
                throw new IllegalArgumentException(eVar.f5836a + " must be added for " + eVar.f5837b);
            }
            throw new IllegalArgumentException(((h0.d) x9).f5835a + " is not supported");
        } else {
            a0.j.h("Feature group is not supported");
            return null;
        }
    }

    @Override // aj.l
    public boolean a(SSLSocket sSLSocket) {
        return vc.o.V(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // aj.l
    public aj.n b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new aj.e(cls2);
    }

    @Override // androidx.preference.r
    public CharSequence c(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        if (TextUtils.isEmpty(editTextPreference.Z)) {
            return editTextPreference.getContext().getString(R.string.not_set);
        }
        return editTextPreference.Z;
    }

    @Override // wc.a
    public wc.g d() {
        wc.g gVar = wc.g.L;
        return wc.j.e(System.currentTimeMillis());
    }

    @Override // h7.d
    public void k() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // h7.d
    public void m(int i2, Object obj) {
        String str;
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case l1.c.f8511g /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case l1.c.f8509e /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case l1.c.f8508d /* 9 */:
            default:
                str = "";
                break;
            case l1.c.f8510f /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 != 6 && i2 != 7 && i2 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
    }

    public String toString() {
        switch (this.A) {
            case 2:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ e(int i2) {
        this.A = i2;
    }
}
