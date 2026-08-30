package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k37  reason: default package */
/* loaded from: classes.dex */
public abstract class k37 {
    public final Unsafe a;

    public k37(Unsafe unsafe) {
        this.a = unsafe;
    }

    public final int a(Class cls) {
        return this.a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j, Object obj);

    public abstract byte d(long j, Object obj);

    public abstract double e(long j, Object obj);

    public abstract float f(long j, Object obj);

    public final int g(long j, Object obj) {
        return this.a.getInt(obj, j);
    }

    public final long h(long j, Object obj) {
        return this.a.getLong(obj, j);
    }

    public final Object i(long j, Object obj) {
        return this.a.getObject(obj, j);
    }

    public final long j(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j, boolean z);

    public abstract void l(Object obj, long j, byte b);

    public abstract void m(Object obj, long j, double d);

    public abstract void n(Object obj, long j, float f);

    public final void o(int i, long j, Object obj) {
        this.a.putInt(obj, j, i);
    }

    public final void p(Object obj, long j, long j2) {
        this.a.putLong(obj, j, j2);
    }

    public final void q(long j, Object obj, Object obj2) {
        this.a.putObject(obj, j, obj2);
    }
}
