package q1;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Range;
import n2.b1;
import n2.c1;
import p1.i0;
import w.k1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public boolean f12194a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f12195b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f12196c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f12197d;

    /* renamed from: e  reason: collision with root package name */
    public Object f12198e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f12199f;

    /* JADX WARN: Type inference failed for: r8v7, types: [a0.l, java.lang.Object] */
    public u(w.i iVar, x.j jVar, l0.h hVar) {
        Range range;
        CameraCharacteristics.Key key;
        CameraCharacteristics.Key key2;
        CameraCharacteristics.Key key3;
        rd.k kVar;
        this.f12194a = false;
        this.f12199f = new k1(this);
        this.f12195b = iVar;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                key3 = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
                range = (Range) jVar.a(key3);
            } catch (AssertionError e6) {
                aj.g.z0("ZoomControl", "AssertionError, fail to get camera characteristic.", e6);
                range = null;
            }
            if (range != null) {
                ?? obj = new Object();
                boolean z10 = false;
                obj.A = false;
                key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
                obj.B = (Range) jVar.a(key);
                if (Build.VERSION.SDK_INT >= 34) {
                    rd.k kVar2 = jVar.f14298b;
                    key2 = CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES;
                    int[] iArr = (int[]) ((CameraCharacteristics) kVar2.B).get(key2);
                    if (iArr != null) {
                        int length = iArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            } else if (iArr[i2] == 1) {
                                z10 = true;
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                obj.A = z10;
                kVar = obj;
                this.f12198e = kVar;
                h3.a aVar = new h3.a(kVar.i(), kVar.j());
                this.f12196c = aVar;
                aVar.g();
                this.f12197d = new androidx.lifecycle.d0(new n0.a(aVar.d(), aVar.b(), aVar.c(), aVar.a()));
                iVar.h((k1) this.f12199f);
            }
        }
        kVar = new rd.k(12, jVar);
        this.f12198e = kVar;
        h3.a aVar2 = new h3.a(kVar.i(), kVar.j());
        this.f12196c = aVar2;
        aVar2.g();
        this.f12197d = new androidx.lifecycle.d0(new n0.a(aVar2.d(), aVar2.b(), aVar2.c(), aVar2.a()));
        iVar.h((k1) this.f12199f);
    }

    public u(int i2, float f8, a0 a0Var) {
        this.f12195b = a0Var;
        this.f12196c = new c1(i2);
        this.f12197d = new b1(f8);
        this.f12199f = new i0(i2, 30, 100);
    }
}
