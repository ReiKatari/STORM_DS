package v8;

import android.content.Context;
import java.util.LinkedHashSet;
import me.magnum.melonds.common.camera.DSiCameraSource;
import zb.l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13762a;

    /* renamed from: b  reason: collision with root package name */
    public Object f13763b;

    /* renamed from: c  reason: collision with root package name */
    public Object f13764c;

    /* renamed from: d  reason: collision with root package name */
    public Object f13765d;

    /* renamed from: e  reason: collision with root package name */
    public Object f13766e;

    /* renamed from: f  reason: collision with root package name */
    public Object f13767f;

    public e(Context context, z8.a aVar) {
        this.f13762a = 0;
        this.f13763b = aVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.f13764c = applicationContext;
        this.f13765d = new Object();
        this.f13767f = new LinkedHashSet();
    }

    public abstract void a(b9.e eVar);

    public void b(e eVar) {
        eVar.j();
        eVar.e(this);
        e eVar2 = (e) this.f13765d;
        if (eVar2 != null) {
            eVar2.f13767f = eVar;
            eVar.f13766e = eVar2;
            this.f13765d = eVar;
            return;
        }
        this.f13764c = eVar;
        this.f13765d = eVar;
    }

    public e c() {
        return (e) this.f13763b;
    }

    public abstract Object d();

    public void e(e eVar) {
        this.f13763b = eVar;
    }

    public void f(Object obj) {
        synchronized (this.f13765d) {
            Object obj2 = this.f13766e;
            if (obj2 != null && obj2.equals(obj)) {
                return;
            }
            this.f13766e = obj;
            ((z8.a) this.f13763b).f14972d.execute(new ad.c(28, l.p0((LinkedHashSet) this.f13767f), this));
        }
    }

    public abstract void g();

    public abstract void h();

    public String i() {
        return "";
    }

    public void j() {
        e eVar = (e) this.f13766e;
        if (eVar != null) {
            eVar.f13767f = (e) this.f13767f;
        } else {
            e eVar2 = (e) this.f13763b;
            if (eVar2 != null) {
                eVar2.f13764c = (e) this.f13767f;
            }
        }
        e eVar3 = (e) this.f13767f;
        if (eVar3 != null) {
            eVar3.f13766e = eVar;
        } else {
            e eVar4 = (e) this.f13763b;
            if (eVar4 != null) {
                eVar4.f13765d = eVar;
            }
        }
        this.f13763b = null;
        this.f13767f = null;
        this.f13766e = null;
    }

    public String toString() {
        switch (this.f13762a) {
            case DSiCameraSource.FrontCamera /* 1 */:
                return getClass().getSimpleName() + "{" + i() + "}";
            default:
                return super.toString();
        }
    }

    public e() {
        this.f13762a = 1;
        this.f13763b = null;
        this.f13764c = null;
        this.f13765d = null;
        this.f13766e = null;
        this.f13767f = null;
    }
}
