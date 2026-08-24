package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hk1  reason: default package */
/* loaded from: classes.dex */
public final class hk1 extends lz6 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk1(af5 af5Var) {
        super(i61.n(new StringBuilder(), af5Var.m, " writer"), true);
        this.e = 2;
        this.f = af5Var;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [ui6, java.lang.Object] */
    @Override // defpackage.lz6
    public final long a() {
        int i = 0;
        switch (this.e) {
            case 0:
                kk1 kk1Var = (kk1) this.f;
                synchronized (kk1Var) {
                    if (kk1Var.i0 && !kk1Var.j0) {
                        try {
                            kk1Var.J();
                        } catch (IOException unused) {
                            kk1Var.k0 = true;
                        }
                        try {
                            if (kk1Var.u()) {
                                kk1Var.D();
                                kk1Var.f0 = 0;
                            }
                        } catch (IOException unused2) {
                            kk1Var.l0 = true;
                            ee5 ee5Var = kk1Var.d0;
                            if (ee5Var != null) {
                                yy7.b(ee5Var);
                            }
                            kk1Var.d0 = new ee5(new Object());
                        }
                    }
                }
                return -1L;
            case 1:
                ls1 ls1Var = (ls1) this.f;
                long nanoTime = System.nanoTime();
                Iterator it = ((ConcurrentLinkedQueue) ls1Var.d).iterator();
                it.getClass();
                ke5 ke5Var = null;
                ke5 ke5Var2 = null;
                long j = Long.MAX_VALUE;
                long j2 = (nanoTime - ls1Var.a) + 1;
                ke5 ke5Var3 = null;
                int i2 = 0;
                while (it.hasNext()) {
                    ke5 ke5Var4 = (ke5) it.next();
                    ke5Var4.getClass();
                    synchronized (ke5Var4) {
                        if (ls1Var.c(ke5Var4, nanoTime) > 0) {
                            i2++;
                        } else {
                            long j3 = ke5Var4.q;
                            if (j3 < j2) {
                                ke5Var3 = ke5Var4;
                                j2 = j3;
                            }
                            i++;
                            if (j3 < j) {
                                ke5Var2 = ke5Var4;
                                j = j3;
                            }
                        }
                    }
                }
                if (ke5Var3 != null) {
                    ke5Var = ke5Var3;
                } else if (i > 5) {
                    j2 = j;
                    ke5Var = ke5Var2;
                } else {
                    j2 = -1;
                }
                if (ke5Var != null) {
                    synchronized (ke5Var) {
                        if (ke5Var.p.isEmpty() && ke5Var.q == j2) {
                            ke5Var.j = true;
                            ((ConcurrentLinkedQueue) ls1Var.d).remove(ke5Var);
                            az7.c(ke5Var.e);
                            if (((ConcurrentLinkedQueue) ls1Var.d).isEmpty()) {
                                pz6 pz6Var = (pz6) ls1Var.b;
                                synchronized (pz6Var.a) {
                                    if (pz6Var.a()) {
                                        pz6Var.a.c(pz6Var);
                                    }
                                }
                            }
                        }
                    }
                    return 0L;
                } else if (ke5Var2 != null) {
                    return (j + ls1Var.a) - nanoTime;
                } else {
                    if (i2 <= 0) {
                        return -1L;
                    }
                    return ls1Var.a;
                }
            default:
                af5 af5Var = (af5) this.f;
                try {
                } catch (IOException e) {
                    af5.c(af5Var, e, 2);
                }
                if (af5Var.g()) {
                    return 0L;
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hk1(String str, int i, Object obj) {
        super(str, true);
        this.e = i;
        this.f = obj;
    }
}
