package w;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import d0.p1;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a  reason: collision with root package name */
    public final x.j f13996a;

    /* renamed from: b  reason: collision with root package name */
    public final l0.h f13997b;

    /* renamed from: c  reason: collision with root package name */
    public final p1.c1 f13998c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f13999d = false;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f14000e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f14001f;

    /* renamed from: g  reason: collision with root package name */
    public d0.i1 f14002g;

    /* renamed from: h  reason: collision with root package name */
    public p1 f14003h;

    /* renamed from: i  reason: collision with root package name */
    public p1.a0 f14004i;

    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, p1.c1] */
    public m1(x.j jVar, l0.h hVar) {
        boolean z10;
        this.f14000e = false;
        this.f14001f = false;
        this.f13996a = jVar;
        this.f13997b = hVar;
        int[] iArr = (int[]) jVar.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 == 4) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        this.f14000e = z10;
        this.f14001f = z.a.f14847a.j(ZslDisablerQuirk.class) != null;
        Object obj = new Object();
        ?? obj2 = new Object();
        obj2.B = new Object();
        obj2.A = new ArrayDeque(3);
        obj2.L = obj;
        this.f13998c = obj2;
    }

    public final void a() {
        d0.i1 i1Var = this.f14002g;
        if (i1Var != null) {
            i1Var.h();
            this.f14002g = null;
        }
        p1.a0 a0Var = this.f14004i;
        if (a0Var != null) {
            ((AtomicBoolean) a0Var.L).set(false);
            this.f14004i = null;
        }
        b();
        p1 p1Var = this.f14003h;
        if (p1Var != null) {
            p1Var.a();
            this.f14003h = null;
        }
    }

    public final void b() {
        boolean isEmpty;
        p1.c1 c1Var = this.f13998c;
        while (true) {
            synchronized (c1Var.B) {
                isEmpty = ((ArrayDeque) c1Var.A).isEmpty();
            }
            if (!isEmpty) {
                ((d0.y0) c1Var.b()).close();
            } else {
                return;
            }
        }
    }
}
