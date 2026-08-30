package q5;

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
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class h extends f {

    /* renamed from: g  reason: collision with root package name */
    public final Class f12302g;

    /* renamed from: h  reason: collision with root package name */
    public final Constructor f12303h;

    /* renamed from: i  reason: collision with root package name */
    public final Method f12304i;

    /* renamed from: j  reason: collision with root package name */
    public final Method f12305j;

    /* renamed from: k  reason: collision with root package name */
    public final Method f12306k;

    /* renamed from: l  reason: collision with root package name */
    public final Method f12307l;
    public final Method m;

    public h() {
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
            method2 = S(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = T(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e6.getClass().getName()), e6);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f12302g = cls;
        this.f12303h = constructor;
        this.f12304i = method2;
        this.f12305j = method3;
        this.f12306k = method4;
        this.f12307l = method5;
        this.m = method;
    }

    public static Method S(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean P(Context context, Object obj, String str, int i2, int i10, int i11, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f12304i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i10), Integer.valueOf(i11), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface Q(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f12302g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean R(Object obj) {
        try {
            return ((Boolean) this.f12306k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method T(Class cls) {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // q5.f, p7.j
    public final Typeface p(Context context, p5.e eVar, Resources resources, int i2) {
        Object obj;
        Method method = this.f12304i;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                obj = this.f12303h.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                p5.f[] fVarArr = eVar.f11336a;
                int length = fVarArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        p5.f fVar = fVarArr[i10];
                        Context context2 = context;
                        if (!P(context2, obj, fVar.f11337a, fVar.f11341e, fVar.f11338b, fVar.f11339c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fVar.f11340d))) {
                            try {
                                this.f12307l.invoke(obj, null);
                                break;
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        } else {
                            i10++;
                            context = context2;
                        }
                    } else if (R(obj)) {
                        return Q(obj);
                    }
                }
            }
            return null;
        }
        return super.p(context, eVar, resources, i2);
    }

    @Override // q5.f, p7.j
    public final Typeface q(Context context, v5.g[] gVarArr, int i2) {
        Object obj;
        Typeface Q;
        boolean z10;
        if (gVarArr.length >= 1) {
            Method method = this.f12304i;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (v5.g gVar : gVarArr) {
                        if (gVar.f13750f == 0) {
                            Uri uri = gVar.f13745a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, p7.k.u(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.f12303h.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = gVarArr.length;
                        int i10 = 0;
                        boolean z11 = false;
                        while (true) {
                            Method method2 = this.f12307l;
                            if (i10 < length) {
                                v5.g gVar2 = gVarArr[i10];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(gVar2.f13745a);
                                if (byteBuffer != null) {
                                    try {
                                        z10 = ((Boolean) this.f12305j.invoke(obj, byteBuffer, Integer.valueOf(gVar2.f13746b), null, Integer.valueOf(gVar2.f13747c), Integer.valueOf(gVar2.f13748d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z10 = false;
                                    }
                                    if (!z10) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z11 = true;
                                }
                                i10++;
                                z11 = z11;
                            } else if (!z11) {
                                method2.invoke(obj, null);
                            } else if (R(obj) && (Q = Q(obj)) != null) {
                                return Typeface.create(Q, i2);
                            }
                        }
                    }
                } else {
                    v5.g u4 = p7.j.u(gVarArr, i2);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(u4.f13745a, "r", null);
                    if (openFileDescriptor == null) {
                        if (openFileDescriptor != null) {
                            openFileDescriptor.close();
                            return null;
                        }
                    } else {
                        Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(u4.f13747c).setItalic(u4.f13748d).build();
                        openFileDescriptor.close();
                        return build;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // p7.j
    public final Typeface s(Context context, Resources resources, int i2, String str, int i10) {
        Object obj;
        Method method = this.f12304i;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                obj = this.f12303h.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                if (!P(context, obj, str, 0, -1, -1, null)) {
                    try {
                        this.f12307l.invoke(obj, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (R(obj)) {
                    return Q(obj);
                }
            }
            return null;
        }
        return super.s(context, resources, i2, str, i10);
    }
}
