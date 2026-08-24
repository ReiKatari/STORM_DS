package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r84  reason: default package */
/* loaded from: classes.dex */
public final class r84 implements e34 {
    public final ig2 a;

    public r84(ig2 ig2Var) {
        this.a = ig2Var;
    }

    @Override // defpackage.e34
    public final int a(eb3 eb3Var, List list, int i) {
        x24 x24Var;
        ArrayList G = uj2.G(eb3Var);
        ig2 ig2Var = this.a;
        gg2 gg2Var = ig2Var.f;
        List list2 = (List) gt0.K0(1, G);
        x24 x24Var2 = null;
        if (list2 != null) {
            x24Var = (x24) gt0.J0(list2);
        } else {
            x24Var = null;
        }
        List list3 = (List) gt0.K0(2, G);
        if (list3 != null) {
            x24Var2 = (x24) gt0.J0(list3);
        }
        gg2Var.b(x24Var, x24Var2, s21.b(0, 0, 0, i, 7));
        List list4 = (List) gt0.J0(G);
        if (list4 == null) {
            list4 = yt1.A;
        }
        int r0 = eb3Var.r0(ig2Var.c);
        int size = list4.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < size) {
            int u = ((x24) list4.get(i2)).u(i) + r0;
            int i6 = i2 + 1;
            if (i6 - i4 != Integer.MAX_VALUE && i6 != list4.size()) {
                i5 += u;
            } else {
                i3 = Math.max(i3, (i5 + u) - r0);
                i4 = i2;
                i5 = 0;
            }
            i2 = i6;
        }
        return i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x036b A[LOOP:1: B:104:0x0369->B:105:0x036b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0214 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0320  */
    @Override // defpackage.e34
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f34 d(g34 g34Var, List list, long j) {
        x24 x24Var;
        x24 x24Var2;
        x24 x24Var3;
        long j2;
        dx4 dx4Var;
        d93 d93Var;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        q94 q94Var;
        ag2 ag2Var;
        zf2 b;
        zf2 zf2Var;
        yf2 yf2Var;
        yf2 yf2Var2;
        dx4 dx4Var2;
        x24 x24Var4;
        int i;
        zf2 zf2Var2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int size;
        int i8;
        int i9;
        int i10;
        int i11;
        int r0;
        int i12;
        int g;
        int j3;
        int h;
        char c;
        x24 x24Var5;
        long j4;
        dx4 dx4Var3;
        d93 d93Var2;
        Integer num5;
        dx4 dx4Var4;
        d93 d93Var3;
        zf2 b2;
        zf2 zf2Var3;
        boolean z;
        Integer num6;
        long a;
        boolean z2;
        long a2;
        dx4 dx4Var5;
        ArrayList G = uj2.G(g34Var);
        final ig2 ig2Var = this.a;
        final gg2 gg2Var = ig2Var.f;
        boolean isEmpty = G.isEmpty();
        zt1 zt1Var = zt1.A;
        if (!isEmpty && (q21.g(j) != 0 || gg2Var.a == cg2.Visible)) {
            List list2 = (List) gt0.H0(G);
            if (list2.isEmpty()) {
                return g34Var.K(0, 0, zt1Var, new bz1(22));
            }
            List list3 = (List) gt0.K0(1, G);
            if (list3 != null) {
                x24Var = (x24) gt0.J0(list3);
            } else {
                x24Var = null;
            }
            List list4 = (List) gt0.K0(2, G);
            if (list4 != null) {
                x24Var2 = (x24) gt0.J0(list4);
            } else {
                x24Var2 = null;
            }
            list2.size();
            gg2Var.getClass();
            hn3 hn3Var = hn3.Horizontal;
            long R = qo2.R(qo2.r(10, qo2.q(j, hn3Var)), hn3Var);
            if (x24Var != null) {
                wv7.d(x24Var, ig2Var, R, new qn2() { // from class: eg2
                    @Override // defpackage.qn2
                    public final Object g(Object obj) {
                        int i13;
                        int i14;
                        int i15 = r3;
                        jg7 jg7Var = jg7.a;
                        int i16 = 0;
                        ig2 ig2Var2 = ig2Var;
                        gg2 gg2Var2 = gg2Var;
                        dx4 dx4Var6 = (dx4) obj;
                        switch (i15) {
                            case 0:
                                if (dx4Var6 != null) {
                                    ig2Var2.getClass();
                                    i16 = dx4Var6.d0();
                                    i13 = dx4Var6.Z();
                                } else {
                                    i13 = 0;
                                }
                                gg2Var2.f = new d93(d93.a(i16, i13));
                                gg2Var2.c = dx4Var6;
                                return jg7Var;
                            default:
                                if (dx4Var6 != null) {
                                    ig2Var2.getClass();
                                    i16 = dx4Var6.d0();
                                    i14 = dx4Var6.Z();
                                } else {
                                    i14 = 0;
                                }
                                gg2Var2.g = new d93(d93.a(i16, i14));
                                gg2Var2.e = dx4Var6;
                                return jg7Var;
                        }
                    }
                });
                gg2Var.b = x24Var;
            }
            if (x24Var2 != null) {
                wv7.d(x24Var2, ig2Var, R, new qn2() { // from class: eg2
                    @Override // defpackage.qn2
                    public final Object g(Object obj) {
                        int i13;
                        int i14;
                        int i15 = r3;
                        jg7 jg7Var = jg7.a;
                        int i16 = 0;
                        ig2 ig2Var2 = ig2Var;
                        gg2 gg2Var2 = gg2Var;
                        dx4 dx4Var6 = (dx4) obj;
                        switch (i15) {
                            case 0:
                                if (dx4Var6 != null) {
                                    ig2Var2.getClass();
                                    i16 = dx4Var6.d0();
                                    i13 = dx4Var6.Z();
                                } else {
                                    i13 = 0;
                                }
                                gg2Var2.f = new d93(d93.a(i16, i13));
                                gg2Var2.c = dx4Var6;
                                return jg7Var;
                            default:
                                if (dx4Var6 != null) {
                                    ig2Var2.getClass();
                                    i16 = dx4Var6.d0();
                                    i14 = dx4Var6.Z();
                                } else {
                                    i14 = 0;
                                }
                                gg2Var2.g = new d93(d93.a(i16, i14));
                                gg2Var2.e = dx4Var6;
                                return jg7Var;
                        }
                    }
                });
                gg2Var.d = x24Var2;
            }
            Iterator it = list2.iterator();
            float f = ig2Var.c;
            float f2 = ig2Var.e;
            long q = qo2.q(j, hn3Var);
            gg2 gg2Var2 = ig2Var.f;
            ua4 ua4Var = new ua4(new f34[16]);
            int h2 = q21.h(q);
            int j5 = q21.j(q);
            int g2 = q21.g(q);
            p94 p94Var = h93.a;
            p94 p94Var2 = new p94();
            ArrayList arrayList = new ArrayList();
            int ceil = (int) Math.ceil(g34Var.e0(f));
            int ceil2 = (int) Math.ceil(g34Var.e0(f2));
            long a3 = s21.a(0, h2, 0, g2);
            long R2 = qo2.R(qo2.r(14, a3), hn3Var);
            if (it.hasNext()) {
                try {
                    x24Var3 = (x24) it.next();
                } catch (IndexOutOfBoundsException unused) {
                }
                if (x24Var3 == null) {
                    if (jx2.v(jx2.t(x24Var3)) == RecyclerView.B1) {
                        jx2.t(x24Var3);
                        dx4Var5 = x24Var3.y(R2);
                        j2 = a3;
                        a2 = d93.a(dx4Var5.d0(), dx4Var5.Z());
                    } else {
                        j2 = a3;
                        int n = x24Var3.n(Integer.MAX_VALUE);
                        a2 = d93.a(n, x24Var3.V(n));
                        dx4Var5 = null;
                    }
                    d93Var = new d93(a2);
                    dx4Var = dx4Var5;
                } else {
                    j2 = a3;
                    dx4Var = null;
                    d93Var = null;
                }
                if (d93Var == null) {
                    num = Integer.valueOf((int) (d93Var.a >> 32));
                } else {
                    num = null;
                }
                dx4 dx4Var6 = dx4Var;
                num2 = num;
                if (d93Var == null) {
                    num3 = Integer.valueOf((int) (d93Var.a & 4294967295L));
                } else {
                    num3 = null;
                }
                o94 o94Var = new o94();
                d93 d93Var4 = d93Var;
                o94 o94Var2 = new o94();
                num4 = num3;
                q94Var = new q94();
                ag2Var = new ag2(gg2Var2, q, ceil, ceil2);
                b = ag2Var.b(it.hasNext(), 0, d93.a(h2, g2), d93Var4, 0, 0, 0, false, false);
                if (!b.B) {
                    if (d93Var4 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zf2Var = b;
                    yf2Var = ag2Var.a(zf2Var, z2, -1, 0, h2, 0);
                } else {
                    zf2Var = b;
                    yf2Var = null;
                }
                x24 x24Var6 = x24Var3;
                yf2Var2 = yf2Var;
                dx4Var2 = dx4Var6;
                x24Var4 = x24Var6;
                i = h2;
                int i13 = j5;
                zf2Var2 = zf2Var;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                i7 = 0;
                while (!zf2Var2.B && x24Var4 != null) {
                    num2.getClass();
                    int intValue = num2.intValue();
                    num4.getClass();
                    q94 q94Var2 = q94Var;
                    int i14 = i4 + intValue;
                    int max = Math.max(i2, num4.intValue());
                    int i15 = i - intValue;
                    int i16 = i3 + 1;
                    gg2Var2.getClass();
                    arrayList.add(x24Var4);
                    p94Var2.i(i3, dx4Var2);
                    x24Var4.B();
                    int i17 = i16 - i5;
                    if (it.hasNext()) {
                        x24Var4 = null;
                    } else {
                        try {
                            x24Var5 = (x24) it.next();
                        } catch (IndexOutOfBoundsException unused2) {
                            x24Var5 = null;
                        }
                        x24Var4 = x24Var5;
                    }
                    if (x24Var4 == null) {
                        if (jx2.v(jx2.t(x24Var4)) == RecyclerView.B1) {
                            jx2.t(x24Var4);
                            dx4 y = x24Var4.y(R2);
                            a = d93.a(y.d0(), y.Z());
                            dx4Var3 = y;
                        } else {
                            int n2 = x24Var4.n(Integer.MAX_VALUE);
                            a = d93.a(n2, x24Var4.V(n2));
                            dx4Var3 = null;
                        }
                        j4 = R2;
                        d93Var2 = new d93(a);
                    } else {
                        j4 = R2;
                        dx4Var3 = null;
                        d93Var2 = null;
                    }
                    if (d93Var2 == null) {
                        num5 = Integer.valueOf(((int) (d93Var2.a >> 32)) + ceil);
                    } else {
                        num5 = null;
                    }
                    Integer num7 = num5;
                    if (d93Var2 == null) {
                        num4 = Integer.valueOf((int) (d93Var2.a & 4294967295L));
                    } else {
                        num4 = null;
                    }
                    boolean hasNext = it.hasNext();
                    long a4 = d93.a(i15, g2);
                    if (d93Var2 != null) {
                        dx4Var4 = dx4Var3;
                        d93Var3 = null;
                    } else {
                        num7.getClass();
                        int intValue2 = num7.intValue();
                        num4.getClass();
                        dx4Var4 = dx4Var3;
                        d93Var3 = new d93(d93.a(intValue2, num4.intValue()));
                    }
                    b2 = ag2Var.b(hasNext, i17, a4, d93Var3, i6, i7, max, false, false);
                    int i18 = max;
                    if (!b2.A) {
                        int min = Math.min(Math.max(i13, i14), h2);
                        int i19 = i7 + i18;
                        if (d93Var2 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        zf2Var3 = b2;
                        int i20 = i6;
                        yf2 a5 = ag2Var.a(zf2Var3, z, i20, i19, i15, i17);
                        o94Var2.a(i18);
                        g2 = (g2 - i19) - ceil2;
                        o94Var.a(i16);
                        if (num7 != null) {
                            num6 = Integer.valueOf(num7.intValue() - ceil);
                        } else {
                            num6 = null;
                        }
                        i6 = i20 + 1;
                        int i21 = i19 + ceil2;
                        i13 = min;
                        yf2Var2 = a5;
                        num2 = num6;
                        i5 = i16;
                        i = h2;
                        i7 = i21;
                        i14 = 0;
                        i18 = 0;
                    } else {
                        zf2Var3 = b2;
                        i = i15;
                        num2 = num7;
                    }
                    i3 = i16;
                    i2 = i18;
                    zf2Var2 = zf2Var3;
                    R2 = j4;
                    dx4Var2 = dx4Var4;
                    i4 = i14;
                    q94Var = q94Var2;
                }
                q94 q94Var3 = q94Var;
                if (yf2Var2 != null) {
                    long j6 = yf2Var2.c;
                    arrayList.add(yf2Var2.a);
                    p94Var2.i(arrayList.size() - 1, yf2Var2.b);
                    int i22 = o94Var.b - 1;
                    if (yf2Var2.d) {
                        o94Var2.f(i22, Math.max(o94Var2.c(i22), (int) (j6 & 4294967295L)));
                        o94Var.f(i22, o94Var.d() + 1);
                    } else {
                        o94Var2.a((int) (j6 & 4294967295L));
                        o94Var.a(o94Var.d() + 1);
                    }
                }
                size = arrayList.size();
                dx4[] dx4VarArr = new dx4[size];
                for (i8 = 0; i8 < size; i8++) {
                    dx4VarArr[i8] = p94Var2.b(i8);
                }
                i9 = o94Var.b;
                int[] iArr = new int[i9];
                int[] iArr2 = new int[i9];
                int[] iArr3 = o94Var.a;
                int i23 = i13;
                int i24 = 0;
                i10 = 0;
                int i25 = 0;
                while (i10 < i9) {
                    int i26 = iArr3[i10];
                    int c2 = o94Var2.c(i10);
                    q94 q94Var4 = q94Var3;
                    if (q94Var4.c(i10)) {
                        c = 65535;
                    } else {
                        c = 65535;
                        if (q21.g(j2) == Integer.MAX_VALUE) {
                            c2 = Integer.MAX_VALUE;
                        } else {
                            c2 = q21.g(j2) - i25;
                        }
                    }
                    q94Var3 = q94Var4;
                    f34 C = yh2.C(ig2Var, i23, q21.i(j2), q21.h(j2), c2, ceil, g34Var, arrayList, dx4VarArr, i24, i26, iArr, i10);
                    int width = C.getWidth();
                    int height = C.getHeight();
                    iArr2[i10] = height;
                    i25 += height;
                    i23 = Math.max(i23, width);
                    ua4Var.b(C);
                    i10++;
                    i24 = i26;
                    iArr3 = iArr3;
                    o94Var2 = o94Var2;
                }
                if (ua4Var.L != 0) {
                    i11 = 0;
                    i25 = 0;
                } else {
                    i11 = i23;
                }
                iu iuVar = ig2Var.b;
                r0 = ((ua4Var.L - 1) * g34Var.r0(iuVar.a())) + i25;
                i12 = q21.i(q);
                g = q21.g(q);
                if (r0 < i12) {
                    r0 = i12;
                }
                if (r0 <= g) {
                    g = r0;
                }
                iuVar.g(g34Var, g, iArr2, iArr);
                j3 = q21.j(q);
                h = q21.h(q);
                if (i11 < j3) {
                    i11 = j3;
                }
                if (i11 <= h) {
                    h = i11;
                }
                return g34Var.K(h, g, zt1Var, new bg2(ua4Var, 0));
            }
            x24Var3 = null;
            if (x24Var3 == null) {
            }
            if (d93Var == null) {
            }
            dx4 dx4Var62 = dx4Var;
            num2 = num;
            if (d93Var == null) {
            }
            o94 o94Var3 = new o94();
            d93 d93Var42 = d93Var;
            o94 o94Var22 = new o94();
            num4 = num3;
            q94Var = new q94();
            ag2Var = new ag2(gg2Var2, q, ceil, ceil2);
            b = ag2Var.b(it.hasNext(), 0, d93.a(h2, g2), d93Var42, 0, 0, 0, false, false);
            if (!b.B) {
            }
            x24 x24Var62 = x24Var3;
            yf2Var2 = yf2Var;
            dx4Var2 = dx4Var62;
            x24Var4 = x24Var62;
            i = h2;
            int i132 = j5;
            zf2Var2 = zf2Var;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            while (!zf2Var2.B) {
                num2.getClass();
                int intValue3 = num2.intValue();
                num4.getClass();
                q94 q94Var22 = q94Var;
                int i142 = i4 + intValue3;
                int max2 = Math.max(i2, num4.intValue());
                int i152 = i - intValue3;
                int i162 = i3 + 1;
                gg2Var2.getClass();
                arrayList.add(x24Var4);
                p94Var2.i(i3, dx4Var2);
                x24Var4.B();
                int i172 = i162 - i5;
                if (it.hasNext()) {
                }
                if (x24Var4 == null) {
                }
                if (d93Var2 == null) {
                }
                Integer num72 = num5;
                if (d93Var2 == null) {
                }
                boolean hasNext2 = it.hasNext();
                long a42 = d93.a(i152, g2);
                if (d93Var2 != null) {
                }
                b2 = ag2Var.b(hasNext2, i172, a42, d93Var3, i6, i7, max2, false, false);
                int i182 = max2;
                if (!b2.A) {
                }
                i3 = i162;
                i2 = i182;
                zf2Var2 = zf2Var3;
                R2 = j4;
                dx4Var2 = dx4Var4;
                i4 = i142;
                q94Var = q94Var22;
            }
            q94 q94Var32 = q94Var;
            if (yf2Var2 != null) {
            }
            size = arrayList.size();
            dx4[] dx4VarArr2 = new dx4[size];
            while (i8 < size) {
            }
            i9 = o94Var3.b;
            int[] iArr4 = new int[i9];
            int[] iArr22 = new int[i9];
            int[] iArr32 = o94Var3.a;
            int i232 = i132;
            int i242 = 0;
            i10 = 0;
            int i252 = 0;
            while (i10 < i9) {
            }
            if (ua4Var.L != 0) {
            }
            iu iuVar2 = ig2Var.b;
            r0 = ((ua4Var.L - 1) * g34Var.r0(iuVar2.a())) + i252;
            i12 = q21.i(q);
            g = q21.g(q);
            if (r0 < i12) {
            }
            if (r0 <= g) {
            }
            iuVar2.g(g34Var, g, iArr22, iArr4);
            j3 = q21.j(q);
            h = q21.h(q);
            if (i11 < j3) {
            }
            if (i11 <= h) {
            }
            return g34Var.K(h, g, zt1Var, new bg2(ua4Var, 0));
        }
        return g34Var.K(0, 0, zt1Var, new bz1(22));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
        if (r13.a == defpackage.cg2.ExpandOrCollapseIndicator) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0262 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x024d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4 A[LOOP:1: B:33:0x00b2->B:34:0x00b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    @Override // defpackage.e34
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(eb3 eb3Var, List list, int i) {
        x24 x24Var;
        x24 x24Var2;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int[] iArr;
        d93 d93Var;
        List list2;
        int i6;
        boolean z2;
        int i7;
        long a;
        boolean z3;
        d93 d93Var2;
        boolean z4;
        boolean z5;
        int i8;
        int i9;
        cg2 cg2Var;
        ArrayList G = uj2.G(eb3Var);
        ig2 ig2Var = this.a;
        gg2 gg2Var = ig2Var.f;
        int i10 = 1;
        List list3 = (List) gt0.K0(1, G);
        if (list3 != null) {
            x24Var = (x24) gt0.J0(list3);
        } else {
            x24Var = null;
        }
        int i11 = 2;
        List list4 = (List) gt0.K0(2, G);
        if (list4 != null) {
            x24Var2 = (x24) gt0.J0(list4);
        } else {
            x24Var2 = null;
        }
        int i12 = 0;
        gg2Var.b(x24Var, x24Var2, s21.b(0, 0, 0, i, 7));
        List list5 = (List) gt0.J0(G);
        if (list5 == null) {
            list5 = yt1.A;
        }
        int r0 = eb3Var.r0(ig2Var.c);
        int r02 = eb3Var.r0(ig2Var.e);
        gg2 gg2Var2 = ig2Var.f;
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr2 = new int[size];
        int size2 = list5.size();
        int[] iArr3 = new int[size2];
        int size3 = list5.size();
        for (int i13 = 0; i13 < size3; i13++) {
            x24 x24Var3 = (x24) list5.get(i13);
            int n = x24Var3.n(i);
            iArr2[i13] = n;
            iArr3[i13] = x24Var3.V(n);
        }
        int i14 = Integer.MAX_VALUE;
        if (Integer.MAX_VALUE >= list5.size() || ((cg2Var = gg2Var2.a) != cg2.ExpandIndicator && cg2Var != cg2.ExpandOrCollapseIndicator)) {
            if (Integer.MAX_VALUE >= list5.size()) {
                gg2Var2.getClass();
            }
            i2 = 0;
            int min = Math.min(Integer.MAX_VALUE - i2, list5.size());
            int i15 = 0;
            for (i3 = 0; i3 < size; i3++) {
                i15 += iArr2[i3];
            }
            int size4 = ((list5.size() - 1) * r0) + i15;
            if (size2 == 0) {
                int i16 = iArr3[0];
                int i17 = size2 - 1;
                if (1 <= i17) {
                    int i18 = 1;
                    while (true) {
                        int i19 = iArr3[i18];
                        if (i16 < i19) {
                            i16 = i19;
                        }
                        if (i18 == i17) {
                            break;
                        }
                        i18++;
                    }
                }
                if (size != 0) {
                    int i20 = iArr2[0];
                    int i21 = size - 1;
                    if (1 <= i21) {
                        int i22 = 1;
                        while (true) {
                            int i23 = iArr2[i22];
                            if (i20 < i23) {
                                i20 = i23;
                            }
                            if (i22 == i21) {
                                break;
                            }
                            i22++;
                        }
                    }
                    int i24 = size4;
                    while (i20 <= i24 && i16 != i) {
                        int i25 = (i20 + i24) / i11;
                        if (list5.isEmpty()) {
                            a = d93.a(i12, i12);
                            list2 = list5;
                            iArr = iArr3;
                        } else {
                            ag2 ag2Var = new ag2(gg2Var2, s21.a(i12, i25, i12, i14), r0, r02);
                            x24 x24Var4 = (x24) gt0.K0(i12, list5);
                            if (x24Var4 != null) {
                                i4 = iArr3[i12];
                            } else {
                                i4 = i12;
                            }
                            if (x24Var4 != null) {
                                i5 = iArr2[i12];
                            } else {
                                i5 = i12;
                            }
                            if (list5.size() > i10) {
                                z = i10;
                            } else {
                                z = i12;
                            }
                            long a2 = d93.a(i25, i14);
                            iArr = iArr3;
                            if (x24Var4 == null) {
                                d93Var = null;
                            } else {
                                d93Var = new d93(d93.a(i5, i4));
                            }
                            int i26 = 0;
                            if (ag2Var.b(z, 0, a2, d93Var, 0, 0, 0, false, false).B) {
                                if (x24Var4 != null) {
                                    z5 = 1;
                                } else {
                                    z5 = i12;
                                }
                                d93 a3 = gg2Var2.a(i12, z5, i12);
                                if (a3 != null) {
                                    i8 = (int) (a3.a & 4294967295L);
                                } else {
                                    i8 = i12;
                                }
                                a = d93.a(i8, i12);
                                list2 = list5;
                            } else {
                                int size5 = list5.size();
                                int i27 = i25;
                                int i28 = i12;
                                int i29 = i28;
                                int i30 = i29;
                                int i31 = 0;
                                int i32 = 0;
                                while (true) {
                                    if (i28 < size5) {
                                        i27 -= i5;
                                        i7 = i28 + 1;
                                        int max = Math.max(i32, i4);
                                        x24 x24Var5 = (x24) gt0.K0(i7, list5);
                                        if (x24Var5 != null) {
                                            i4 = iArr[i7];
                                        } else {
                                            i4 = i12;
                                        }
                                        if (x24Var5 != null) {
                                            z2 = i12;
                                            i12 = iArr2[i7] + r0;
                                        } else {
                                            z2 = i12;
                                        }
                                        if (i28 + 2 < list5.size()) {
                                            z3 = true;
                                        } else {
                                            z3 = z2;
                                        }
                                        int i33 = i7 - i30;
                                        int i34 = i31;
                                        long a4 = d93.a(i27, Integer.MAX_VALUE);
                                        if (x24Var5 == null) {
                                            list2 = list5;
                                            i6 = min;
                                            d93Var2 = null;
                                        } else {
                                            i6 = min;
                                            list2 = list5;
                                            d93Var2 = new d93(d93.a(i12, i4));
                                        }
                                        zf2 b = ag2Var.b(z3, i33, a4, d93Var2, i34, i26, max, false, false);
                                        if (b.A) {
                                            int i35 = max + r02 + i26;
                                            if (x24Var5 != null) {
                                                z4 = true;
                                            } else {
                                                z4 = z2;
                                            }
                                            yf2 a5 = ag2Var.a(b, z4, i34, i35, i27, i33);
                                            i12 -= r0;
                                            i31 = i34 + 1;
                                            if (b.B) {
                                                if (a5 != null) {
                                                    long j = a5.c;
                                                    if (!a5.d) {
                                                        i35 = ((int) (j & 4294967295L)) + r02 + i35;
                                                    }
                                                }
                                                i26 = i35;
                                            } else {
                                                i27 = i25;
                                                i30 = i7;
                                                i26 = i35;
                                                i32 = z2;
                                            }
                                        } else {
                                            i31 = i34;
                                            i32 = max;
                                        }
                                        min = i6;
                                        i28 = i7;
                                        i29 = i28;
                                        list5 = list2;
                                        i5 = i12;
                                        i12 = z2;
                                    } else {
                                        list2 = list5;
                                        i6 = min;
                                        z2 = i12;
                                        i7 = i29;
                                        break;
                                    }
                                }
                                a = d93.a(i26 - r02, i7);
                                i9 = (int) (a >> 32);
                                int i36 = (int) (a & 4294967295L);
                                if (i9 > i && i36 >= i6) {
                                    if (i9 >= i) {
                                        return i25;
                                    }
                                    i24 = i25 - 1;
                                } else {
                                    i20 = i25 + 1;
                                    if (i20 <= i24) {
                                        return i20;
                                    }
                                }
                                iArr3 = iArr;
                                i16 = i9;
                                size4 = i25;
                                min = i6;
                                i12 = z2;
                                list5 = list2;
                                i10 = 1;
                                i11 = 2;
                                i14 = Integer.MAX_VALUE;
                            }
                        }
                        i6 = min;
                        z2 = i12;
                        i9 = (int) (a >> 32);
                        int i362 = (int) (a & 4294967295L);
                        if (i9 > i) {
                        }
                        i20 = i25 + 1;
                        if (i20 <= i24) {
                        }
                    }
                    return size4;
                }
                fa6.c();
                return 0;
            }
            fa6.c();
            return 0;
        }
        i2 = 1;
        int min2 = Math.min(Integer.MAX_VALUE - i2, list5.size());
        int i152 = 0;
        while (i3 < size) {
        }
        int size42 = ((list5.size() - 1) * r0) + i152;
        if (size2 == 0) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof r84) && nb3.k(this.a, ((r84) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e34
    public final int g(eb3 eb3Var, List list, int i) {
        x24 x24Var;
        ArrayList G = uj2.G(eb3Var);
        ig2 ig2Var = this.a;
        gg2 gg2Var = ig2Var.f;
        List list2 = (List) gt0.K0(1, G);
        x24 x24Var2 = null;
        if (list2 != null) {
            x24Var = (x24) gt0.J0(list2);
        } else {
            x24Var = null;
        }
        List list3 = (List) gt0.K0(2, G);
        if (list3 != null) {
            x24Var2 = (x24) gt0.J0(list3);
        }
        gg2Var.b(x24Var, x24Var2, s21.b(0, i, 0, 0, 13));
        List list4 = (List) gt0.J0(G);
        if (list4 == null) {
            list4 = yt1.A;
        }
        return ig2.a(list4, i, eb3Var.r0(ig2Var.c), eb3Var.r0(ig2Var.e), ig2Var.f);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.e34
    public final int i(eb3 eb3Var, List list, int i) {
        x24 x24Var;
        ArrayList G = uj2.G(eb3Var);
        ig2 ig2Var = this.a;
        gg2 gg2Var = ig2Var.f;
        List list2 = (List) gt0.K0(1, G);
        x24 x24Var2 = null;
        if (list2 != null) {
            x24Var = (x24) gt0.J0(list2);
        } else {
            x24Var = null;
        }
        List list3 = (List) gt0.K0(2, G);
        if (list3 != null) {
            x24Var2 = (x24) gt0.J0(list3);
        }
        gg2Var.b(x24Var, x24Var2, s21.b(0, i, 0, 0, 13));
        List list4 = (List) gt0.J0(G);
        if (list4 == null) {
            list4 = yt1.A;
        }
        return ig2.a(list4, i, eb3Var.r0(ig2Var.c), eb3Var.r0(ig2Var.e), ig2Var.f);
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ')';
    }
}
