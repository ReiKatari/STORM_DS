package b4;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.inputmethodservice.InputMethodService;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class[] f1875a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean a(i4.p pVar) {
        i4.m k10 = pVar.k();
        return !k10.A.c(i4.t.f6789i);
    }

    public static final a4.n0 b(a aVar, androidx.lifecycle.r rVar) {
        if (rVar.b().compareTo(androidx.lifecycle.q.DESTROYED) > 0) {
            y2 y2Var = new y2(0, aVar);
            rVar.a(y2Var);
            return new a4.n0(5, rVar, y2Var);
        }
        fj.j.j("Cannot configure ", aVar, " to disposeComposition at Lifecycle ON_DESTROY: ", rVar, "is already destroyed");
        return null;
    }

    public static final boolean c(i4.p pVar, Resources resources) {
        boolean z10;
        Object g10 = pVar.f6770d.A.g(i4.t.f6781a);
        String str = null;
        if (g10 == null) {
            g10 = null;
        }
        List list = (List) g10;
        if (list != null) {
            str = (String) zb.l.T(list);
        }
        if (str == null && j(pVar) == null && i(pVar, resources) == null && !h(pVar)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!i4.s.e(pVar) && (pVar.f6770d.L || (pVar.n() && z10))) {
            return true;
        }
        return false;
    }

    public static final void d(b6.g gVar, i4.p pVar) {
        i4.m mVar = pVar.f6770d;
        a1.m0 m0Var = mVar.A;
        Object g10 = mVar.A.g(i4.t.f6804y);
        i4.a aVar = null;
        if (g10 == null) {
            g10 = null;
        }
        i4.i iVar = (i4.i) g10;
        if (a(pVar)) {
            if (iVar == null || iVar.f6722a != 8) {
                Object g11 = m0Var.g(i4.l.f6763y);
                if (g11 == null) {
                    g11 = null;
                }
                i4.a aVar2 = (i4.a) g11;
                if (aVar2 != null) {
                    gVar.b(new b6.d(16908358, aVar2.f6707a));
                }
                Object g12 = m0Var.g(i4.l.A);
                if (g12 == null) {
                    g12 = null;
                }
                i4.a aVar3 = (i4.a) g12;
                if (aVar3 != null) {
                    gVar.b(new b6.d(16908359, aVar3.f6707a));
                }
                Object g13 = m0Var.g(i4.l.f6764z);
                if (g13 == null) {
                    g13 = null;
                }
                i4.a aVar4 = (i4.a) g13;
                if (aVar4 != null) {
                    gVar.b(new b6.d(16908360, aVar4.f6707a));
                }
                Object g14 = m0Var.g(i4.l.B);
                if (g14 != null) {
                    aVar = g14;
                }
                i4.a aVar5 = aVar;
                if (aVar5 != null) {
                    gVar.b(new b6.d(16908361, aVar5.f6707a));
                }
            }
        }
    }

    public static final t1 e(View view) {
        n8.g gVar;
        h8.b bVar;
        Context context = view.getContext();
        ContextWrapper contextWrapper = context;
        while (contextWrapper instanceof ContextWrapper) {
            if ((contextWrapper instanceof Activity) || (contextWrapper instanceof InputMethodService) || (contextWrapper instanceof Application)) {
                break;
            }
            ContextWrapper contextWrapper2 = (ContextWrapper) contextWrapper;
            if (contextWrapper2.getBaseContext() == null) {
                break;
            }
            contextWrapper = contextWrapper2.getBaseContext();
        }
        contextWrapper = null;
        if (contextWrapper != null) {
            j8.l.f7781a.getClass();
            j8.k kVar = j8.k.f7779a;
            j8.m mVar = j8.k.f7780b;
            mVar.getClass();
            ContextWrapper contextWrapper3 = contextWrapper;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 34) {
                gVar = n8.f.f10109c;
            } else if (i2 >= 30) {
                gVar = n8.d.f10107c;
            } else {
                gVar = n8.c.f10104g;
            }
            long height = (4294967295L & bVar.c().height()) | (gVar.b(contextWrapper3, mVar.f7782b).f7777a.c().width() << 32);
            return new t1(height, p7.j.a(contextWrapper).t(zb.k.T(height)));
        }
        Configuration configuration = context.getResources().getConfiguration();
        x4.e a10 = p7.j.a(context);
        long a11 = p7.m.a(configuration.screenWidthDp, configuration.screenHeightDp);
        long W = a10.W(a11);
        return new t1((((int) Float.intBitsToFloat((int) (W & 4294967295L))) & 4294967295L) | (((int) Float.intBitsToFloat((int) (W >> 32))) << 32), a11);
    }

    public static final boolean f(Object obj) {
        if (obj instanceof z2.n) {
            z2.n nVar = (z2.n) obj;
            if (nVar.d() == n2.e.R || nVar.d() == n2.e.Z || nVar.d() == n2.e.X) {
                Object value = nVar.getValue();
                if (value != null) {
                    return f(value);
                }
                return true;
            }
        } else if ((obj instanceof yb.d) && (obj instanceof Serializable)) {
            return false;
        } else {
            for (int i2 = 0; i2 < 7; i2++) {
                if (f1875a[i2].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final float g(float[] fArr, int i2, float[] fArr2, int i10) {
        int i11 = i2 * 4;
        float f8 = (fArr[i11 + 1] * fArr2[4 + i10]) + (fArr[i11] * fArr2[i10]);
        return (fArr[i11 + 3] * fArr2[12 + i10]) + (fArr[i11 + 2] * fArr2[8 + i10]) + f8;
    }

    public static final boolean h(i4.p pVar) {
        boolean z10;
        Object g10 = pVar.f6770d.A.g(i4.t.J);
        Boolean bool = null;
        if (g10 == null) {
            g10 = null;
        }
        k4.a aVar = (k4.a) g10;
        a1.m0 m0Var = pVar.f6770d.A;
        Object g11 = m0Var.g(i4.t.f6804y);
        if (g11 == null) {
            g11 = null;
        }
        i4.i iVar = (i4.i) g11;
        if (aVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object g12 = m0Var.g(i4.t.I);
        if (g12 != null) {
            bool = g12;
        }
        if (bool != null && (iVar == null || iVar.f6722a != 4)) {
            return true;
        }
        return z10;
    }

    public static final String i(i4.p pVar, Resources resources) {
        float f8;
        int g10;
        i4.m mVar = pVar.f6770d;
        i4.m mVar2 = pVar.f6770d;
        Object g11 = mVar.A.g(i4.t.f6782b);
        String str = null;
        if (g11 == null) {
            g11 = null;
        }
        a1.m0 m0Var = mVar2.A;
        Object g12 = m0Var.g(i4.t.J);
        if (g12 == null) {
            g12 = null;
        }
        k4.a aVar = (k4.a) g12;
        Object g13 = m0Var.g(i4.t.f6804y);
        if (g13 == null) {
            g13 = null;
        }
        i4.i iVar = (i4.i) g13;
        String str2 = g11;
        if (aVar != null) {
            int i2 = e0.f1838a[aVar.ordinal()];
            str2 = g11;
            str2 = g11;
            if (i2 != 1) {
                if (i2 != 2) {
                    str2 = g11;
                    if (i2 == 3) {
                        if (g11 == null) {
                            str2 = resources.getString(R.string.indeterminate);
                        }
                    } else {
                        m9.o.o();
                        return null;
                    }
                } else if (iVar != null) {
                    str2 = g11;
                    str2 = g11;
                    if (iVar.f6722a == 2 && g11 == null) {
                        str2 = resources.getString(R.string.state_off);
                    }
                }
            } else if (iVar != null) {
                str2 = g11;
                str2 = g11;
                if (iVar.f6722a == 2 && g11 == null) {
                    str2 = resources.getString(R.string.state_on);
                }
            }
        }
        Object g14 = m0Var.g(i4.t.I);
        if (g14 == null) {
            g14 = null;
        }
        Boolean bool = (Boolean) g14;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((iVar == null || iVar.f6722a != 4) && str2 == null) {
                if (booleanValue) {
                    str2 = resources.getString(R.string.selected);
                } else {
                    str2 = resources.getString(R.string.not_selected);
                }
            }
        }
        Object g15 = m0Var.g(i4.t.f6783c);
        if (g15 == null) {
            g15 = null;
        }
        i4.h hVar = (i4.h) g15;
        String str3 = str2;
        if (hVar != null) {
            str3 = str2;
            str3 = str2;
            if (hVar != i4.h.f6719c) {
                if (str2 == null) {
                    sc.a aVar2 = hVar.f6721b;
                    float f10 = aVar2.f12864b;
                    float f11 = aVar2.f12863a;
                    if (f10 - f11 == 0.0f) {
                        f8 = 0.0f;
                    } else {
                        f8 = (hVar.f6720a - f11) / (f10 - f11);
                    }
                    if (f8 < 0.0f) {
                        f8 = 0.0f;
                    }
                    if (f8 > 1.0f) {
                        f8 = 1.0f;
                    }
                    if (f8 == 0.0f) {
                        g10 = 0;
                    } else if (f8 == 1.0f) {
                        g10 = 100;
                    } else {
                        g10 = p7.j.g(Math.round(f8 * 100), 1, 99);
                    }
                    str3 = resources.getString(R.string.template_percent, Integer.valueOf(g10));
                }
            } else if (str2 == null) {
                str3 = resources.getString(R.string.in_progress);
            }
        }
        i4.w wVar = i4.t.F;
        String str4 = str3;
        if (m0Var.c(wVar)) {
            a1.m0 m0Var2 = new i4.p(pVar.f6767a, true, pVar.f6769c, mVar2).k().A;
            Object g16 = m0Var2.g(i4.t.f6781a);
            if (g16 == null) {
                g16 = null;
            }
            Collection collection = (Collection) g16;
            if (collection == null || collection.isEmpty()) {
                Object g17 = m0Var2.g(i4.t.B);
                if (g17 == null) {
                    g17 = null;
                }
                Collection collection2 = (Collection) g17;
                if (collection2 == null || collection2.isEmpty()) {
                    Object g18 = m0Var2.g(wVar);
                    if (g18 == null) {
                        g18 = null;
                    }
                    CharSequence charSequence = (CharSequence) g18;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(R.string.state_empty);
                    }
                }
            }
            str4 = str;
        }
        return str4;
    }

    public static final l4.h j(i4.p pVar) {
        Object g10 = pVar.f6770d.A.g(i4.t.F);
        l4.h hVar = null;
        if (g10 == null) {
            g10 = null;
        }
        l4.h hVar2 = (l4.h) g10;
        Object g11 = pVar.f6770d.A.g(i4.t.B);
        if (g11 == null) {
            g11 = null;
        }
        List list = (List) g11;
        if (list != null) {
            hVar = (l4.h) zb.l.T(list);
        }
        if (hVar2 == null) {
            return hVar;
        }
        return hVar2;
    }

    public static boolean k() {
        Object obj;
        Method method;
        try {
            if (x.D1 == null) {
                x.D1 = Class.forName("android.os.SystemProperties");
            }
            Boolean bool = null;
            if (x.E1 == null) {
                Class cls = x.D1;
                if (cls != null) {
                    method = cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                } else {
                    method = null;
                }
                x.E1 = method;
            }
            Method method2 = x.E1;
            if (method2 != null) {
                obj = method2.invoke(null, "debug.layout", Boolean.FALSE);
            } else {
                obj = null;
            }
            if (obj instanceof Boolean) {
                bool = obj;
            }
            return nc.k.a(bool, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final l4.o0 l(i4.m mVar) {
        mc.l lVar;
        ArrayList arrayList = new ArrayList();
        Object g10 = mVar.A.g(i4.l.f6740a);
        if (g10 == null) {
            g10 = null;
        }
        i4.a aVar = (i4.a) g10;
        if (aVar == null || (lVar = (mc.l) aVar.f6708b) == null || !((Boolean) lVar.k(arrayList)).booleanValue()) {
            return null;
        }
        return (l4.o0) arrayList.get(0);
    }

    public static final boolean m(float[] fArr, float[] fArr2) {
        boolean z10;
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f8 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        float f18 = fArr[9];
        float f19 = fArr[10];
        float f20 = fArr[11];
        float f21 = fArr[12];
        float f22 = fArr[13];
        float f23 = fArr[14];
        float f24 = fArr[15];
        float f25 = (f8 * f14) - (f10 * f13);
        float f26 = (f8 * f15) - (f11 * f13);
        float f27 = (f8 * f16) - (f12 * f13);
        float f28 = (f10 * f15) - (f11 * f14);
        float f29 = (f10 * f16) - (f12 * f14);
        float f30 = (f11 * f16) - (f12 * f15);
        float f31 = (f17 * f22) - (f18 * f21);
        float f32 = (f17 * f23) - (f19 * f21);
        float f33 = (f17 * f24) - (f20 * f21);
        float f34 = (f18 * f23) - (f19 * f22);
        float f35 = (f18 * f24) - (f20 * f22);
        float f36 = (f19 * f24) - (f20 * f23);
        float f37 = (f30 * f31) + (((f28 * f33) + ((f27 * f34) + ((f25 * f36) - (f26 * f35)))) - (f29 * f32));
        int i2 = (f37 > 0.0f ? 1 : (f37 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            float f38 = 1.0f / f37;
            fArr2[0] = ((f16 * f34) + ((f14 * f36) - (f15 * f35))) * f38;
            fArr2[1] = (((f11 * f35) + ((-f10) * f36)) - (f12 * f34)) * f38;
            fArr2[2] = ((f24 * f28) + ((f22 * f30) - (f23 * f29))) * f38;
            fArr2[3] = (((f19 * f29) + ((-f18) * f30)) - (f20 * f28)) * f38;
            float f39 = -f13;
            fArr2[4] = (((f15 * f33) + (f39 * f36)) - (f16 * f32)) * f38;
            fArr2[5] = ((f12 * f32) + ((f36 * f8) - (f11 * f33))) * f38;
            float f40 = -f21;
            fArr2[6] = (((f23 * f27) + (f40 * f30)) - (f24 * f26)) * f38;
            fArr2[7] = ((f20 * f26) + ((f30 * f17) - (f19 * f27))) * f38;
            fArr2[8] = ((f16 * f31) + ((f13 * f35) - (f14 * f33))) * f38;
            fArr2[9] = (((f33 * f10) + ((-f8) * f35)) - (f12 * f31)) * f38;
            fArr2[10] = ((f24 * f25) + ((f21 * f29) - (f22 * f27))) * f38;
            fArr2[11] = (((f27 * f18) + ((-f17) * f29)) - (f20 * f25)) * f38;
            fArr2[12] = (((f14 * f32) + (f39 * f34)) - (f15 * f31)) * f38;
            fArr2[13] = ((f11 * f31) + ((f8 * f34) - (f10 * f32))) * f38;
            fArr2[14] = (((f22 * f26) + (f40 * f28)) - (f23 * f25)) * f38;
            fArr2[15] = ((f19 * f25) + ((f17 * f28) - (f18 * f26))) * f38;
        }
        if (i2 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }

    public static final boolean n(float f8, float f10, i3.h hVar) {
        h3.c cVar = new h3.c(f8 - 0.005f, f10 - 0.005f, f8 + 0.005f, f10 + 0.005f);
        i3.h a10 = i3.k.a();
        i3.h.b(a10, cVar);
        i3.h a11 = i3.k.a();
        a11.e(hVar, a10, 1);
        boolean isEmpty = a11.f6635a.isEmpty();
        a11.f();
        a10.f();
        return !isEmpty;
    }

    public static final boolean o(float f8, float f10, float f11, float f12, long j2) {
        float f13 = f8 - f11;
        float f14 = f10 - f12;
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        if (((f14 * f14) / (intBitsToFloat2 * intBitsToFloat2)) + ((f13 * f13) / (intBitsToFloat * intBitsToFloat)) <= 1.0f) {
            return true;
        }
        return false;
    }

    public static final void p(float[] fArr, float[] fArr2) {
        float g10 = g(fArr2, 0, fArr, 0);
        float g11 = g(fArr2, 0, fArr, 1);
        float g12 = g(fArr2, 0, fArr, 2);
        float g13 = g(fArr2, 0, fArr, 3);
        float g14 = g(fArr2, 1, fArr, 0);
        float g15 = g(fArr2, 1, fArr, 1);
        float g16 = g(fArr2, 1, fArr, 2);
        float g17 = g(fArr2, 1, fArr, 3);
        float g18 = g(fArr2, 2, fArr, 0);
        float g19 = g(fArr2, 2, fArr, 1);
        float g20 = g(fArr2, 2, fArr, 2);
        float g21 = g(fArr2, 2, fArr, 3);
        float g22 = g(fArr2, 3, fArr, 0);
        float g23 = g(fArr2, 3, fArr, 1);
        float g24 = g(fArr2, 3, fArr, 2);
        float g25 = g(fArr2, 3, fArr, 3);
        fArr[0] = g10;
        fArr[1] = g11;
        fArr[2] = g12;
        fArr[3] = g13;
        fArr[4] = g14;
        fArr[5] = g15;
        fArr[6] = g16;
        fArr[7] = g17;
        fArr[8] = g18;
        fArr[9] = g19;
        fArr[10] = g20;
        fArr[11] = g21;
        fArr[12] = g22;
        fArr[13] = g23;
        fArr[14] = g24;
        fArr[15] = g25;
    }

    public static final void q(d1 d1Var, int i2) {
        Object obj;
        Iterator<T> it = d1Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((a4.o0) ((Map.Entry) obj).getKey()).B == i2) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null && entry.getValue() != null) {
            m9.o.b();
        }
    }

    public static final String r(Object obj) {
        String simpleName;
        if (obj.getClass().isAnonymousClass()) {
            simpleName = obj.getClass().getName();
        } else {
            simpleName = obj.getClass().getSimpleName();
        }
        return simpleName + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final String s(int i2) {
        if (i2 == 0) {
            return "android.widget.Button";
        }
        if (i2 == 1) {
            return "android.widget.CheckBox";
        }
        if (i2 == 3) {
            return "android.widget.RadioButton";
        }
        if (i2 == 5) {
            return "android.widget.ImageView";
        }
        if (i2 == 6) {
            return "android.widget.Spinner";
        }
        if (i2 == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
