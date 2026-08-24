package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gh7  reason: default package */
/* loaded from: classes.dex */
public abstract class gh7 {
    public static final Logger a = Logger.getLogger(gh7.class.getName());
    public static final Unsafe b;
    public static final Class c;
    public static final fh7 d;
    public static final boolean e;
    public static final boolean f;
    public static final long g;
    public static final boolean h;

    /* JADX WARN: Removed duplicated region for block: B:38:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Class cls;
        Class<?> cls2;
        boolean z;
        Unsafe unsafe;
        boolean z2;
        Field d2;
        boolean z3;
        fh7 fh7Var;
        Unsafe i = i();
        b = i;
        c = hd.a;
        Class cls3 = Long.TYPE;
        boolean e2 = e(cls3);
        Class cls4 = Integer.TYPE;
        boolean e3 = e(cls4);
        fh7 fh7Var2 = null;
        if (i != null) {
            if (hd.a()) {
                if (e2) {
                    fh7Var2 = new dh7(i, 1);
                } else if (e3) {
                    fh7Var2 = new dh7(i, 0);
                }
            } else {
                fh7Var2 = new fh7(i);
            }
        }
        d = fh7Var2;
        Class cls5 = Byte.TYPE;
        if (i != null) {
            try {
                cls2 = i.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls3);
            } catch (Throwable th) {
                cls = Field.class;
                a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            }
            if (d() != null) {
                if (!hd.a()) {
                    cls2.getMethod("getByte", cls3);
                    cls2.getMethod("putByte", cls3, cls5);
                    cls2.getMethod("getInt", cls3);
                    cls2.getMethod("putInt", cls3, cls4);
                    cls2.getMethod("getLong", cls3);
                    cls2.getMethod("putLong", cls3, cls3);
                    cls2.getMethod("copyMemory", cls3, cls3, cls3);
                    cls2.getMethod("copyMemory", Object.class, cls3, Object.class, cls3, cls3);
                }
                cls = Field.class;
                z = true;
                e = z;
                unsafe = b;
                if (unsafe != null) {
                    try {
                        Class<?> cls6 = unsafe.getClass();
                        cls6.getMethod("objectFieldOffset", cls);
                        cls6.getMethod("arrayBaseOffset", Class.class);
                        cls6.getMethod("arrayIndexScale", Class.class);
                        cls6.getMethod("getInt", Object.class, cls3);
                        cls6.getMethod("putInt", Object.class, cls3, cls4);
                        cls6.getMethod("getLong", Object.class, cls3);
                        cls6.getMethod("putLong", Object.class, cls3, cls3);
                        cls6.getMethod("getObject", Object.class, cls3);
                        cls6.getMethod("putObject", Object.class, cls3, Object.class);
                        if (!hd.a()) {
                            cls6.getMethod("getByte", Object.class, cls3);
                            cls6.getMethod("putByte", Object.class, cls3, cls5);
                            cls6.getMethod("getBoolean", Object.class, cls3);
                            cls6.getMethod("putBoolean", Object.class, cls3, Boolean.TYPE);
                            cls6.getMethod("getFloat", Object.class, cls3);
                            cls6.getMethod("putFloat", Object.class, cls3, Float.TYPE);
                            cls6.getMethod("getDouble", Object.class, cls3);
                            cls6.getMethod("putDouble", Object.class, cls3, Double.TYPE);
                        }
                        z2 = true;
                    } catch (Throwable th2) {
                        a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
                    }
                    f = z2;
                    g = b(byte[].class);
                    b(boolean[].class);
                    c(boolean[].class);
                    b(int[].class);
                    c(int[].class);
                    b(long[].class);
                    c(long[].class);
                    b(float[].class);
                    c(float[].class);
                    b(double[].class);
                    c(double[].class);
                    b(Object[].class);
                    c(Object[].class);
                    d2 = d();
                    if (d2 != null && (fh7Var = d) != null) {
                        fh7Var.j(d2);
                    }
                    if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    h = z3;
                }
                z2 = false;
                f = z2;
                g = b(byte[].class);
                b(boolean[].class);
                c(boolean[].class);
                b(int[].class);
                c(int[].class);
                b(long[].class);
                c(long[].class);
                b(float[].class);
                c(float[].class);
                b(double[].class);
                c(double[].class);
                b(Object[].class);
                c(Object[].class);
                d2 = d();
                if (d2 != null) {
                    fh7Var.j(d2);
                }
                if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                }
                h = z3;
            }
        }
        cls = Field.class;
        z = false;
        e = z;
        unsafe = b;
        if (unsafe != null) {
        }
        z2 = false;
        f = z2;
        g = b(byte[].class);
        b(boolean[].class);
        c(boolean[].class);
        b(int[].class);
        c(int[].class);
        b(long[].class);
        c(long[].class);
        b(float[].class);
        c(float[].class);
        b(double[].class);
        c(double[].class);
        b(Object[].class);
        c(Object[].class);
        d2 = d();
        if (d2 != null) {
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
        }
        h = z3;
    }

    public static Object a(Class cls) {
        try {
            return b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int b(Class cls) {
        if (f) {
            return d.a(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (f) {
            d.b(cls);
        }
    }

    public static Field d() {
        Field field;
        Field field2;
        if (hd.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean e(Class cls) {
        if (!hd.a()) {
            return false;
        }
        try {
            Class cls2 = c;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte f(byte[] bArr, long j) {
        return d.d(g + j, bArr);
    }

    public static byte g(long j, Object obj) {
        return (byte) ((d.g((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte h(long j, Object obj) {
        return (byte) ((d.g((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction<Object>) new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j, byte b2) {
        d.l(bArr, g + j, b2);
    }

    public static void k(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int g2 = d.g(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m(obj, j2, ((255 & b2) << i) | (g2 & (~(255 << i))));
    }

    public static void l(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m(obj, j2, ((255 & b2) << i) | (d.g(j2, obj) & (~(255 << i))));
    }

    public static void m(Object obj, long j, int i) {
        d.o(obj, j, i);
    }

    public static void n(Object obj, long j, long j2) {
        d.p(obj, j, j2);
    }

    public static void o(Object obj, long j, Object obj2) {
        d.q(obj, j, obj2);
    }
}
