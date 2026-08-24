package defpackage;

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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: le7  reason: default package */
/* loaded from: classes.dex */
public final class le7 extends bl2 {
    public static final Class Z;
    public static final Constructor d0;
    public static final Method e0;
    public static final Method f0;

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
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        d0 = constructor;
        Z = cls;
        e0 = method2;
        f0 = method;
    }

    public static boolean X(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) e0.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface Y(Object obj) {
        try {
            Object newInstance = Array.newInstance(Z, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f0.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.bl2
    public final Typeface o(Context context, bj2 bj2Var, Resources resources, int i) {
        Object obj;
        cj2[] cj2VarArr;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = d0.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (cj2 cj2Var : bj2Var.a) {
                int i2 = cj2Var.f;
                File M = kn2.M(context);
                if (M != null) {
                    try {
                        if (kn2.x(M, resources, i2)) {
                            try {
                                fileInputStream = new FileInputStream(M);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                if (mappedByteBuffer != null && X(obj, mappedByteBuffer, cj2Var.e, cj2Var.b, cj2Var.c)) {
                                }
                            } finally {
                                break;
                            }
                        }
                    } finally {
                        M.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return Y(obj);
        }
        return null;
    }

    @Override // defpackage.bl2
    public final Typeface p(Context context, rj2[] rj2VarArr, int i) {
        Object obj;
        try {
            obj = d0.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i2 = 0;
            ci6 ci6Var = new ci6(0);
            int length = rj2VarArr.length;
            while (true) {
                if (i2 < length) {
                    rj2 rj2Var = rj2VarArr[i2];
                    Uri uri = rj2Var.a;
                    ByteBuffer byteBuffer = (ByteBuffer) ci6Var.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = kn2.T(context, uri);
                        ci6Var.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !X(obj, byteBuffer, rj2Var.b, rj2Var.c, rj2Var.d)) {
                        break;
                    }
                    i2++;
                } else {
                    Typeface Y = Y(obj);
                    if (Y != null) {
                        return Typeface.create(Y, i);
                    }
                }
            }
        }
        return null;
    }
}
