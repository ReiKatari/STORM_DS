package defpackage;

import android.hardware.camera2.params.MeteringRectangle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yc  reason: default package */
/* loaded from: classes.dex */
public final class yc extends hw6 implements qn2 {
    public final /* synthetic */ int X;
    public int Y;
    public Object Z;
    public final /* synthetic */ Object d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(ri7 ri7Var, r41 r41Var) {
        super(1, r41Var);
        this.X = 8;
        this.d0 = ri7Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        Object obj2 = this.d0;
        r41 r41Var = (r41) obj;
        switch (i) {
            case 0:
                return new yc((dd) this.Z, (fo2) obj2, r41Var, 0).s(jg7Var);
            case 1:
                return new yc((hm) this.Z, (m07) obj2, r41Var, 1).s(jg7Var);
            case 2:
                return new yc((h30) this.Z, (g30) obj2, r41Var, 2).s(jg7Var);
            case 3:
                return new yc((m16) this.Z, (qn2) obj2, r41Var, 3).s(jg7Var);
            case 4:
                return new yc((eo2) this.Z, (pq5) obj2, r41Var, 4).s(jg7Var);
            case 5:
                return new yc((sz1) this.Z, (zg5) obj2, r41Var, 5).s(jg7Var);
            case 6:
                return new yc((ne2) this.Z, (dh5) obj2, r41Var, 6).s(jg7Var);
            case 7:
                return new yc((bn5) this.Z, (ArrayList) obj2, r41Var, 7).s(jg7Var);
            default:
                return new yc((ri7) obj2, r41Var).s(jg7Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
        if (r0.X(r20) != r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b0, code lost:
        if (r0 == r5) goto L24;
     */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        Looper myLooper;
        Handler handler;
        Looper looper;
        Looper looper2;
        fm fmVar;
        Looper looper3;
        jg1 jg1Var;
        Object obj2;
        Object h;
        Object h2;
        AutoCloseable autoCloseable;
        jg1 k;
        int i = this.X;
        jg7 jg7Var = jg7.a;
        Object obj3 = this.d0;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                dd ddVar = (dd) this.Z;
                wc wcVar = new wc(ddVar, 3);
                b0 b0Var = new b0((fo2) obj3, ddVar, null, 4);
                this.Y = 1;
                if (mb3.p(wcVar, b0Var, this) == x61Var) {
                    return x61Var;
                }
                return jg7Var;
            case 1:
                hm hmVar = (hm) this.Z;
                qm6 qm6Var = hmVar.e;
                View view = hmVar.a;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        gm gmVar = new gm();
                        m07 m07Var = (m07) obj3;
                        fm fmVar2 = new fm(gmVar, new dm(hmVar, m07Var, 0), new dm(hmVar, m07Var, 1), view);
                        qn2 qn2Var = hmVar.b;
                        if (qn2Var != null && (fmVar = (fm) qn2Var.g(fmVar2)) != null) {
                            fmVar2 = fmVar;
                        }
                        Looper myLooper2 = Looper.myLooper();
                        Handler handler2 = view.getHandler();
                        if (handler2 != null) {
                            looper2 = handler2.getLooper();
                        } else {
                            looper2 = null;
                        }
                        if (myLooper2 != looper2) {
                            v vVar = hmVar.i;
                            if (vVar == null) {
                                vVar = new v(hmVar, fmVar2, gmVar, 1);
                                hmVar.i = vVar;
                            }
                            view.post(vVar);
                        } else {
                            ActionMode startActionMode = view.startActionMode(new je2(fmVar2), 1);
                            if (startActionMode != null) {
                                hmVar.h = startActionMode;
                            } else {
                                return jg7Var;
                            }
                        }
                        this.Y = 1;
                        v80 v80Var = gmVar.a;
                        v80Var.getClass();
                        Object L = v80.L(v80Var, this);
                        if (L != x61Var2) {
                            L = jg7Var;
                        }
                        if (L == x61Var2) {
                            return x61Var2;
                        }
                    }
                    if (handler != null) {
                        looper3 = handler.getLooper();
                    } else {
                        looper3 = null;
                    }
                    if (myLooper != looper3) {
                        Runnable runnable = hmVar.j;
                        if (runnable == null) {
                            runnable = new n0(hmVar, 4);
                            hmVar.j = runnable;
                        }
                        view.post(runnable);
                    } else {
                        ActionMode actionMode = hmVar.h;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    v vVar2 = hmVar.i;
                    if (vVar2 != null) {
                        view.removeCallbacks(vVar2);
                    }
                    hmVar.h = null;
                    return jg7Var;
                } finally {
                    qm6Var.a();
                    myLooper = Looper.myLooper();
                    handler = view.getHandler();
                    if (handler != null) {
                        looper = handler.getLooper();
                    } else {
                        looper = null;
                    }
                    if (myLooper != looper) {
                        Runnable runnable2 = hmVar.j;
                        if (runnable2 == null) {
                            runnable2 = new n0(hmVar, 4);
                            hmVar.j = runnable2;
                        }
                        view.post(runnable2);
                    } else {
                        ActionMode actionMode2 = hmVar.h;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    v vVar3 = hmVar.i;
                    if (vVar3 != null) {
                        view.removeCallbacks(vVar3);
                    }
                    hmVar.h = null;
                }
            case 2:
                g30 g30Var = (g30) obj3;
                vs4 vs4Var = ((h30) this.Z).c;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                try {
                    if (i4 != 0) {
                        if (i4 == 1) {
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        vs4Var.setValue(g30Var);
                        this.Y = 1;
                        v80 v80Var2 = g30Var.b;
                        v80Var2.getClass();
                        Object L2 = v80.L(v80Var2, this);
                        if (L2 != x61Var3) {
                            L2 = jg7Var;
                        }
                        if (L2 == x61Var3) {
                            return x61Var3;
                        }
                    }
                    return jg7Var;
                } finally {
                    vs4Var.setValue(null);
                }
            case 3:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                m16 m16Var = (m16) this.Z;
                x81 x81Var = new x81(m16Var, null, (qn2) obj3, 0);
                this.Y = 1;
                Object q = m16Var.q(false, x81Var, this);
                if (q != x61Var4) {
                    return q;
                }
                return x61Var4;
            case 4:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                int i6 = this.Y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                this.Y = 1;
                Object o = ((eo2) this.Z).o((pq5) obj3, this);
                if (o != x61Var5) {
                    return o;
                }
                return x61Var5;
            case 5:
                x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                int i7 = this.Y;
                if (i7 != 0) {
                    if (i7 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    jh jhVar = ((sz1) this.Z).v;
                    this.Y = 1;
                    jhVar.getClass();
                    if (jh.j(true, this) == x61Var6) {
                        return x61Var6;
                    }
                }
                ((zg5) obj3).A = true;
                return jg7Var;
            case 6:
                dh5 dh5Var = (dh5) obj3;
                x61 x61Var7 = x61.COROUTINE_SUSPENDED;
                int i8 = this.Y;
                if (i8 != 0) {
                    if (i8 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ne2 ne2Var = (ne2) this.Z;
                    Object obj4 = dh5Var.A;
                    if (obj4 == fh4.a) {
                        obj4 = null;
                    }
                    this.Y = 1;
                    if (ne2Var.a(obj4, this) == x61Var7) {
                        return x61Var7;
                    }
                }
                dh5Var.A = null;
                return jg7Var;
            case 7:
                x61 x61Var8 = x61.COROUTINE_SUSPENDED;
                int i9 = this.Y;
                if (i9 != 0) {
                    if (i9 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                this.Y = 1;
                if (vm5.H((bn5) this.Z, (ArrayList) obj3, this) == x61Var8) {
                    return x61Var8;
                }
                return jg7Var;
            default:
                ej7 ej7Var = ((ri7) obj3).c;
                x61 x61Var9 = x61.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                try {
                    try {
                    } catch (CancellationException e) {
                        if (kj2.F("CXCP")) {
                            Log.d("CXCP", "Cannot acquire the CameraGraph.Session", e);
                        }
                        obj2 = ri7.l;
                    }
                } catch (CancellationException e2) {
                    if (kj2.F("CXCP")) {
                        Log.d("CXCP", "Cannot acquire the CameraGraph.Session", e2);
                    }
                    jg1Var = ri7.l;
                }
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4) {
                                    oi2.Y(obj);
                                    h = obj;
                                    AutoCloseable autoCloseable2 = (AutoCloseable) h;
                                    MeteringRectangle[] meteringRectangleArr = lf0.a;
                                    List l0 = fv.l0(meteringRectangleArr);
                                    List asList = Arrays.asList(meteringRectangleArr);
                                    asList.getClass();
                                    List asList2 = Arrays.asList(meteringRectangleArr);
                                    asList2.getClass();
                                    obj2 = ye0.e((vf0) autoCloseable2, null, null, null, l0, asList, asList2, 7);
                                    lb4.p(autoCloseable2, null);
                                    return obj2;
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oi2.Y(obj);
                            sf0 a = ej7Var.a();
                            this.Y = 4;
                            h = a.h(this);
                            break;
                        } else {
                            autoCloseable = (AutoCloseable) this.Z;
                            oi2.Y(obj);
                            k = obj;
                            jg1Var = k;
                            lb4.p(autoCloseable, null);
                            this.Z = null;
                            this.Y = 3;
                            break;
                        }
                    } else {
                        oi2.Y(obj);
                        h2 = obj;
                    }
                } else {
                    oi2.Y(obj);
                    if (kj2.F("CXCP")) {
                        Log.d("CXCP", "UseCaseCameraRequestControlImpl#cancelFocusAndMeteringAsync");
                    }
                    sf0 a2 = ej7Var.a();
                    this.Y = 1;
                    h2 = a2.h(this);
                    if (h2 == x61Var9) {
                        return x61Var9;
                    }
                }
                autoCloseable = (AutoCloseable) h2;
                this.Z = autoCloseable;
                this.Y = 2;
                k = vf0.k((vf0) autoCloseable, 0L, 56);
                if (k == x61Var9) {
                    return x61Var9;
                }
                jg1Var = k;
                lb4.p(autoCloseable, null);
                this.Z = null;
                this.Y = 3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yc(Object obj, Object obj2, r41 r41Var, int i) {
        super(1, r41Var);
        this.X = i;
        this.Z = obj;
        this.d0 = obj2;
    }
}
