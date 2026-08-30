package o;

import a6.g1;
import me.magnum.melonds.common.camera.DSiCameraSource;
import q.m3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends pc.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f10485d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10486e;

    /* renamed from: f  reason: collision with root package name */
    public int f10487f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f10488g;

    public i(j jVar) {
        this.f10485d = 0;
        this.f10488g = jVar;
        this.f10486e = false;
        this.f10487f = 0;
    }

    @Override // a6.g1
    public final void a() {
        switch (this.f10485d) {
            case 0:
                int i2 = this.f10487f + 1;
                this.f10487f = i2;
                j jVar = (j) this.f10488g;
                if (i2 == jVar.f10489a.size()) {
                    g1 g1Var = jVar.f10492d;
                    if (g1Var != null) {
                        g1Var.a();
                    }
                    this.f10487f = 0;
                    this.f10486e = false;
                    jVar.f10493e = false;
                    return;
                }
                return;
            default:
                if (!this.f10486e) {
                    ((m3) this.f10488g).f11964a.setVisibility(this.f10487f);
                    return;
                }
                return;
        }
    }

    @Override // pc.a, a6.g1
    public void b() {
        switch (this.f10485d) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.f10486e = true;
                return;
            default:
                return;
        }
    }

    @Override // pc.a, a6.g1
    public final void c() {
        switch (this.f10485d) {
            case 0:
                if (!this.f10486e) {
                    this.f10486e = true;
                    g1 g1Var = ((j) this.f10488g).f10492d;
                    if (g1Var != null) {
                        g1Var.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((m3) this.f10488g).f11964a.setVisibility(0);
                return;
        }
    }

    public i(m3 m3Var, int i2) {
        this.f10485d = 1;
        this.f10488g = m3Var;
        this.f10487f = i2;
        this.f10486e = false;
    }
}
