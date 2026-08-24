package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hf5  reason: default package */
/* loaded from: classes.dex */
public final class hf5 extends hw6 implements fo2 {
    public List X;
    public List Y;
    public List Z;
    public ka4 d0;
    public ka4 e0;
    public ka4 f0;
    public Set g0;
    public ka4 h0;
    public int i0;
    public /* synthetic */ um j0;
    public final /* synthetic */ if5 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf5(if5 if5Var, r41 r41Var) {
        super(3, r41Var);
        this.k0 = if5Var;
    }

    public static final void v(if5 if5Var, List list, List list2, List list3, ka4 ka4Var, ka4 ka4Var2, ka4 ka4Var3, ka4 ka4Var4) {
        char c;
        long j;
        long j2;
        synchronized (if5Var.c) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    ey0 ey0Var = (ey0) list3.get(i);
                    ey0Var.a();
                    if5Var.L(ey0Var);
                }
                list3.clear();
                Object[] objArr = ka4Var.b;
                long[] jArr = ka4Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    ey0 ey0Var2 = (ey0) objArr[(i2 << 3) + i4];
                                    ey0Var2.a();
                                    if5Var.L(ey0Var2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                ka4Var.b();
                Object[] objArr2 = ka4Var2.b;
                long[] jArr2 = ka4Var2.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((ey0) objArr2[(i5 << 3) + i7]).g();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        }
                        i5++;
                    }
                }
                ka4Var2.b();
                ka4Var3.b();
                Object[] objArr3 = ka4Var4.b;
                long[] jArr3 = ka4Var4.a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    ey0 ey0Var3 = (ey0) objArr3[(i8 << 3) + i10];
                                    ey0Var3.a();
                                    if5Var.L(ey0Var3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length3) {
                            break;
                        }
                        i8++;
                    }
                }
                ka4Var4.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void x(List list, if5 if5Var) {
        list.clear();
        synchronized (if5Var.c) {
            try {
                ArrayList arrayList = if5Var.k;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((o84) arrayList.get(i));
                }
                if5Var.k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        w61 w61Var = (w61) obj;
        hf5 hf5Var = new hf5(this.k0, (r41) obj3);
        hf5Var.j0 = (um) obj2;
        return hf5Var.s(jg7.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0098 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0124 -> B:44:0x012c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01d9 -> B:12:0x0093). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        um umVar;
        ka4 ka4Var;
        ka4 ka4Var2;
        ArrayList arrayList;
        d66 d66Var;
        ArrayList arrayList2;
        ka4 ka4Var3;
        ArrayList arrayList3;
        ka4 ka4Var4;
        final ArrayList arrayList4;
        final ka4 ka4Var5;
        final ArrayList arrayList5;
        final ArrayList arrayList6;
        final ka4 ka4Var6;
        d66 d66Var2;
        if5 if5Var;
        Object obj2;
        rj0 rj0Var;
        x61 x61Var;
        um umVar2;
        ca4 ca4Var;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        int i = this.i0;
        int i2 = 2;
        int i3 = 1;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ka4 ka4Var7 = this.h0;
                    Set set = this.g0;
                    ka4Var3 = this.f0;
                    ka4Var4 = this.e0;
                    ka4Var = this.d0;
                    ?? r10 = this.Z;
                    ?? r11 = this.Y;
                    ?? r12 = this.X;
                    um umVar3 = this.j0;
                    oi2.Y(obj);
                    ka4Var2 = ka4Var7;
                    umVar = umVar3;
                    ArrayList arrayList7 = r10;
                    ArrayList arrayList8 = r11;
                    ArrayList arrayList9 = r12;
                    if5 if5Var2 = this.k0;
                    synchronized (if5Var2.c) {
                        try {
                            if (if5Var2.l.j()) {
                                ca4 b = g94.b(if5Var2.l);
                                if5Var2.l.a();
                                ap3 ap3Var = if5Var2.m;
                                ((ja4) ap3Var.B).a();
                                ((ja4) ap3Var.L).a();
                                if5Var2.o.a();
                                ca4Var = new ca4(b.b);
                                Object[] objArr = b.a;
                                int i4 = b.b;
                                x61Var = x61Var2;
                                int i5 = 0;
                                while (i5 < i4) {
                                    int i6 = i5;
                                    o84 o84Var = (o84) objArr[i5];
                                    ca4Var.a(new vr4(o84Var, if5Var2.n.g(o84Var)));
                                    i5 = i6 + 1;
                                    umVar = umVar;
                                    objArr = objArr;
                                }
                                umVar2 = umVar;
                                if5Var2.n.a();
                            } else {
                                x61Var = x61Var2;
                                umVar2 = umVar;
                                ca4Var = uh4.b;
                                ca4Var.getClass();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Object[] objArr2 = ca4Var.a;
                    int i7 = ca4Var.b;
                    for (int i8 = 0; i8 < i7; i8++) {
                        vr4 vr4Var = (vr4) objArr2[i8];
                        o84 o84Var2 = (o84) vr4Var.A;
                        n84 n84Var = (n84) vr4Var.B;
                    }
                    m44 m44Var = this.k0.b;
                    ((vw) m44Var.B).set(0);
                    ((s9) m44Var.L).v(new x84(15));
                    x61Var2 = x61Var;
                    umVar = umVar2;
                    i2 = 2;
                    i3 = 1;
                    d66Var = set;
                    arrayList3 = arrayList7;
                    arrayList2 = arrayList8;
                    arrayList = arrayList9;
                    synchronized (this.k0.c) {
                    }
                    if5 if5Var3 = this.k0;
                    this.j0 = umVar;
                    this.X = arrayList;
                    this.Y = arrayList2;
                    this.Z = arrayList3;
                    this.d0 = ka4Var;
                    this.e0 = ka4Var4;
                    this.f0 = ka4Var3;
                    this.g0 = d66Var;
                    this.h0 = ka4Var2;
                    this.i0 = i3;
                    if (!if5Var3.C()) {
                        rj0 rj0Var2 = new rj0(i3, np2.V(this));
                        rj0Var2.v();
                        synchronized (if5Var3.c) {
                            if (if5Var3.C()) {
                                rj0Var = rj0Var2;
                            } else {
                                if5Var3.r = rj0Var2;
                                rj0Var = null;
                            }
                        }
                        if (rj0Var != null) {
                            rj0Var.i(jg7.a);
                        }
                        obj2 = rj0Var2.s();
                        if (obj2 != x61.COROUTINE_SUSPENDED) {
                            obj2 = jg7.a;
                        }
                    } else {
                        obj2 = jg7.a;
                    }
                    if (obj2 != x61Var2) {
                        ArrayList arrayList10 = arrayList;
                        ka4Var5 = ka4Var;
                        ka4Var6 = ka4Var2;
                        arrayList4 = arrayList3;
                        arrayList6 = arrayList10;
                        d66Var2 = d66Var;
                        arrayList5 = arrayList2;
                        final d66 d66Var3 = d66Var2;
                        final ka4 ka4Var8 = ka4Var4;
                        final ka4 ka4Var9 = ka4Var3;
                        if5Var = this.k0;
                        tp6 tp6Var = if5.z;
                        if (!if5Var.K()) {
                            final if5 if5Var4 = this.k0;
                            qn2 qn2Var = new qn2() { // from class: gf5
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.qn2
                                public final Object g(Object obj3) {
                                    boolean z;
                                    Object[] objArr3;
                                    vl6 ob7Var;
                                    List list;
                                    List list2;
                                    char c;
                                    List list3;
                                    List list4;
                                    Object[] objArr4;
                                    boolean z2;
                                    if5 if5Var5 = if5.this;
                                    ka4 ka4Var10 = ka4Var9;
                                    ka4 ka4Var11 = ka4Var6;
                                    List list5 = arrayList6;
                                    List list6 = arrayList5;
                                    ka4 ka4Var12 = ka4Var5;
                                    List list7 = arrayList4;
                                    ka4 ka4Var13 = ka4Var8;
                                    Set set2 = d66Var3;
                                    long longValue = ((Long) obj3).longValue();
                                    synchronized (if5Var5.c) {
                                        z = if5Var5.z();
                                    }
                                    char c2 = 2;
                                    boolean z3 = 0;
                                    if (z) {
                                        Trace.beginSection("Recomposer:animation");
                                        try {
                                            ((s9) if5Var5.a.L).v(new t4(2, longValue));
                                            synchronized (bm6.c) {
                                                ka4 ka4Var14 = bm6.j.h;
                                                if (ka4Var14 != null && ka4Var14.h()) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                            }
                                            if (z2) {
                                                bm6.a();
                                            }
                                        } finally {
                                        }
                                    }
                                    Trace.beginSection("Recomposer:recompose");
                                    try {
                                        if5Var5.K();
                                        synchronized (if5Var5.c) {
                                            ua4 ua4Var = if5Var5.i;
                                            Object[] objArr5 = ua4Var.A;
                                            int i9 = ua4Var.L;
                                            int i10 = 0;
                                            while (i10 < i9) {
                                                list5.add((ey0) objArr5[i10]);
                                                i10++;
                                                c2 = c2;
                                            }
                                            if5Var5.i.g();
                                        }
                                        ka4Var10.b();
                                        ka4Var11.b();
                                        while (true) {
                                            if (list5.isEmpty() && list6.isEmpty()) {
                                                break;
                                            }
                                            int size = list5.size();
                                            for (int i11 = 0; i11 < size; i11++) {
                                                ey0 ey0Var = (ey0) list5.get(i11);
                                                ey0 I = if5Var5.I(ey0Var, ka4Var10);
                                                if (I != null) {
                                                    list7.add(I);
                                                }
                                                ka4Var11.a(ey0Var);
                                            }
                                            list5.clear();
                                            if (ka4Var10.h() || if5Var5.i.L != 0) {
                                                synchronized (if5Var5.c) {
                                                    List D = if5Var5.D();
                                                    int size2 = D.size();
                                                    for (int i12 = 0; i12 < size2; i12++) {
                                                        ey0 ey0Var2 = (ey0) D.get(i12);
                                                        if (!ka4Var11.c(ey0Var2) && ey0Var2.v(set2)) {
                                                            list5.add(ey0Var2);
                                                        }
                                                    }
                                                    ua4 ua4Var2 = if5Var5.i;
                                                    int i13 = ua4Var2.L;
                                                    int i14 = 0;
                                                    int i15 = 0;
                                                    while (true) {
                                                        objArr3 = ua4Var2.A;
                                                        if (i14 >= i13) {
                                                            break;
                                                        }
                                                        ey0 ey0Var3 = (ey0) objArr3[i14];
                                                        if (!ka4Var11.c(ey0Var3) && !list5.contains(ey0Var3)) {
                                                            list5.add(ey0Var3);
                                                            i15++;
                                                        } else if (i15 > 0) {
                                                            Object[] objArr6 = ua4Var2.A;
                                                            objArr6[i14 - i15] = objArr6[i14];
                                                        }
                                                        i14++;
                                                    }
                                                    int i16 = i13 - i15;
                                                    Arrays.fill(objArr3, i16, i13, (Object) null);
                                                    ua4Var2.L = i16;
                                                }
                                            }
                                            if (list5.isEmpty()) {
                                                hf5.x(list6, if5Var5);
                                                while (!list6.isEmpty()) {
                                                    List<Object> H = if5Var5.H(list6, ka4Var10);
                                                    ka4Var12.getClass();
                                                    for (Object obj4 : H) {
                                                        ka4Var12.k(obj4);
                                                    }
                                                    hf5.x(list6, if5Var5);
                                                }
                                            }
                                            z3 = 0;
                                        }
                                        vl6 j = bm6.j();
                                        if (j instanceof oa4) {
                                            ob7Var = new nb7((oa4) j, null, null, true, false);
                                        } else {
                                            ob7Var = new ob7(j, null, true, z3);
                                        }
                                        vl6 j2 = ob7Var.j();
                                        if (!list7.isEmpty()) {
                                            int size3 = list7.size();
                                            for (int i17 = z3; i17 < size3; i17++) {
                                                ka4Var13.a((ey0) list7.get(i17));
                                            }
                                            int size4 = list7.size();
                                            for (int i18 = z3; i18 < size4; i18++) {
                                                ((ey0) list7.get(i18)).d();
                                            }
                                            list7.clear();
                                        }
                                        if (ka4Var12.h()) {
                                            try {
                                                ka4Var13.j(ka4Var12);
                                                Object[] objArr7 = ka4Var12.b;
                                                long[] jArr = ka4Var12.a;
                                                c = 7;
                                                int length = jArr.length - 2;
                                                int i19 = z3;
                                                if (length >= 0) {
                                                    while (true) {
                                                        long j3 = jArr[i19];
                                                        list = list5;
                                                        list2 = list6;
                                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i20 = 8 - ((~(i19 - length)) >>> 31);
                                                            for (int i21 = 0; i21 < i20; i21++) {
                                                                if ((j3 & 255) < 128) {
                                                                    try {
                                                                        ((ey0) objArr7[(i19 << 3) + i21]).f();
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                        try {
                                                                            if5Var5.J(th, null);
                                                                            hf5.v(if5Var5, list, list2, list7, ka4Var12, ka4Var13, ka4Var10, ka4Var11);
                                                                            vl6.q(j2);
                                                                            ob7Var.c();
                                                                            return jg7.a;
                                                                        } finally {
                                                                            ka4Var12.b();
                                                                        }
                                                                    }
                                                                }
                                                                j3 >>= 8;
                                                            }
                                                            if (i20 != 8) {
                                                                break;
                                                            }
                                                        }
                                                        if (i19 == length) {
                                                            break;
                                                        }
                                                        list5 = list;
                                                        list6 = list2;
                                                        i19++;
                                                    }
                                                } else {
                                                    list = list5;
                                                    list2 = list6;
                                                }
                                                list5 = list;
                                                list6 = list2;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                list = list5;
                                                list2 = list6;
                                            }
                                        } else {
                                            c = 7;
                                        }
                                        if (ka4Var13.h()) {
                                            try {
                                                Object[] objArr8 = ka4Var13.b;
                                                long[] jArr2 = ka4Var13.a;
                                                int length2 = jArr2.length - 2;
                                                if (length2 >= 0) {
                                                    int i22 = 0;
                                                    while (true) {
                                                        long j4 = jArr2[i22];
                                                        list3 = list5;
                                                        list4 = list6;
                                                        if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i23 = 8 - ((~(i22 - length2)) >>> 31);
                                                            int i24 = 0;
                                                            while (i24 < i23) {
                                                                if ((j4 & 255) < 128) {
                                                                    try {
                                                                        ((ey0) objArr8[(i22 << 3) + i24]).g();
                                                                    } catch (Throwable th4) {
                                                                        th = th4;
                                                                        try {
                                                                            if5Var5.J(th, null);
                                                                            hf5.v(if5Var5, list3, list4, list7, ka4Var12, ka4Var13, ka4Var10, ka4Var11);
                                                                            vl6.q(j2);
                                                                            ob7Var.c();
                                                                            return jg7.a;
                                                                        } finally {
                                                                            ka4Var13.b();
                                                                        }
                                                                    }
                                                                }
                                                                j4 >>= 8;
                                                                i24++;
                                                                objArr8 = objArr8;
                                                            }
                                                            objArr4 = objArr8;
                                                            if (i23 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr4 = objArr8;
                                                        }
                                                        if (i22 == length2) {
                                                            break;
                                                        }
                                                        i22++;
                                                        list5 = list3;
                                                        list6 = list4;
                                                        objArr8 = objArr4;
                                                    }
                                                }
                                                ka4Var13.b();
                                            } catch (Throwable th5) {
                                                th = th5;
                                                list3 = list5;
                                                list4 = list6;
                                            }
                                        }
                                        vl6.q(j2);
                                        ob7Var.c();
                                        synchronized (if5Var5.c) {
                                            if (if5Var5.y() != null) {
                                                tx0.a("unexpected to get continuation here");
                                            }
                                        }
                                        bm6.j().m();
                                        ka4Var11.b();
                                        ka4Var10.b();
                                        if5Var5.q = null;
                                        return jg7.a;
                                    } finally {
                                    }
                                }
                            };
                            this.j0 = umVar;
                            this.X = arrayList6;
                            this.Y = arrayList5;
                            this.Z = arrayList4;
                            this.d0 = ka4Var5;
                            this.e0 = ka4Var8;
                            this.f0 = ka4Var9;
                            this.g0 = d66Var3;
                            this.h0 = ka4Var6;
                            this.i0 = i2;
                            if (umVar.a(qn2Var, this) != x61Var2) {
                                ArrayList arrayList11 = arrayList4;
                                ka4Var2 = ka4Var6;
                                ka4Var = ka4Var5;
                                arrayList9 = arrayList6;
                                arrayList7 = arrayList11;
                                ka4Var3 = ka4Var9;
                                ka4Var4 = ka4Var8;
                                set = d66Var3;
                                arrayList8 = arrayList5;
                                if5 if5Var22 = this.k0;
                                synchronized (if5Var22.c) {
                                }
                            }
                        } else {
                            ArrayList arrayList12 = arrayList4;
                            ka4Var2 = ka4Var6;
                            ka4Var = ka4Var5;
                            arrayList = arrayList6;
                            arrayList3 = arrayList12;
                            ka4Var3 = ka4Var9;
                            ka4Var4 = ka4Var8;
                            d66Var = d66Var3;
                            arrayList2 = arrayList5;
                            synchronized (this.k0.c) {
                            }
                        }
                    }
                    return x61Var2;
                }
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ka4 ka4Var10 = this.h0;
            ka4Var3 = this.f0;
            ka4Var4 = this.e0;
            ka4 ka4Var11 = this.d0;
            ?? r102 = this.Z;
            ?? r112 = this.Y;
            ?? r122 = this.X;
            um umVar4 = this.j0;
            oi2.Y(obj);
            ka4Var6 = ka4Var10;
            umVar = umVar4;
            arrayList4 = r102;
            arrayList6 = r122;
            ka4Var5 = ka4Var11;
            d66Var2 = this.g0;
            arrayList5 = r112;
            final Set d66Var32 = d66Var2;
            final ka4 ka4Var82 = ka4Var4;
            final ka4 ka4Var92 = ka4Var3;
            if5Var = this.k0;
            tp6 tp6Var2 = if5.z;
            if (!if5Var.K()) {
            }
        } else {
            oi2.Y(obj);
            umVar = this.j0;
            ArrayList arrayList13 = new ArrayList();
            ArrayList arrayList14 = new ArrayList();
            ArrayList arrayList15 = new ArrayList();
            ka4 ka4Var12 = c66.a;
            ka4Var = new ka4();
            ka4 ka4Var13 = new ka4();
            ka4 ka4Var14 = new ka4();
            d66 d66Var4 = new d66(ka4Var14);
            ka4Var2 = new ka4();
            arrayList = arrayList13;
            d66Var = d66Var4;
            arrayList2 = arrayList14;
            ka4Var3 = ka4Var14;
            arrayList3 = arrayList15;
            ka4Var4 = ka4Var13;
            synchronized (this.k0.c) {
            }
        }
    }
}
