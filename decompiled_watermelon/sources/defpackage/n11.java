package defpackage;

import defpackage.h03;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: n11  reason: default package */
/* loaded from: classes.dex */
public final class n11 {
    public static final b Companion = new Object();
    public static final gh3[] c = {yf2.H(wk3.PUBLICATION, new d5(24)), null};
    public final List a;
    public final c b;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    @zd1
    /* renamed from: n11$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements kl2 {
        public static final a a;
        private static final h06 descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [kl2, java.lang.Object, n11$a] */
        static {
            ?? obj = new Object();
            a = obj;
            hp4 hp4Var = new hp4("me.magnum.melonds.impl.dtos.input.ControllerConfigurationDto", obj, 2);
            hp4Var.l("inputMapper", false);
            hp4Var.l("slot2AnalogMapping", true);
            descriptor = hp4Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.kl2
        public final m93[] a() {
            return new m93[]{n11.c[0].getValue(), c.a.a};
        }

        @Override // defpackage.m93
        public final Object b(b91 b91Var) {
            h06 h06Var = descriptor;
            yu0 c = b91Var.c(h06Var);
            gh3[] gh3VarArr = n11.c;
            c.getClass();
            List list = null;
            boolean z = true;
            int i = 0;
            c cVar = null;
            while (z) {
                int v = c.v(h06Var);
                if (v != -1) {
                    if (v != 0) {
                        if (v == 1) {
                            cVar = (c) c.U(h06Var, 1, c.a.a, cVar);
                            i |= 2;
                        } else {
                            throw new q27(v);
                        }
                    } else {
                        list = (List) c.U(h06Var, 0, (m93) gh3VarArr[0].getValue(), list);
                        i |= 1;
                    }
                } else {
                    z = false;
                }
            }
            c.a(h06Var);
            return new n11(i, list, cVar);
        }

        @Override // defpackage.m93
        public final void d(mz1 mz1Var, Object obj) {
            n11 n11Var = (n11) obj;
            n11Var.getClass();
            h06 h06Var = descriptor;
            zu0 c = mz1Var.c(h06Var);
            List list = n11Var.a;
            c cVar = n11Var.b;
            c.F(h06Var, 0, (m93) n11.c[0].getValue(), list);
            if (c.k(h06Var) || !b53.x(cVar, new c())) {
                c.F(h06Var, 1, c.a.a, cVar);
            }
            c.a(h06Var);
        }

        @Override // defpackage.m93
        public final h06 e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: n11$b */
    /* loaded from: classes.dex */
    public static final class b {
        public static n11 a(m11 m11Var) {
            h03.b aVar;
            h03.b bVar;
            h03.b aVar2;
            h03.b bVar2;
            m11Var.getClass();
            ArrayList arrayList = m11Var.b;
            ArrayList arrayList2 = new ArrayList(uq0.y0(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                f03 f03Var = (f03) obj;
                h03.Companion.getClass();
                f03Var.getClass();
                e03 e03Var = f03Var.c;
                yz2 yz2Var = f03Var.a;
                e03 e03Var2 = f03Var.b;
                if (e03Var2 instanceof d03) {
                    bVar = h03.b.d.INSTANCE;
                } else {
                    if (e03Var2 instanceof c03) {
                        c03 c03Var = (c03) e03Var2;
                        aVar = new h03.b.c(c03Var.b, c03Var.a);
                    } else if (e03Var2 instanceof b03) {
                        b03 b03Var = (b03) e03Var2;
                        aVar = new h03.b.a(b03Var.a, b03Var.b, b03Var.c);
                    } else {
                        i.c();
                        return null;
                    }
                    bVar = aVar;
                }
                if (e03Var instanceof d03) {
                    bVar2 = h03.b.d.INSTANCE;
                } else {
                    if (e03Var instanceof c03) {
                        c03 c03Var2 = (c03) e03Var;
                        aVar2 = new h03.b.c(c03Var2.b, c03Var2.a);
                    } else if (e03Var instanceof b03) {
                        b03 b03Var2 = (b03) e03Var;
                        aVar2 = new h03.b.a(b03Var2.a, b03Var2.b, b03Var2.c);
                    } else {
                        i.c();
                        return null;
                    }
                    bVar2 = aVar2;
                }
                arrayList2.add(new h03(yz2Var, bVar, bVar2));
            }
            c.b bVar3 = c.Companion;
            u86 u86Var = m11Var.a;
            bVar3.getClass();
            u86Var.getClass();
            return new n11(arrayList2, new c(u86Var.a, Boolean.valueOf(u86Var.b), u86Var.c, u86Var.d, u86Var.e, u86Var.f, u86Var.g));
        }

        public final m93 serializer() {
            return a.a;
        }
    }

    public /* synthetic */ n11(int i, List list, c cVar) {
        if (1 == (i & 1)) {
            this.a = list;
            if ((i & 2) == 0) {
                this.b = new c();
                return;
            } else {
                this.b = cVar;
                return;
            }
        }
        ep2.H(i, 1, a.a.e());
        throw null;
    }

    public final m11 a() {
        boolean z;
        e03 b03Var;
        List<h03> list = this.a;
        ArrayList arrayList = new ArrayList(uq0.y0(list, 10));
        for (h03 h03Var : list) {
            yz2 yz2Var = h03Var.a;
            h03.b bVar = h03Var.b;
            boolean z2 = bVar instanceof h03.b.d;
            e03 e03Var = d03.a;
            if (z2) {
                b03Var = e03Var;
            } else if (bVar instanceof h03.b.c) {
                h03.b.c cVar = (h03.b.c) bVar;
                b03Var = new c03(cVar.b, cVar.a);
            } else if (bVar instanceof h03.b.a) {
                h03.b.a aVar = (h03.b.a) bVar;
                b03Var = new b03(aVar.a, aVar.b, aVar.c);
            } else {
                i.c();
                return null;
            }
            h03.b bVar2 = h03Var.c;
            if (!(bVar2 instanceof h03.b.d)) {
                if (bVar2 instanceof h03.b.c) {
                    h03.b.c cVar2 = (h03.b.c) bVar2;
                    e03Var = new c03(cVar2.b, cVar2.a);
                } else if (bVar2 instanceof h03.b.a) {
                    h03.b.a aVar2 = (h03.b.a) bVar2;
                    e03Var = new b03(aVar2.a, aVar2.b, aVar2.c);
                } else {
                    i.c();
                    return null;
                }
            }
            arrayList.add(new f03(yz2Var, b03Var, e03Var));
        }
        c cVar3 = this.b;
        Integer num = cVar3.a;
        Boolean bool = cVar3.b;
        if (bool != null) {
            z = bool.booleanValue();
        } else if (num != null) {
            z = true;
        } else {
            z = false;
        }
        return new m11(arrayList, new u86(num, z, cVar3.c, cVar3.d, cVar3.e, cVar3.f, cVar3.g));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n11)) {
            return false;
        }
        n11 n11Var = (n11) obj;
        if (b53.x(this.a, n11Var.a) && b53.x(this.b, n11Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ControllerConfigurationDto(inputMapper=" + this.a + ", slot2AnalogMapping=" + this.b + ")";
    }

    public n11(List list, c cVar) {
        this.a = list;
        this.b = cVar;
    }

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    @n06
    /* renamed from: n11$c */
    /* loaded from: classes.dex */
    public static final class c {
        public static final b Companion = new Object();
        public final Integer a;
        public final Boolean b;
        public final int c;
        public final int d;
        public final boolean e;
        public final boolean f;
        public final float g;

        /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
        @zd1
        /* renamed from: n11$c$a */
        /* loaded from: classes.dex */
        public static final /* synthetic */ class a implements kl2 {
            public static final a a;
            private static final h06 descriptor;

            /* JADX WARN: Type inference failed for: r0v0, types: [kl2, n11$c$a, java.lang.Object] */
            static {
                ?? obj = new Object();
                a = obj;
                hp4 hp4Var = new hp4("me.magnum.melonds.impl.dtos.input.ControllerConfigurationDto.Slot2AnalogMappingDto", obj, 7);
                hp4Var.l("deviceId", true);
                hp4Var.l("useDeviceFilter", true);
                hp4Var.l("axisXCode", true);
                hp4Var.l("axisYCode", true);
                hp4Var.l("invertX", true);
                hp4Var.l("invertY", true);
                hp4Var.l("deadzone", true);
                descriptor = hp4Var;
            }

            @Override // defpackage.kl2
            public final m93[] a() {
                g33 g33Var = g33.a;
                m93 R = l07.R(g33Var);
                w30 w30Var = w30.a;
                return new m93[]{R, l07.R(w30Var), g33Var, g33Var, w30Var, w30Var, j92.a};
            }

            @Override // defpackage.m93
            public final Object b(b91 b91Var) {
                h06 h06Var = descriptor;
                yu0 c = b91Var.c(h06Var);
                c.getClass();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                boolean z = false;
                boolean z2 = false;
                Integer num = null;
                Boolean bool = null;
                float f = 0.0f;
                boolean z3 = true;
                while (z3) {
                    int v = c.v(h06Var);
                    switch (v) {
                        case -1:
                            z3 = false;
                            break;
                        case 0:
                            num = (Integer) c.u(h06Var, 0, g33.a, num);
                            i |= 1;
                            break;
                        case 1:
                            bool = (Boolean) c.u(h06Var, 1, w30.a, bool);
                            i |= 2;
                            break;
                        case 2:
                            i2 = c.V(h06Var, 2);
                            i |= 4;
                            break;
                        case 3:
                            i3 = c.V(h06Var, 3);
                            i |= 8;
                            break;
                        case 4:
                            z = c.O(h06Var, 4);
                            i |= 16;
                            break;
                        case 5:
                            z2 = c.O(h06Var, 5);
                            i |= 32;
                            break;
                        case ig7.b /* 6 */:
                            f = c.t(h06Var, 6);
                            i |= 64;
                            break;
                        default:
                            throw new q27(v);
                    }
                }
                c.a(h06Var);
                return new c(i, num, bool, i2, i3, z, z2, f);
            }

            @Override // defpackage.m93
            public final void d(mz1 mz1Var, Object obj) {
                c cVar = (c) obj;
                cVar.getClass();
                float f = cVar.g;
                boolean z = cVar.f;
                boolean z2 = cVar.e;
                int i = cVar.d;
                int i2 = cVar.c;
                Boolean bool = cVar.b;
                Integer num = cVar.a;
                h06 h06Var = descriptor;
                zu0 c = mz1Var.c(h06Var);
                if (c.k(h06Var) || num != null) {
                    c.N(h06Var, 0, g33.a, num);
                }
                if (c.k(h06Var) || bool != null) {
                    c.N(h06Var, 1, w30.a, bool);
                }
                if (c.k(h06Var) || i2 != 0) {
                    c.q(2, i2, h06Var);
                }
                if (c.k(h06Var) || i != 1) {
                    c.q(3, i, h06Var);
                }
                if (c.k(h06Var) || z2) {
                    c.A(h06Var, 4, z2);
                }
                if (c.k(h06Var) || z) {
                    c.A(h06Var, 5, z);
                }
                if (c.k(h06Var) || Float.compare(f, 0.1f) != 0) {
                    c.e0(h06Var, 6, f);
                }
                c.a(h06Var);
            }

            @Override // defpackage.m93
            public final h06 e() {
                return descriptor;
            }
        }

        /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
        /* renamed from: n11$c$b */
        /* loaded from: classes.dex */
        public static final class b {
            public final m93 serializer() {
                return a.a;
            }
        }

        public /* synthetic */ c(int i, Integer num, Boolean bool, int i2, int i3, boolean z, boolean z2, float f) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = num;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = bool;
            }
            if ((i & 4) == 0) {
                this.c = 0;
            } else {
                this.c = i2;
            }
            if ((i & 8) == 0) {
                this.d = 1;
            } else {
                this.d = i3;
            }
            if ((i & 16) == 0) {
                this.e = false;
            } else {
                this.e = z;
            }
            if ((i & 32) == 0) {
                this.f = false;
            } else {
                this.f = z2;
            }
            if ((i & 64) == 0) {
                this.g = 0.1f;
            } else {
                this.g = f;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (b53.x(this.a, cVar.a) && b53.x(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && Float.compare(this.g, cVar.g) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int i = 0;
            Integer num = this.a;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            int i2 = hashCode * 31;
            Boolean bool = this.b;
            if (bool != null) {
                i = bool.hashCode();
            }
            return Float.hashCode(this.g) + ej6.c(ej6.c(wh1.a(this.d, wh1.a(this.c, (i2 + i) * 31, 31), 31), this.e, 31), this.f, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Slot2AnalogMappingDto(deviceId=");
            sb.append(this.a);
            sb.append(", useDeviceFilter=");
            sb.append(this.b);
            sb.append(", axisXCode=");
            b31.A(sb, this.c, ", axisYCode=", this.d, ", invertX=");
            sb.append(this.e);
            sb.append(", invertY=");
            sb.append(this.f);
            sb.append(", deadzone=");
            sb.append(this.g);
            sb.append(")");
            return sb.toString();
        }

        public c(Integer num, Boolean bool, int i, int i2, boolean z, boolean z2, float f) {
            this.a = num;
            this.b = bool;
            this.c = i;
            this.d = i2;
            this.e = z;
            this.f = z2;
            this.g = f;
        }

        public /* synthetic */ c() {
            this(null, null, 0, 1, false, false, 0.1f);
        }
    }
}
