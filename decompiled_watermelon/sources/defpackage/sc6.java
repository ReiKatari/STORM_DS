package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sc6  reason: default package */
/* loaded from: classes.dex */
public final class sc6 implements y72 {
    public final float a;
    public final float b;
    public final Object c;

    public sc6(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    @Override // defpackage.ho
    public final j77 a(bz6 bz6Var) {
        oo ooVar;
        Object obj = this.c;
        if (obj == null) {
            ooVar = null;
        } else {
            ooVar = (oo) bz6Var.a.n(obj);
        }
        return new u57(this.a, this.b, ooVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sc6) {
            sc6 sc6Var = (sc6) obj;
            if (sc6Var.a == this.a && sc6Var.b == this.b && b53.x(sc6Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Object obj = this.c;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return Float.hashCode(this.b) + ej6.a(this.a, i * 31, 31);
    }

    public /* synthetic */ sc6(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
