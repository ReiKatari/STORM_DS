package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbws {
    static final long zba;
    static final boolean zbb;
    private static final Unsafe zbc;
    private static final Class zbd;
    private static final boolean zbe;
    private static final zbwr zbf;
    private static final boolean zbg;
    private static final boolean zbh;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0116  */
    static {
        boolean z;
        zbwr zbwrVar;
        boolean z2;
        Field zbB;
        zbwr zbwrVar2;
        Unsafe zbg2 = zbg();
        zbc = zbg2;
        int i = zbsm.zba;
        zbd = Memory.class;
        Class cls = Long.TYPE;
        boolean zbv = zbv(cls);
        zbe = zbv;
        Class cls2 = Integer.TYPE;
        boolean zbv2 = zbv(cls2);
        zbwr zbwrVar3 = null;
        if (zbg2 != null) {
            if (zbv) {
                zbwrVar3 = new zbwq(zbg2);
            } else if (zbv2) {
                zbwrVar3 = new zbwp(zbg2);
            }
        }
        zbf = zbwrVar3;
        boolean z3 = true;
        if (zbwrVar3 != null) {
            try {
                Class<?> cls3 = zbwrVar3.zba.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                zbh(th);
            }
            if (zbB() != null) {
                z = true;
                zbg = z;
                zbwrVar = zbf;
                if (zbwrVar != null) {
                    try {
                        Class<?> cls4 = zbwrVar.zba.getClass();
                        cls4.getMethod("objectFieldOffset", Field.class);
                        cls4.getMethod("arrayBaseOffset", Class.class);
                        cls4.getMethod("arrayIndexScale", Class.class);
                        cls4.getMethod("getInt", Object.class, cls);
                        cls4.getMethod("putInt", Object.class, cls, cls2);
                        cls4.getMethod("getLong", Object.class, cls);
                        cls4.getMethod("putLong", Object.class, cls, cls);
                        cls4.getMethod("getObject", Object.class, cls);
                        cls4.getMethod("putObject", Object.class, cls, Object.class);
                        z2 = true;
                    } catch (Throwable th2) {
                        zbh(th2);
                    }
                    zbh = z2;
                    zba = zbz(byte[].class);
                    zbz(boolean[].class);
                    zbA(boolean[].class);
                    zbz(int[].class);
                    zbA(int[].class);
                    zbz(long[].class);
                    zbA(long[].class);
                    zbz(float[].class);
                    zbA(float[].class);
                    zbz(double[].class);
                    zbA(double[].class);
                    zbz(Object[].class);
                    zbA(Object[].class);
                    zbB = zbB();
                    if (zbB != null && (zbwrVar2 = zbf) != null) {
                        zbwrVar2.zba.objectFieldOffset(zbB);
                    }
                    if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                        z3 = false;
                    }
                    zbb = z3;
                }
                z2 = false;
                zbh = z2;
                zba = zbz(byte[].class);
                zbz(boolean[].class);
                zbA(boolean[].class);
                zbz(int[].class);
                zbA(int[].class);
                zbz(long[].class);
                zbA(long[].class);
                zbz(float[].class);
                zbA(float[].class);
                zbz(double[].class);
                zbA(double[].class);
                zbz(Object[].class);
                zbA(Object[].class);
                zbB = zbB();
                if (zbB != null) {
                    zbwrVar2.zba.objectFieldOffset(zbB);
                }
                if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                }
                zbb = z3;
            }
        }
        z = false;
        zbg = z;
        zbwrVar = zbf;
        if (zbwrVar != null) {
        }
        z2 = false;
        zbh = z2;
        zba = zbz(byte[].class);
        zbz(boolean[].class);
        zbA(boolean[].class);
        zbz(int[].class);
        zbA(int[].class);
        zbz(long[].class);
        zbA(long[].class);
        zbz(float[].class);
        zbA(float[].class);
        zbz(double[].class);
        zbA(double[].class);
        zbz(Object[].class);
        zbA(Object[].class);
        zbB = zbB();
        if (zbB != null) {
        }
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
        }
        zbb = z3;
    }

    private zbws() {
    }

    private static int zbA(Class cls) {
        if (zbh) {
            return zbf.zba.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zbB() {
        int i = zbsm.zba;
        Field zbC = zbC(Buffer.class, "effectiveDirectAddress");
        if (zbC == null) {
            Field zbC2 = zbC(Buffer.class, "address");
            if (zbC2 != null && zbC2.getType() == Long.TYPE) {
                return zbC2;
            }
            return null;
        }
        return zbC;
    }

    private static Field zbC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zbD(Object obj, long j, byte b) {
        zbwr zbwrVar = zbf;
        long j2 = (-4) & j;
        int i = zbwrVar.zba.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        zbwrVar.zba.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zbE(Object obj, long j, byte b) {
        zbwr zbwrVar = zbf;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        zbwrVar.zba.putInt(obj, j2, ((255 & b) << i) | (zbwrVar.zba.getInt(obj, j2) & (~(255 << i))));
    }

    public static double zba(Object obj, long j) {
        return zbf.zba(obj, j);
    }

    public static float zbb(Object obj, long j) {
        return zbf.zbb(obj, j);
    }

    public static int zbc(Object obj, long j) {
        return zbf.zba.getInt(obj, j);
    }

    public static long zbd(Object obj, long j) {
        return zbf.zba.getLong(obj, j);
    }

    public static Object zbe(Class cls) {
        try {
            return zbc.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static Object zbf(Object obj, long j) {
        return zbf.zba.getObject(obj, j);
    }

    public static Unsafe zbg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zbwo());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zbh(Throwable th) {
        Logger.getLogger(zbws.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void zbm(Object obj, long j, boolean z) {
        zbf.zbc(obj, j, z);
    }

    public static void zbn(byte[] bArr, long j, byte b) {
        zbf.zbd(bArr, zba + j, b);
    }

    public static void zbo(Object obj, long j, double d) {
        zbf.zbe(obj, j, d);
    }

    public static void zbp(Object obj, long j, float f) {
        zbf.zbf(obj, j, f);
    }

    public static void zbq(Object obj, long j, int i) {
        zbf.zba.putInt(obj, j, i);
    }

    public static void zbr(Object obj, long j, long j2) {
        zbf.zba.putLong(obj, j, j2);
    }

    public static void zbs(Object obj, long j, Object obj2) {
        zbf.zba.putObject(obj, j, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zbt(Object obj, long j) {
        if (((byte) ((zbf.zba.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean zbu(Object obj, long j) {
        if (((byte) ((zbf.zba.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static boolean zbv(Class cls) {
        int i = zbsm.zba;
        try {
            Class cls2 = zbd;
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

    public static boolean zbw(Object obj, long j) {
        return zbf.zbg(obj, j);
    }

    public static boolean zbx() {
        return zbh;
    }

    public static boolean zby() {
        return zbg;
    }

    private static int zbz(Class cls) {
        if (zbh) {
            return zbf.zba.arrayBaseOffset(cls);
        }
        return -1;
    }
}
