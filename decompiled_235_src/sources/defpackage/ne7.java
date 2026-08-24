package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ne7  reason: default package */
/* loaded from: classes.dex */
public class ne7 extends ke7 {
    public final Class h0;
    public final Constructor i0;
    public final Method j0;
    public final Method k0;
    public final Method l0;
    public final Method m0;
    public final Method n0;

    public ne7() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = c0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = d0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.h0 = cls;
        this.i0 = constructor;
        this.j0 = method2;
        this.k0 = method3;
        this.l0 = method4;
        this.m0 = method5;
        this.n0 = method;
    }

    public static Method c0(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean Z(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.j0.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface a0(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.h0, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.n0.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean b0(Object obj) {
        try {
            return ((Boolean) this.l0.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method d0(Class cls) {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // defpackage.ke7, defpackage.bl2
    public final Typeface o(Context context, bj2 bj2Var, Resources resources, int i) {
        Object obj;
        Method method = this.j0;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                obj = this.i0.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                cj2[] cj2VarArr = bj2Var.a;
                int length = cj2VarArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        cj2 cj2Var = cj2VarArr[i2];
                        String str = cj2Var.a;
                        int i3 = cj2Var.e;
                        int i4 = cj2Var.b;
                        boolean z = cj2Var.c;
                        FontVariationAxis[] fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(cj2Var.d);
                        ne7 ne7Var = this;
                        Context context2 = context;
                        if (!ne7Var.Z(context2, obj, str, i3, i4, z ? 1 : 0, fromFontVariationSettings)) {
                            try {
                                ne7Var.m0.invoke(obj, null);
                                break;
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        } else {
                            i2++;
                            this = ne7Var;
                            context = context2;
                        }
                    } else {
                        ne7 ne7Var2 = this;
                        if (ne7Var2.b0(obj)) {
                            return ne7Var2.a0(obj);
                        }
                    }
                }
            }
            return null;
        }
        return super.o(context, bj2Var, resources, i);
    }

    @Override // defpackage.ke7, defpackage.bl2
    public final Typeface p(Context context, rj2[] rj2VarArr, int i) {
        Object obj;
        Typeface a0;
        boolean z;
        if (rj2VarArr.length >= 1) {
            Method method = this.j0;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (rj2 rj2Var : rj2VarArr) {
                        if (rj2Var.f == 0) {
                            Uri uri = rj2Var.a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, kn2.T(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.i0.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = rj2VarArr.length;
                        int i2 = 0;
                        boolean z2 = false;
                        while (true) {
                            Method method2 = this.m0;
                            if (i2 < length) {
                                rj2 rj2Var2 = rj2VarArr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(rj2Var2.a);
                                if (byteBuffer != null) {
                                    try {
                                        z = ((Boolean) this.k0.invoke(obj, byteBuffer, Integer.valueOf(rj2Var2.b), null, Integer.valueOf(rj2Var2.c), Integer.valueOf(rj2Var2.d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z = false;
                                    }
                                    if (!z) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z2 = true;
                                }
                                i2++;
                                z2 = z2;
                            } else if (!z2) {
                                method2.invoke(obj, null);
                            } else if (b0(obj) && (a0 = a0(obj)) != null) {
                                return Typeface.create(a0, i);
                            }
                        }
                    }
                } else {
                    rj2 x = bl2.x(rj2VarArr, i);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(x.a, "r", null);
                    if (openFileDescriptor == null) {
                        if (openFileDescriptor != null) {
                            openFileDescriptor.close();
                            return null;
                        }
                    } else {
                        Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(x.c).setItalic(x.d).build();
                        openFileDescriptor.close();
                        return build;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // defpackage.bl2
    public final Typeface r(Context context, Resources resources, int i, String str, int i2) {
        Object obj;
        Method method = this.j0;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                obj = this.i0.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                if (!Z(context, obj, str, 0, -1, -1, null)) {
                    try {
                        this.m0.invoke(obj, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (b0(obj)) {
                    return a0(obj);
                }
            }
            return null;
        }
        return super.r(context, resources, i, str, i2);
    }
}
