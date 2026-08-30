package od;

import a6.m0;
import java.util.Iterator;
import nd.g1;
import nd.h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t implements jd.a {

    /* renamed from: a  reason: collision with root package name */
    public static final t f10901a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final g1 f10902b;

    /* JADX WARN: Type inference failed for: r0v0, types: [od.t, java.lang.Object] */
    static {
        jd.a aVar;
        ld.d dVar = ld.d.f9029w;
        if (!vc.h.j0("kotlinx.serialization.json.JsonLiteral")) {
            Iterator it = ((ac.g) h1.f10313a.values()).iterator();
            while (((m0) it).hasNext()) {
                if ("kotlinx.serialization.json.JsonLiteral".equals(((jd.a) ((ac.c) it).next()).e().b())) {
                    a0.j.h(vc.i.J("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + nc.u.a(aVar.getClass()).c() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
                    return;
                }
            }
            f10902b = new g1("kotlinx.serialization.json.JsonLiteral", dVar);
            return;
        }
        a0.j.h("Blank serial names are prohibited");
    }

    @Override // jd.a
    public final Object a(md.c cVar) {
        l s10 = k0.d.k(cVar).s();
        if (s10 instanceof s) {
            return (s) s10;
        }
        throw pd.t.e(-1, "Unexpected JSON element, expected JsonLiteral, had " + nc.u.a(s10.getClass()), s10.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // jd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(md.d r4, java.lang.Object r5) {
        /*
            r3 = this;
            od.s r5 = (od.s) r5
            r5.getClass()
            java.lang.String r0 = r5.B
            k0.d.i(r4)
            boolean r5 = r5.A
            if (r5 == 0) goto L12
            r4.r(r0)
            return
        L12:
            java.lang.Long r5 = vc.o.X(r0)
            if (r5 == 0) goto L20
            long r0 = r5.longValue()
            r4.p(r0)
            return
        L20:
            yb.t r5 = p7.n.A(r0)
            if (r5 == 0) goto L32
            long r0 = r5.A
            nd.g0 r5 = nd.y1.f10395b
            md.d r4 = r4.d(r5)
            r4.p(r0)
            return
        L32:
            r5 = 0
            boolean r1 = vc.n.L(r0)     // Catch: java.lang.NumberFormatException -> L42
            if (r1 == 0) goto L42
            double r1 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.NumberFormatException -> L42
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L42
            goto L43
        L42:
            r1 = r5
        L43:
            if (r1 == 0) goto L4d
            double r0 = r1.doubleValue()
            r4.i(r0)
            goto L6f
        L4d:
            java.lang.String r1 = "true"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L58
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L62
        L58:
            java.lang.String r1 = "false"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L62
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
        L62:
            if (r5 == 0) goto L6c
            boolean r5 = r5.booleanValue()
            r4.l(r5)
            goto L6f
        L6c:
            r4.r(r0)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: od.t.d(md.d, java.lang.Object):void");
    }

    @Override // jd.a
    public final ld.e e() {
        return f10902b;
    }
}
