package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zc0  reason: default package */
/* loaded from: classes.dex */
public final class zc0 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public final Object f;
    public Object g;
    public Object h;
    public Object i;
    public final Object j;
    public Object k;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [zc0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [pp1] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.ArrayList] */
    public zc0(il6 il6Var, Context context, sw swVar, q03 q03Var, df0 df0Var, ci3 ci3Var, zg0 zg0Var) {
        ?? r8;
        int i = 0;
        q03Var.getClass();
        this.b = il6Var;
        this.d = df0Var;
        this.e = ci3Var;
        this.f = zg0Var;
        this.g = new qc0((ke0) il6Var.getValue(), ((ke0) il6Var.getValue()).b());
        il6 il6Var2 = new il6(new yc0(context, swVar, this, q03Var, 0));
        this.c = il6Var2;
        this.i = up1.A;
        this.j = new Object();
        this.k = new AtomicBoolean(false);
        ArrayList a = tc0.a(((o71) il6Var2.getValue()).a());
        if (a != null) {
            r8 = new ArrayList(uq0.y0(a, 10));
            int size = a.size();
            while (i < size) {
                Object obj = a.get(i);
                i++;
                r8.add(((od0) obj).a);
            }
        } else {
            r8 = pp1.A;
        }
        o45 o45Var = ((ke0) ((il6) this.b).getValue()).b().d().b.k;
        Executor executor = swVar.a;
        executor.getClass();
        this.h = new wn4(o45Var, iq2.c(w81.n(executor)), r8, context);
        h(r8);
    }

    public static final void a(zc0 zc0Var, yy3 yy3Var, m74 m74Var) {
        vz2 vz2Var;
        for (yy3 yy3Var2 = yy3Var.X; yy3Var2 != null; yy3Var2 = yy3Var2.X) {
            if (yy3Var2 == ((i74) zc0Var.c)) {
                vf3 u = ((vf3) zc0Var.b).u();
                if (u != null) {
                    vz2Var = (vz2) u.A0.d;
                } else {
                    vz2Var = null;
                }
                m74Var.n0 = vz2Var;
                zc0Var.e = m74Var;
                return;
            } else if ((yy3Var2.L & 2) == 0) {
                yy3Var2.Q0(m74Var);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [yy3, i00] */
    public static yy3 c(xy3 xy3Var, yy3 yy3Var) {
        yy3 yy3Var2;
        if (xy3Var instanceof dz3) {
            yy3Var2 = ((dz3) xy3Var).c();
            yy3Var2.L = n74.f(yy3Var2);
        } else {
            ?? yy3Var3 = new yy3();
            yy3Var3.L = n74.d(xy3Var);
            yy3Var3.j0 = xy3Var;
            new HashSet();
            yy3Var2 = yy3Var3;
        }
        if (yy3Var2.i0) {
            mz2.c("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        yy3Var2.d0 = true;
        yy3 yy3Var4 = yy3Var.Y;
        if (yy3Var4 != null) {
            yy3Var4.X = yy3Var2;
            yy3Var2.Y = yy3Var4;
        }
        yy3Var.Y = yy3Var2;
        yy3Var2.X = yy3Var;
        return yy3Var2;
    }

    public static yy3 d(yy3 yy3Var) {
        boolean z = yy3Var.i0;
        if (z) {
            s14 s14Var = n74.a;
            if (!z) {
                mz2.c("autoInvalidateRemovedNode called on unattached node");
            }
            n74.a(yy3Var, -1, 2);
            yy3Var.O0();
            yy3Var.I0();
        }
        yy3 yy3Var2 = yy3Var.Y;
        yy3 yy3Var3 = yy3Var.X;
        if (yy3Var2 != null) {
            yy3Var2.X = yy3Var3;
            yy3Var.Y = null;
        }
        if (yy3Var3 != null) {
            yy3Var3.Y = yy3Var2;
            yy3Var.X = null;
        }
        yy3Var3.getClass();
        return yy3Var3;
    }

    public static void l(xy3 xy3Var, xy3 xy3Var2, yy3 yy3Var) {
        if ((xy3Var instanceof dz3) && (xy3Var2 instanceof dz3)) {
            yy3Var.getClass();
            ((dz3) xy3Var2).g(yy3Var);
            if (yy3Var.i0) {
                n74.c(yy3Var);
            } else {
                yy3Var.e0 = true;
            }
        } else if (yy3Var instanceof i00) {
            i00 i00Var = (i00) yy3Var;
            boolean z = i00Var.i0;
            if (z) {
                if (!z) {
                    mz2.c("unInitializeModifier called on unattached node");
                }
                if ((i00Var.L & 8) != 0) {
                    ((ee) l.Q(i00Var)).y();
                }
            }
            i00Var.j0 = xy3Var2;
            i00Var.L = n74.d(xy3Var2);
            if (i00Var.i0) {
                i00Var.R0(false);
            }
            if (yy3Var.i0) {
                n74.c(yy3Var);
            } else {
                yy3Var.e0 = true;
            }
        } else {
            mz2.c("Unknown Modifier.Node type");
        }
    }

    public LinkedHashSet b(List list) {
        String str;
        il6 il6Var = (il6) this.c;
        o71 o71Var = (o71) il6Var.getValue();
        df0 df0Var = (df0) this.d;
        List<String> n1 = tq0.n1(list);
        ci3 ci3Var = (ci3) this.e;
        o71Var.getClass();
        try {
            ArrayList arrayList = new ArrayList();
            tc0 a = o71Var.a();
            if (df0Var != null) {
                try {
                    str = n40.H(a, df0Var.b());
                } catch (IllegalStateException e) {
                    if (ve2.D("CXCP")) {
                        Log.d("CXCP", "Unable to get Metadata for cameraID 0 and/or 1", e);
                    }
                    str = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str2 : n1) {
                    if (!b53.x(str2, str)) {
                        o71 o71Var2 = o71Var.b;
                        od0.a(str2);
                        td0 l = ((vd0) new q71(o71Var2, new an1(str2), ci3Var).z.get()).l();
                        l.getClass();
                        arrayList2.add(l);
                    }
                }
                ArrayList a2 = df0Var.a(arrayList2);
                int size = a2.size();
                int i = 0;
                while (i < size) {
                    Object obj = a2.get(i);
                    i++;
                    qd0 qd0Var = (qd0) obj;
                    qd0Var.getClass();
                    String f = ((td0) qd0Var).f();
                    f.getClass();
                    arrayList.add(f);
                }
                n1 = arrayList;
            }
            tc0 a3 = ((o71) il6Var.getValue()).a();
            ArrayList arrayList3 = new ArrayList();
            for (String str3 : n1) {
                if (!b53.x(str3, "0") && !b53.x(str3, "1")) {
                    if (f34.H(a3, str3)) {
                        arrayList3.add(str3);
                    } else if (ve2.D("CXCP")) {
                        Log.d("CXCP", "Camera " + str3 + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
                    }
                } else {
                    arrayList3.add(str3);
                }
            }
            return new LinkedHashSet(arrayList3);
        } catch (IllegalStateException e2) {
            if (ve2.E()) {
                Log.e("CXCP", "Error while accessing info about cameras.", e2);
            }
            throw new Exception(e2);
        }
    }

    public Set e() {
        synchronized (this.j) {
            if (((AtomicBoolean) this.k).get()) {
                return up1.A;
            }
            return new LinkedHashSet((Set) this.i);
        }
    }

    public vd0 f(String str) {
        str.getClass();
        if (!((AtomicBoolean) this.k).get()) {
            o71 o71Var = ((o71) ((il6) this.c).getValue()).b;
            od0.a(str);
            return (vd0) new q71(o71Var, new an1(str), (ci3) this.e).z.get();
        }
        throw new Exception("CameraFactory has been shut down.");
    }

    public boolean g(int i) {
        if ((((yy3) this.g).R & i) != 0) {
            return true;
        }
        return false;
    }

    public void h(List list) {
        if (((AtomicBoolean) this.k).get()) {
            return;
        }
        LinkedHashSet b = b(list);
        synchronized (this.j) {
            try {
                if (((AtomicBoolean) this.k).get()) {
                    return;
                }
                if (b53.x((Set) this.i, b)) {
                    return;
                }
                if (ve2.D("CXCP")) {
                    Log.d("CXCP", "Updated available camera list: " + ((Set) this.i) + " -> " + b);
                }
                this.i = b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i() {
        for (yy3 yy3Var = (yy3) this.g; yy3Var != null; yy3Var = yy3Var.Y) {
            yy3Var.N0();
            if (yy3Var.d0) {
                s14 s14Var = n74.a;
                if (!yy3Var.i0) {
                    mz2.c("autoInvalidateInsertedNode called on unattached node");
                }
                n74.a(yy3Var, -1, 1);
            }
            if (yy3Var.e0) {
                n74.c(yy3Var);
            }
            yy3Var.d0 = false;
            yy3Var.e0 = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0268, code lost:
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x026e, code lost:
        r1 = r1 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d4, code lost:
        if (r16[(r11 + 1) + r17] > r16[(r25 - 1) + r17]) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014e, code lost:
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0154, code lost:
        if ((r19 & 1) != 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0156, code lost:
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0158, code lost:
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015a, code lost:
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015b, code lost:
        if (r13 > r1) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015d, code lost:
        if (r13 == r12) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015f, code lost:
        if (r13 == r1) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0161, code lost:
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016f, code lost:
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0172, code lost:
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0174, code lost:
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017d, code lost:
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017f, code lost:
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0186, code lost:
        r22 = r10 - ((r5 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018c, code lost:
        if (r1 == 0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018e, code lost:
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0191, code lost:
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0193, code lost:
        if (r14 != r11) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0195, code lost:
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0198, code lost:
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019a, code lost:
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (r14 <= r7) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a6, code lost:
        if (r11 <= r15) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a8, code lost:
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b4, code lost:
        if (r6.b(r14 - 1, r27 - 1) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b6, code lost:
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01bd, code lost:
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c1, code lost:
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c5, code lost:
        if (r24 == 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c7, code lost:
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c9, code lost:
        if (r11 < r12) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01cb, code lost:
        if (r11 > r1) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d1, code lost:
        if (r16[r17 + r11] < r14) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d3, code lost:
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, l24] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(int r32, defpackage.o24 r33, defpackage.o24 r34, defpackage.yy3 r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zc0.j(int, o24, o24, yy3, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void k() {
        vz2 vz2Var;
        vz2 vz2Var2;
        vf3 vf3Var = (vf3) this.b;
        vz2 vz2Var3 = (vz2) this.d;
        for (yy3 yy3Var = ((lm6) this.f).X; yy3Var != null; yy3Var = yy3Var.X) {
            mf3 t = l.t(yy3Var);
            if (t != null) {
                m74 m74Var = yy3Var.c0;
                if (m74Var != null) {
                    pf3 pf3Var = (pf3) m74Var;
                    mf3 mf3Var = pf3Var.O0;
                    pf3Var.A1(t);
                    vz2Var2 = pf3Var;
                    if (mf3Var != yy3Var) {
                        vg4 vg4Var = pf3Var.I0;
                        vz2Var2 = pf3Var;
                        if (vg4Var != null) {
                            ((tn2) vg4Var).c();
                            vz2Var2 = pf3Var;
                        }
                    }
                } else {
                    m74 pf3Var2 = new pf3(vf3Var, t);
                    yy3Var.Q0(pf3Var2);
                    vz2Var2 = pf3Var2;
                }
                vz2Var3.n0 = vz2Var2;
                vz2Var2.m0 = vz2Var3;
                vz2Var3 = vz2Var2;
            } else {
                yy3Var.Q0(vz2Var3);
            }
        }
        vf3 u = vf3Var.u();
        if (u != null) {
            vz2Var = (vz2) u.A0.d;
        } else {
            vz2Var = null;
        }
        vz2Var3.n0 = vz2Var;
        this.e = vz2Var3;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("[");
                yy3 yy3Var = (yy3) this.g;
                lm6 lm6Var = (lm6) this.f;
                if (yy3Var == lm6Var) {
                    sb.append("]");
                } else {
                    while (true) {
                        if (yy3Var != null && yy3Var != lm6Var) {
                            sb.append(String.valueOf(yy3Var));
                            if (yy3Var.Y == lm6Var) {
                                sb.append("]");
                            } else {
                                sb.append(",");
                                yy3Var = yy3Var.Y;
                            }
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public zc0(vf3 vf3Var) {
        this.b = vf3Var;
        yy3 yy3Var = new yy3();
        yy3Var.R = -1;
        this.c = yy3Var;
        vz2 vz2Var = new vz2(vf3Var);
        this.d = vz2Var;
        this.e = vz2Var;
        lm6 lm6Var = vz2Var.O0;
        this.f = lm6Var;
        this.g = lm6Var;
        this.j = new o24(new zy3[16]);
    }
}
