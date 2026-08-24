package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a21  reason: default package */
/* loaded from: classes.dex */
public abstract class a21 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public a21(Context context, ow7 ow7Var) {
        this.a = 0;
        this.b = ow7Var;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.c = applicationContext;
        this.d = new Object();
        this.f = new LinkedHashSet();
    }

    public abstract void a(eb ebVar);

    public void b(a21 a21Var) {
        a21Var.j();
        a21Var.e(this);
        a21 a21Var2 = (a21) this.d;
        if (a21Var2 != null) {
            a21Var2.f = a21Var;
            a21Var.e = a21Var2;
            this.d = a21Var;
            return;
        }
        this.c = a21Var;
        this.d = a21Var;
    }

    public a21 c() {
        return (a21) this.b;
    }

    public abstract Object d();

    public void e(a21 a21Var) {
        this.b = a21Var;
    }

    public void f(Object obj) {
        synchronized (this.d) {
            Object obj2 = this.e;
            if (obj2 != null && obj2.equals(obj)) {
                return;
            }
            this.e = obj;
            ((ow7) this.b).d.execute(new mf(13, gt0.k1((LinkedHashSet) this.f), this));
        }
    }

    public abstract void g();

    public abstract void h();

    public String i() {
        return "";
    }

    public void j() {
        a21 a21Var = (a21) this.e;
        if (a21Var != null) {
            a21Var.f = (a21) this.f;
        } else {
            a21 a21Var2 = (a21) this.b;
            if (a21Var2 != null) {
                a21Var2.c = (a21) this.f;
            }
        }
        a21 a21Var3 = (a21) this.f;
        if (a21Var3 != null) {
            a21Var3.e = a21Var;
        } else {
            a21 a21Var4 = (a21) this.b;
            if (a21Var4 != null) {
                a21Var4.d = a21Var;
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

    public a21() {
        this.a = 1;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
