package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zt6  reason: default package */
/* loaded from: classes.dex */
public final class zt6 implements ry3 {
    public final String A;
    public volatile ry3 B;
    public Boolean L;
    public Method R;
    public bt X;
    public final Queue Y;
    public final boolean Z;

    public zt6(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.A = str;
        this.Y = linkedBlockingQueue;
        this.Z = z;
    }

    @Override // defpackage.ry3
    public final void a(Long l, Long l2) {
        c().a(l, l2);
    }

    @Override // defpackage.ry3
    public final void b(Object obj, String str) {
        c().b(obj, str);
    }

    public final ry3 c() {
        if (this.B != null) {
            return this.B;
        }
        if (this.Z) {
            return mb4.A;
        }
        if (this.X == null) {
            Queue queue = this.Y;
            bt btVar = new bt(21, false);
            btVar.L = this;
            btVar.B = this.A;
            btVar.R = queue;
            this.X = btVar;
        }
        return this.X;
    }

    @Override // defpackage.ry3
    public final void d(Object obj, IOException iOException) {
        c().d(obj, iOException);
    }

    @Override // defpackage.ry3
    public final boolean e() {
        return c().e();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && zt6.class == obj.getClass() && this.A.equals(((zt6) obj).A)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean f() {
        Boolean bool = this.L;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.R = this.B.getClass().getMethod("log", au6.class);
            this.L = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.L = Boolean.FALSE;
        }
        return this.L.booleanValue();
    }

    @Override // defpackage.ry3
    public final String getName() {
        return this.A;
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    @Override // defpackage.ry3
    public final void i() {
        c().i();
    }

    @Override // defpackage.ry3
    public final void l(Object... objArr) {
        c().l(objArr);
    }

    @Override // defpackage.ry3
    public final void o(String str) {
        c().o(str);
    }

    @Override // defpackage.ry3
    public final void p(Exception exc) {
        c().p(exc);
    }

    @Override // defpackage.ry3
    public final void q(String str) {
        c().q(str);
    }

    @Override // defpackage.ry3
    public final void t(Object obj) {
        c().t(obj);
    }

    @Override // defpackage.ry3
    public final void u(Object obj) {
        c().u(obj);
    }

    @Override // defpackage.ry3
    public final void v(String str, Exception exc) {
        c().v(str, exc);
    }

    @Override // defpackage.ry3
    public final void x(Object... objArr) {
        c().x(objArr);
    }
}
