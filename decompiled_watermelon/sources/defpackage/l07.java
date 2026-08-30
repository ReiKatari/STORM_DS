package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.fragment.app.o;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l07  reason: default package */
/* loaded from: classes.dex */
public abstract class l07 {
    public static final et0 a = new et0(2071362912, false, new ot0(19));
    public static final et0 b = new et0(995300247, false, new ot0(20));
    public static final et0 c = new et0(-146192735, false, new pt0(8));
    public static final et0 d = new et0(-190515198, false, new pt0(9));
    public static final et0 e;
    public static final et0 f;
    public static final Type[] g;
    public static final Object h;
    public static final StackTraceElement[] i;
    public static final d96 j;
    public static ax2 k;
    public static final /* synthetic */ int l = 0;
    public static final /* synthetic */ int m = 0;

    static {
        new et0(-1750040617, false, new pt0(10));
        new et0(1713201062, false, new ot0(4));
        e = new et0(-2057829735, false, new pt0(11));
        f = new et0(-149522822, false, new pt0(12));
        g = new Type[0];
        h = new Object();
        i = new StackTraceElement[0];
        j = new d96(9);
    }

    public static zy3 A(zy3 zy3Var, bj2 bj2Var) {
        return zy3Var.f(new ru0(bj2Var));
    }

    public static final zy3 B(zy3 zy3Var, ih4 ih4Var) {
        return zy3Var.f(new jh4(ih4Var));
    }

    public static ip3 C() {
        return new ip3(10);
    }

    public static final zy3 E(zy3 zy3Var, mi2 mi2Var) {
        return zy3Var.f(new ck1(mi2Var));
    }

    public static final zy3 F(zy3 zy3Var, mi2 mi2Var) {
        return zy3Var.f(new kk1(mi2Var));
    }

    public static final zy3 G(zy3 zy3Var, mi2 mi2Var) {
        return zy3Var.f(new lk1(mi2Var));
    }

    public static final void H(hm3 hm3Var) {
        er6 er6Var = hm3Var.e;
        if (er6Var != null) {
            hm3Var.v.n(oq6.a((oq6) hm3Var.d.A, null, 0L, 3));
            zq6 zq6Var = er6Var.a;
            AtomicReference atomicReference = zq6Var.b;
            while (true) {
                if (atomicReference.compareAndSet(er6Var, null)) {
                    zq6Var.a.g();
                    break;
                } else if (atomicReference.get() != er6Var) {
                    break;
                }
            }
        }
        hm3Var.e = null;
    }

    public static boolean I(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return true;
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return I(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (Objects.equals(typeVariable.getGenericDeclaration(), typeVariable2.getGenericDeclaration()) && typeVariable.getName().equals(typeVariable2.getName())) {
                return true;
            }
            return false;
        }
    }

    public static int J(Exception exc) {
        String methodName;
        boolean z = false;
        if (exc instanceof CameraAccessException) {
            CameraAccessException cameraAccessException = (CameraAccessException) exc;
            int reason = cameraAccessException.getReason();
            if (reason == 1) {
                return 3;
            }
            if (reason != 2) {
                if (reason == 3) {
                    return 0;
                }
                if (reason == 4) {
                    return 1;
                }
                if (reason == 5) {
                    return 2;
                }
                Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                return 11;
            }
            return 6;
        } else if (exc instanceof IllegalArgumentException) {
            return 7;
        } else {
            if (exc instanceof SecurityException) {
                return 8;
            }
            if (Build.VERSION.SDK_INT == 28) {
                if (exc instanceof RuntimeException) {
                    StackTraceElement[] stackTrace = ((RuntimeException) exc).getStackTrace();
                    stackTrace.getClass();
                    if (stackTrace.length == 0) {
                        methodName = null;
                    } else {
                        methodName = stackTrace[0].getMethodName();
                    }
                    z = b53.x(methodName, "_enableShutterSound");
                }
                if (z) {
                    return 10;
                }
            }
            Log.w("CXCP", "Unexpected throwable: " + exc);
            return 11;
        }
    }

    public static pr2 K(ys0 ys0Var, xa7 xa7Var) {
        k91 a2 = ((x71) ((bc1) dk7.v(bc1.class, ys0Var))).a();
        xa7Var.getClass();
        return new pr2((hh3) a2.A, xa7Var, (os) a2.B);
    }

    public static final ax2 L() {
        ax2 ax2Var = k;
        if (ax2Var != null) {
            return ax2Var;
        }
        zw2 zw2Var = new zw2("Filled.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = f77.a;
        mb6 mb6Var = new mb6(xq0.b);
        vq2 vq2Var = new vq2(1, (byte) 0);
        vq2Var.o(19.0f, 13.0f);
        vq2Var.l(-6.0f);
        vq2Var.u(6.0f);
        vq2Var.l(-2.0f);
        vq2Var.u(-6.0f);
        vq2Var.k(5.0f);
        vq2Var.u(-2.0f);
        vq2Var.l(6.0f);
        vq2Var.t(5.0f);
        vq2Var.l(2.0f);
        vq2Var.u(6.0f);
        vq2Var.l(6.0f);
        vq2Var.u(2.0f);
        vq2Var.g();
        zw2.a(zw2Var, vq2Var.b, 0, mb6Var);
        ax2 b2 = zw2Var.b();
        k = b2;
        return b2;
    }

    public static Drawable M(Context context, int i2) {
        return wb5.b().c(context, i2);
    }

    public static pr2 N(o oVar, xa7 xa7Var) {
        k91 a2 = ((z71) ((cc1) dk7.v(cc1.class, oVar))).b.a();
        xa7Var.getClass();
        return new pr2((hh3) a2.A, xa7Var, (os) a2.B);
    }

    public static Type O(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                Class<?> cls3 = interfaces[i2];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return O(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return O(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static int P(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static final String Q(uh1 uh1Var) {
        String i2 = uh1Var.i();
        if (i2 != null) {
            return zg6.X0('.', i2, i2);
        }
        return null;
    }

    public static final m93 R(m93 m93Var) {
        m93Var.getClass();
        if (m93Var.e().h()) {
            return m93Var;
        }
        return new r84(m93Var);
    }

    public static Class S(Type type) {
        String name;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(S(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return S(((WildcardType) type).getUpperBounds()[0]);
        }
        if (type == null) {
            name = "null";
        } else {
            name = type.getClass().getName();
        }
        vd6.g("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", name);
        return null;
    }

    public static Type T(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        if (cls2.isAssignableFrom(cls)) {
            return o0(type, cls, O(type, cls, cls2), new HashMap());
        }
        throw new IllegalArgumentException(cls + " is not the same as or a subtype of " + cls2);
    }

    public static boolean Y(je0 je0Var) {
        Boolean bool;
        je0Var.getClass();
        try {
            ce0 ce0Var = je0Var.b;
            CameraCharacteristics.Key key = CameraCharacteristics.FLASH_INFO_AVAILABLE;
            key.getClass();
            bool = (Boolean) ((ia0) ce0Var).c(key);
        } catch (BufferUnderflowException e2) {
            if (oe1.a().b(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                if (ve2.D("CXCP")) {
                    Log.d("CXCP", "Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "].");
                }
            } else if (ve2.E()) {
                Log.e("CXCP", "Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "]. Flash is not available.", e2);
            }
            bool = Boolean.FALSE;
        }
        if (bool == null && ve2.I()) {
            Log.w("CXCP", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean Z(int i2, Object obj) {
        int i3;
        if (obj instanceof wi2) {
            if (obj instanceof kj2) {
                i3 = ((kj2) obj).f();
            } else if (obj instanceof ki2) {
                i3 = 0;
            } else if (obj instanceof mi2) {
                i3 = 1;
            } else if (obj instanceof aj2) {
                i3 = 2;
            } else if (obj instanceof bj2) {
                i3 = 3;
            } else if (obj instanceof cj2) {
                i3 = 4;
            } else if (obj instanceof dj2) {
                i3 = 5;
            } else if (obj instanceof ej2) {
                i3 = 6;
            } else if (obj instanceof fj2) {
                i3 = 7;
            } else if (obj instanceof gj2) {
                i3 = 8;
            } else if (obj instanceof hj2) {
                i3 = 9;
            } else if (obj instanceof li2) {
                i3 = 10;
            } else if (obj instanceof ni2) {
                i3 = 11;
            } else if (obj instanceof pi2) {
                i3 = 13;
            } else if (obj instanceof qi2) {
                i3 = 14;
            } else if (obj instanceof ri2) {
                i3 = 15;
            } else if (obj instanceof si2) {
                i3 = 16;
            } else if (obj instanceof ti2) {
                i3 = 17;
            } else if (obj instanceof ui2) {
                i3 = 18;
            } else if (obj instanceof vi2) {
                i3 = 19;
            } else if (obj instanceof xi2) {
                i3 = 20;
            } else if (obj instanceof yi2) {
                i3 = 21;
            } else {
                i3 = -1;
            }
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static final void a(zy3 zy3Var, fr5 fr5Var, long j2, et0 et0Var, tu0 tu0Var, int i2, int i3) {
        float f2;
        if ((i3 & 2) != 0) {
            fr5Var = ((m36) ((sk2) tu0Var).j(n36.a)).b;
        }
        fr5 fr5Var2 = fr5Var;
        if ((i3 & 4) != 0) {
            j2 = ((hr0) ((sk2) tu0Var).j(ir0.a)).j();
        }
        long j3 = j2;
        long b2 = ir0.b(j3, tu0Var);
        if ((i3 & 32) != 0) {
            f2 = 1.0f;
        } else {
            f2 = 8.0f;
        }
        mj2.f(zy3Var, fr5Var2, j3, b2, f2, et0Var, tu0Var, i2 & 4194302, 0);
    }

    public static final boolean a0(long j2, int i2, int i3) {
        int j3 = lz0.j(j2);
        if (i2 <= lz0.h(j2) && j3 <= i2) {
            int i4 = lz0.i(j2);
            if (i3 <= lz0.g(j2) && i4 <= i3) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:242:0x049e, code lost:
        if (r8 > ((r0 != null ? r0.longValue() : 0) + 5000)) goto L360;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:218:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0695 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0759 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x07ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0824 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0865 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x088a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x08d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0958  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0983  */
    /* JADX WARN: Type inference failed for: r0v68, types: [zy3] */
    /* JADX WARN: Type inference failed for: r2v72, types: [zy3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.oq6 r66, defpackage.mi2 r67, defpackage.zy3 r68, final defpackage.ds6 r69, final defpackage.uc7 r70, final defpackage.mi2 r71, final defpackage.l14 r72, defpackage.mb6 r73, boolean r74, final int r75, final int r76, defpackage.hx2 r77, defpackage.db3 r78, final boolean r79, final defpackage.et0 r80, defpackage.tu0 r81, int r82, int r83) {
        /*
            Method dump skipped, instructions count: 2572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l07.b(oq6, mi2, zy3, ds6, uc7, mi2, l14, mb6, boolean, int, int, hx2, db3, boolean, et0, tu0, int, int):void");
    }

    public static List b0(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static final void c(zy3 zy3Var, bq6 bq6Var, et0 et0Var, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(2036174316);
        if (sk2Var.f(zy3Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (sk2Var.h(bq6Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i6 & 1, z)) {
            tv3 d2 = d50.d(y60.L, true);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = e0(sk2Var, zy3Var);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, d2);
            oo2.S(sk2Var, mu0.e, l2);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            jv3.f(bq6Var, et0Var, sk2Var, (i6 >> 3) & 126);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new w3(zy3Var, bq6Var, et0Var, i2, 10);
        }
    }

    public static List c0(Object... objArr) {
        objArr.getClass();
        if (objArr.length > 0) {
            List asList = Arrays.asList(objArr);
            asList.getClass();
            return asList;
        }
        return pp1.A;
    }

    public static final void d(zy3 zy3Var, ki2 ki2Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1906451854);
        if ((i2 & 6) == 0) {
            if (sk2Var.f(zy3Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sk2Var.h(ki2Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            zy3 X = b53.X(zy3Var, 32.0f);
            tv3 d2 = d50.d(y60.Z, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = e0(sk2Var, X);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var, dnVar, d2);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var, dnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var, dnVar4, e0);
            lr0 a2 = jr0.a(new ot(16.0f, true, new i(1)), y60.k0, sk2Var, 54);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l3 = sk2Var.l();
            zy3 e02 = e0(sk2Var, wy3.a);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a2);
            oo2.S(sk2Var, dnVar2, l3);
            b31.x(hashCode2, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e02);
            ir6.b(me2.X(sk2Var, R.string.retro_achievements_load_error), null, 0L, 0L, null, null, 0L, new kn6(3), 0L, 0, false, 0, 0, null, null, sk2Var, 0, 0, 130558);
            i4 = 1;
            l.c(ki2Var, null, false, null, null, pu.v(sk2Var), null, f, sk2Var, ((i3 >> 3) & 14) | 805306368, 382);
            sk2Var.p(true);
            sk2Var.p(true);
        } else {
            i4 = 1;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new x4(zy3Var, ki2Var, i2, i4);
        }
    }

    public static final zy3 d0(tu0 tu0Var, zy3 zy3Var) {
        if (zy3Var.b(yd.o0)) {
            return zy3Var;
        }
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Y(1219399079);
        zy3 zy3Var2 = (zy3) zy3Var.a(new n0(4, sk2Var), wy3.a);
        sk2Var.p(false);
        return zy3Var2;
    }

    public static final void e(zy3 zy3Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1075706924);
        if (sk2Var.f(zy3Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i4 & 1, z)) {
            tv3 d2 = d50.d(y60.Z, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = e0(sk2Var, zy3Var);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, d2);
            oo2.S(sk2Var, mu0.e, l2);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            yu4.a(null, ((hr0) sk2Var.j(ir0.a)).i(), RecyclerView.A1, 0L, 0, sk2Var, 0, 29);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new ez(zy3Var, i2, 4);
        }
    }

    public static final zy3 e0(tu0 tu0Var, zy3 zy3Var) {
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.X(439770924);
        zy3 d0 = d0(sk2Var, zy3Var);
        sk2Var.p(false);
        return d0;
    }

    public static final void f(zy3 zy3Var, mp5 mp5Var, aj2 aj2Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        int i6;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-176169450);
        if ((i2 & 6) == 0) {
            if (sk2Var.f(zy3Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sk2Var.f(mp5Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.h(aj2Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            Object[] objArr = new Object[0];
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                L = new vq3(26);
                sk2Var.h0(L);
            }
            k24 k24Var = (k24) jk2.M(objArr, (ki2) L, sk2Var, 48);
            zy3 X = b53.X(zy3Var, 32.0f);
            tv3 d2 = d50.d(y60.Z, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = e0(sk2Var, X);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var, dnVar, d2);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var, dnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var, dnVar4, e0);
            lr0 a2 = jr0.a(new ot(16.0f, true, new i(1)), y60.k0, sk2Var, 54);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l3 = sk2Var.l();
            zy3 e02 = e0(sk2Var, wy3.a);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a2);
            oo2.S(sk2Var, dnVar2, l3);
            b31.x(hashCode2, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e02);
            ir6.b(me2.X(sk2Var, R.string.retro_achievements_login_description), null, 0L, 0L, null, null, 0L, new kn6(3), 0L, 0, false, 0, 0, null, null, sk2Var, 0, 0, 130558);
            sk2Var = sk2Var;
            boolean f2 = sk2Var.f(k24Var);
            Object L2 = sk2Var.L();
            if (f2 || L2 == sn1Var) {
                L2 = new wg5(k24Var, 8);
                sk2Var.h0(L2);
            }
            l.c((ki2) L2, null, false, null, null, pu.v(sk2Var), null, d, sk2Var, 805306368, 382);
            sk2Var.p(true);
            sk2Var.p(true);
            if (((Boolean) k24Var.getValue()).booleanValue()) {
                sk2Var.X(186996890);
                String str = mp5Var.a;
                boolean f3 = sk2Var.f(k24Var);
                Object L3 = sk2Var.L();
                if (f3 || L3 == sn1Var) {
                    L3 = new wg5(k24Var, 9);
                    sk2Var.h0(L3);
                }
                ki2 ki2Var = (ki2) L3;
                if ((i3 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean f4 = sk2Var.f(k24Var) | z2;
                Object L4 = sk2Var.L();
                if (f4 || L4 == sn1Var) {
                    L4 = new hp5(aj2Var, k24Var, 1);
                    sk2Var.h0(L4);
                }
                yf2.c(str, ki2Var, (aj2) L4, sk2Var, 0);
                sk2Var.p(false);
            } else {
                sk2Var.X(187290956);
                sk2Var.p(false);
            }
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new fl(zy3Var, mp5Var, aj2Var, i2, 17);
        }
    }

    public static ArrayList f0(Object... objArr) {
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new st(objArr, true));
    }

    public static final void g(zy3 zy3Var, aj2 aj2Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1547843077);
        if ((i2 & 6) == 0) {
            if (sk2Var.f(zy3Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i2 | i5;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sk2Var.h(aj2Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        int i6 = i3;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i6 & 1, z)) {
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                L = me2.G(Boolean.FALSE);
                sk2Var.h0(L);
            }
            k24 k24Var = (k24) L;
            zy3 X = b53.X(zy3Var, 32.0f);
            tv3 d2 = d50.d(y60.Z, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = e0(sk2Var, X);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var, dnVar, d2);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var, dnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var, dnVar4, e0);
            lr0 a2 = jr0.a(new ot(16.0f, true, new i(1)), y60.k0, sk2Var, 54);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l3 = sk2Var.l();
            zy3 e02 = e0(sk2Var, wy3.a);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a2);
            oo2.S(sk2Var, dnVar2, l3);
            b31.x(hashCode2, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e02);
            ir6.b(me2.X(sk2Var, R.string.retro_achievements_login_error), null, 0L, 0L, null, null, 0L, new kn6(3), 0L, 0, false, 0, 0, null, null, sk2Var, 0, 0, 130558);
            sk2Var = sk2Var;
            Object L2 = sk2Var.L();
            if (L2 == sn1Var) {
                L2 = new wg5(k24Var, 5);
                sk2Var.h0(L2);
            }
            l.c((ki2) L2, null, false, null, null, pu.v(sk2Var), null, e, sk2Var, 805306374, 382);
            sk2Var.p(true);
            sk2Var.p(true);
            if (((Boolean) k24Var.getValue()).booleanValue()) {
                sk2Var.X(1025111837);
                Object L3 = sk2Var.L();
                if (L3 == sn1Var) {
                    L3 = new wg5(k24Var, 6);
                    sk2Var.h0(L3);
                }
                ki2 ki2Var = (ki2) L3;
                if ((i6 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object L4 = sk2Var.L();
                if (!z2 && L4 != sn1Var) {
                    z3 = false;
                } else {
                    z3 = false;
                    L4 = new hp5(aj2Var, k24Var, 0);
                    sk2Var.h0(L4);
                }
                yf2.c(null, ki2Var, (aj2) L4, sk2Var, 54);
                sk2Var.p(z3);
            } else {
                sk2Var.X(1025388605);
                sk2Var.p(false);
            }
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new vo(i2, 10, zy3Var, aj2Var);
        }
    }

    public static final void g0(hm3 hm3Var, oq6 oq6Var, pb4 pb4Var) {
        mi2 mi2Var;
        ga6 z = io2.z();
        if (z != null) {
            mi2Var = z.e();
        } else {
            mi2Var = null;
        }
        mi2 mi2Var2 = mi2Var;
        ga6 Y = io2.Y(z);
        try {
            mr6 d2 = hm3Var.d();
            if (d2 == null) {
                return;
            }
            er6 er6Var = hm3Var.e;
            if (er6Var == null) {
                return;
            }
            rd3 c2 = hm3Var.c();
            if (c2 == null) {
                return;
            }
            gk2.a0(oq6Var, hm3Var.a, d2.a, c2, er6Var, hm3Var.b(), pb4Var);
        } finally {
            io2.l0(z, Y, mi2Var2);
        }
    }

    public static final void h(zy3 zy3Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1227064775);
        if ((i2 & 6) == 0) {
            if (sk2Var.f(zy3Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            zy3 X = b53.X(zy3Var, 32.0f);
            tv3 d2 = d50.d(y60.Z, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = e0(sk2Var, X);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, d2);
            oo2.S(sk2Var, mu0.e, l2);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            ir6.b(me2.X(sk2Var, R.string.retro_achievements_no_achievements), ct3.f0(wy3.a, false, null, 3), 0L, 0L, null, null, 0L, new kn6(3), 0L, 0, false, 0, 0, null, null, sk2Var, 48, 0, 130556);
            sk2Var = sk2Var;
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new g5(zy3Var, i2, 6, (byte) 0);
        }
    }

    public static final zy3 h0(zy3 zy3Var, mi2 mi2Var) {
        return zy3Var.f(new uz0(mi2Var));
    }

    public static final void i(zy3 zy3Var, r94 r94Var, ki2 ki2Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        zy3Var.getClass();
        r94Var.getClass();
        ki2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(581343799);
        if ((i2 & 6) == 0) {
            if (sk2Var.f(zy3Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sk2Var.f(r94Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.h(ki2Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            wi5.b(me2.X(sk2Var, R.string.offline_ra_settings_title), zy3Var, ct3.H0(996870833, new l4(11, r94Var, ki2Var), sk2Var), sk2Var, ((i3 << 3) & 112) | RendererDebugBridge.CAPTURE_HEIGHT, 0);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new fl(zy3Var, r94Var, ki2Var, i2, 18);
        }
    }

    public static final void j(final zy3 zy3Var, final ih4 ih4Var, pp5 pp5Var, final r94 r94Var, final aj2 aj2Var, final ki2 ki2Var, final mi2 mi2Var, final ki2 ki2Var2, mi2 mi2Var2, aj2 aj2Var2, final mi2 mi2Var3, tu0 tu0Var, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        final mi2 mi2Var4;
        final aj2 aj2Var3;
        mi2 mi2Var5;
        aj2 aj2Var4;
        int i8;
        boolean z2;
        final pp5 pp5Var2 = pp5Var;
        zy3Var.getClass();
        ih4Var.getClass();
        pp5Var2.getClass();
        r94Var.getClass();
        aj2Var.getClass();
        ki2Var.getClass();
        mi2Var.getClass();
        ki2Var2.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1885867712);
        int i9 = 4;
        if (sk2Var.f(zy3Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i10 = i2 | i3;
        if (sk2Var.f(ih4Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i10 | i4;
        if (sk2Var.f(pp5Var2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i12 = i11 | i5;
        if (sk2Var.h(aj2Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (sk2Var.h(ki2Var)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i14 = i13 | i7 | 369098752;
        mi2 mi2Var6 = mi2Var3;
        if (!sk2Var.h(mi2Var6)) {
            i9 = 2;
        }
        if ((302063763 & i14) == 302063762 && (i9 & 3) == 2) {
            z = false;
        } else {
            z = true;
        }
        if (sk2Var.O(i14 & 1, z)) {
            sk2Var.T();
            int i15 = i2 & 1;
            Object obj = su0.a;
            if (i15 != 0 && !sk2Var.y()) {
                sk2Var.R();
                i8 = i14 & (-1879048193);
                mi2Var5 = mi2Var2;
                aj2Var4 = aj2Var2;
            } else {
                Object L = sk2Var.L();
                if (L == obj) {
                    L = new nh5(8);
                    sk2Var.h0(L);
                }
                mi2Var5 = (mi2) L;
                Object L2 = sk2Var.L();
                if (L2 == obj) {
                    L2 = new jg(2, 7, null);
                    sk2Var.h0(L2);
                }
                aj2Var4 = (aj2) L2;
                i8 = i14 & (-1879048193);
            }
            sk2Var.q();
            zy3 W = b53.W(zy3Var, ih4Var);
            lr0 a2 = jr0.a(rt.c, y60.j0, sk2Var, 0);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = e0(sk2Var, W);
            nu0.i.getClass();
            int i16 = i8;
            ki2 ki2Var3 = mu0.b;
            sk2Var.b0();
            int i17 = i9;
            if (sk2Var.S) {
                sk2Var.k(ki2Var3);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, a2);
            oo2.S(sk2Var, mu0.e, l2);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            if (pp5Var2 instanceof mp5) {
                sk2Var.X(-735501898);
                f(o76.c(mr0.a(), 1.0f), (mp5) pp5Var2, aj2Var, sk2Var, ((i16 >> 3) & 112) | ((i16 >> 6) & 896));
                sk2Var.p(false);
            } else if (pp5Var2 instanceof lp5) {
                sk2Var.X(-735494763);
                e(o76.c(mr0.a(), 1.0f), sk2Var, 0);
                sk2Var.p(false);
            } else if (pp5Var2 instanceof op5) {
                sk2Var.X(-1325360090);
                List<c6> list = ((op5) pp5Var2).a;
                if (list == null || !list.isEmpty()) {
                    for (c6 c6Var : list) {
                        if (!c6Var.f.isEmpty()) {
                            sk2Var.X(-1325203881);
                            zy3 c2 = o76.c(mr0.a(), 1.0f);
                            tv3 d2 = d50.d(y60.L, false);
                            int hashCode2 = Long.hashCode(sk2Var.T);
                            sm4 l3 = sk2Var.l();
                            zy3 e02 = e0(sk2Var, c2);
                            nu0.i.getClass();
                            ki2 ki2Var4 = mu0.b;
                            sk2Var.b0();
                            if (sk2Var.S) {
                                sk2Var.k(ki2Var4);
                            } else {
                                sk2Var.k0();
                            }
                            oo2.S(sk2Var, mu0.f, d2);
                            oo2.S(sk2Var, mu0.e, l3);
                            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode2));
                            oo2.P(sk2Var, mu0.h);
                            oo2.S(sk2Var, mu0.d, e02);
                            Object L3 = sk2Var.L();
                            if (L3 == obj) {
                                L3 = me2.G(null);
                                sk2Var.h0(L3);
                            }
                            k24 k24Var = (k24) L3;
                            s72 s72Var = o76.c;
                            Object L4 = sk2Var.L();
                            if (L4 == obj) {
                                L4 = new e4(k24Var, 5);
                                sk2Var.h0(L4);
                            }
                            aj2 aj2Var5 = (aj2) L4;
                            Object L5 = sk2Var.L();
                            if (L5 == obj) {
                                L5 = new d5(17);
                                sk2Var.h0(L5);
                            }
                            aj2 aj2Var6 = aj2Var4;
                            mi2 mi2Var7 = mi2Var5;
                            n40.a(s72Var, pp5Var2, aj2Var5, mi2Var7, aj2Var6, ki2Var, (ki2) L5, mi2Var6, sk2Var, ((i16 >> 3) & 112) | 1576326 | (i16 & 458752) | ((i17 << 21) & 29360128));
                            aj2Var4 = aj2Var6;
                            mi2Var5 = mi2Var7;
                            pp5Var2 = pp5Var2;
                            ti4 ti4Var = (ti4) k24Var.getValue();
                            if (ti4Var == null) {
                                sk2Var.X(-575598600);
                                z2 = false;
                                sk2Var.p(false);
                            } else {
                                sk2Var.X(-575598599);
                                n6 n6Var = (n6) ti4Var.A;
                                boolean booleanValue = ((Boolean) ti4Var.B).booleanValue();
                                Object L6 = sk2Var.L();
                                if (L6 == obj) {
                                    L6 = new wg5(k24Var, 7);
                                    sk2Var.h0(L6);
                                }
                                jv3.b(n6Var, booleanValue, (ki2) L6, sk2Var, RendererDebugBridge.CAPTURE_HEIGHT);
                                z2 = false;
                                sk2Var.p(false);
                            }
                            sk2Var.p(true);
                            sk2Var.p(z2);
                            sk2Var.p(z2);
                        } else {
                            mi2Var6 = mi2Var3;
                        }
                    }
                }
                z2 = false;
                sk2Var.X(-1325338018);
                h(o76.c(mr0.a(), 1.0f), sk2Var, 0);
                sk2Var.p(false);
                sk2Var.p(z2);
            } else if (pp5Var2 instanceof np5) {
                sk2Var.X(-735441098);
                g(o76.c(mr0.a(), 1.0f), aj2Var, sk2Var, (i16 >> 9) & 112);
                sk2Var.p(false);
            } else if (pp5Var2 instanceof kp5) {
                sk2Var.X(-735436487);
                d(o76.c(mr0.a(), 1.0f), ki2Var, sk2Var, (i16 >> 12) & 112);
                sk2Var.p(false);
            } else {
                throw ej6.d(sk2Var, -735502724, false);
            }
            sk2Var.p(true);
            aj2Var3 = aj2Var4;
            mi2Var4 = mi2Var5;
        } else {
            sk2Var.R();
            mi2Var4 = mi2Var2;
            aj2Var3 = aj2Var2;
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2(ih4Var, pp5Var2, r94Var, aj2Var, ki2Var, mi2Var, ki2Var2, mi2Var4, aj2Var3, mi2Var3, i2) { // from class: ip5
                public final /* synthetic */ ih4 B;
                public final /* synthetic */ pp5 L;
                public final /* synthetic */ r94 R;
                public final /* synthetic */ aj2 X;
                public final /* synthetic */ ki2 Y;
                public final /* synthetic */ mi2 Z;
                public final /* synthetic */ ki2 c0;
                public final /* synthetic */ mi2 d0;
                public final /* synthetic */ aj2 e0;
                public final /* synthetic */ mi2 f0;

                @Override // defpackage.aj2
                public final Object j(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ep2.I(1);
                    l07.j(zy3.this, this.B, this.L, this.R, this.X, this.Y, this.Z, this.c0, this.d0, this.e0, this.f0, (tu0) obj2, I);
                    return o27.a;
                }
            };
        }
    }

    public static final void k(bq6 bq6Var, boolean z, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        boolean z2;
        mr6 d2;
        boolean z3;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(626339208);
        if (sk2Var.h(bq6Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (sk2Var.g(z)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i6 & 1, z2)) {
            if (z) {
                sk2Var.X(1530097388);
                hm3 hm3Var = bq6Var.d;
                lr6 lr6Var = null;
                if (hm3Var != null && (d2 = hm3Var.d()) != null) {
                    lr6 lr6Var2 = d2.a;
                    hm3 hm3Var2 = bq6Var.d;
                    if (hm3Var2 != null) {
                        z3 = hm3Var2.p;
                    } else {
                        z3 = true;
                    }
                    if (!z3) {
                        lr6Var = lr6Var2;
                    }
                }
                if (lr6Var == null) {
                    sk2Var.X(1530097387);
                    sk2Var.p(false);
                } else {
                    sk2Var.X(1530097388);
                    if (!vr6.c(bq6Var.n().b)) {
                        sk2Var.X(2109807302);
                        int r = bq6Var.b.r((int) (bq6Var.n().b >> 32));
                        int r2 = bq6Var.b.r((int) (bq6Var.n().b & 4294967295L));
                        rb5 a2 = lr6Var.a(r);
                        rb5 a3 = lr6Var.a(Math.max(r2 - 1, 0));
                        hm3 hm3Var3 = bq6Var.d;
                        if (hm3Var3 != null && ((Boolean) hm3Var3.m.getValue()).booleanValue()) {
                            sk2Var.X(2110225306);
                            ln2.o(true, a2, bq6Var, sk2Var, ((i6 << 6) & 896) | 6);
                            sk2Var.p(false);
                        } else {
                            sk2Var.X(2110490542);
                            sk2Var.p(false);
                        }
                        hm3 hm3Var4 = bq6Var.d;
                        if (hm3Var4 != null && ((Boolean) hm3Var4.n.getValue()).booleanValue()) {
                            sk2Var.X(2110574459);
                            ln2.o(false, a3, bq6Var, sk2Var, ((i6 << 6) & 896) | 6);
                            sk2Var.p(false);
                        } else {
                            sk2Var.X(2110838734);
                            sk2Var.p(false);
                        }
                        sk2Var.p(false);
                    } else {
                        sk2Var.X(2110860558);
                        sk2Var.p(false);
                    }
                    hm3 hm3Var5 = bq6Var.d;
                    if (hm3Var5 != null) {
                        tj4 tj4Var = hm3Var5.l;
                        if (!b53.x(bq6Var.u.a.B, bq6Var.n().a.B)) {
                            tj4Var.setValue(Boolean.FALSE);
                        }
                        if (hm3Var5.b()) {
                            if (((Boolean) tj4Var.getValue()).booleanValue()) {
                                bq6Var.r();
                            } else {
                                bq6Var.o();
                            }
                        }
                    }
                    sk2Var.p(false);
                }
                sk2Var.p(false);
            } else {
                sk2Var.X(1989076778);
                sk2Var.p(false);
                bq6Var.o();
            }
        } else {
            sk2Var.R();
        }
        m55 r3 = sk2Var.r();
        if (r3 != null) {
            r3.d = new n21(bq6Var, z, i2);
        }
    }

    public static final List k0(List list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return list;
            }
            return b0(list.get(0));
        }
        return pp1.A;
    }

    public static final void l(String str, boolean z, tu0 tu0Var, int i2, int i3) {
        int i4;
        boolean z2;
        int i5;
        int i6;
        boolean z3;
        sk2 sk2Var;
        boolean z4;
        long b2;
        pe2 pe2Var;
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(-1618970396);
        if (sk2Var2.f(str)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i7 = i2 | i4;
        int i8 = i3 & 2;
        if (i8 != 0) {
            i6 = i7 | 48;
            z2 = z;
        } else {
            z2 = z;
            if (sk2Var2.g(z2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i6 = i7 | i5;
        }
        if ((i6 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (sk2Var2.O(i6 & 1, z3)) {
            if (i8 != 0) {
                z4 = false;
            } else {
                z4 = z2;
            }
            zy3 Y = b53.Y(o76.c(wy3.a, 1.0f), 16.0f, 4.0f);
            ds6 ds6Var = ((c17) sk2Var2.j(d17.b)).j;
            if (z4) {
                sk2Var2.X(-1052380467);
                b2 = ((hr0) sk2Var2.j(ir0.a)).i();
            } else {
                sk2Var2.X(-1052378985);
                b2 = xq0.b(0.85f, ((hr0) sk2Var2.j(ir0.a)).f());
            }
            sk2Var2.p(false);
            if (z4) {
                pe2Var = pe2.c0;
            } else {
                pe2Var = pe2.Y;
            }
            sk2Var = sk2Var2;
            ir6.b(str, Y, b2, 0L, pe2Var, null, 0L, null, 0L, 0, false, 0, 0, null, ds6Var, sk2Var, (i6 & 14) | 48, 0, 65496);
            z2 = z4;
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new qy(i2, i3, str, z2);
        }
    }

    public static final void m(bq6 bq6Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        to m2;
        mr6 mr6Var;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1436003720);
        if (sk2Var.h(bq6Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i4 & 1, z)) {
            hm3 hm3Var = bq6Var.d;
            if (hm3Var != null && ((Boolean) hm3Var.o.getValue()).booleanValue() && (m2 = bq6Var.m()) != null && m2.B.length() > 0) {
                sk2Var.X(-2112351432);
                boolean f2 = sk2Var.f(bq6Var);
                Object L = sk2Var.L();
                sn1 sn1Var = su0.a;
                if (f2 || L == sn1Var) {
                    L = new xp6(bq6Var);
                    sk2Var.h0(L);
                }
                vo6 vo6Var = (vo6) L;
                od1 od1Var = (od1) sk2Var.j(ov0.h);
                pb4 pb4Var = bq6Var.b;
                long j2 = bq6Var.n().b;
                int i5 = vr6.c;
                int r = pb4Var.r((int) (j2 >> 32));
                hm3 hm3Var2 = bq6Var.d;
                if (hm3Var2 != null) {
                    mr6Var = hm3Var2.d();
                } else {
                    mr6Var = null;
                }
                mr6Var.getClass();
                lr6 lr6Var = mr6Var.a;
                y55 c2 = lr6Var.c(io2.m(r, 0, lr6Var.a.a.B.length()));
                long floatToRawIntBits = (Float.floatToRawIntBits((od1Var.C(2.0f) / 2.0f) + c2.a) << 32) | (4294967295L & Float.floatToRawIntBits(c2.d));
                boolean e2 = sk2Var.e(floatToRawIntBits);
                Object L2 = sk2Var.L();
                if (e2 || L2 == sn1Var) {
                    L2 = new q21(floatToRawIntBits);
                    sk2Var.h0(L2);
                }
                rb4 rb4Var = (rb4) L2;
                boolean h2 = sk2Var.h(vo6Var) | sk2Var.h(bq6Var);
                Object L3 = sk2Var.L();
                if (h2 || L3 == sn1Var) {
                    L3 = new t21(vo6Var, bq6Var);
                    sk2Var.h0(L3);
                }
                zy3 a2 = pk6.a(wy3.a, vo6Var, (PointerInputEventHandler) L3);
                boolean e3 = sk2Var.e(floatToRawIntBits);
                Object L4 = sk2Var.L();
                if (e3 || L4 == sn1Var) {
                    L4 = new u4(6, floatToRawIntBits);
                    sk2Var.h0(L4);
                }
                ff.a(rb4Var, fz5.a(a2, false, (mi2) L4), 0L, sk2Var, 0);
                sk2Var.p(false);
            } else {
                sk2Var.X(-2111042550);
                sk2Var.p(false);
            }
        } else {
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new z5(i2, 6, bq6Var);
        }
    }

    public static ArrayList n(Object... objArr) {
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new st(objArr, true));
    }

    public static final void n0(int i2, int i3) {
        if (i3 >= 0) {
            if (i3 <= i2) {
                return;
            }
            vd6.c(i3, i2, ") is greater than size (", "toIndex (");
            return;
        }
        i.i(wh1.j("fromIndex (0) is greater than toIndex (", i3, ")."));
    }

    public static Map o(Object obj) {
        if ((obj instanceof f93) && !(obj instanceof i93)) {
            t0(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            b53.e0(e2, l07.class.getName());
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x013f, code lost:
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0141, code lost:
        r13.put(r1, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0144, code lost:
        return r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013f A[EDGE_INSN: B:85:0x013f->B:80:0x013f ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.reflect.Type, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v3, types: [uo2] */
    /* JADX WARN: Type inference failed for: r12v4, types: [uo2] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type o0(java.lang.reflect.Type r10, java.lang.Class r11, java.lang.reflect.Type r12, java.util.HashMap r13) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l07.o0(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.HashMap):java.lang.reflect.Type");
    }

    public static zy3 p(zy3 zy3Var, float f2) {
        return zy3Var.f(new qu(f2));
    }

    public static final void p0(Matrix matrix, float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[12];
        float f12 = fArr[13];
        float f13 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f6;
        fArr[2] = f11;
        fArr[3] = f3;
        fArr[4] = f7;
        fArr[5] = f12;
        fArr[6] = f5;
        fArr[7] = f9;
        fArr[8] = f13;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
        fArr[8] = f10;
    }

    public static void q(int i2, Object obj) {
        if (obj != null && !Z(i2, obj)) {
            t0(obj, "kotlin.jvm.functions.Function" + i2);
            throw null;
        }
    }

    public static final void q0(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        fArr[3] = f8;
        fArr[4] = f3;
        fArr[5] = f6;
        fArr[6] = 0.0f;
        fArr[7] = f9;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f4;
        fArr[13] = f7;
        fArr[14] = 0.0f;
        fArr[15] = f10;
    }

    public static int r(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        n0(arrayList.size(), size);
        int i2 = size - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = iq2.i((Comparable) arrayList.get(i4), comparable);
            if (i5 < 0) {
                i3 = i4 + 1;
            } else if (i5 > 0) {
                i2 = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i3 + 1);
    }

    public static void r0(ey0 ey0Var, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + ey0Var.b;
        try {
            int i2 = z41.a[ey0Var.c.ordinal()];
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            boolean z = true;
            switch (i2) {
                case 1:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int z2 = z((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f));
                    int z3 = z((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor((z2 << 16) | (z((int) (fArr[3] * 255.0f)) << 24) | (z3 << 8) | z((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)));
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((z((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (z((int) (fArr[3] * 255.0f)) << 24) | (z((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | z((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + ey0Var.b);
                case ig7.b /* 6 */:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    if (fArr[0] <= 0.5f) {
                        z = false;
                    }
                    method2.invoke(view, Boolean.valueOf(z));
                    return;
                case 7:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e2) {
            StringBuilder u = b31.u("Cannot access method ", str, " on View \"");
            u.append(b53.N(view));
            u.append("\"");
            Log.e("CustomSupport", u.toString(), e2);
        } catch (NoSuchMethodException e3) {
            StringBuilder u2 = b31.u("No method ", str, " on View \"");
            u2.append(b53.N(view));
            u2.append("\"");
            Log.e("CustomSupport", u2.toString(), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder u3 = b31.u("Cannot invoke method ", str, " on View \"");
            u3.append(b53.N(view));
            u3.append("\"");
            Log.e("CustomSupport", u3.toString(), e4);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, n75] */
    public static final void s0(zq6 zq6Var, hm3 hm3Var, oq6 oq6Var, hx2 hx2Var, pb4 pb4Var) {
        k91 k91Var = hm3Var.d;
        o21 o21Var = hm3Var.v;
        o21 o21Var2 = hm3Var.w;
        ?? obj = new Object();
        cz czVar = new cz(k91Var, o21Var, (Object) obj, 26);
        cp4 cp4Var = zq6Var.a;
        cp4Var.b(oq6Var, hx2Var, czVar, o21Var2);
        er6 er6Var = new er6(zq6Var, cp4Var);
        zq6Var.b.set(er6Var);
        obj.A = er6Var;
        hm3Var.e = er6Var;
        g0(hm3Var, oq6Var, pb4Var);
    }

    public static ip3 t(List list) {
        list.getClass();
        ip3 ip3Var = (ip3) list;
        ip3Var.k();
        ip3Var.L = true;
        if (ip3Var.B > 0) {
            return ip3Var;
        }
        return ip3.R;
    }

    public static void t0(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(wh1.l(name, " cannot be cast to ", str));
        b53.e0(classCastException, l07.class.getName());
        throw classCastException;
    }

    public static Type u(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                return new so2(0, u(cls.getComponentType()));
            }
            return cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new to2(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new so2(0, ((GenericArrayType) type).getGenericComponentType());
        } else {
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                return new uo2(wildcardType.getUpperBounds(), wildcardType.getLowerBounds(), 0);
            }
            return type;
        }
    }

    public static void u0() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void v0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static String w0(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    public static final zy3 x0(zy3 zy3Var, re7 re7Var) {
        return zy3Var.f(new e23(re7Var));
    }

    public static void y(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            i.i("Primitive type is not allowed");
        }
    }

    public static int z(int i2) {
        int i3 = (i2 & (~(i2 >> 31))) - 255;
        return (i3 & (i3 >> 31)) + 255;
    }

    public abstract String D();

    public void U(ls5 ls5Var, Iterable iterable) {
        ls5Var.getClass();
        if (iterable == null) {
            return;
        }
        ns5 i0 = ls5Var.i0(D());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    s(i0, obj);
                    i0.a0();
                    i0.reset();
                }
            }
            iq2.h(i0, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                iq2.h(i0, th);
                throw th2;
            }
        }
    }

    public void V(ls5 ls5Var, Object obj) {
        ls5Var.getClass();
        if (obj == null) {
            return;
        }
        ns5 i0 = ls5Var.i0(D());
        try {
            s(i0, obj);
            i0.a0();
            iq2.h(i0, null);
        } finally {
        }
    }

    public long W(ls5 ls5Var, Object obj) {
        ls5Var.getClass();
        if (obj == null) {
            return -1L;
        }
        ns5 i0 = ls5Var.i0(D());
        try {
            s(i0, obj);
            i0.a0();
            iq2.h(i0, null);
            return cg2.B(ls5Var);
        } finally {
        }
    }

    public List X(ls5 ls5Var, ArrayList arrayList) {
        ls5Var.getClass();
        ip3 C = C();
        ns5 i0 = ls5Var.i0(D());
        try {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (obj != null) {
                    s(i0, obj);
                    i0.a0();
                    i0.reset();
                    C.add(Long.valueOf(cg2.B(ls5Var)));
                } else {
                    C.add(-1L);
                }
            }
            iq2.h(i0, null);
            return t(C);
        } finally {
        }
    }

    public abstract void i0(Throwable th);

    public abstract void j0(q9 q9Var);

    public abstract void l0(p1 p1Var, p1 p1Var2);

    public abstract void m0(p1 p1Var, Thread thread);

    public abstract void s(ns5 ns5Var, Object obj);

    public abstract boolean v(q1 q1Var, m1 m1Var, m1 m1Var2);

    public abstract boolean w(q1 q1Var, Object obj, Object obj2);

    public abstract boolean x(q1 q1Var, p1 p1Var, p1 p1Var2);
}
