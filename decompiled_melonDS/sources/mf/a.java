package mf;

import g2.v3;
import java.util.ArrayList;
import java.util.List;
import jd.g;
import jd.k;
import ld.e;
import m9.o;
import md.d;
import mf.b;
import nd.a1;
import nd.c1;
import nd.d0;
import oe.j;
import oe.s;
import oe.u;
import oe.v;
import oe.w;
import oe.x;
import oe.y;
import yb.c;
import yb.f;
import yb.h;
import zb.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@g
/* loaded from: classes.dex */
public final class a {
    public static final b Companion = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final f[] f9631b = {p7.a.s(h.PUBLICATION, new v3(19))};

    /* renamed from: a  reason: collision with root package name */
    public final List f9632a;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    @c
    /* renamed from: mf.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class C0011a implements d0 {

        /* renamed from: a  reason: collision with root package name */
        public static final C0011a f9633a;
        private static final e descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [nd.d0, java.lang.Object, mf.a$a] */
        static {
            ?? obj = new Object();
            f9633a = obj;
            c1 c1Var = new c1("me.magnum.melonds.impl.dtos.input.ControllerConfigurationDto", obj, 1);
            c1Var.l("inputMapper", false);
            descriptor = c1Var;
        }

        @Override // jd.a
        public final Object a(md.c cVar) {
            e eVar = descriptor;
            md.a a10 = cVar.a(eVar);
            f[] fVarArr = a.f9631b;
            List list = null;
            boolean z10 = true;
            int i2 = 0;
            while (z10) {
                int g10 = a10.g(eVar);
                if (g10 != -1) {
                    if (g10 == 0) {
                        list = (List) a10.o(eVar, 0, (jd.a) fVarArr[0].getValue(), list);
                        i2 = 1;
                    } else {
                        throw new k(g10);
                    }
                } else {
                    z10 = false;
                }
            }
            a10.b(eVar);
            return new a(i2, list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // nd.d0
        public final jd.a[] b() {
            return new jd.a[]{a.f9631b[0].getValue()};
        }

        @Override // jd.a
        public final void d(d dVar, Object obj) {
            a aVar = (a) obj;
            aVar.getClass();
            e eVar = descriptor;
            md.b a10 = dVar.a(eVar);
            ((ij.a) a10).J(eVar, 0, (jd.a) a.f9631b[0].getValue(), aVar.f9632a);
            a10.b(eVar);
        }

        @Override // jd.a
        public final e e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final class b {
        public static a a(j jVar) {
            b.AbstractC0012b aVar;
            b.AbstractC0012b abstractC0012b;
            b.AbstractC0012b aVar2;
            b.AbstractC0012b abstractC0012b2;
            ArrayList arrayList = jVar.f10941a;
            ArrayList arrayList2 = new ArrayList(m.G(arrayList, 10));
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                y yVar = (y) obj;
                mf.b.Companion.getClass();
                yVar.getClass();
                x xVar = yVar.f10964c;
                s sVar = yVar.f10962a;
                x xVar2 = yVar.f10963b;
                if (xVar2 instanceof w) {
                    abstractC0012b = b.AbstractC0012b.d.INSTANCE;
                } else {
                    if (xVar2 instanceof v) {
                        v vVar = (v) xVar2;
                        aVar = new b.AbstractC0012b.c(vVar.f10960b, vVar.f10959a);
                    } else if (xVar2 instanceof u) {
                        u uVar = (u) xVar2;
                        aVar = new b.AbstractC0012b.a(uVar.f10956a, uVar.f10957b, uVar.f10958c);
                    } else {
                        o.o();
                        return null;
                    }
                    abstractC0012b = aVar;
                }
                if (xVar instanceof w) {
                    abstractC0012b2 = b.AbstractC0012b.d.INSTANCE;
                } else {
                    if (xVar instanceof v) {
                        v vVar2 = (v) xVar;
                        aVar2 = new b.AbstractC0012b.c(vVar2.f10960b, vVar2.f10959a);
                    } else if (xVar instanceof u) {
                        u uVar2 = (u) xVar;
                        aVar2 = new b.AbstractC0012b.a(uVar2.f10956a, uVar2.f10957b, uVar2.f10958c);
                    } else {
                        o.o();
                        return null;
                    }
                    abstractC0012b2 = aVar2;
                }
                arrayList2.add(new mf.b(sVar, abstractC0012b, abstractC0012b2));
            }
            return new a(arrayList2);
        }

        public final jd.a serializer() {
            return C0011a.f9633a;
        }
    }

    public /* synthetic */ a(int i2, List list) {
        if (1 == (i2 & 1)) {
            this.f9632a = list;
        } else {
            a1.j(i2, 1, C0011a.f9633a.e());
            throw null;
        }
    }

    public final j a() {
        x uVar;
        List<mf.b> list = this.f9632a;
        ArrayList arrayList = new ArrayList(m.G(list, 10));
        for (mf.b bVar : list) {
            s sVar = bVar.f9635a;
            b.AbstractC0012b abstractC0012b = bVar.f9636b;
            boolean z10 = abstractC0012b instanceof b.AbstractC0012b.d;
            x xVar = w.f10961a;
            if (z10) {
                uVar = xVar;
            } else if (abstractC0012b instanceof b.AbstractC0012b.c) {
                b.AbstractC0012b.c cVar = (b.AbstractC0012b.c) abstractC0012b;
                uVar = new v(cVar.f9646c, cVar.f9645b);
            } else if (abstractC0012b instanceof b.AbstractC0012b.a) {
                b.AbstractC0012b.a aVar = (b.AbstractC0012b.a) abstractC0012b;
                uVar = new u(aVar.f9641b, aVar.f9642c, aVar.f9643d);
            } else {
                o.o();
                return null;
            }
            b.AbstractC0012b abstractC0012b2 = bVar.f9637c;
            if (!(abstractC0012b2 instanceof b.AbstractC0012b.d)) {
                if (abstractC0012b2 instanceof b.AbstractC0012b.c) {
                    b.AbstractC0012b.c cVar2 = (b.AbstractC0012b.c) abstractC0012b2;
                    xVar = new v(cVar2.f9646c, cVar2.f9645b);
                } else if (abstractC0012b2 instanceof b.AbstractC0012b.a) {
                    b.AbstractC0012b.a aVar2 = (b.AbstractC0012b.a) abstractC0012b2;
                    xVar = new u(aVar2.f9641b, aVar2.f9642c, aVar2.f9643d);
                } else {
                    o.o();
                    return null;
                }
            }
            arrayList.add(new y(sVar, uVar, xVar));
        }
        return new j(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && nc.k.a(this.f9632a, ((a) obj).f9632a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9632a.hashCode();
    }

    public final String toString() {
        return "ControllerConfigurationDto(inputMapper=" + this.f9632a + ")";
    }

    public a(ArrayList arrayList) {
        this.f9632a = arrayList;
    }
}
