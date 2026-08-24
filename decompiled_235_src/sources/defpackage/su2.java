package defpackage;

import java.io.EOFException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: su2  reason: default package */
/* loaded from: classes.dex */
public final class su2 {
    public final ThreadLocal a;
    public final ConcurrentHashMap b;
    public final ci c;
    public final ld3 d;
    public final List e;
    public final boolean f;
    public final ck2 g;
    public final List h;
    public final List i;
    public final List j;

    public su2(tu2 tu2Var) {
        this.a = new ThreadLocal();
        this.b = new ConcurrentHashMap();
        z62 z62Var = tu2Var.a;
        HashMap hashMap = new HashMap(tu2Var.d);
        this.f = tu2Var.i;
        this.g = tu2Var.j;
        boolean z = tu2Var.k;
        this.h = tu2.b(tu2Var.e);
        this.i = tu2.b(tu2Var.f);
        List b = tu2.b(tu2Var.n);
        this.j = b;
        if (tu2Var == tu2.u) {
            this.c = tu2.s;
            this.d = tu2.t;
            this.e = tu2.v;
            return;
        }
        ci ciVar = new ci(b, hashMap, z);
        this.c = ciVar;
        ld3 ld3Var = new ld3(ciVar);
        this.d = ld3Var;
        this.e = tu2Var.a(ciVar, ld3Var);
    }

    public final Object a(hf3 hf3Var, ie7 ie7Var) {
        boolean z;
        ls6 ls6Var = hf3Var.B;
        if (ls6Var == ls6.LEGACY_STRICT) {
            hf3Var.q0(ls6.LENIENT);
        }
        try {
            try {
                try {
                    try {
                        hf3Var.n0();
                        z = false;
                        try {
                            yc7 d = d(ie7Var);
                            Class cls = ie7Var.a;
                            Object b = d.b(hf3Var);
                            Class b0 = ii2.b0(cls);
                            if (b != null && !b0.isInstance(b)) {
                                throw new ClassCastException("Type adapter '" + d + "' returned wrong type; requested " + cls + " but got instance of " + b.getClass() + "\nVerify that the adapter was registered for the correct type.");
                            }
                            return b;
                        } catch (EOFException e) {
                            e = e;
                            if (z) {
                                hf3Var.q0(ls6Var);
                                return null;
                            }
                            throw new RuntimeException(e);
                        }
                    } finally {
                        hf3Var.q0(ls6Var);
                    }
                } catch (AssertionError e2) {
                    throw new AssertionError("AssertionError (GSON 2.14.0): " + e2.getMessage(), e2);
                }
            } catch (EOFException e3) {
                e = e3;
                z = true;
            }
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        } catch (IllegalStateException e5) {
            throw new RuntimeException(e5);
        }
    }

    public final Object b(FileReader fileReader, Type type) {
        return c(fileReader, new ie7(type));
    }

    public final Object c(Reader reader, ie7 ie7Var) {
        hf3 hf3Var = new hf3(reader);
        hf3Var.q0(ls6.LEGACY_STRICT);
        Object a = a(hf3Var, ie7Var);
        if (a != null) {
            try {
                if (hf3Var.n0() != jf3.END_DOCUMENT) {
                    throw new RuntimeException("JSON document was not fully consumed.");
                }
            } catch (i04 e) {
                throw new RuntimeException(e);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
        return a;
    }

    public final yc7 d(ie7 ie7Var) {
        boolean z;
        Objects.requireNonNull(ie7Var, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.b;
        yc7 yc7Var = (yc7) concurrentHashMap.get(ie7Var);
        if (yc7Var != null) {
            return yc7Var;
        }
        ThreadLocal threadLocal = this.a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            yc7 yc7Var2 = (yc7) map.get(ie7Var);
            if (yc7Var2 != null) {
                return yc7Var2;
            }
            z = false;
        }
        try {
            ru2 ru2Var = new ru2();
            map.put(ie7Var, ru2Var);
            Iterator it = this.e.iterator();
            yc7 yc7Var3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                yc7Var3 = ((zc7) it.next()).a(this, ie7Var);
                if (yc7Var3 != null) {
                    if (ru2Var.a == null) {
                        ru2Var.a = yc7Var3;
                        map.put(ie7Var, yc7Var3);
                    } else {
                        throw new AssertionError("Delegate is already set");
                    }
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (yc7Var3 != null) {
                if (z) {
                    concurrentHashMap.putAll(map);
                }
                return yc7Var3;
            }
            e41.w(ie7Var, "GSON (2.14.0) cannot handle ");
            return null;
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (r4 == r8) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r4 == r8) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yc7 e(zc7 zc7Var, ie7 ie7Var) {
        boolean z;
        Objects.requireNonNull(zc7Var, "skipPast must not be null");
        Objects.requireNonNull(ie7Var, "type must not be null");
        ld3 ld3Var = this.d;
        ld3Var.getClass();
        ConcurrentHashMap concurrentHashMap = ld3Var.B;
        if (zc7Var != ld3.L) {
            Class cls = ie7Var.a;
            zc7 zc7Var2 = (zc7) concurrentHashMap.get(cls);
            if (zc7Var2 == null) {
                jd3 jd3Var = (jd3) cls.getAnnotation(jd3.class);
                if (jd3Var != null) {
                    Class value = jd3Var.value();
                    if (zc7.class.isAssignableFrom(value)) {
                        zc7 zc7Var3 = (zc7) ld3Var.A.l(new ie7(value), true).e();
                        zc7 zc7Var4 = (zc7) concurrentHashMap.putIfAbsent(cls, zc7Var3);
                        if (zc7Var4 != null) {
                            zc7Var3 = zc7Var4;
                        }
                    }
                }
            }
            z = false;
            for (zc7 zc7Var5 : this.e) {
                if (!z) {
                    if (zc7Var5 == zc7Var) {
                        z = true;
                    }
                } else {
                    yc7 a = zc7Var5.a(this, ie7Var);
                    if (a != null) {
                        return a;
                    }
                }
            }
            if (z) {
                return d(ie7Var);
            }
            e41.w(ie7Var, "GSON cannot serialize or deserialize ");
            return null;
        }
        zc7Var = ld3Var;
        z = false;
        while (r0.hasNext()) {
        }
        if (z) {
        }
    }

    public final String f(Object obj) {
        Class<?> cls = obj.getClass();
        StringBuilder sb = new StringBuilder();
        try {
            vf3 vf3Var = new vf3(new qy3(sb));
            vf3Var.F(this.g);
            vf3Var.e0 = this.f;
            vf3Var.J(ls6.LEGACY_STRICT);
            vf3Var.g0 = false;
            g(obj, cls, vf3Var);
            return sb.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final void g(Object obj, Type type, vf3 vf3Var) {
        yc7 d = d(new ie7(type));
        ls6 ls6Var = vf3Var.d0;
        if (ls6Var == ls6.LEGACY_STRICT) {
            vf3Var.J(ls6.LENIENT);
        }
        boolean z = vf3Var.e0;
        boolean z2 = vf3Var.g0;
        vf3Var.e0 = this.f;
        vf3Var.g0 = false;
        try {
            try {
                d.c(vf3Var, obj);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.14.0): " + e2.getMessage(), e2);
            }
        } finally {
            vf3Var.J(ls6Var);
            vf3Var.e0 = z;
            vf3Var.g0 = z2;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }

    public su2() {
        this(tu2.u);
    }
}
