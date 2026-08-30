package y;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import w.g0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q implements r {

    /* renamed from: a  reason: collision with root package name */
    public final List f14651a;

    /* renamed from: b  reason: collision with root package name */
    public final g0 f14652b;

    /* renamed from: c  reason: collision with root package name */
    public final l0.h f14653c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14654d;

    /* renamed from: e  reason: collision with root package name */
    public g f14655e = null;

    public q(int i2, ArrayList arrayList, l0.h hVar, g0 g0Var) {
        this.f14654d = i2;
        this.f14651a = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f14652b = g0Var;
        this.f14653c = hVar;
    }

    @Override // y.r
    public final Object a() {
        return null;
    }

    @Override // y.r
    public final int b() {
        return this.f14654d;
    }

    @Override // y.r
    public final CameraCaptureSession.StateCallback c() {
        return this.f14652b;
    }

    @Override // y.r
    public final List d() {
        return this.f14651a;
    }

    @Override // y.r
    public final void e(g gVar) {
        if (this.f14654d != 1) {
            this.f14655e = gVar;
        } else {
            m9.o.v("Method not supported for high speed session types");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            List list = qVar.f14651a;
            if (Objects.equals(this.f14655e, qVar.f14655e) && this.f14654d == qVar.f14654d) {
                List list2 = this.f14651a;
                if (list2.size() == list.size()) {
                    for (int i2 = 0; i2 < list2.size(); i2++) {
                        if (!((h) list2.get(i2)).equals(list.get(i2))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // y.r
    public final g f() {
        return this.f14655e;
    }

    @Override // y.r
    public final Executor g() {
        return this.f14653c;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f14651a.hashCode() ^ 31;
        int i2 = (hashCode2 << 5) - hashCode2;
        g gVar = this.f14655e;
        if (gVar == null) {
            hashCode = 0;
        } else {
            hashCode = gVar.f14637a.f14636a.hashCode();
        }
        int i10 = hashCode ^ i2;
        return this.f14654d ^ ((i10 << 5) - i10);
    }

    @Override // y.r
    public final void h(CaptureRequest captureRequest) {
    }
}
