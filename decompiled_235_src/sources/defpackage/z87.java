package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z87  reason: default package */
/* loaded from: classes.dex */
public final class z87 extends ng4 {
    public final v80 f;
    public ap6 g;

    public z87(m86 m86Var, yv0 yv0Var, qh1 qh1Var) {
        super(m86Var, yv0Var, qh1Var);
        this.f = nb3.c(Integer.MAX_VALUE, null, null, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b8, code lost:
        if (r16.b(r0, r7) == r8) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00df, code lost:
        if (r0.o(r3, r7) != r8) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e1, code lost:
        return r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Type inference failed for: r3v4, types: [dh5, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(z87 z87Var, m86 m86Var, x87 x87Var, s41 s41Var) {
        y87 y87Var;
        int i;
        z87Var.getClass();
        yc1 yc1Var = z87Var.e;
        if (s41Var instanceof y87) {
            y87Var = (y87) s41Var;
            int i2 = y87Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y87Var.Y = i2 - Integer.MIN_VALUE;
                y87 y87Var2 = y87Var;
                Object obj = y87Var2.R;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = y87Var2.Y;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj);
                            return jg7.a;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    ?? obj3 = new Object();
                    obj3.A = x87Var;
                    long j = x87Var.b;
                    long j2 = x87Var.a;
                    ((rl7) yc1Var.A).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
                    ((rl7) yc1Var.B).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
                    x87 e = e(z87Var.f);
                    if (e != null) {
                        long j3 = e.b;
                        long j4 = e.a;
                        ((rl7) yc1Var.A).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                        ((rl7) yc1Var.B).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                        obj3.A = ((x87) obj3.A).a(e);
                    }
                    eo2 jiVar = new ji(z87Var, m86Var, obj3, null, 16);
                    y87Var2.Y = 1;
                }
                eo2 eo2Var = z87Var.b;
                ol7 ol7Var = new ol7(qo2.k(((rl7) yc1Var.A).b(Float.MAX_VALUE), ((rl7) yc1Var.B).b(Float.MAX_VALUE)));
                y87Var2.Y = 2;
            }
        }
        y87Var = new y87(z87Var, s41Var);
        y87 y87Var22 = y87Var;
        Object obj4 = y87Var22.R;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = y87Var22.Y;
        if (i == 0) {
        }
        eo2 eo2Var2 = z87Var.b;
        ol7 ol7Var2 = new ol7(qo2.k(((rl7) yc1Var.A).b(Float.MAX_VALUE), ((rl7) yc1Var.B).b(Float.MAX_VALUE)));
        y87Var22.Y = 2;
    }

    public static x87 e(v80 v80Var) {
        x87 x87Var = null;
        rb6 C = qo2.C(new tj2(new h84(v80Var, 1), null, 2));
        while (C.hasNext()) {
            x87 x87Var2 = (x87) C.next();
            if (x87Var != null) {
                x87Var2 = x87Var.a(x87Var2);
            }
            x87Var = x87Var2;
        }
        return x87Var;
    }

    public final boolean d(oy4 oy4Var) {
        boolean z;
        boolean z2;
        boolean z3;
        v80 v80Var;
        m86 m86Var;
        boolean z4;
        boolean z5;
        boolean z6;
        vy4 vy4Var = (vy4) gt0.J0(oy4Var.a);
        if (vy4Var != null) {
            List b = vy4Var.b();
            int size = b.size();
            int i = 0;
            z3 = false;
            while (true) {
                v80Var = this.f;
                m86Var = this.a;
                if (i >= size) {
                    break;
                }
                vx2 vx2Var = (vx2) b.get(i);
                long j = vx2Var.d ^ (-9223372034707292160L);
                if (m86Var.i(m86Var.e(j)) == RecyclerView.B1) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!z6) {
                    if ((v80Var.c(new x87(j, vx2Var.a, false)) instanceof fm0) && !z3) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = vy4Var.l ^ (-9223372034707292160L);
            if (oy4Var.f == 12) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (m86Var.i(m86Var.e(j2)) == RecyclerView.B1) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5 || z4) {
                if (!(v80Var.c(new x87(j2, vy4Var.b, z4)) instanceof fm0) || z3) {
                    z3 = true;
                }
            }
            if (z3 && !this.d) {
                return z2;
            }
            return z;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
        return z;
    }
}
