package defpackage;

import android.util.Log;
import android.util.Pair;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zv2  reason: default package */
/* loaded from: classes.dex */
public final class zv2 extends f47 {
    public static final xv2 z = new Object();
    public final int q;
    public final AtomicReference r;
    public final int s;
    public final iv5 t;
    public x06 u;
    public q9 v;
    public mm6 w;
    public y06 x;
    public final jo1 y;

    public zv2(aw2 aw2Var) {
        super(aw2Var);
        this.r = new AtomicReference(null);
        this.s = -1;
        this.y = new jo1(7, this);
        aw2 aw2Var2 = (aw2) this.h;
        uw uwVar = aw2.B;
        if (aw2Var2.a(uwVar)) {
            this.q = ((Integer) aw2Var2.g(uwVar)).intValue();
        } else {
            this.q = 1;
        }
        ((Integer) aw2Var2.d(aw2.c0, 0)).getClass();
        this.t = new iv5((iv5) aw2Var2.d(aw2.d0, null));
    }

    public static boolean J(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.f47
    public final void A() {
        iv5 iv5Var = this.t;
        iv5Var.b();
        iv5Var.a();
        mm6 mm6Var = this.w;
        if (mm6Var != null) {
            mm6Var.a();
        }
        G(false);
        e().g(null);
    }

    public final void G(boolean z2) {
        mm6 mm6Var;
        Log.d("ImageCapture", "clearPipeline");
        nk2.s();
        y06 y06Var = this.x;
        if (y06Var != null) {
            y06Var.b();
            this.x = null;
        }
        q9 q9Var = this.v;
        if (q9Var != null) {
            q9Var.s();
            this.v = null;
        }
        if (!z2 && (mm6Var = this.w) != null) {
            mm6Var.a();
            this.w = null;
        }
        e().a();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0159 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.x06 H(java.lang.String r13, defpackage.aw2 r14, defpackage.jx r15) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zv2.H(java.lang.String, aw2, jx):x06");
    }

    public final int I() {
        int i;
        synchronized (this.r) {
            i = this.s;
            if (i == -1) {
                i = ((Integer) ((aw2) this.h).d(aw2.L, 2)).intValue();
            }
        }
        return i;
    }

    @Override // defpackage.f47
    public final b57 g(boolean z2, e57 e57Var) {
        z.getClass();
        aw2 aw2Var = xv2.a;
        cw0 a = e57Var.a(aw2Var.n(), this.q);
        if (z2) {
            a = cw0.J(a, aw2Var);
        }
        if (a == null) {
            return null;
        }
        return new aw2(ef4.b(((bb0) m(a)).B));
    }

    @Override // defpackage.f47
    public final Set l() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // defpackage.f47
    public final a57 m(cw0 cw0Var) {
        return new bb0(x14.j(cw0Var), 4);
    }

    @Override // defpackage.f47
    public final boolean n() {
        return true;
    }

    @Override // defpackage.f47
    public final void t() {
        int i;
        nl2.C(d(), "Attached camera cannot be null");
        if (I() == 3) {
            vd0 d = d();
            if (d != null) {
                i = d.b().c();
            } else {
                i = -1;
            }
            if (i != 0) {
                i.i("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
            }
        }
    }

    public final String toString() {
        return "ImageCapture:".concat(h());
    }

    @Override // defpackage.f47
    public final void u() {
        ve2.v("ImageCapture", "onCameraControlReady");
        synchronized (this.r) {
            try {
                if (this.r.get() == null) {
                    e().f(I());
                }
            } finally {
            }
        }
        e().g(this.t);
    }

    @Override // defpackage.f47
    public final b57 v(td0 td0Var, a57 a57Var) {
        int i = 35;
        HashSet<no2> hashSet = this.g;
        boolean z2 = false;
        if (hashSet != null) {
            int i2 = 0;
            for (no2 no2Var : hashSet) {
                if (no2Var instanceof dw2) {
                    i2 = ((dw2) no2Var).a;
                }
            }
            a57Var.b().r(aw2.X, Integer.valueOf(i2));
        }
        if (td0Var.l().a(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            x14 b = a57Var.b();
            uw uwVar = aw2.Z;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(b.d(uwVar, bool2))) {
                ve2.c0("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                ve2.C("ImageCapture", "Requesting software JPEG due to device quirk.");
                a57Var.b().r(uwVar, bool2);
            }
        }
        x14 b2 = a57Var.b();
        Boolean bool3 = Boolean.TRUE;
        uw uwVar2 = aw2.Z;
        Boolean bool4 = Boolean.FALSE;
        if (bool3.equals(b2.d(uwVar2, bool4))) {
            if (d() != null) {
                d().p().p();
            }
            Integer num = (Integer) b2.d(aw2.R, null);
            if (num != null && num.intValue() != 256) {
                ve2.c0("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            } else {
                z2 = true;
            }
            if (!z2) {
                ve2.c0("ImageCapture", "Unable to support software JPEG. Disabling.");
                b2.r(uwVar2, bool4);
            }
        }
        Integer num2 = (Integer) a57Var.b().d(aw2.R, null);
        if (num2 != null) {
            if (d() != null) {
                d().p().p();
            }
            x14 b3 = a57Var.b();
            uw uwVar3 = fw2.l;
            if (!z2) {
                i = num2.intValue();
            }
            b3.r(uwVar3, Integer.valueOf(i));
        } else {
            x14 b4 = a57Var.b();
            uw uwVar4 = aw2.X;
            if (Objects.equals(b4.d(uwVar4, null), 2)) {
                a57Var.b().r(fw2.l, 32);
            } else if (Objects.equals(a57Var.b().d(uwVar4, null), 3)) {
                a57Var.b().r(fw2.l, 32);
                a57Var.b().r(fw2.m, 256);
            } else if (Objects.equals(a57Var.b().d(uwVar4, null), 1)) {
                a57Var.b().r(fw2.l, 4101);
                a57Var.b().r(fw2.n, sm1.c);
            } else if (z2) {
                a57Var.b().r(fw2.l, 35);
            } else {
                List list = (List) a57Var.b().d(jw2.v, null);
                if (list == null) {
                    a57Var.b().r(fw2.l, 256);
                } else if (J(256, list)) {
                    a57Var.b().r(fw2.l, 256);
                } else if (J(35, list)) {
                    a57Var.b().r(fw2.l, 35);
                }
            }
        }
        return a57Var.d();
    }

    @Override // defpackage.f47
    public final void x() {
        iv5 iv5Var = this.t;
        iv5Var.b();
        iv5Var.a();
        mm6 mm6Var = this.w;
        if (mm6Var != null) {
            mm6Var.a();
        }
    }

    @Override // defpackage.f47
    public final jx y(cw0 cw0Var) {
        this.u.a(cw0Var);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{this.u.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        cw6 b = this.i.b();
        b.f = cw0Var;
        return b.a();
    }

    @Override // defpackage.f47
    public final jx z(jx jxVar, jx jxVar2) {
        ve2.v("ImageCapture", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + jxVar + ", secondaryStreamSpec " + jxVar2);
        x06 H = H(f(), (aw2) this.h, jxVar);
        this.u = H;
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{H.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        q();
        return jxVar;
    }
}
