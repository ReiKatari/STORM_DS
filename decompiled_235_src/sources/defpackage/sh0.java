package defpackage;

import android.os.Looper;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sh0  reason: default package */
/* loaded from: classes.dex */
public final class sh0 {
    public final Object a = new Object();
    public final s63 b = new s63(14, (byte) 0);
    public final s94 c = new qx3();
    public sf0 d;
    public dg0 e;
    public tx f;
    public boolean g;
    public final LinkedHashMap h;

    /* JADX WARN: Type inference failed for: r0v2, types: [qx3, s94] */
    public sh0() {
        dg0 dg0Var = dg0.CLOSED;
        this.e = dg0Var;
        this.h = new LinkedHashMap();
        c(dg0Var, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(sf0 sf0Var, pt2 pt2Var) {
        ph0 ph0Var;
        lt2 lt2Var = lt2.b;
        lt2 lt2Var2 = lt2.c;
        if (sf0Var != this.d) {
            if (kj2.F("CXCP")) {
                Log.d("CXCP", "Ignored stale transition " + pt2Var + " for " + sf0Var);
                return;
            }
            return;
        }
        dg0 dg0Var = this.e;
        dg0Var.getClass();
        pt2Var.getClass();
        int i = rh0.a[dg0Var.ordinal()];
        ph0 ph0Var2 = null;
        if (i != 1) {
            nt2 nt2Var = nt2.b;
            mt2 mt2Var = mt2.b;
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            if (pt2Var.equals(lt2Var2)) {
                                ph0Var = new ph0(dg0.OPENING, null);
                            } else if (pt2Var.equals(lt2Var)) {
                                ph0Var = new ph0(dg0.OPEN, null);
                            } else if (pt2Var instanceof kt2) {
                                int i2 = ((kt2) pt2Var).b;
                                ph0Var2 = g04.I(i2) ? new ph0(dg0.PENDING_OPEN, g04.T(i2)) : new ph0(dg0.CLOSED, g04.T(i2));
                            }
                            ph0Var2 = ph0Var;
                        }
                        if (ph0Var2 == null) {
                            if (kj2.L()) {
                                Log.w("CXCP", "Impermissible state transition: current camera internal state: " + this.e + ", received graph state: " + pt2Var);
                                return;
                            }
                            return;
                        }
                        this.e = ph0Var2.a;
                        this.f = ph0Var2.b;
                        if (kj2.F("CXCP")) {
                            Log.d("CXCP", "Updated current camera internal state to " + ph0Var2);
                        }
                        c(this.e, this.f);
                        return;
                    }
                    if (pt2Var.equals(mt2Var)) {
                        ph0Var = new ph0(dg0.CLOSED, null);
                    } else if (pt2Var.equals(lt2Var2)) {
                        ph0Var = new ph0(dg0.OPENING, null);
                    } else {
                        if (pt2Var instanceof kt2) {
                            ph0Var2 = new ph0(dg0.CLOSING, g04.T(((kt2) pt2Var).b));
                        }
                        if (ph0Var2 == null) {
                        }
                    }
                    ph0Var2 = ph0Var;
                    if (ph0Var2 == null) {
                    }
                } else {
                    if (pt2Var.equals(nt2Var)) {
                        ph0Var = new ph0(dg0.CLOSING, null);
                    } else if (pt2Var.equals(mt2Var)) {
                        ph0Var = new ph0(dg0.CLOSED, null);
                    } else {
                        if (pt2Var instanceof kt2) {
                            int i3 = ((kt2) pt2Var).b;
                            ph0Var2 = g04.I(i3) ? new ph0(dg0.PENDING_OPEN, g04.T(i3)) : new ph0(dg0.CLOSED, g04.T(i3));
                        }
                        if (ph0Var2 == null) {
                        }
                    }
                    ph0Var2 = ph0Var;
                    if (ph0Var2 == null) {
                    }
                }
            } else {
                if (pt2Var.equals(lt2Var)) {
                    ph0Var = new ph0(dg0.OPEN, null);
                } else {
                    if (pt2Var instanceof kt2) {
                        kt2 kt2Var = (kt2) pt2Var;
                        int i4 = kt2Var.b;
                        ph0Var2 = kt2Var.c ? new ph0(dg0.OPENING, g04.T(i4)) : g04.I(i4) ? new ph0(dg0.PENDING_OPEN, g04.T(i4)) : new ph0(dg0.CLOSING, g04.T(i4));
                    } else if (pt2Var.equals(nt2Var)) {
                        ph0Var = new ph0(dg0.CLOSING, null);
                    } else if (pt2Var.equals(mt2Var)) {
                        ph0Var = new ph0(dg0.CLOSED, null);
                    }
                    if (ph0Var2 == null) {
                    }
                }
                ph0Var2 = ph0Var;
                if (ph0Var2 == null) {
                }
            }
        } else {
            if (pt2Var.equals(lt2Var2)) {
                ph0Var = new ph0(dg0.OPENING, null);
            } else {
                if (pt2Var.equals(lt2Var)) {
                    ph0Var = new ph0(dg0.OPEN, null);
                }
                if (ph0Var2 == null) {
                }
            }
            ph0Var2 = ph0Var;
            if (ph0Var2 == null) {
            }
        }
    }

    public final void b(sf0 sf0Var, pt2 pt2Var) {
        pt2Var.getClass();
        synchronized (this.a) {
            if (this.g) {
                if (kj2.L()) {
                    Log.w("CXCP", "Ignoring graph state update " + pt2Var + " on removed camera.");
                }
                return;
            }
            if (kj2.F("CXCP")) {
                Log.d("CXCP", sf0Var + " state updated to " + pt2Var);
            }
            a(sf0Var, pt2Var);
        }
    }

    public final void c(dg0 dg0Var, tx txVar) {
        nh0 nh0Var;
        List<Map.Entry> k1;
        ((s94) this.b.B).g(new u2(dg0Var, 4));
        dg0Var.getClass();
        int i = qh0.a[dg0Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            nh0Var = nh0.PENDING_OPEN;
                        } else {
                            e41.w(dg0Var, "Unexpected CameraInternal state: ");
                            return;
                        }
                    } else {
                        nh0Var = nh0.CLOSING;
                    }
                } else {
                    nh0Var = nh0.OPEN;
                }
            } else {
                nh0Var = nh0.OPENING;
            }
        } else {
            nh0Var = nh0.CLOSED;
        }
        sx sxVar = new sx(nh0Var, txVar);
        s94 s94Var = this.c;
        s94Var.getClass();
        if (nb3.k(Looper.myLooper(), Looper.getMainLooper())) {
            s94Var.f(sxVar);
        } else {
            s94Var.g(sxVar);
        }
        synchronized (this.a) {
            k1 = gt0.k1(this.h.entrySet());
        }
        for (Map.Entry entry : k1) {
            ((Executor) entry.getValue()).execute(new mf(8, (b31) entry.getKey(), sxVar));
        }
    }
}
