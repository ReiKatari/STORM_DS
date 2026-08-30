package ua;

import androidx.fragment.app.b2;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p1.a0;
import xa.g1;
import xa.v0;
import xa.x0;
import xa.z;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: h  reason: collision with root package name */
    public static final c f13529h = c.f13521d;

    /* renamed from: i  reason: collision with root package name */
    public static final r f13530i;

    /* renamed from: j  reason: collision with root package name */
    public static final r f13531j;

    /* renamed from: a  reason: collision with root package name */
    public final ThreadLocal f13532a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f13533b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final a0 f13534c;

    /* renamed from: d  reason: collision with root package name */
    public final xa.l f13535d;

    /* renamed from: e  reason: collision with root package name */
    public final List f13536e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f13537f;

    /* renamed from: g  reason: collision with root package name */
    public final c f13538g;

    static {
        a aVar = a.IDENTITY;
        f13530i = r.DOUBLE;
        f13531j = r.LAZILY_PARSED_NUMBER;
    }

    public h(wa.e eVar, a aVar, HashMap hashMap, c cVar, o oVar, ArrayList arrayList, s sVar, s sVar2, ArrayList arrayList2) {
        xa.p pVar;
        u eVar2;
        xa.p pVar2;
        a0 a0Var = new a0(23, hashMap, arrayList2);
        this.f13534c = a0Var;
        this.f13537f = true;
        this.f13538g = cVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(g1.A);
        xa.p pVar3 = xa.t.f14510c;
        if (sVar == r.DOUBLE) {
            pVar = xa.t.f14510c;
        } else {
            pVar = new xa.p(1, sVar);
        }
        arrayList3.add(pVar);
        arrayList3.add(eVar);
        arrayList3.addAll(arrayList);
        arrayList3.add(g1.f14482p);
        arrayList3.add(g1.f14474g);
        arrayList3.add(g1.f14471d);
        arrayList3.add(g1.f14472e);
        arrayList3.add(g1.f14473f);
        if (oVar == o.DEFAULT) {
            eVar2 = g1.f14478k;
        } else {
            eVar2 = new e();
        }
        arrayList3.add(new x0(Long.TYPE, Long.class, eVar2));
        arrayList3.add(new x0(Double.TYPE, Double.class, new d(0)));
        arrayList3.add(new x0(Float.TYPE, Float.class, new d(1)));
        xa.p pVar4 = xa.r.f14507b;
        if (sVar2 == r.LAZILY_PARSED_NUMBER) {
            pVar2 = xa.r.f14507b;
        } else {
            pVar2 = new xa.p(0, new xa.r(sVar2));
        }
        arrayList3.add(pVar2);
        arrayList3.add(g1.f14475h);
        arrayList3.add(g1.f14476i);
        arrayList3.add(new v0(AtomicLong.class, new f(eVar2, 0).a(), 0));
        arrayList3.add(new v0(AtomicLongArray.class, new f(eVar2, 1).a(), 0));
        arrayList3.add(g1.f14477j);
        arrayList3.add(g1.f14479l);
        arrayList3.add(g1.f14483q);
        arrayList3.add(g1.f14484r);
        arrayList3.add(new v0(BigDecimal.class, g1.m, 0));
        arrayList3.add(new v0(BigInteger.class, g1.f14480n, 0));
        arrayList3.add(new v0(wa.k.class, g1.f14481o, 0));
        arrayList3.add(g1.f14485s);
        arrayList3.add(g1.f14486t);
        arrayList3.add(g1.f14488v);
        arrayList3.add(g1.f14489w);
        arrayList3.add(g1.f14491y);
        arrayList3.add(g1.f14487u);
        arrayList3.add(g1.f14469b);
        arrayList3.add(xa.h.f14493c);
        arrayList3.add(g1.f14490x);
        if (ab.f.f694a) {
            arrayList3.add(ab.f.f696c);
            arrayList3.add(ab.f.f695b);
            arrayList3.add(ab.f.f697d);
        }
        arrayList3.add(xa.b.f14454c);
        arrayList3.add(g1.f14468a);
        arrayList3.add(new xa.d(a0Var, 0));
        arrayList3.add(new xa.d(a0Var, 1));
        xa.l lVar = new xa.l(a0Var);
        this.f13535d = lVar;
        arrayList3.add(lVar);
        arrayList3.add(g1.B);
        arrayList3.add(new z(a0Var, aVar, eVar, lVar, arrayList2));
        this.f13536e = Collections.unmodifiableList(arrayList3);
    }

    public static void a(double d4) {
        if (!Double.isNaN(d4) && !Double.isInfinite(d4)) {
            return;
        }
        throw new IllegalArgumentException(d4 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.io.FileReader r9, java.lang.reflect.Type r10) {
        /*
            r8 = this;
            bb.a r0 = new bb.a
            r0.<init>(r10)
            cb.a r10 = new cb.a
            r10.<init>(r9)
            ua.q r9 = ua.q.LEGACY_STRICT
            r10.g0(r9)
            java.lang.String r1 = "AssertionError (GSON 2.13.2): "
            java.lang.String r2 = "Type adapter '"
            ua.q r3 = r10.B
            if (r3 != r9) goto L1c
            ua.q r9 = ua.q.LENIENT
            r10.g0(r9)
        L1c:
            r10.d0()     // Catch: java.lang.Throwable -> L62 java.lang.AssertionError -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68 java.io.EOFException -> L92
            r9 = 0
            ua.u r4 = r8.c(r0)     // Catch: java.lang.Throwable -> L62 java.lang.AssertionError -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68 java.io.EOFException -> L6a
            java.lang.Class r0 = r0.f2155a     // Catch: java.lang.Throwable -> L62 java.lang.AssertionError -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68 java.io.EOFException -> L6a
            java.lang.Object r5 = r4.b(r10)     // Catch: java.lang.Throwable -> L62 java.lang.AssertionError -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68 java.io.EOFException -> L6a
            java.lang.Class r6 = wa.i.l(r0)     // Catch: java.lang.Throwable -> L62 java.lang.AssertionError -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68 java.io.EOFException -> L6a
            if (r5 == 0) goto L6c
            boolean r6 = r6.isInstance(r5)     // Catch: java.lang.Throwable -> L62 java.lang.AssertionError -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68 java.io.EOFException -> L6a
            if (r6 == 0) goto L37
            goto L6c
        L37:
            java.lang.ClassCastException r6 = new java.lang.ClassCastException     // Catch: java.lang.Throwable -> L62 java.lang.AssertionError -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68 java.io.EOFException -> L6a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62 java.lang.AssertionError -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68 java.io.EOFException -> L6a
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L62 java.lang.AssertionError -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68 java.io.EOFException -> L6a
            r7.append(r4)     // Catch: java.lang.Throwable -> L62 java.lang.AssertionError -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68 java.io.EOFException -> L6a
            java.lang.String r2 = "' returned wrong type; requested "
            r7.append(r2)     // Catch: java.lang.Throwable -> L62 java.lang.AssertionError -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68 java.io.EOFException -> L6a
            r7.append(r0)     // Catch: java.lang.Throwable -> L62 java.lang.AssertionError -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68 java.io.EOFException -> L6a
            java.lang.String r0 = " but got instance of "
            r7.append(r0)     // Catch: java.lang.Throwable -> L62 java.lang.AssertionError -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68 java.io.EOFException -> L6a
            java.lang.Class r0 = r5.getClass()     // Catch: java.lang.Throwable -> L62 java.lang.AssertionError -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68 java.io.EOFException -> L6a
            r7.append(r0)     // Catch: java.lang.Throwable -> L62 java.lang.AssertionError -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68 java.io.EOFException -> L6a
            java.lang.String r0 = "\nVerify that the adapter was registered for the correct type."
            r7.append(r0)     // Catch: java.lang.Throwable -> L62 java.lang.AssertionError -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68 java.io.EOFException -> L6a
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L62 java.lang.AssertionError -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68 java.io.EOFException -> L6a
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L62 java.lang.AssertionError -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68 java.io.EOFException -> L6a
            throw r6     // Catch: java.lang.Throwable -> L62 java.lang.AssertionError -> L64 java.io.IOException -> L66 java.lang.IllegalStateException -> L68 java.io.EOFException -> L6a
        L62:
            r9 = move-exception
            goto Lc4
        L64:
            r9 = move-exception
            goto L70
        L66:
            r9 = move-exception
            goto L86
        L68:
            r9 = move-exception
            goto L8c
        L6a:
            r0 = move-exception
            goto L94
        L6c:
            r10.g0(r3)
            goto L9a
        L70:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L62
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = r9.getMessage()     // Catch: java.lang.Throwable -> L62
            r2.append(r1)     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L62
            r0.<init>(r1, r9)     // Catch: java.lang.Throwable -> L62
            throw r0     // Catch: java.lang.Throwable -> L62
        L86:
            ua.k r0 = new ua.k     // Catch: java.lang.Throwable -> L62
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L62
            throw r0     // Catch: java.lang.Throwable -> L62
        L8c:
            ua.k r0 = new ua.k     // Catch: java.lang.Throwable -> L62
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L62
            throw r0     // Catch: java.lang.Throwable -> L62
        L92:
            r0 = move-exception
            r9 = 1
        L94:
            if (r9 == 0) goto Lbe
            r10.g0(r3)
            r5 = 0
        L9a:
            if (r5 == 0) goto Lbd
            cb.b r9 = r10.d0()     // Catch: java.io.IOException -> Lad cb.d -> Laf
            cb.b r10 = cb.b.END_DOCUMENT     // Catch: java.io.IOException -> Lad cb.d -> Laf
            if (r9 != r10) goto La5
            goto Lbd
        La5:
            ua.k r9 = new ua.k     // Catch: java.io.IOException -> Lad cb.d -> Laf
            java.lang.String r10 = "JSON document was not fully consumed."
            r9.<init>(r10)     // Catch: java.io.IOException -> Lad cb.d -> Laf
            throw r9     // Catch: java.io.IOException -> Lad cb.d -> Laf
        Lad:
            r9 = move-exception
            goto Lb1
        Laf:
            r9 = move-exception
            goto Lb7
        Lb1:
            ua.k r10 = new ua.k
            r10.<init>(r9)
            throw r10
        Lb7:
            ua.k r10 = new ua.k
            r10.<init>(r9)
            throw r10
        Lbd:
            return r5
        Lbe:
            ua.k r9 = new ua.k     // Catch: java.lang.Throwable -> L62
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L62
            throw r9     // Catch: java.lang.Throwable -> L62
        Lc4:
            r10.g0(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.h.b(java.io.FileReader, java.lang.reflect.Type):java.lang.Object");
    }

    public final u c(bb.a aVar) {
        boolean z10;
        Objects.requireNonNull(aVar, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f13533b;
        u uVar = (u) concurrentHashMap.get(aVar);
        if (uVar != null) {
            return uVar;
        }
        ThreadLocal threadLocal = this.f13532a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z10 = true;
        } else {
            u uVar2 = (u) map.get(aVar);
            if (uVar2 != null) {
                return uVar2;
            }
            z10 = false;
        }
        try {
            g gVar = new g();
            map.put(aVar, gVar);
            Iterator it = this.f13536e.iterator();
            u uVar3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                uVar3 = ((v) it.next()).a(this, aVar);
                if (uVar3 != null) {
                    if (gVar.f13528a == null) {
                        gVar.f13528a = uVar3;
                        map.put(aVar, uVar3);
                    } else {
                        throw new AssertionError("Delegate is already set");
                    }
                }
            }
            if (z10) {
                threadLocal.remove();
            }
            if (uVar3 != null) {
                if (z10) {
                    concurrentHashMap.putAll(map);
                }
                return uVar3;
            }
            fj.j.r(aVar, "GSON (2.13.2) cannot handle ");
            return null;
        } catch (Throwable th2) {
            if (z10) {
                threadLocal.remove();
            }
            throw th2;
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
    public final ua.u d(ua.v r8, bb.a r9) {
        /*
            r7 = this;
            java.lang.String r0 = "skipPast must not be null"
            java.util.Objects.requireNonNull(r8, r0)
            java.lang.String r0 = "type must not be null"
            java.util.Objects.requireNonNull(r9, r0)
            xa.l r0 = r7.f13535d
            r0.getClass()
            java.util.concurrent.ConcurrentHashMap r1 = r0.B
            xa.k r2 = xa.l.L
            r3 = 1
            if (r8 != r2) goto L17
            goto L58
        L17:
            java.lang.Class r2 = r9.f2155a
            java.lang.Object r4 = r1.get(r2)
            ua.v r4 = (ua.v) r4
            if (r4 == 0) goto L24
            if (r4 != r8) goto L59
            goto L58
        L24:
            java.lang.Class<va.a> r4 = va.a.class
            java.lang.annotation.Annotation r4 = r2.getAnnotation(r4)
            va.a r4 = (va.a) r4
            if (r4 != 0) goto L2f
            goto L59
        L2f:
            java.lang.Class r4 = r4.value()
            java.lang.Class<ua.v> r5 = ua.v.class
            boolean r5 = r5.isAssignableFrom(r4)
            if (r5 != 0) goto L3c
            goto L59
        L3c:
            p1.a0 r5 = r0.A
            bb.a r6 = new bb.a
            r6.<init>(r4)
            wa.p r4 = r5.w(r6, r3)
            java.lang.Object r4 = r4.d()
            ua.v r4 = (ua.v) r4
            java.lang.Object r1 = r1.putIfAbsent(r2, r4)
            ua.v r1 = (ua.v) r1
            if (r1 == 0) goto L56
            r4 = r1
        L56:
            if (r4 != r8) goto L59
        L58:
            r8 = r0
        L59:
            java.util.List r0 = r7.f13536e
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L60:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L79
            java.lang.Object r2 = r0.next()
            ua.v r2 = (ua.v) r2
            if (r1 != 0) goto L72
            if (r2 != r8) goto L60
            r1 = r3
            goto L60
        L72:
            ua.u r2 = r2.a(r7, r9)
            if (r2 == 0) goto L60
            return r2
        L79:
            if (r1 != 0) goto L80
            ua.u r8 = r7.c(r9)
            return r8
        L80:
            java.lang.String r8 = "GSON cannot serialize or deserialize "
            fj.j.r(r9, r8)
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.h.d(ua.v, bb.a):ua.u");
    }

    public final String e(ArrayList arrayList) {
        Class<?> cls = arrayList.getClass();
        StringBuilder sb2 = new StringBuilder();
        try {
            cb.c cVar = new cb.c(new b2(sb2));
            cVar.H(this.f13538g);
            cVar.f2813c0 = this.f13537f;
            cVar.I(q.LEGACY_STRICT);
            cVar.f2815e0 = false;
            f(arrayList, cls, cVar);
            return sb2.toString();
        } catch (IOException e6) {
            throw new RuntimeException(e6);
        }
    }

    public final void f(ArrayList arrayList, Class cls, cb.c cVar) {
        u c4 = c(new bb.a(cls));
        q qVar = cVar.f2812b0;
        if (qVar == q.LEGACY_STRICT) {
            cVar.I(q.LENIENT);
        }
        boolean z10 = cVar.f2813c0;
        boolean z11 = cVar.f2815e0;
        cVar.f2813c0 = this.f13537f;
        cVar.f2815e0 = false;
        try {
            try {
                c4.c(cVar, arrayList);
            } catch (IOException e6) {
                throw new RuntimeException(e6);
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e10.getMessage(), e10);
            }
        } finally {
            cVar.I(qVar);
            cVar.f2813c0 = z10;
            cVar.f2815e0 = z11;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f13536e + ",instanceCreators:" + this.f13534c + "}";
    }
}
