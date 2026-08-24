package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.Range;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oi2  reason: default package */
/* loaded from: classes.dex */
public abstract class oi2 {
    public static e33 a;
    public static e33 b;
    public static e33 c;
    public static eb d;

    public static final e33 A() {
        e33 e33Var = b;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("Filled.MoreVert", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = el7.a;
        cn6 cn6Var = new cn6(kt0.b);
        ww2 ww2Var = new ww2(1, (byte) 0);
        ww2Var.o(12.0f, 8.0f);
        ww2Var.i(1.1f, RecyclerView.B1, 2.0f, -0.9f, 2.0f, -2.0f);
        ww2Var.q(-0.9f, -2.0f, -2.0f, -2.0f);
        ww2Var.q(-2.0f, 0.9f, -2.0f, 2.0f);
        ww2Var.q(0.9f, 2.0f, 2.0f, 2.0f);
        ww2Var.g();
        ww2Var.o(12.0f, 10.0f);
        ww2Var.i(-1.1f, RecyclerView.B1, -2.0f, 0.9f, -2.0f, 2.0f);
        ww2Var.q(0.9f, 2.0f, 2.0f, 2.0f);
        ww2Var.q(2.0f, -0.9f, 2.0f, -2.0f);
        ww2Var.q(-0.9f, -2.0f, -2.0f, -2.0f);
        ww2Var.g();
        ww2Var.o(12.0f, 16.0f);
        ww2Var.i(-1.1f, RecyclerView.B1, -2.0f, 0.9f, -2.0f, 2.0f);
        ww2Var.q(0.9f, 2.0f, 2.0f, 2.0f);
        ww2Var.q(2.0f, -0.9f, 2.0f, -2.0f);
        ww2Var.q(-0.9f, -2.0f, -2.0f, -2.0f);
        ww2Var.g();
        d33.a(d33Var, ww2Var.b, 0, cn6Var);
        e33 b2 = d33Var.b();
        b = b2;
        return b2;
    }

    public static final p96 B(Object obj) {
        if (obj != uy0.a) {
            return (p96) obj;
        }
        i.m("Does not contain segment");
        return null;
    }

    public static final e33 C() {
        e33 e33Var = c;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("Filled.Settings", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = el7.a;
        cn6 cn6Var = new cn6(kt0.b);
        ww2 ww2Var = new ww2(1, (byte) 0);
        ww2Var.o(19.14f, 12.94f);
        ww2Var.i(0.04f, -0.3f, 0.06f, -0.61f, 0.06f, -0.94f);
        ww2Var.i(RecyclerView.B1, -0.32f, -0.02f, -0.64f, -0.07f, -0.94f);
        ww2Var.n(2.03f, -1.58f);
        ww2Var.i(0.18f, -0.14f, 0.23f, -0.41f, 0.12f, -0.61f);
        ww2Var.n(-1.92f, -3.32f);
        ww2Var.i(-0.12f, -0.22f, -0.37f, -0.29f, -0.59f, -0.22f);
        ww2Var.n(-2.39f, 0.96f);
        ww2Var.i(-0.5f, -0.38f, -1.03f, -0.7f, -1.62f, -0.94f);
        ww2Var.m(14.4f, 2.81f);
        ww2Var.i(-0.04f, -0.24f, -0.24f, -0.41f, -0.48f, -0.41f);
        ww2Var.l(-3.84f);
        ww2Var.i(-0.24f, RecyclerView.B1, -0.43f, 0.17f, -0.47f, 0.41f);
        ww2Var.m(9.25f, 5.35f);
        ww2Var.h(8.66f, 5.59f, 8.12f, 5.92f, 7.63f, 6.29f);
        ww2Var.m(5.24f, 5.33f);
        ww2Var.i(-0.22f, -0.08f, -0.47f, RecyclerView.B1, -0.59f, 0.22f);
        ww2Var.m(2.74f, 8.87f);
        ww2Var.h(2.62f, 9.08f, 2.66f, 9.34f, 2.86f, 9.48f);
        ww2Var.n(2.03f, 1.58f);
        ww2Var.h(4.84f, 11.36f, 4.8f, 11.69f, 4.8f, 12.0f);
        ww2Var.q(0.02f, 0.64f, 0.07f, 0.94f);
        ww2Var.n(-2.03f, 1.58f);
        ww2Var.i(-0.18f, 0.14f, -0.23f, 0.41f, -0.12f, 0.61f);
        ww2Var.n(1.92f, 3.32f);
        ww2Var.i(0.12f, 0.22f, 0.37f, 0.29f, 0.59f, 0.22f);
        ww2Var.n(2.39f, -0.96f);
        ww2Var.i(0.5f, 0.38f, 1.03f, 0.7f, 1.62f, 0.94f);
        ww2Var.n(0.36f, 2.54f);
        ww2Var.i(0.05f, 0.24f, 0.24f, 0.41f, 0.48f, 0.41f);
        ww2Var.l(3.84f);
        ww2Var.i(0.24f, RecyclerView.B1, 0.44f, -0.17f, 0.47f, -0.41f);
        ww2Var.n(0.36f, -2.54f);
        ww2Var.i(0.59f, -0.24f, 1.13f, -0.56f, 1.62f, -0.94f);
        ww2Var.n(2.39f, 0.96f);
        ww2Var.i(0.22f, 0.08f, 0.47f, RecyclerView.B1, 0.59f, -0.22f);
        ww2Var.n(1.92f, -3.32f);
        ww2Var.i(0.12f, -0.22f, 0.07f, -0.47f, -0.12f, -0.61f);
        ww2Var.m(19.14f, 12.94f);
        ww2Var.g();
        ww2Var.o(12.0f, 15.6f);
        ww2Var.i(-1.98f, RecyclerView.B1, -3.6f, -1.62f, -3.6f, -3.6f);
        ww2Var.q(1.62f, -3.6f, 3.6f, -3.6f);
        ww2Var.q(3.6f, 1.62f, 3.6f, 3.6f);
        ww2Var.p(13.98f, 15.6f, 12.0f, 15.6f);
        ww2Var.g();
        d33.a(d33Var, ww2Var.b, 0, cn6Var);
        e33 b2 = d33Var.b();
        c = b2;
        return b2;
    }

    public static final int D(e36 e36Var) {
        e36Var.getClass();
        j36 i0 = e36Var.i0("SELECT changes()");
        try {
            i0.f0();
            int i = (int) i0.getLong(0);
            lb4.p(i0, null);
            return i;
        } finally {
        }
    }

    public static final int H(wb6 wb6Var, wb6[] wb6VarArr) {
        boolean z;
        boolean z2;
        int i;
        wb6VarArr.getClass();
        int hashCode = (wb6Var.a().hashCode() * 31) + Arrays.hashCode(wb6VarArr);
        int f = wb6Var.f();
        int i2 = 1;
        while (true) {
            int i3 = 0;
            if (f > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                break;
            }
            int i4 = f - 1;
            int i5 = i2 * 31;
            String a2 = wb6Var.j(wb6Var.f() - f).a();
            if (a2 != null) {
                i3 = a2.hashCode();
            }
            i2 = i5 + i3;
            f = i4;
        }
        int f2 = wb6Var.f();
        int i6 = 1;
        while (true) {
            if (f2 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i7 = f2 - 1;
                int i8 = i6 * 31;
                np2 e = wb6Var.j(wb6Var.f() - f2).e();
                if (e != null) {
                    i = e.hashCode();
                } else {
                    i = 0;
                }
                i6 = i8 + i;
                f2 = i7;
            } else {
                return (((hashCode * 31) + i2) * 31) + i6;
            }
        }
    }

    public static final int I(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final boolean J(Object obj) {
        if (obj == uy0.a) {
            return true;
        }
        return false;
    }

    public static final boolean K(nr4 nr4Var, float f) {
        float t;
        boolean z;
        nr4Var.m().getClass();
        if (nr4Var.r()) {
            t = -f;
        } else {
            t = t(nr4Var);
        }
        if (t > RecyclerView.B1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        return true;
    }

    public static final float L(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final int M(float f, int i, int i2) {
        return i + ((int) Math.round((i2 - i) * f));
    }

    public static final long N(float f, long j) {
        if (!Float.isNaN(f) && f < 1.0f) {
            return kt0.c(kt0.e(j) * f, j);
        }
        return j;
    }

    public static final int O(xo3 xo3Var, lo4 lo4Var) {
        long j;
        if (lo4Var == lo4.Vertical) {
            j = xo3Var.o & 4294967295L;
        } else {
            j = xo3Var.o >> 32;
        }
        return (int) j;
    }

    public static final void V(cg0 cg0Var, qi1 qi1Var, il5 il5Var) {
        boolean z;
        db0 r;
        eb ebVar = d;
        if (ebVar != null) {
            String d2 = cg0Var.d();
            d2.getClass();
            eg0 b2 = ((kh0) ebVar.B).b(d2);
            w9 w9Var = new w9(b2.q(), re0.a);
            u63 u63Var = u63.X;
            zi0 zi0Var = new zi0(b2, null, w9Var, null, u63Var, u63Var, (ze0) ebVar.L, (rr6) ebVar.X, (cj7) ebVar.R);
            synchronized (zi0Var.g0) {
            }
            List list = (List) qi1Var.c;
            synchronized (zi0Var.g0) {
                zi0Var.d0 = list;
            }
            synchronized (zi0Var.g0) {
            }
            Range range = (Range) qi1Var.d;
            synchronized (zi0Var.g0) {
                zi0Var.e0 = range;
            }
            List list2 = (List) qi1Var.g;
            kj2.t("CameraUseCaseAdapter", "simulateAddUseCases: appUseCasesToAdd = " + list2 + ", featureGroup = " + il5Var);
            synchronized (zi0Var.g0) {
                x9 x9Var = zi0Var.A;
                oe0 oe0Var = zi0Var.f0;
                x9Var.i(oe0Var);
                x9 x9Var2 = zi0Var.B;
                if (x9Var2 != null) {
                    x9Var2.i(oe0Var);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(zi0Var.X);
                linkedHashSet.addAll(list2);
                HashMap g = zi0.g(linkedHashSet, il5Var);
                try {
                    if (zi0Var.B != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    r = zi0Var.r(linkedHashSet, z);
                    zi0.C(g);
                } catch (IllegalArgumentException e) {
                    throw new Exception(e);
                }
            }
            r.getClass();
            return;
        }
        i.m("mCameraUseCaseAdapterProvider must be initialized first!");
    }

    public static final int X(o94 o94Var) {
        int c2;
        int i = o94Var.b;
        int c3 = o94Var.c(0);
        while (o94Var.b != 0 && o94Var.c(0) == c3) {
            o94Var.f(0, o94Var.d());
            o94Var.e(o94Var.b - 1);
            int i2 = o94Var.b;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int c4 = o94Var.c(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int c5 = o94Var.c(i6);
                if (i5 < i2 && (c2 = o94Var.c(i5)) > c5) {
                    if (c2 > c4) {
                        o94Var.f(i4, c2);
                        o94Var.f(i5, c4);
                        i4 = i5;
                    }
                } else if (c5 > c4) {
                    o94Var.f(i4, c5);
                    o94Var.f(i6, c4);
                    i4 = i6;
                }
            }
        }
        return c3;
    }

    public static final void Y(Object obj) {
        if (!(obj instanceof em5)) {
            return;
        }
        throw ((em5) obj).A;
    }

    public static final String Z(wb6 wb6Var) {
        l93 R = gi2.R(0, wb6Var.f());
        return gt0.P0(R, ", ", wb6Var.a() + '(', ")", new bg2(wb6Var, 18), 24);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [j93, l93] */
    public static final void a(final oj3 oj3Var, final int i, final int i2, final int i3, final qn2 qn2Var, final on2 on2Var, px0 px0Var, final int i4) {
        int ordinal;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        oj3 oj3Var2;
        final int i11;
        int i12;
        int i13;
        qn2 qn2Var2;
        xq2 xq2Var;
        cf5 t;
        eo2 eo2Var;
        boolean z2;
        boolean z3;
        String l;
        int intValue;
        qn2Var.getClass();
        on2Var.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-559582182);
        if (oj3Var == null) {
            ordinal = -1;
        } else {
            ordinal = oj3Var.ordinal();
        }
        if (xq2Var2.d(ordinal)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i14 = i4 | i5;
        if (xq2Var2.d(i)) {
            i6 = 32;
        } else {
            i6 = 16;
        }
        int i15 = i14 | i6;
        if (xq2Var2.d(i2)) {
            i7 = 256;
        } else {
            i7 = 128;
        }
        int i16 = i15 | i7;
        if (xq2Var2.d(i3)) {
            i8 = 2048;
        } else {
            i8 = 1024;
        }
        int i17 = i16 | i8;
        if (xq2Var2.h(qn2Var)) {
            i9 = 16384;
        } else {
            i9 = 8192;
        }
        int i18 = i17 | i9;
        if (xq2Var2.h(on2Var)) {
            i10 = 131072;
        } else {
            i10 = 65536;
        }
        int i19 = i10 | i18;
        if ((74899 & i19) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i19 & 1, z)) {
            if (oj3Var == null) {
                t = xq2Var2.t();
                if (t != null) {
                    eo2Var = new eo2(oj3Var, i, i2, i3, qn2Var, on2Var, i4, 0) { // from class: vj3
                        public final /* synthetic */ int A;
                        public final /* synthetic */ oj3 B;
                        public final /* synthetic */ int L;
                        public final /* synthetic */ int R;
                        public final /* synthetic */ int X;
                        public final /* synthetic */ qn2 Y;
                        public final /* synthetic */ on2 Z;

                        {
                            this.A = r8;
                        }

                        @Override // defpackage.eo2
                        public final Object o(Object obj, Object obj2) {
                            int i20 = this.A;
                            jg7 jg7Var = jg7.a;
                            switch (i20) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int a0 = ii2.a0(1);
                                    oi2.a(this.B, this.L, this.R, this.X, this.Y, this.Z, (px0) obj, a0);
                                    return jg7Var;
                                default:
                                    ((Integer) obj2).getClass();
                                    int a02 = ii2.a0(1);
                                    oi2.a(this.B, this.L, this.R, this.X, this.Y, this.Z, (px0) obj, a02);
                                    return jg7Var;
                            }
                        }
                    };
                    t.d = eo2Var;
                }
                return;
            }
            oj3Var2 = oj3Var;
            i11 = i;
            i12 = i2;
            i13 = i3;
            ?? j93Var = new j93(i12, i13, 1);
            Object[] objArr = {oj3Var2, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)};
            if ((i19 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = xq2Var2.P();
            if (z2 || P == ox0.a) {
                P = new on2() { // from class: wj3
                    @Override // defpackage.on2
                    public final Object c() {
                        return np2.Y(String.valueOf(i11));
                    }
                };
                xq2Var2.l0(P);
            }
            qa4 qa4Var = (qa4) qo2.I(objArr, (on2) P, xq2Var2, 0);
            Integer h0 = xs6.h0((String) qa4Var.getValue());
            if (h0 == null || i12 > (intValue = h0.intValue()) || intValue > j93Var.B) {
                h0 = null;
            }
            if (((String) qa4Var.getValue()).length() > 0 && h0 == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i20 = yj3.a[oj3Var2.ordinal()];
            if (i20 != 1) {
                if (i20 != 2) {
                    if (i20 == 3) {
                        l = i61.l(xq2Var2, -887536097, R.string.label_height, xq2Var2, false);
                    } else {
                        throw xg6.f(xq2Var2, -887544085, false);
                    }
                } else {
                    l = i61.l(xq2Var2, -887539010, R.string.label_width, xq2Var2, false);
                }
            } else {
                l = i61.l(xq2Var2, -887541859, R.string.label_size, xq2Var2, false);
            }
            String str = l;
            Integer num = h0;
            qn2Var2 = qn2Var;
            xq2Var = xq2Var2;
            q60.a(str, on2Var, n16.I(1791564517, new xj3(num, qn2Var, qa4Var, z3, (l93) j93Var), xq2Var2), n16.I(620005923, new x3(on2Var, num, qn2Var2, 19), xq2Var2), false, xq2Var, ((i19 >> 12) & 112) | 3456, 16);
        } else {
            oj3Var2 = oj3Var;
            i11 = i;
            i12 = i2;
            i13 = i3;
            qn2Var2 = qn2Var;
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        t = xq2Var.t();
        if (t != null) {
            final oj3 oj3Var3 = oj3Var2;
            final qn2 qn2Var3 = qn2Var2;
            final int i21 = i11;
            final int i22 = i12;
            final int i23 = i13;
            eo2Var = new eo2(oj3Var3, i21, i22, i23, qn2Var3, on2Var, i4, 1) { // from class: vj3
                public final /* synthetic */ int A;
                public final /* synthetic */ oj3 B;
                public final /* synthetic */ int L;
                public final /* synthetic */ int R;
                public final /* synthetic */ int X;
                public final /* synthetic */ qn2 Y;
                public final /* synthetic */ on2 Z;

                {
                    this.A = r8;
                }

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    int i202 = this.A;
                    jg7 jg7Var = jg7.a;
                    switch (i202) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int a0 = ii2.a0(1);
                            oi2.a(this.B, this.L, this.R, this.X, this.Y, this.Z, (px0) obj, a0);
                            return jg7Var;
                        default:
                            ((Integer) obj2).getClass();
                            int a02 = ii2.a0(1);
                            oi2.a(this.B, this.L, this.R, this.X, this.Y, this.Z, (px0) obj, a02);
                            return jg7Var;
                    }
                }
            };
            t.d = eo2Var;
        }
    }

    public static final void b(q3 q3Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1390797292);
        if (xq2Var.h(q3Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            f04.a(ge7.O(x64.a, 8.0f), q3Var.d, q3Var.i, new kt0(cc5.a), n16.I(1474506770, new ov4(q3Var, 7), xq2Var), xq2Var, 27654, 0);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new z5(q3Var, i, 16);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [tc3, gu6] */
    public static gu6 c() {
        return new tc3(null);
    }

    public static final Object[] d(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        fv.w0(objArr, objArr2, 0, i, 6);
        fv.t0(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] e(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        fv.w0(objArr, objArr2, 0, i, 6);
        fv.t0(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] f(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        fv.w0(objArr, objArr2, 0, i, 6);
        fv.t0(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    public static final ExtractedText g(c37 c37Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = c37Var.a.B;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = c37Var.b;
        extractedText.selectionStart = k47.f(j);
        extractedText.selectionEnd = k47.e(j);
        extractedText.flags = !qs6.k0(c37Var.a.B, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final void h(o94 o94Var, int i) {
        if (o94Var.b != 0 && (o94Var.c(0) == i || o94Var.c(o94Var.b - 1) == i)) {
            return;
        }
        int i2 = o94Var.b;
        o94Var.a(i);
        while (i2 > 0) {
            int i3 = ((i2 + 1) >>> 1) - 1;
            int c2 = o94Var.c(i3);
            if (i <= c2) {
                break;
            }
            o94Var.f(i2, c2);
            i2 = i3;
        }
        o94Var.f(i2, i);
    }

    public static void i(dp dpVar, String str) {
        if ("�".length() <= 0) {
            s53.a("alternateText can't be an empty string.");
        }
        cp cpVar = new cp(new ms6(str), dpVar.A.length(), 0, 4);
        ArrayList arrayList = dpVar.B;
        arrayList.add(cpVar);
        dpVar.L.add(cpVar);
        arrayList.size();
        dpVar.b("�");
        dpVar.c();
    }

    public static final void k(qn2 qn2Var, Object obj, l61 l61Var) {
        ug l = l(qn2Var, obj, null);
        if (l != null) {
            f04.H(l61Var, l);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [ug, java.lang.RuntimeException] */
    public static final ug l(qn2 qn2Var, Object obj, ug ugVar) {
        try {
            qn2Var.g(obj);
            return ugVar;
        } catch (Throwable th) {
            if (ugVar != null && ugVar.getCause() != th) {
                mb3.q(ugVar, th);
                return ugVar;
            }
            return new RuntimeException("Exception in undelivered element handler for " + obj, th);
        }
    }

    public static final em5 p(Throwable th) {
        th.getClass();
        return new em5(th);
    }

    public static final mi2 q(Context context) {
        int i = 0;
        rh rhVar = new rh(context, 0);
        if (Build.VERSION.SDK_INT >= 31) {
            i = pj2.a.a(context);
        }
        return new mi2(rhVar, new sh(i));
    }

    public static final long r() {
        return Thread.currentThread().getId();
    }

    public static final Object s(id3 id3Var, gg3 gg3Var, s63 s63Var) {
        gg3Var.getClass();
        zd5 zd5Var = new zd5(s63Var, km0.c.d(16384), id3Var.a);
        try {
            Object k = new fs6(id3Var, by7.OBJ, zd5Var, gg3Var.e()).k(gg3Var);
            zd5Var.o();
            return k;
        } finally {
            zd5Var.D();
        }
    }

    public static final float t(nr4 nr4Var) {
        if (nr4Var.m().e == lo4.Horizontal) {
            return Float.intBitsToFloat((int) (nr4Var.q() >> 32));
        }
        return Float.intBitsToFloat((int) (nr4Var.q() & 4294967295L));
    }

    public static final void u(no1 no1Var, ut2 ut2Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Canvas canvas;
        boolean z5;
        float f;
        xj0 G = no1Var.i0().G();
        ut2 ut2Var2 = (ut2) no1Var.i0().L;
        wt2 wt2Var = ut2Var.a;
        if (!ut2Var.s) {
            ut2Var.a();
            if (!wt2Var.o()) {
                try {
                    ut2Var.a.G(ut2Var.b, ut2Var.c, ut2Var, ut2Var.e);
                } catch (Throwable unused) {
                }
            }
            if (wt2Var.M() > RecyclerView.B1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                G.t();
            }
            Canvas a2 = xd.a(G);
            boolean isHardwareAccelerated = a2.isHardwareAccelerated();
            if (!isHardwareAccelerated) {
                long j = ut2Var.t;
                float f2 = (int) (j >> 32);
                float f3 = (int) (j & 4294967295L);
                long j2 = ut2Var.u;
                float f4 = ((int) (j2 >> 32)) + f2;
                float f5 = ((int) (j2 & 4294967295L)) + f3;
                float a3 = wt2Var.a();
                z40 l = wt2Var.l();
                int O = wt2Var.O();
                if (a3 >= 1.0f && O == 3 && l == null && wt2Var.k() != 1) {
                    a2.save();
                    a2 = a2;
                    f = f2;
                } else {
                    aj ajVar = ut2Var.p;
                    if (ajVar == null) {
                        ajVar = nc1.t();
                        ut2Var.p = ajVar;
                    }
                    ajVar.j(a3);
                    ajVar.k(O);
                    ajVar.m(l);
                    a2 = a2;
                    f = f2;
                    a2.saveLayer(f, f3, f4, f5, (Paint) ajVar.L);
                }
                a2.translate(f, f3);
                a2.concat(wt2Var.K());
            }
            if (!isHardwareAccelerated && ut2Var.w) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                G.h();
                mp2 d2 = ut2Var.d();
                if (d2 instanceof qo4) {
                    xj0.q(G, ((qo4) d2).f);
                } else if (d2 instanceof ro4) {
                    hj hjVar = ut2Var.m;
                    if (hjVar != null) {
                        hjVar.a.rewind();
                    } else {
                        hjVar = lj.a();
                        ut2Var.m = hjVar;
                    }
                    hj.c(hjVar, ((ro4) d2).f);
                    G.m(hjVar);
                } else if (d2 instanceof po4) {
                    G.m(((po4) d2).f);
                } else {
                    i.d();
                    return;
                }
            }
            if (ut2Var2 != null) {
                ka0 ka0Var = ut2Var2.r;
                if (!ka0Var.a) {
                    o53.a("Only add dependencies during a tracking");
                }
                ka4 ka4Var = (ka4) ka0Var.d;
                if (ka4Var != null) {
                    ka4Var.a(ut2Var);
                } else if (((ut2) ka0Var.b) != null) {
                    ka4 ka4Var2 = c66.a;
                    ka4 ka4Var3 = new ka4();
                    ut2 ut2Var3 = (ut2) ka0Var.b;
                    ut2Var3.getClass();
                    ka4Var3.a(ut2Var3);
                    ka4Var3.a(ut2Var);
                    ka0Var.d = ka4Var3;
                    ka0Var.b = null;
                } else {
                    ka0Var.b = ut2Var;
                }
                ka4 ka4Var4 = (ka4) ka0Var.e;
                if (ka4Var4 != null) {
                    z5 = !ka4Var4.l(ut2Var);
                } else if (((ut2) ka0Var.c) != ut2Var) {
                    z5 = true;
                } else {
                    ka0Var.c = null;
                    z5 = false;
                }
                if (z5) {
                    ut2Var.q++;
                }
            }
            if (!((wd) G).a.isHardwareAccelerated()) {
                zj0 zj0Var = ut2Var.o;
                if (zj0Var == null) {
                    zj0Var = new zj0();
                    ut2Var.o = zj0Var;
                }
                bt btVar = zj0Var.B;
                qh1 qh1Var = ut2Var.b;
                kk3 kk3Var = ut2Var.c;
                long S = qo2.S(ut2Var.u);
                qh1 I = btVar.I();
                kk3 K = btVar.K();
                xj0 G2 = btVar.G();
                z4 = z2;
                canvas = a2;
                long L = btVar.L();
                z3 = z;
                ut2 ut2Var4 = (ut2) btVar.L;
                btVar.W(qh1Var);
                btVar.X(kk3Var);
                btVar.V(G);
                btVar.Y(S);
                btVar.L = ut2Var;
                G.h();
                try {
                    ut2Var.c(zj0Var);
                } finally {
                    G.p();
                    btVar.W(I);
                    btVar.X(K);
                    btVar.V(G2);
                    btVar.Y(L);
                    btVar.L = ut2Var4;
                }
            } else {
                z3 = z;
                z4 = z2;
                canvas = a2;
                wt2Var.j(G);
            }
            if (z4) {
                G.p();
            }
            if (z3) {
                G.j();
            }
            if (!isHardwareAccelerated) {
                canvas.restore();
            }
        }
    }

    public static final void v(id3 id3Var, ja3 ja3Var, gg3 gg3Var, Object obj) {
        gg3Var.getClass();
        by7 by7Var = by7.OBJ;
        by7Var.getClass();
        new hs6(new g60(ja3Var), id3Var, by7Var, new hs6[((l0) by7.getEntries()).a()]).j(gg3Var, obj);
    }

    public static final float w(float f) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f) & 8589934591L) / 3)) + 709952852);
        float f2 = intBitsToFloat - ((intBitsToFloat - (f / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static String x(Context context, lj6 lj6Var, int i) {
        lj6 lj6Var2;
        vr4 vr4Var;
        lj6Var.getClass();
        long j = lj6Var.A;
        if (j < 1024) {
            lj6Var2 = new lj6(j);
        } else {
            double d2 = j / 1024.0d;
            if (d2 < 1024.0d) {
                lj6Var2 = new lj6(1024 * j);
            } else if (d2 / 1024.0d < 1024.0d) {
                lj6Var2 = new lj6(1048576 * j);
            } else {
                lj6Var2 = new lj6(1073741824 * j);
            }
        }
        if (lj6Var2 instanceof hj6) {
            vr4Var = new vr4(Double.valueOf(j), context.getString(R.string.size_bytes));
        } else if (lj6Var2 instanceof jj6) {
            vr4Var = new vr4(Double.valueOf(j / 1024.0d), context.getString(R.string.size_kb));
        } else if (lj6Var2 instanceof kj6) {
            vr4Var = new vr4(Double.valueOf((j / 1024.0d) / 1024.0d), context.getString(R.string.size_mb));
        } else if (lj6Var2 instanceof ij6) {
            vr4Var = new vr4(Double.valueOf(((j / 1024.0d) / 1024.0d) / 1024.0d), context.getString(R.string.size_gb));
        } else {
            i.d();
            return null;
        }
        BigDecimal scale = new BigDecimal(((Number) vr4Var.A).doubleValue()).setScale(i, RoundingMode.HALF_EVEN);
        return scale + ((String) vr4Var.B);
    }

    public static final Class y(wb6 wb6Var) {
        String e0 = xs6.e0(wb6Var.a(), "?", "");
        try {
            return Class.forName(e0);
        } catch (ClassNotFoundException unused) {
            if (qs6.j0(e0, ".", false)) {
                return Class.forName(lb1.z("(\\.+)(?!.*\\.)", e0, "\\$"));
            }
            String str = "Cannot find class with name \"" + wb6Var.a() + "\". Ensure that the serialName for this argument is the default fully qualified name";
            if (wb6Var.e() instanceof bc6) {
                str = str.concat(".\nIf the build is minified, try annotating the Enum class with \"androidx.annotation.Keep\" to ensure the Enum is not removed.");
            }
            i.h(str);
            return null;
        }
    }

    public static final long z(e36 e36Var) {
        e36Var.getClass();
        if (D(e36Var) == 0) {
            return -1L;
        }
        j36 i0 = e36Var.i0("SELECT last_insert_rowid()");
        try {
            i0.f0();
            long j = i0.getLong(0);
            lb4.p(i0, null);
            return j;
        } finally {
        }
    }

    public int E(View view) {
        return 0;
    }

    public int F() {
        return 0;
    }

    public abstract boolean G();

    public abstract void Q(int i);

    public abstract void R(View view, int i, int i2);

    public abstract void S(View view, float f, float f2);

    public abstract int T(byte[] bArr, int i, int i2);

    public abstract oi2 U(String str, qn2 qn2Var);

    public abstract o03 W();

    public abstract boolean a0(View view, int i);

    public abstract int j();

    public abstract int m(View view, int i);

    public abstract int n(View view, int i);

    public abstract Object o();

    public void P(View view, int i) {
    }
}
