package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dg1  reason: default package */
/* loaded from: classes.dex */
public final class dg1 extends bn6 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg1(String str, ki2 ki2Var) {
        super(str);
        this.e = 2;
        this.f = ki2Var;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [g76, java.lang.Object] */
    @Override // defpackage.bn6
    public final long a() {
        long j;
        x45 x45Var;
        int i = 0;
        long j2 = -1;
        switch (this.e) {
            case 0:
                gg1 gg1Var = (gg1) this.f;
                synchronized (gg1Var) {
                    if (gg1Var.h0 && !gg1Var.i0) {
                        try {
                            gg1Var.K();
                        } catch (IOException unused) {
                            gg1Var.j0 = true;
                        }
                        try {
                            if (gg1Var.B()) {
                                gg1Var.I();
                                gg1Var.e0 = 0;
                            }
                        } catch (IOException unused2) {
                            gg1Var.k0 = true;
                            r45 r45Var = gg1Var.c0;
                            if (r45Var != null) {
                                gk7.b(r45Var);
                            }
                            gg1Var.c0 = new r45(new Object());
                        }
                    }
                }
                return -1L;
            case 1:
                bo1 bo1Var = (bo1) this.f;
                long nanoTime = System.nanoTime();
                Iterator it = ((ConcurrentLinkedQueue) bo1Var.d).iterator();
                it.getClass();
                long j3 = Long.MAX_VALUE;
                x45 x45Var2 = null;
                long j4 = (nanoTime - bo1Var.a) + 1;
                x45 x45Var3 = null;
                int i2 = 0;
                while (it.hasNext()) {
                    long j5 = j2;
                    x45 x45Var4 = (x45) it.next();
                    x45Var4.getClass();
                    synchronized (x45Var4) {
                        if (bo1Var.c(x45Var4, nanoTime) > 0) {
                            i2++;
                        } else {
                            long j6 = j4;
                            long j7 = x45Var4.q;
                            if (j7 < j6) {
                                x45Var3 = x45Var4;
                                j6 = j7;
                            }
                            i++;
                            if (j7 < j3) {
                                x45Var2 = x45Var4;
                                j3 = j7;
                            }
                            j4 = j6;
                        }
                    }
                    j2 = j5;
                }
                long j8 = j2;
                long j9 = j4;
                if (x45Var3 != null) {
                    x45Var = x45Var3;
                    j = j9;
                } else if (i > 5) {
                    j = j3;
                    x45Var = x45Var2;
                } else {
                    j = j8;
                    x45Var = null;
                }
                if (x45Var != null) {
                    synchronized (x45Var) {
                        if (x45Var.p.isEmpty() && x45Var.q == j) {
                            x45Var.j = true;
                            ((ConcurrentLinkedQueue) bo1Var.d).remove(x45Var);
                            ik7.b(x45Var.e);
                            if (!((ConcurrentLinkedQueue) bo1Var.d).isEmpty()) {
                                return 0L;
                            }
                            en6 en6Var = (en6) bo1Var.b;
                            synchronized (en6Var.a) {
                                if (en6Var.a()) {
                                    en6Var.a.c(en6Var);
                                }
                            }
                            return 0L;
                        }
                        return 0L;
                    }
                } else if (x45Var2 != null) {
                    return (j3 + bo1Var.a) - nanoTime;
                } else {
                    if (i2 > 0) {
                        return bo1Var.a;
                    }
                    return j8;
                }
            default:
                ((ki2) this.f).c();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dg1(int i, Object obj, String str) {
        super(str);
        this.e = i;
        this.f = obj;
    }
}
