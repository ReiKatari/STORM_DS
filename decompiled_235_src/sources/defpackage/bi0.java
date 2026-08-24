package defpackage;

import android.util.Log;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bi0  reason: default package */
/* loaded from: classes.dex */
public final class bi0 extends hw6 implements eo2 {
    public dh5 X;
    public dh5 Y;
    public dh5 Z;
    public dh5 d0;
    public int e0;
    public /* synthetic */ Object f0;
    public final /* synthetic */ ci0 g0;
    public final /* synthetic */ String h0;
    public final /* synthetic */ vd i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi0(ci0 ci0Var, String str, vd vdVar, r41 r41Var) {
        super(2, r41Var);
        this.g0 = ci0Var;
        this.h0 = str;
        this.i0 = vdVar;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((bi0) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        bi0 bi0Var = new bi0(this.g0, this.h0, this.i0, r41Var);
        bi0Var.f0 = obj;
        return bi0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d A[Catch: all -> 0x0029, TRY_ENTER, TryCatch #0 {all -> 0x0029, blocks: (B:6:0x001f, B:32:0x0141, B:34:0x0145, B:36:0x015f, B:37:0x0164, B:39:0x016a, B:40:0x016f, B:42:0x0175, B:43:0x0178, B:45:0x017e, B:15:0x008d, B:17:0x009d, B:18:0x00a9, B:20:0x00af, B:21:0x00bc, B:24:0x00c4, B:26:0x00fc, B:28:0x0102, B:29:0x012d), top: B:52:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0145 A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:6:0x001f, B:32:0x0141, B:34:0x0145, B:36:0x015f, B:37:0x0164, B:39:0x016a, B:40:0x016f, B:42:0x0175, B:43:0x0178, B:45:0x017e, B:15:0x008d, B:17:0x009d, B:18:0x00a9, B:20:0x00af, B:21:0x00bc, B:24:0x00c4, B:26:0x00fc, B:28:0x0102, B:29:0x012d), top: B:52:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018f  */
    /* JADX WARN: Type inference failed for: r0v10, types: [rc3] */
    /* JADX WARN: Type inference failed for: r0v12, types: [rc3] */
    /* JADX WARN: Type inference failed for: r0v13, types: [ed3] */
    /* JADX WARN: Type inference failed for: r0v14, types: [ed3] */
    /* JADX WARN: Type inference failed for: r11v0, types: [dh5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [dh5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4, types: [vd] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r13v3, types: [dh5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [dh5, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x013e -> B:32:0x0141). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        dh5 dh5Var;
        dh5 dh5Var2;
        w61 w61Var;
        dh5 dh5Var3;
        dh5 dh5Var4;
        r41 r41Var;
        v96 v96Var;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.e0;
        String str = this.h0;
        vd vdVar = this.i0;
        r41 r41Var2 = null;
        if (i != 0) {
            if (i == 1) {
                dh5Var3 = this.d0;
                dh5 dh5Var5 = this.Z;
                dh5Var = this.Y;
                dh5Var2 = this.X;
                w61 w61Var2 = (w61) this.f0;
                try {
                    oi2.Y(obj);
                    ?? r12 = 0;
                    dh5 dh5Var6 = dh5Var5;
                    w61Var = w61Var2;
                    Object e = obj;
                    lm4 lm4Var = (lm4) e;
                    if (lm4Var == null) {
                        Log.i("CXCP", "Camera open completed: " + lm4Var);
                        jg1 jg1Var = (jg1) dh5Var2.A;
                        if (jg1Var != null) {
                            ((ed3) jg1Var).h(r12);
                        }
                        jg1 jg1Var2 = (jg1) dh5Var.A;
                        if (jg1Var2 != null) {
                            ((ed3) jg1Var2).h(r12);
                        }
                        ?? r0 = (rc3) dh5Var6.A;
                        if (r0 != 0) {
                            r0.h(r12);
                        }
                        ?? r02 = (rc3) dh5Var3.A;
                        if (r02 != 0) {
                            r02.h(r12);
                        }
                        return lm4Var;
                    }
                    r41 r41Var3 = r12;
                    dh5Var4 = dh5Var6;
                    r41Var2 = r41Var3;
                    if (!g04.H(w61Var)) {
                        l61 l61Var = this.B;
                        l61Var.getClass();
                        v96 v96Var2 = new v96(l61Var);
                        jg1 jg1Var3 = (jg1) dh5Var2.A;
                        if (jg1Var3 != null) {
                            v96Var2.h(jg1Var3.n(), new xh0(dh5Var2, str, r41Var2, 0));
                        }
                        jg1 jg1Var4 = (jg1) dh5Var.A;
                        if (jg1Var4 != null) {
                            v96Var2.h(jg1Var4.n(), new xh0(dh5Var, str, r41Var2, 1));
                        }
                        rc3 rc3Var = (rc3) dh5Var4.A;
                        gr1 gr1Var = w96.e;
                        if (rc3Var != null) {
                            m44 U = rc3Var.U();
                            dh5 dh5Var7 = dh5Var4;
                            r41 r41Var4 = r41Var2;
                            dh5Var6 = dh5Var7;
                            vd vdVar2 = vdVar;
                            yh0 yh0Var = new yh0(dh5Var6, dh5Var2, vdVar2, r41Var4, 0);
                            vdVar = vdVar2;
                            v96Var = v96Var2;
                            v96Var.j(new t96(v96Var2, (ed3) U.B, (fo2) U.L, (gw0) U.R, gr1Var, yh0Var, null), false);
                            r41Var = r41Var4;
                        } else {
                            dh5 dh5Var8 = dh5Var4;
                            r41Var = r41Var2;
                            dh5Var6 = dh5Var8;
                            v96Var = v96Var2;
                        }
                        rc3 rc3Var2 = (rc3) dh5Var3.A;
                        if (rc3Var2 != null) {
                            m44 U2 = rc3Var2.U();
                            v96Var.j(new t96(v96Var, (ed3) U2.B, (fo2) U2.L, (gw0) U2.R, gr1Var, new zh0(dh5Var3, r41Var, 0), null), false);
                        }
                        this.f0 = w61Var;
                        this.X = dh5Var2;
                        this.Y = dh5Var;
                        this.Z = dh5Var6;
                        this.d0 = dh5Var3;
                        this.e0 = 1;
                        e = v96Var.e(this);
                        r12 = r41Var;
                        if (e == x61Var) {
                            return x61Var;
                        }
                        lm4 lm4Var2 = (lm4) e;
                        if (lm4Var2 == null) {
                        }
                    } else {
                        return new lm4(r41Var2, new df0(12), 1);
                    }
                } catch (Throwable th) {
                    Log.e("CXCP", "Unexpected throwable during camera opening!", th);
                    throw th;
                }
            } else {
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            w61 w61Var3 = (w61) this.f0;
            ?? obj2 = new Object();
            ci0 ci0Var = this.g0;
            obj2.A = hv.i(w61Var3, null, null, new b0(ci0Var, str, vdVar, (r41) null, 11), 3);
            ?? obj3 = new Object();
            obj3.A = hv.i(w61Var3, null, null, new a6(vdVar, null, 8), 3);
            ?? obj4 = new Object();
            obj4.A = hv.L(w61Var3, null, null, new ai0(2, null, 0), 3);
            ?? obj5 = new Object();
            obj5.A = hv.L(w61Var3, null, null, new a6(ci0Var, null, 7), 3);
            dh5Var = obj3;
            dh5Var2 = obj2;
            w61Var = w61Var3;
            dh5Var3 = obj5;
            dh5Var4 = obj4;
            if (!g04.H(w61Var)) {
            }
        }
    }
}
