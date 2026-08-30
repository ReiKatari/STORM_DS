package q5;

import a1.w0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends p7.j {

    /* renamed from: b  reason: collision with root package name */
    public static final Class f12298b;

    /* renamed from: c  reason: collision with root package name */
    public static final Constructor f12299c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f12300d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f12301e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi24Impl", e6.getClass().getName(), e6);
            cls = null;
            method = null;
            method2 = null;
        }
        f12299c = constructor;
        f12298b = cls;
        f12300d = method2;
        f12301e = method;
    }

    public static boolean N(Object obj, ByteBuffer byteBuffer, int i2, int i10, boolean z10) {
        try {
            return ((Boolean) f12300d.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface O(Object obj) {
        try {
            Object newInstance = Array.newInstance(f12298b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f12301e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p7.j
    public final Typeface p(Context context, p5.e eVar, Resources resources, int i2) {
        Object obj;
        p5.f[] fVarArr;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f12299c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (p5.f fVar : eVar.f11336a) {
                int i10 = fVar.f11342f;
                File p10 = p7.k.p(context);
                if (p10 != null) {
                    try {
                        if (p7.k.g(p10, resources, i10)) {
                            try {
                                fileInputStream = new FileInputStream(p10);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                if (mappedByteBuffer != null && N(obj, mappedByteBuffer, fVar.f11341e, fVar.f11338b, fVar.f11339c)) {
                                }
                            } finally {
                                break;
                            }
                        }
                    } finally {
                        p10.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return O(obj);
        }
        return null;
    }

    @Override // p7.j
    public final Typeface q(Context context, v5.g[] gVarArr, int i2) {
        Object obj;
        try {
            obj = f12299c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i10 = 0;
            w0 w0Var = new w0(0);
            int length = gVarArr.length;
            while (true) {
                if (i10 < length) {
                    v5.g gVar = gVarArr[i10];
                    Uri uri = gVar.f13745a;
                    ByteBuffer byteBuffer = (ByteBuffer) w0Var.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = p7.k.u(context, uri);
                        w0Var.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !N(obj, byteBuffer, gVar.f13746b, gVar.f13747c, gVar.f13748d)) {
                        break;
                    }
                    i10++;
                } else {
                    Typeface O = O(obj);
                    if (O != null) {
                        return Typeface.create(O, i2);
                    }
                }
            }
        }
        return null;
    }
}
