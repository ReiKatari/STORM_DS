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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q07  reason: default package */
/* loaded from: classes.dex */
public final class q07 extends hk2 {
    public static final Class e;
    public static final Constructor f;
    public static final Method g;
    public static final Method h;

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
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        f = constructor;
        e = cls;
        g = method2;
        h = method;
    }

    public static boolean W(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) g.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface X(Object obj) {
        try {
            Object newInstance = Array.newInstance(e, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) h.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.hk2
    public final Typeface k(Context context, ee2 ee2Var, Resources resources, int i) {
        Object obj;
        fe2[] fe2VarArr;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (fe2 fe2Var : ee2Var.a) {
                int i2 = fe2Var.f;
                File D = jk2.D(context);
                if (D != null) {
                    try {
                        if (jk2.p(D, resources, i2)) {
                            try {
                                fileInputStream = new FileInputStream(D);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                if (mappedByteBuffer != null && W(obj, mappedByteBuffer, fe2Var.e, fe2Var.b, fe2Var.c)) {
                                }
                            } finally {
                                break;
                            }
                        }
                    } finally {
                        D.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return X(obj);
        }
        return null;
    }

    @Override // defpackage.hk2
    public final Typeface l(Context context, se2[] se2VarArr, int i) {
        Object obj;
        try {
            obj = f.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i2 = 0;
            m66 m66Var = new m66(0);
            int length = se2VarArr.length;
            while (true) {
                if (i2 < length) {
                    se2 se2Var = se2VarArr[i2];
                    Uri uri = se2Var.a;
                    ByteBuffer byteBuffer = (ByteBuffer) m66Var.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = jk2.J(context, uri);
                        m66Var.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !W(obj, byteBuffer, se2Var.b, se2Var.c, se2Var.d)) {
                        break;
                    }
                    i2++;
                } else {
                    Typeface X = X(obj);
                    if (X != null) {
                        return Typeface.create(X, i);
                    }
                }
            }
        }
        return null;
    }
}
