package defpackage;

import android.content.res.TypedArray;
import android.hardware.camera2.CameraCharacteristics;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sf0  reason: default package */
/* loaded from: classes.dex */
public final class sf0 implements AutoCloseable, ye0 {
    public final gt2 A;
    public final gt2 B;
    public final jr6 L;
    public final rv6 R;
    public final kc0 X;
    public final lm2 Y;
    public final km2 Z;
    public final bx d0;
    public final qf0 e0;
    public final tf0 f0;
    public final uf0 g0;
    public final jt2 h0;
    public final w61 i0;
    public final t41 j0;
    public final sw k0;

    public sf0(kf0 kf0Var, lg0 lg0Var, gt2 gt2Var, gt2 gt2Var2, jr6 jr6Var, rv6 rv6Var, kc0 kc0Var, lm2 lm2Var, km2 km2Var, bx bxVar, qf0 qf0Var, tf0 tf0Var, uf0 uf0Var, jt2 jt2Var, w61 w61Var, t41 t41Var) {
        String str;
        String str2;
        String str3;
        int i;
        int i2;
        kf0Var.getClass();
        ArrayList arrayList = kf0Var.d;
        int i3 = kf0Var.h;
        lg0Var.getClass();
        gt2Var.getClass();
        gt2Var2.getClass();
        jr6Var.getClass();
        List list = jr6Var.Y;
        rv6Var.getClass();
        kc0Var.getClass();
        lm2Var.getClass();
        km2Var.getClass();
        bxVar.getClass();
        tf0Var.getClass();
        uf0Var.getClass();
        jt2Var.getClass();
        w61Var.getClass();
        t41Var.getClass();
        this.A = gt2Var;
        this.B = gt2Var2;
        this.L = jr6Var;
        this.R = rv6Var;
        this.X = kc0Var;
        this.Y = lm2Var;
        this.Z = km2Var;
        this.d0 = bxVar;
        this.e0 = qf0Var;
        this.f0 = tf0Var;
        this.g0 = uf0Var;
        this.h0 = jt2Var;
        this.i0 = w61Var;
        this.j0 = t41Var;
        this.k0 = g04.s(false);
        String str4 = kf0Var.a;
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        key.getClass();
        qc0 qc0Var = (qc0) lg0Var;
        Integer num = (Integer) qc0Var.c(key);
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
        Integer num2 = (Integer) qc0Var.c(key2);
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
        int[] iArr = (int[]) qc0Var.c(key3);
        if (iArr != null && fv.m0(iArr, 11)) {
            str2 = "Logical";
        } else {
            str2 = "Physical";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this + " (Camera " + str4 + ")\n");
        StringBuilder u = i61.u("  Facing:    ", str, " (", str2, ", ");
        u.append(str5);
        u.append(")\n");
        sb.append(u.toString());
        sb.append("  Mode:      " + str6 + '\n');
        sb.append("Outputs:\n");
        ArrayList arrayList2 = jr6Var.Z;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            ArrayList arrayList3 = ((ki0) obj).b;
            int size2 = arrayList3.size();
            int i5 = 0;
            int i6 = 0;
            while (i5 < size2) {
                Object obj2 = arrayList3.get(i5);
                int i7 = i5 + 1;
                int i8 = i6 + 1;
                if (i6 >= 0) {
                    ir6 ir6Var = (ir6) obj2;
                    sb.append("  ");
                    if (i6 == 0) {
                        ki0 ki0Var = ir6Var.j;
                        if (ki0Var != null) {
                            str3 = kr6.a(ki0Var.a);
                        } else {
                            nb3.a0("stream");
                            throw null;
                        }
                    } else {
                        str3 = "";
                    }
                    ArrayList arrayList4 = arrayList2;
                    sb.append(qs6.A0(12, str3));
                    int i9 = ir6Var.a;
                    String str7 = ir6Var.d;
                    ArrayList arrayList5 = arrayList;
                    List list2 = list;
                    sb.append(qs6.A0(12, "Output-" + i9));
                    String size3 = ir6Var.b.toString();
                    size3.getClass();
                    sb.append(qs6.A0(12, size3));
                    sb.append(qs6.A0(16, fr6.a(ir6Var.c)));
                    rp4 rp4Var = ir6Var.e;
                    if (rp4Var != null) {
                        int i10 = rp4Var.a;
                        sb.append(" [" + ((Object) rp4.a(i10)) + ']');
                    }
                    qp4 qp4Var = ir6Var.f;
                    int i11 = size;
                    if (qp4Var != null) {
                        long j = qp4Var.a;
                        sb.append(" [" + ((Object) qp4.a(j)) + ']');
                    }
                    sp4 sp4Var = ir6Var.g;
                    if (sp4Var != null) {
                        long j2 = sp4Var.a;
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
                    tp4 tp4Var = ir6Var.i;
                    if (tp4Var != null) {
                        long j3 = tp4Var.a;
                        StringBuilder sb3 = new StringBuilder(" [");
                        sb3.append((Object) ("StreamUseHint(value=" + j3 + ')'));
                        sb3.append(']');
                        sb.append(sb3.toString());
                    }
                    if (!nb3.k(str7, str4)) {
                        sb.append(" [");
                        sb.append(new xf0(str7));
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
                    hf.q0();
                    throw null;
                }
            }
        }
        ArrayList arrayList6 = arrayList;
        List<gr6> list3 = list;
        if (!list3.isEmpty()) {
            sb.append("Inputs:\n");
            for (gr6 gr6Var : list3) {
                sb.append(" ");
                int i12 = gr6Var.a;
                sb.append(qs6.A0(12, "Input-" + i12));
                sb.append(qs6.A0(12, fr6.b(gr6Var.b)));
                sb.append(qs6.A0(12, String.valueOf(1)));
                sb.append("\n");
            }
        }
        sb.append("Session Template: " + bl5.a(kf0Var.f) + '\n');
        n16.l(sb, "Session Parameters", kf0Var.g);
        sb.append("Default Template: " + bl5.a(kf0Var.i) + '\n');
        n16.l(sb, "Default Parameters", kf0Var.j);
        n16.l(sb, "Required Parameters", kf0Var.m);
        Log.i("CXCP", sb.toString());
        if (i3 == 1) {
            if (!this.L.d0.isEmpty()) {
                int size4 = this.L.d0.size();
                jr6 jr6Var2 = this.L;
                if (size4 <= 2) {
                    ArrayList arrayList7 = jr6Var2.d0;
                    if (arrayList7 == null || !arrayList7.isEmpty()) {
                        int size5 = arrayList7.size();
                        int i13 = 0;
                        while (i13 < size5) {
                            Object obj3 = arrayList7.get(i13);
                            i13++;
                            if (!((ir6) obj3).a()) {
                                u34.w(this.L.d0, "HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are ");
                                throw null;
                            }
                        }
                    }
                } else {
                    u34.w(jr6Var2.d0, "Cannot create a HIGH_SPEED CameraGraph with more than two outputs. Configured outputs are ");
                    throw null;
                }
            } else {
                i.h("Cannot create a HIGH_SPEED CameraGraph without outputs.");
                throw null;
            }
        }
        if (arrayList6 != null) {
            if (!arrayList6.isEmpty()) {
                if (Build.VERSION.SDK_INT < 31 && arrayList6.size() > 1) {
                    i.h("Multi resolution reprocessing not supported under Android S");
                    throw null;
                }
            } else {
                i.h("At least one InputConfiguration is required for reprocessing");
                throw null;
            }
        }
        if (this.L.X.isEmpty()) {
            return;
        }
        this.R.e();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.k0.a()) {
            Trace.beginSection(this + "#close");
            StringBuilder sb = new StringBuilder("Closing ");
            sb.append(this);
            Log.i("CXCP", sb.toString());
            this.A.b.close();
            kc0 kc0Var = this.X;
            synchronized (kc0Var.q) {
                try {
                    if (!kc0Var.e()) {
                        kc0Var.s = xe0.v;
                        Log.d("CXCP", "Closed " + kc0Var);
                        pq7 pq7Var = kc0Var.y;
                        yk0 yk0Var = kc0Var.z;
                        kc0Var.y = null;
                        kc0Var.z = null;
                        ap6 ap6Var = kc0Var.w;
                        if (ap6Var != null) {
                            ap6Var.h(null);
                        }
                        ap6 ap6Var2 = kc0Var.B;
                        if (ap6Var2 != null) {
                            ap6Var2.h(null);
                        }
                        kc0Var.B = null;
                        ap6 ap6Var3 = kc0Var.C;
                        if (ap6Var3 != null) {
                            ap6Var3.h(null);
                        }
                        kc0Var.C = null;
                        ap6 ap6Var4 = kc0Var.D;
                        if (ap6Var4 != null) {
                            ap6Var4.h(null);
                        }
                        kc0Var.D = null;
                        i61.z(kc0Var.g);
                        kc0Var.d(yk0Var, pq7Var);
                        kf0 kf0Var = kc0Var.d;
                        if (kf0Var.o.e || kc0Var.l.a(kf0Var.a)) {
                            Log.d("CXCP", "Quirk: Closing " + ((Object) xf0.b(kc0Var.d.a)) + " during " + kc0Var + "#close");
                            kc0Var.j.a(kc0Var.d.a);
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
            bx bxVar = this.d0;
            bxVar.getClass();
            synchronized (bxVar.c) {
                cx a = bxVar.a();
                bxVar.d.remove(this);
                cx a2 = bxVar.a();
                if (a2 != null && !a2.equals(a)) {
                    d51 d51Var = bxVar.b;
                    o41 o41Var = bxVar.a;
                    m5 m5Var = new m5(bxVar, a2, (r41) null, 3);
                    d51Var.getClass();
                    o41Var.getClass();
                    hv.L(o41Var, null, a71.UNDISPATCHED, new l5(d51Var, m5Var, (r41) null, 21), 1);
                }
            }
            g04.x(this.i0, null);
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(s41 s41Var) {
        rf0 rf0Var;
        int i;
        if (s41Var instanceof rf0) {
            rf0Var = (rf0) s41Var;
            int i2 = rf0Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rf0Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = rf0Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = rf0Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    rf0Var.Y = 1;
                    obj = this.h0.a(rf0Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                return new vf0((jb4) obj, this.A, this.j0, this.Z, this.f0, this.g0);
            }
        }
        rf0Var = new rf0(this, s41Var);
        Object obj2 = rf0Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = rf0Var.Y;
        if (i == 0) {
        }
        return new vf0((jb4) obj2, this.A, this.j0, this.Z, this.f0, this.g0);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i, Surface surface) {
        String str;
        AutoCloseable autoCloseable;
        boolean isTerminated;
        Trace.beginSection(((Object) kr6.a(i)) + "#setSurface");
        if (surface != null && !surface.isValid()) {
            Log.w("CXCP", this + "#setSurface: " + surface + " is invalid");
        }
        rv6 rv6Var = this.R;
        if (!rv6Var.R.keySet().contains(new kr6(i))) {
            synchronized (rv6Var.X) {
                if (rv6Var.e0) {
                    if (surface != null) {
                        Log.w("CXCP", "Refusing to configure " + ((Object) kr6.a(i)) + " with " + surface + " after close!");
                    }
                } else {
                    if (surface != null) {
                        str = "Configured " + ((Object) kr6.a(i)) + " with " + surface;
                    } else {
                        str = "Removed surface for " + ((Object) kr6.a(i));
                    }
                    Log.i("CXCP", str);
                    LinkedHashMap linkedHashMap = rv6Var.Y;
                    if (surface == null) {
                        Surface surface2 = (Surface) linkedHashMap.remove(new kr6(i));
                        if (rv6Var.d0 && surface2 != null) {
                            autoCloseable = (AutoCloseable) rv6Var.Z.remove(surface2);
                            rv6Var.e();
                            if (autoCloseable != null) {
                                if (autoCloseable instanceof AutoCloseable) {
                                    autoCloseable.close();
                                } else if (autoCloseable instanceof ExecutorService) {
                                    ExecutorService executorService = (ExecutorService) autoCloseable;
                                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                                        executorService.shutdown();
                                        boolean z = false;
                                        while (!isTerminated) {
                                            try {
                                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                            } catch (InterruptedException unused) {
                                                if (!z) {
                                                    executorService.shutdownNow();
                                                    z = true;
                                                }
                                            }
                                        }
                                        if (z) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                } else if (autoCloseable instanceof TypedArray) {
                                    ((TypedArray) autoCloseable).recycle();
                                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                                    ((MediaMetadataRetriever) autoCloseable).release();
                                } else if (autoCloseable instanceof MediaDrm) {
                                    ((MediaDrm) autoCloseable).release();
                                } else {
                                    u34.t();
                                    return;
                                }
                            }
                        }
                        autoCloseable = null;
                        rv6Var.e();
                        if (autoCloseable != null) {
                        }
                    } else {
                        Surface surface3 = (Surface) linkedHashMap.get(new kr6(i));
                        rv6Var.Y.put(new kr6(i), surface);
                        if (rv6Var.d0 && !nb3.k(surface3, surface)) {
                            if (!rv6Var.Z.containsKey(surface)) {
                                autoCloseable = (AutoCloseable) ge7.n(rv6Var.Z).remove(surface3);
                                rv6Var.Z.put(surface, rv6Var.L.a(surface));
                                rv6Var.e();
                                if (autoCloseable != null) {
                                }
                            } else {
                                throw new IllegalStateException(("Surface (" + surface + ") is already in use!").toString());
                            }
                        }
                        autoCloseable = null;
                        rv6Var.e();
                        if (autoCloseable != null) {
                        }
                    }
                }
            }
            Trace.endSection();
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot configure surface for ");
        sb.append((Object) kr6.a(i));
        i.k(sb, ", it is permanently assigned to ", rv6Var.R.get(new kr6(i)));
    }

    public final String toString() {
        return this.e0.a;
    }
}
