package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qm6  reason: default package */
/* loaded from: classes.dex */
public final class qm6 {
    public final qn2 a;
    public boolean c;
    public h61 h;
    public pm6 i;
    public final AtomicReference b = new AtomicReference(null);
    public final y36 d = new y36(this, 6);
    public final ro5 e = new ro5(this, 14);
    public final ua4 f = new ua4(new pm6[16]);
    public final Object g = new Object();
    public long j = -1;

    public qm6(qn2 qn2Var) {
        this.a = qn2Var;
    }

    public final void a() {
        synchronized (this.g) {
            ua4 ua4Var = this.f;
            Object[] objArr = ua4Var.A;
            int i = ua4Var.L;
            for (int i2 = 0; i2 < i; i2++) {
                pm6 pm6Var = (pm6) objArr[i2];
                pm6Var.e.a();
                pm6Var.f.a();
                pm6Var.l.a();
                pm6Var.m.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080 A[Catch: all -> 0x008e, TryCatch #0 {all -> 0x008e, blocks: (B:4:0x0007, B:8:0x0011, B:27:0x0078, B:29:0x0080, B:34:0x0090, B:31:0x0085, B:11:0x0021, B:14:0x002d, B:16:0x0041, B:18:0x004f, B:20:0x0059, B:22:0x0069, B:26:0x0074, B:35:0x0094), top: B:40:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(n96 n96Var) {
        int i;
        int i2;
        synchronized (this.g) {
            try {
                ua4 ua4Var = this.f;
                int i3 = ua4Var.L;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    Object[] objArr = ua4Var.A;
                    if (i4 < i3) {
                        pm6 pm6Var = (pm6) objArr[i4];
                        y94 y94Var = (y94) pm6Var.f.k(n96Var);
                        if (y94Var != null) {
                            Object[] objArr2 = y94Var.b;
                            int[] iArr = y94Var.c;
                            long[] jArr = y94Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j = jArr[i6];
                                    i = i4;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                                        int i8 = 0;
                                        while (i8 < i7) {
                                            if ((j & 255) < 128) {
                                                int i9 = (i6 << 3) + i8;
                                                i2 = i8;
                                                Object obj = objArr2[i9];
                                                int i10 = iArr[i9];
                                                pm6Var.c(n96Var, obj);
                                            } else {
                                                i2 = i8;
                                            }
                                            j >>= 8;
                                            i8 = i2 + 1;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                    }
                                    if (i6 == length) {
                                        break;
                                    }
                                    i6++;
                                    i4 = i;
                                }
                                if (pm6Var.f.j()) {
                                    i5++;
                                } else if (i5 > 0) {
                                    Object[] objArr3 = ua4Var.A;
                                    objArr3[i - i5] = objArr3[i];
                                }
                                i4 = i + 1;
                            }
                        }
                        i = i4;
                        if (pm6Var.f.j()) {
                        }
                        i4 = i + 1;
                    } else {
                        int i11 = i3 - i5;
                        Arrays.fill(objArr, i11, i3, (Object) null);
                        ua4Var.L = i11;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.g) {
            z = this.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                List list = null;
                List list2 = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else if (obj instanceof List) {
                    List list3 = (List) obj;
                    Set set3 = (Set) list3.get(0);
                    if (list3.size() == 2) {
                        list2 = list3.get(1);
                    } else if (list3.size() > 2) {
                        list2 = list3.subList(1, list3.size());
                    }
                    set2 = set3;
                    list = list2;
                } else {
                    tx0.b("Unexpected notification");
                    e41.c();
                    return false;
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.g) {
                ua4 ua4Var = this.f;
                Object[] objArr = ua4Var.A;
                int i = ua4Var.L;
                for (int i2 = 0; i2 < i; i2++) {
                    if (!((pm6) objArr[i2]).a(set) && !z2) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x021b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0, types: [ua4] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Object obj, qn2 qn2Var, on2 on2Var) {
        ?? r6;
        pm6 pm6Var;
        pm6 pm6Var2;
        boolean z;
        pm6 pm6Var3;
        long j;
        long j2;
        pm6 pm6Var4;
        vl6 nb7Var;
        oa4 oa4Var;
        long j3;
        y94 y94Var;
        int i;
        long j4;
        y94 y94Var2;
        boolean z2;
        long s = kj2.s();
        synchronized (this.g) {
            r6 = this.f;
            Object[] objArr = r6.A;
            int i2 = r6.L;
            int i3 = 0;
            while (true) {
                if (i3 < i2) {
                    Object obj2 = objArr[i3];
                    if (((pm6) obj2).a == qn2Var) {
                        pm6Var = obj2;
                        break;
                    }
                    i3++;
                } else {
                    pm6Var = null;
                    break;
                }
            }
            pm6Var2 = pm6Var;
            z = true;
            if (pm6Var2 == null) {
                qn2Var.getClass();
                ge7.p(1, qn2Var);
                pm6Var2 = new pm6(qn2Var);
                r6.b(pm6Var2);
            }
            pm6Var3 = this.i;
            j = this.j;
        }
        long j5 = r6;
        if (j != -1) {
            j5 = r6;
            if (j != s) {
                StringBuilder s2 = xg6.s(j, "Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=");
                s2.append(s);
                s2.append(", name=");
                s2.append(Thread.currentThread().getName());
                s2.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
                r05.a(s2.toString());
                j5 = "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.";
            }
        }
        try {
            synchronized (this.g) {
                try {
                    this.i = pm6Var2;
                    this.j = s;
                } catch (Throwable th) {
                    th = th;
                    j2 = j5;
                }
            }
            ro5 ro5Var = this.e;
            Object obj3 = pm6Var2.b;
            y94 y94Var3 = pm6Var2.c;
            int i4 = pm6Var2.d;
            pm6Var2.b = obj;
            pm6Var2.c = (y94) pm6Var2.f.g(obj);
            if (pm6Var2.d == -1) {
                pm6Var2.d = Long.hashCode(bm6.j().g());
            }
            wq2 wq2Var = pm6Var2.i;
            ua4 H = np2.H();
            try {
                H.b(wq2Var);
                if (ro5Var == null) {
                    on2Var.c();
                    pm6Var4 = pm6Var2;
                } else {
                    vl6 vl6Var = (vl6) bm6.b.f();
                    if (vl6Var instanceof nb7) {
                        pm6Var4 = pm6Var2;
                        if (((nb7) vl6Var).t == kj2.s()) {
                            qn2 qn2Var2 = ((nb7) vl6Var).r;
                            qn2 qn2Var3 = ((nb7) vl6Var).s;
                            ((nb7) vl6Var).r = bm6.k(ro5Var, qn2Var2, true);
                            ((nb7) vl6Var).s = qn2Var3;
                            on2Var.c();
                            ((nb7) vl6Var).r = qn2Var2;
                            ((nb7) vl6Var).s = qn2Var3;
                        }
                    } else {
                        pm6Var4 = pm6Var2;
                    }
                    if (vl6Var != null && !(vl6Var instanceof oa4)) {
                        nb7Var = vl6Var.u(ro5Var);
                    } else {
                        if (vl6Var instanceof oa4) {
                            oa4Var = (oa4) vl6Var;
                        } else {
                            oa4Var = null;
                        }
                        nb7Var = new nb7(oa4Var, ro5Var, null, true, false);
                    }
                    try {
                        vl6 j6 = nb7Var.j();
                        try {
                            on2Var.c();
                            vl6.q(j6);
                            nb7Var.c();
                        } catch (Throwable th2) {
                            j5 = j;
                            try {
                                vl6.q(j6);
                                throw th2;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    nb7Var.c();
                                    throw th;
                                } catch (Throwable th4) {
                                    th = th4;
                                    H.l(H.L - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        j5 = j;
                    }
                }
                H.l(H.L - 1);
                pm6 pm6Var5 = pm6Var4;
                Object obj4 = pm6Var5.b;
                obj4.getClass();
                int i5 = pm6Var5.d;
                y94 y94Var4 = pm6Var5.c;
                if (y94Var4 != null) {
                    try {
                        long[] jArr = y94Var4.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j7 = jArr[i6];
                                boolean z3 = z;
                                y94 y94Var5 = y94Var4;
                                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j7 & 255) < 128) {
                                            i = i8;
                                            int i9 = (i6 << 3) + i;
                                            j4 = j7;
                                            y94Var2 = y94Var5;
                                            Object obj5 = y94Var2.b[i9];
                                            j3 = j;
                                            try {
                                                if (y94Var2.c[i9] != i5) {
                                                    z2 = z3;
                                                } else {
                                                    z2 = false;
                                                }
                                                if (z2) {
                                                    pm6Var5.c(obj4, obj5);
                                                }
                                                if (z2) {
                                                    y94Var2.f(i9);
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                j2 = j3;
                                                synchronized (this.g) {
                                                    this.i = pm6Var3;
                                                    this.j = j2;
                                                }
                                                throw th;
                                            }
                                        } else {
                                            i = i8;
                                            j4 = j7;
                                            y94Var2 = y94Var5;
                                            j3 = j;
                                        }
                                        i8 = i + 1;
                                        long j8 = j3;
                                        y94Var5 = y94Var2;
                                        j7 = j4 >> 8;
                                        j = j8;
                                    }
                                    y94Var = y94Var5;
                                    j3 = j;
                                    if (i7 != 8) {
                                        break;
                                    }
                                } else {
                                    y94Var = y94Var5;
                                    j3 = j;
                                }
                                if (i6 == length) {
                                    break;
                                }
                                i6++;
                                y94Var4 = y94Var;
                                z = z3;
                                j = j3;
                            }
                            pm6Var5.b = obj3;
                            pm6Var5.c = y94Var3;
                            pm6Var5.d = i4;
                            synchronized (this.g) {
                                this.i = pm6Var3;
                                this.j = j3;
                            }
                            return;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        j3 = j;
                        j2 = j3;
                        synchronized (this.g) {
                        }
                    }
                }
                j3 = j;
                pm6Var5.b = obj3;
                pm6Var5.c = y94Var3;
                pm6Var5.d = i4;
                synchronized (this.g) {
                }
            } catch (Throwable th8) {
                th = th8;
                j5 = j;
            }
        } catch (Throwable th9) {
            th = th9;
            j2 = j;
        }
    }

    public final void e() {
        y36 y36Var = this.d;
        bm6.e(bm6.a);
        synchronized (bm6.c) {
            bm6.h = gt0.U0(y36Var, bm6.h);
        }
        this.h = new h61(y36Var, 20);
    }
}
