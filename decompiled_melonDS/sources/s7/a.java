package s7;

import a0.j;
import android.os.Bundle;
import androidx.lifecycle.q;
import b4.y2;
import java.util.LinkedHashMap;
import k0.g;
import kf.s0;
import q7.f;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final f f12835a;

    /* renamed from: b  reason: collision with root package name */
    public final s0 f12836b;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12839e;

    /* renamed from: f  reason: collision with root package name */
    public Bundle f12840f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12841g;

    /* renamed from: c  reason: collision with root package name */
    public final g f12837c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f12838d = new LinkedHashMap();

    /* renamed from: h  reason: collision with root package name */
    public boolean f12842h = true;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k0.g] */
    public a(f fVar, s0 s0Var) {
        this.f12835a = fVar;
        this.f12836b = s0Var;
    }

    public final void a() {
        f fVar = this.f12835a;
        if (fVar.getLifecycle().b() == q.INITIALIZED) {
            if (!this.f12839e) {
                this.f12836b.b();
                fVar.getLifecycle().a(new y2(2, this));
                this.f12839e = true;
                return;
            }
            j.p("SavedStateRegistry was already attached.");
            return;
        }
        j.p("Restarter must be created only during owner's initialization stage");
    }
}
