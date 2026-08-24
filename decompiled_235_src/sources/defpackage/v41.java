package defpackage;

import defpackage.k63;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: v41  reason: default package */
/* loaded from: classes.dex */
public final class v41 {
    public static final b Companion = new Object();
    public static final go3[] c = {kj2.M(xr3.PUBLICATION, new c5(24)), null};
    public final List a;
    public final c b;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @di1
    /* renamed from: v41$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements qr2 {
        public static final a a;
        private static final wb6 descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [qr2, v41$a, java.lang.Object] */
        static {
            ?? obj = new Object();
            a = obj;
            ly4 ly4Var = new ly4("me.magnum.melonds.impl.dtos.input.ControllerConfigurationDto", obj, 2);
            ly4Var.l("inputMapper", false);
            ly4Var.l("slot2AnalogMapping", true);
            descriptor = ly4Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.qr2
        public final gg3[] b() {
            return new gg3[]{v41.c[0].getValue(), c.a.a};
        }

        @Override // defpackage.gg3
        public final Object c(sc1 sc1Var) {
            wb6 wb6Var = descriptor;
            ux0 c = sc1Var.c(wb6Var);
            go3[] go3VarArr = v41.c;
            c.getClass();
            List list = null;
            boolean z = true;
            int i = 0;
            c cVar = null;
            while (z) {
                int q = c.q(wb6Var);
                if (q != -1) {
                    if (q != 0) {
                        if (q == 1) {
                            cVar = (c) c.G(wb6Var, 1, c.a.a, cVar);
                            i |= 2;
                        } else {
                            throw new lg7(q);
                        }
                    } else {
                        list = (List) c.G(wb6Var, 0, (gg3) go3VarArr[0].getValue(), list);
                        i |= 1;
                    }
                } else {
                    z = false;
                }
            }
            c.a(wb6Var);
            return new v41(i, list, cVar);
        }

        @Override // defpackage.gg3
        public final void d(x32 x32Var, Object obj) {
            v41 v41Var = (v41) obj;
            v41Var.getClass();
            wb6 wb6Var = descriptor;
            vx0 c = x32Var.c(wb6Var);
            List list = v41Var.a;
            c cVar = v41Var.b;
            c.w(wb6Var, 0, (gg3) v41.c[0].getValue(), list);
            if (c.i(wb6Var) || !nb3.k(cVar, new c())) {
                c.w(wb6Var, 1, c.a.a, cVar);
            }
            c.a(wb6Var);
        }

        @Override // defpackage.gg3
        public final wb6 e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: v41$b */
    /* loaded from: classes.dex */
    public static final class b {
        public static v41 a(u41 u41Var) {
            k63.b aVar;
            k63.b bVar;
            k63.b aVar2;
            k63.b bVar2;
            u41Var.getClass();
            ArrayList arrayList = u41Var.b;
            ArrayList arrayList2 = new ArrayList(ht0.v0(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                i63 i63Var = (i63) obj;
                k63.Companion.getClass();
                i63Var.getClass();
                h63 h63Var = i63Var.c;
                b63 b63Var = i63Var.a;
                h63 h63Var2 = i63Var.b;
                if (h63Var2 instanceof g63) {
                    bVar = k63.b.d.INSTANCE;
                } else {
                    if (h63Var2 instanceof f63) {
                        f63 f63Var = (f63) h63Var2;
                        aVar = new k63.b.c(f63Var.b, f63Var.a);
                    } else if (h63Var2 instanceof e63) {
                        e63 e63Var = (e63) h63Var2;
                        aVar = new k63.b.a(e63Var.a, e63Var.b, e63Var.c);
                    } else {
                        i.d();
                        return null;
                    }
                    bVar = aVar;
                }
                if (h63Var instanceof g63) {
                    bVar2 = k63.b.d.INSTANCE;
                } else {
                    if (h63Var instanceof f63) {
                        f63 f63Var2 = (f63) h63Var;
                        aVar2 = new k63.b.c(f63Var2.b, f63Var2.a);
                    } else if (h63Var instanceof e63) {
                        e63 e63Var2 = (e63) h63Var;
                        aVar2 = new k63.b.a(e63Var2.a, e63Var2.b, e63Var2.c);
                    } else {
                        i.d();
                        return null;
                    }
                    bVar2 = aVar2;
                }
                arrayList2.add(new k63(b63Var, bVar, bVar2));
            }
            c.b bVar3 = c.Companion;
            kk6 kk6Var = u41Var.a;
            bVar3.getClass();
            kk6Var.getClass();
            return new v41(arrayList2, new c(kk6Var.a, Boolean.valueOf(kk6Var.b), kk6Var.c, kk6Var.d, kk6Var.e, kk6Var.f, kk6Var.g));
        }

        public final gg3 serializer() {
            return a.a;
        }
    }

    public /* synthetic */ v41(int i, List list, c cVar) {
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
        ii2.S(i, 1, a.a.e());
        throw null;
    }

    public final u41 a() {
        boolean z;
        h63 e63Var;
        List<k63> list = this.a;
        ArrayList arrayList = new ArrayList(ht0.v0(list, 10));
        for (k63 k63Var : list) {
            b63 b63Var = k63Var.a;
            k63.b bVar = k63Var.b;
            boolean z2 = bVar instanceof k63.b.d;
            h63 h63Var = g63.a;
            if (z2) {
                e63Var = h63Var;
            } else if (bVar instanceof k63.b.c) {
                k63.b.c cVar = (k63.b.c) bVar;
                e63Var = new f63(cVar.b, cVar.a);
            } else if (bVar instanceof k63.b.a) {
                k63.b.a aVar = (k63.b.a) bVar;
                e63Var = new e63(aVar.a, aVar.b, aVar.c);
            } else {
                i.d();
                return null;
            }
            k63.b bVar2 = k63Var.c;
            if (!(bVar2 instanceof k63.b.d)) {
                if (bVar2 instanceof k63.b.c) {
                    k63.b.c cVar2 = (k63.b.c) bVar2;
                    h63Var = new f63(cVar2.b, cVar2.a);
                } else if (bVar2 instanceof k63.b.a) {
                    k63.b.a aVar2 = (k63.b.a) bVar2;
                    h63Var = new e63(aVar2.a, aVar2.b, aVar2.c);
                } else {
                    i.d();
                    return null;
                }
            }
            arrayList.add(new i63(b63Var, e63Var, h63Var));
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
        return new u41(arrayList, new kk6(num, z, cVar3.c, cVar3.d, cVar3.e, cVar3.f, cVar3.g));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v41)) {
            return false;
        }
        v41 v41Var = (v41) obj;
        if (nb3.k(this.a, v41Var.a) && nb3.k(this.b, v41Var.b)) {
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

    public v41(List list, c cVar) {
        this.a = list;
        this.b = cVar;
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @cc6
    /* renamed from: v41$c */
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

        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
        @di1
        /* renamed from: v41$c$a */
        /* loaded from: classes.dex */
        public static final /* synthetic */ class a implements qr2 {
            public static final a a;
            private static final wb6 descriptor;

            /* JADX WARN: Type inference failed for: r0v0, types: [v41$c$a, qr2, java.lang.Object] */
            static {
                ?? obj = new Object();
                a = obj;
                ly4 ly4Var = new ly4("me.magnum.melonds.impl.dtos.input.ControllerConfigurationDto.Slot2AnalogMappingDto", obj, 7);
                ly4Var.l("deviceId", true);
                ly4Var.l("useDeviceFilter", true);
                ly4Var.l("axisXCode", true);
                ly4Var.l("axisYCode", true);
                ly4Var.l("invertX", true);
                ly4Var.l("invertY", true);
                ly4Var.l("deadzone", true);
                descriptor = ly4Var;
            }

            @Override // defpackage.qr2
            public final gg3[] b() {
                o93 o93Var = o93.a;
                gg3 I = q60.I(o93Var);
                u50 u50Var = u50.a;
                return new gg3[]{I, q60.I(u50Var), o93Var, o93Var, u50Var, u50Var, be2.a};
            }

            @Override // defpackage.gg3
            public final Object c(sc1 sc1Var) {
                wb6 wb6Var = descriptor;
                ux0 c = sc1Var.c(wb6Var);
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
                    int q = c.q(wb6Var);
                    switch (q) {
                        case -1:
                            z3 = false;
                            break;
                        case 0:
                            num = (Integer) c.P(wb6Var, 0, o93.a, num);
                            i |= 1;
                            break;
                        case 1:
                            bool = (Boolean) c.P(wb6Var, 1, u50.a, bool);
                            i |= 2;
                            break;
                        case 2:
                            i2 = c.H(wb6Var, 2);
                            i |= 4;
                            break;
                        case 3:
                            i3 = c.H(wb6Var, 3);
                            i |= 8;
                            break;
                        case 4:
                            z = c.W(wb6Var, 4);
                            i |= 16;
                            break;
                        case 5:
                            z2 = c.W(wb6Var, 5);
                            i |= 32;
                            break;
                        case 6:
                            f = c.p(wb6Var, 6);
                            i |= 64;
                            break;
                        default:
                            throw new lg7(q);
                    }
                }
                c.a(wb6Var);
                return new c(i, num, bool, i2, i3, z, z2, f);
            }

            @Override // defpackage.gg3
            public final void d(x32 x32Var, Object obj) {
                c cVar = (c) obj;
                cVar.getClass();
                float f = cVar.g;
                boolean z = cVar.f;
                boolean z2 = cVar.e;
                int i = cVar.d;
                int i2 = cVar.c;
                Boolean bool = cVar.b;
                Integer num = cVar.a;
                wb6 wb6Var = descriptor;
                vx0 c = x32Var.c(wb6Var);
                if (c.i(wb6Var) || num != null) {
                    c.V(wb6Var, 0, o93.a, num);
                }
                if (c.i(wb6Var) || bool != null) {
                    c.V(wb6Var, 1, u50.a, bool);
                }
                if (c.i(wb6Var) || i2 != 0) {
                    c.O(2, i2, wb6Var);
                }
                if (c.i(wb6Var) || i != 1) {
                    c.O(3, i, wb6Var);
                }
                if (c.i(wb6Var) || z2) {
                    c.u(wb6Var, 4, z2);
                }
                if (c.i(wb6Var) || z) {
                    c.u(wb6Var, 5, z);
                }
                if (c.i(wb6Var) || Float.compare(f, 0.1f) != 0) {
                    c.f0(wb6Var, 6, f);
                }
                c.a(wb6Var);
            }

            @Override // defpackage.gg3
            public final wb6 e() {
                return descriptor;
            }
        }

        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
        /* renamed from: v41$c$b */
        /* loaded from: classes.dex */
        public static final class b {
            public final gg3 serializer() {
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
            if (nb3.k(this.a, cVar.a) && nb3.k(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && Float.compare(this.g, cVar.g) == 0) {
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
            return Float.hashCode(this.g) + xg6.e(xg6.e(lb1.a(this.d, lb1.a(this.c, (i2 + i) * 31, 31), 31), this.e, 31), this.f, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Slot2AnalogMappingDto(deviceId=");
            sb.append(this.a);
            sb.append(", useDeviceFilter=");
            sb.append(this.b);
            sb.append(", axisXCode=");
            lb1.x(sb, this.c, ", axisYCode=", this.d, ", invertX=");
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
