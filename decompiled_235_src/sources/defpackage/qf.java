package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qf  reason: default package */
/* loaded from: classes.dex */
public final class qf implements qe1, View.OnAttachStateChangeListener {
    public final te A;
    public final i4 B;
    public u63 L;
    public final ArrayList R = new ArrayList();
    public final long X = 100;
    public lf Y = lf.SHOW_ORIGINAL;
    public boolean Z = true;
    public final v80 d0 = nb3.c(1, null, null, 6);
    public p94 e0;
    public long f0;
    public final p94 g0;
    public ya6 h0;
    public boolean i0;
    public final n0 j0;

    public qf(te teVar, i4 i4Var) {
        this.A = teVar;
        this.B = i4Var;
        new Handler(Looper.getMainLooper());
        p94 p94Var = h93.a;
        p94Var.getClass();
        this.e0 = p94Var;
        this.g0 = new p94();
        this.h0 = new ya6(teVar.getSemanticsOwner().a(), p94Var);
        this.j0 = new n0(this, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (r8 != r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
        if (defpackage.q60.t(r7.X, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0082 -> B:17:0x0046). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(s41 s41Var) {
        of ofVar;
        int i;
        n80 n80Var;
        if (s41Var instanceof of) {
            ofVar = (of) s41Var;
            int i2 = ofVar.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ofVar.Z = i2 - Integer.MIN_VALUE;
                Object obj = ofVar.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = ofVar.Z;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            n80Var = ofVar.R;
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        n80Var = ofVar.R;
                        oi2.Y(obj);
                        if (((Boolean) obj).booleanValue()) {
                            n80Var.c();
                            if (d()) {
                                e();
                            }
                            Handler handler = this.A.getHandler();
                            if (!this.i0 && handler != null) {
                                this.i0 = true;
                                handler.post(this.j0);
                            }
                            ofVar.R = n80Var;
                            ofVar.Z = 2;
                        } else {
                            return jg7.a;
                        }
                    }
                } else {
                    oi2.Y(obj);
                    v80 v80Var = this.d0;
                    v80Var.getClass();
                    n80Var = new n80(v80Var);
                }
                ofVar.R = n80Var;
                ofVar.Z = 1;
                obj = n80Var.b(ofVar);
            }
        }
        ofVar = new of(this, s41Var);
        Object obj2 = ofVar.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = ofVar.Z;
        if (i == 0) {
        }
        ofVar.R = n80Var;
        ofVar.Z = 1;
        obj2 = n80Var.b(ofVar);
    }

    public final void b(g93 g93Var) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        xa6 xa6Var;
        long j3;
        fp fpVar;
        fp fpVar2;
        long j4;
        fp fpVar3;
        g93 g93Var2 = g93Var;
        int[] iArr3 = g93Var2.b;
        long[] jArr = g93Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j5 = jArr[i3];
                char c2 = 7;
                long j6 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j5 & 255) < 128) {
                            int i7 = iArr3[(i3 << 3) + i6];
                            c = c2;
                            ya6 ya6Var = (ya6) this.g0.b(i7);
                            za6 za6Var = (za6) g93Var2.b(i7);
                            if (za6Var != null) {
                                xa6Var = za6Var.a;
                            } else {
                                xa6Var = null;
                            }
                            if (xa6Var != null) {
                                j2 = j6;
                                int i8 = xa6Var.f;
                                ja4 ja4Var = xa6Var.d.A;
                                if (ya6Var == null) {
                                    Object[] objArr = ja4Var.b;
                                    long[] jArr2 = ja4Var.a;
                                    int length2 = jArr2.length - 2;
                                    iArr2 = iArr3;
                                    if (length2 >= 0) {
                                        int i9 = i4;
                                        int i10 = 0;
                                        while (true) {
                                            long j7 = jArr2[i10];
                                            j = j5;
                                            if ((((~j7) << c) & j7 & j2) != j2) {
                                                int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                for (int i12 = 0; i12 < i11; i12++) {
                                                    if ((j7 & 255) < 128) {
                                                        j4 = j7;
                                                        fb6 fb6Var = bb6.C;
                                                        if (nb3.k((fb6) objArr[(i10 << 3) + i12], fb6Var)) {
                                                            Object g = ja4Var.g(fb6Var);
                                                            if (g == null) {
                                                                g = null;
                                                            }
                                                            List list = (List) g;
                                                            if (list != null) {
                                                                fpVar3 = (fp) gt0.J0(list);
                                                            } else {
                                                                fpVar3 = null;
                                                            }
                                                            g(i8, String.valueOf(fpVar3));
                                                        }
                                                    } else {
                                                        j4 = j7;
                                                    }
                                                    j7 = j4 >> i9;
                                                }
                                                if (i11 != i9) {
                                                    break;
                                                }
                                            }
                                            if (i10 == length2) {
                                                break;
                                            }
                                            i10++;
                                            j5 = j;
                                            i9 = 8;
                                        }
                                    } else {
                                        j = j5;
                                    }
                                } else {
                                    iArr2 = iArr3;
                                    j = j5;
                                    Object[] objArr2 = ja4Var.b;
                                    long[] jArr3 = ja4Var.a;
                                    int length3 = jArr3.length - 2;
                                    if (length3 >= 0) {
                                        long[] jArr4 = jArr3;
                                        int i13 = 0;
                                        while (true) {
                                            long j8 = jArr4[i13];
                                            long[] jArr5 = jArr4;
                                            i = i6;
                                            if ((((~j8) << c) & j8 & j2) != j2) {
                                                int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                                int i15 = 0;
                                                while (i15 < i14) {
                                                    if ((j8 & 255) < 128) {
                                                        j3 = j8;
                                                        fb6 fb6Var2 = bb6.C;
                                                        if (nb3.k((fb6) objArr2[(i13 << 3) + i15], fb6Var2)) {
                                                            Object g2 = ya6Var.a.A.g(fb6Var2);
                                                            if (g2 == null) {
                                                                g2 = null;
                                                            }
                                                            List list2 = (List) g2;
                                                            if (list2 != null) {
                                                                fpVar = (fp) gt0.J0(list2);
                                                            } else {
                                                                fpVar = null;
                                                            }
                                                            Object g3 = ja4Var.g(fb6Var2);
                                                            if (g3 == null) {
                                                                g3 = null;
                                                            }
                                                            List list3 = (List) g3;
                                                            if (list3 != null) {
                                                                fpVar2 = (fp) gt0.J0(list3);
                                                            } else {
                                                                fpVar2 = null;
                                                            }
                                                            if (!nb3.k(fpVar, fpVar2)) {
                                                                g(i8, String.valueOf(fpVar2));
                                                            }
                                                        }
                                                    } else {
                                                        j3 = j8;
                                                    }
                                                    i15++;
                                                    j8 = j3 >> 8;
                                                }
                                                if (i14 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i13 == length3) {
                                                break;
                                            }
                                            i13++;
                                            i6 = i;
                                            jArr4 = jArr5;
                                        }
                                        i2 = 8;
                                    }
                                }
                                i = i6;
                                i2 = 8;
                            } else {
                                throw i61.e("no value for specified key");
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            c = c2;
                            j2 = j6;
                            i = i6;
                            i2 = i4;
                        }
                        j5 = j >> i2;
                        i6 = i + 1;
                        i4 = i2;
                        c2 = c;
                        j6 = j2;
                        iArr3 = iArr2;
                        g93Var2 = g93Var;
                    }
                    iArr = iArr3;
                    if (i5 != i4) {
                        return;
                    }
                } else {
                    iArr = iArr3;
                }
                if (i3 != length) {
                    i3++;
                    g93Var2 = g93Var;
                    iArr3 = iArr;
                } else {
                    return;
                }
            }
        }
    }

    public final g93 c() {
        if (this.Z) {
            this.Z = false;
            this.e0 = u24.n(this.A.getSemanticsOwner(), ne.Y);
            this.f0 = System.currentTimeMillis();
        }
        return this.e0;
    }

    public final boolean d() {
        if (this.L != null) {
            return true;
        }
        return false;
    }

    public final void e() {
        u63 u63Var = this.L;
        if (u63Var != null) {
            Object obj = u63Var.L;
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.R;
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        h31 h31Var = (h31) arrayList.get(i);
                        int i2 = nf.a[h31Var.c.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                AutofillId s = u63Var.s(h31Var.a);
                                if (s != null && Build.VERSION.SDK_INT >= 29) {
                                    rp.k(yz0.g(obj), s);
                                }
                            } else {
                                i.d();
                                return;
                            }
                        } else {
                            j97 j97Var = h31Var.d;
                            if (j97Var != null) {
                                ViewStructure viewStructure = (ViewStructure) j97Var.B;
                                if (Build.VERSION.SDK_INT >= 29) {
                                    rp.j(yz0.g(obj), viewStructure);
                                }
                            }
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        ContentCaptureSession g = yz0.g(obj);
                        u2 z = hi2.z((View) u63Var.B);
                        Objects.requireNonNull(z);
                        rp.m(g, au.b(z.b), new long[]{Long.MIN_VALUE});
                    }
                    arrayList.clear();
                }
            }
        }
    }

    public final void f(xa6 xa6Var, ya6 ya6Var) {
        pf pfVar = new pf(0, ya6Var, this);
        xa6Var.getClass();
        List j = xa6.j(4, xa6Var);
        int size = j.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = j.get(i2);
            if (c().a(((xa6) obj).f)) {
                pfVar.o(Integer.valueOf(i), obj);
                i++;
            }
        }
        List j2 = xa6.j(4, xa6Var);
        int size2 = j2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            xa6 xa6Var2 = (xa6) j2.get(i3);
            g93 c = c();
            int i4 = xa6Var2.f;
            if (c.a(i4)) {
                p94 p94Var = this.g0;
                if (p94Var.a(i4)) {
                    Object b = p94Var.b(i4);
                    if (b != null) {
                        f(xa6Var2, (ya6) b);
                    } else {
                        throw i61.e("node not present in pruned tree before this change");
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public final void g(int i, String str) {
        u63 u63Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && (u63Var = this.L) != null) {
            AutofillId s = u63Var.s(i);
            if (s != null) {
                if (i2 >= 29) {
                    rp.l(yz0.g(u63Var.L), s, str);
                    return;
                }
                return;
            }
            throw i61.e("Invalid content capture ID");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0097, code lost:
        if (r8 == null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(int i, xa6 xa6Var) {
        qn2 qn2Var;
        int i2;
        u2 z;
        AutofillId b;
        j97 j97Var;
        of5 of5Var;
        j97 j97Var2;
        String d0;
        int size;
        qn2 qn2Var2;
        if (!d()) {
            return;
        }
        ja4 ja4Var = xa6Var.d.A;
        Object g = ja4Var.g(bb6.E);
        eg4 eg4Var = null;
        if (g == null) {
            g = null;
        }
        Boolean bool = (Boolean) g;
        if (this.Y == lf.SHOW_ORIGINAL && nb3.k(bool, Boolean.TRUE)) {
            Object g2 = ja4Var.g(sa6.m);
            if (g2 == null) {
                g2 = null;
            }
            y1 y1Var = (y1) g2;
            if (y1Var != null && (qn2Var2 = (qn2) y1Var.b) != null) {
                Boolean bool2 = (Boolean) qn2Var2.g(Boolean.FALSE);
            }
        } else if (this.Y == lf.SHOW_TRANSLATED && nb3.k(bool, Boolean.FALSE)) {
            Object g3 = ja4Var.g(sa6.m);
            if (g3 == null) {
                g3 = null;
            }
            y1 y1Var2 = (y1) g3;
            if (y1Var2 != null && (qn2Var = (qn2) y1Var2.b) != null) {
                Boolean bool3 = (Boolean) qn2Var.g(Boolean.TRUE);
            }
        }
        int i3 = xa6Var.f;
        u63 u63Var = this.L;
        if (u63Var != null && (i2 = Build.VERSION.SDK_INT) >= 29 && (z = hi2.z(this.A)) != null) {
            xa6 l = xa6Var.l();
            int i4 = xa6Var.f;
            if (l != null) {
                b = u63Var.s(l.f);
            } else {
                b = au.b(z.b);
            }
            long j = i4;
            if (i2 >= 29) {
                j97Var = new j97(rp.i(yz0.g(u63Var.L), b, j), 10);
            } else {
                j97Var = null;
            }
            if (j97Var != null) {
                ViewStructure viewStructure = (ViewStructure) j97Var.B;
                ta6 ta6Var = xa6Var.d;
                fb6 fb6Var = bb6.L;
                ja4 ja4Var2 = ta6Var.A;
                if (!ja4Var2.c(fb6Var)) {
                    Bundle extras = viewStructure.getExtras();
                    if (extras != null) {
                        extras.putLong("android.view.contentcapture.EventTimestamp", this.f0);
                        extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                    }
                    Object g4 = ja4Var2.g(bb6.A);
                    if (g4 == null) {
                        g4 = null;
                    }
                    String str = (String) g4;
                    if (str != null) {
                        viewStructure.setId(i4, null, null, str);
                    }
                    Object g5 = ja4Var2.g(bb6.n);
                    if (g5 == null) {
                        g5 = null;
                    }
                    if (((Boolean) g5) != null) {
                        viewStructure.setClassName("android.widget.ViewGroup");
                    }
                    Object g6 = ja4Var2.g(bb6.C);
                    if (g6 == null) {
                        g6 = null;
                    }
                    List list = (List) g6;
                    if (list != null) {
                        viewStructure.setClassName("android.widget.TextView");
                        viewStructure.setText(ex3.a(62, null, "\n", list));
                    }
                    Object g7 = ja4Var2.g(bb6.G);
                    if (g7 == null) {
                        g7 = null;
                    }
                    fp fpVar = (fp) g7;
                    if (fpVar != null) {
                        viewStructure.setClassName("android.widget.EditText");
                        viewStructure.setText(fpVar);
                    }
                    Object g8 = ja4Var2.g(bb6.a);
                    if (g8 == null) {
                        g8 = null;
                    }
                    List list2 = (List) g8;
                    if (list2 != null) {
                        viewStructure.setContentDescription(ex3.a(62, null, "\n", list2));
                    }
                    Object g9 = ja4Var2.g(bb6.z);
                    if (g9 == null) {
                        g9 = null;
                    }
                    mq5 mq5Var = (mq5) g9;
                    if (mq5Var != null && (d0 = ln2.d0(mq5Var.a)) != null) {
                        viewStructure.setClassName(d0);
                    }
                    a47 E = ln2.E(ta6Var);
                    if (E != null) {
                        z37 z37Var = E.a;
                        s47 s47Var = z37Var.b;
                        qh1 qh1Var = z37Var.g;
                        viewStructure.setTextStyle(qh1Var.Y() * qh1Var.a() * x47.c(s47Var.a.b), 0, 0, 0);
                    }
                    eg4 d = xa6Var.d();
                    if (d != null) {
                        if (d.Y0().j0) {
                            eg4Var = d;
                        }
                        if (eg4Var != null) {
                            of5Var = xa6Var.a(eg4Var);
                            float f = of5Var.a;
                            float f2 = of5Var.b;
                            viewStructure.setDimens((int) f, (int) f2, 0, 0, (int) (of5Var.c - f), (int) (of5Var.d - f2));
                            j97Var2 = j97Var;
                            if (j97Var2 != null) {
                                this.R.add(new h31(i3, this.f0, i31.VIEW_APPEAR, j97Var2));
                            }
                            List j2 = xa6.j(4, xa6Var);
                            size = j2.size();
                            int i5 = 0;
                            for (int i6 = 0; i6 < size; i6++) {
                                Object obj = j2.get(i6);
                                if (c().a(((xa6) obj).f)) {
                                    i(i5, (xa6) obj);
                                    i5++;
                                }
                            }
                        }
                    }
                    of5Var = of5.e;
                    float f3 = of5Var.a;
                    float f22 = of5Var.b;
                    viewStructure.setDimens((int) f3, (int) f22, 0, 0, (int) (of5Var.c - f3), (int) (of5Var.d - f22));
                    j97Var2 = j97Var;
                    if (j97Var2 != null) {
                    }
                    List j22 = xa6.j(4, xa6Var);
                    size = j22.size();
                    int i52 = 0;
                    while (i6 < size) {
                    }
                }
            }
        }
        j97Var2 = null;
        if (j97Var2 != null) {
        }
        List j222 = xa6.j(4, xa6Var);
        size = j222.size();
        int i522 = 0;
        while (i6 < size) {
        }
    }

    public final void j(xa6 xa6Var) {
        if (d()) {
            this.R.add(new h31(xa6Var.f, this.f0, i31.VIEW_DISAPPEAR, null));
            List j = xa6.j(4, xa6Var);
            int size = j.size();
            for (int i = 0; i < size; i++) {
                j((xa6) j.get(i));
            }
        }
    }

    public final void k() {
        p94 p94Var = this.g0;
        p94Var.c();
        g93 c = c();
        int[] iArr = c.b;
        Object[] objArr = c.c;
        long[] jArr = c.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            p94Var.i(iArr[i4], new ya6(((za6) objArr[i4]).a, c()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        this.h0 = new ya6(this.A.getSemanticsOwner().a(), c());
    }

    @Override // defpackage.qe1
    public final void onStart(hu3 hu3Var) {
        this.L = (u63) this.B.c();
        i(-1, this.A.getSemanticsOwner().a());
        e();
    }

    @Override // defpackage.qe1
    public final void onStop(hu3 hu3Var) {
        j(this.A.getSemanticsOwner().a());
        e();
        this.L = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.A.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.j0);
        this.L = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
