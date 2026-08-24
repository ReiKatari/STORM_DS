package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d23  reason: default package */
/* loaded from: classes.dex */
public final class d23 extends di7 {
    public static final b23 z = new Object();
    public final int q;
    public final AtomicReference r;
    public final int s;
    public final v66 t;
    public lc6 u;
    public eb v;
    public wy6 w;
    public mc6 x;
    public final x31 y;

    public d23(e23 e23Var) {
        super(e23Var);
        this.r = new AtomicReference(null);
        this.s = -1;
        this.y = new x31(this);
        e23 e23Var2 = (e23) this.h;
        xx xxVar = e23.B;
        if (e23Var2.i(xxVar)) {
            this.q = ((Integer) e23Var2.e(xxVar)).intValue();
        } else {
            this.q = 1;
        }
        ((Integer) e23Var2.b(e23.d0, 0)).getClass();
        this.t = new v66((v66) e23Var2.b(e23.e0, null));
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

    @Override // defpackage.di7
    public final void A() {
        v66 v66Var = this.t;
        v66Var.b();
        v66Var.a();
        wy6 wy6Var = this.w;
        if (wy6Var != null) {
            wy6Var.a();
        }
        G(false);
        e().e(null);
    }

    public final void G(boolean z2) {
        wy6 wy6Var;
        Log.d("ImageCapture", "clearPipeline");
        nj2.h();
        mc6 mc6Var = this.x;
        if (mc6Var != null) {
            mc6Var.b();
            this.x = null;
        }
        eb ebVar = this.v;
        if (ebVar != null) {
            ebVar.s();
            this.v = null;
        }
        if (!z2 && (wy6Var = this.w) != null) {
            wy6Var.a();
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
    */
    public final lc6 H(String str, e23 e23Var, yy yyVar) {
        yy0 a;
        HashSet hashSet;
        bt btVar;
        boolean z2;
        re5 re5Var;
        o33 o33Var;
        boolean z3;
        boolean z4;
        nj2.h();
        Log.d("ImageCapture", "createPipeline(cameraId: " + str + ", streamSpec: " + yyVar + ")");
        Size size = yyVar.a;
        eg0 d = d();
        Objects.requireNonNull(d);
        boolean o = d.o() ^ true;
        CameraCharacteristics cameraCharacteristics = null;
        if (this.v != null) {
            np2.A(null, o);
            this.v.s();
        }
        zf0 a2 = d().a();
        if ((a2 instanceof w9) && (a = ((cj7) ((w9) a2).L.b(oe0.b, cj7.a)).a(bj7.IMAGE_CAPTURE, 1)) != null) {
            xx xxVar = n23.v;
            go4 go4Var = (go4) a;
            if (go4Var.A.containsKey(xxVar)) {
                hashSet = new HashSet();
                hashSet.add(0);
                Iterator it = ((List) go4Var.e(xxVar)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((Integer) ((Pair) it.next()).first).intValue() == 4101) {
                        hashSet.add(1);
                        break;
                    }
                }
                if (hashSet == null) {
                    hashSet = new HashSet();
                    hashSet.add(0);
                    if (a2 != null) {
                        z3 = ((cg0) a2).y().contains(4101);
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        hashSet.add(1);
                    }
                    if (a2 != null) {
                        cg0 cg0Var = (cg0) a2;
                        if (cg0Var.w().contains(3)) {
                            z4 = cg0Var.y().contains(32);
                            if (z4) {
                                hashSet.add(2);
                                hashSet.add(3);
                            }
                        }
                    }
                    z4 = false;
                    if (z4) {
                    }
                }
                zi7 zi7Var = this.h;
                xx xxVar2 = e23.X;
                Integer num = (Integer) zi7Var.b(xxVar2, 0);
                num.getClass();
                boolean contains = hashSet.contains(num);
                StringBuilder sb = new StringBuilder("The specified output format (");
                Integer num2 = (Integer) this.h.b(xxVar2, 0);
                num2.getClass();
                sb.append(num2.intValue());
                sb.append(") is not supported by current configuration. Supported output formats: ");
                sb.append(hashSet);
                np2.s(sb.toString(), contains);
                if (((Boolean) this.h.b(e23.f0, Boolean.FALSE)).booleanValue()) {
                    e23Var.q();
                    d().f().z();
                }
                if (d() != null) {
                    try {
                        Object q = d().q().q();
                        if (q instanceof CameraCharacteristics) {
                            cameraCharacteristics = (CameraCharacteristics) q;
                        }
                    } catch (Exception e) {
                        Log.e("ImageCapture", "getCameraCharacteristics failed", e);
                    }
                }
                this.v = new eb(e23Var, size, cameraCharacteristics, o);
                if (this.w == null) {
                    Objects.requireNonNull((xi7) this.h.b(zi7.a0, new Object()));
                    this.w = new wy6(this.y);
                }
                wy6 wy6Var = this.w;
                eb ebVar = this.v;
                wy6Var.getClass();
                nj2.h();
                wy6Var.B = ebVar;
                ebVar.getClass();
                nj2.h();
                btVar = (bt) ebVar.L;
                btVar.getClass();
                nj2.h();
                if (((re5) btVar.B) == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                np2.A("The ImageReader is not initialized.", z2);
                re5Var = (re5) btVar.B;
                synchronized (re5Var.R) {
                    re5Var.Y = wy6Var;
                }
                eb ebVar2 = this.v;
                lc6 d2 = lc6.d((e23) ebVar2.B, yyVar.a);
                vx vxVar = (vx) ebVar2.X;
                o33 o33Var2 = vxVar.a;
                Objects.requireNonNull(o33Var2);
                yq1 yq1Var = yq1.d;
                s9 a3 = wy.a(o33Var2);
                a3.e = yq1Var;
                d2.a.add(a3.k());
                if (vxVar.f.size() > 1 && (o33Var = vxVar.b) != null) {
                    s9 a4 = wy.a(o33Var);
                    a4.e = yq1Var;
                    d2.a.add(a4.k());
                }
                o33 o33Var3 = vxVar.c;
                if (o33Var3 != null) {
                    d2.i = wy.a(o33Var3).k();
                }
                d2.h = yyVar.d;
                if (this.q == 2 && !yyVar.g) {
                    e().b(d2);
                }
                yy0 yy0Var = yyVar.f;
                if (yy0Var != null) {
                    d2.b.e(yy0Var);
                }
                mc6 mc6Var = this.x;
                if (mc6Var != null) {
                    mc6Var.b();
                }
                mc6 mc6Var2 = new mc6(new a23(this, 0));
                this.x = mc6Var2;
                d2.f = mc6Var2;
                return d2;
            }
        }
        hashSet = null;
        if (hashSet == null) {
        }
        zi7 zi7Var2 = this.h;
        xx xxVar22 = e23.X;
        Integer num3 = (Integer) zi7Var2.b(xxVar22, 0);
        num3.getClass();
        boolean contains2 = hashSet.contains(num3);
        StringBuilder sb2 = new StringBuilder("The specified output format (");
        Integer num22 = (Integer) this.h.b(xxVar22, 0);
        num22.getClass();
        sb2.append(num22.intValue());
        sb2.append(") is not supported by current configuration. Supported output formats: ");
        sb2.append(hashSet);
        np2.s(sb2.toString(), contains2);
        if (((Boolean) this.h.b(e23.f0, Boolean.FALSE)).booleanValue()) {
        }
        if (d() != null) {
        }
        this.v = new eb(e23Var, size, cameraCharacteristics, o);
        if (this.w == null) {
        }
        wy6 wy6Var2 = this.w;
        eb ebVar3 = this.v;
        wy6Var2.getClass();
        nj2.h();
        wy6Var2.B = ebVar3;
        ebVar3.getClass();
        nj2.h();
        btVar = (bt) ebVar3.L;
        btVar.getClass();
        nj2.h();
        if (((re5) btVar.B) == null) {
        }
        np2.A("The ImageReader is not initialized.", z2);
        re5Var = (re5) btVar.B;
        synchronized (re5Var.R) {
        }
    }

    public final int I() {
        int i;
        synchronized (this.r) {
            i = this.s;
            if (i == -1) {
                i = ((Integer) ((e23) this.h).b(e23.L, 2)).intValue();
            }
        }
        return i;
    }

    @Override // defpackage.di7
    public final zi7 g(boolean z2, cj7 cj7Var) {
        z.getClass();
        e23 e23Var = b23.a;
        yy0 a = cj7Var.a(e23Var.x(), this.q);
        if (z2) {
            a = yy0.t(a, e23Var);
        }
        if (a == null) {
            return null;
        }
        return new e23(go4.a(((jd0) m(a)).B));
    }

    @Override // defpackage.di7
    public final Set l() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // defpackage.di7
    public final yi7 m(yy0 yy0Var) {
        return new jd0(da4.k(yy0Var), 4);
    }

    @Override // defpackage.di7
    public final boolean n() {
        return true;
    }

    @Override // defpackage.di7
    public final void t() {
        int i;
        np2.x(d(), "Attached camera cannot be null");
        if (I() == 3) {
            eg0 d = d();
            if (d != null) {
                i = d.a().m();
            } else {
                i = -1;
            }
            if (i != 0) {
                i.h("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
            }
        }
    }

    public final String toString() {
        return "ImageCapture:".concat(h());
    }

    @Override // defpackage.di7
    public final void u() {
        kj2.t("ImageCapture", "onCameraControlReady");
        synchronized (this.r) {
            try {
                if (this.r.get() == null) {
                    e().d(I());
                }
            } finally {
            }
        }
        e().e(this.t);
    }

    @Override // defpackage.di7
    public final zi7 v(cg0 cg0Var, yi7 yi7Var) {
        int i = 35;
        HashSet<qu2> hashSet = this.g;
        boolean z2 = false;
        if (hashSet != null) {
            int i2 = 0;
            for (qu2 qu2Var : hashSet) {
                if (qu2Var instanceof h23) {
                    i2 = ((h23) qu2Var).a;
                }
            }
            yi7Var.f().m(e23.X, Integer.valueOf(i2));
        }
        if (cg0Var.s().a(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            da4 f = yi7Var.f();
            xx xxVar = e23.Z;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(f.b(xxVar, bool2))) {
                kj2.f0("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                kj2.E("ImageCapture", "Requesting software JPEG due to device quirk.");
                yi7Var.f().m(xxVar, bool2);
            }
        }
        da4 f2 = yi7Var.f();
        Boolean bool3 = Boolean.TRUE;
        xx xxVar2 = e23.Z;
        Boolean bool4 = Boolean.FALSE;
        if (bool3.equals(f2.b(xxVar2, bool4))) {
            if (d() != null) {
                d().f().z();
            }
            Integer num = (Integer) f2.b(e23.R, null);
            if (num != null && num.intValue() != 256) {
                kj2.f0("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            } else {
                z2 = true;
            }
            if (!z2) {
                kj2.f0("ImageCapture", "Unable to support software JPEG. Disabling.");
                f2.m(xxVar2, bool4);
            }
        }
        Integer num2 = (Integer) yi7Var.f().b(e23.R, null);
        if (num2 != null) {
            if (d() != null) {
                d().f().z();
            }
            da4 f3 = yi7Var.f();
            xx xxVar3 = j23.l;
            if (!z2) {
                i = num2.intValue();
            }
            f3.m(xxVar3, Integer.valueOf(i));
        } else {
            da4 f4 = yi7Var.f();
            xx xxVar4 = e23.X;
            if (Objects.equals(f4.b(xxVar4, null), 2)) {
                yi7Var.f().m(j23.l, 32);
            } else if (Objects.equals(yi7Var.f().b(xxVar4, null), 3)) {
                yi7Var.f().m(j23.l, 32);
                yi7Var.f().m(j23.m, 256);
            } else if (Objects.equals(yi7Var.f().b(xxVar4, null), 1)) {
                yi7Var.f().m(j23.l, 4101);
                yi7Var.f().m(j23.n, yq1.c);
            } else if (z2) {
                yi7Var.f().m(j23.l, 35);
            } else {
                List list = (List) yi7Var.f().b(n23.v, null);
                if (list == null) {
                    yi7Var.f().m(j23.l, 256);
                } else if (J(256, list)) {
                    yi7Var.f().m(j23.l, 256);
                } else if (J(35, list)) {
                    yi7Var.f().m(j23.l, 35);
                }
            }
        }
        return yi7Var.h();
    }

    @Override // defpackage.di7
    public final void x() {
        v66 v66Var = this.t;
        v66Var.b();
        v66Var.a();
        wy6 wy6Var = this.w;
        if (wy6Var != null) {
            wy6Var.a();
        }
    }

    @Override // defpackage.di7
    public final yy y(yy0 yy0Var) {
        this.u.a(yy0Var);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{this.u.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        p87 b = this.i.b();
        b.f = yy0Var;
        return b.a();
    }

    @Override // defpackage.di7
    public final yy z(yy yyVar, yy yyVar2) {
        kj2.t("ImageCapture", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + yyVar + ", secondaryStreamSpec " + yyVar2);
        lc6 H = H(f(), (e23) this.h, yyVar);
        this.u = H;
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{H.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        q();
        return yyVar;
    }
}
