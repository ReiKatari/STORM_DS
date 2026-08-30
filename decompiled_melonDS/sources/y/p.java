package y;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import w.g0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p implements r {

    /* renamed from: a  reason: collision with root package name */
    public final SessionConfiguration f14649a;

    /* renamed from: b  reason: collision with root package name */
    public final List f14650b;

    public p(int i2, ArrayList arrayList, l0.h hVar, g0 g0Var) {
        j jVar;
        h hVar2;
        SessionConfiguration sessionConfiguration = new SessionConfiguration(i2, s.a(arrayList), hVar, g0Var);
        this.f14649a = sessionConfiguration;
        List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
        ArrayList arrayList2 = new ArrayList(outputConfigurations.size());
        for (OutputConfiguration outputConfiguration : outputConfigurations) {
            if (outputConfiguration == null) {
                hVar2 = null;
            } else {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 33) {
                    jVar = new j(outputConfiguration);
                } else if (i10 >= 28) {
                    jVar = new j(new m(outputConfiguration));
                } else if (i10 >= 26) {
                    jVar = new j(new k(outputConfiguration));
                } else {
                    jVar = new j(new i(outputConfiguration));
                }
                hVar2 = new h(jVar);
            }
            arrayList2.add(hVar2);
        }
        this.f14650b = Collections.unmodifiableList(arrayList2);
    }

    @Override // y.r
    public final Object a() {
        return this.f14649a;
    }

    @Override // y.r
    public final int b() {
        return this.f14649a.getSessionType();
    }

    @Override // y.r
    public final CameraCaptureSession.StateCallback c() {
        return this.f14649a.getStateCallback();
    }

    @Override // y.r
    public final List d() {
        return this.f14650b;
    }

    @Override // y.r
    public final void e(g gVar) {
        this.f14649a.setInputConfiguration(gVar.f14637a.f14636a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        return Objects.equals(this.f14649a, ((p) obj).f14649a);
    }

    @Override // y.r
    public final g f() {
        return g.a(this.f14649a.getInputConfiguration());
    }

    @Override // y.r
    public final Executor g() {
        return this.f14649a.getExecutor();
    }

    @Override // y.r
    public final void h(CaptureRequest captureRequest) {
        this.f14649a.setSessionParameters(captureRequest);
    }

    public final int hashCode() {
        return this.f14649a.hashCode();
    }
}
