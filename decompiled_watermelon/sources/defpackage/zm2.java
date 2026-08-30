package defpackage;

import android.util.Log;
import androidx.preference.Preference;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zm2  reason: default package */
/* loaded from: classes.dex */
public final class zm2 implements Closeable {
    public final hd0 A;
    public final Map B;
    public final Map L;
    public final ArrayList R;
    public final o31 X;
    public final g11 Y;
    public final r9 Z;
    public final Object c0;
    public volatile boolean d0;
    public vh0 e0;
    public sa5 f0;
    public final Map g0;
    public final aw h0;
    public sa5 i0;
    public Map j0;
    public Map k0;
    public Map l0;
    public final List m0;
    public vh0 n0;

    /* JADX WARN: Type inference failed for: r11v0, types: [r9, java.lang.Object] */
    public zm2(hd0 hd0Var, Map map, Map map2, ArrayList arrayList, ArrayList arrayList2, o31 o31Var, g31 g31Var) {
        map.getClass();
        map2.getClass();
        o31Var.getClass();
        this.A = hd0Var;
        this.B = map;
        this.L = map2;
        this.R = arrayList2;
        this.X = o31Var;
        g11 c = iq2.c(se.O(g31Var, new j31("CXCP-GraphLoop")));
        this.Y = c;
        z zVar = new z(1, this, zm2.class, "finalizeUnprocessedCommands", "finalizeUnprocessedCommands(Ljava/util/List;)V", 0, 0, 16);
        h4 h4Var = new h4(2, this, zm2.class, "process", "process(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 5);
        ?? obj = new Object();
        obj.a = zVar;
        obj.b = h4Var;
        obj.c = w81.e(false);
        obj.d = n40.f(Preference.DEFAULT_ORDER, null, new kb2(22, obj), 2);
        obj.e = new xt();
        if (((aw) obj.c).a()) {
            if (tq5.w(c, null, null, new ys3(obj, null, 3), 3).isCancelled()) {
                obj.E(null);
            }
            this.Z = obj;
            this.c0 = new Object();
            qp1 qp1Var = qp1.A;
            this.g0 = qp1Var;
            this.h0 = w81.e(true);
            this.j0 = qp1Var;
            this.k0 = qp1Var;
            this.l0 = map2;
            this.m0 = arrayList;
            return;
        }
        i.n("ProcessingQueue cannot be re-started!");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0119  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, l75] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00be -> B:37:0x00da). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d6 -> B:36:0x00d8). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e7 -> B:39:0x00e8). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(java.util.List r18, int r19, defpackage.sm2 r20, defpackage.j11 r21) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zm2.B(java.util.List, int, sm2, j11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
        if (r3 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
        if (r3 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0093 -> B:48:0x00cb). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00b7 -> B:47:0x00c9). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00c6 -> B:47:0x00c9). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(java.util.List r12, defpackage.j11 r13) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zm2.C(java.util.List, j11):java.lang.Object");
    }

    public final void D(List list, int i, tm2 tm2Var) {
        sa5 sa5Var = this.i0;
        if (sa5Var == null && i == 0) {
            list.remove(i);
        } else if (this.h0.b() && sa5Var != null && i(l07.b0(sa5Var), tm2Var.a, false)) {
            list.remove(i);
        } else if (i > 0) {
            int i2 = i - 1;
            if (((um2) list.get(i2)) instanceof rm2) {
                x(list, i2, false);
            } else {
                i.n("Check failed.");
            }
        }
    }

    public final boolean F() {
        Boolean bool;
        vh0 vh0Var = this.n0;
        if (vh0Var != null) {
            sa5 sa5Var = this.i0;
            if (sa5Var != null) {
                bool = Boolean.valueOf(vh0Var.v(true, l07.b0(sa5Var), this.B, this.j0, this.l0, this.m0));
            } else {
                bool = null;
            }
            return b53.x(bool, Boolean.TRUE);
        }
        return false;
    }

    public final void I(boolean z) {
        this.h0.a = z ? 1 : 0;
        if (z) {
            this.Z.H(nm2.b);
        }
    }

    public final void J(vh0 vh0Var) {
        synchronized (this.c0) {
            vh0 vh0Var2 = this.e0;
            this.e0 = vh0Var;
            if (this.d0) {
                this.e0 = null;
                if (vh0Var != null) {
                    tq5.w(this.X, null, null, new wm2(vh0Var, null, 1), 3);
                }
                return;
            }
            if (vh0Var2 != vh0Var) {
                this.Z.H(new sm2(vh0Var2, vh0Var));
            }
            if (vh0Var == null) {
                int size = this.R.size();
                for (int i = 0; i < size; i++) {
                    ((vm2) this.R.get(i)).a();
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c0) {
            try {
                if (this.d0) {
                    return;
                }
                this.d0 = true;
                vh0 vh0Var = this.e0;
                if (vh0Var != null) {
                    tq5.w(this.X, null, null, new wm2(vh0Var, null, 0), 3);
                }
                this.e0 = null;
                this.Z.H(nm2.c);
                int size = this.R.size();
                for (int i = 0; i < size; i++) {
                    ((vm2) this.R.get(i)).b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sa5 sa5Var = (sa5) arrayList.get(i);
            List list = this.m0;
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((ra5) list.get(i2)).N(sa5Var);
            }
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            sa5 sa5Var2 = (sa5) arrayList.get(i3);
            int size4 = sa5Var2.d.size();
            for (int i4 = 0; i4 < size4; i4++) {
                ((ra5) sa5Var2.d.get(i4)).N(sa5Var2);
            }
        }
    }

    public final boolean i(List list, Map map, boolean z) {
        Map b;
        vh0 vh0Var = this.n0;
        if (vh0Var == null) {
            return false;
        }
        Map map2 = this.j0;
        if (map.isEmpty()) {
            b = this.l0;
        } else {
            mt3 mt3Var = new mt3();
            Map map3 = this.k0;
            map3.getClass();
            mt3Var.putAll(map3);
            mt3Var.putAll(map);
            Map map4 = this.L;
            map4.getClass();
            mt3Var.putAll(map4);
            b = mt3Var.b();
        }
        Map map5 = b;
        boolean v = vh0Var.v(z, list, this.B, map2, map5, this.m0);
        if (!v) {
            if (z) {
                Log.w("CXCP", "Failed to repeat with " + tq0.e1(list));
                return v;
            } else if (map.isEmpty()) {
                Log.w("CXCP", "Failed to submit capture with " + list);
                return v;
            } else {
                Log.w("CXCP", "Failed to trigger with " + tq0.e1(list) + " and " + map);
            }
        }
        return v;
    }

    public final sa5 p() {
        sa5 sa5Var;
        synchronized (this.c0) {
            sa5Var = this.f0;
        }
        return sa5Var;
    }

    public final String toString() {
        return "GraphLoop(" + this.A + ')';
    }

    public final void w(List list, int i, om2 om2Var, boolean z) {
        if (this.h0.b() && i(null, qp1.A, false)) {
            list.remove(i);
        } else if (z && i > 0) {
            int i2 = i - 1;
            if (((um2) list.get(i2)) instanceof rm2) {
                x(list, i2, false);
            } else {
                i.n("Check failed.");
            }
        }
    }

    public final void x(List list, int i, boolean z) {
        int i2;
        int i3 = i;
        while (true) {
            int i4 = 0;
            if (-1 < i3) {
                um2 um2Var = (um2) list.get(i3);
                if (um2Var instanceof rm2) {
                    sa5 sa5Var = ((rm2) um2Var).a;
                    if (i(l07.b0(sa5Var), qp1.A, true)) {
                        this.i0 = sa5Var;
                        list.remove(i3);
                        while (i4 < i3) {
                            if (((um2) list.get(i4)) instanceof rm2) {
                                list.remove(i4);
                                i3--;
                            } else {
                                i4++;
                            }
                        }
                        return;
                    }
                }
                i3--;
            } else if (z && (i2 = i + 1) < list.size()) {
                um2 um2Var2 = (um2) list.get(i2);
                if (um2Var2 instanceof om2) {
                    w(list, i2, (om2) um2Var2, false);
                    return;
                } else if (um2Var2 instanceof tm2) {
                    D(list, i2, (tm2) um2Var2);
                    return;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
