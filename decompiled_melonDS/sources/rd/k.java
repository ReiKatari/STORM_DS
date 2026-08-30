package rd;

import a1.z;
import a6.x0;
import android.content.Intent;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.view.View;
import androidx.lifecycle.s0;
import androidx.preference.Preference;
import b6.q;
import com.google.android.material.behavior.SwipeDismissBehavior;
import j0.u0;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
import n2.f1;
import n2.s2;
import p1.a0;
import rh.e0;
import rh.t;
import ti.o;
import ti.s;
import v3.u;
import v3.v;
import w.g1;
import w.l1;
import w.p0;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class k implements t, ti.g, m0.c, l1, t7.b, u7.e, q, vg.h, z9.b {
    public final /* synthetic */ int A;
    public Object B;

    public k(long[] jArr) {
        z zVar;
        this.A = 25;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            zVar = new z(copyOf.length);
            int i2 = zVar.f120b;
            if (i2 >= 0) {
                if (copyOf.length != 0) {
                    int length = copyOf.length + i2;
                    long[] jArr2 = zVar.f119a;
                    if (jArr2.length < length) {
                        zVar.f119a = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                    }
                    long[] jArr3 = zVar.f119a;
                    int i10 = zVar.f120b;
                    if (i2 != i10) {
                        zb.k.h(jArr3, jArr3, copyOf.length + i2, i2, i10);
                    }
                    zb.k.h(copyOf, jArr3, i2, 0, copyOf.length);
                    zVar.f120b += copyOf.length;
                }
            } else {
                wa.b.f("");
                throw null;
            }
        } else {
            zVar = new z(16);
        }
        this.B = zVar;
    }

    public static k n(x.j jVar) {
        CameraCharacteristics.Key key;
        boolean z10;
        int i2 = Build.VERSION.SDK_INT;
        k kVar = null;
        if (i2 >= 33) {
            key = CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES;
            DynamicRangeProfiles d4 = m4.g.d(jVar.a(key));
            if (d4 != null) {
                if (i2 >= 33) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p7.m.o("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.", z10);
                kVar = new k(23, new y.c(d4));
            }
        }
        if (kVar == null) {
            return y.d.f14634a;
        }
        return kVar;
    }

    @Override // m0.c
    public /* bridge */ /* synthetic */ void D(Object obj) {
        switch (this.A) {
            case 11:
                Void r22 = (Void) obj;
                return;
            default:
                Void r23 = (Void) obj;
                return;
        }
    }

    @Override // vg.h
    public void E(ConsoleType consoleType) {
        consoleType.getClass();
    }

    @Override // u7.e
    public void a(u7.d dVar) {
        w7.e eVar = (w7.e) this.B;
        int length = eVar.R.length;
        for (int i2 = 1; i2 < length; i2++) {
            int i10 = eVar.R[i2];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                dVar.e(i2);
                            }
                        } else {
                            byte[] bArr = eVar.f14165b0[i2];
                            bArr.getClass();
                            dVar.j(i2, bArr);
                        }
                    } else {
                        String str = eVar.Z[i2];
                        str.getClass();
                        dVar.r(i2, str);
                    }
                } else {
                    dVar.u(eVar.Y[i2], i2);
                }
            } else {
                dVar.g(i2, eVar.X[i2]);
            }
        }
    }

    @Override // b6.q
    public boolean c(View view) {
        int width;
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.B;
        boolean z10 = false;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        if (view.getLayoutDirection() == 1) {
            z10 = true;
        }
        int i2 = swipeDismissBehavior.f2941d;
        if ((i2 == 0 && z10) || (i2 == 1 && !z10)) {
            width = -view.getWidth();
        } else {
            width = view.getWidth();
        }
        WeakHashMap weakHashMap = x0.f533a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }

    @Override // t7.b
    public t7.a d(String str) {
        str.getClass();
        u7.c cVar = (u7.c) this.B;
        String databaseName = cVar.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                a0.j.e(kc.a.g("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!databaseName.equals(str) && !vc.h.x0('/', databaseName, databaseName).equals(vc.h.x0('/', str, str))) {
            fj.j.p("This driver is configured to open a database named '", cVar.getDatabaseName(), "' but '", str, "' was requested.");
            return null;
        }
        return new w7.a(cVar.R());
    }

    @Override // ti.g
    public o e() {
        ti.t b10;
        boolean z10;
        IOException iOException = null;
        while (!((ti.q) this.B).f13258k.f13226j0) {
            try {
                b10 = ((ti.q) this.B).b();
            } catch (IOException e6) {
                if (iOException == null) {
                    iOException = e6;
                } else {
                    p7.t.a(iOException, e6);
                }
                if (!((ti.q) this.B).a(null)) {
                    throw iOException;
                }
            }
            if (!b10.d()) {
                s f8 = b10.f();
                if (f8.f13265b == null && f8.f13266c == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    f8 = b10.b();
                }
                ti.t tVar = f8.f13265b;
                Throwable th2 = f8.f13266c;
                if (th2 == null) {
                    if (tVar != null) {
                        ((ti.q) this.B).f13262p.addFirst(tVar);
                    }
                } else {
                    throw th2;
                }
            }
            return b10.c();
        }
        fj.j.h("Canceled");
        return null;
    }

    @Override // ti.g
    public ti.q g() {
        return (ti.q) this.B;
    }

    @Override // u7.e
    public String h() {
        return ((w7.e) this.B).B;
    }

    @Override // w.l1
    public float i() {
        Float f8 = (Float) ((x.j) this.B).a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f8 == null || f8.floatValue() < 1.0f) {
            return 1.0f;
        }
        return f8.floatValue();
    }

    @Override // w.l1
    public float j() {
        return 1.0f;
    }

    @Override // t7.b
    public boolean k() {
        return true;
    }

    public long l(long j2) {
        v0.h hVar = (v0.h) this.B;
        hVar.getClass();
        if (x4.q.b(j2) <= 0.0f || x4.q.c(j2) <= 0.0f) {
            x3.a.c("maximumVelocity should be a positive value. You specified=" + ((Object) x4.q.g(j2)));
        }
        return p7.a.b(((w3.d) hVar.B).b(x4.q.b(j2)), ((w3.d) hVar.L).b(x4.q.c(j2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [eg.j, android.os.Parcelable, java.lang.Object] */
    @Override // vg.h
    public void o(ze.a aVar) {
        aVar.getClass();
        int i2 = EmulatorActivity.f9503a1;
        RomDetailsActivity romDetailsActivity = (RomDetailsActivity) this.B;
        Intent intent = new Intent(romDetailsActivity, EmulatorActivity.class);
        ?? obj = new Object();
        obj.A = aVar;
        intent.putExtra("rom", (Parcelable) obj);
        romDetailsActivity.startActivity(intent);
    }

    public s2 p() {
        m6.i a10 = m6.i.a();
        if (a10.c() == 1) {
            return new t4.k(true);
        }
        f1 w10 = n2.s.w(Boolean.FALSE);
        a10.h(new t4.g(w10, this));
        return w10;
    }

    public void q() {
        LayoutEditorActivity layoutEditorActivity = (LayoutEditorActivity) this.B;
        int i2 = LayoutEditorActivity.K0;
        layoutEditorActivity.B();
        e0 A = layoutEditorActivity.A();
        ve.f fVar = (ve.f) A.f12731g.getValue();
        if (fVar != null) {
            x.v(s0.h(A), null, null, new mh.m(A, fVar, null, 9), 3);
        }
        layoutEditorActivity.finish();
    }

    public a0 r(a0 a0Var, b4.x xVar) {
        int i2;
        long C;
        long j2;
        boolean z10;
        a1.q qVar = (a1.q) this.B;
        List list = (List) a0Var.B;
        a1.q qVar2 = new a1.q(list.size());
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            v vVar = (v) list.get(i10);
            long j10 = vVar.f13708a;
            u uVar = (u) qVar.b(j10);
            if (uVar == null) {
                i2 = i10;
                j2 = vVar.f13709b;
                C = vVar.f13711d;
                z10 = false;
            } else {
                long j11 = uVar.f13705a;
                boolean z11 = uVar.f13707c;
                i2 = i10;
                C = xVar.C(uVar.f13706b);
                j2 = j11;
                z10 = z11;
            }
            long j12 = vVar.f13708a;
            List list2 = list;
            int i11 = size;
            qVar2.g(j12, new v3.t(j12, vVar.f13709b, vVar.f13711d, vVar.f13712e, vVar.f13713f, j2, C, z10, vVar.f13714g, vVar.f13716i, vVar.f13717j, vVar.f13718k));
            boolean z12 = vVar.f13712e;
            if (z12) {
                qVar.g(j10, new u(vVar.f13709b, vVar.f13710c, z12));
            } else {
                qVar.h(j10);
            }
            i10 = i2 + 1;
            list = list2;
            size = i11;
        }
        return new a0(15, qVar2, a0Var);
    }

    @Override // m0.c
    public void z(Throwable th2) {
        switch (this.A) {
            case 11:
                synchronized (((p0) this.B).f14010a) {
                    try {
                        ((p0) this.B).f14013d.p();
                        int ordinal = ((p0) this.B).f14019j.ordinal();
                        if ((ordinal == 4 || ordinal == 5 || ordinal == 6) && !(th2 instanceof CancellationException)) {
                            aj.g.z0("CaptureSession", "Opening session with fail " + ((p0) this.B).f14019j, th2);
                            ((p0) this.B).e();
                        }
                    } finally {
                    }
                }
                return;
            default:
                g1 g1Var = (g1) this.B;
                synchronized (g1Var.f13926a) {
                    try {
                        List<u0> list = g1Var.f13936k;
                        if (list != null) {
                            for (u0 u0Var : list) {
                                u0Var.b();
                            }
                            g1Var.f13936k = null;
                        }
                    } finally {
                    }
                }
                g1Var.f13945u.u();
                w.x0 x0Var = g1Var.f13927b;
                x0Var.f(g1Var);
                synchronized (x0Var.f14090c) {
                    ((LinkedHashSet) x0Var.f14093f).remove(g1Var);
                }
                return;
        }
    }

    @Override // vg.h
    public void I() {
    }

    @Override // w.l1
    public void m() {
    }

    @Override // w.l1
    public void b(TotalCaptureResult totalCaptureResult) {
    }

    @Override // w.l1
    public void f(c0.f fVar) {
    }

    public k(l0.h hVar) {
        this.A = 14;
        this.B = new AtomicInteger(0);
    }

    public k(u7.c cVar) {
        this.A = 16;
        cVar.getClass();
        this.B = cVar;
    }

    public k(mc.a aVar) {
        this.A = 26;
        this.B = (nc.l) aVar;
    }

    public k(CameraCaptureSession cameraCaptureSession, Handler handler) {
        this.A = 19;
        if (Build.VERSION.SDK_INT >= 28) {
            this.B = new a0(cameraCaptureSession, (x.h) null);
        } else {
            this.B = new a0(cameraCaptureSession, new x.h(handler));
        }
    }

    public k(int i2) {
        this.A = i2;
        switch (i2) {
            case l1.c.f8511g /* 5 */:
                this.B = new LinkedHashSet();
                return;
            case l1.c.f8508d /* 9 */:
                this.B = new a1.q((Object) null);
                return;
            case l1.c.f8510f /* 10 */:
                this.B = null;
                return;
            case l1.c.f8512h /* 15 */:
                this.B = new v0.h();
                return;
            default:
                return;
        }
    }

    public k(CameraDevice cameraDevice, Handler handler) {
        this.A = 21;
        if (Build.VERSION.SDK_INT >= 28) {
            cameraDevice.getClass();
            this.B = new a0(cameraDevice, (x.m) null);
            return;
        }
        this.B = new a0(cameraDevice, new x.m(handler));
    }

    public /* synthetic */ k(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    public k(qi.f fVar) {
        this.A = 2;
        this.B = new ThreadPoolExecutor(0, (int) Preference.DEFAULT_ORDER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), fVar);
    }
}
