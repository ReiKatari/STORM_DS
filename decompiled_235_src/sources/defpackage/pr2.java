package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pr2  reason: default package */
/* loaded from: classes.dex */
public abstract class pr2 extends c1 {
    private static Map<Object, pr2> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected mg7 unknownFields;

    public pr2() {
        this.memoizedHashCode = 0;
        this.unknownFields = mg7.f;
        this.memoizedSerializedSize = -1;
    }

    public static pr2 g(Class cls) {
        pr2 pr2Var = defaultInstanceMap.get(cls);
        if (pr2Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                pr2Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (pr2Var == null) {
            pr2 pr2Var2 = (pr2) gh7.a(cls);
            pr2Var2.getClass();
            pr2 pr2Var3 = (pr2) pr2Var2.f(or2.GET_DEFAULT_INSTANCE);
            if (pr2Var3 != null) {
                defaultInstanceMap.put(cls, pr2Var3);
                return pr2Var3;
            }
            e41.m();
            return null;
        }
        return pr2Var;
    }

    public static Object h(Method method, pr2 pr2Var, Object... objArr) {
        try {
            return method.invoke(pr2Var, objArr);
        } catch (IllegalAccessException e) {
            u34.p("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (!(cause instanceof Error)) {
                    u34.p("Unexpected exception thrown by generated accessor method.", cause);
                    return null;
                }
                throw ((Error) cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static pr2 j(pr2 pr2Var, ea0 ea0Var, g82 g82Var) {
        ca0 ca0Var = (ca0) ea0Var;
        byte[] bArr = ca0Var.R;
        int g = ca0Var.g();
        int size = ca0Var.size();
        ks0 ks0Var = new ks0(bArr, g, size, true);
        try {
            ks0Var.e(size);
            pr2 pr2Var2 = (pr2) pr2Var.f(or2.NEW_MUTABLE_INSTANCE);
            try {
                y45 y45Var = y45.c;
                y45Var.getClass();
                j66 a = y45Var.a(pr2Var2.getClass());
                ls0 ls0Var = ks0Var.b;
                if (ls0Var == null) {
                    ls0Var = new ls0(ks0Var);
                }
                a.d(pr2Var2, ls0Var, g82Var);
                a.a(pr2Var2);
                if (ks0Var.h == 0) {
                    if (pr2Var2.i()) {
                        return pr2Var2;
                    }
                    throw new IOException(new ug(14).getMessage());
                }
                throw new IOException("Protocol message end-group tag did not match expected tag.");
            } catch (IOException e) {
                if (e.getCause() instanceof ub3) {
                    throw ((ub3) e.getCause());
                }
                throw new IOException(e.getMessage());
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof ub3) {
                    throw ((ub3) e2.getCause());
                }
                throw e2;
            }
        } catch (ub3 e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [ou, java.lang.Object] */
    public static pr2 k(pr2 pr2Var, byte[] bArr, g82 g82Var) {
        int length = bArr.length;
        pr2 pr2Var2 = (pr2) pr2Var.f(or2.NEW_MUTABLE_INSTANCE);
        try {
            y45 y45Var = y45.c;
            y45Var.getClass();
            j66 a = y45Var.a(pr2Var2.getClass());
            ?? obj = new Object();
            g82Var.getClass();
            a.h(pr2Var2, bArr, 0, length, obj);
            a.a(pr2Var2);
            if (pr2Var2.memoizedHashCode == 0) {
                if (pr2Var2.i()) {
                    return pr2Var2;
                }
                throw new IOException(new ug(14).getMessage());
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof ub3) {
                throw ((ub3) e.getCause());
            }
            throw new IOException(e.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw ub3.e();
        }
    }

    public static void l(Class cls, pr2 pr2Var) {
        defaultInstanceMap.put(cls, pr2Var);
    }

    @Override // defpackage.c1
    public final int a() {
        if (this.memoizedSerializedSize == -1) {
            y45 y45Var = y45.c;
            y45Var.getClass();
            this.memoizedSerializedSize = y45Var.a(getClass()).i(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // defpackage.c1
    public final void d(ms0 ms0Var) {
        y45 y45Var = y45.c;
        y45Var.getClass();
        j66 a = y45Var.a(getClass());
        os0 os0Var = ms0Var.a;
        if (os0Var == null) {
            os0Var = new os0(ms0Var);
        }
        a.e(this, os0Var);
    }

    public final mr2 e() {
        return (mr2) f(or2.NEW_BUILDER);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((pr2) f(or2.GET_DEFAULT_INSTANCE)).getClass().isInstance(obj)) {
            return false;
        }
        y45 y45Var = y45.c;
        y45Var.getClass();
        return y45Var.a(getClass()).c(this, (pr2) obj);
    }

    public abstract Object f(or2 or2Var);

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        y45 y45Var = y45.c;
        y45Var.getClass();
        int f = y45Var.a(getClass()).f(this);
        this.memoizedHashCode = f;
        return f;
    }

    public final boolean i() {
        byte byteValue = ((Byte) f(or2.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        y45 y45Var = y45.c;
        y45Var.getClass();
        boolean b = y45Var.a(getClass()).b(this);
        f(or2.SET_MEMOIZED_IS_INITIALIZED);
        return b;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        nc1.b0(this, sb, 0);
        return sb.toString();
    }
}
