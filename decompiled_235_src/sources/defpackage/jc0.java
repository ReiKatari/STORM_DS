package defpackage;

import android.util.Log;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jc0  reason: default package */
/* loaded from: classes.dex */
public final class jc0 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ Object d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc0(gn gnVar, long j, r41 r41Var) {
        super(2, r41Var);
        this.X = 1;
        this.d0 = gnVar;
        this.Z = j;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((jc0) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((jc0) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((jc0) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.d0;
        switch (i) {
            case 0:
                return new jc0(this.Z, (kc0) obj2, r41Var, 0);
            case 1:
                return new jc0((gn) obj2, this.Z, r41Var);
            default:
                return new jc0(this.Z, (mw6) obj2, r41Var, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (defpackage.q60.t(r3 - 8, r11) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (defpackage.q60.t(8, r11) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
        return r0;
     */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        switch (this.X) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i = this.Y;
                if (i != 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    long j = this.Z;
                    this.Y = 1;
                    if (q60.t(j, this) == x61Var) {
                        return x61Var;
                    }
                }
                kc0 kc0Var = (kc0) this.d0;
                synchronized (kc0Var.q) {
                    if (!kc0Var.e() && !kc0Var.s.equals(xe0.A) && !kc0Var.s.equals(xe0.z)) {
                        Log.d("CXCP", "Restarting " + kc0Var + "...");
                        kc0Var.f.h();
                        kc0.b(kc0Var);
                        kc0Var.f();
                    }
                }
                return jg7.a;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    jk4 jk4Var = new jk4(this.Z);
                    io6 io6Var = qa6.d;
                    this.Y = 1;
                    if (gn.c((gn) this.d0, jk4Var, io6Var, null, this, 12) == x61Var2) {
                        return x61Var2;
                    }
                }
                return jg7.a;
            default:
                long j2 = this.Z;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            oi2.Y(obj);
                            rj0 rj0Var = ((mw6) this.d0).L;
                            if (rj0Var != null) {
                                rj0Var.i(new em5(new qy4(j2)));
                            }
                            return jg7.a;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    break;
                }
                this.Y = 2;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jc0(long j, Object obj, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = j;
        this.d0 = obj;
    }
}
