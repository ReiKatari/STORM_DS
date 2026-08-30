package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jl2  reason: default package */
/* loaded from: classes.dex */
public abstract class jl2 extends b1 {
    private static Map<Object, jl2> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected r27 unknownFields;

    public jl2() {
        this.memoizedHashCode = 0;
        this.unknownFields = r27.f;
        this.memoizedSerializedSize = -1;
    }

    public static jl2 g(Class cls) {
        jl2 jl2Var = defaultInstanceMap.get(cls);
        if (jl2Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                jl2Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (jl2Var == null) {
            jl2 jl2Var2 = (jl2) l37.a(cls);
            jl2Var2.getClass();
            jl2 jl2Var3 = (jl2) jl2Var2.f(il2.GET_DEFAULT_INSTANCE);
            if (jl2Var3 != null) {
                defaultInstanceMap.put(cls, jl2Var3);
                return jl2Var3;
            }
            f81.o();
            return null;
        }
        return jl2Var;
    }

    public static Object h(Method method, jl2 jl2Var, Object... objArr) {
        try {
            return method.invoke(jl2Var, objArr);
        } catch (IllegalAccessException e) {
            c44.o("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (!(cause instanceof Error)) {
                    c44.o("Unexpected exception thrown by generated accessor method.", cause);
                    return null;
                }
                throw ((Error) cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static jl2 j(jl2 jl2Var, x70 x70Var, o32 o32Var) {
        v70 v70Var = (v70) x70Var;
        byte[] bArr = v70Var.R;
        int k = v70Var.k();
        int size = v70Var.size();
        xp0 xp0Var = new xp0(bArr, k, size, true);
        try {
            xp0Var.e(size);
            jl2 jl2Var2 = (jl2) jl2Var.f(il2.NEW_MUTABLE_INSTANCE);
            try {
                rv4 rv4Var = rv4.c;
                rv4Var.getClass();
                cv5 a = rv4Var.a(jl2Var2.getClass());
                yp0 yp0Var = xp0Var.b;
                if (yp0Var == null) {
                    yp0Var = new yp0(xp0Var);
                }
                a.i(jl2Var2, yp0Var, o32Var);
                a.d(jl2Var2);
                if (xp0Var.h == 0) {
                    if (jl2Var2.i()) {
                        return jl2Var2;
                    }
                    throw new IOException(new hg(13).getMessage());
                }
                throw new IOException("Protocol message end-group tag did not match expected tag.");
            } catch (IOException e) {
                if (e.getCause() instanceof i53) {
                    throw ((i53) e.getCause());
                }
                throw new IOException(e.getMessage());
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof i53) {
                    throw ((i53) e2.getCause());
                }
                throw e2;
            }
        } catch (i53 e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, wt] */
    public static jl2 k(jl2 jl2Var, byte[] bArr, o32 o32Var) {
        int length = bArr.length;
        jl2 jl2Var2 = (jl2) jl2Var.f(il2.NEW_MUTABLE_INSTANCE);
        try {
            rv4 rv4Var = rv4.c;
            rv4Var.getClass();
            cv5 a = rv4Var.a(jl2Var2.getClass());
            ?? obj = new Object();
            o32Var.getClass();
            a.f(jl2Var2, bArr, 0, length, obj);
            a.d(jl2Var2);
            if (jl2Var2.memoizedHashCode == 0) {
                if (jl2Var2.i()) {
                    return jl2Var2;
                }
                throw new IOException(new hg(13).getMessage());
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof i53) {
                throw ((i53) e.getCause());
            }
            throw new IOException(e.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw i53.e();
        }
    }

    public static void l(Class cls, jl2 jl2Var) {
        defaultInstanceMap.put(cls, jl2Var);
    }

    @Override // defpackage.b1
    public final int a() {
        if (this.memoizedSerializedSize == -1) {
            rv4 rv4Var = rv4.c;
            rv4Var.getClass();
            this.memoizedSerializedSize = rv4Var.a(getClass()).g(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // defpackage.b1
    public final void d(zp0 zp0Var) {
        rv4 rv4Var = rv4.c;
        rv4Var.getClass();
        cv5 a = rv4Var.a(getClass());
        bq0 bq0Var = zp0Var.a;
        if (bq0Var == null) {
            bq0Var = new bq0(zp0Var);
        }
        a.a(this, bq0Var);
    }

    public final gl2 e() {
        return (gl2) f(il2.NEW_BUILDER);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((jl2) f(il2.GET_DEFAULT_INSTANCE)).getClass().isInstance(obj)) {
            return false;
        }
        rv4 rv4Var = rv4.c;
        rv4Var.getClass();
        return rv4Var.a(getClass()).h(this, (jl2) obj);
    }

    public abstract Object f(il2 il2Var);

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        rv4 rv4Var = rv4.c;
        rv4Var.getClass();
        int b = rv4Var.a(getClass()).b(this);
        this.memoizedHashCode = b;
        return b;
    }

    public final boolean i() {
        byte byteValue = ((Byte) f(il2.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        rv4 rv4Var = rv4.c;
        rv4Var.getClass();
        boolean e = rv4Var.a(getClass()).e(this);
        f(il2.SET_MEMOIZED_IS_INITIALIZED);
        return e;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        dk7.F(this, sb, 0);
        return sb.toString();
    }
}
