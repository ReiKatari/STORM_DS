package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.stormds.emulator.R;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xk2  reason: default package */
/* loaded from: classes.dex */
public abstract class xk2 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static e33 c;
    public static e33 d;

    public static boolean A() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Vivo")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Vivo")) {
                return false;
            }
        }
        if ("vivo 1805".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static final void B(String str) {
        str.getClass();
        throw new IllegalArgumentException(lb1.A("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static final ArrayList C(Map map, qn2 qn2Var) {
        Boolean bool;
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            rb4 rb4Var = (rb4) entry.getValue();
            if (rb4Var != null) {
                bool = Boolean.valueOf(rb4Var.b);
            } else {
                bool = null;
            }
            bool.getClass();
            if (!bool.booleanValue() && !rb4Var.c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashMap.keySet()) {
            if (((Boolean) qn2Var.g((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static TypedArray D(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static ei E(String str) {
        k55 k55Var;
        int i;
        String str2;
        if (xs6.g0(str, "HTTP/1.", false)) {
            i = 9;
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt != 0) {
                    if (charAt == 1) {
                        k55Var = k55.HTTP_1_1;
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                } else {
                    k55Var = k55.HTTP_1_0;
                }
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else if (xs6.g0(str, "ICY ", false)) {
            k55Var = k55.HTTP_1_0;
            i = 4;
        } else if (xs6.g0(str, "SOURCETABLE ", false)) {
            k55Var = k55.HTTP_1_1;
            i = 12;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            Integer h0 = xs6.h0(str.substring(i, i2));
            if (h0 != null) {
                int intValue = h0.intValue();
                if (str.length() > i2) {
                    if (str.charAt(i2) == ' ') {
                        str2 = str.substring(i + 4);
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                } else {
                    str2 = "";
                }
                return new ei(k55Var, intValue, str2);
            }
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        throw new ProtocolException("Unexpected status line: ".concat(str));
    }

    public static final void F(pk6 pk6Var, nt ntVar, int i) {
        while (true) {
            int i2 = pk6Var.v;
            if (i <= i2 || i >= pk6Var.u) {
                if (i2 == 0 && i == 0) {
                    return;
                }
                pk6Var.M();
                if (pk6Var.y(pk6Var.v)) {
                    ntVar.j();
                }
                pk6Var.j();
            } else {
                return;
            }
        }
    }

    public static a74 G(a74 a74Var, n65 n65Var) {
        return mb3.L(a74Var, new ap3(19, new a0(1, n65Var, n65.class, "onPull", "onPull$material(F)F", 0, 0, 29), new yv0(2, n65Var, n65.class, "onRelease", "onRelease$material(F)F", 4, 2)));
    }

    public static Parcelable H(Parcel parcel, ClassLoader classLoader, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return r2.k(parcel, classLoader, cls);
        }
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        if (readParcelable != null && !cls.isInstance(readParcelable)) {
            StringBuilder sb = new StringBuilder("Parcelable ");
            sb.append(readParcelable.getClass());
            String name = cls.getName();
            sb.append(" is not a subclass of required class ");
            sb.append(name);
            sb.append(" provided in the parameter");
            throw new BadParcelableException(sb.toString());
        }
        return readParcelable;
    }

    public static final Object I(d67 d67Var, eo2 eo2Var) {
        yh2.y(d67Var, true, new ll1(q60.D(d67Var.Y.b()).A(d67Var.Z, d67Var, d67Var.X)));
        return mp2.Z(d67Var, false, d67Var, eo2Var);
    }

    public static int J(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final void K(String str, int i, String str2) {
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i + ", but was '" + str.charAt(i) + '\'');
    }

    public static final boolean L(String str, on2 on2Var) {
        try {
            boolean booleanValue = ((Boolean) on2Var.c()).booleanValue();
            if (!booleanValue) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchFieldException unused2) {
            Log.e("ReflectionGuard", "NoSuchField: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused3) {
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static final Object M(long j, eo2 eo2Var, s41 s41Var) {
        if (j > 0) {
            Object I = I(new d67(j, s41Var), eo2Var);
            x61 x61Var = x61.COROUTINE_SUSPENDED;
            return I;
        }
        throw new c67("Timed out immediately", null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Type inference failed for: r10v3, types: [dh5, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object N(long j, eo2 eo2Var, r41 r41Var) {
        e67 e67Var;
        int i;
        dh5 dh5Var;
        if (r41Var instanceof e67) {
            e67 e67Var2 = (e67) r41Var;
            int i2 = e67Var2.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e67Var2.Y = i2 - Integer.MIN_VALUE;
                e67Var = e67Var2;
                Object obj = e67Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = e67Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        dh5Var = e67Var.R;
                        try {
                            oi2.Y(obj);
                            return obj;
                        } catch (c67 e) {
                            e = e;
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (j > 0) {
                        ?? obj2 = new Object();
                        try {
                            e67Var.R = obj2;
                            e67Var.Y = 1;
                            d67 d67Var = new d67(j, e67Var);
                            obj2.A = d67Var;
                            Object I = I(d67Var, eo2Var);
                            if (I == x61Var) {
                                return x61Var;
                            }
                            return I;
                        } catch (c67 e2) {
                            e = e2;
                            dh5Var = obj2;
                        }
                    }
                    return null;
                }
                if (e.A != dh5Var.A) {
                    throw e;
                }
                return null;
            }
        }
        e67Var = new s41(r41Var);
        Object obj3 = e67Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = e67Var.Y;
        if (i == 0) {
        }
        if (e.A != dh5Var.A) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [k92, java.lang.Object] */
    public static final void a(el6 el6Var, a74 a74Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        boolean h;
        int i5;
        zv0 zv0Var = q60.g;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1354335728);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = xq2Var.f(el6Var);
            } else {
                h = xq2Var.h(el6Var);
            }
            if (h) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.f(a74Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(zv0Var)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        boolean z3 = true;
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i2 & 1, z)) {
            Object P = xq2Var.P();
            Object obj = P;
            if (P == ox0.a) {
                ?? obj2 = new Object();
                obj2.a = new Object();
                obj2.b = new ArrayList();
                xq2Var.l0(obj2);
                obj = obj2;
            }
            k92 k92Var = (k92) obj;
            String z4 = ii2.z(xq2Var, 7);
            Object obj3 = k92Var.a;
            ArrayList arrayList = k92Var.b;
            if (!nb3.k(el6Var, obj3)) {
                xq2Var.b0(93279711);
                k92Var.a = el6Var;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    arrayList2.add((el6) ((j92) arrayList.get(i6)).a);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(el6Var)) {
                    arrayList3.add(el6Var);
                }
                arrayList.clear();
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    Object obj4 = arrayList3.get(i7);
                    if (obj4 != null) {
                        arrayList4.add(obj4);
                    }
                }
                int size3 = arrayList4.size();
                int i8 = 0;
                while (i8 < size3) {
                    el6 el6Var2 = (el6) arrayList4.get(i8);
                    arrayList.add(new j92(el6Var2, n16.I(-1032415134, new u91(el6Var2, el6Var, arrayList3, k92Var, z4, 5), xq2Var)));
                    i8++;
                    z3 = z3;
                }
                z2 = z3;
                xq2Var.p(false);
            } else {
                z2 = true;
                xq2Var.b0(95881138);
                xq2Var.p(false);
            }
            e34 d2 = h70.d(d90.L, false);
            int B = ge7.B(xq2Var);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, a74Var);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, d2);
            yh2.K(xq2Var, ix0.e, l);
            pn pnVar = ix0.g;
            if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B))) {
                i61.v(B, xq2Var, B, pnVar);
            }
            yh2.K(xq2Var, ix0.d, E);
            cf5 A = xq2Var.A();
            if (A != null) {
                A.b |= 1;
                k92Var.c = A;
                xq2Var.b0(-1757732554);
                int size4 = arrayList.size();
                for (int i9 = 0; i9 < size4; i9++) {
                    j92 j92Var = (j92) arrayList.get(i9);
                    el6 el6Var3 = (el6) j92Var.a;
                    zv0 zv0Var2 = j92Var.b;
                    xq2Var.Z(-1515535286, el6Var3);
                    zv0Var2.e(n16.I(2017516783, new bl6(el6Var3, 0), xq2Var), xq2Var, 6);
                    xq2Var.p(false);
                }
                xq2Var.p(false);
                xq2Var.p(z2);
            } else {
                i.m("no recompose scope found");
                return;
            }
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new hp(el6Var, i, 12, a74Var);
        }
    }

    public static final void b(Boolean bool, Object obj, hu3 hu3Var, qn2 qn2Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(696924721);
        if ((i & 6) == 0) {
            if (xq2Var.h(bool)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.h(obj)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            if (xq2Var.h(qn2Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i2 & 1, z)) {
            xq2Var.X();
            if ((i & 1) != 0 && !xq2Var.B()) {
                xq2Var.V();
            } else {
                hu3Var = (hu3) xq2Var.j(zx3.a);
            }
            int i6 = i2 & (-897);
            xq2Var.q();
            boolean f = xq2Var.f(bool) | xq2Var.f(obj) | xq2Var.f(hu3Var);
            Object P = xq2Var.P();
            if (f || P == ox0.a) {
                P = new ou3(hu3Var.getLifecycle());
                xq2Var.l0(P);
            }
            c(hu3Var, (ou3) P, qn2Var, xq2Var, (i6 >> 3) & 896);
        } else {
            xq2Var.V();
        }
        hu3 hu3Var2 = hu3Var;
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new i10(bool, obj, hu3Var2, qn2Var, i, 4);
        }
    }

    public static final void c(hu3 hu3Var, ou3 ou3Var, qn2 qn2Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(228371534);
        if ((i & 6) == 0) {
            if (xq2Var.h(hu3Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.h(ou3Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(qn2Var)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        boolean z2 = false;
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i2 & 1, z)) {
            boolean h = xq2Var.h(ou3Var);
            if ((i2 & 896) == 256) {
                z2 = true;
            }
            boolean h2 = h | z2 | xq2Var.h(hu3Var);
            Object P = xq2Var.P();
            if (h2 || P == ox0.a) {
                P = new t00(hu3Var, ou3Var, qn2Var, 16);
                xq2Var.l0(P);
            }
            mb3.e(hu3Var, ou3Var, (qn2) P, xq2Var);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new rl(hu3Var, ou3Var, qn2Var, i, 14);
        }
    }

    public static final void d(cq3 cq3Var, Object obj, int i, Object obj2, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1439843069);
        if (xq2Var.f(cq3Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i3 | i2;
        if (xq2Var.f(obj)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (xq2Var.d(i)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i9 = i8 | i5;
        if (xq2Var.f(obj2)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i10 = i9 | i6;
        if ((i10 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i10 & 1, z)) {
            ((o46) obj).b(obj2, n16.I(980966366, new hp(i, cq3Var, obj2), xq2Var), xq2Var, 48);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new rl(cq3Var, obj, i, obj2, i2);
        }
    }

    public static final void e(gl6 gl6Var, a74 a74Var, fo2 fo2Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        x64 x64Var;
        int i3;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1351125615);
        if ((i & 6) == 0) {
            if (xq2Var.f(gl6Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 432;
        if ((i4 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i4 & 1, z)) {
            fo2Var = q60.g;
            el6 el6Var = (el6) gl6Var.b.getValue();
            i2 i2Var = (i2) xq2Var.j(ky0.a);
            boolean h = xq2Var.h(el6Var) | xq2Var.h(i2Var);
            Object P = xq2Var.P();
            if (h || P == ox0.a) {
                P = new bf4(el6Var, i2Var, null, 18);
                xq2Var.l0(P);
            }
            mb3.i(xq2Var, (eo2) P, el6Var);
            x64 x64Var2 = x64.a;
            a((el6) gl6Var.b.getValue(), x64Var2, xq2Var, i4 & 1008);
            x64Var = x64Var2;
        } else {
            xq2Var.V();
            x64Var = a74Var;
        }
        fo2 fo2Var2 = fo2Var;
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new rl(gl6Var, x64Var, fo2Var2, i, 26);
        }
    }

    public static final of5 f(cx4 cx4Var, int i, p97 p97Var, a47 a47Var, boolean z, int i2) {
        of5 of5Var;
        float f;
        float f2;
        if (a47Var != null) {
            of5Var = a47Var.c(p97Var.b.s(i));
        } else {
            of5Var = of5.e;
        }
        float f3 = of5Var.a;
        int r0 = cx4Var.r0(2.0f);
        if (z) {
            f = (i2 - f3) - r0;
        } else {
            f = f3;
        }
        if (z) {
            f2 = i2 - f3;
        } else {
            f2 = r0 + f3;
        }
        return new of5(f, of5Var.b, f2, of5Var.d);
    }

    public static final void g(fz4 fz4Var, ux0 ux0Var, String str) {
        fz4Var.getClass();
        jd1 b2 = ux0Var.b();
        ar0 ar0Var = fz4Var.a;
        b2.getClass();
        ar0Var.getClass();
        hv.a0(ar0Var, str);
        throw null;
    }

    public static final void h(fz4 fz4Var, x32 x32Var, Object obj) {
        fz4Var.getClass();
        obj.getClass();
        jd1 b2 = x32Var.b();
        ar0 ar0Var = fz4Var.a;
        b2.getClass();
        ar0Var.getClass();
        ar0Var.d(obj);
        ar0 a2 = gh5.a(obj.getClass());
        String c2 = a2.c();
        if (c2 == null) {
            c2 = String.valueOf(a2);
        }
        hv.a0(ar0Var, c2);
        throw null;
    }

    public static final void i(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = hx2.a[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 != i5) {
                i4--;
            } else {
                return;
            }
        }
    }

    public static pv2 j(SSLSession sSLSession) {
        List list;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            if (!cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") && !cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                rq0 r = rq0.b.r(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol != null) {
                    if (!"NONE".equals(protocol)) {
                        l67.Companion.getClass();
                        l67 a2 = k67.a(protocol);
                        try {
                            list = az7.k(sSLSession.getPeerCertificates());
                        } catch (SSLPeerUnverifiedException unused) {
                            list = yt1.A;
                        }
                        return new pv2(a2, r, az7.k(sSLSession.getLocalCertificates()), new b5(2, list));
                    }
                    e41.i("tlsVersion == NONE");
                    return null;
                }
                i.m("tlsVersion == null");
                return null;
            }
            e41.i("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        i.m("cipherSuite == null");
        return null;
    }

    public static n34 k(String str) {
        String str2;
        String str3;
        str.getClass();
        n14 b2 = n34.d.b(0, str);
        if (b2 != null) {
            Locale locale = Locale.ROOT;
            String lowerCase = ((String) ((l14) b2.a()).get(1)).toLowerCase(locale);
            lowerCase.getClass();
            String lowerCase2 = ((String) ((l14) b2.a()).get(2)).toLowerCase(locale);
            lowerCase2.getClass();
            ArrayList arrayList = new ArrayList();
            int i = b2.b().B;
            while (true) {
                int i2 = i + 1;
                if (i2 < str.length()) {
                    n14 b3 = n34.e.b(i2, str);
                    if (b3 != null) {
                        m14 m14Var = b3.c;
                        k14 b4 = m14Var.b(1);
                        if (b4 != null) {
                            str2 = b4.a;
                        } else {
                            str2 = null;
                        }
                        if (str2 == null) {
                            i = b3.b().B;
                        } else {
                            k14 b5 = m14Var.b(2);
                            if (b5 != null) {
                                str3 = b5.a;
                            } else {
                                str3 = null;
                            }
                            if (str3 == null) {
                                k14 b6 = m14Var.b(3);
                                b6.getClass();
                                str3 = b6.a;
                            } else if (qs6.L0(str3, '\'') && qs6.m0(str3, '\'') && str3.length() > 2) {
                                str3 = str3.substring(1, str3.length() - 1);
                            }
                            arrayList.add(str2);
                            arrayList.add(str3);
                            i = b3.b().B;
                        }
                    } else {
                        e41.s("Parameter is not formatted correctly: \"", str.substring(i2), "\" for: \"", str, 34);
                        return null;
                    }
                } else {
                    return new n34(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
                }
            }
        } else {
            i.h(i61.k('\"', "No subtype found for: \"", str));
            return null;
        }
    }

    public static int l(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.resourceId != 0) {
            return i;
        }
        return i2;
    }

    public static final long m(KeyEvent keyEvent) {
        return qo2.e(keyEvent.getKeyCode());
    }

    public static final int n(nj3 nj3Var) {
        nj3Var.getClass();
        switch (b83.a[nj3Var.ordinal()]) {
            case 1:
                return R.string.top_screen;
            case 2:
                return R.string.bottom_screen;
            case 3:
                return R.string.hybrid_screen;
            case 4:
                return R.string.input_dpad;
            case 5:
                return R.string.input_abxy_buttons;
            case 6:
                return R.string.input_l;
            case 7:
                return R.string.input_r;
            case 8:
                return R.string.input_start;
            case 9:
                return R.string.input_select;
            case 10:
                return R.string.input_lid;
            case 11:
                return R.string.input_pause;
            case 12:
                return R.string.input_fast_forward;
            case 13:
                return R.string.input_microphone;
            case 14:
                return R.string.input_toggle_soft_input;
            case 15:
                return R.string.reset;
            case 16:
                return R.string.input_swap_screens;
            case 17:
                return R.string.input_quick_save;
            case 18:
                return R.string.input_quick_load;
            case 19:
                return R.string.rewind;
            case 20:
                return R.string.button_translate;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return R.string.input_toggle_extra_buttons;
            default:
                i.d();
                return 0;
        }
    }

    public static String o(Class cls) {
        LinkedHashMap linkedHashMap = rd4.b;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            pd4 pd4Var = (pd4) cls.getAnnotation(pd4.class);
            if (pd4Var != null) {
                str = pd4Var.value();
            } else {
                str = null;
            }
            if (str != null && str.length() > 0) {
                linkedHashMap.put(cls, str);
            } else {
                i.f("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                return null;
            }
        }
        str.getClass();
        return str;
    }

    public static ColorStateList p(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!v(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i = typedValue.type;
        if (i != 2) {
            if (i >= 28 && i <= 31) {
                return ColorStateList.valueOf(typedValue.data);
            }
            Resources resources = typedArray.getResources();
            int resourceId = typedArray.getResourceId(1, 0);
            ThreadLocal threadLocal = rt0.a;
            try {
                return rt0.a(resources, resources.getXml(resourceId), theme);
            } catch (Exception e) {
                Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                return null;
            }
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
    }

    public static ei q(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        ei eiVar;
        if (v(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new ei(null, typedValue.data, 3, null);
            }
            try {
                eiVar = ei.c(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                eiVar = null;
            }
            if (eiVar != null) {
                return eiVar;
            }
        }
        return new ei(null, 0, 3, null);
    }

    public static final Object r(ta6 ta6Var, fb6 fb6Var) {
        Object g = ta6Var.A.g(fb6Var);
        if (g == null) {
            return null;
        }
        return g;
    }

    public static final ViewParent s(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final mz3 t(mz3 mz3Var) {
        sm3 sm3Var;
        sm3 sm3Var2 = mz3Var.k0.k0;
        while (true) {
            sm3 v = sm3Var2.v();
            sm3 sm3Var3 = null;
            if (v != null) {
                sm3Var = v.e0;
            } else {
                sm3Var = null;
            }
            if (sm3Var != null) {
                sm3 v2 = sm3Var2.v();
                if (v2 != null) {
                    sm3Var3 = v2.e0;
                }
                sm3Var3.getClass();
                if (sm3Var3.d0) {
                    sm3Var2 = sm3Var2.v();
                    sm3Var2.getClass();
                } else {
                    sm3 v3 = sm3Var2.v();
                    v3.getClass();
                    sm3Var2 = v3.e0;
                    sm3Var2.getClass();
                }
            } else {
                mz3 W0 = ((eg4) sm3Var2.B0.e).W0();
                W0.getClass();
                return W0;
            }
        }
    }

    public static final int u(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                return 1;
            }
            return 0;
        }
        return 2;
    }

    public static boolean v(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static final void w(jm3 jm3Var) {
        nc1.f0(jm3Var).E();
    }

    public static boolean x() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Blu")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Blu")) {
                return false;
            }
        }
        if ("studio x10".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean y() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Itel")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Itel")) {
                return false;
            }
        }
        if ("itel w6004".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean z() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Positivo")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Positivo")) {
                return false;
            }
        }
        if ("twist 2 pro".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }
}
