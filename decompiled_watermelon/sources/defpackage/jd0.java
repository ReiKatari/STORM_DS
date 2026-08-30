package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jd0  reason: default package */
/* loaded from: classes.dex */
public final class jd0 implements AutoCloseable, pc0 {
    public final an2 A;
    public final an2 B;
    public final tf6 L;
    public final xj6 R;
    public final ca0 X;
    public final lh2 Y;
    public final kh2 Z;
    public final jw c0;
    public final hd0 d0;
    public final kd0 e0;
    public final ld0 f0;
    public final dn2 g0;
    public final o31 h0;
    public final l11 i0;
    public final aw j0;

    public jd0(bd0 bd0Var, ce0 ce0Var, an2 an2Var, an2 an2Var2, tf6 tf6Var, xj6 xj6Var, ca0 ca0Var, lh2 lh2Var, kh2 kh2Var, jw jwVar, hd0 hd0Var, kd0 kd0Var, ld0 ld0Var, dn2 dn2Var, o31 o31Var, l11 l11Var) {
        String str;
        String str2;
        String str3;
        int i;
        int i2;
        bd0Var.getClass();
        ArrayList arrayList = bd0Var.d;
        int i3 = bd0Var.h;
        ce0Var.getClass();
        an2Var.getClass();
        an2Var2.getClass();
        tf6Var.getClass();
        List list = tf6Var.Y;
        xj6Var.getClass();
        ca0Var.getClass();
        lh2Var.getClass();
        kh2Var.getClass();
        jwVar.getClass();
        kd0Var.getClass();
        ld0Var.getClass();
        dn2Var.getClass();
        o31Var.getClass();
        l11Var.getClass();
        this.A = an2Var;
        this.B = an2Var2;
        this.L = tf6Var;
        this.R = xj6Var;
        this.X = ca0Var;
        this.Y = lh2Var;
        this.Z = kh2Var;
        this.c0 = jwVar;
        this.d0 = hd0Var;
        this.e0 = kd0Var;
        this.f0 = ld0Var;
        this.g0 = dn2Var;
        this.h0 = o31Var;
        this.i0 = l11Var;
        this.j0 = w81.e(false);
        String str4 = bd0Var.a;
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        key.getClass();
        ia0 ia0Var = (ia0) ce0Var;
        Integer num = (Integer) ia0Var.c(key);
        String str5 = "External";
        String str6 = "Unknown";
        if (num != null && num.intValue() == 0) {
            str = "Front";
        } else if (num != null && num.intValue() == 1) {
            str = "Back";
        } else {
            str = (num != null && num.intValue() == 2) ? "External" : "Unknown";
        }
        CameraCharacteristics.Key key2 = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        key2.getClass();
        Integer num2 = (Integer) ia0Var.c(key2);
        if (num2 != null && num2.intValue() == 0) {
            str5 = "Limited";
        } else if (num2 != null && num2.intValue() == 1) {
            str5 = "Full";
        } else if (num2 != null && num2.intValue() == 2) {
            str5 = "Legacy";
        } else if (num2 != null && num2.intValue() == 3) {
            str5 = "Level 3";
        } else if (num2 == null || num2.intValue() != 4) {
            str5 = "Unknown";
        }
        if (i3 == 1) {
            str6 = "High Speed";
        } else if (i3 == 0) {
            str6 = "Normal";
        } else if (i3 == 2) {
            str6 = "Extension";
        }
        CameraCharacteristics.Key key3 = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key3.getClass();
        int[] iArr = (int[]) ia0Var.c(key3);
        if (iArr != null && nu.Y(iArr, 11)) {
            str2 = "Logical";
        } else {
            str2 = "Physical";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this + " (Camera " + str4 + ")\n");
        StringBuilder v = b31.v("  Facing:    ", str, " (", str2, ", ");
        v.append(str5);
        v.append(")\n");
        sb.append(v.toString());
        sb.append("  Mode:      " + str6 + '\n');
        sb.append("Outputs:\n");
        ArrayList arrayList2 = tf6Var.Z;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            ArrayList arrayList3 = ((bg0) obj).b;
            int size2 = arrayList3.size();
            int i5 = 0;
            int i6 = 0;
            while (i5 < size2) {
                Object obj2 = arrayList3.get(i5);
                int i7 = i5 + 1;
                int i8 = i6 + 1;
                if (i6 >= 0) {
                    sf6 sf6Var = (sf6) obj2;
                    sb.append("  ");
                    if (i6 == 0) {
                        bg0 bg0Var = sf6Var.j;
                        if (bg0Var != null) {
                            str3 = uf6.a(bg0Var.a);
                        } else {
                            b53.g0("stream");
                            throw null;
                        }
                    } else {
                        str3 = "";
                    }
                    ArrayList arrayList4 = arrayList2;
                    sb.append(zg6.G0(12, str3));
                    int i9 = sf6Var.a;
                    String str7 = sf6Var.d;
                    ArrayList arrayList5 = arrayList;
                    List list2 = list;
                    sb.append(zg6.G0(12, "Output-" + i9));
                    String size3 = sf6Var.b.toString();
                    size3.getClass();
                    sb.append(zg6.G0(12, size3));
                    sb.append(zg6.G0(16, pf6.a(sf6Var.c)));
                    og4 og4Var = sf6Var.e;
                    if (og4Var != null) {
                        int i10 = og4Var.a;
                        sb.append(" [" + ((Object) og4.a(i10)) + ']');
                    }
                    ng4 ng4Var = sf6Var.f;
                    int i11 = size;
                    if (ng4Var != null) {
                        long j = ng4Var.a;
                        sb.append(" [" + ((Object) ng4.a(j)) + ']');
                    }
                    pg4 pg4Var = sf6Var.g;
                    if (pg4Var != null) {
                        long j2 = pg4Var.a;
                        StringBuilder sb2 = new StringBuilder(" [");
                        i = i4;
                        i2 = i7;
                        sb2.append((Object) ("StreamUseCase(value=" + j2 + ')'));
                        sb2.append(']');
                        sb.append(sb2.toString());
                    } else {
                        i = i4;
                        i2 = i7;
                    }
                    qg4 qg4Var = sf6Var.i;
                    if (qg4Var != null) {
                        long j3 = qg4Var.a;
                        StringBuilder sb3 = new StringBuilder(" [");
                        sb3.append((Object) ("StreamUseHint(value=" + j3 + ')'));
                        sb3.append(']');
                        sb.append(sb3.toString());
                    }
                    if (!b53.x(str7, str4)) {
                        sb.append(" [");
                        sb.append(new od0(str7));
                        sb.append("]");
                    }
                    sb.append("\n");
                    size = i11;
                    i4 = i;
                    i5 = i2;
                    arrayList2 = arrayList4;
                    arrayList = arrayList5;
                    i6 = i8;
                    list = list2;
                } else {
                    l07.v0();
                    throw null;
                }
            }
        }
        ArrayList arrayList6 = arrayList;
        List<qf6> list3 = list;
        if (!list3.isEmpty()) {
            sb.append("Inputs:\n");
            for (qf6 qf6Var : list3) {
                sb.append(" ");
                int i12 = qf6Var.a;
                sb.append(zg6.G0(12, "Input-" + i12));
                sb.append(zg6.G0(12, pf6.b(qf6Var.b)));
                sb.append(zg6.G0(12, String.valueOf(1)));
                sb.append("\n");
            }
        }
        sb.append("Session Template: " + jb5.a(bd0Var.f) + '\n');
        ct3.F(sb, "Session Parameters", bd0Var.g);
        sb.append("Default Template: " + jb5.a(bd0Var.i) + '\n');
        ct3.F(sb, "Default Parameters", bd0Var.j);
        ct3.F(sb, "Required Parameters", bd0Var.m);
        Log.i("CXCP", sb.toString());
        if (i3 == 1) {
            if (!this.L.c0.isEmpty()) {
                int size4 = this.L.c0.size();
                tf6 tf6Var2 = this.L;
                if (size4 <= 2) {
                    ArrayList arrayList7 = tf6Var2.c0;
                    if (arrayList7 == null || !arrayList7.isEmpty()) {
                        int size5 = arrayList7.size();
                        int i13 = 0;
                        while (i13 < size5) {
                            Object obj3 = arrayList7.get(i13);
                            i13++;
                            if (!((sf6) obj3).a()) {
                                c44.u(this.L.c0, "HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are ");
                                throw null;
                            }
                        }
                    }
                } else {
                    c44.u(tf6Var2.c0, "Cannot create a HIGH_SPEED CameraGraph with more than two outputs. Configured outputs are ");
                    throw null;
                }
            } else {
                i.i("Cannot create a HIGH_SPEED CameraGraph without outputs.");
                throw null;
            }
        }
        if (arrayList6 != null) {
            if (!arrayList6.isEmpty()) {
                if (Build.VERSION.SDK_INT < 31 && arrayList6.size() > 1) {
                    i.i("Multi resolution reprocessing not supported under Android S");
                    throw null;
                }
            } else {
                i.i("At least one InputConfiguration is required for reprocessing");
                throw null;
            }
        }
        if (this.L.X.isEmpty()) {
            return;
        }
        this.R.d();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.j0.a()) {
            Trace.beginSection(this + "#close");
            StringBuilder sb = new StringBuilder("Closing ");
            sb.append(this);
            Log.i("CXCP", sb.toString());
            this.A.b.close();
            ca0 ca0Var = this.X;
            synchronized (ca0Var.q) {
                try {
                    if (!ca0Var.e()) {
                        ca0Var.s = oc0.u;
                        Log.d("CXCP", "Closed " + ca0Var);
                        nc7 nc7Var = ca0Var.y;
                        qi0 qi0Var = ca0Var.z;
                        ca0Var.y = null;
                        ca0Var.z = null;
                        kd6 kd6Var = ca0Var.w;
                        if (kd6Var != null) {
                            kd6Var.i(null);
                        }
                        kd6 kd6Var2 = ca0Var.B;
                        if (kd6Var2 != null) {
                            kd6Var2.i(null);
                        }
                        ca0Var.B = null;
                        kd6 kd6Var3 = ca0Var.C;
                        if (kd6Var3 != null) {
                            kd6Var3.i(null);
                        }
                        ca0Var.C = null;
                        kd6 kd6Var4 = ca0Var.D;
                        if (kd6Var4 != null) {
                            kd6Var4.i(null);
                        }
                        ca0Var.D = null;
                        b31.y(ca0Var.g);
                        ca0Var.d(qi0Var, nc7Var);
                        bd0 bd0Var = ca0Var.d;
                        if (bd0Var.o.e || ca0Var.l.a(bd0Var.a)) {
                            Log.d("CXCP", "Quirk: Closing " + ((Object) od0.b(ca0Var.d.a)) + " during " + ca0Var + "#close");
                            ca0Var.j.a(ca0Var.d.a);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.Y.close();
            this.Z.close();
            this.R.close();
            this.L.close();
            jw jwVar = this.c0;
            jwVar.getClass();
            synchronized (jwVar.c) {
                kw a = jwVar.a();
                jwVar.d.remove(this);
                kw a2 = jwVar.a();
                if (a2 != null && !a2.equals(a)) {
                    bq0 bq0Var = jwVar.b;
                    g11 g11Var = jwVar.a;
                    n5 n5Var = new n5(jwVar, a2, (j11) null, 3);
                    bq0Var.getClass();
                    g11Var.getClass();
                    tq5.w(g11Var, null, s31.UNDISPATCHED, new m5((Object) bq0Var, (aj2) n5Var, (j11) null, 19), 1);
                }
            }
            iq2.f(this.h0, null);
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.k11 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.id0
            if (r0 == 0) goto L13
            r0 = r8
            id0 r0 = (defpackage.id0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            id0 r0 = new id0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.me2.a0(r8)
            goto L3c
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r7)
            r7 = 0
            return r7
        L2e:
            defpackage.me2.a0(r8)
            r0.Y = r3
            dn2 r8 = r7.g0
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L3c
            return r1
        L3c:
            r1 = r8
            d34 r1 = (defpackage.d34) r1
            md0 r0 = new md0
            kd0 r5 = r7.e0
            ld0 r6 = r7.f0
            an2 r2 = r7.A
            l11 r3 = r7.i0
            kh2 r4 = r7.Z
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd0.i(k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r7, android.view.Surface r8) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd0.p(int, android.view.Surface):void");
    }

    public final String toString() {
        return this.d0.a;
    }
}
