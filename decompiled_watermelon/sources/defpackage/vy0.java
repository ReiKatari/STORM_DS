package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vy0  reason: default package */
/* loaded from: classes.dex */
public abstract class vy0 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public vy0(Context context, nh7 nh7Var) {
        this.a = 0;
        this.b = nh7Var;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.c = applicationContext;
        this.d = new Object();
        this.f = new LinkedHashSet();
    }

    public abstract void a(q9 q9Var);

    public void b(vy0 vy0Var) {
        vy0Var.j();
        vy0Var.e(this);
        vy0 vy0Var2 = (vy0) this.d;
        if (vy0Var2 != null) {
            vy0Var2.f = vy0Var;
            vy0Var.e = vy0Var2;
            this.d = vy0Var;
            return;
        }
        this.c = vy0Var;
        this.d = vy0Var;
    }

    public vy0 c() {
        return (vy0) this.b;
    }

    public abstract Object d();

    public void e(vy0 vy0Var) {
        this.b = vy0Var;
    }

    public void f(Object obj) {
        synchronized (this.d) {
            Object obj2 = this.e;
            if (obj2 != null && obj2.equals(obj)) {
                return;
            }
            this.e = obj;
            ((nh7) this.b).d.execute(new we(13, tq0.n1((LinkedHashSet) this.f), this));
        }
    }

    public abstract void g();

    public abstract void h();

    public String i() {
        return "";
    }

    public void j() {
        vy0 vy0Var = (vy0) this.e;
        if (vy0Var != null) {
            vy0Var.f = (vy0) this.f;
        } else {
            vy0 vy0Var2 = (vy0) this.b;
            if (vy0Var2 != null) {
                vy0Var2.c = (vy0) this.f;
            }
        }
        vy0 vy0Var3 = (vy0) this.f;
        if (vy0Var3 != null) {
            vy0Var3.e = vy0Var;
        } else {
            vy0 vy0Var4 = (vy0) this.b;
            if (vy0Var4 != null) {
                vy0Var4.d = vy0Var;
            }
        }
        this.b = null;
        this.f = null;
        this.e = null;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return getClass().getSimpleName() + "{" + i() + "}";
            default:
                return super.toString();
        }
    }

    public vy0() {
        this.a = 1;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
