package xa;

import java.lang.reflect.Type;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o extends ua.u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14502a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14503b;

    /* renamed from: c  reason: collision with root package name */
    public final ua.u f14504c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f14505d;

    public o(ua.h hVar, ua.u uVar, Type type) {
        this.f14503b = hVar;
        this.f14504c = uVar;
        this.f14505d = type;
    }

    @Override // ua.u
    public final Object b(cb.a aVar) {
        switch (this.f14502a) {
            case 0:
                cb.b d02 = aVar.d0();
                if (d02 == cb.b.NULL) {
                    aVar.Z();
                    return null;
                }
                Map map = (Map) ((wa.p) this.f14505d).d();
                if (d02 == cb.b.BEGIN_ARRAY) {
                    aVar.d();
                    while (aVar.F()) {
                        aVar.d();
                        Object b10 = ((o) this.f14503b).f14504c.b(aVar);
                        if (map.put(b10, ((o) this.f14504c).f14504c.b(aVar)) == null) {
                            aVar.v();
                        } else {
                            throw new RuntimeException("duplicate key: " + b10);
                        }
                    }
                    aVar.v();
                } else {
                    aVar.i();
                    while (aVar.F()) {
                        x8.e.L.getClass();
                        int i2 = aVar.f2801c0;
                        if (i2 == 0) {
                            i2 = aVar.t();
                        }
                        if (i2 == 13) {
                            aVar.f2801c0 = 9;
                        } else if (i2 == 12) {
                            aVar.f2801c0 = 8;
                        } else if (i2 == 14) {
                            aVar.f2801c0 = 10;
                        } else {
                            throw aVar.m0("a name");
                        }
                        Object b11 = ((o) this.f14503b).f14504c.b(aVar);
                        if (map.put(b11, ((o) this.f14504c).f14504c.b(aVar)) != null) {
                            throw new RuntimeException("duplicate key: " + b11);
                        }
                    }
                    aVar.w();
                }
                return map;
            default:
                return this.f14504c.b(aVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
        if ((r1 instanceof xa.v) == false) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.reflect.Type] */
    @Override // ua.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(cb.c r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.f14502a
            switch(r0) {
                case 0: goto L4a;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f14505d
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            if (r6 == 0) goto L18
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto L13
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L18
        L13:
            java.lang.Class r1 = r6.getClass()
            goto L19
        L18:
            r1 = r0
        L19:
            ua.u r2 = r4.f14504c
            if (r1 == r0) goto L46
            java.lang.Object r0 = r4.f14503b
            ua.h r0 = (ua.h) r0
            bb.a r3 = new bb.a
            r3.<init>(r1)
            ua.u r0 = r0.c(r3)
            boolean r1 = r0 instanceof xa.v
            if (r1 != 0) goto L2f
            goto L45
        L2f:
            r1 = r2
        L30:
            boolean r3 = r1 instanceof xa.a0
            if (r3 == 0) goto L40
            r3 = r1
            xa.a0 r3 = (xa.a0) r3
            ua.u r3 = r3.d()
            if (r3 != r1) goto L3e
            goto L40
        L3e:
            r1 = r3
            goto L30
        L40:
            boolean r1 = r1 instanceof xa.v
            if (r1 != 0) goto L45
            goto L46
        L45:
            r2 = r0
        L46:
            r2.c(r5, r6)
            return
        L4a:
            java.util.Map r6 = (java.util.Map) r6
            ua.u r0 = r4.f14504c
            xa.o r0 = (xa.o) r0
            if (r6 != 0) goto L56
            r5.F()
            goto L83
        L56:
            r5.m()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L61:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L80
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r5.z(r2)
            java.lang.Object r1 = r1.getValue()
            r0.c(r5, r1)
            goto L61
        L80:
            r5.w()
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.o.c(cb.c, java.lang.Object):void");
    }

    public o(d dVar, o oVar, o oVar2, wa.p pVar) {
        this.f14503b = oVar;
        this.f14504c = oVar2;
        this.f14505d = pVar;
    }
}
