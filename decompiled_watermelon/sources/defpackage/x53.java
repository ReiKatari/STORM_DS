package defpackage;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x53  reason: default package */
/* loaded from: classes.dex */
public final class x53 extends dz6 {
    public final /* synthetic */ int a;
    public final Object b;
    public final dz6 c;
    public final Object d;

    public x53(sq0 sq0Var, x53 x53Var, x53 x53Var2, y84 y84Var) {
        this.a = 1;
        this.b = x53Var;
        this.c = x53Var2;
        this.d = y84Var;
    }

    @Override // defpackage.dz6
    public final Object b(o83 o83Var) {
        ZonedDateTime ofInstant;
        LocalDateTime localDateTime = null;
        Map map = null;
        switch (this.a) {
            case 0:
                o83Var.i();
                ZoneOffset zoneOffset = null;
                ZoneId zoneId = null;
                while (o83Var.n0() != q83.END_OBJECT) {
                    String Z = o83Var.Z();
                    Z.getClass();
                    char c = 65535;
                    switch (Z.hashCode()) {
                        case -1019779949:
                            if (Z.equals("offset")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 3744684:
                            if (Z.equals("zone")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1792749467:
                            if (Z.equals("dateTime")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            zoneOffset = f72.v(this.c.b(o83Var));
                            break;
                        case 1:
                            zoneId = f72.s(((dz6) this.d).b(o83Var));
                            break;
                        case 2:
                            localDateTime = f72.n(((cz6) this.b).b(o83Var));
                            break;
                        default:
                            o83Var.u0();
                            break;
                    }
                }
                o83Var.B();
                v53.a(localDateTime, "dateTime", o83Var);
                LocalDateTime B = f72.B(localDateTime);
                v53.a(zoneOffset, "offset", o83Var);
                ZoneOffset o = w53.o(zoneOffset);
                v53.a(zoneId, "zone", o83Var);
                ofInstant = ZonedDateTime.ofInstant(B, o, w53.m(zoneId));
                return ofInstant;
            case 1:
                q83 n0 = o83Var.n0();
                if (n0 == q83.NULL) {
                    o83Var.j0();
                } else {
                    map = (Map) ((y84) this.d).d();
                    if (n0 == q83.BEGIN_ARRAY) {
                        o83Var.d();
                        while (o83Var.J()) {
                            o83Var.d();
                            Object b = ((x53) this.b).c.b(o83Var);
                            Object b2 = ((x53) this.c).c.b(o83Var);
                            if (!map.containsKey(b)) {
                                map.put(b, b2);
                                o83Var.x();
                            } else {
                                throw new RuntimeException("duplicate key: " + b);
                            }
                        }
                        o83Var.x();
                    } else {
                        o83Var.i();
                        while (o83Var.J()) {
                            jo1.B.getClass();
                            if (o83Var instanceof y83) {
                                y83 y83Var = (y83) o83Var;
                                y83Var.y0(q83.NAME);
                                Map.Entry entry = (Map.Entry) ((Iterator) y83Var.C0()).next();
                                y83Var.E0(entry.getValue());
                                y83Var.E0(new l83((String) entry.getKey()));
                            } else {
                                int i = o83Var.d0;
                                if (i == 0) {
                                    i = o83Var.w();
                                }
                                if (i == 13) {
                                    o83Var.d0 = 9;
                                } else if (i == 12) {
                                    o83Var.d0 = 8;
                                } else if (i == 14) {
                                    o83Var.d0 = 10;
                                } else {
                                    throw o83Var.w0("a name");
                                }
                            }
                            Object b3 = ((x53) this.b).c.b(o83Var);
                            Object b4 = ((x53) this.c).c.b(o83Var);
                            if (!map.containsKey(b3)) {
                                map.put(b3, b4);
                            } else {
                                throw new RuntimeException("duplicate key: " + b3);
                            }
                        }
                        o83Var.B();
                    }
                }
                return map;
            default:
                return this.c.b(o83Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
        if ((r1 instanceof defpackage.b85) == false) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.reflect.Type] */
    @Override // defpackage.dz6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.b93 r4, java.lang.Object r5) {
        /*
            r3 = this;
            int r0 = r3.a
            java.lang.Object r1 = r3.b
            java.lang.Object r2 = r3.d
            dz6 r3 = r3.c
            switch(r0) {
                case 0: goto L83;
                case 1: goto L4a;
                default: goto Lb;
            }
        Lb:
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            if (r5 == 0) goto L1c
            boolean r0 = r2 instanceof java.lang.Class
            if (r0 != 0) goto L17
            boolean r0 = r2 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L1c
        L17:
            java.lang.Class r0 = r5.getClass()
            goto L1d
        L1c:
            r0 = r2
        L1d:
            if (r0 == r2) goto L46
            qo2 r1 = (defpackage.qo2) r1
            n07 r2 = new n07
            r2.<init>(r0)
            dz6 r0 = r1.d(r2)
            boolean r1 = r0 instanceof defpackage.b85
            if (r1 != 0) goto L2f
            goto L45
        L2f:
            r1 = r3
        L30:
            boolean r2 = r1 instanceof defpackage.p06
            if (r2 == 0) goto L40
            r2 = r1
            p06 r2 = (defpackage.p06) r2
            dz6 r2 = r2.d()
            if (r2 != r1) goto L3e
            goto L40
        L3e:
            r1 = r2
            goto L30
        L40:
            boolean r1 = r1 instanceof defpackage.b85
            if (r1 != 0) goto L45
            goto L46
        L45:
            r3 = r0
        L46:
            r3.c(r4, r5)
            return
        L4a:
            java.util.Map r5 = (java.util.Map) r5
            if (r5 != 0) goto L52
            r4.F()
            goto L82
        L52:
            r4.p()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L5d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r4.C(r1)
            r1 = r3
            x53 r1 = (defpackage.x53) r1
            java.lang.Object r0 = r0.getValue()
            r1.c(r4, r0)
            goto L5d
        L7f:
            r4.B()
        L82:
            return
        L83:
            java.time.ZonedDateTime r5 = defpackage.w53.q(r5)
            if (r5 != 0) goto L8d
            r4.F()
            goto Lbb
        L8d:
            r4.p()
            java.lang.String r0 = "dateTime"
            r4.C(r0)
            cz6 r1 = (defpackage.cz6) r1
            java.time.LocalDateTime r0 = defpackage.w53.j(r5)
            r1.c(r4, r0)
            java.lang.String r0 = "offset"
            r4.C(r0)
            java.time.ZoneOffset r0 = defpackage.w53.p(r5)
            r3.c(r4, r0)
            java.lang.String r3 = "zone"
            r4.C(r3)
            dz6 r2 = (defpackage.dz6) r2
            java.time.ZoneId r3 = defpackage.w53.n(r5)
            r2.c(r4, r3)
            r4.B()
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x53.c(b93, java.lang.Object):void");
    }

    public /* synthetic */ x53(Object obj, dz6 dz6Var, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = dz6Var;
        this.d = obj2;
    }
}
