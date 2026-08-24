package defpackage;

import android.graphics.Bitmap;
import me.magnum.melonds.translator.capture.ScreenCaptureService;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eq2  reason: default package */
/* loaded from: classes.dex */
public final class eq2 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ hq2 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eq2(hq2 hq2Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = hq2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((eq2) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((eq2) q(r41Var, w61Var)).s(jg7Var);
            case 2:
                return ((eq2) q(r41Var, w61Var)).s(jg7Var);
            case 3:
                return ((eq2) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((eq2) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        hq2 hq2Var = this.Z;
        switch (i) {
            case 0:
                return new eq2(hq2Var, r41Var, 0);
            case 1:
                return new eq2(hq2Var, r41Var, 1);
            case 2:
                return new eq2(hq2Var, r41Var, 2);
            case 3:
                return new eq2(hq2Var, r41Var, 3);
            default:
                return new eq2(hq2Var, r41Var, 4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d7, code lost:
        if (defpackage.xk2.N(2500, r7, r6) == r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e2, code lost:
        if (defpackage.q60.t(150, r6) == r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
        return r0;
     */
    /* JADX WARN: Type inference failed for: r2v2, types: [hw6, eo2] */
    /* JADX WARN: Type inference failed for: r2v3, types: [hw6, eo2] */
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
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj);
                            this.Z.j(false);
                            return jg7.a;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    ai0 ai0Var = new ai0(2, null, 2);
                    this.Y = 1;
                    break;
                }
                this.Y = 2;
                break;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                ci ciVar = this.Z.i;
                this.Y = 1;
                ciVar.getClass();
                boolean z = ScreenCaptureService.A;
                xe1 xe1Var = xk1.a;
                Object d0 = hv.d0(de1.L, new hw6(2, null), this);
                if (d0 == x61Var2) {
                    return x61Var2;
                }
                return d0;
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                wc0 wc0Var = this.Z.c;
                this.Y = 1;
                Object g = wc0Var.g(this);
                if (g == x61Var3) {
                    return x61Var3;
                }
                return g;
            case 3:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                ci ciVar2 = this.Z.i;
                this.Y = 1;
                ciVar2.getClass();
                boolean z2 = ScreenCaptureService.A;
                xe1 xe1Var2 = xk1.a;
                Object d02 = hv.d0(de1.L, new hw6(2, null), this);
                if (d02 == x61Var4) {
                    return x61Var4;
                }
                return d02;
            default:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    wc0 wc0Var2 = this.Z.c;
                    this.Y = 1;
                    obj = wc0Var2.g(this);
                    if (obj == x61Var5) {
                        return x61Var5;
                    }
                }
                return (Bitmap) obj;
        }
    }
}
