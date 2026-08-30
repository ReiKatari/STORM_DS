package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wf  reason: default package */
/* loaded from: classes.dex */
public final class wf implements tv3 {
    public static final wf b = new wf(0);
    public static final wf c = new wf(1);
    public static final wf d = new wf(2);
    public static final wf e = new wf(3);
    public static final wf f = new wf(4);
    public static final wf g = new wf(5);
    public static final qu1 h = new qu1(11);
    public static final wf i = new wf(6);
    public static final wf j = new wf(7);
    public static final wf k = new wf(8);
    public static final wf l = new wf(9);
    public final /* synthetic */ int a;

    public /* synthetic */ wf(int i2) {
        this.a = i2;
    }

    @Override // defpackage.tv3
    public final uv3 f(vv3 vv3Var, List list, long j2) {
        boolean z;
        float f2;
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        int Y;
        int max;
        int i4;
        int i5 = this.a;
        qp1 qp1Var = qp1.A;
        switch (i5) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i6 = 0;
                int i7 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    yn4 c2 = ((mv3) list.get(i8)).c(j2);
                    i6 = Math.max(i6, c2.A);
                    i7 = Math.max(i7, c2.B);
                    arrayList.add(c2);
                }
                if (list.isEmpty()) {
                    i6 = lz0.j(j2);
                    i7 = lz0.i(j2);
                }
                return vv3Var.s0(i6, i7, qp1Var, new vf(0, arrayList));
            case 1:
                int size2 = list.size();
                if (size2 != 0) {
                    if (size2 != 1) {
                        ArrayList arrayList2 = new ArrayList(list.size());
                        int size3 = list.size();
                        int i9 = 0;
                        int i10 = 0;
                        for (int i11 = 0; i11 < size3; i11++) {
                            yn4 c3 = ((mv3) list.get(i11)).c(j2);
                            i9 = Math.max(i9, c3.A);
                            i10 = Math.max(i10, c3.B);
                            arrayList2.add(c3);
                        }
                        return vv3Var.s0(i9, i10, qp1Var, new vf(1, arrayList2));
                    }
                    yn4 c4 = ((mv3) list.get(0)).c(j2);
                    return vv3Var.s0(c4.A, c4.B, qp1Var, new sd(c4, 1));
                }
                return vv3Var.s0(0, 0, qp1Var, yd.f0);
            case 2:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size4 = list.size();
                for (int i12 = 0; i12 < size4; i12++) {
                    arrayList3.add(((mv3) list.get(i12)).c(j2));
                }
                return vv3Var.s0(lz0.h(j2), lz0.g(j2), qp1Var, new wo(0, arrayList3));
            case 3:
                return vv3Var.s0(lz0.j(j2), lz0.i(j2), qp1Var, new qu1(11));
            case 4:
                return vv3Var.s0(lz0.j(j2), lz0.i(j2), qp1Var, new qu1(11));
            case 5:
                return vv3Var.s0(lz0.h(j2), lz0.g(j2), qp1Var, h);
            case ig7.b /* 6 */:
                return vv3Var.s0(lz0.j(j2), lz0.i(j2), qp1Var, new qu1(11));
            case 7:
                ArrayList arrayList4 = new ArrayList(list.size());
                int size5 = list.size();
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < size5; i15++) {
                    yn4 c5 = ((mv3) list.get(i15)).c(j2);
                    i13 = Math.max(i13, c5.A);
                    i14 = Math.max(i14, c5.B);
                    arrayList4.add(c5);
                }
                return vv3Var.s0(i13, i14, qp1Var, new wo(3, arrayList4));
            case 8:
                ArrayList arrayList5 = new ArrayList(list.size());
                int size6 = list.size();
                int i16 = Integer.MIN_VALUE;
                int i17 = Integer.MIN_VALUE;
                int i18 = 0;
                for (int i19 = 0; i19 < size6; i19++) {
                    yn4 c6 = ((mv3) list.get(i19)).c(j2);
                    arrayList5.add(c6);
                    ds2 ds2Var = xb.a;
                    if (c6.j0(ds2Var) != Integer.MIN_VALUE && (i16 == Integer.MIN_VALUE || c6.j0(ds2Var) < i16)) {
                        i16 = c6.j0(ds2Var);
                    }
                    ds2 ds2Var2 = xb.b;
                    if (c6.j0(ds2Var2) != Integer.MIN_VALUE && (i17 == Integer.MIN_VALUE || c6.j0(ds2Var2) > i17)) {
                        i17 = c6.j0(ds2Var2);
                    }
                    i18 = Math.max(i18, c6.B);
                }
                if (i16 != Integer.MIN_VALUE && i17 != Integer.MIN_VALUE) {
                    z = true;
                } else {
                    z = false;
                }
                if (i16 != i17 && z) {
                    f2 = 68.0f;
                } else {
                    f2 = 48.0f;
                }
                int max2 = Math.max(vv3Var.Y(f2), i18);
                return vv3Var.s0(lz0.h(j2), max2, qp1Var, new hi3(max2, 2, arrayList5));
            case 9:
                if (lz0.f(j2)) {
                    i2 = lz0.h(j2);
                } else {
                    i2 = 0;
                }
                if (lz0.e(j2)) {
                    i3 = lz0.g(j2);
                } else {
                    i3 = 0;
                }
                return vv3Var.s0(i2, i3, qp1Var, new qu1(11));
            default:
                int size7 = list.size();
                int i20 = 0;
                while (true) {
                    if (i20 < size7) {
                        mv3 mv3Var = (mv3) list.get(i20);
                        if (b53.x(iq2.p(mv3Var), "action")) {
                            final yn4 c7 = mv3Var.c(j2);
                            int h2 = (lz0.h(j2) - c7.A) - vv3Var.Y(8.0f);
                            int j3 = lz0.j(j2);
                            if (h2 < j3) {
                                h2 = j3;
                            }
                            int size8 = list.size();
                            for (int i21 = 0; i21 < size8; i21++) {
                                mv3 mv3Var2 = (mv3) list.get(i21);
                                if (b53.x(iq2.p(mv3Var2), "text")) {
                                    final yn4 c8 = mv3Var2.c(lz0.a(j2, 0, h2, 0, 0, 9));
                                    ds2 ds2Var3 = xb.a;
                                    int j0 = c8.j0(ds2Var3);
                                    int j02 = c8.j0(xb.b);
                                    if (j0 != Integer.MIN_VALUE && j02 != Integer.MIN_VALUE) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (j0 != j02 && z2) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    final int h3 = lz0.h(j2) - c7.A;
                                    if (z3) {
                                        max = Math.max(vv3Var.Y(48.0f), c7.B);
                                        Y = (max - c8.B) / 2;
                                        int j03 = c7.j0(ds2Var3);
                                        if (j03 != Integer.MIN_VALUE) {
                                            i4 = (j0 + Y) - j03;
                                        } else {
                                            i4 = 0;
                                        }
                                    } else {
                                        Y = vv3Var.Y(30.0f) - j0;
                                        max = Math.max(vv3Var.Y(68.0f), c8.B + Y);
                                        i4 = (max - c7.B) / 2;
                                    }
                                    final int i22 = Y;
                                    final int i23 = i4;
                                    return vv3Var.s0(lz0.h(j2), max, qp1Var, new mi2() { // from class: u96
                                        @Override // defpackage.mi2
                                        public final Object n(Object obj) {
                                            xn4 xn4Var = (xn4) obj;
                                            xn4.m(xn4Var, yn4.this, 0, i22);
                                            xn4.m(xn4Var, c7, h3, i23);
                                            return o27.a;
                                        }
                                    });
                                }
                            }
                            dq3.b("Collection contains no element matching the predicate.");
                            f81.c();
                        } else {
                            i20++;
                        }
                    } else {
                        dq3.b("Collection contains no element matching the predicate.");
                        f81.c();
                    }
                }
                return null;
        }
    }
}
