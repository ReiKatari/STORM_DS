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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qo2  reason: default package */
/* loaded from: classes.dex */
public final class qo2 {
    public final ThreadLocal a = new ThreadLocal();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final qh c;
    public final w63 d;
    public final List e;
    public final boolean f;
    public final df2 g;

    public qo2(ro2 ro2Var) {
        HashMap hashMap = new HashMap(ro2Var.d);
        this.f = ro2Var.i;
        this.g = ro2Var.j;
        boolean z = ro2Var.k;
        ro2.b(ro2Var.e);
        ro2.b(ro2Var.f);
        List b = ro2.b(ro2Var.n);
        if (ro2Var == ro2.u) {
            this.c = ro2.s;
            this.d = ro2.t;
            this.e = ro2.v;
            return;
        }
        qh qhVar = new qh(b, hashMap, z);
        this.c = qhVar;
        w63 w63Var = new w63(qhVar);
        this.d = w63Var;
        this.e = ro2Var.a(qhVar, w63Var);
    }

    public final Object a(o83 o83Var, n07 n07Var) {
        boolean z;
        ug6 ug6Var = o83Var.B;
        if (ug6Var == ug6.LEGACY_STRICT) {
            o83Var.q0(ug6.LENIENT);
        }
        try {
            try {
                try {
                    try {
                        o83Var.n0();
                        z = false;
                        try {
                            dz6 d = d(n07Var);
                            Class cls = n07Var.a;
                            Object b = d.b(o83Var);
                            Class K = ep2.K(cls);
                            if (b != null && !K.isInstance(b)) {
                                throw new ClassCastException("Type adapter '" + d + "' returned wrong type; requested " + cls + " but got instance of " + b.getClass() + "\nVerify that the adapter was registered for the correct type.");
                            }
                            return b;
                        } catch (EOFException e) {
                            e = e;
                            if (z) {
                                o83Var.q0(ug6Var);
                                return null;
                            }
                            throw new RuntimeException(e);
                        }
                    } finally {
                        o83Var.q0(ug6Var);
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
        return c(fileReader, new n07(type));
    }

    public final Object c(Reader reader, n07 n07Var) {
        o83 o83Var = new o83(reader);
        o83Var.q0(ug6.LEGACY_STRICT);
        Object a = a(o83Var, n07Var);
        if (a != null) {
            try {
                if (o83Var.n0() != q83.END_DOCUMENT) {
                    throw new RuntimeException("JSON document was not fully consumed.");
                }
            } catch (ft3 e) {
                throw new RuntimeException(e);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
        return a;
    }

    public final dz6 d(n07 n07Var) {
        boolean z;
        Objects.requireNonNull(n07Var, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.b;
        dz6 dz6Var = (dz6) concurrentHashMap.get(n07Var);
        if (dz6Var != null) {
            return dz6Var;
        }
        ThreadLocal threadLocal = this.a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            dz6 dz6Var2 = (dz6) map.get(n07Var);
            if (dz6Var2 != null) {
                return dz6Var2;
            }
            z = false;
        }
        try {
            po2 po2Var = new po2();
            map.put(n07Var, po2Var);
            Iterator it = this.e.iterator();
            dz6 dz6Var3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                dz6Var3 = ((ez6) it.next()).a(this, n07Var);
                if (dz6Var3 != null) {
                    if (po2Var.a == null) {
                        po2Var.a = dz6Var3;
                        map.put(n07Var, dz6Var3);
                    } else {
                        throw new AssertionError("Delegate is already set");
                    }
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (dz6Var3 != null) {
                if (z) {
                    concurrentHashMap.putAll(map);
                }
                return dz6Var3;
            }
            f81.x(n07Var, "GSON (2.14.0) cannot handle ");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dz6 e(defpackage.ez6 r8, defpackage.n07 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "skipPast must not be null"
            java.util.Objects.requireNonNull(r8, r0)
            java.lang.String r0 = "type must not be null"
            java.util.Objects.requireNonNull(r9, r0)
            w63 r0 = r7.d
            r0.getClass()
            java.util.concurrent.ConcurrentHashMap r1 = r0.B
            v63 r2 = defpackage.w63.L
            r3 = 1
            if (r8 != r2) goto L17
            goto L58
        L17:
            java.lang.Class r2 = r9.a
            java.lang.Object r4 = r1.get(r2)
            ez6 r4 = (defpackage.ez6) r4
            if (r4 == 0) goto L24
            if (r4 != r8) goto L59
            goto L58
        L24:
            java.lang.Class<u63> r4 = defpackage.u63.class
            java.lang.annotation.Annotation r4 = r2.getAnnotation(r4)
            u63 r4 = (defpackage.u63) r4
            if (r4 != 0) goto L2f
            goto L59
        L2f:
            java.lang.Class r4 = r4.value()
            java.lang.Class<ez6> r5 = defpackage.ez6.class
            boolean r5 = r5.isAssignableFrom(r4)
            if (r5 != 0) goto L3c
            goto L59
        L3c:
            qh r5 = r0.A
            n07 r6 = new n07
            r6.<init>(r4)
            y84 r4 = r5.k(r6, r3)
            java.lang.Object r4 = r4.d()
            ez6 r4 = (defpackage.ez6) r4
            java.lang.Object r1 = r1.putIfAbsent(r2, r4)
            ez6 r1 = (defpackage.ez6) r1
            if (r1 == 0) goto L56
            r4 = r1
        L56:
            if (r4 != r8) goto L59
        L58:
            r8 = r0
        L59:
            java.util.List r0 = r7.e
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L60:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L79
            java.lang.Object r2 = r0.next()
            ez6 r2 = (defpackage.ez6) r2
            if (r1 != 0) goto L72
            if (r2 != r8) goto L60
            r1 = r3
            goto L60
        L72:
            dz6 r2 = r2.a(r7, r9)
            if (r2 == 0) goto L60
            return r2
        L79:
            if (r1 != 0) goto L80
            dz6 r7 = r7.d(r9)
            return r7
        L80:
            java.lang.String r7 = "GSON cannot serialize or deserialize "
            defpackage.f81.x(r9, r7)
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qo2.e(ez6, n07):dz6");
    }

    public final String f(Object obj) {
        Class<?> cls = obj.getClass();
        StringBuilder sb = new StringBuilder();
        try {
            b93 b93Var = new b93(new nr3(sb));
            b93Var.J(this.g);
            b93Var.d0 = this.f;
            b93Var.K(ug6.LEGACY_STRICT);
            b93Var.f0 = false;
            g(obj, cls, b93Var);
            return sb.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final void g(Object obj, Type type, b93 b93Var) {
        dz6 d = d(new n07(type));
        ug6 ug6Var = b93Var.c0;
        if (ug6Var == ug6.LEGACY_STRICT) {
            b93Var.K(ug6.LENIENT);
        }
        boolean z = b93Var.d0;
        boolean z2 = b93Var.f0;
        b93Var.d0 = this.f;
        b93Var.f0 = false;
        try {
            try {
                d.c(b93Var, obj);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.14.0): " + e2.getMessage(), e2);
            }
        } finally {
            b93Var.K(ug6Var);
            b93Var.d0 = z;
            b93Var.f0 = z2;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }
}
