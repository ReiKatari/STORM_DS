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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s07  reason: default package */
/* loaded from: classes.dex */
public class s07 extends p07 {
    public final Class j;
    public final Constructor k;
    public final Method l;
    public final Method m;
    public final Method n;
    public final Method o;
    public final Method p;

    public s07() {
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
            method2 = b0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = c0(cls2);
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
        this.j = cls;
        this.k = constructor;
        this.l = method2;
        this.m = method3;
        this.n = method4;
        this.o = method5;
        this.p = method;
    }

    public static Method b0(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean Y(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.l.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface Z(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.j, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.p.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean a0(Object obj) {
        try {
            return ((Boolean) this.n.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method c0(Class cls) {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // defpackage.p07, defpackage.hk2
    public final Typeface k(Context context, ee2 ee2Var, Resources resources, int i) {
        Object obj;
        Method method = this.l;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                obj = this.k.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                fe2[] fe2VarArr = ee2Var.a;
                int length = fe2VarArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        fe2 fe2Var = fe2VarArr[i2];
                        String str = fe2Var.a;
                        int i3 = fe2Var.e;
                        int i4 = fe2Var.b;
                        boolean z = fe2Var.c;
                        FontVariationAxis[] fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(fe2Var.d);
                        s07 s07Var = this;
                        Context context2 = context;
                        if (!s07Var.Y(context2, obj, str, i3, i4, z ? 1 : 0, fromFontVariationSettings)) {
                            try {
                                s07Var.o.invoke(obj, null);
                                break;
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        } else {
                            i2++;
                            this = s07Var;
                            context = context2;
                        }
                    } else {
                        s07 s07Var2 = this;
                        if (s07Var2.a0(obj)) {
                            return s07Var2.Z(obj);
                        }
                    }
                }
            }
            return null;
        }
        return super.k(context, ee2Var, resources, i);
    }

    @Override // defpackage.p07, defpackage.hk2
    public final Typeface l(Context context, se2[] se2VarArr, int i) {
        Object obj;
        Typeface Z;
        boolean z;
        if (se2VarArr.length >= 1) {
            Method method = this.l;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (se2 se2Var : se2VarArr) {
                        if (se2Var.f == 0) {
                            Uri uri = se2Var.a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, jk2.J(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.k.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = se2VarArr.length;
                        int i2 = 0;
                        boolean z2 = false;
                        while (true) {
                            Method method2 = this.o;
                            if (i2 < length) {
                                se2 se2Var2 = se2VarArr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(se2Var2.a);
                                if (byteBuffer != null) {
                                    try {
                                        z = ((Boolean) this.m.invoke(obj, byteBuffer, Integer.valueOf(se2Var2.b), null, Integer.valueOf(se2Var2.c), Integer.valueOf(se2Var2.d ? 1 : 0))).booleanValue();
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
                            } else if (a0(obj) && (Z = Z(obj)) != null) {
                                return Typeface.create(Z, i);
                            }
                        }
                    }
                } else {
                    se2 t = hk2.t(se2VarArr, i);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(t.a, "r", null);
                    if (openFileDescriptor == null) {
                        if (openFileDescriptor != null) {
                            openFileDescriptor.close();
                            return null;
                        }
                    } else {
                        Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(t.c).setItalic(t.d).build();
                        openFileDescriptor.close();
                        return build;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // defpackage.hk2
    public final Typeface n(Context context, Resources resources, int i, String str, int i2) {
        Object obj;
        Method method = this.l;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                obj = this.k.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                if (!Y(context, obj, str, 0, -1, -1, null)) {
                    try {
                        this.o.invoke(obj, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (a0(obj)) {
                    return Z(obj);
                }
            }
            return null;
        }
        return super.n(context, resources, i, str, i2);
    }
}
