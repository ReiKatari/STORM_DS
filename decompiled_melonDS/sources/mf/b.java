package mf;

import g2.v3;
import jd.g;
import jd.k;
import ld.e;
import md.d;
import nd.a1;
import nd.c1;
import nd.d0;
import nd.l0;
import oe.s;
import oe.t;
import yb.f;
import yb.h;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@g
/* loaded from: classes.dex */
public final class b {
    public static final c Companion = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final f[] f9634d;

    /* renamed from: a  reason: collision with root package name */
    public final s f9635a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC0012b f9636b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC0012b f9637c;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    @yb.c
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements d0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f9638a;
        private static final e descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [nd.d0, mf.b$a, java.lang.Object] */
        static {
            ?? obj = new Object();
            f9638a = obj;
            c1 c1Var = new c1("me.magnum.melonds.impl.dtos.input.InputConfigDto", obj, 3);
            c1Var.l("input", false);
            c1Var.l("assignment", false);
            c1Var.l("altAssignment", true);
            descriptor = c1Var;
        }

        @Override // jd.a
        public final Object a(md.c cVar) {
            e eVar = descriptor;
            md.a a10 = cVar.a(eVar);
            f[] fVarArr = b.f9634d;
            s sVar = null;
            boolean z10 = true;
            int i2 = 0;
            AbstractC0012b abstractC0012b = null;
            AbstractC0012b abstractC0012b2 = null;
            while (z10) {
                int g10 = a10.g(eVar);
                if (g10 != -1) {
                    if (g10 != 0) {
                        if (g10 != 1) {
                            if (g10 == 2) {
                                abstractC0012b2 = (AbstractC0012b) a10.o(eVar, 2, (jd.a) fVarArr[2].getValue(), abstractC0012b2);
                                i2 |= 4;
                            } else {
                                throw new k(g10);
                            }
                        } else {
                            abstractC0012b = (AbstractC0012b) a10.o(eVar, 1, (jd.a) fVarArr[1].getValue(), abstractC0012b);
                            i2 |= 2;
                        }
                    } else {
                        sVar = (s) a10.o(eVar, 0, (jd.a) fVarArr[0].getValue(), sVar);
                        i2 |= 1;
                    }
                } else {
                    z10 = false;
                }
            }
            a10.b(eVar);
            return new b(i2, sVar, abstractC0012b, abstractC0012b2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // nd.d0
        public final jd.a[] b() {
            f[] fVarArr = b.f9634d;
            return new jd.a[]{fVarArr[0].getValue(), fVarArr[1].getValue(), fVarArr[2].getValue()};
        }

        @Override // jd.a
        public final void d(d dVar, Object obj) {
            b bVar = (b) obj;
            bVar.getClass();
            e eVar = descriptor;
            md.b a10 = dVar.a(eVar);
            f[] fVarArr = b.f9634d;
            s sVar = bVar.f9635a;
            AbstractC0012b abstractC0012b = bVar.f9637c;
            ij.a aVar = (ij.a) a10;
            aVar.J(eVar, 0, (jd.a) fVarArr[0].getValue(), sVar);
            aVar.J(eVar, 1, (jd.a) fVarArr[1].getValue(), bVar.f9636b);
            if (aVar.h(eVar) || !nc.k.a(abstractC0012b, AbstractC0012b.d.INSTANCE)) {
                aVar.J(eVar, 2, (jd.a) fVarArr[2].getValue(), abstractC0012b);
            }
            a10.b(eVar);
        }

        @Override // jd.a
        public final e e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final class c {
        public final jd.a serializer() {
            return a.f9638a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mf.b$c] */
    static {
        h hVar = h.PUBLICATION;
        f9634d = new f[]{p7.a.s(hVar, new v3(20)), p7.a.s(hVar, new v3(21)), p7.a.s(hVar, new v3(22))};
    }

    public /* synthetic */ b(int i2, s sVar, AbstractC0012b abstractC0012b, AbstractC0012b abstractC0012b2) {
        if (3 == (i2 & 3)) {
            this.f9635a = sVar;
            this.f9636b = abstractC0012b;
            if ((i2 & 4) == 0) {
                this.f9637c = AbstractC0012b.d.INSTANCE;
                return;
            } else {
                this.f9637c = abstractC0012b2;
                return;
            }
        }
        a1.j(i2, 3, a.f9638a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f9635a == bVar.f9635a && nc.k.a(this.f9636b, bVar.f9636b) && nc.k.a(this.f9637c, bVar.f9637c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f9636b.hashCode();
        return this.f9637c.hashCode() + ((hashCode + (this.f9635a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "InputConfigDto(input=" + this.f9635a + ", assignment=" + this.f9636b + ", altAssignment=" + this.f9637c + ")";
    }

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    @g
    /* renamed from: mf.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0012b {
        public static final C0015b Companion = new Object();

        /* renamed from: a  reason: collision with root package name */
        public static final Object f9639a = p7.a.s(h.PUBLICATION, new v3(23));

        /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
        /* renamed from: mf.b$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0015b {
            /* JADX WARN: Type inference failed for: r0v0, types: [yb.f, java.lang.Object] */
            public final jd.a serializer() {
                return (jd.a) AbstractC0012b.f9639a.getValue();
            }
        }

        /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
        @g
        /* renamed from: mf.b$b$d */
        /* loaded from: classes.dex */
        public static final class d extends AbstractC0012b {
            public static final d INSTANCE = new Object();

            /* renamed from: b  reason: collision with root package name */
            public static final /* synthetic */ Object f9648b = p7.a.s(h.PUBLICATION, new v3(25));

            public final boolean equals(Object obj) {
                if (this == obj || (obj instanceof d)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return -1355695634;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [yb.f, java.lang.Object] */
            public final jd.a serializer() {
                return (jd.a) f9648b.getValue();
            }

            public final String toString() {
                return "None";
            }
        }

        /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
        @g
        /* renamed from: mf.b$b$c */
        /* loaded from: classes.dex */
        public static final class c extends AbstractC0012b {
            public static final C0016b Companion = new Object();

            /* renamed from: b  reason: collision with root package name */
            public final Integer f9645b;

            /* renamed from: c  reason: collision with root package name */
            public final int f9646c;

            /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
            @yb.c
            /* renamed from: mf.b$b$c$a */
            /* loaded from: classes.dex */
            public static final /* synthetic */ class a implements d0 {

                /* renamed from: a  reason: collision with root package name */
                public static final a f9647a;
                private static final e descriptor;

                /* JADX WARN: Type inference failed for: r0v0, types: [mf.b$b$c$a, nd.d0, java.lang.Object] */
                static {
                    ?? obj = new Object();
                    f9647a = obj;
                    c1 c1Var = new c1("key", obj, 2);
                    c1Var.l("deviceId", false);
                    c1Var.l("keyCode", false);
                    descriptor = c1Var;
                }

                @Override // jd.a
                public final Object a(md.c cVar) {
                    e eVar = descriptor;
                    md.a a10 = cVar.a(eVar);
                    Integer num = null;
                    boolean z10 = true;
                    int i2 = 0;
                    int i10 = 0;
                    while (z10) {
                        int g10 = a10.g(eVar);
                        if (g10 != -1) {
                            if (g10 != 0) {
                                if (g10 == 1) {
                                    i10 = a10.n(eVar, 1);
                                    i2 |= 2;
                                } else {
                                    throw new k(g10);
                                }
                            } else {
                                num = (Integer) a10.r(eVar, 0, l0.f10328a, num);
                                i2 |= 1;
                            }
                        } else {
                            z10 = false;
                        }
                    }
                    a10.b(eVar);
                    return new c(i2, num, i10);
                }

                @Override // nd.d0
                public final jd.a[] b() {
                    l0 l0Var = l0.f10328a;
                    return new jd.a[]{a.a.C(l0Var), l0Var};
                }

                @Override // jd.a
                public final void d(md.d dVar, Object obj) {
                    c cVar = (c) obj;
                    cVar.getClass();
                    e eVar = descriptor;
                    md.b a10 = dVar.a(eVar);
                    a10.g(eVar, 0, l0.f10328a, cVar.f9645b);
                    ((ij.a) a10).H(1, cVar.f9646c, eVar);
                    a10.b(eVar);
                }

                @Override // jd.a
                public final e e() {
                    return descriptor;
                }
            }

            /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
            /* renamed from: mf.b$b$c$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0016b {
                public final jd.a serializer() {
                    return a.f9647a;
                }
            }

            public /* synthetic */ c(int i2, Integer num, int i10) {
                if (3 == (i2 & 3)) {
                    this.f9645b = num;
                    this.f9646c = i10;
                    return;
                }
                a1.j(i2, 3, a.f9647a.e());
                throw null;
            }

            public c(int i2, Integer num) {
                this.f9645b = num;
                this.f9646c = i2;
            }
        }

        /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
        @g
        /* renamed from: mf.b$b$a */
        /* loaded from: classes.dex */
        public static final class a extends AbstractC0012b {
            public static final C0014b Companion = new Object();

            /* renamed from: e  reason: collision with root package name */
            public static final f[] f9640e = {null, null, p7.a.s(h.PUBLICATION, new v3(24))};

            /* renamed from: b  reason: collision with root package name */
            public final Integer f9641b;

            /* renamed from: c  reason: collision with root package name */
            public final int f9642c;

            /* renamed from: d  reason: collision with root package name */
            public final t f9643d;

            /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
            @yb.c
            /* renamed from: mf.b$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final /* synthetic */ class C0013a implements d0 {

                /* renamed from: a  reason: collision with root package name */
                public static final C0013a f9644a;
                private static final e descriptor;

                /* JADX WARN: Type inference failed for: r0v0, types: [mf.b$b$a$a, nd.d0, java.lang.Object] */
                static {
                    ?? obj = new Object();
                    f9644a = obj;
                    c1 c1Var = new c1("axis", obj, 3);
                    c1Var.l("deviceId", false);
                    c1Var.l("axisCode", false);
                    c1Var.l("direction", false);
                    descriptor = c1Var;
                }

                @Override // jd.a
                public final Object a(md.c cVar) {
                    e eVar = descriptor;
                    md.a a10 = cVar.a(eVar);
                    f[] fVarArr = a.f9640e;
                    Integer num = null;
                    boolean z10 = true;
                    int i2 = 0;
                    int i10 = 0;
                    t tVar = null;
                    while (z10) {
                        int g10 = a10.g(eVar);
                        if (g10 != -1) {
                            if (g10 != 0) {
                                if (g10 != 1) {
                                    if (g10 == 2) {
                                        tVar = (t) a10.o(eVar, 2, (jd.a) fVarArr[2].getValue(), tVar);
                                        i2 |= 4;
                                    } else {
                                        throw new k(g10);
                                    }
                                } else {
                                    i10 = a10.n(eVar, 1);
                                    i2 |= 2;
                                }
                            } else {
                                num = (Integer) a10.r(eVar, 0, l0.f10328a, num);
                                i2 |= 1;
                            }
                        } else {
                            z10 = false;
                        }
                    }
                    a10.b(eVar);
                    return new a(i2, num, i10, tVar);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // nd.d0
                public final jd.a[] b() {
                    f[] fVarArr = a.f9640e;
                    l0 l0Var = l0.f10328a;
                    return new jd.a[]{a.a.C(l0Var), l0Var, fVarArr[2].getValue()};
                }

                @Override // jd.a
                public final void d(md.d dVar, Object obj) {
                    a aVar = (a) obj;
                    aVar.getClass();
                    e eVar = descriptor;
                    md.b a10 = dVar.a(eVar);
                    f[] fVarArr = a.f9640e;
                    a10.g(eVar, 0, l0.f10328a, aVar.f9641b);
                    ij.a aVar2 = (ij.a) a10;
                    aVar2.H(1, aVar.f9642c, eVar);
                    aVar2.J(eVar, 2, (jd.a) fVarArr[2].getValue(), aVar.f9643d);
                    a10.b(eVar);
                }

                @Override // jd.a
                public final e e() {
                    return descriptor;
                }
            }

            /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
            /* renamed from: mf.b$b$a$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0014b {
                public final jd.a serializer() {
                    return C0013a.f9644a;
                }
            }

            public /* synthetic */ a(int i2, Integer num, int i10, t tVar) {
                if (7 == (i2 & 7)) {
                    this.f9641b = num;
                    this.f9642c = i10;
                    this.f9643d = tVar;
                    return;
                }
                a1.j(i2, 7, C0013a.f9644a.e());
                throw null;
            }

            public a(Integer num, int i2, t tVar) {
                tVar.getClass();
                this.f9641b = num;
                this.f9642c = i2;
                this.f9643d = tVar;
            }
        }
    }

    public b(s sVar, AbstractC0012b abstractC0012b, AbstractC0012b abstractC0012b2) {
        sVar.getClass();
        abstractC0012b.getClass();
        abstractC0012b2.getClass();
        this.f9635a = sVar;
        this.f9636b = abstractC0012b;
        this.f9637c = abstractC0012b2;
    }
}
