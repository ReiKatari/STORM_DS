package androidx.lifecycle;

import android.os.Bundle;
import b4.v1;
import java.util.Arrays;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t0 implements q7.c {

    /* renamed from: a  reason: collision with root package name */
    public final q7.d f1486a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1487b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f1488c;

    /* renamed from: d  reason: collision with root package name */
    public final yb.n f1489d;

    public t0(q7.d dVar, e1 e1Var) {
        dVar.getClass();
        this.f1486a = dVar;
        this.f1489d = new yb.n(new a2.n(3, e1Var));
    }

    @Override // q7.c
    public final Bundle a() {
        Bundle b10 = zb.k.b((yb.j[]) Arrays.copyOf(new yb.j[0], 0));
        Bundle bundle = this.f1488c;
        if (bundle != null) {
            b10.putAll(bundle);
        }
        for (Map.Entry entry : ((u0) this.f1489d.getValue()).f1491b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a10 = ((v1) ((p0) entry.getValue()).f1480b.X).a();
            if (!a10.isEmpty()) {
                str.getClass();
                b10.putBundle(str, a10);
            }
        }
        this.f1487b = false;
        return b10;
    }

    public final void b() {
        if (!this.f1487b) {
            Bundle a10 = this.f1486a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle b10 = zb.k.b((yb.j[]) Arrays.copyOf(new yb.j[0], 0));
            Bundle bundle = this.f1488c;
            if (bundle != null) {
                b10.putAll(bundle);
            }
            if (a10 != null) {
                b10.putAll(a10);
            }
            this.f1488c = b10;
            this.f1487b = true;
            u0 u0Var = (u0) this.f1489d.getValue();
        }
    }
}
